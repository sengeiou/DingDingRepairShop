package com.android.ctgapp.entity.chart

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *作者:LiBW
 *创建日期: 2021/5/11
 *描述: 消息在数据库中的格式
 */
@Entity
data class CurrentChartEntity(
    @PrimaryKey
    var id: String,//UUID
    var senderUserId: Int,//发送者的ID
    var receiverUserId: Int? = null,//接受者的ID
    var receiverGroupId: Int? = null,
    var msgType: Int = -1,//消息类别(图片/视频/语音等)
    var receiverType: Int,//(1为单聊 2为群聊)
    var sendTime: String,//(信息发送时间)
    var message: String,//(信息时间)
    var createTime: Long,//(信息创建时间)
    /***0为正常 1为发送中 2为发送失败*/
    var msgStatus: Int,
    //当前用户Id
    var currentUserId:Int,
    /**消息是否已读 0 未读 1 已读*/
    var read:Int,
)