package com.android.ctgapp.entity.mine

class WhiteBarDetailChildEntity {
    /**
     * status : 0
     * msg : null
     * data : {"billnum":"ZD20210524091344740T40V013","list":[{"orderNo":"DD20201222121850814I68C005","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"DD20201222170220463VCH4002","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"DD202012221825586320GP8001","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"DD20201222182604526ITZ4003","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"09bf1a883e3a4e44a27b57c9269f5a43","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"DD20210421141418184Q1LK001","billMoney":950,"orderMoney":950,"billnum":null},{"orderNo":"DD20210424195826233UH6T003","billMoney":75,"orderMoney":75,"billnum":null},{"orderNo":"DD20210424195826099KYQC002","billMoney":75,"orderMoney":75,"billnum":null},{"orderNo":"DD20210426141324096Q1YE018","billMoney":950,"orderMoney":950,"billnum":null}],"retrunType":0,"type":0}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * billnum : ZD20210524091344740T40V013
         * list : [{"orderNo":"DD20201222121850814I68C005","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"DD20201222170220463VCH4002","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"DD202012221825586320GP8001","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"DD20201222182604526ITZ4003","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"09bf1a883e3a4e44a27b57c9269f5a43","billMoney":156,"orderMoney":156,"billnum":null},{"orderNo":"DD20210421141418184Q1LK001","billMoney":950,"orderMoney":950,"billnum":null},{"orderNo":"DD20210424195826233UH6T003","billMoney":75,"orderMoney":75,"billnum":null},{"orderNo":"DD20210424195826099KYQC002","billMoney":75,"orderMoney":75,"billnum":null},{"orderNo":"DD20210426141324096Q1YE018","billMoney":950,"orderMoney":950,"billnum":null}]
         * retrunType : 0
         * type : 0
         */
        var billnum: String? = null
        var retrunType = 0
        var type = 0
        var receiverConfirm=-1
        var list: List<ListBean>? = null

        class ListBean {
            /**
             * orderNo : DD20201222121850814I68C005
             * billMoney : 156.0
             * orderMoney : 156.0
             * billnum : null
             */
            var orderNo=""
            var billMoney = 0.0
            var orderMoney = 0.0
            var billnum: Any? = null
            var selected=false
            var canSelect=true
            var createTime=""
        }
    }
}