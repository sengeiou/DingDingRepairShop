package com.android.ctgapp.entity.deal

class QueryCouponBean {
    var buyerCompanyId: String? = null
    var orders: orderDetailS? = null

    class orderDetailS {
        //商品ID
        var brandId:String?=null
        //品类
        var categoryCode:String?=null
        //数量
        var goodsAmount:Int?=null
        //价格
        var goodsPrice:Int?=null
        //卖家
        var sellerCompanyId:Int?=null
    }
}