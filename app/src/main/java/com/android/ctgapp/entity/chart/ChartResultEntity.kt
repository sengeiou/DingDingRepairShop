package com.android.ctgapp.entity.chart

import java.io.Serializable

class ChartResultEntity : Serializable {
    /**
     * id : 839e0ac0b22a4f0ba47f6a30a636e1b2
     * action : 1
     * msg : {"id":"5594be867ae04ccfb9cddf525f5558da","msgType":0,"senderUserId":1309,"receiverType":1,"receiverUserId":1457,"receiverGroupId":null,"message":"饿的啊啊啊","createTime":null,"sendTime":"2021-01-11 10:20:03"}
     */
    var id: String = ""
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
        var msgType = -1
        var senderUserId = -1
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
    }
}