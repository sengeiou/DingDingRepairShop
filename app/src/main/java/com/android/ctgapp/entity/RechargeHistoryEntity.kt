package com.android.ctgapp.entity

data class RechargeHistoryEntity(
    val `data`: Data,
    val msg: String,
    val status: Int,
    val success: Boolean
) {
    data class Data(
        val endRow: Int,
        val hasNextPage: Boolean,
        val hasPreviousPage: Boolean,
        val isFirstPage: Boolean,
        val isLastPage: Boolean,
        val list: List<Detail>,
        val navigateFirstPage: Int,
        val navigateLastPage: Int,
        val navigatePages: Int,
        val navigatepageNums: List<Int>,
        val nextPage: Int,
        val pageNum: Int,
        val pageSize: Int,
        val pages: Int,
        val prePage: Int,
        val size: Int,
        val startRow: Int,
        val total: Int
    ) {
        data class Detail(
            val beforeAmount: Double,
            val billNo: String,
            val changeType: Int,
            val createTime: String,
            val erpBillNo: String,
            val id: Any,
            val imageUrl: String,
            val isDeleted: Int,
            val leftAmount: Double,
            val payWay: Int,
            val platformClientId: Any,
            val remark: String,
            val serialNum: Any,
            val supplyCompanyId: Int,
            val updateTime: Any,
            val useAmount: Double,
            val userId: Int,
            val userName: String
        )
    }
}
