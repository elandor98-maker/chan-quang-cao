package com.celzero.bravedns.util

import com.celzero.bravedns.service.PersistentState
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * Fork "Chan Quang Cao": a feather-weight daily counter of blocked DNS answers,
 * shown on the home hero ("Hôm nay đã chặn: N").
 *
 * The regular dns / connection logs stay OFF by default in this fork (they are
 * the single biggest background battery cost), so the count cannot come from
 * the log databases. Instead, the dns summary path bumps this counter — two
 * SharedPreferences writes per blocked answer, nothing else. Every entry point
 * is wrapped so a failure here can never break dns handling.
 */
object ForkBlockedCounter {

    private fun today(): String {
        return SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Date())
    }

    fun recordBlocked(persistentState: PersistentState) {
        try {
            val today = today()
            if (persistentState.forkBlockedDay != today) {
                persistentState.forkBlockedDay = today
                persistentState.forkBlockedCount = 1
            } else {
                persistentState.forkBlockedCount = persistentState.forkBlockedCount + 1
            }
        } catch (e: Exception) {
            // counter is cosmetic; never propagate
        }
    }

    fun todayCount(persistentState: PersistentState): Int {
        return try {
            if (persistentState.forkBlockedDay == today()) persistentState.forkBlockedCount else 0
        } catch (e: Exception) {
            0
        }
    }
}
