package com.android.ctgapp.entity

class CompanyCanJoinEntity {
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"id":2222,"orgname":"小薛修理厂","legalman":"汪步东","parentId":null,"shortName":"畅运","industry":"REPAIRSHOP","phone":"13312345678","province":"江苏省","city":"无锡市","district":"梁溪区","address":"广丰路101号","invitationCode":"384170261","email":"156566565@qq.com","wechat":"2651","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","websiteUrl":"www.hqp.com","isAttestation":null,"remark":"我的公司非常哇塞 突突突突突突饿的","longitude":null,"latitude":null,"employeeScale":3,"allianceType":0,"isFinanceIndependent":true,"createTime":"2019-07-17T15:52:55","createUserid":21,"updateTime":"2020-12-19T16:57:21","isDeleted":false,"code":null,"aliPayNo":"202010BB3d72b65a56414bb4b855a3045c1afB13","weChatNo":null,"companySource":null},{"id":65551,"orgname":"小黄维修","legalman":null,"parentId":null,"shortName":null,"industry":"REPAIRSHOP","phone":"110112119","province":"天津市","city":"天津市","district":"和平区","address":null,"invitationCode":"613824570","email":null,"wechat":null,"logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","websiteUrl":null,"isAttestation":null,"remark":"哈巴\n","longitude":null,"latitude":null,"employeeScale":null,"allianceType":0,"isFinanceIndependent":true,"createTime":"2018-02-03T14:31:20","createUserid":1309,"updateTime":"2020-12-21T20:31:50","isDeleted":false,"code":null,"aliPayNo":null,"weChatNo":null,"companySource":null}],"total":275,"size":2,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":138}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * records : [{"id":2222,"orgname":"小薛修理厂","legalman":"汪步东","parentId":null,"shortName":"畅运","industry":"REPAIRSHOP","phone":"13312345678","province":"江苏省","city":"无锡市","district":"梁溪区","address":"广丰路101号","invitationCode":"384170261","email":"156566565@qq.com","wechat":"2651","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","websiteUrl":"www.hqp.com","isAttestation":null,"remark":"我的公司非常哇塞 突突突突突突饿的","longitude":null,"latitude":null,"employeeScale":3,"allianceType":0,"isFinanceIndependent":true,"createTime":"2019-07-17T15:52:55","createUserid":21,"updateTime":"2020-12-19T16:57:21","isDeleted":false,"code":null,"aliPayNo":"202010BB3d72b65a56414bb4b855a3045c1afB13","weChatNo":null,"companySource":null},{"id":65551,"orgname":"小黄维修","legalman":null,"parentId":null,"shortName":null,"industry":"REPAIRSHOP","phone":"110112119","province":"天津市","city":"天津市","district":"和平区","address":null,"invitationCode":"613824570","email":null,"wechat":null,"logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","websiteUrl":null,"isAttestation":null,"remark":"哈巴\n","longitude":null,"latitude":null,"employeeScale":null,"allianceType":0,"isFinanceIndependent":true,"createTime":"2018-02-03T14:31:20","createUserid":1309,"updateTime":"2020-12-21T20:31:50","isDeleted":false,"code":null,"aliPayNo":null,"weChatNo":null,"companySource":null}]
         * total : 275
         * size : 2
         * current : 1
         * orders : []
         * optimizeCountSql : true
         * hitCount : false
         * countId : null
         * maxLimit : null
         * searchCount : true
         * pages : 138
         */
        var total = 0
        var size = 0
        var current = 0
        var isOptimizeCountSql = false
        var isHitCount = false
        var countId: Any? = null
        var maxLimit: Any? = null
        var isSearchCount = false
        var pages = 0
        var records: List<RecordsBean>? = null
        var orders: List<*>? = null

        class RecordsBean {
            /**
             * id : 2222
             * orgname : 小薛修理厂
             * legalman : 汪步东
             * parentId : null
             * shortName : 畅运
             * industry : REPAIRSHOP
             * phone : 13312345678
             * province : 江苏省
             * city : 无锡市
             * district : 梁溪区
             * address : 广丰路101号
             * invitationCode : 384170261
             * email : 156566565@qq.com
             * wechat : 2651
             * logo : fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg
             * websiteUrl : www.hqp.com
             * isAttestation : null
             * remark : 我的公司非常哇塞 突突突突突突饿的
             * longitude : null
             * latitude : null
             * employeeScale : 3
             * allianceType : 0
             * isFinanceIndependent : true
             * createTime : 2019-07-17T15:52:55
             * createUserid : 21
             * updateTime : 2020-12-19T16:57:21
             * isDeleted : false
             * code : null
             * aliPayNo : 202010BB3d72b65a56414bb4b855a3045c1afB13
             * weChatNo : null
             * companySource : null
             */
            var id = 0
            var orgname: String? = null
            var legalman: String? = null
            var parentId: Any? = null
            var shortName: String? = null
            var industry: String? = null
            var phone: String? = null
            var province: String? = null
            var city: String? = null
            var district: String? = null
            var address: String? = null
            var invitationCode: String? = null
            var email: String? = null
            var wechat: String? = null
            var logo: String? = null
            var websiteUrl: String? = null
            var isAttestation: Any? = null
            var remark: String? = null
            var longitude: Any? = null
            var latitude: Any? = null
            var employeeScale = 0
            var allianceType = 0
            var isIsFinanceIndependent = false
                private set
            var createTime: String? = null
            var createUserid = 0
            var updateTime: String? = null
            var isIsDeleted = false
                private set
            var code: Any? = null
            var aliPayNo: String? = null
            var weChatNo: Any? = null
            var hasApply: Boolean = false
            var companySource: Any? = null
            fun setIsFinanceIndependent(isFinanceIndependent: Boolean) {
                isIsFinanceIndependent = isFinanceIndependent
            }

            fun setIsDeleted(isDeleted: Boolean) {
                isIsDeleted = isDeleted
            }
        }
    }
}