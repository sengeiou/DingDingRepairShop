package com.android.ctgapp.entity

class CompanyDetailEntity {
    /**
     * status : 0
     * msg : null
     * data : {"id":2222,"orgname":"小薛修理厂","legalman":null,"parentId":null,"shortName":null,"industry":null,"phone":"3333311","province":"江苏省","city":"无锡市","district":"梁溪区","address":"广丰路101号","invitationCode":null,"email":"56566565@qq.com","wechat":null,"logo":null,"websiteUrl":null,"isAttestation":null,"remark":null,"longitude":null,"latitude":null,"employeeScale":null,"allianceType":null,"isFinanceIndependent":null,"createTime":null,"createUserid":null,"updateTime":null,"isDeleted":null,"code":null}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * id : 2222
         * orgname : 小薛修理厂
         * legalman : null
         * parentId : null
         * shortName : null
         * industry : null
         * phone : 3333311
         * province : 江苏省
         * city : 无锡市
         * district : 梁溪区
         * address : 广丰路101号
         * invitationCode : null
         * email : 56566565@qq.com
         * wechat : null
         * logo : null
         * websiteUrl : null
         * isAttestation : null
         * remark : null
         * longitude : null
         * latitude : null
         * employeeScale : null
         * allianceType : null
         * isFinanceIndependent : null
         * createTime : null
         * createUserid : null
         * updateTime : null
         * isDeleted : null
         * code : null
         */
        var id = 0
        var orgname: String? = null
        var legalman: Any? = null
        var parentId: Any? = null
        var shortName: Any? = null
        var industry: Any? = null
        var phone: String? = null
        var province: String? = null
        var city: String? = null
        var district: String? = null
        var address: String? = null
        var invitationCode: Any? = null
        var email: String? = null
        var wechat: Any? = null
        var logo: Any? = null
        var websiteUrl: String? = null
        var isAttestation = false
        var remark: String? = null
        var longitude: Any? = null
        var latitude: Any? = null
        var employeeScale: Int = -1
        var allianceType: Any? = null
        var isFinanceIndependent: Any? = null
        var createTime: Any? = null
        var createUserid: Any? = null
        var updateTime: Any? = null
        var isDeleted: Any? = null
        var code: Any? = null
        //认证状态 0.已申请 1.认证成功 2认证失败
        var attestationStatus=-1

        //主营车系
        var carSeries: List<CarSeriesEntity.DataBean>? = null

        //维修厂等级
        var gradeName: String = ""
        var gradeId: Int? = null

        //合作保险公司
        var insuranceCompanies: List<CarSeriesEntity.DataBean>? = null
    }
}