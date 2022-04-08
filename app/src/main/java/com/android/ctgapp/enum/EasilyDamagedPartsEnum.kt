package com.android.ctgapp.enum

/**
 *作者:LiBW
 *创建日期: 2020/10/30
 *描述: 易损件枚举类
 */
enum class EasilyDamagedPartsEnum(val partName: String, val partId: String) {

    TIRE("轮胎", "106-10"),
    MAINTENANCE("养护用品", "106-11"),
    BRAKE_PAD("刹车片", "106-06"),
    WIPER("雨刮片", "106-07"),
    IGNITION("点火系", "106-04"),
    BATTERY("电瓶", "106-05"),
    OIL("油品及化学品", "106-01"),
    FILTER("滤清器", "106-03"),
    LIGHT("滤清器", "106-09"),
    MORE("更多", "others");

    companion object{
        fun getPartId(name: String): String {
            values().forEach {
                if (it.name == name) {
                    return it.partId
                }
            }
            return ""
        }


        fun getPartName(partId: String): String {
            values().forEach {
                if (it.partId == partId) {
                    return it.partName
                }
            }
            return ""
        }
    }

}