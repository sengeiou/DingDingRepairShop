package com.android.ctgapp.entity.chart

import java.io.Serializable

class ChartResult : Serializable {
    /**
     * id : 839e0ac0b22a4f0ba47f6a30a636e1b2
     * action : 1
     * msg : {"id":"5594be867ae04ccfb9cddf525f5558da","msgType":0,"senderUserId":1309,"receiverType":1,"receiverUserId":1457,"receiverGroupId":null,"message":"饿的啊啊啊","createTime":null,"sendTime":"2021-01-11 10:20:03"}
     */
    var id: String = ""

    //1.聊天消息 2消息已接收 3消息已读 0心跳
    var action = -1
    var msg: MsgBean? = null

    class MsgBean : Serializable {
        /**
         * id : 5594be867ae04ccfb9cddf525f5558da
         * msgType : 0
         * senderUserId : 1309
         * receiverType : 1
         * receiverUserId : 1457
         * receiverGroupId : null
         * message : 饿的啊啊啊
         * createTime : null
         * sendTime : 2021-01-11 10:20:03
         */
        var id: String = ""

        // TEXT(0, "文字"),
        // PIC(1, "图片"),
        // VOICE(2, "语音"),
        // VIDEO(3, "图片"),
        // GOODS(4, "商品"),
        // ORDER(5, "订单"),
        // CARD(6, "名片");

        var msgType = -1
        var senderUserId = -1

        //发送者名称
        var sendName = ""

        //1为单聊 2为群聊
        var receiverType = -1
        var receiverUserId: Int? = null
        var receiverGroupId: Int? = null
        var message: String = ""
        var createTime: Any? = null
        var sendTime: String = ""

        /***消息状态 0 为 没问题 1为正在发送 2为发送失败*/
        var msgStatus = 0

        //声音播放
        var voicePlay = false

        //已读未读
        var messageRead = false
        var linkIdList:ArrayList<Int>?=null
        var onLineList:ArrayList<Int>?=null
        var readTimes:ArrayList<ReadTimesBean>?=null
    }

    class ReadTimesBean{
        var userId=0
        var readTime=0L
    }
}