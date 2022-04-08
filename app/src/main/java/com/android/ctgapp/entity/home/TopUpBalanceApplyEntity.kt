package com.android.ctgapp.entity.home

class TopUpBalanceApplyEntity {
    /**
     * status : 0
     * msg : null
     * data : {"cashDetailId":"ed7f813497e8458a9b22086dc4e930f7","cashPoolId":null,"cashChangeNo":"CZ_20201228205341758C1AO028","cashChangeCompanyId":null,"changgePersonId":1309,"cashChangeBefore":null,"cashChange":1000,"cashChangeAfter":null,"changeTime":null,"cashChangeCategory":1,"rechargeType":2,"cashChangeDesc":null,"serialNo":null,"myCompanyId":65551,"allianceId":888897621,"orderInfo":"alipay_sdk=alipay-sdk-java-dynamicVersionNo&app_id=2021001198692705&biz_content=%7B%22body%22%3A%2265551%22%2C%22out_trade_no%22%3A%22CZ_20201228205341758C1AO028%22%2C%22passback_params%22%3A%22callback+params%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22subject%22%3A%22App%E6%94%AF%E4%BB%98%E6%B5%8B%E8%AF%95-By+Javen%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A%221000%22%7D&charset=UTF-8&format=json&method=alipay.trade.app.pay&notify_url=https%3A%2F%2Ftest.apis.ctgoe.com%2FfinanceServiceV2%2FaliPay%2FpayNotify&sign=Z%2F5V39pQHK2EwX2s6LjV7aZoA7o9GgJDsl4WZMu9Gckf8M799cq5clCJPQK50tIDG1VkMLTaroYHjNSeZim2wvTa%2ByQo%2FQA8Awv89MIpImc8VNQgMKfsLB23SNW1OS0Xfg%2B2f71My7Rm8Z3n4gpKrP3zu5DqSPy1ARR3KKsHvod0nFk9gu6mb9jLVEcNhjQ6MZHTfH445m3yGtJEwpalIM0zjgwGuVo2Jnt8eYzW%2BakrdSrDVXFkm06kYrJ0Sa97hdhZYXAgu%2FTHDewxmMrfdkfh6%2FUD0y2URhNfDpCmoKDAPr2G2yqd8aeyUdbBPPq5rcWe96w5ZHjPqDAiXWuqPw%3D%3D&sign_type=RSA2&timestamp=2020-12-28+20%3A53%3A41&version=1.0"}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * cashDetailId : ed7f813497e8458a9b22086dc4e930f7
         * cashPoolId : null
         * cashChangeNo : CZ_20201228205341758C1AO028
         * cashChangeCompanyId : null
         * changgePersonId : 1309
         * cashChangeBefore : null
         * cashChange : 1000
         * cashChangeAfter : null
         * changeTime : null
         * cashChangeCategory : 1
         * rechargeType : 2
         * cashChangeDesc : null
         * serialNo : null
         * myCompanyId : 65551
         * allianceId : 888897621
         * orderInfo : alipay_sdk=alipay-sdk-java-dynamicVersionNo&app_id=2021001198692705&biz_content=%7B%22body%22%3A%2265551%22%2C%22out_trade_no%22%3A%22CZ_20201228205341758C1AO028%22%2C%22passback_params%22%3A%22callback+params%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22subject%22%3A%22App%E6%94%AF%E4%BB%98%E6%B5%8B%E8%AF%95-By+Javen%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A%221000%22%7D&charset=UTF-8&format=json&method=alipay.trade.app.pay&notify_url=https%3A%2F%2Ftest.apis.ctgoe.com%2FfinanceServiceV2%2FaliPay%2FpayNotify&sign=Z%2F5V39pQHK2EwX2s6LjV7aZoA7o9GgJDsl4WZMu9Gckf8M799cq5clCJPQK50tIDG1VkMLTaroYHjNSeZim2wvTa%2ByQo%2FQA8Awv89MIpImc8VNQgMKfsLB23SNW1OS0Xfg%2B2f71My7Rm8Z3n4gpKrP3zu5DqSPy1ARR3KKsHvod0nFk9gu6mb9jLVEcNhjQ6MZHTfH445m3yGtJEwpalIM0zjgwGuVo2Jnt8eYzW%2BakrdSrDVXFkm06kYrJ0Sa97hdhZYXAgu%2FTHDewxmMrfdkfh6%2FUD0y2URhNfDpCmoKDAPr2G2yqd8aeyUdbBPPq5rcWe96w5ZHjPqDAiXWuqPw%3D%3D&sign_type=RSA2&timestamp=2020-12-28+20%3A53%3A41&version=1.0
         */
        var cashDetailId: String? = null
        var cashPoolId: Any? = null
        var cashChangeNo: String? = null
        var cashChangeCompanyId: Any? = null
        var changgePersonId = 0
        var cashChangeBefore: Any? = null
        var cashChange = 0.0
        var cashChangeAfter: Any? = null
        var changeTime: Any? = null
        var cashChangeCategory = 0
        var rechargeType = 0
        var cashChangeDesc: Any? = null
        var serialNo: Any? = null
        var myCompanyId = 0
        var allianceId = 0
        var orderInfo: String? = null
    }
}