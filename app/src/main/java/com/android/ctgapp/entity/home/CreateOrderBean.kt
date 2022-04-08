package com.android.ctgapp.entity.home

import java.io.Serializable

/**
 * 作者:LiBW
 * 创建日期: 2020/11/10
 * 描述: 下单 创建订单
 */
class CreateOrderBean :Serializable{
    /**
     * vin : LVHRE1833B5012145
     * totalNumber : 4
     * totalPrice : 110.00
     * buyerCompanyId : 12345
     * allianceId : 88889570
     * province : 天津市
     * city : 天津城区
     * district : 区
     * address : 2222222
     * postNum :
     * receiverName : zyf1
     * telephone : 13112312321
     * buyerUserId : 1
     * indentFrom : 4
     * remark : 我要什么玩意
     * payWay : 1
     * orderType : 1
     * leftCash : 22
     * voucherId :代金券id
     * voucherCash代金券金额
     * storeCash 存值卡金额
     * orders : [{"sellerCompanyId":888897040,"quotationId":261,"cashReplaceId":2,"invoiceType":0,"head":null,"taxNo":null,"remark":"曹尼玛","companyAddress":null,"companyPhone":null,"bank":null,"orderDetailS":[{"goodsAmount":1,"goodsPrice":22,"goodsNo":"BJD89023","goodsName":"左前大灯","partName":"左前大灯","partOe":"9J080333","spec":"11111","brand":"合生元","ctgnum":"1234","quality":"原厂件","remark":"商品备注","goodsId":"商品id","categoryCode":"105-10","shoppingCartId":530,"warehouseId":"2828383939390"},{"goodsAmount":1,"goodsPrice":11,"goodsName":"左前门","partNo":"","partName":"左前门","brand":null,"ctgnum":null,"quality":"","remark":"去哦草i","goodsId":null,"shoppingCartId":529},{"goodsAmount":1,"goodsPrice":33,"goodsName":"左前门限位器","goodsNo":"编码SDWWEDF","partName":"左前门限位器","partNo":"89J7890223","brand":null,"ctgnum":null,"quality":"","remark":"","goodsId":null,"shoppingCartId":531},{"goodsAmount":1,"goodsPrice":44,"goodsName":"左前门锁机","partNo":"4444333","partName":"左前门锁机","brand":null,"ctgnum":null,"quality":"","remark":"","goodsId":null,"shoppingCartId":532}]}]
     */
    var vin: String? = null
    var totalNumber :Int? = null
    var totalPrice: String? = null
    var buyerCompanyId: String? = null
    var allianceId: Int? = null
    var province: String? = null
    var city: String? = null
    var district: String? = null
    var address: String? = null
    var postNum: String? = null
    var receiverName: String? = null
    var telephone: String? = null
    var buyerUserId: Int? = null
    var indentFrom :Int? = null
    var remark: String? = null
    var payWay :Int? = null
    var orderType :Int? = null
    var leftCash: Int? = null

    var orders: List<OrdersBean>? = null

    class OrdersBean  :Serializable{
        /**
         * sellerCompanyId : 888897040
         * quotationId : 261
         * cashReplaceId : 2
         * invoiceType : 0
         * head : null
         * taxNo : null
         * remark : 曹尼玛
         * companyAddress : null
         * companyPhone : null
         * bank : null
         * orderDetailS : [{"goodsAmount":1,"goodsPrice":22,"goodsNo":"BJD89023","goodsName":"左前大灯","partName":"左前大灯","partOe":"9J080333","spec":"11111","brand":"合生元","ctgnum":"1234","quality":"原厂件","remark":"商品备注","goodsId":"商品id","categoryCode":"105-10","shoppingCartId":530,"warehouseId":"2828383939390"},{"goodsAmount":1,"goodsPrice":11,"goodsName":"左前门","partNo":"","partName":"左前门","brand":null,"ctgnum":null,"quality":"","remark":"去哦草i","goodsId":null,"shoppingCartId":529},{"goodsAmount":1,"goodsPrice":33,"goodsName":"左前门限位器","goodsNo":"编码SDWWEDF","partName":"左前门限位器","partNo":"89J7890223","brand":null,"ctgnum":null,"quality":"","remark":"","goodsId":null,"shoppingCartId":531},{"goodsAmount":1,"goodsPrice":44,"goodsName":"左前门锁机","partNo":"4444333","partName":"左前门锁机","brand":null,"ctgnum":null,"quality":"","remark":"","goodsId":null,"shoppingCartId":532}]
         */
        var sellerCompanyId :Int? = null
        var quotationId :Int? = null
        var cashReplaceId :Int? = null
        var invoiceType :Int? = null
        var head: Any? = null
        var taxNo: Any? = null
        var remark: String? = null
        var companyAddress: Any? = null
        var companyPhone: Any? = null
        var bank: Any? = null
        var orderDetailS: List<OrderDetailSBean>? = null
        var voucherId:String?=null
        var voucherCash:String="0"
        var storeCash:String="0"
        class OrderDetailSBean  :Serializable{
            /**
             * goodsAmount : 1
             * goodsPrice : 22
             * goodsNo : BJD89023
             * goodsName : 左前大灯
             * partName : 左前大灯
             * partOe : 9J080333
             * spec : 11111
             * brand : 合生元
             * ctgnum : 1234
             * quality : 原厂件
             * remark : 商品备注
             * goodsId : 商品id
             * categoryCode : 105-10
             * shoppingCartId : 530
             * warehouseId : 2828383939390
             * partNo :
             */
            var goodsAmount :Int? = null
            var goodsPrice :Double? = null
            var goodsNo: String? = null
            var goodsName: String? = null
            var partName: String? = null
            var partOe: String? = null
            var spec: String? = null
            var brand: String? = null
            var ctgnum: String? = null
            var quality: String? = null
            var remark: String? = null
            var goodsId: String? = null
            var categoryCode: String? = null
            var shoppingCartId :Int? = null
            var warehouseId: String? = null
            var partNo: String? = null
            var goodsImg: String? = null
            var brandId: Int? = null

        }
    }
}
