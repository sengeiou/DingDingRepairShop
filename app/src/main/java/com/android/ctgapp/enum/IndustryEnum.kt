package com.android.ctgapp.enum

enum class IndustryEnum(val industryText: String) {

    LOGISTICS("物流业"),
    AGENCY("经销商"),
    MANUFACTURER("制造商"),
    AUTO4S("4S店"),
    REPAIRSHOP("修理厂"),
    INSURANCE("保险业"),
    CTGMANAGER("车同轨管理后台"),
    MALLIANCE("制造商联盟"),
    AALLIANCE("经销商联盟"),
    CAR_DISMANTLING("拆车厂"),
    PLATFORM("平台运营公司"),
    SCIENCE("科技公司"),
    DATA("数据公司"),
    AUTHENTIC("认证公司"),
    BIG_DATA("大数据公司"),
    CATTLE_AGENCY("拆车黄牛经销商");

    companion object{
        fun getShowName(name: String): String {
            val enums = values()
            enums.forEach {
                if (name==it.name){
                    return it.industryText
                }
            }
            return ""
        }
    }

}

fun getShowName(name: String): String {
    val enums = IndustryEnum.values()
    enums.forEach {
        if (name==it.name){
            return it.industryText
        }
    }
    return ""
}
