package com.android.ctgapp.entity.home

class RegisterEntity {
    /**
     * status : 0
     * msg : 账号注册成功
     * data : {"userId":1509,"companyId":null}
     */
    var status = 0
    var msg: String? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * userId : 1509
         * companyId : null
         */
        var userId = 0
        var companyId: Any? = null
    }
}