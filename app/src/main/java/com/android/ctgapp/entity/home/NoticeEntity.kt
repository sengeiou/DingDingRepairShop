package com.android.ctgapp.entity.home

class NoticeEntity {
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"id":1,"companyId":2222,"noticeTitle":"消息标题","noticeText":"消息内容","createPersonId":672,"createTime":"2020-10-29T14:22:00","isShow":true,"updateTime":null,"createPersonName":"潘正星"}],"total":1,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * records : [{"id":1,"companyId":2222,"noticeTitle":"消息标题","noticeText":"消息内容","createPersonId":672,"createTime":"2020-10-29T14:22:00","isShow":true,"updateTime":null,"createPersonName":"潘正星"}]
         * total : 1
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
             * id : 1
             * companyId : 2222
             * noticeTitle : 消息标题
             * noticeText : 消息内容
             * createPersonId : 672
             * createTime : 2020-10-29T14:22:00
             * isShow : true
             * updateTime : null
             * createPersonName : 潘正星
             */
            var id = 0
            var companyId = 0
            var noticeTitle: String? = null
            var noticeText: String? = null
            var createPersonId = 0
            var createTime: String? = null
            var isIsShow = false
                private set
            var updateTime: Any? = null
            var createPersonName: String? = null

            fun setIsShow(isShow: Boolean) {
                isIsShow = isShow
            }

        }
    }
}