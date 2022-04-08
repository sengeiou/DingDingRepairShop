package com.android.ctgapp.entity.chart

import androidx.room.Entity
import androidx.room.PrimaryKey

//外部消息 Fragment 里面的历史聊天记录
@Entity
class ChartListEntity(
    //对方发送者的Id如果Id为空说明是群组消息
    var otherId: Int?,
    //对方发送者的头像
    var otherHeaderImg: String,
    //对方发送者的姓名
    var otherName: String,
    //群组ID
    var groupId: Int?,
    //最后一条信息
    var lastMsg: String,
    //最后一条信息发送的时间
    var lastMsgTime: Long,
    //没有阅读的信息数量
    var unRedMsg: Int,
    //公司名称
    var companyName: String,
    //当前用户的Id
    var currentUserId: Int,
    var newMsg: Boolean = true,
    var online: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

}