package com.android.ctgapp.entity

class AddressEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":7006,"isDefault":false,"province":"甘肃","city":"陇南","district":"文县","detailAddress":"啊啊啊","createTime":"2020-11-20T14:06:38","updateTime":null,"companyid":65551,"deliveryName":"周周","deliveryPhone":"13333333333"}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 7006
         * isDefault : false
         * province : 甘肃
         * city : 陇南
         * district : 文县
         * detailAddress : 啊啊啊
         * createTime : 2020-11-20T14:06:38
         * updateTime : null
         * companyid : 65551
         * deliveryName : 周周
         * deliveryPhone : 13333333333
         */
        var id = 0
        var isDefault = false
        var province: String? = null
        var city: String? = null
        var district: String? = null
        var detailAddress: String? = null
        var createTime: String? = null
        var updateTime: Any? = null
        var companyid = 0
        var deliveryName: String? = null
        var deliveryPhone: String? = null
    }
}