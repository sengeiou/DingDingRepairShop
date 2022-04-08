package com.android.ctgapp.entity

class RangeEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":1,"rangeName":"啊啊","rangeCode":"AA","createTime":null,"updateTime":null},{"id":2,"rangeName":"是啥","rangeCode":"ss","createTime":null,"updateTime":null}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 1
         * rangeName : 啊啊
         * rangeCode : AA
         * createTime : null
         * updateTime : null
         */
        var id = 0
        var rangeName: String? = null
        var rangeCode: String? = null
        var createTime: Any? = null
        var updateTime: Any? = null

    }
}