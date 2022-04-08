package com.android.ctgapp.enum.chart

enum class MsgTypeEnum(var type: Int, var content: String) {

    //    TEXT(0, "文字"),
//    PIC(1, "图片"),
//    VOICE(2, "语音"),
//    VIDEO(3, "图片"),
//    GOODS(4, "商品"),
//    ORDER(5, "订单"),
//    CARD(6, "名片");
    TEXT(100, "文字"),
    PIC(101, "图片"),
    VOICE(105, "语音"),
    VIDEO(106, "视频"),
    GOODS(4, "商品"),
    ORDER(104, "订单"),
    CARD(107, "名片");

    companion object {
        fun getMsgType(type: Int): MsgTypeEnum? {
            for (msgTypeEnum in values()) {
                if (msgTypeEnum.type == type) {
                    return msgTypeEnum
                }
            }
            return null
        }
    }
}