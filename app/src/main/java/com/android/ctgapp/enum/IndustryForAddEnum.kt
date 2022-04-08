package com.android.ctgapp.enum

/**
 *作者:LiBW
 *创建日期: 12/23/20
 *描述: 添加客户用枚举
 */
enum class IndustryForAddEnum(val industryCode: String, val industryName: String) {
    MANUFACTURER("MANUFACTURER", "制造商"),
    AGENCY("AGENCY", "经销商"),
    REPAIRSHOP("REPAIRSHOP", "修理厂"),
    ALLIANCE("ALLIANCE", "汽配联盟"),
    CAR_DISMANTLING("CAR_DISMANTLING", "拆车厂"),
    LOGISTICS("LOGISTICS", "物流公司"),
    INSURANCE("INSURANCE", "保险公司"),
    AUTO4S("AUTO4S", "4S店");
    
}