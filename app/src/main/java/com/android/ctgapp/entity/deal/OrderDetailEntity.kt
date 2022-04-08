package com.android.ctgapp.entity.deal

class OrderDetailEntity {
    /**
     * status : 0
     * msg : null
     * data : {"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"91fb73ba97944b2e07a33f3e58138063","orderNo":"DD20201116143138280MJAF007","cashChangeNo":null,"totalNumber":1,"totalPrice":0.01,"originalTotalNumber":1,"originalTotalPrice":0.01,"sellerCompanyId":12345,"buyerCompanyId":65551,"allianceId":null,"state":7,"orderBatchNo":"PC20201116143138255PFWH006","province":"江苏省","city":"无锡市","district":"锡山区","address":"有点意思你这个骚东西","postNum":null,"receiverName":"阿兴","telephone":"1333333333","createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:46:38","remark":"有点意思","buyerUserId":1309,"closingDate":null,"payee":null,"quotationId":null,"refuseReason":null,"sellAffirm":false,"buyAffirm":false,"outBill":false,"indentFrom":1,"erpOrderId":null,"orderStatus":null,"invoiceType":0,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":"小黄维修","sellerCompanyName":"无锡畅通汽配公司","orderDetailS":[{"orderDetailId":"974563c4ea95f49abf772983614050e6","orderId":"91fb73ba97944b2e07a33f3e58138063","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"44444444","goodsNo":"33322111","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":51,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:31:38","categoryCode":null,"brandId":null,"shoppingCartId":null}],"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":"支付宝","searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"c3143049fe147ae31cc7602cc7e25594","orderId":"91fb73ba97944b2e07a33f3e58138063","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:31:38"},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":null,"goodsNames":null,"orderInfo":null}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * startDate : null
         * endDate : null
         * pageNum : 1
         * pageSize : 20
         * orderId : 91fb73ba97944b2e07a33f3e58138063
         * orderNo : DD20201116143138280MJAF007
         * cashChangeNo : null
         * totalNumber : 1
         * totalPrice : 0.01
         * originalTotalNumber : 1
         * originalTotalPrice : 0.01
         * sellerCompanyId : 12345
         * buyerCompanyId : 65551
         * allianceId : null
         * state : 7
         * orderBatchNo : PC20201116143138255PFWH006
         * province : 江苏省
         * city : 无锡市
         * district : 锡山区
         * address : 有点意思你这个骚东西
         * postNum : null
         * receiverName : 阿兴
         * telephone : 1333333333
         * createTime : 2020-11-16 14:31:38
         * updateTime : 2020-11-16 14:46:38
         * remark : 有点意思
         * buyerUserId : 1309
         * closingDate : null
         * payee : null
         * quotationId : null
         * refuseReason : null
         * sellAffirm : false
         * buyAffirm : false
         * outBill : false
         * indentFrom : 1
         * erpOrderId : null
         * orderStatus : null
         * invoiceType : 0
         * head : null
         * taxNo : null
         * companyAddress : null
         * companyPhone : null
         * bank : null
         * buyerUserName : null
         * buyerCompanyName : 小黄维修
         * sellerCompanyName : 无锡畅通汽配公司
         * orderDetailS : [{"orderDetailId":"974563c4ea95f49abf772983614050e6","orderId":"91fb73ba97944b2e07a33f3e58138063","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"44444444","goodsNo":"33322111","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":51,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:31:38","categoryCode":null,"brandId":null,"shoppingCartId":null}]
         * cashReplaceId : null
         * payWay : null
         * leftCash : null
         * payWayString : 支付宝
         * searchString : null
         * isNeedChangeReceiverInfo : null
         * isNeedChangeRemark : null
         * orderInvoice : null
         * ctgOrderPay : {"orderPayId":"c3143049fe147ae31cc7602cc7e25594","orderId":"91fb73ba97944b2e07a33f3e58138063","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:31:38"}
         * originalCtgOrderPay : null
         * buyerCompanyIds : null
         * sellerCompanyIds : null
         * states : null
         * indentFroms : null
         * orderByDescs : null
         * limitNum : null
         * days : null
         * industry : null
         * vin : null
         * goodsNames : null
         * orderInfo : null
         */
        var startDate: Any? = null
        var endDate: Any? = null
        var pageNum: Int? = null

