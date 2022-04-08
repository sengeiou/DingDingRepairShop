package com.android.ctgapp.entity.mine

class VisitorListEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":20,"visitorId":593,"visitorName":"黄方健三号","userId":1457,"visitDate":"2021-03-25","visitTime":"2021-03-25T15:13:46","visitResource":0},{"id":8,"visitorId":1309,"visitorName":" 小黄","userId":1457,"visitDate":"2021-03-25","visitTime":"2021-03-25T10:54:14","visitResource":0}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 20
         * visitorId : 593
         * visitorName : 黄方健三号
         * userId : 1457
         * visitDate : 2021-03-25
         * visitTime : 2021-03-25T15:13:46
         * visitResource : 0
         */
        var id = 0
        var visitorId = 0
        var visitorName: String? = null
        var visitorFrom: String? = null
        var userId = 0
        var visitDate: String? = null
        var visitTime: String? = null
        var visitorImageUrl: String? = null
        var visitorDefaultCompanyName: String? = null
        var visitResource = 0
    }
}