package com.android.ctgapp.entity

class InvoiceEntity {
    /**
     * status : 0
     * msg : null
     * data : {"id":39,"companyId":65551,"companyName":"ceshi","companyAddress":"eqeqwe","taxNum":"12321","telephoneNum":"1231231","rank":"zz111z","rankNumber":"qweq","createUserId":12,"updateTime":"2020-12-22 03:32:21","createTime":null}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * id : 39
         * companyId : 65551
         * companyName : ceshi
         * companyAddress : eqeqwe
         * taxNum : 12321
         * telephoneNum : 1231231
         * rank : zz111z
         * rankNumber : qweq
         * createUserId : 12
         * updateTime : 2020-12-22 03:32:21
         * createTime : null
         */
        var id = 0
        var companyId = 0
        var companyName: String? = null
        var companyAddress: String? = null
        var taxNum: String? = null
        var telephoneNum: String? = null
        var comRank: String? = null
        var rankNumber: String? = null
        var createUserId = 0
        var updateTime: String? = null
        var createTime: Any? = null
    }
}