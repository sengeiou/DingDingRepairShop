package com.android.ctgapp.callback

import com.android.ctgapp.entity.chart.ChartResult

object MessageManager {
    private var listeners = ArrayList<MessageListener>()

    fun removeCallback(listener: MessageListener){
        if (listener in listeners){
            listeners.remove(listener)
        }
    }

    fun setCallback(listener: MessageListener) {
        listeners.add(listener)
    }

    fun newMessage(message: ChartResult.MsgBean) {
        listeners.forEach {
            it.newMsg(message)
        }
    }

    fun changeMessageToReceive(msgId: String) {
        listeners.forEach {
            it.msgReceive(msgId)
        }
    }
    fun sendMsgError(msgId: String) {
        listeners.forEach {
            it.sendMsgError(msgId)
        }

    }

}