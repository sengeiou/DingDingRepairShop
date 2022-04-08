package com.android.ctgapp.entity.mine

import com.android.ctgapp.entity.ListChildBean

class WhiteBarDetailEntity {
    /**
     * status : 0
     * msg : null
     * data : {"billNo":"TZD123","lastDay":"2021/04/20","billCycle":"2021-04","invoiceType":0,"totalMoney":2050,"returnMoney":0,"list":[{"returnType":0,"totalMoney":2050,"noPayMoney":2050,"returnMoney":0,"invoiceType":null,"orgName":"无锡畅通汽配公司","companyId":12345,"num":9}]}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * billNo : TZD123
         * lastDay : 2021/04/20
         * billCycle : 2021-04
         * invoiceType : 0
         * totalMoney : 2050.0
         * returnMoney : 0.0
         * list : [{"returnType":0,"totalMoney":2050,"noPayMoney":2050,"returnMoney":0,"invoiceType":null,"orgName":"无锡畅通汽配公司","companyId":12345,"num":9}]
         */
        var billNo: String? = null
        var lastDay: String? = null
        var billCycle: String? = null
        var invoiceType = 0
        var totalMoney = 0.0
        var returnMoney = 0.0
        var list: List<ListBean>? = null

        class ListBean {
            /**
             * returnType : 0
             * totalMoney : 2050.0
             * noPayMoney : 2050.0
             * returnMoney : 0.0
             * invoiceType : null
             * orgName : 无锡畅通汽配公司
             * companyId : 12345
             * num : 9
             */
            var returnType = 0
            var totalMoney = 0.0
            var noPayMoney = 0.0
            var returnMoney = 0.0
            var invoiceType: Any? = null
            var orgName: String? = null
            var companyId = 0
            var num = 0
            var billNum = ""

            //选中状态
            var selected = false
            var list: List<ListChildBean>? = null
        }
    }
}