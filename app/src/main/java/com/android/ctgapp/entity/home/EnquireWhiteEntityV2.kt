package com.android.ctgapp.entity.home

import java.io.Serializable

class EnquireWhiteEntityV2 {
    /**
     * status : 0
     * msg : null
     * data : {"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"enquiryId":322,"enquiryWay":1,"invoiceType":1,"linkman":"猪小健","linkmanPhone":"13584188326","province":"上海市","city":"嘉定区","district":"华亭镇","toAddress":"你们都","isAnonymous":0,"enquiryStatus":3,"vin":"LHGFS1653L2047826","modelInfo":"本田 凌派2019款 1.0T 无级 180Turbo 豪华版","isDeleted":0,"insuranceCompanyId":null,"enquiryNo":"XJ20210730143653015VL9B013","expireTime":"2021-08-04 14:36:53","quality":"原厂件、再制造件","expectTime":"2021-07-30 14:36:53","enquiryType":0,"lastEnquiryId":null,"lossBillId":null,"isShow":0,"remark":"","enquirySource":5,"publishTime":null,"createUserId":1,"createTime":"2021-07-30 14:36:53","createCompanyId":2222,"allianceId":null,"isDeal":0,"auditState":2,"auditUserId":null,"flow":1,"auditUserName":null,"createUserName":null,"createCompanyName":"小薛修理厂","insuranceCompanyName":null,"allianceName":null,"fullAddress":"上海市嘉定区华亭镇你们都","expectDay":1,"sumParts":0,"enquiryDetails":[{"enquiryDetailId":1048,"oe":"33150TBTH01","partName":"前大灯总成-左","fname":null,"quality":null,"brand":null,"num":1,"ssssPrice":2352,"epcImage":null,"expectAogTime":"2021-07-31 00:00:00","createTime":"2021-07-30 14:36:53","createUserId":1,"updateTime":"2021-07-30 14:36:53","updateUserId":null,"enquiryId":322,"fcode":null,"ctgnum":null,"remark":"","lastPartId":null,"cpicPartId":null,"partState":0,"epcCategoryId":null,"epcSign":null}],"imgUrls":[],"targetCompanyIds":[65546,88889529],"enquiryTargets":[{"enquiryTargetId":841,"enquiryId":322,"targetCompanyId":65546,"province":null,"city":null,"district":null,"createTime":"2021-07-30 14:36:53","updateTime":"2021-07-30 14:36:53","isHidden":0,"isQuoted":0,"targetCompanyName":"小丫经销店"},{"enquiryTargetId":842,"enquiryId":322,"targetCompanyId":88889529,"province":null,"city":null,"district":null,"createTime":"2021-07-30 14:36:53","updateTime":"2021-07-30 14:39:03","isHidden":0,"isQuoted":1,"targetCompanyName":"TY汽配经销商"}],"cooperativeCompanyIds":null,"enquiryCooperatives":null,"quotationDetails":[{"quotationDetailId":23115,"quotationId":479,"enquiryDetailId":1048,"oe":"33150TBTH01","partName":"前大灯总成-左","brand":"汽车","quality":null,"price":100,"lossPrice":100,"num":1,"guaranteeTime":null,"remark":null,"packagePrice":0,"ssssPrice":2352,"partCondition":null,"aogTime":"2021-07-30 00:00:00","partState":0,"quotationCompanyId":88889529,"quotationCompanyName":"TY汽配经销商","quotationUserId":1675,"quotationUserTelephone":"13921191334","quotationUserName":"rainbow","haveColor":0,"avatar":"11b1aaa1-4cb9-41ed-9c8e-393ea23d7389.jpg","cprice":null,"nprice":null},{"quotationDetailId":23116,"quotationId":479,"enquiryDetailId":1048,"oe":"33150TBTH01","partName":"有成-左","brand":"飞机","quality":"","price":99,"lossPrice":99,"num":1,"guaranteeTime":null,"remark":"","packagePrice":0,"ssssPrice":2352,"partCondition":null,"aogTime":"2021-07-30 00:00:00","partState":0,"quotationCompanyId":88889529,"quotationCompanyName":"TY汽配经销商","quotationUserId":1675,"quotationUserTelephone":"13921191334","quotationUserName":"rainbow","haveColor":0,"avatar":"11b1aaa1-4cb9-41ed-9c8e-393ea23d7389.jpg","cprice":null,"nprice":null}],"quotationDetailsMap":null,"isShowSettlement":null,"haveWishList":null,"quotedNum":null,"targetNum":null,"industry":null}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * startDate : null
         * endDate : null
         * pageNum : 1
         * pageSize : 20
         * enquiryId : 322
         * enquiryWay : 1
         * invoiceType : 1
         * linkman : 猪小健
         * linkmanPhone : 13584188326
         * province : 上海市
         * city : 嘉定区
         * district : 华亭镇
         * toAddress : 你们都
         * isAnonymous : 0
         * enquiryStatus : 3
         * vin : LHGFS1653L2047826
         * modelInfo : 本田 凌派2019款 1.0T 无级 180Turbo 豪华版
         * isDeleted : 0
         * insuranceCompanyId : null
         * enquiryNo : XJ20210730143653015VL9B013
         * expireTime : 2021-08-04 14:36:53
         * quality : 原厂件、再制造件
         * expectTime : 2021-07-30 14:36:53
         * enquiryType : 0
         * lastEnquiryId : null
         * lossBillId : null
         * isShow : 0
         * remark :
         * enquirySource : 5
         * publishTime : null
         * createUserId : 1
         * createTime : 2021-07-30 14:36:53
         * createCompanyId : 2222
         * allianceId : null
         * isDeal : 0
         * auditState : 2
         * auditUserId : null
         * flow : 1
         * auditUserName : null
         * createUserName : null
         * createCompanyName : 小薛修理厂
         * insuranceCompanyName : null
         * allianceName : null
         * fullAddress : 上海市嘉定区华亭镇你们都
         * expectDay : 1
         * sumParts : 0
         * enquiryDetails : [{"enquiryDetailId":1048,"oe":"33150TBTH01","partName":"前大灯总成-左","fname":null,"quality":null,"brand":null,"num":1,"ssssPrice":2352,"epcImage":null,"expectAogTime":"2021-07-31 00:00:00","createTime":"2021-07-30 14:36:53","createUserId":1,"updateTime":"2021-07-30 14:36:53","updateUserId":null,"enquiryId":322,"fcode":null,"ctgnum":null,"remark":"","lastPartId":null,"cpicPartId":null,"partState":0,"epcCategoryId":null,"epcSign":null}]
         * imgUrls : []
         * targetCompanyIds : [65546,88889529]
         * enquiryTargets : [{"enquiryTargetId":841,"enquiryId":322,"targetCompanyId":65546,"province":null,"city":null,"district":null,"createTime":"2021-07-30 14:36:53","updateTime":"2021-07-30 14:36:53","isHidden":0,"isQuoted":0,"targetCompanyName":"小丫经销店"},{"enquiryTargetId":842,"enquiryId":322,"targetCompanyId":88889529,"province":null,"city":null,"district":null,"createTime":"2021-07-30 14:36:53","updateTime":"2021-07-30 14:39:03","isHidden":0,"isQuoted":1,"targetCompanyName":"TY汽配经销商"}]
         * cooperativeCompanyIds : null
         * enquiryCooperatives : null
         * quotationDetails : [{"quotationDetailId":23115,"quotationId":479,"enquiryDetailId":1048,"oe":"33150TBTH01","partName":"前大灯总成-左","brand":"汽车","quality":null,"price":100,"lossPrice":100,"num":1,"guaranteeTime":null,"remark":null,"packagePrice":0,"ssssPrice":2352,"partCondition":null,"aogTime":"2021-07-30 00:00:00","partState":0,"quotationCompanyId":88889529,"quotationCompanyName":"TY汽配经销商","quotationUserId":1675,"quotationUserTelephone":"13921191334","quotationUserName":"rainbow","haveColor":0,"avatar":"11b1aaa1-4cb9-41ed-9c8e-393ea23d7389.jpg","cprice":null,"nprice":null},{"quotationDetailId":23116,"quotationId":479,"enquiryDetailId":1048,"oe":"33150TBTH01","partName":"有成-左","brand":"飞机","quality":"","price":99,"lossPrice":99,"num":1,"guaranteeTime":null,"remark":"","packagePrice":0,"ssssPrice":2352,"partCondition":null,"aogTime":"2021-07-30 00:00:00","partState":0,"quotationCompanyId":88889529,"quotationCompanyName":"TY汽配经销商","quotationUserId":1675,"quotationUserTelephone":"13921191334","quotationUserName":"rainbow","haveColor":0,"avatar":"11b1aaa1-4cb9-41ed-9c8e-393ea23d7389.jpg","cprice":null,"nprice":null}]
         * quotationDetailsMap : null
         * isShowSettlement : null
         * haveWishList : null
         * quotedNum : null
         * targetNum : null
         * industry : null
         */
        var startDate: Any? = null
        var endDate: Any? = null
        var pageNum = 0
        var pageSize = 0
        var enquiryId = 0
        var enquiryWay = 0
        var invoiceType = 0
        var linkman: String? = null
        var linkmanPhone: String? = null
        var province: String? = null
        var city: String? = null
        var district: String? = null
        var toAddress: String? = null
        var isAnonymous = 0
        var enquiryStatus = 0
        var vin: String? = null
        var modelInfo: String? = null
        var isDeleted = 0
        var insuranceCompanyId: Any? = null
        var enquiryNo: String? = null
        var expireTime: String? = null
        var quality: String? = null
        var expectTime: String? = null
        var enquiryType = 0
        var lastEnquiryId: Any? = null
        var lossBillId: Any? = null
        var isShow = 0
        var remark: String? = null
        var enquirySource = 0
        var publishTime: Any? = null
        var createUserId = 0
        var createTime: String? = null
        var createCompanyId = 0
        var allianceId: Any? = null
        var isDeal = 0
        var auditState = 0
        var auditUserId: Any? = null
        var flow = 0
        var auditUserName: Any? = null
        var createUserName: Any? = null
        var createCompanyName: String? = null
        var insuranceCompanyName: Any? = null
        var allianceName: Any? = null
        var fullAddress: String? = null
        var expectDay = 0
        var sumParts = 0
        var cooperativeCompanyIds: Any? = null
        var enquiryCooperatives: Any? = null
        var quotationDetailsMap: Any? = null
        var isShowSettlement: Any? = null
        var haveWishList: Any? = null
        var quotedNum: Any? = null
        var targetNum: Any? = null
        var industry: Any? = null
        var enquiryDetails: List<EnquiryDetailsBean>? = null
        var imgUrls: List<*>? = null
        var targetCompanyIds: List<Int>? = null
        var enquiryTargets: List<EnquiryTargetsBean>? = null
        var quotationDetails: List<QuotationDetailsBean>? = null

