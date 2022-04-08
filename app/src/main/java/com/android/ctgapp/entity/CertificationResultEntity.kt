package com.android.ctgapp.entity

class CertificationResultEntity {
    /**
     * status : 0
     * msg : null
     * data : {"id":1,"userId":1309,"realName":"老虎","idcardNum":"230777777777777777","aimage":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","bimage":"af1ca2e9-6e28-471d-940e-bb64e26ab4ae.jpeg","status":0,"reason":null,"createTime":"2020-12-19T16:54:40","updateTime":"2020-12-19T16:56:47"}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * id : 1
         * userId : 1309
         * realName : 老虎
         * idcardNum : 230777777777777777
         * aimage : fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg
         * bimage : af1ca2e9-6e28-471d-940e-bb64e26ab4ae.jpeg
         * status : 0
         * reason : null
         * createTime : 2020-12-19T16:54:40
         * updateTime : 2020-12-19T16:56:47
         */
        var id = 0
        var userId = 0
        var realName: String? = null
        var idcardNum: String? = null
        var aimage: String? = null
        var bimage: String? = null
        var status = 0
        var reason: Any? = null
        var createTime: String? = null
        var updateTime: String? = null
    }
}