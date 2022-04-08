package com.android.ctgapp.entity

class CompanyChangeEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":65551,"name":"小黄维修"},{"id":888897686,"name":"郑州报废机动车回收中心"},{"id":888898014,"name":"1234544"}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 65551
         * name : 小黄维修
         */
        var id = 0
        var orgname: String? = null
        var selected: Boolean = false

        //是否默认公司
        var defaultCompany: Boolean = false

        //创建者ID
        var createUserid = -1


    }
}