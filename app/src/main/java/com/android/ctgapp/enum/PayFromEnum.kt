package com.android.ctgapp.enum

enum class PayFromEnum(private val fromWhere: String) {
    ORDER("订单"),
    TOP_UP_COMPANY("公司充值"),
    TOP_UP_PERSON("个人充值充值"),
    TOP_UP_UNION("企业充值充值"),
    WAIT_BAR_SINGLE("白条单独还款"),
    WAIT_BAR_MORE("白条批量还款"),
    TOP_UP_RECHARGE("储值卡充值"),
}