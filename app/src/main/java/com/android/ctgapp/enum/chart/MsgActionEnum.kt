package com.android.ctgapp.enum.chart

enum class MsgActionEnum(var type: Int, var content: String) {
    CHAT(1, "聊天消息"),
    RECEIVED(2, "消息已接收"),
    READ(3, "消息已读"),
    HEARBEAT(0, "心跳");
}