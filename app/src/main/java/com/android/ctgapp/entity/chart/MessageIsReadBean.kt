package com.android.ctgapp.entity.chart

class MessageIsReadBean {
    var action = 3
    var msg: MsgBean? = null

    class MsgBean {
        var senderUserId = -1
    }
}