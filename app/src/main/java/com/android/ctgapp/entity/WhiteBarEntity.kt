package com.android.ctgapp.entity

class WhiteBarEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":106,"whiteCompanyId":888897987,"companyId":65551,"creditLimit":0,"used":1,"tempCreditLimit":0,"tempStartTime":null,"tempEndTime":null,"reconciliationDay":"次月1日","settlingDay":"20","rate":null,"type":1,"createTime":"2020-12-31 13:17:37","updateTime":null,"responsibleUserId":null,"returnMoney":1,"ogrName":"测试一夏经销","balck":false}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 106
         * whiteCompanyId : 888897987
         * companyId : 65551
         * creditLimit : 0.0
         * used : 1.0
         * tempCreditLimit : 0.0
         * tempStartTime : null
         * tempEndTime : null
         * reconciliationDay : 次月1日
         * settlingDay : 20
         * rate : null
         * type : 1
         * createTime : 2020-12-31 13:17:37
         * updateTime : null
         * responsibleUserId : null
         * returnMoney : 1.0
         * ogrName : 测试一夏经销
         * balck : false
         */
        var id = 0
        var whiteCompanyId = 0
        var companyId = 0
        var creditLimit = 0.0
        var used = 0.0
        var tempCreditLimit = 0.0
        var tempStartTime: Any? = null
        var tempEndTime: Any? = null
        var reconciliationDay: String? = null
        var settlingDay: String? = null
        var rate: Any? = null
        var type = 0
        var createTime: String? = null
        var updateTime: Any? = null
        var responsibleUserId: Any? = null
        var returnMoney = 0.0
        var ogrName: String? = null
        var isBalck = false
    }
}