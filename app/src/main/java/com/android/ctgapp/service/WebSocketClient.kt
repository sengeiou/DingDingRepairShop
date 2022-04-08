package com.android.ctgapp.service

import com.android.ctgapp.util.MyLog
import org.java_websocket.client.WebSocketClient
import org.java_websocket.drafts.Draft_6455
import org.java_websocket.handshake.ServerHandshake
import java.net.URI

open class WebSocketClient(serverUri: URI) : WebSocketClient(serverUri, Draft_6455()) {

    /***在webSocket连接开启时调用*/
    override fun onOpen(handshakedata: ServerHandshake) {
        MyLog.d("webSocket开启连接")
    }



    /***接收到消息时调用*/
    override fun onMessage(message: String) {

    }

    /***连接断开时调用*/
    override fun onClose(code: Int, reason: String, remote: Boolean) {
        MyLog.d("webSocket断开连接,code:$code")

    }

    /***连接出错时调用*/
    override fun onError(ex: Exception) {
        MyLog.d("webSocket连接失败:${ex.message}")
    }
}