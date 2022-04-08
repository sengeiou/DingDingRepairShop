package com.android.ctgapp.entity

class InvoiceEntityV2 {
    /**
     * status : 0
     * msg : null
     * data : {"id":null,"licenseName":null,"licenseAddress":null,"taxpayerNum":null,"reservedTel":null,"bankName":null,"bankAccount":null}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * id : null
         * licenseName : null
         * licenseAddress : null
         * taxpayerNum : null
         * reservedTel : null
         * bankName : null
         * bankAccount : null
         */
        var id=-1
        var licenseName: Any? = null
        var licenseAddress: Any? = null
        var taxpayerNum: Any? = null
        var reservedTel: Any? = null
        var bankName: Any? = null
        var bankAccount: Any? = null
    }
}