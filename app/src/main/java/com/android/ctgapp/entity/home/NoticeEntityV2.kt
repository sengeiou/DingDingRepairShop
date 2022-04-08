package com.android.ctgapp.entity.home

class NoticeEntityV2 {
    /**
     * status : 0
     * msg : null
     * data : [{"id":17,"companyId":12345,"noticeTitle":"我再测试一下","noticeText":"我再测试一下","createPersonId":1,"createTime":"2021-04-09 09:46:35","isShow":true,"updateTime":null,"industry":"AGENCY","auditStatus":1,"opinion":"可以"}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 17
         * companyId : 12345
         * noticeTitle : 我再测试一下
         * noticeText : 我再测试一下
         * createPersonId : 1
         * createTime : 2021-04-09 09:46:35
         * isShow : true
         * updateTime : null
         * industry : AGENCY
         * auditStatus : 1
         * opinion : 可以
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
        var industry: String? = null
        var auditStatus = 0
        var opinion: String? = null
        fun setIsShow(isShow: Boolean) {
            isIsShow = isShow
        }
    }
}