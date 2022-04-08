package com.android.ctgapp.entity.mine

class LabelEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":4517,"groupLabelId":1299,"labelName":"经理","createTime":"2019-05-28T12:54:49","updateTime":"2019-05-28T12:54:49"},{"id":4518,"groupLabelId":1299,"labelName":"业务员","createTime":"2019-05-28T12:54:49","updateTime":"2019-05-28T12:54:49"},{"id":4519,"groupLabelId":1299,"labelName":"会计","createTime":"2019-05-28T12:54:49","updateTime":"2019-05-28T12:54:49"},{"id":4520,"groupLabelId":1299,"labelName":"司机","createTime":"2019-05-28T12:54:49","updateTime":"2019-05-28T12:54:49"},{"id":4521,"groupLabelId":1299,"labelName":"修理工","createTime":"2019-05-28T12:54:49","updateTime":"2019-05-28T12:54:49"},{"id":31970,"groupLabelId":1299,"labelName":"研发部","createTime":"2021-01-04T16:19:22","updateTime":"2021-01-04T16:19:22"},{"id":31971,"groupLabelId":1299,"labelName":"研发部","createTime":"2021-01-04T16:22:04","updateTime":"2021-01-04T16:22:03"},{"id":31972,"groupLabelId":1299,"labelName":"研发部1","createTime":"2021-01-04T16:23:30","updateTime":"2021-01-04T16:23:29"},{"id":31973,"groupLabelId":1299,"labelName":"研发2","createTime":"2021-01-04T16:26:01","updateTime":"2021-01-04T16:26:01"},{"id":31974,"groupLabelId":1299,"labelName":"123","createTime":"2021-01-04T16:38:48","updateTime":"2021-01-04T16:38:48"},{"id":31975,"groupLabelId":1299,"labelName":"1234","createTime":"2021-01-04T16:39:39","updateTime":"2021-01-04T16:39:38"},{"id":31976,"groupLabelId":1299,"labelName":"1234758","createTime":"2021-01-04T16:42:07","updateTime":"2021-01-04T16:42:06"},{"id":31982,"groupLabelId":1299,"labelName":"老司机","createTime":"2021-01-07T12:55:48","updateTime":"2021-01-07T12:55:48"},{"id":31993,"groupLabelId":1299,"labelName":"456","createTime":"2021-01-07T17:20:01","updateTime":"2021-01-07T17:20:00"},{"id":31994,"groupLabelId":1299,"labelName":"新职位","createTime":"2021-01-08T15:21:17","updateTime":"2021-01-08T15:21:16"},{"id":31995,"groupLabelId":1299,"labelName":"123","createTime":"2021-01-08T15:22:23","updateTime":"2021-01-08T15:22:22"},{"id":31996,"groupLabelId":1299,"labelName":"147","createTime":"2021-01-08T15:24:39","updateTime":"2021-01-08T15:24:38"}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 4517
         * groupLabelId : 1299
         * labelName : 经理
         * createTime : 2019-05-28T12:54:49
         * updateTime : 2019-05-28T12:54:49
         */
        var id = 0
        var groupLabelId = 0
        var labelName: String? = null
        var createTime: String? = null
        var updateTime: String? = null
        var isSelected:Boolean=false
    }
}