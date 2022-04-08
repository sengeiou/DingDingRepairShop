package com.android.ctgapp.entity.mine

class WhitePayResultEntity {
    /**
     * status : 0
     * msg : null
     * data : {"repayOrderNo":"HK20210609162233240CRRQ006","orderInfo":"{\"package\":\"Sign=WXPay\",\"appid\":\"wx635283d6cec45ac9\",\"sign\":\"D515AFFB052512DD8A918AC3A131BD96\",\"partnerid\":\"1545788671\",\"prepayid\":\"wx0916223362568732f073c5768f2bbf0000\",\"noncestr\":\"1623226953723\",\"timestamp\":\"1623226953\"}"}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * repayOrderNo : HK20210609162233240CRRQ006
         * orderInfo : {"package":"Sign=WXPay","appid":"wx635283d6cec45ac9","sign":"D515AFFB052512DD8A918AC3A131BD96","partnerid":"1545788671","prepayid":"wx0916223362568732f073c5768f2bbf0000","noncestr":"1623226953723","timestamp":"1623226953"}
         */
        var repayOrderNo: String? = null
        var orderInfo: String? = null
    }
}