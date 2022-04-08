package com.android.ctgapp.entity.home

import android.os.Parcelable
import java.io.Serializable


class BatchAddPartChildEntity:Serializable {
    /**
     * status : 0
     * msg : null
     * data : [{"amount":"002","sign":"1","orderStatus":"1","remark":"","ctgnum":"4100701","oe":"33165S5A003","oenamecn":"雾灯灯泡 ","ctgname":"前大灯近光灯泡","categoryId":"B__0810","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0810.PNG","price":"0"},{"amount":"003","sign":"2","orderStatus":"1","remark":"","ctgnum":"4101091","oe":"33303SL4003","oenamecn":"灯泡 ","ctgname":"灯泡底座","categoryId":"B__0900","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0900.PNG","price":"12.00"},{"amount":"002","sign":"3","orderStatus":"1","remark":"","ctgnum":"4100501","oe":"33115S84A01","oenamecn":"大灯灯泡 ","ctgname":"前大灯灯泡","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"0"},{"amount":"001","sign":"3","orderStatus":"1","remark":"","ctgnum":"4101091","oe":"33303SL4003","oenamecn":"灯泡 ","ctgname":"灯泡底座","categoryId":"B__0900","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0900.PNG","price":"12.00"},{"amount":"002","sign":"3","orderStatus":"1","remark":"","ctgnum":"4100501","oe":"33115S84A11","oenamecn":"大灯灯泡 ","ctgname":"前大灯灯泡","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"42.12"},{"amount":"002","sign":"4","orderStatus":"1","remark":"","ctgnum":"4101091","oe":"33303S2R003","oenamecn":"灯泡 ","ctgname":"灯泡底座","categoryId":"B__0900","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0900.PNG","price":"25.00"},{"amount":"002","sign":"4","orderStatus":"1","remark":"","ctgnum":"4101701","oe":"33121SFE901","oenamecn":"密封垫 ","ctgname":"前大灯密封圈","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"8.00"},{"amount":"002","sign":"5","orderStatus":"1","remark":"","ctgnum":"4101701","oe":"33121SJDJ01","oenamecn":"盖子 ","ctgname":"前大灯密封圈","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"53.02"},{"amount":"002","sign":"6","orderStatus":"1","remark":"","ctgnum":"4101701","oe":"33121SWAJ01","oenamecn":"盖子 ","ctgname":"前大灯密封圈","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"53.02"},{"amount":"001","sign":"7","orderStatus":"1","remark":"","ctgnum":"4101603","oe":"04611SWAA00ZZ","oenamecn":"左前大灯框架","ctgname":"前大灯框-左","categoryId":"B__4900","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__4900.PNG","price":"564.47"},{"amount":"002","sign":"7","orderStatus":"1","remark":"","ctgnum":"4101701","oe":"33124SJDJ01","oenamecn":"密封条 ","ctgname":"前大灯密封圈","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"47.01"},{"amount":"002","sign":"8","orderStatus":"1","remark":"","ctgnum":"4101301","oe":"33130SJKJ01","oenamecn":"大灯可调装置 ","ctgname":"前大灯调节传感器","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"261.00"},{"amount":"001","sign":"9","orderStatus":"1","remark":"","ctgnum":"4100603","oe":"33151SWNH01","oenamecn":"左前大灯","ctgname":"前大灯半总成-左","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"1472.74"},{"amount":"002","sign":"11","orderStatus":"1","remark":"","ctgnum":"4101091","oe":"33303SAA003","oenamecn":"插座 ","ctgname":"灯泡底座","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"0"},{"amount":"002","sign":"12","orderStatus":"1","remark":"","ctgnum":"4101091","oe":"33303S2R003","oenamecn":"灯泡 ","ctgname":"灯泡底座","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"25.00"},{"amount":"002","sign":"13","orderStatus":"1","remark":"","ctgnum":"4101091","oe":"33513S84A01","oenamecn":"右后尾灯插座 ","ctgname":"灯泡底座","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"0"},{"amount":"002","sign":"14","orderStatus":"1","remark":"","ctgnum":"4100501","oe":"34901SZ3000","oenamecn":"大灯灯泡 ","ctgname":"前大灯灯泡","categoryId":"B__0800","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0800.PNG","price":"58.50"},{"amount":"001","sign":"16","orderStatus":"1","remark":"","ctgnum":"4101803","oe":"71190SWA000","oenamecn":"左前保险杠上横梁","ctgname":"前大灯安装支架-左","categoryId":"B__4600","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__4600.PNG","price":"92.43"}]
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var isSuccess = false
    var data: ArrayList<DataBean>? = null

    class DataBean :Serializable{
        /**
         * amount : 002
         * sign : 1
         * orderStatus : 1
         * remark :
         * ctgnum : 4100701
         * oe : 33165S5A003
         * oenamecn : 雾灯灯泡
         * ctgname : 前大灯近光灯泡
         * categoryId : B__0810
         * image : http://image.ctgoe.com/stw/epc/honda/2007/19SWE7B1/B__0810.PNG
         * price : 0
         */
        var amount: String? = null
        var sign: String? = null
        var orderStatus: String? = null
        var remark: String? = null
        var ctgnum: String? = null
        var oe: String? = null
        var oenamecn: String? = null
        var ctgname = ""
        var categoryId: String? = null
        var image: String? = null
        var price: String? = null

        //标记位置
        var parentCategoryIdFlag = ""
        var parentPartName = ""

        //不知道选啥就选我
        var unKnowPart = false

        //购买数量
        var buyCount = 1
        //选中状态
        var select = false
    }
}