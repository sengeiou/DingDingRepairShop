package com.android.ctgapp.entity

class AccountInfoEntityV2 {
    /**
     * status : 0
     * msg : null
     * data : {"id":null,"alipay":null,"weixin":null,"bankName":null,"bankAccount":null}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * id : null
         * alipay : null
         * weixin : null
         * bankName : null
         * bankAccount : null
         */
        var id=-1
        var alipay: Any? = null
        var weixin: Any? = null
        var bankName: Any? = null
        var bankAccount: Any? = null
    }
}