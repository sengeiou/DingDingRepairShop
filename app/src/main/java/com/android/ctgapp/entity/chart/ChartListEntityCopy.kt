package com.android.ctgapp.entity.chart

import androidx.room.Entity
import androidx.room.PrimaryKey

//外部消息 Fragment 里面的历史聊天记录
class ChartListEntityCopy {
    var id: Long ?= null

    //对方发送者的Id如果Id为空说明是群组消息
    var otherId: Int? = null

    //对方发送者的头像
    var otherHeaderImg: String = ""

    //对方发送者的姓名
    var otherName: String = ""

    //群组ID
    var groupId: Int? = null

    //最后一条信息
    var lastMsg: String = ""

    //最后一条信息发送的时间
    var lastMsgTime: Long? = null

    //没有阅读的信息数量
    var unRedMsg: Int=0

    //公司名称
    var companyName: String = ""

    //当前用户的Id
    var currentUserId: Int? = null
    var newMsg: Boolean = true
    var online: Boolean = false
}