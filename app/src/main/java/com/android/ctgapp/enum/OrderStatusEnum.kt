package com.android.ctgapp.enum

enum class OrderStatusEnum(val statusCode: Int, val statusName: String) {
    //1待付款  2待发货 3待收货 4已完成  7已取消 9退货中 //已取消放在全部里
    ALL(-1,"全部"),
    WAIT_PAY(1, "待付款"),
    WAIT_SEND(2, "待发货"),
    WAIT_GET(3, "待收货"),
    FINISH(4, "已完成"),
    CANCEL(7, "已取消"),
    BACK(9, "退货中");



}

fun getOrderStatusName(statusCode: Int): String {
    OrderStatusEnum.values().forEach {
        if (statusCode == it.statusCode) {
            return it.statusName
        }
    }
    return ""
}