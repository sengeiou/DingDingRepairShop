package com.android.ctgapp.entity.mine

class WhiteBarDealDetail4Entity {
    /**
     * status : 0
     * msg : null
     * data : {"orderNo":"DD20210511134157866SY2A008","billMoney":150,"orderMoney":150,"billnum":"ZD20210604210218143CJSO010","lastDay":"2021/05/20","buyTime":"2021-05-11 13:41:58","payTime":null,"retrunType":1}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * orderNo : DD20210511134157866SY2A008
         * billMoney : 150.0
         * orderMoney : 150.0
         * billnum : ZD20210604210218143CJSO010
         * lastDay : 2021/05/20
         * buyTime : 2021-05-11 13:41:58
         * payTime : null
         * retrunType : 1
         */
        var orderNo: String? = null
        var billMoney = 0.0
        var orderMoney = 0.0
        var billnum: String? = null
        var lastDay: String? = null
        var buyTime: String? = null
        var payTime: Any? = null
        var retrunType = 0
    }
}