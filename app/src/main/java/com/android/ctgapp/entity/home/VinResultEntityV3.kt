package com.android.ctgapp.entity.home

import java.io.Serializable

class VinResultEntityV3 {
    /**
     * status : 0
     * msg : null
     * data : {"brand":"本田","factory":"东风本田","series":"CR-V","groups":"","model":"CR-V","sales":"2.4 自动 VTi 豪华版","year":"2007","chassis":"RE4","body":"SUV","engine":"K24Z1","trans":"自动变速器(AT)","transnum":"5","displacement":"2.4","drive":"前置四驱","logo":"http://image.ctgoe.com/stw/epcbrandlogo/honda.png","img":"http://image.ctgoe.com/stw/carimg/dongfengbentiancrv_2007.jpg","carid":"9bd11509-282c-4ada-9b56-187def9480e7","option":"","epc":"HONDA","ctggroupSupport":true,"selection":"","expensive":0}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * brand : 本田
         * factory : 东风本田
         * series : CR-V
         * groups :
         * model : CR-V
         * sales : 2.4 自动 VTi 豪华版
         * year : 2007
         * chassis : RE4
         * body : SUV
         * engine : K24Z1
         * trans : 自动变速器(AT)
         * transnum : 5
         * displacement : 2.4
         * drive : 前置四驱
         * logo : http://image.ctgoe.com/stw/epcbrandlogo/honda.png
         * img : http://image.ctgoe.com/stw/carimg/dongfengbentiancrv_2007.jpg
         * carid : 9bd11509-282c-4ada-9b56-187def9480e7
         * option :
         * epc : HONDA
         * ctggroupSupport : true
         * selection :
         * expensive : 0
         */
        var brand: String? = null
        var factory: String? = null
        var series: String? = null
        var groups: String? = null
        var model: String? = null
        var sales: String? = null
        var year: String? = null
        var chassis: String? = null
        var body: String? = null
        var engine: String? = null
        var trans: String? = null
        var transnum: String? = null
        var displacement: String? = null
        var drive: String? = null
        var logo: String? = null
        var img: String? = null
        var carid: String? = null
        var option:List<OptionEntity>?=null
        var epc: String? = null
//        var isCtggroupSupport = false
//        var selection: String? = null
//        var expensive = 0
    }
    class OptionEntity {
        /**
         * attributeList : [{"attributeValue":"THIS       CHINA-6(发动机型号P10A3)","show":true,"attributeName":"等级"},{"attributeValue":"左舵,真皮座椅","show":true,"attributeName":"配置"}]
         * ctggroupSupport : true
         * epcgroupSupport : true
         * carid : 999d183e-5d2c-4026-bcb5-23aae30243b1
         */
        var isCtggroupSupport = false
        var isEpcgroupSupport = false
        var carid: String? = null
        var attributeList: List<AttributeListBean>? = null

        class AttributeListBean : Serializable {
            /**
             * attributeValue : THIS       CHINA-6(发动机型号P10A3)
             * show : true
             * attributeName : 等级
             */
            var attributeValue: String? = null
            var isShow = false
            var attributeName: String? = null
        }
    }


}