package com.android.ctgapp.entity.mine

import com.android.ctgapp.entity.ListChildBean

class PrepaymentEntity {
    /**
     * status : 0
     * msg : null
     * data : {"allMoney":40.64,"list":[{"id":null,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":null,"returnAmount":0,"orderId":null,"settleWay":null,"isSettled":0,"createTime":null,"updateTime":null,"companyName":"无锡畅通汽配公司","linkMan":"猪小健","thisMoney":null,"allMoney":40.64,"noPayMoney":40.64,"count":4,"isAllow":null,"orderList":[{"orderNo":"DD20210603223933651OZTR072","noPayMoney":20},{"orderNo":"DD20210604163455458ZIBC184","noPayMoney":20.32},{"orderNo":"DD20210604163447982GVOT182","noPayMoney":20.64},{"orderNo":"DD20210605150510194XTXY129","noPayMoney":40.64}]}]}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * allMoney : 40.64
         * list : [{"id":null,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":null,"returnAmount":0,"orderId":null,"settleWay":null,"isSettled":0,"createTime":null,"updateTime":null,"companyName":"无锡畅通汽配公司","linkMan":"猪小健","thisMoney":null,"allMoney":40.64,"noPayMoney":40.64,"count":4,"isAllow":null,"orderList":[{"orderNo":"DD20210603223933651OZTR072","noPayMoney":20},{"orderNo":"DD20210604163455458ZIBC184","noPayMoney":20.32},{"orderNo":"DD20210604163447982GVOT182","noPayMoney":20.64},{"orderNo":"DD20210605150510194XTXY129","noPayMoney":40.64}]}]
         */
        var allMoney = 0.0
        var list: List<ListBean>? = null

        class ListBean {
            /**
             * id : null
             * companyId : 65551
             * clientCompanyId : 12345
             * billCycleNum : null
             * amount : null
             * returnAmount : 0
             * orderId : null
             * settleWay : null
             * isSettled : 0
             * createTime : null
             * updateTime : null
             * companyName : 无锡畅通汽配公司
             * linkMan : 猪小健
             * thisMoney : null
             * allMoney : 40.64
             * noPayMoney : 40.64
             * count : 4
             * isAllow : null
             * orderList : [{"orderNo":"DD20210603223933651OZTR072","noPayMoney":20},{"orderNo":"DD20210604163455458ZIBC184","noPayMoney":20.32},{"orderNo":"DD20210604163447982GVOT182","noPayMoney":20.64},{"orderNo":"DD20210605150510194XTXY129","noPayMoney":40.64}]
             */
            var id: Any? = null
            var companyId = 0
            var clientCompanyId = 0
            var billCycleNum: Any? = null
            var amount: Any? = null
            var returnAmount = 0
            var orderId: Any? = null
            var settleWay: Any? = null
            var isSettled = 0
            var createTime: Any? = null
            var updateTime: Any? = null
            var companyName: String? = null
            var linkMan: String? = null
            var thisMoney: Any? = null
            var allMoney = 0.0
            var noPayMoney = 0.0
            var count = 0
            var isAllow: Any? = null
            var selected=false
            var orderList: List<ListChildBean>? = null
        }
    }
}