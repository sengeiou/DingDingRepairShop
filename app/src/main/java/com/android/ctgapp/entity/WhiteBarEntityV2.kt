package com.android.ctgapp.entity

class WhiteBarEntityV2 {
    /**
     * status : 0
     * msg : null
     * data : {"noPayMoney":2050,"list":[{"time":"2021-04","list":[{"ctgBillId":null,"returnType":0,"totalMoney":2050,"noPayMoney":2050,"returnMoney":0,"billNo":"TZD123","invoiceType":0,"lastDay":"2021-04-20"}]}]}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * noPayMoney : 2050.0
         * list : [{"time":"2021-04","list":[{"ctgBillId":null,"returnType":0,"totalMoney":2050,"noPayMoney":2050,"returnMoney":0,"billNo":"TZD123","invoiceType":0,"lastDay":"2021-04-20"}]}]
         */
        var noPayMoney = 0.0
        var nobillMoney = ""
        var list: List<ListBeanX>? = null

        class ListBeanX {
            /**
             * time : 2021-04
             * list : [{"ctgBillId":null,"returnType":0,"totalMoney":2050,"noPayMoney":2050,"returnMoney":0,"billNo":"TZD123","invoiceType":0,"lastDay":"2021-04-20"}]
             */
            var time: String? = null
            var list: List<ListBean>? = null


            class ListBean {
                //选中状态
                var selected = false

                /**
                 * ctgBillId : null
                 * returnType : 0
                 * totalMoney : 2050.0
                 * noPayMoney : 2050.0
                 * returnMoney : 0.0
                 * billNo : TZD123
                 * invoiceType : 0
                 * lastDay : 2021-04-20
                 */
                var ctgBillId: Any? = null
                var returnType = 0
                var totalMoney = 0.0
                var noPayMoney = 0.0
                var returnMoney = 0.0
                var billNo: String? = null
                var invoiceType = 0
                var lastDay: String? = null
                var list: ArrayList<ListChildBean>? = null
            }


        }
    }
}

class ListChildBean {
    val orderNo = ""
    val noPayMoney = ""
}