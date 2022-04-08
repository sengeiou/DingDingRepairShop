package com.android.ctgapp.enum

/**
 *作者:LiBW
 *创建日期: 12/2/20
 *描述: 退货状态码
 */
enum class SalesReturnEnum(val statesCode: Int, val statesName: String, val showName: String) {
    //已申请  审核中  //同意退货 待发货 //已收货  验货中  //退款中  //已完成(拒绝退货  验货不通过 退款完成  已取消)
    HAVE_APPLIED(1, "已申请", "审核中"),
    AGREE_RETURN(2, "同意退货", "待发货"),
    REFUSE_RETURN(3, "拒绝退货", "已拒绝"),
    EXAMINE_FAILED(4, "验货不通过", "验货未通过"),
    RECEIVED(5, "已收货", "验货中"),
    REFUNDED(6, "退款完成", "已退款"),
    CANCELLED(7, "已取消", "已取消"),
    REFUNDING(8, "退款中", "退款中"),
    WAIT_GOODS(9, "待收货", "待收货"),
    UNKNOWN(0, "未知", "未知"),
    //新增
    WAIT_CHECK(-2, "待审核", "待审核"),
    CHECK_NO(-1, "审核未过", "审核不通过"),


}

fun getShowName(statesCode: Int): String {
    SalesReturnEnum.values().forEach {
        if (statesCode == it.statesCode) {
            return it.showName
        }
    }
    return ""
}