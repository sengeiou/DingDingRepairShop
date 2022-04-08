package com.android.ctgapp.entity

class FriendGroupEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":7,"groupName":"普通朋友","createUserId":null,"createTime":null},{"id":8,"groupName":"一般朋友","createUserId":null,"createTime":null},{"id":9,"groupName":"表面朋友","createUserId":null,"createTime":null}]
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var isSuccess = false
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 7
         * groupName : 普通朋友
         * createUserId : null
         * createTime : null
         */
        var id = 0
        var groupName: String? = null
        var createUserId: Any? = null
        var createTime: Any? = null
        var isDisplay: Boolean = false
        var isSelect: Boolean = false
    }
}