package com.android.ctgapp.entity

class FindUserEntity {
    /**
     * status : 0
     * msg : null
     * data : {"id":1550,"defaultCompanyId":888898041,"defaultAllianceId":null,"telephone":"13373655566","password":"0c27393026fb2efff2cf9867b61c844c","nickname":null,"status":0,"province":null,"city":null,"district":null,"address":null,"email":null,"sex":3,"realName":"将计就计","imageUrl":null,"createTime":"2020-12-30 16:58:51","updateTime":"2020-12-30 16:58:51","registerTime":"2020-12-30T16:58:51","ctgid":null,"isDeleted":false,"identificationStatus":null}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * id : 1550
         * defaultCompanyId : 888898041
         * defaultAllianceId : null
         * telephone : 13373655566
         * password : 0c27393026fb2efff2cf9867b61c844c
         * nickname : null
         * status : 0
         * province : null
         * city : null
         * district : null
         * address : null
         * email : null
         * sex : 3
         * realName : 将计就计
         * imageUrl : null
         * createTime : 2020-12-30 16:58:51
         * updateTime : 2020-12-30 16:58:51
         * registerTime : 2020-12-30T16:58:51
         * ctgid : null
         * isDeleted : false
         * identificationStatus : null
         */
        var id = 0
        var defaultCompanyId = 0
        var defaultAllianceId: Any? = null
        var telephone: String? = null
        var password: String? = null
        var nickname: Any? = null
        var status = 0
        var province: Any? = null
        var city: Any? = null
        var district: Any? = null
        var address: Any? = null
        var email: Any? = null
        var sex = 0
        var realName: String? = null
        var imageUrl: Any? = null
        var createTime: String? = null
        var updateTime: String? = null
        var registerTime: String? = null
        var ctgid: Any? = null
        var isIsDeleted = false
            private set
        var identificationStatus: Any? = null

        //是否为公司管理员
        var isCompanyAdmin = false

        //是否为公司创建者
        var isCompanyCreator = false
        fun setIsDeleted(isDeleted: Boolean) {
            isIsDeleted = isDeleted
        }
    }
}