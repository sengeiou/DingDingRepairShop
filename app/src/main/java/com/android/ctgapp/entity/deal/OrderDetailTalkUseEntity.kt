package com.android.ctgapp.entity.deal

class OrderDetailTalkUseEntity {

    var data: DataBean? = null


    class DataBean {
        var orderNo: String? = null
        var buyerUserName: String? = null
        var buyerCompanyName: String? = null
        var state: Int? = null
        var totalNumber: String? = null
        var actuallyPrice: String? = null
        var orderId: String? = null

        var orderDetailS: List<OrderDetailSBean>? = null
        var ctgOrderPay: CtgOrderPayBean? = null

        class OrderDetailSBean {
            var goodsName: String? = null
            var goodsAmount: String? = null
            var goodsPrice: String? = null
        }

        class CtgOrderPayBean {
            var createTime: String? = null

        }
    }
}