package com.android.ctgapp.entity

import java.io.Serializable

class OrderEntity :Serializable{
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"2c875556c8608114ff45ef6b9a196b77","orderNo":"DD20201024111640638HNLS017","cashChangeNo":null,"totalNumber":2,"totalPrice":59,"originalTotalNumber":null,"originalTotalPrice":null,"sellerCompanyId":888897040,"buyerCompanyId":12345,"allianceId":null,"state":2,"orderBatchNo":null,"province":null,"city":null,"district":null,"address":null,"postNum":null,"receiverName":"zyf1","telephone":"13112312321","createTime":"2020-10-24 11:16:41","updateTime":null,"remark":null,"buyerUserId":1,"closingDate":null,"payee":null,"quotationId":17,"refuseReason":null,"sellAffirm":null,"buyAffirm":null,"outBill":null,"indentFrom":null,"erpOrderId":null,"orderStatus":null,"invoiceType":null,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":"猪小健","sellerCompanyName":"西天取经","orderDetailS":null,"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":"挂账","searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"57838af4eeb566e95a11c2632192ea46","orderId":"2c875556c8608114ff45ef6b9a196b77","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":null,"payWay":1,"thirdPartyPay":null,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-10-24 11:16:41","updateTime":"2020-10-24 11:16:40"},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":"LVHRE1833B5012137"}],"total":1,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean :Serializable {
        /**
         * records : [{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"2c875556c8608114ff45ef6b9a196b77","orderNo":"DD20201024111640638HNLS017","cashChangeNo":null,"totalNumber":2,"totalPrice":59,"originalTotalNumber":null,"originalTotalPrice":null,"sellerCompanyId":888897040,"buyerCompanyId":12345,"allianceId":null,"state":2,"orderBatchNo":null,"province":null,"city":null,"district":null,"address":null,"postNum":null,"receiverName":"zyf1","telephone":"13112312321","createTime":"2020-10-24 11:16:41","updateTime":null,"remark":null,"buyerUserId":1,"closingDate":null,"payee":null,"quotationId":17,"refuseReason":null,"sellAffirm":null,"buyAffirm":null,"outBill":null,"indentFrom":null,"erpOrderId":null,"orderStatus":null,"invoiceType":null,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":"猪小健","sellerCompanyName":"西天取经","orderDetailS":null,"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":"挂账","searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"57838af4eeb566e95a11c2632192ea46","orderId":"2c875556c8608114ff45ef6b9a196b77","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":null,"payWay":1,"thirdPartyPay":null,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-10-24 11:16:41","updateTime":"2020-10-24 11:16:40"},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":"LVHRE1833B5012137"}]
         * total : 1
         * size : 20
         * current : 1
         * orders : []
         * optimizeCountSql : true
         * hitCount : false
         * countId : null
         * maxLimit : null
         * searchCount : true
         * pages : 1
         */
        var total = 0
        var size = 0
        var current = 0
        var isOptimizeCountSql = false
        var isHitCount = false
        var countId: Any? = null
        var maxLimit: Any? = null
        var isSearchCount = false
        var pages = 0
        var records: List<RecordsBean>? = null
        var orders: List<*>? = null

        class RecordsBean :Serializable {
            /**
             * startDate : null
             * endDate : null
             * pageNum : 1
             * pageSize : 20
             * orderId : 2c875556c8608114ff45ef6b9a196b77
             * orderNo : DD20201024111640638HNLS017
             * cashChangeNo : null
             * totalNumber : 2
             * totalPrice : 59
             * originalTotalNumber : null
             * originalTotalPrice : null
             * sellerCompanyId : 888897040
             * buyerCompanyId : 12345
             * allianceId : null
             * state : 2
             * orderBatchNo : null
             * province : null
             * city : null
             * district : null
             * address : null
             * postNum : null
             * receiverName : zyf1
             * telephone : 13112312321
             * createTime : 2020-10-24 11:16:41
             * updateTime : null
             * remark : null
             * buyerUserId : 1
             * closingDate : null
             * payee : null
             * quotationId : 17
             * refuseReason : null
             * sellAffirm : null
             * buyAffirm : null
             * outBill : null
             * indentFrom : null
             * erpOrderId : null
             * orderStatus : null
             * invoiceType : null
             * head : null
             * taxNo : null
             * companyAddress : null
             * companyPhone : null
             * bank : null
             * buyerUserName : null
             * buyerCompanyName : 猪小健
             * sellerCompanyName : 西天取经
             * orderDetailS : null
             * cashReplaceId : null
             * payWay : null
             * leftCash : null
             * payWayString : 挂账
             * searchString : null
             * isNeedChangeReceiverInfo : null
             * isNeedChangeRemark : null
             * orderInvoice : null
             * ctgOrderPay : {"orderPayId":"57838af4eeb566e95a11c2632192ea46","orderId":"2c875556c8608114ff45ef6b9a196b77","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":null,"payWay":1,"thirdPartyPay":null,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-10-24 11:16:41","updateTime":"2020-10-24 11:16:40"}
             * originalCtgOrderPay : null
             * buyerCompanyIds : null
             * sellerCompanyIds : null
             * states : null
             * indentFroms : null
             * orderByDescs : null
             * limitNum : null
             * days : null
             * industry : null
             * vin : LVHRE1833B5012137
             */

            val flow=0
            var startDate: Any? = null
            var endDate: Any? = null
            var pageNum = 0
            var pageSize = 0
            var orderId: String? = null
            var orderNo: String? = null
            var cashChangeNo: Any? = null
            var totalNumber = 0
            var totalPrice = 0.0
            var originalTotalNumber: Any? = null
            var originalTotalPrice: Any? = null
            var sellerCompanyId = 0
            var buyerCompanyId = 0
            var allianceId: Any? = null
            var allianceName: Any? = null
            var state = 0
            var orderBatchNo: Any? = null
            var province: Any? = null
            var city: Any? = null
            var district: Any? = null
            var address: Any? = null
            var postNum: Any? = null
            var receiverName: String? = null
            var telephone: String? = null
            var createTime: String? = null
            var updateTime: Any? = null
            var remark: Any? = null
            var buyerUserId = 0
            var closingDate: Any? = null
            var payee: Any? = null
            var quotationId = 0
            var refuseReason: Any? = null
            var sellAffirm: Any? = null
            var buyAffirm: Any? = null
            var outBill: Any? = null
            var indentFrom: Any? = null
            var erpOrderId: Any? = null
            var orderStatus: Any? = null
            var invoiceType: Any? = null
            var head: Any? = null
            var taxNo: Any? = null
            var companyAddress: Any? = null
            var companyPhone: Any? = null
            var bank: Any? = null
            var buyerUserName: Any? = null
            var buyerCompanyName: String? = null
            var sellerCompanyName: String? = null
            var orderDetailS: Any? = null
            var cashReplaceId: Any? = null
            var payWay: Any? = null
            var leftCash: Any? = null
            var payWayString: String? = null
            var searchString: Any? = null
            var isNeedChangeReceiverInfo: Any? = null
            var isNeedChangeRemark: Any? = null
            var orderInvoice: Any? = null
            var ctgOrderPay: CtgOrderPayBean? = null
            var originalCtgOrderPay: Any? = null
            var buyerCompanyIds: Any? = null
            var sellerCompanyIds: Any? = null
            var states: Any? = null
            var indentFroms: Any? = null
            var orderByDescs: Any? = null
            var limitNum: Any? = null
            var days: Any? = null
            var industry: Any? = null
            var vin: String? = null
            var goodsNames: String = ""
            //是否可以在外部点击退货
            var returnStatus=-1
            var returnOrderId=""

            class CtgOrderPayBean  :Serializable{
                /**
                 * orderPayId : 57838af4eeb566e95a11c2632192ea46
                 * orderId : 2c875556c8608114ff45ef6b9a196b77
                 * cashReplaceId : null
                 * repalceCash : null
                 * leftCash : null
                 * wxPayCash : null
                 * alipayCash : null
                 * payWay : 1
                 * thirdPartyPay : null
                 * thirdOrderNo : null
                 * totalReturnCash : 0
                 * createTime : 2020-10-24 11:16:41
                 * updateTime : 2020-10-24 11:16:40
                 */
                var orderPayId: String? = null
                var orderId: String? = null
                var cashReplaceId: Any? = null
                var repalceCash: Any? = null
                var leftCash: Any? = null
                var wxPayCash: Any? = null
                var alipayCash: Any? = null
                var payWay = 0
                var thirdPartyPay: Any? = null
                var thirdOrderNo: Any? = null
                var totalReturnCash = 0.0
                var createTime: String? = null
                var updateTime: String? = null

            }
        }
    }
}