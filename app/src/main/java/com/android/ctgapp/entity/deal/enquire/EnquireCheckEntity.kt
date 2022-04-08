package com.android.ctgapp.entity.deal.enquire

class EnquireCheckEntity {
    /**
     * status : 0
     * msg : null
     * data : {"allianceId":88889905,"allianceName":"爱冒险的朵拉汽修联盟","flow":1}
     */
    var status: Int? = null
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean  {
        /**
         * allianceId : 88889905
         * allianceName : 爱冒险的朵拉汽修联盟
         * flow : 1
         */
        var allianceId: Int=-1
        var allianceName: String? = null
        var flow: Int? = null
    }
}