        class EnquiryDetailsBean {
            /**
             * enquiryDetailId : 1048
             * oe : 33150TBTH01
             * partName : 前大灯总成-左
             * fname : null
             * quality : null
             * brand : null
             * num : 1
             * ssssPrice : 2352
             * epcImage : null
             * expectAogTime : 2021-07-31 00:00:00
             * createTime : 2021-07-30 14:36:53
             * createUserId : 1
             * updateTime : 2021-07-30 14:36:53
             * updateUserId : null
             * enquiryId : 322
             * fcode : null
             * ctgnum : null
             * remark :
             * lastPartId : null
             * cpicPartId : null
             * partState : 0
             * epcCategoryId : null
             * epcSign : null
             */
            var enquiryDetailId = 0
            var oe: String? = null
            var partName: String? = null
            var fname: Any? = null
            var quality: Any? = null
            var brand: Any? = null
            var num = 0
            var ssssPrice = ""
            var epcImage: Any? = null
            var expectAogTime: String? = null
            var createTime: String? = null
            var createUserId = 0
            var updateTime: String? = null
            var updateUserId: Any? = null
            var enquiryId = 0
            var fcode: Any? = null
            var ctgnum: Any? = null
            var remark: String? = null
            var lastPartId: Any? = null
            var cpicPartId: Any? = null
            var partState = 0
            var epcCategoryId: Any? = null
            var epcSign: Any? = null
        }

