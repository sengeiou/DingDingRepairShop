package com.android.ctgapp.entity.home

class EnquireWhiteEntity {
    /**
     * status : 0
     * msg : null
     * data : {"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"enquiryId":321,"enquiryWay":1,"invoiceType":1,"linkman":"弟弟热巴","linkmanPhone":"18312345678","province":"北京","city":"北京","district":"崇文区","toAddress":"","isAnonymous":0,"enquiryStatus":1,"vin":"LHGFS1653L2047826","modelInfo":"本田 凌派 2019款 1.0T 无级 180Turbo 豪华版","isDeleted":0,"insuranceCompanyId":null,"enquiryNo":"XJ20210730105547342N9XJ021","expireTime":"2021-08-04 10:55:47","quality":"原厂件","expectTime":"2021-07-30 10:55:47","enquiryType":0,"lastEnquiryId":null,"lossBillId":null,"isShow":0,"remark":"","enquirySource":4,"publishTime":null,"createUserId":1309,"createTime":"2021-07-30 10:55:47","createCompanyId":65551,"allianceId":null,"isDeal":0,"auditState":2,"auditUserId":null,"flow":1,"auditUserName":null,"createUserName":null,"createCompanyName":"小黄维修","insuranceCompanyName":null,"allianceName":null,"fullAddress":"北京北京崇文区","expectDay":1,"sumParts":0,"enquiryDetails":[{"enquiryDetailId":1047,"oe":"76622TDKJ01","partName":"前风挡雨刮胶条-左","fname":null,"quality":null,"brand":null,"num":1,"ssssPrice":68,"epcImage":null,"expectAogTime":"2021-07-31 00:00:00","createTime":"2021-07-30 10:55:47","createUserId":1309,"updateTime":"2021-07-30 10:55:47","updateUserId":null,"enquiryId":321,"fcode":null,"ctgnum":null,"remark":"","lastPartId":null,"cpicPartId":null,"partState":0,"epcCategoryId":null,"epcSign":null}],"imgUrls":[],"targetCompanyIds":[65546,88889529],"enquiryTargets":[{"enquiryTargetId":839,"enquiryId":321,"targetCompanyId":65546,"province":null,"city":null,"district":null,"createTime":"2021-07-30 10:55:47","updateTime":"2021-07-30 10:55:47","isHidden":0,"isQuoted":0,"targetCompanyName":"小丫经销店"},{"enquiryTargetId":840,"enquiryId":321,"targetCompanyId":88889529,"province":null,"city":null,"district":null,"createTime":"2021-07-30 10:55:47","updateTime":"2021-07-30 10:55:47","isHidden":0,"isQuoted":0,"targetCompanyName":"TY汽配经销商"}],"cooperativeCompanyIds":null,"enquiryCooperatives":null,"quotationDetails":null,"quotationDetailsMap":null,"isShowSettlement":null,"haveWishList":null,"quotedNum":null,"targetNum":null,"industry":null}
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
         * enquiryId : 321
         * enquiryWay : 1
         * invoiceType : 1
         * linkman : 弟弟热巴
         * linkmanPhone : 18312345678
         * province : 北京
         * city : 北京
         * district : 崇文区
         * toAddress :
         * isAnonymous : 0
         * enquiryStatus : 1
         * vin : LHGFS1653L2047826
         * modelInfo : 本田 凌派 2019款 1.0T 无级 180Turbo 豪华版
         * isDeleted : 0
         * insuranceCompanyId : null
         * enquiryNo : XJ20210730105547342N9XJ021
         * expireTime : 2021-08-04 10:55:47
         * quality : 原厂件
         * expectTime : 2021-07-30 10:55:47
         * enquiryType : 0
         * lastEnquiryId : null
         * lossBillId : null
         * isShow : 0
         * remark :
         * enquirySource : 4
         * publishTime : null
         * createUserId : 1309
         * createTime : 2021-07-30 10:55:47
         * createCompanyId : 65551
         * allianceId : null
         * isDeal : 0
         * auditState : 2
         * auditUserId : null
         * flow : 1
         * auditUserName : null
         * createUserName : null
         * createCompanyName : 小黄维修
         * insuranceCompanyName : null
         * allianceName : null
         * fullAddress : 北京北京崇文区
         * expectDay : 1
         * sumParts : 0
         * enquiryDetails : [{"enquiryDetailId":1047,"oe":"76622TDKJ01","partName":"前风挡雨刮胶条-左","fname":null,"quality":null,"brand":null,"num":1,"ssssPrice":68,"epcImage":null,"expectAogTime":"2021-07-31 00:00:00","createTime":"2021-07-30 10:55:47","createUserId":1309,"updateTime":"2021-07-30 10:55:47","updateUserId":null,"enquiryId":321,"fcode":null,"ctgnum":null,"remark":"","lastPartId":null,"cpicPartId":null,"partState":0,"epcCategoryId":null,"epcSign":null}]
         * imgUrls : []
         * targetCompanyIds : [65546,88889529]
         * enquiryTargets : [{"enquiryTargetId":839,"enquiryId":321,"targetCompanyId":65546,"province":null,"city":null,"district":null,"createTime":"2021-07-30 10:55:47","updateTime":"2021-07-30 10:55:47","isHidden":0,"isQuoted":0,"targetCompanyName":"小丫经销店"},{"enquiryTargetId":840,"enquiryId":321,"targetCompanyId":88889529,"province":null,"city":null,"district":null,"createTime":"2021-07-30 10:55:47","updateTime":"2021-07-30 10:55:47","isHidden":0,"isQuoted":0,"targetCompanyName":"TY汽配经销商"}]
         * cooperativeCompanyIds : null
         * enquiryCooperatives : null
         * quotationDetails : null
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
        var quotationDetails: Any? = null
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

        class EnquiryDetailsBean {
            /**
             * enquiryDetailId : 1047
             * oe : 76622TDKJ01
             * partName : 前风挡雨刮胶条-左
             * fname : null
             * quality : null
             * brand : null
             * num : 1
             * ssssPrice : 68.0
             * epcImage : null
             * expectAogTime : 2021-07-31 00:00:00
             * createTime : 2021-07-30 10:55:47
             * createUserId : 1309
             * updateTime : 2021-07-30 10:55:47
             * updateUserId : null
             * enquiryId : 321
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
            var ssssPrice =""
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
             * enquiryTargetId : 839
             * enquiryId : 321
             * targetCompanyId : 65546
             * province : null
             * city : null
             * district : null
             * createTime : 2021-07-30 10:55:47
             * updateTime : 2021-07-30 10:55:47
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
    }
}