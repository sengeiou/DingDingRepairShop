package com.android.ctgapp.entity

class DepartmentMenusEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":3,"parentId":null,"name":"开发部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":4,"parentId":null,"name":"业务部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":5,"parentId":null,"name":"财务部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":6,"parentId":null,"name":"运营部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":7,"parentId":null,"name":"高达的制造与维修","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":8,"parentId":null,"name":"高达维修部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":9,"parentId":null,"name":"高达升级部","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":10,"parentId":null,"name":"高达修不好了","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":11,"parentId":null,"name":"可以了","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":12,"parentId":null,"name":"划水","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":13,"parentId":null,"name":"全体划水","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":14,"parentId":null,"name":"我觉得不行","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":15,"parentId":null,"name":"有趣","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":16,"parentId":null,"name":"无聊","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":17,"parentId":null,"name":"试试看吧","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":18,"parentId":null,"name":"不行哎","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":19,"parentId":null,"name":"只能进行报废了","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":20,"parentId":null,"name":"文华","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null},{"id":21,"parentId":null,"name":"有点意思","companyId":null,"isDeleted":null,"createTime":null,"updateTime":null}]
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