package com.android.ctgapp.entity.home

class CreateOrderResultEntity {
    /**
     * status : 0
     * msg : null
     * data : {"orderBatchId":"5adc32e7de22acbb4feaa6c3a3e17f83","orderBatchNo":"PC20201116141822161UZ1D002","vin":null,"createTime":null,"updateTime":null,"totalNumber":1,"totalPrice":0.01,"buyerCompanyId":65551,"allianceId":null,"province":"江苏省","city":"无锡市","district":"锡山区","address":"有点意思你这个骚东西","postNum":null,"receiverName":"阿兴","telephone":"1333333333","buyerUserId":1309,"indentFrom":1,"remark":"阿兴 你皮肤呢","orders":[{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","orderNo":"DD20201116141822176T0VG003","cashChangeNo":null,"totalNumber":1,"totalPrice":0.01,"originalTotalNumber":1,"originalTotalPrice":0.01,"sellerCompanyId":12345,"buyerCompanyId":65551,"allianceId":null,"state":1,"orderBatchNo":"PC20201116141822161UZ1D002","province":"江苏省","city":"无锡市","district":"锡山区","address":"有点意思你这个骚东西","postNum":null,"receiverName":"阿兴","telephone":"1333333333","createTime":null,"updateTime":null,"remark":"是的","buyerUserId":1309,"closingDate":null,"payee":null,"quotationId":null,"refuseReason":null,"sellAffirm":null,"buyAffirm":null,"outBill":null,"indentFrom":1,"erpOrderId":null,"orderStatus":null,"invoiceType":0,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":null,"sellerCompanyName":null,"orderDetailS":[{"orderDetailId":null,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"12311313","goodsNo":"uue8qw23132d","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":42,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":null,"updateTime":null,"categoryCode":"106-10","brandId":null,"shoppingCartId":null}],"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":null,"searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"97e9c91be702e900e86355c299b01a1b","orderId":"b829c4f2bf16a2daac607ba4c9a030d1","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":null,"createTime":"2020-11-16 14:18:22","updateTime":null},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":null,"goodsNames":null,"orderInfo":null}],"orderType":2,"payWay":3,"leftCash":null,"wxPayCash":null,"alipayCash":null,"orderInfo":"alipay_sdk=alipay-sdk-java-dynamicVersionNo&app_auth_token=202010BB3d72b65a56414bb4b855a3045c1afB13&app_id=2021001198692705&biz_content=%7B%22body%22%3A%2212345%22%2C%22out_trade_no%22%3A%22DD20201116141822176T0VG003%22%2C%22passback_params%22%3A%22callback+params%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22subject%22%3A%22App%E6%94%AF%E4%BB%98%E6%B5%8B%E8%AF%95-By+Javen%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A%220.01%22%7D&charset=UTF-8&format=json&method=alipay.trade.app.pay&notify_url=http%3A%2F%2Fsell.natapp4.cc%2ForderService_v2%2FaliPay%2FpayNotify&sign=WOQj0O8AEYssqhJkdBTu2%2BmFPPwrfWNlcZBA5pImKLVCWGfW8pHLq6LeizdXxoeZzrE5blCaZ97dGr9kvOF1PAYGgBjdY8iZiEIc6CQPzkjw8oj2E5eeMdZbwmyhjn9FUYvCNRZEg8M1yV%2BAbA3qBaX5ZYKnfIXzbLDJ8cXmKazXGMM6J6DDWLyPSy%2BXiz3Ni4Czqn5DVKHRl9pCAMCqeArODmNOfdOKWz5vS8IZSwhjeboUC7eCS5NvR0%2B4iDsr%2BKPnHDmvU7%2F3%2B5b%2B9ZgsFEPZWlrnTn90MW9e%2BxxSAEhv8xbyU1b7yIYSefeJXUghsV5Zq13oHv972gSQBtWzsQ%3D%3D&sign_type=RSA2&timestamp=2020-11-16+14%3A18%3A22&version=1.0"}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * orderBatchId : 5adc32e7de22acbb4feaa6c3a3e17f83
         * orderBatchNo : PC20201116141822161UZ1D002
         * vin : null
         * createTime : null
         * updateTime : null
         * totalNumber : 1
         * totalPrice : 0.01
         * buyerCompanyId : 65551
         * allianceId : null
         * province : 江苏省
         * city : 无锡市
         * district : 锡山区
         * address : 有点意思你这个骚东西
         * postNum : null
         * receiverName : 阿兴
         * telephone : 1333333333
         * buyerUserId : 1309
         * indentFrom : 1
         * remark : 阿兴 你皮肤呢
         * orders : [{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","orderNo":"DD20201116141822176T0VG003","cashChangeNo":null,"totalNumber":1,"totalPrice":0.01,"originalTotalNumber":1,"originalTotalPrice":0.01,"sellerCompanyId":12345,"buyerCompanyId":65551,"allianceId":null,"state":1,"orderBatchNo":"PC20201116141822161UZ1D002","province":"江苏省","city":"无锡市","district":"锡山区","address":"有点意思你这个骚东西","postNum":null,"receiverName":"阿兴","telephone":"1333333333","createTime":null,"updateTime":null,"remark":"是的","buyerUserId":1309,"closingDate":null,"payee":null,"quotationId":null,"refuseReason":null,"sellAffirm":null,"buyAffirm":null,"outBill":null,"indentFrom":1,"erpOrderId":null,"orderStatus":null,"invoiceType":0,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":null,"sellerCompanyName":null,"orderDetailS":[{"orderDetailId":null,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"12311313","goodsNo":"uue8qw23132d","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":42,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":null,"updateTime":null,"categoryCode":"106-10","brandId":null,"shoppingCartId":null}],"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":null,"searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"97e9c91be702e900e86355c299b01a1b","orderId":"b829c4f2bf16a2daac607ba4c9a030d1","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":null,"createTime":"2020-11-16 14:18:22","updateTime":null},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":null,"goodsNames":null,"orderInfo":null}]
         * orderType : 2
         * payWay : 3
         * leftCash : null
         * wxPayCash : null
         * alipayCash : null
         * orderInfo : alipay_sdk=alipay-sdk-java-dynamicVersionNo&app_auth_token=202010BB3d72b65a56414bb4b855a3045c1afB13&app_id=2021001198692705&biz_content=%7B%22body%22%3A%2212345%22%2C%22out_trade_no%22%3A%22DD20201116141822176T0VG003%22%2C%22passback_params%22%3A%22callback+params%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22subject%22%3A%22App%E6%94%AF%E4%BB%98%E6%B5%8B%E8%AF%95-By+Javen%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A%220.01%22%7D&charset=UTF-8&format=json&method=alipay.trade.app.pay&notify_url=http%3A%2F%2Fsell.natapp4.cc%2ForderService_v2%2FaliPay%2FpayNotify&sign=WOQj0O8AEYssqhJkdBTu2%2BmFPPwrfWNlcZBA5pImKLVCWGfW8pHLq6LeizdXxoeZzrE5blCaZ97dGr9kvOF1PAYGgBjdY8iZiEIc6CQPzkjw8oj2E5eeMdZbwmyhjn9FUYvCNRZEg8M1yV%2BAbA3qBaX5ZYKnfIXzbLDJ8cXmKazXGMM6J6DDWLyPSy%2BXiz3Ni4Czqn5DVKHRl9pCAMCqeArODmNOfdOKWz5vS8IZSwhjeboUC7eCS5NvR0%2B4iDsr%2BKPnHDmvU7%2F3%2B5b%2B9ZgsFEPZWlrnTn90MW9e%2BxxSAEhv8xbyU1b7yIYSefeJXUghsV5Zq13oHv972gSQBtWzsQ%3D%3D&sign_type=RSA2&timestamp=2020-11-16+14%3A18%3A22&version=1.0
         */
        var orderBatchId: String? = null
        var orderBatchNo: String? = null
        var vin: Any? = null
        var createTime: Any? = null
        var updateTime: Any? = null
        var totalNumber = 0
        var totalPrice = 0.0
        var buyerCompanyId = 0
        var allianceId: Any? = null
        var province: String? = null
        var city: String? = null
        var district: String? = null
        var address: String? = null
        var postNum: Any? = null
        var receiverName: String? = null
        var telephone: String? = null
        var buyerUserId = 0
        var indentFrom = 0
        var remark: String? = null
        var orderType = 0
        var payWay = 0
        var leftCash: Any? = null
        var wxPayCash: Any? = null
        var alipayCash: Any? = null
        var orderInfo: String? = null
        var submit:Boolean?=null
        var orders: List<OrdersBean>? = null

