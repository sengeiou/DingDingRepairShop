package com.android.ctgapp.callback

import com.android.ctgapp.entity.chart.ChartResult

interface MessageListener {
    fun newMsg(msg: ChartResult.MsgBean)
    fun msgReceive(msgId:String)
    fun sendMsgError(msgId:String)
}