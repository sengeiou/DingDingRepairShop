package com.android.ctgapp.entity.home

/**商品实体类*/
class GoodsItemEntity {
    /**
     * salesPrice : 14.0
     * unit : 付
     * id : 73
     * imgs : null
     * detailImgs : ["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"]
     * stock : 1
     * nname : 05款骊威倒车镜(5线)（左）
     * nno : HC-NS-003
     * categoryName : 轮胎
     * companyId : 12345
     * companyUuid : null
     * brandid : 361
     * fcode : 106-10
     * sales : 0
     * keyName : null
     * images : http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png
     * brandName : 欧睿特
     * shopId : SHOP_ID_0002
     * specStyle : null
     * orgBrandName : null
     * buyLimit : null
     * showZero : null
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
     * tagCode : null
     * mbid : 361
     * description :
     * ownSa : 0
     * im : http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png
     * do_show_zero : null
     * ctgcoding :
     */
    var salesPrice = 0.0
    var unit: String? = null
    var id: String? = null
    var imgs: Any? = null
    var stock: String? = null
    var nname: String? = null
    var nno: String? = null
    var categoryName: String? = null
    var companyId = 0
    var companyUuid: Any? = null
    var brandid: String? = null
    var fcode: String? = null
    var sales = 0
    var keyName: Any? = null
    var images: String? = null
    var brandName: String? = null

    var shopId: String? = null
    var specStyle: Any? = null
    var spec = ""
    var orgBrandName: Any? = null
    var showZero: Any? = null
    var costPrice: Any? = null
    var noTaxPrice: Any? = null
    var retailPrice: Any? = null
    var wholesalePrice: Any? = null
    var allocatePrice: Any? = null
    var minPrice: Any? = null
    var defaultPrice: Any? = null
    var defaultOperator: Any? = null
    var orgName: Any? = null
    var defaultAutio: Any? = null
    var tagCode: Any? = null
    var mbid: String? = null
    var description: String? = null
    var ownSa = 0
    var im: String? = null
    var do_show_zero: Any? = null
    var ctgcoding: String? = null
    var detailImgs: List<String>? = null
    var goodsName = ""
    var detailVos: List<GoodsDetailBean>? = null
    //是否限购 0不限购 1限购
    var isSet:Int?=null
    //限购数量
    var buyLimit:Int?=null


}