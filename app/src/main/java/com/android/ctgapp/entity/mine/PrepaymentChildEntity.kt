package com.android.ctgapp.entity.mine

class PrepaymentChildEntity {
    /**
     * status : 0
     * msg : null
     * data : {"count":4,"allMoney":40.64,"page":{"records":[{"id":712,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":20,"returnAmount":0,"orderId":"DD20210603223933651OZTR072","settleWay":null,"isSettled":0,"createTime":"2021-06-03 22:39:34","updateTime":"2021-06-03 22:39:33","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":797,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163455458ZIBC184","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:42:57","updateTime":"2021-06-04 16:42:57","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":798,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163447982GVOT182","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:49:14","updateTime":"2021-06-04 16:49:13","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":849,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":20,"returnAmount":0,"orderId":"DD20210605150510194XTXY129","settleWay":null,"isSettled":0,"createTime":"2021-06-05 15:05:10","updateTime":"2021-06-05 15:05:10","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null}],"total":4,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * count : 4
         * allMoney : 40.64
         * page : {"records":[{"id":712,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":20,"returnAmount":0,"orderId":"DD20210603223933651OZTR072","settleWay":null,"isSettled":0,"createTime":"2021-06-03 22:39:34","updateTime":"2021-06-03 22:39:33","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":797,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163455458ZIBC184","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:42:57","updateTime":"2021-06-04 16:42:57","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":798,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163447982GVOT182","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:49:14","updateTime":"2021-06-04 16:49:13","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":849,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":20,"returnAmount":0,"orderId":"DD20210605150510194XTXY129","settleWay":null,"isSettled":0,"createTime":"2021-06-05 15:05:10","updateTime":"2021-06-05 15:05:10","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null}],"total":4,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
         */
        var count = 0
        var allMoney = 0.0
        var page: PageBean? = null

        class PageBean {
            /**
             * records : [{"id":712,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":20,"returnAmount":0,"orderId":"DD20210603223933651OZTR072","settleWay":null,"isSettled":0,"createTime":"2021-06-03 22:39:34","updateTime":"2021-06-03 22:39:33","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":797,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163455458ZIBC184","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:42:57","updateTime":"2021-06-04 16:42:57","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":798,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163447982GVOT182","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:49:14","updateTime":"2021-06-04 16:49:13","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":849,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":20,"returnAmount":0,"orderId":"DD20210605150510194XTXY129","settleWay":null,"isSettled":0,"createTime":"2021-06-05 15:05:10","updateTime":"2021-06-05 15:05:10","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null}]
             * total : 4
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
                 * id : 712
                 * companyId : 65551
                 * clientCompanyId : 12345
                 * billCycleNum : ZD20210604203914970LADH010
                 * amount : 20.0
                 * returnAmount : 0.0
                 * orderId : DD20210603223933651OZTR072
                 * settleWay : null
                 * isSettled : 0
                 * createTime : 2021-06-03 22:39:34
                 * updateTime : 2021-06-03 22:39:33
                 * companyName : null
                 * linkMan : null
                 * thisMoney : null
                 * allMoney : null
                 * noPayMoney : null
                 * count : null
                 * isAllow : null
                 * orderList : null
                 */
                var id = 0
                var companyId = 0
                var clientCompanyId = 0
                var billCycleNum: String? = null
                var amount = 0.0
                var returnAmount = 0.0
                var orderId: String? = null
                var settleWay: Any? = null
                var isSettled = 0
                var createTime: String? = null
                var updateTime: String? = null
                var companyName: Any? = null
                var linkMan: Any? = null
                var thisMoney: Any? = null
                var allMoney: Any? = null
                var noPayMoney: Any? = null
                var count: Any? = null
                var isAllow: Any? = null
                var orderList: Any? = null
                var selected=false
            }
        }
    }
}