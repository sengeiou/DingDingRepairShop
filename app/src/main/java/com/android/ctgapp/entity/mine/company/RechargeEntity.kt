package com.android.ctgapp.entity.mine.company

import com.android.ctgapp.entity.ListChildBean

class RechargeEntity {
    /**
     * status : 0
     * msg : null
     * "data":[{"platformClientName":null,"platformClientId":366,"amount":99.00,"rechargeAmount":0.00,"total":99.00,"voucherNum":1,"voucherList":null},{"platformClientName":null,"platformClientId":651,"amount":200.00,"rechargeAmount":10.00,"total":210.00,"voucherNum":0,"voucherList":null}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {


        /**
        "platformClientName":null,
        "platformClientId":366,
        "amount":99,
        "rechargeAmount":0,
        "total":99,
        "voucherNum":1,
        "voucherList":null
         */
        var fromCompanyId: String? = null
        var fromCompanyName: Any? = null
        var platformClientId:String? = null
        var amount: Any? = null
        var rechargeAmount: Any? = null
        var total:String? = null
        var voucherNum=0
        var activityList:List<activityListBean>?=null
        class activityListBean {
            var id=0
            var companyId=""
            var activityName=""
            var amount=0
            var bonusAmount=0
            var voucherId:String?=null
            var startDate:String?=null
            var endDate:String?=null
            var activityStatus=0
            var remark:String?=null
            var createTime:String?=null
            var createUserId:String?=null
            var updateTime:String?=null
            var updateUserId=0
            var isDeleted=0
        }
    }

}