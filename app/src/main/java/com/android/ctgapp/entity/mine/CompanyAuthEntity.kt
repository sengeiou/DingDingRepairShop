package com.android.ctgapp.entity.mine

class CompanyAuthEntity {
    /**
     * status : 0
     * msg : null
     * data : {"id":25,"companyName":"匠心独具家低度酒","companyId":888898014,"idcard":null,"businessLicense":"96c73c61-0409-4a2d-ba5f-256b4852c35c.jpeg","registerNum":"都会好的很多","legalMan":"等会等会","adminCard":null,"authentication":null,"submitUserid":1309,"status":0,"reason":null,"createTime":"2021-04-09T15:06:28","applyTime":"2021-04-09T15:06:28","updateTime":"2021-04-09T15:06:28"}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * id : 25
         * companyName : 匠心独具家低度酒
         * companyId : 888898014
         * idcard : null
         * businessLicense : 96c73c61-0409-4a2d-ba5f-256b4852c35c.jpeg
         * registerNum : 都会好的很多
         * legalMan : 等会等会
         * adminCard : null
         * authentication : null
         * submitUserid : 1309
         * status : 0
         * reason : null
         * createTime : 2021-04-09T15:06:28
         * applyTime : 2021-04-09T15:06:28
         * updateTime : 2021-04-09T15:06:28
         */
        var id = 0
        var companyName: String? = null
        var companyId = 0
        var idcard: Any? = null
        var businessLicense: String? = null
        var registerNum: String? = null
        var legalMan: String? = null
        var adminCard: Any? = null
        var authentication: Any? = null
        var submitUserid = 0
        var status = 0
        var reason: Any? = null
        var createTime: String? = null
        var applyTime: String? = null
        var updateTime: String? = null
    }
}