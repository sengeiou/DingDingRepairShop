package com.android.ctgapp.entity

class UserInfoEntity {
    /**
     * status : 0
     * msg : null
     * data : {"id":1309,"defaultCompanyId":null,"defaultAllianceId":null,"telephone":"18312345678","password":null,"nickname":null,"status":null,"province":null,"city":null,"district":null,"address":null,"email":null,"sex":1,"realName":"123","imageUrl":null,"createTime":null,"updateTime":null,"registerTime":null,"ctgid":null,"isDeleted":null,"identificationStatus":"未认证"}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * id : 1309
         * defaultCompanyId : null
         * defaultAllianceId : null
         * telephone : 18312345678
         * password : null
         * nickname : null
         * status : null
         * province : null
         * city : null
         * district : null
         * address : null
         * email : null
         * sex : 1
         * realName : 123
         * imageUrl : null
         * createTime : null
         * updateTime : null
         * registerTime : null
         * ctgid : null
         * isDeleted : null
         * identificationStatus : 未认证
         */
        var id = 0
        var defaultCompanyId: Int = -1
        var defaultAllianceId: Any? = null
        var telephone: String? = null
        var password: Any? = null
        var nickname: Any? = null
        var status: Any? = null
        var province: Any? = null
        var city: Any? = null
        var district: Any? = null
        var address: Any? = null
        var email: Any? = null
        var sex = 0
        var realName: String? = null
        var imageUrl: Any? = null
        var createTime: Any? = null
        var updateTime: Any? = null
        var registerTime: Any? = null
        var ctgid: Any? = null
        var isDeleted: Any? = null
        var identificationStatus = -1
        var defaultCompanyName: String? = null
        //对外职位
        var externalPost=""
    }
}