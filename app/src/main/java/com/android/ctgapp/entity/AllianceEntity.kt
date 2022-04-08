package com.android.ctgapp.entity

class AllianceEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"allianceId":888897621,"orgname":"A车配联盟","phone":null,"address":null,"logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","isAdd":null}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * allianceId : 888897621
         * orgname : A车配联盟
         * phone : null
         * address : null
         * logo : fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg
         * isAdd : null
         */
        var allianceId = 0
        var orgname: String? = null
        var phone: Any? = null
        var address: Any? = null
        var logo: String? = null
        var isAdded: Boolean = false

        //0:等待审核 1:审核通过 2:审核不通过（拒绝）
        var auditStatus: Int = -1
        var allianceType = ""
    }
}