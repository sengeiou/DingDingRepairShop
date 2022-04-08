package com.android.ctgapp.entity.mine
//储值卡实体类
data class StoredCardEntity(
    val `data`: Data,
    val msg: Any,
    val status: Int,
    val success: Boolean
) {
    data class Data(
        val amount: Double,
        val createTime: String,
        val erpClientId: Int,
        val erpClientNo: Any,
        val fromCompanyId: Int,
        val id: String?=null,
        val latestGrantTime: String,
        val latestGrantUserId: Int,
        val platformClientId: Int,
        val rechargeAmount: Double,
        val remark: Any,
        val totalAmount: Double,
        val updateTime: String,
        val validEndDate: Any
    )
}