        class EnquiryTargetsBean {
            /**
             * enquiryTargetId : 841
             * enquiryId : 322
             * targetCompanyId : 65546
             * province : null
             * city : null
             * district : null
             * createTime : 2021-07-30 14:36:53
             * updateTime : 2021-07-30 14:36:53
             * isHidden : 0
             * isQuoted : 0
             * targetCompanyName : 小丫经销店
             */
            var enquiryTargetId = 0
            var enquiryId = 0
            var targetCompanyId = 0
            var province: Any? = null
            var city: Any? = null
            var district: Any? = null
            var createTime: String? = null
            var updateTime: String? = null
            var isHidden = 0
            var isQuoted = 0
            var targetCompanyName: String? = null
        }

        class QuotationDetailsBean :Serializable{
            /**
             * quotationDetailId : 23115
             * quotationId : 479
             * enquiryDetailId : 1048
             * oe : 33150TBTH01
             * partName : 前大灯总成-左
             * brand : 汽车
             * quality : null
             * price : 100
             * lossPrice : 100
             * num : 1
             * guaranteeTime : null
             * remark : null
             * packagePrice : 0
             * ssssPrice : 2352
             * partCondition : null
             * aogTime : 2021-07-30 00:00:00
             * partState : 0
             * quotationCompanyId : 88889529
             * quotationCompanyName : TY汽配经销商
             * quotationUserId : 1675
             * quotationUserTelephone : 13921191334
             * quotationUserName : rainbow
             * haveColor : 0
             * avatar : 11b1aaa1-4cb9-41ed-9c8e-393ea23d7389.jpg
             * cprice : null
             * nprice : null
             */
            var quotationDetailId = 0
            var quotationId = 0
            var enquiryDetailId = 0
            var oe: String? = null
            var partName: String? = null
            var brand: String? = null
            var quality: Any? = null
            var price = 0.0
            var lossPrice = 0.0
            var num = 0
            var guaranteeTime: Any? = null
            var remark: Any? = null
            var packagePrice = 0.0
            var ssssPrice = ""
            var partCondition: Any? = null
            var aogTime: String? = null
            var partState = 0
            var quotationCompanyId = 0
            var quotationCompanyName: String? = null
            var quotationUserId = 0
            var quotationUserTelephone: String? = null
            var quotationUserName: String? = null
            var haveColor = 0
            var avatar: String? = null
            var cprice: Any? = null
            var nprice: Any? = null
        }
    }
}