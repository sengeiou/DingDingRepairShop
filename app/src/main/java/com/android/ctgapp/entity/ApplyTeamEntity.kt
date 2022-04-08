package com.android.ctgapp.entity

class ApplyTeamEntity {
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"id":89,"applyUserId":1544,"companyId":65551,"msg":"测试4申请加入您的公司。","applyTime":"2020-12-30 15:19:59","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"测试4","applyUserTelephone":"18206195151","applyUserImageUrl":null},{"id":88,"applyUserId":1540,"companyId":65551,"msg":"123申请加入您的公司。","applyTime":"2020-12-25 12:53:23","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"123","applyUserTelephone":"89898989898","applyUserImageUrl":null},{"id":87,"applyUserId":1539,"companyId":65551,"msg":"123申请加入您的公司。","applyTime":"2020-12-25 10:23:05","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"123","applyUserTelephone":"12121212121","applyUserImageUrl":null},{"id":86,"applyUserId":1533,"companyId":65551,"msg":"注册测试1申请加入您的公司。","applyTime":"2020-12-24 15:23:47","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"注册测试1","applyUserTelephone":"18206191236","applyUserImageUrl":null},{"id":83,"applyUserId":1309,"companyId":65551,"msg":" 112123申请加入您的公司。","applyTime":"2020-12-23 17:25:33","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":" 112123","applyUserTelephone":"18312345678","applyUserImageUrl":"998de99d-7059-45f8-8c7e-4b36b1f7ebd6.png"},{"id":82,"applyUserId":1457,"companyId":65551,"msg":"啾啾申请加入您的公司。","applyTime":"2020-12-23 16:20:33","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"啾啾","applyUserTelephone":"18206198888","applyUserImageUrl":"dcdd2aa6-e07d-4af0-a195-d933b42a37db.png"}],"total":6,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * records : [{"id":89,"applyUserId":1544,"companyId":65551,"msg":"测试4申请加入您的公司。","applyTime":"2020-12-30 15:19:59","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"测试4","applyUserTelephone":"18206195151","applyUserImageUrl":null},{"id":88,"applyUserId":1540,"companyId":65551,"msg":"123申请加入您的公司。","applyTime":"2020-12-25 12:53:23","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"123","applyUserTelephone":"89898989898","applyUserImageUrl":null},{"id":87,"applyUserId":1539,"companyId":65551,"msg":"123申请加入您的公司。","applyTime":"2020-12-25 10:23:05","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"123","applyUserTelephone":"12121212121","applyUserImageUrl":null},{"id":86,"applyUserId":1533,"companyId":65551,"msg":"注册测试1申请加入您的公司。","applyTime":"2020-12-24 15:23:47","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"注册测试1","applyUserTelephone":"18206191236","applyUserImageUrl":null},{"id":83,"applyUserId":1309,"companyId":65551,"msg":" 112123申请加入您的公司。","applyTime":"2020-12-23 17:25:33","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":" 112123","applyUserTelephone":"18312345678","applyUserImageUrl":"998de99d-7059-45f8-8c7e-4b36b1f7ebd6.png"},{"id":82,"applyUserId":1457,"companyId":65551,"msg":"啾啾申请加入您的公司。","applyTime":"2020-12-23 16:20:33","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"啾啾","applyUserTelephone":"18206198888","applyUserImageUrl":"dcdd2aa6-e07d-4af0-a195-d933b42a37db.png"}]
         * total : 6
         * size : 20
         * current : 1
         * orders : []
         * optimizeCountSql : true
         * hitCount : false
         * countId : null
         * maxLimit : null
         * searchCount : true
         * pages : 1
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
             * id : 89
             * applyUserId : 1544
             * companyId : 65551
             * msg : 测试4申请加入您的公司。
             * applyTime : 2020-12-30 15:19:59
             * auditStatus : 0
             * auditorId : null
             * updateTime : null
             * orgname : 小黄维修
             * applyUserName : 测试4
             * applyUserTelephone : 18206195151
             * applyUserImageUrl : null
             */
            var id = 0
            var applyUserId = 0
            var companyId = 0
            var msg: String? = null
            var applyTime: String? = null
            var auditStatus = -1
            var auditorId: Any? = null
            var updateTime: Any? = null
            var orgname: String? = null
            var applyUserName: String? = null
            var applyUserTelephone: String? = null
            var applyUserImageUrl: Any? = null
        }
    }
}