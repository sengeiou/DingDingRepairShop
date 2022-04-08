package com.android.ctgapp.entity.home

data class ShoppingSupportWithCreditBean(
    val companyId: Int,
    val list: ArrayList<DataBean>) {
     class DataBean(
        val clientCompanyId: Int,
        val fcodes: ArrayList<String>
    )
}