        class OrdersBean {
            /**
             * startDate : null
             * endDate : null
             * pageNum : 1
             * pageSize : 20
             * orderId : b829c4f2bf16a2daac607ba4c9a030d1
             * orderNo : DD20201116141822176T0VG003
             * cashChangeNo : null
             * totalNumber : 1
             * totalPrice : 0.01
             * originalTotalNumber : 1
             * originalTotalPrice : 0.01
             * sellerCompanyId : 12345
             * buyerCompanyId : 65551
             * allianceId : null
             * state : 1
             * orderBatchNo : PC20201116141822161UZ1D002
             * province : 江苏省
             * city : 无锡市
             * district : 锡山区
             * address : 有点意思你这个骚东西
             * postNum : null
             * receiverName : 阿兴
             * telephone : 1333333333
             * createTime : null
             * updateTime : null
             * remark : 是的
             * buyerUserId : 1309
             * closingDate : null
             * payee : null
             * quotationId : null
             * refuseReason : null
             * sellAffirm : null
             * buyAffirm : null
             * outBill : null
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
             * buyerCompanyName : null
             * sellerCompanyName : null
             * orderDetailS : [{"orderDetailId":null,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"12311313","goodsNo":"uue8qw23132d","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":42,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":null,"updateTime":null,"categoryCode":"106-10","brandId":null,"shoppingCartId":null}]
             * cashReplaceId : null
             * payWay : null
             * leftCash : null
             * payWayString : null
             * searchString : null
             * isNeedChangeReceiverInfo : null
             * isNeedChangeRemark : null
             * orderInvoice : null
             * ctgOrderPay : {"orderPayId":"97e9c91be702e900e86355c299b01a1b","orderId":"b829c4f2bf16a2daac607ba4c9a030d1","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":null,"createTime":"2020-11-16 14:18:22","updateTime":null}
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
            var pageNum = 0
            var pageSize = 0
            var orderId: String? = null
            var orderNo: String? = null
            var cashChangeNo: Any? = null
            var totalNumber = 0
            var totalPrice = 0.0
            var originalTotalNumber = 0
            var originalTotalPrice = 0.0
            var sellerCompanyId = 0
            var buyerCompanyId = 0
            var allianceId: Any? = null
            var state = 0
            var orderBatchNo: String? = null
            var province: String? = null
            var city: String? = null
            var district: String? = null
            var address: String? = null
            var postNum: Any? = null
            var receiverName: String? = null
            var telephone: String? = null
            var createTime: Any? = null
            var updateTime: Any? = null
            var remark: String? = null
            var buyerUserId = 0
            var closingDate: Any? = null
            var payee: Any? = null
            var quotationId: Any? = null
            var refuseReason: Any? = null
            var sellAffirm: Any? = null
            var buyAffirm: Any? = null
            var outBill: Any? = null
            var indentFrom = 0
            var erpOrderId: Any? = null
            var orderStatus: Any? = null
            var invoiceType = 0
            var head: Any? = null
            var taxNo: Any? = null
            var companyAddress: Any? = null
            var companyPhone: Any? = null
            var bank: Any? = null
            var buyerUserName: Any? = null
            var buyerCompanyName: Any? = null
            var sellerCompanyName: Any? = null
            var cashReplaceId: Any? = null
            var payWay: Any? = null
            var leftCash: Any? = null
            var payWayString: Any? = null
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
            var vin: Any? = null
            var goodsNames: Any? = null
            var orderInfo: Any? = null
            var orderDetailS: List<OrderDetailSBean>? = null

            class CtgOrderPayBean {
                /**
                 * orderPayId : 97e9c91be702e900e86355c299b01a1b
                 * orderId : b829c4f2bf16a2daac607ba4c9a030d1
                 * cashReplaceId : null
                 * repalceCash : null
                 * leftCash : null
                 * wxPayCash : null
                 * alipayCash : 0.01
                 * payWay : 3
                 * thirdPartyPay : 0.01
                 * thirdOrderNo : null
                 * totalReturnCash : null
                 * createTime : 2020-11-16 14:18:22
                 * updateTime : null
                 */
                var orderPayId: String? = null
                var orderId: String? = null
                var cashReplaceId: Any? = null
                var repalceCash: Any? = null
                var leftCash: Any? = null
                var wxPayCash: Any? = null
                var alipayCash = 0.0
                var payWay = 0
                var thirdPartyPay = 0.0
                var thirdOrderNo: Any? = null
                var totalReturnCash: Any? = null
                var createTime: String? = null
                var updateTime: Any? = null

            }

