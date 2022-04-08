package com.android.ctgapp.entity.home.enquire

import java.io.Serializable

class EpcDetailEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"amount":"001","sign":"1","orderStatus":"1","remark":"","ctgnum":"1107200","oe":"16400RLHH01","oenamecn":"电子控制单元 ","ctgname":"节气门总成","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"001","sign":"2","orderStatus":"1","remark":"","ctgnum":"","oe":"16430RTAJ01","oenamecn":"节气门下壳体 ","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"001","sign":"3","orderStatus":"1","remark":"","ctgnum":"","oe":"16431RTAJ01","oenamecn":"下壳体垫片 ","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"001","sign":"4","orderStatus":"1","remark":"","ctgnum":"","oe":"32745R40A00","oenamecn":"发动机线束支架","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"004","sign":"5","orderStatus":"1","remark":"","ctgnum":"","oe":"934010806508","oenamecn":"螺栓垫圈","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"004","sign":"6","orderStatus":"1","remark":"","ctgnum":"","oe":"938920401208","oenamecn":"螺钉 ","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"001","sign":"7","orderStatus":"1","remark":"","ctgnum":"","oe":"957010601408","oenamecn":"法兰螺栓 6X14","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null}]
     * success : true
     */
    var status: Int? = null
    var msg: Any? = null
    var isSuccess: Boolean? = null
    var data: List<DataBean>? = null

    class DataBean : Serializable {
        /**
         * amount : 001
         * sign : 1
         * orderStatus : 1
         * remark :
         * ctgnum : 1107200
         * oe : 16400RLHH01
         * oenamecn : 电子控制单元
         * ctgname : 节气门总成
         * categoryId : E__0100
         * image : http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG
         * model :
         * price : null
         */
        var amount: String? = null
        var sign: String? = null
        var orderStatus: String? = null
        var remark: String? = null
        var ctgnum: String? = null
        var oe: String? = null
//        var oenamecn: String? = null
        var des: String? = null

        var ctgname: String? = null
        var categoryId: String? = null
        var image: String? = null
        var model: String? = null
        var price: Any? = null
        var select=false




    }



}