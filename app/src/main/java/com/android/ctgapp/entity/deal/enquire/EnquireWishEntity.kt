package com.android.ctgapp.entity.deal.enquire

class EnquireWishEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"wishListId":39,"enquiryId":290,"wishListStatus":1,"createUserid":1,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:03","updateUserid":null,"isDeleted":0,"remark":null,"totalNumber":0,"totalPrice":0,"details":null,"partNames":"前保险杠皮(前保险杠皮),前保险杠皮(前保险杠皮)"},{"wishListId":38,"enquiryId":290,"wishListStatus":1,"createUserid":1,"createTime":"2021-08-03 13:24:13","updateTime":"2021-08-03 13:24:13","updateUserid":null,"isDeleted":0,"remark":null,"totalNumber":0,"totalPrice":0,"details":null,"partNames":"前保险杠皮(前保险杠皮)"},{"wishListId":37,"enquiryId":290,"wishListStatus":1,"createUserid":1,"createTime":"2021-08-03 13:22:59","updateTime":"2021-08-03 13:22:59","updateUserid":null,"isDeleted":0,"remark":null,"totalNumber":0,"totalPrice":0,"details":null,"partNames":"前保险杠皮(前保险杠皮),前保险杠皮(前保险杠皮),前保险杠皮(前保险杠皮),前叶子板-左(前叶子板-左),前叶子板-左(前叶子板-左),前叶子板-右(前叶子板-右),前保险杠皮-下(前保险杠皮-下),前保险杠皮-下(前保险杠皮-下),前保险杠皮-下(前保险杠皮-下)"},{"wishListId":36,"enquiryId":290,"wishListStatus":1,"createUserid":1,"createTime":"2021-08-03 13:22:11","updateTime":"2021-08-03 13:22:11","updateUserid":null,"isDeleted":0,"remark":null,"totalNumber":0,"totalPrice":0,"details":null,"partNames":"前保险杠皮(前保险杠皮),前保险杠皮(前保险杠皮),前保险杠皮(前保险杠皮)"}]
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var isSuccess = false
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * wishListId : 39
         * enquiryId : 290
         * wishListStatus : 1
         * createUserid : 1
         * createTime : 2021-08-03 13:44:03
         * updateTime : 2021-08-03 13:44:03
         * updateUserid : null
         * isDeleted : 0
         * remark : null
         * totalNumber : 0
         * totalPrice : 0.0
         * details : null
         * partNames : 前保险杠皮(前保险杠皮),前保险杠皮(前保险杠皮)
         */
        var wishListId = 0
        var enquiryId = 0
        var wishListStatus = 0
        var createUserid = 0
        var createTime: String? = null
        var updateTime: String? = null
        var updateUserid: Any? = null
        var isDeleted = 0
        var remark: Any? = null
        var totalNumber = 0
        var totalPrice = ""
        var details: Any? = null
        var partNames: String? = null
    }
}