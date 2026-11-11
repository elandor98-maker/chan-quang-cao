/*
 * Fork "Chan Quang Cao": preset list of Vietnamese banking / wallet apps whose
 * traffic must bypass the VPN tunnel entirely (FirewallStatus.EXCLUDE), because
 * those apps refuse to work over a VPN. Package names verified against their
 * Google Play listings on 2026-11-11. The seed only applies to packages that
 * are actually installed; unknown packages are skipped silently.
 */
package com.celzero.bravedns.util

object BankBypassPreset {
    val PACKAGES: List<String> =
        listOf(
            // banks
            "com.VCB", // Vietcombank
            "com.mbmobile", // MB Bank
            "vn.com.techcombank.bb.app", // Techcombank
            "com.vnpay.bidv", // BIDV SmartBanking
            "com.vietinbank.ipay", // VietinBank iPay
            "com.vnpay.Agribank3g", // Agribank
            "mobile.acb.com.vn", // ACB ONE
            "com.tpb.mb.gprsandroid", // TPBank Mobile
            "com.vnpay.vpbankonline", // VPBank NEO
            "com.vib.myvib2", // VIB
            "com.vnpay.hdbank", // HDBank
            "com.hdbank.dihdbank", // Di HDBank
            "com.sacombank.ewallet", // Sacombank Pay
            "src.com.sacombank", // Sacombank mBanking
            "vn.shb.saha.mbanking", // SHB SAHA
            "vn.com.msb.smartBanking", // MSB
            "vn.com.ocb.awe", // OCB OMNI
            "com.vnpay.EximBankOmni", // Eximbank
            "ops.namabank.com.vn", // Nam A Bank
            "com.vnpay.bvbank", // BaoViet Bank
            // wallets / payments
            "com.mservice.momotransfer", // MoMo
            "vn.com.vng.zalopay", // ZaloPay
            "com.beeasy.toppay", // ShopeePay (TopPay)
            "vnpay.smartacccount", // VNPay (spelling as listed on Play)
            "com.bplus.vtpay", // Viettel Money
            "com.mobifone.mmdt", // MobiFone Money
        )
}
