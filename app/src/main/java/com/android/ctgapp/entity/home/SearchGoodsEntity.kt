package com.android.ctgapp.entity.home

import lombok.Data
import lombok.NoArgsConstructor


class SearchGoodsEntity {
     var status = 0
     var msg: Any? = null
     var data: DataBean? = null
     var success = false


    class DataBean {
         var goodsList: GoodsListBean? = null
         var brandList: List<BrandListBean>? = null
         var categoryVos: List<CategoryVosBean>? = null
         var fcodeVos: List<FcodeVosBean>? = null


        class GoodsListBean {
             var records: List<RecordsBean>? = null
             var total = 0
             var size = 0
             var current = 0
             var orders: List<*>? = null
             var optimizeCountSql = false
             var hitCount = false
             var countId: Any? = null
             var maxLimit: Any? = null
             var searchCount = false
             var pages = 0


            class RecordsBean {
                 var salesPrice = 0
                 var unit: Any? = null
                 var id = 0
                 var imgs: Any? = null
                 var detailImgs: Any? = null
                 var stock = 0
                 var nname: String? = null
                 var nno: String? = null
                 var categoryName: String? = null
                 var companyId = 0
                 var companyUuid: Any? = null
                 var brandid = 0
                 var fcode: String? = null
                 var sales = 0
                 var keyName: Any? = null
                 var images: String? = null
                 var brandName: Any? = null
                 var shopId: Any? = null
                 var specStyle: String? = null
                 var orgBrandName: Any? = null
                 var buyLimit: Any? = null
                 var showZero: Any? = null
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
                 var tagCode: Any? = null
                 var mbid = 0
                 var description: String? = null
                 var ownSa = 0
                 var im: Any? = null
                 var do_show_zero: Any? = null
                 var ctgcoding: String? = null
                 var warehouse: Any? = null
                 var oe: String? = null
                 var ctgnum: String? = null
                 var spec: String? = null
                 var fname: String? = null
                 var quality: Any? = null
                 var remark: Any? = null
                 var factoryid: Any? = null
                 var ownStock: Any? = null
                 var ownPrice: Any? = null
                 var erpId: Any? = null
                 var isOnsale: Any? = null
                 var isDeleted: Any? = null
                 var partGoodsId: Any? = null
                 var belongCompanyId = 0
                 var partModel: String? = null
                 var suggestPrice = 0
                 var subUrl: Any? = null
                 var detUrl: Any? = null
                 var belongCompanyName: Any? = null
                 var setWay: Any? = null
                 var rate: Any? = null
                 var amount: Any? = null
                 var finalPrice: Any? = null
                 var userPrice: Any? = null
                 var isSet = 0
                 var agentGoodsId = 0
                 var erpGoodsId: Any? = null
                 var settingId: Any? = null
                 var wsPrice: Any? = null
                 var goodsName: String? = null
                 var detailVos: List<*>? = null
            }
        }


        class BrandListBean {
             var id = 0
             var brandName: String? = null
//             var fcode: Any? = null
//             var num: Any? = null
//             var fname: Any? = null
//             var logo: Any? = null
//             var pinyin: Any? = null
//             var quanpin: Any? = null
             var select=false
        }


        class CategoryVosBean {
             var ctgnum: String? = null
             var fname: String? = null
        }


        class FcodeVosBean {
             var fcode: String? = null
             var fname: String? = null
        }
    }
}