package com.android.ctgapp.entity

class QiYeShouXinEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"companyId":1000000344,"orgName":"W企业","isAllow":true}]
     */
    var status: Int? = null
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean  {
        /**
         * companyId : 1000000344
         * orgName : W企业
         * isAllow : true
         */
        var companyId: Int? = null
        var orgName: String? = null
        var isAllow: Boolean? = null
        var amount=""

    }
}