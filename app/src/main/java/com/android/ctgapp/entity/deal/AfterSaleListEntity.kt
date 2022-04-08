package com.android.ctgapp.entity.deal

class AfterSaleListEntity {
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"id":"3486b2e32b4a4b928f0f6321c6e57abc","returnNo":"TH20201202092349683IBC8000","orderNo":"DD20201123133602620YXHV003","buyerCompanyId":65551,"sellerCompanyId":12345,"returnOrderGoods":[{"goodsName":"12311313","returnNum":1}],"applyTime":"2020-12-02 09:23:50","returnCash":0.01,"returnStatus":1},{"id":"b5a7c9add3874290b79d3b7db394eac8","returnNo":"TH202011261736017619X8O002","orderNo":"DD20201121170954943OEW1003","buyerCompanyId":888897040,"sellerCompanyId":12345,"returnOrderGoods":[{"goodsName":"fgj56urtyu","returnNum":1}],"applyTime":"2020-11-26 10:24:18","returnCash":10,"returnStatus":3},{"id":"68cd5e7eec7f4cc29eb46314f86fb6b7","returnNo":"TH20201111165050789014","orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":"发送到","returnNum":2}],"applyTime":"2020-11-11 16:50:51","returnCash":null,"returnStatus":6},{"id":"0ada9e6a3d874d10b4899d7b2505052c","returnNo":"TH20201111164947845013","orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":null,"returnNum":1}],"applyTime":"2020-11-11 16:49:48","returnCash":null,"returnStatus":6},{"id":"68cd5e7eec7f4cc29eb46314f86fb6b8","returnNo":null,"orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":"发送到","returnNum":1},{"goodsName":null,"returnNum":8}],"applyTime":null,"returnCash":null,"returnStatus":null}],"total":5,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * records : [{"id":"3486b2e32b4a4b928f0f6321c6e57abc","returnNo":"TH20201202092349683IBC8000","orderNo":"DD20201123133602620YXHV003","buyerCompanyId":65551,"sellerCompanyId":12345,"returnOrderGoods":[{"goodsName":"12311313","returnNum":1}],"applyTime":"2020-12-02 09:23:50","returnCash":0.01,"returnStatus":1},{"id":"b5a7c9add3874290b79d3b7db394eac8","returnNo":"TH202011261736017619X8O002","orderNo":"DD20201121170954943OEW1003","buyerCompanyId":888897040,"sellerCompanyId":12345,"returnOrderGoods":[{"goodsName":"fgj56urtyu","returnNum":1}],"applyTime":"2020-11-26 10:24:18","returnCash":10,"returnStatus":3},{"id":"68cd5e7eec7f4cc29eb46314f86fb6b7","returnNo":"TH20201111165050789014","orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":"发送到","returnNum":2}],"applyTime":"2020-11-11 16:50:51","returnCash":null,"returnStatus":6},{"id":"0ada9e6a3d874d10b4899d7b2505052c","returnNo":"TH20201111164947845013","orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":null,"returnNum":1}],"applyTime":"2020-11-11 16:49:48","returnCash":null,"returnStatus":6},{"id":"68cd5e7eec7f4cc29eb46314f86fb6b8","returnNo":null,"orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":"发送到","returnNum":1},{"goodsName":null,"returnNum":8}],"applyTime":null,"returnCash":null,"returnStatus":null}]
         * total : 5
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

        class RecordsBean {
            /**
             * id : 3486b2e32b4a4b928f0f6321c6e57abc
             * returnNo : TH20201202092349683IBC8000
             * orderNo : DD20201123133602620YXHV003
             * buyerCompanyId : 65551
             * sellerCompanyId : 12345
             * returnOrderGoods : [{"goodsName":"12311313","returnNum":1}]
             * applyTime : 2020-12-02 09:23:50
             * returnCash : 0.01
             * returnStatus : 1
             */
            var id: String? = null
            var returnNo: String? = null
            var orderNo: String? = null
            var buyerCompanyName: String? = null
            var sellerCompanyName: String? = null
            var buyerCompanyId = 0
            var flow = 0
            var sellerCompanyId = 0
            var applyTime: String? = null
            var allianceName: String? = null
            var returnCash = 0.0
            var returnStatus = 0
            var returnOrderGoods: List<ReturnOrderGoodsBean>? = null

            class ReturnOrderGoodsBean {
                /**
                 * goodsName : 12311313
                 * returnNum : 1
                 */
                var goodsName: String? = null
                var returnNum = 0

            }
        }
    }
}