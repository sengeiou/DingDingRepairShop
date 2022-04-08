package com.android.ctgapp.entity.deal

class CanRefundEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"orderDetailId":"30c6c35244b04b9f87d4120abfadf5d1","orderNo":"DD20201121170954943OEW1003","goodsAmount":1,"goodsPrice":14,"goodsName":"1231313","goodsNo":"121211211333","partName":null,"partOe":"","spec":"","brand":null},{"orderDetailId":"7d3a6890459a46aba0285567ec6ba17a","orderNo":"DD20201121170954943OEW1003","goodsAmount":1,"goodsPrice":10,"goodsName":"fgj56urtyu","goodsNo":"dfsg563","partName":null,"partOe":"","spec":"","brand":null},{"orderDetailId":"fb408e32421a47fca1fce60f079c4c13","orderNo":"DD20201121170954943OEW1003","goodsAmount":1,"goodsPrice":10,"goodsName":"44444444","goodsNo":"33322111","partName":null,"partOe":"","spec":"","brand":null},{"orderDetailId":"fc7cb6549fa24b749aa3f85c1761f36b","orderNo":"DD20201121170954943OEW1003","goodsAmount":1,"goodsPrice":122,"goodsName":"12311313","goodsNo":"uue8qw23132d","partName":null,"partOe":"","spec":"","brand":null}]
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var isSuccess = false
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * orderDetailId : 30c6c35244b04b9f87d4120abfadf5d1
         * orderNo : DD20201121170954943OEW1003
         * goodsAmount : 1
         * goodsPrice : 14.0
         * goodsName : 1231313
         * goodsNo : 121211211333
         * partName : null
         * partOe :
         * spec :
         * brand : null
         */
        var orderDetailId: String? = null
        var orderNo: String? = null
        var goodsAmount = 0
        var goodsPrice = 0.0
        var goodsName: String? = null
        var goodsNo: String? = null
        var partName: Any? = null
        var partOe: String? = null
        var spec: String? = null
        var goodsImg: String? = null
        var brand: Any? = null
        //是否选中可退货的商品
        var afterSaleSelect=false

    }
}