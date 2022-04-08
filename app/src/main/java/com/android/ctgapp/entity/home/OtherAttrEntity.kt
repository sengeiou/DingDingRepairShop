package com.android.ctgapp.entity.home

import java.io.Serializable

class OtherAttrEntity :Serializable{
    /**
     * status : 0
     * msg : null
     * data : [{"name":"胎面宽","id":"attr1","list":["205","215","225","235","245","255","265","275","285","295","305","315","325","345","165","175","185","195","135","405","145","155"]},{"name":"扁平比","id":"attr2","list":["25","30","35","40","45","50","55","60","65","70","75","80","85","90","95"]},{"name":"尺寸","id":"attr2","list":["15","16","17","18","19","20","21","22","23","24","25","26","12","13","14"]},{"name":"载重指数","id":"attr2","list":["88","89","90","91","92","93","94","95","96","97","98","99","100","101","102","103","104","105","106","107","108","109","110","111","112","113","114","115","116","117","118","119","120","121","122","123","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","86","87"]},{"name":"载重指数","id":"attr2","list":["S","S/T","T","T/H","U","V","V/H","W"]},{"name":"是否防爆","id":"attr2","list":["防爆，非防爆"]}]
     * success : true
     */
    var status: Int? = null
    var msg: Any? = null
    var isSuccess: Boolean? = null
    var data: ArrayList<DataBean>? = null

    class DataBean  :Serializable{
        /**
         * name : 胎面宽
         * id : attr1
         * list : ["205","215","225","235","245","255","265","275","285","295","305","315","325","345","165","175","185","195","135","405","145","155"]
         */
        var name = ""
        var id = ""
        var list: List<String>? = null
        var selectList:List<SelectBean>?=null
        var select=false

        class SelectBean :Serializable{
            var select=false
            var name=""
        }
    }




}