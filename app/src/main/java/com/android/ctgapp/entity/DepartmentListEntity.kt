package com.android.ctgapp.entity

class DepartmentListEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":3,"parentId":null,"name":"开发部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":4,"parentId":null,"name":"业务部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":5,"parentId":null,"name":"财务部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":6,"parentId":null,"name":"运营部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 3
         * parentId : null
         * name : 开发部
         * companyId : null
         * isDeleted : null
         * createTime : null
         * updateTime : null
         */
        var id = 0
        var parentId: Any? = null
        var name: String? = null
        var companyId: Any? = null
        var isDeleted: Any? = null
        var createTime: Any? = null
        var updateTime: Any? = null
        var isSelect: Boolean = false
    }
}