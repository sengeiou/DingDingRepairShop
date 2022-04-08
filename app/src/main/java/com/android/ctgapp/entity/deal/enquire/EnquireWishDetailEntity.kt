package com.android.ctgapp.entity.deal.enquire

class EnquireWishDetailEntity {
    /**
     * status : 0
     * msg : null
     * data : {"wishListId":39,"enquiryId":290,"wishListStatus":1,"createUserid":1,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:03","updateUserid":null,"isDeleted":0,"remark":null,"totalNumber":0,"totalPrice":0,"details":[{"wishListDetailId":72,"wishListId":39,"quotationDetailId":22927,"oe":"04711SWAE00ZZ","partName":"前保险杠皮(前保险杠皮)","brand":"原厂","quality":"","price":1200,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:02","remark":null,"num":null},{"wishListDetailId":73,"wishListId":39,"quotationDetailId":22928,"oe":"04711SWAE00ZZ","partName":"前保险杠皮(前保险杠皮)","brand":"副厂","quality":"","price":600,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:02","remark":null,"num":null}],"partNames":null}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

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
         * details : [{"wishListDetailId":72,"wishListId":39,"quotationDetailId":22927,"oe":"04711SWAE00ZZ","partName":"前保险杠皮(前保险杠皮)","brand":"原厂","quality":"","price":1200,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:02","remark":null,"num":null},{"wishListDetailId":73,"wishListId":39,"quotationDetailId":22928,"oe":"04711SWAE00ZZ","partName":"前保险杠皮(前保险杠皮)","brand":"副厂","quality":"","price":600,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:02","remark":null,"num":null}]
         * partNames : null
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
        var totalPrice = 0.0
        var partNames: Any? = null
        var details: List<DetailsBean>? = null

        class DetailsBean {
            /**
             * wishListDetailId : 72
             * wishListId : 39
             * quotationDetailId : 22927
             * oe : 04711SWAE00ZZ
             * partName : 前保险杠皮(前保险杠皮)
             * brand : 原厂
             * quality :
             * price : 1200.0
             * createTime : 2021-08-03 13:44:03
             * updateTime : 2021-08-03 13:44:02
             * remark : null
             * num : null
             */
            var wishListDetailId = 0
            var wishListId = 0
            var quotationDetailId = 0
            var oe: String? = null
            var partName: String? = null
            var brand: String? = null
            var quality: String? = null
            var price = 0.0
            var createTime: String? = null
            var updateTime: String? = null
            var remark: Any? = null
            var num: Any? = null
        }
    }
}