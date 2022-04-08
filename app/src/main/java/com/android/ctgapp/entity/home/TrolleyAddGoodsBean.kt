package com.android.ctgapp.entity.home

data class TrolleyAddGoodsBean (
    val stock:String,
    val images:String,
    val categoryName:String,
    val nno:String,
    val partId:String,
    val partName:String,
    val price:String,
    val allianceId:String,
    val remark:String,
    var num:String,
    val buyerCompanyId:String,
    val createUser:Int,
    //规格型号
    val specStyle:String,

    val goodsName:String,
    //目前只有自买
    val sellWay:String="0",
    //目前只有AGENCY
    val companyIndustry:String="AGENCY",
    var otherSortList:List<GoodsDetailBean>?=null,

    //是否限购 0不限购 1限购
    var isSet:Int?=null,
    //限购数量
    var buyLimit:Int?=null
)