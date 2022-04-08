package com.android.ctgapp.entity

class CurrentBalanceEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"companyId":0,"userId":null,"amount":1}]
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var isSuccess = false
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * companyId : 0
         * userId : null
         * amount : 1
         */
        var companyId = -1
        var userId=-1
        var amount = 0.0
    }
}