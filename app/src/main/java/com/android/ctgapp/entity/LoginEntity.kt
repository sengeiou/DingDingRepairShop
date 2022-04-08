package com.android.ctgapp.entity


class LoginEntity {
    /**
     * status : 0
     * msg : 登陆成功
     * data : {"userId":1309,"telephone":"18312345678","realName":"123","nickname":null,"sex":1,"status":0,"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhbGxpYW5jZUlkIjo4ODg4OTc2ODYsImF1ZCI6IkNUR19BUFAiLCJyZWFsTmFtZSI6IjEyMyIsImNvbXBhbnlJRCI6MjIyMiwiY29tcGFueU5hbWUiOiLlsI_olpvkv67nkIbljoIiLCJpc3MiOiJ3d3cuY3Rnb2UuY29tIiwiaW5kdXN0cnkiOiJSRVBBSVJTSE9QIiwiaWF0IjoxNjAyMjIzOTc4LCJ1c2VySUQiOjEzMDksInBsYXRmb3JtIjoiQ1RHX0FQUCIsInVzZXJuYW1lIjoiMTgzMTIzNDU2NzgiLCJpbmR1c3RyeUNvZGUiOiLkv67nkIbljoIifQ.7eBOdkTRQbzUQkdjrfvczG1VgCfWCeIWGpYLUIlzE48","ctgid":"F0FQQA","imageUrl":"@_@.jpg","industry":"REPAIRSHOP","industryCode":"修理厂","companyId":2222,"companyName":"小薛修理厂","allianceId":null,"allianceName":null,"allianceRole":null,"allianceType":null,"defaultCompanyId":2222,"defaultCompanyName":"小薛修理厂","companyList":null,"allianceList":null}
     * success : true
     */
    var status = 0
    var msg: String? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * userId : 1309
         * telephone : 18312345678
         * realName : 123
         * nickname : null
         * sex : 1
         * status : 0
         * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhbGxpYW5jZUlkIjo4ODg4OTc2ODYsImF1ZCI6IkNUR19BUFAiLCJyZWFsTmFtZSI6IjEyMyIsImNvbXBhbnlJRCI6MjIyMiwiY29tcGFueU5hbWUiOiLlsI_olpvkv67nkIbljoIiLCJpc3MiOiJ3d3cuY3Rnb2UuY29tIiwiaW5kdXN0cnkiOiJSRVBBSVJTSE9QIiwiaWF0IjoxNjAyMjIzOTc4LCJ1c2VySUQiOjEzMDksInBsYXRmb3JtIjoiQ1RHX0FQUCIsInVzZXJuYW1lIjoiMTgzMTIzNDU2NzgiLCJpbmR1c3RyeUNvZGUiOiLkv67nkIbljoIifQ.7eBOdkTRQbzUQkdjrfvczG1VgCfWCeIWGpYLUIlzE48
         * ctgid : F0FQQA
         * imageUrl : @_@.jpg
         * industry : REPAIRSHOP
         * industryCode : 修理厂
         * companyId : 2222
         * companyName : 小薛修理厂
         * allianceId : null
         * allianceName : null
         * allianceRole : null
         * allianceType : null
         * defaultCompanyId : 2222
         * defaultCompanyName : 小薛修理厂
         * companyList : null
         * allianceList : null
         */
        var userId = 0
        var telephone: String? = null
        var realName: String? = null
        var nickname: Any? = null
        var sex = 0
        var status = 0
        var token: String? = null
        var ctgid: String? = null
        var imageUrl: String? = null
        var industry: String? = null
        var industryCode: String? = null
        var companyId = 0
        var companyName: String? = null
        var allianceId = 0
        var allianceName: Any? = null
        var allianceRole: Any? = null
        var allianceType: Any? = null
        var defaultCompanyId = 0
        var defaultCompanyName: String? = null
        var companyList: Any? = null
        var allianceList: Any? = null
        //是否为公司管理员
        var isCompanyAdmin: Boolean=false
        //是否为公司创建者
        var isCompanyCreator: Boolean=false



    }
}