            class OrderDetailSBean {
                /**
                 * orderDetailId : null
                 * orderId : b829c4f2bf16a2daac607ba4c9a030d1
                 * goodsAmount : 1
                 * originalGoodsAmount : 1
                 * goodsPrice : 0.01
                 * originalGoodsPrice : 0.01
                 * goodsName : 12311313
                 * goodsNo : uue8qw23132d
                 * partName : null
                 * partOe : null
                 * spec : null
                 * brand : null
                 * remark : null
                 * ctgnum : null
                 * quality : null
                 * goodsId : 42
                 * sourceFrom : null
                 * totalPrice : 0.01
                 * warehouseId : null
                 * createTime : null
                 * updateTime : null
                 * categoryCode : 106-10
                 * brandId : null
                 * shoppingCartId : null
                 */
                var orderDetailId: Any? = null
                var orderId: String? = null
                var goodsAmount = 0
                var originalGoodsAmount = 0
                var goodsPrice = 0.0
                var originalGoodsPrice = 0.0
                var goodsName: String? = null
                var goodsNo: String? = null
                var partName: Any? = null
                var partOe: Any? = null
                var spec: Any? = null
                var brand: Any? = null
                var remark: Any? = null
                var ctgnum: Any? = null
                var quality: Any? = null
                var goodsId = 0
                var sourceFrom: Any? = null
                var totalPrice = 0.0
                var warehouseId: Any? = null
                var createTime: Any? = null
                var updateTime: Any? = null
                var categoryCode: String? = null
                var brandId: Any? = null
                var shoppingCartId: Any? = null

            }
        }
    }
}