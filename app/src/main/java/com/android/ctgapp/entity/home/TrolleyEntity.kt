package com.android.ctgapp.entity.home

import java.io.Serializable

class TrolleyEntity : Serializable {
    /**
     * status : 0
     * msg : null
     * data : [{"companyName":"无锡畅通汽配公司","companyId":12345,"companyUuid":null,"details":[{"nno":null,"companyName":null,"companyId":null,"factoryid":"uue8qw23132d","num":"uue8qw23132d","goodId":"42","stock":"233","imgName":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/2b9abbf3-0e99-4339-899d-3eba452cc7ac.jpg","oe":"","price":10,"nname":"12311313","id":"","imgNames":null,"fcode":"106-10","categoryName":null,"shopId":null,"specStyle":"","costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"buyLimit":null,"sales":null,"ctgcoding":null,"brandId":null,"detailImgs":null,"description":null,"brandName":"","isDeleted":0,"isOnsale":1,"shoppingId":14,"sellWay":0,"mbid":null}]}]
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var isSuccess = false
    var data: List<DataBean>? = null

    class DataBean : Serializable {
        /**
         * companyName : 无锡畅通汽配公司
         * companyId : 12345
         * companyUuid : null
         * details : [{"nno":null,"companyName":null,"companyId":null,"factoryid":"uue8qw23132d","num":"uue8qw23132d","goodId":"42","stock":"233","imgName":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/2b9abbf3-0e99-4339-899d-3eba452cc7ac.jpg","oe":"","price":10,"nname":"12311313","id":"","imgNames":null,"fcode":"106-10","categoryName":null,"shopId":null,"specStyle":"","costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"buyLimit":null,"sales":null,"ctgcoding":null,"brandId":null,"detailImgs":null,"description":null,"brandName":"","isDeleted":0,"isOnsale":1,"shoppingId":14,"sellWay":0,"mbid":null}]
         */
        var companyName: String? = null
        var companyId = 0
        var companyUuid: Any? = null
        var titleSelect: Boolean = false

        //是否支持挂账
        var supportWithCredit: Boolean? = null
        var details: List<DetailsBean>? = null

        class DetailsBean : Serializable {
            /**
             * nno : null
             * companyName : null
             * companyId : null
             * factoryid : uue8qw23132d
             * num : uue8qw23132d
             * goodId : 42
             * stock : 233
             * imgName : http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/2b9abbf3-0e99-4339-899d-3eba452cc7ac.jpg
             * oe :
             * price : 10.0
             * nname : 12311313
             * id :
             * imgNames : null
             * fcode : 106-10
             * categoryName : null
             * shopId : null
             * specStyle :
             * costPrice : null
             * noTaxPrice : null
             * retailPrice : null
             * wholesalePrice : null
             * allocatePrice : null
             * minPrice : null
             * defaultPrice : null
             * defaultOperator : null
             * orgName : null
             * defaultAutio : null
             * buyLimit : null
             * sales : null
             * ctgcoding : null
             * brandId : null
             * detailImgs : null
             * description : null
             * brandName :
             * isDeleted : 0
             * isOnsale : 1
             * shoppingId : 14
             * sellWay : 0
             * mbid : null
             */
            var nno: Any? = null
            var ctgnum:Any?=null
            var companyName: Any? = null
            var companyId: String? = null
            var factoryid: String? = null
            var num: Int = 0
            var goodId: String? = null
            var stock: String? = null
            var imgName: String? = null
            var oe: String? = null
            var price = 0.0
            var nname: String? = null
            var id: String? = null
            var imgNames: Any? = null
            var fcode: String? = null
            var categoryName: Any? = null
            var shopId: Any? = null
            var specStyle: String? = null
            var costPrice: Any? = null
            var noTaxPrice: Any? = null
            var retailPrice: Any? = null
            var wholesalePrice: Any? = null
            var allocatePrice: Any? = null
            var minPrice: Any? = null
            var defaultPrice: Any? = null
            var defaultOperator: Any? = null
            var orgName: String? = null
            var defaultAutio: Any? = null
            var buyLimit: Int? = null
            var sales: String? = null
//            var ctgcoding: Any? = null
            var brandId: Int? = null
//            var detailImgs: Any? = null
            var description: Any? = null
            var brandName: String? = null
            var isDeleted = 0
            var isOnsale = 0
            var shoppingId = 0
            var sellWay = 0
            var isSet = 0
//            var mbid: Any? = null
            var isSelected: Int = 0
            var goodsName=""
        }
    }
}