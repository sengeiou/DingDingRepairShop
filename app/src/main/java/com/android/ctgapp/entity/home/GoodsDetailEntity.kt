package com.android.ctgapp.entity.home

class GoodsDetailEntity {
    /**
     * status : 0
     * msg : null
     * data : {"salesPrice":14,"unit":"付","id":"73","imgs":["http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png"],"detailImgs":["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"],"stock":"1","nname":"05款骊威倒车镜(5线)（左）","nno":"HC-NS-003","categoryName":null,"companyId":12345,"companyUuid":null,"brandid":"361","fcode":null,"sales":0,"keyName":null,"images":null,"brandName":"欧睿特","shopId":"SHOP_ID_0002","orgName":null,"mbid":"361","description":"","im":null,"ctgcoding":null}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: GoodsDetailBean? = null
    var isSuccess = false


}

class GoodsDetailBean {
    /**
     * salesPrice : 14.0
     * unit : 付
     * id : 73
     * imgs : ["http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png"]
     * detailImgs : ["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"]
     * stock : 1
     * nname : 05款骊威倒车镜(5线)（左）
     * nno : HC-NS-003
     * categoryName : null
     * companyId : 12345
     * companyUuid : null
     * brandid : 361
     * fcode : null
     * sales : 0
     * keyName : null
     * images : null
     * brandName : 欧睿特
     * shopId : SHOP_ID_0002
     * orgName : null
     * mbid : 361
     * description :
     * im : null
     * ctgcoding : null
     */
    var salesPrice = 0.0
    var unit: String? = null
    var ctgnum:String?=null
    var id: String? = null
    var stock: Int? = null
    var nname: String? = null
    var nno: String? = null
    var categoryName: Any? = null
    var companyId = 0
    var companyUuid: Any? = null
    var brandid: Int? = null
    var fcode: Any? = null
    var sales = 0
    var keyName: Any? = null
    var images: Any? = null
    var brandName: String? = null
    var shopId: String? = null
    //型号
    var specStyle: String? = null
    var spec: String? = null
    var orgName: Any? = null
    var mbid: String? = null
    var description: String? = null
    var im: Any? = null
    var ctgcoding: Any? = null
    var warehouse: String? = null
    var warehouseName: String? = null
    var imgs: List<String>? = null
    var detailImgs: List<String>? = null
    var goodsName = ""
    var isSelect = false
    var detailVos: List<GoodsDetailBean>? = null

    var isSet:Int?=null
    var buyLimit:Int?=null
}