        var pageSize: Int? = null
        var orderId: String? = null
        var orderNo: String? = null
        var cashChangeNo: Any? = null
        var totalNumber: String? = null
        var totalPrice: Double? = null
        var originalTotalNumber: Int? = null
        var originalTotalPrice: Float? = null
        var sellerCompanyId: Int? = null
        var buyerCompanyId: Int? = null
        var allianceId: Int? = null
        var state=0
        var orderBatchNo: String? = null
        var province: String? = null
        var city: String? = null
        var district: String? = null
        var address: String? = null
        var postNum: Any? = null
        var receiverName: String? = null
        var telephone: String? = null
        var createTime: String? = null
        var updateTime: String? = null
        var remark: String? = null
        var buyerUserId: Int? = null
        var closingDate: Any? = null
        var payee: Any? = null
        var quotationId: Any? = null
        var refuseReason: Any? = null
        var isSellAffirm = false
        var isBuyAffirm = false
        var isOutBill = false
        var indentFrom: Int? = null
        var erpOrderId: Any? = null
        var orderStatus: Any? = null
        var invoiceType: Int? = null
        var head: Any? = null
        var taxNo: Any? = null
        var companyAddress: Any? = null
        var companyPhone: Any? = null
        var bank: Any? = null
        var buyerUserName: String? = null
        var buyerCompanyName: String? = null
        var sellerCompanyName: String? = null
        var cashReplaceId: Any? = null

        //支付方式
        var payWay: Int? = null
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
        var days: String? = null

        //实付金额
        var actuallyPrice: String? = null

        //优惠金额
        var discountPrice: String? = null

        //过期时间
        var expirationTime: Int? = null
        var industry: Any? = null
        var vin: Any? = null
        var goodsNames: Any? = null
        var orderInfo: Any? = null
        var orderDetailS: List<OrderDetailSBean>? = null

        //0:未结清 1:已结清 2.撤销
        var isSettled: Int? = null

        var chaters: List<ChatersBean>? = null



        class CtgOrderPayBean {
            /**
             * orderPayId : c3143049fe147ae31cc7602cc7e25594
             * orderId : 91fb73ba97944b2e07a33f3e58138063
             * cashReplaceId : null
             * repalceCash : null
             * leftCash : null
             * wxPayCash : null
             * alipayCash : 0.01
             * payWay : 3
             * thirdPartyPay : 0.01
             * thirdOrderNo : null
             * totalReturnCash : 0.0
             * createTime : 2020-11-16 14:31:38
             * updateTime : 2020-11-16 14:31:38
             */
            var orderPayId: String? = null
            var orderId: String? = null
            var cashReplaceId: Any? = null
            var repalceCash: Any? = null
            var leftCash: Any? = null
            var wxPayCash: Any? = null
            var alipayCash: String? = null
            var payWay: Int? = null
            var thirdPartyPay: Float? = null
            var thirdOrderNo: Any? = null
            var totalReturnCash: Float? = null
            var createTime: String? = null
            var updateTime: String? = null
            var voucherId:Int?=null
            var storeCash:Double?=null
            var voucherCash:Double?=null
        }

        class OrderDetailSBean {
            /**
             * orderDetailId : 974563c4ea95f49abf772983614050e6
             * orderId : 91fb73ba97944b2e07a33f3e58138063
             * goodsAmount : 1
             * originalGoodsAmount : 1
             * goodsPrice : 0.01
             * originalGoodsPrice : 0.01
             * goodsName : 44444444
             * goodsNo : 33322111
             * partName : null
             * partOe : null
             * spec : null
             * brand : null
             * remark : null
             * ctgnum : null
             * quality : null
             * goodsId : 51
             * sourceFrom : null
             * totalPrice : 0.01
             * warehouseId : null
             * createTime : 2020-11-16 14:31:38
             * updateTime : 2020-11-16 14:31:38
             * categoryCode : null
             * brandId : null
             * shoppingCartId : null
             */
            var orderDetailId: String? = null
            var goodsImg: String? = null
            var orderId: String? = null
            var goodsAmount: Int? = null
            var originalGoodsAmount: Int? = null
            var goodsPrice: Float? = null
            var originalGoodsPrice: Float? = null
            var goodsName: String? = null
            var goodsNo: String? = null
            var partName: Any? = null
            var partOe: String? = null
            var factoryid: String? = null
            var spec: Any? = null
            var brand: Any? = null
            var remark: Any? = null
            var ctgnum: Any? = null
            var quality: Any? = null
            var goodsId: Int? = null
            var sourceFrom: Any? = null
            var totalPrice: Float? = null
            var warehouseId: Any? = null
            var createTime: String? = null
            var updateTime: String? = null
            var categoryCode: Any? = null
            var brandId: Any? = null
            var shoppingCartId: Any? = null

            //未退货的数量
            var unRefundGoodsAmount: Int? = null

            //退货的数量
            var refundGoodsAmount: Int? = null

            //售后页面选中状态
            var afterSaleSelect = false

        }
    }
}
class ChatersBean {
    var id = -1
    var name = ""
}