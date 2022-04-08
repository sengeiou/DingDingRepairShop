package com.android.ctgapp.entity

/**
 * 作者:LiBW
 * 创建日期: 12/28/20
 * 描述: 未添加的对外联系人
 */
class ContactUnAddEntity {
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"id":null,"companyId":null,"userId":18,"linkmanName":"黄佳","linkmanTel":"13631364803","createTime":null,"updateTime":null,"imageUrl":"03a7047f-fc33-47eb-814f-31043c78d478.png","linkmanRemark":null},{"id":null,"companyId":null,"userId":1226,"linkmanName":"超神","linkmanTel":"17327288269","createTime":null,"updateTime":null,"imageUrl":"7558c08e-7b33-4616-8253-9477b2a64adc.png","linkmanRemark":null},{"id":null,"companyId":null,"userId":1309,"linkmanName":" 112123","linkmanTel":"18312345678","createTime":null,"updateTime":null,"imageUrl":"998de99d-7059-45f8-8c7e-4b36b1f7ebd6.png","linkmanRemark":null},{"id":null,"companyId":null,"userId":1432,"linkmanName":"花枝乱颤","linkmanTel":"13333333333","createTime":null,"updateTime":null,"imageUrl":null,"linkmanRemark":null},{"id":null,"companyId":null,"userId":1531,"linkmanName":"阿温","linkmanTel":"13373655566","createTime":null,"updateTime":null,"imageUrl":null,"linkmanRemark":null}],"total":5,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * records : [{"id":null,"companyId":null,"userId":18,"linkmanName":"黄佳","linkmanTel":"13631364803","createTime":null,"updateTime":null,"imageUrl":"03a7047f-fc33-47eb-814f-31043c78d478.png","linkmanRemark":null},{"id":null,"companyId":null,"userId":1226,"linkmanName":"超神","linkmanTel":"17327288269","createTime":null,"updateTime":null,"imageUrl":"7558c08e-7b33-4616-8253-9477b2a64adc.png","linkmanRemark":null},{"id":null,"companyId":null,"userId":1309,"linkmanName":" 112123","linkmanTel":"18312345678","createTime":null,"updateTime":null,"imageUrl":"998de99d-7059-45f8-8c7e-4b36b1f7ebd6.png","linkmanRemark":null},{"id":null,"companyId":null,"userId":1432,"linkmanName":"花枝乱颤","linkmanTel":"13333333333","createTime":null,"updateTime":null,"imageUrl":null,"linkmanRemark":null},{"id":null,"companyId":null,"userId":1531,"linkmanName":"阿温","linkmanTel":"13373655566","createTime":null,"updateTime":null,"imageUrl":null,"linkmanRemark":null}]
         * total : 5
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
             * id : null
             * companyId : null
             * userId : 18
             * linkmanName : 黄佳
             * linkmanTel : 13631364803
             * createTime : null
             * updateTime : null
             * imageUrl : 03a7047f-fc33-47eb-814f-31043c78d478.png
             * linkmanRemark : null
             */
            var id: Any? = null
            var companyId: Any? = null
            var userId = 0
            var linkmanName: String? = null
            var linkmanTel: String? = null
            var createTime: Any? = null
            var updateTime: Any? = null
            var imageUrl: String? = null
            var linkmanRemark: Any? = null
        }
    }
}