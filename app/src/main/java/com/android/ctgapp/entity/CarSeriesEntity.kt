package com.android.ctgapp.entity

class CarSeriesEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":355,"name":"国产车"},{"id":356,"name":"德系车"},{"id":353,"name":"日系车"},{"id":354,"name":"法系车"}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 355
         * name : 国产车
         */
        var id = 0
        var name: String? = null
        var select=false
    }
}