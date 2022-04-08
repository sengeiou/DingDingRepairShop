package com.android.ctgapp.service

import android.app.*
import android.content.Context
import android.content.Intent
import android.os.*
import android.util.Log
import androidx.core.app.NotificationCompat
import com.android.ctgapp.BuildConfig.SOCKET_URL
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.message.chart.CurrentChartActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.callback.MessageManager
import com.android.ctgapp.entity.chart.*
import com.android.ctgapp.enum.chart.MsgTypeEnum
import com.android.ctgapp.event.MessageIsRead
import com.android.ctgapp.event.OnLineRefresh
import com.android.ctgapp.sql.AppDatabase
import com.android.ctgapp.util.*
import com.android.ctgapp.util.chart.ThreadPoolManager
import org.greenrobot.eventbus.EventBus
import org.java_websocket.enums.ReadyState
import org.java_websocket.handshake.ServerHandshake
import org.jetbrains.anko.runOnUiThread
import java.net.URI

class AppService : Service() {
    var client: WebSocketClient? = null
    private val mBinder = LocalBinder()

    //操作数据库
    private val chartDao: CurrentChartDao by lazy { AppDatabase.getDatabase(BaseApplication.getContext()).currentChartDao() }
    private val chartListDao: ChartListDao by lazy { AppDatabase.getDatabase(BaseApplication.getContext()).chartListDao() }
    private val noticeId = 100
    private val handler = Handler()
    private val manager by lazy { getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager }

    /**检查在线状态*/
    fun checkUserOnline() {
        if (client != null) {
            if (client!!.isClosed) {
                //client!!.reconnectBlocking()
                client!!.reconnect()
            } else {
                val b = GetOnLineEntity()
                val c = GetOnLineEntity.MsgBean()
                c.linkIdList = BaseApplication.allFriendIds
                b.msg = c
                val a = getGson().toJson(b)
                try {
                    client?.send(a)
                } catch (e: java.lang.Exception) {
                    initWebSocket()
                }
            }
        } else {
            initWebSocket()
        }
    }

    //检测在线
    private val onLineCheck = object : Runnable {
        override fun run() {
            checkUserOnline()
            handler.postDelayed(this, 15000)
        }
    }


    //心跳包
    private val heart = object : Runnable {
        override fun run() {
            if (client != null) {
                if (client!!.isClosed) {
                    //client!!.reconnectBlocking()
                    client!!.reconnect()
                } else {
                    //发送心跳包
                    val msg = getGson().toJson(HeartPackageEntity())

                    try {
                        client?.send(msg)
//                        //测试数据
//                        val b = GetOnLineEntity()
//                        val c = GetOnLineEntity.MsgBean()
//                        c.linkIdList = BaseApplication.allFriendIds
//                        b.msg = c
//                        val a = getGson().toJson(b)
//                        MyLog.d("我发送的在线请求:$a")
//                        handler.postDelayed({
//                            client?.send(a)
//                        }, 1000)
//
//
                    } catch (e: java.lang.Exception) {
                        initWebSocket()
                    }
                }
            } else {
                initWebSocket()
            }
            handler.postDelayed(this, 10000)
        }
    }

    //服务和外界沟通的桥梁
    inner class LocalBinder : Binder() {
        /**检测用户在线状态*/
        fun checkOnline() {
            checkUserOnline()
        }

        /**发送消息*/
        fun sendMessage(msg: String) {
            sendMeg(msg)
        }

        /**将消息存为消息列表 存入数据库*/
        fun handlerList(msg: ChartResult) {
            handlerChartList(msg)
        }

        /**重新连接socket*/
        fun initSocket() {
            ThreadPoolManager.execute {
                client?.close()
                client = null
                initWebSocket()
            }
        }

        /**关闭连接*/
        fun closeSocket() {
            ThreadPoolManager.execute {
                client?.close()
                handler.removeCallbacksAndMessages(null)
            }
        }
    }

    override fun onBind(intent: Intent?): IBinder {
        return mBinder
    }

    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            //创建渠道的方法只会在第一次执行的时候调用
            val channel2 = NotificationChannel("safe", "常驻通知请勿关闭", NotificationManager.IMPORTANCE_DEFAULT)
            val notificationChannel = NotificationChannel("message", "消息通知", NotificationManager.IMPORTANCE_HIGH)
            manager.createNotificationChannel(notificationChannel)
            manager.createNotificationChannel(channel2)
        }

//        MyLog.d("创建服务")
//        initWebSocket()


        //如果API大于18，需要弹出一个可见通知
        val builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Notification.Builder(this, "safe")
        } else {
            Notification.Builder(this)
        }
        builder.setSmallIcon(R.drawable.logo_app)
        val title = "${resources.getString(R.string.app_name)} APP正在运行,请就勿关闭此通知"
        builder.setContentTitle(title)
        startForeground(noticeId, builder.build())
    }


    /**
     * 发送通知
     *
     * @param content
     */
    private fun sendNotification(sender: String, content: String, otherId: Int, msgType: Int) {
        //如果当前页面不是聊天页面就发送通知并点击进入聊天室
        if (!ActivityForeground.isForeground(BaseApplication.getContext(), CurrentChartActivity::class.java.name)) {
            val builder: NotificationCompat.Builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationCompat.Builder(this, "message")
            } else {
                NotificationCompat.Builder(this)
            }
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(MyConstants.OTHER_ID, otherId)
            intent.putExtra(MyConstants.FROM_SERVICE, true)
            val lastMsg: String = when (msgType) {
                MsgTypeEnum.TEXT.type -> content
                MsgTypeEnum.PIC.type -> "[图片]"
                MsgTypeEnum.VOICE.type -> "[语音]"
                MsgTypeEnum.VIDEO.type -> "[视频]"
                MsgTypeEnum.CARD.type -> "[名片]"
                MsgTypeEnum.ORDER.type -> "[订单]"
                MsgTypeEnum.GOODS.type -> "[商品]"
                else -> "[未知]"
            }
            val pendingIntent = PendingIntent.getActivity(this, 100, intent, PendingIntent.FLAG_ONE_SHOT)
            builder.setContentTitle(sender)
                .setContentText("内容:$lastMsg")
            builder.setSmallIcon(R.drawable.logo_app)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build()
            manager.notify(1, builder.build())
        }
    }

    /***发送信息*/
    fun sendMeg(msg: String) {
        if (client == null) {
            initWebSocket()
            client?.send(msg)
        } else {
            if (client!!.isOpen) {
                client?.send(msg)
            } else {
                connect(msg)
            }
        }
    }

    /***将消息状态改为发送失败*/
    private fun changeMsgStatusToError(str: String?) {
        val data = getGson().fromJson(str, ChartResult::class.java)
        when (data.action) {
            //发出去的消息
            1 -> {
                data.msg?.let { _ ->
                    MessageManager.sendMsgError(data.id)
                }
            }
            //不会出现次状态
            2 -> {
            }
        }
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_STICKY
    }

    //将收到的聊天消息存入数据库
    private fun saveMsgToDatabase(msg: ChartResult.MsgBean, msgId: String) {
        val entity = CurrentChartEntity(
            msgId,
            msg.senderUserId,
            msg.receiverUserId,
            msg.receiverGroupId,
            msg.msgType,
            msg.receiverType,
            msg.sendTime,
            msg.message,
            System.currentTimeMillis(),
            0,
            BaseApplication.userId,
            0
        )
        chartDao.insertChart(entity)
    }

    //处理聊天列表
    fun handlerChartList(msg: ChartResult) {
        ThreadPoolManager.execute {
            //先告诉服务器我收到消息了 否则每次连接socket都会重复发送
            val map = HashMap<String, String>()
            map["id"] = msg.id
            map["action"] = "2"
            sendMeg(getGson().toJson(map))
            //通知聊天列表变更
            val intent = Intent()
            msg.msg?.let {
                val lastMsg: String = when (it.msgType) {
                    MsgTypeEnum.TEXT.type -> it.message
                    MsgTypeEnum.PIC.type -> "[图片]"
                    MsgTypeEnum.VOICE.type -> "[语音]"
                    MsgTypeEnum.VIDEO.type -> "[视频]"
                    MsgTypeEnum.CARD.type -> "[名片]"
                    MsgTypeEnum.ORDER.type -> "[订单]"
                    MsgTypeEnum.GOODS.type -> "[商品]"
                    else -> "[未知]"
                }
                //如果聊天发送者为自己就去查询接收者的列表
                val bean: ChartListEntity? = if (it.senderUserId == BaseApplication.userId) {
                    chartListDao.findChartFromList(it.receiverUserId!!, BaseApplication.userId)
                } else {
                    chartListDao.findChartFromList(it.senderUserId, BaseApplication.userId)
                }
                //当前聊天不存在 创建聊天
                if (bean == null) {
                    val otherId = if (it.senderUserId == BaseApplication.userId) it.receiverUserId else it.senderUserId
                    //新消息如果是自己发的就是0个未读,如果是别人发的就是1个未读
                    val unreadMsg = if (it.senderUserId == BaseApplication.userId) 0 else 1
                    //单聊
                    val chartListEntity = ChartListEntity(
                        otherId,
                        "",
                        "",
                        null,
                        lastMsg.handlerNull(),
                        System.currentTimeMillis(),
                        unreadMsg,
                        BaseApplication.companyName,
                        BaseApplication.userId
                    )
                    chartListDao.insertChartList(chartListEntity)
                    //通知更新消息列表
                    intent.action = "com.chart_list.broadcast"
                } else {
                    bean.lastMsg = lastMsg
                    bean.lastMsgTime = System.currentTimeMillis()
                    //如果发送者ID就是当前聊天的ID那么设置聊天未读消息为0
                    if (BaseApplication.currentTalkTo == msg.msg?.senderUserId || BaseApplication.currentTalkTo == msg.msg?.receiverUserId || BaseApplication.userId == msg.msg?.senderUserId) {
                        bean.unRedMsg = 0
                    } else {
                        bean.unRedMsg = bean.unRedMsg + 1
                    }
                    chartListDao.updateChartList(bean)
                    //通知更新消息列表
                    intent.action = "com.chart_list.broadcast"
                }
            }
            intent.putExtra("message", msg)
            sendBroadcast(intent)
            MessageManager.newMessage(msg.msg!!)
        }
    }
    //重连10次之后放弃
    var clientReconnectCount=0

    fun initWebSocket() {
        clientReconnectCount++
        if (clientReconnectCount>10){
            return
        }
        val uri = URI.create(SOCKET_URL + BaseApplication.userToken)

        client = object : WebSocketClient(uri) {
            override fun onOpen(handshakedata: ServerHandshake) {
                super.onOpen(handshakedata)
            }

            override fun onMessage(message: String) {
                super.onMessage(message)
                val data = getGson().fromJson(message, ChartResult::class.java)
                when (data.action) {
                    //接收到的消息
                    1 -> {
                        data.msg?.let { msg ->
                            //发送一个前台通知
                            sendNotification(msg.sendName, msg.message, msg.senderUserId, msg.msgType)
                            //将聊天内容存入数据库
                            saveMsgToDatabase(msg, data.id)
                            //将聊天内容存入历史列表
                            handlerChartList(data)
                        }
                    }
                    //表示服务器收到发送过去的消息表示发送出去的消息接收到了 如果服务器接收到了 就存入数据库
                    2 -> {
                        //将消息改为已收到
                        ThreadPoolManager.execute {
                            chartDao.findChartById(data.id)?.let {
                                //将状态改为正常
                                it.msgStatus = 0
                                chartDao.updateChart(it)
                            }
                            //通知当前聊天页面 消息服务器已经收到了
                            MessageManager.changeMessageToReceive(data.id)
                        }
                    }
                    0 -> {
                        //心跳过后发送检测好友在线


                    }
                    3 -> {
                        //消息已读
                        data.msg?.receiverUserId?.let { otherId ->
                            val chartList = chartDao.loadChartByOtherId(otherId, BaseApplication.userId)
                            chartList.forEach { bean ->
                                if (bean.read == 0) {
                                    bean.read = 1
                                    chartDao.updateChart(bean)
                                }else{
                                    return@forEach
                                }
                            }
                            EventBus.getDefault().post(MessageIsRead())
                        }
                    }
                    4 -> {
                        //检测在线的人
                        data.msg?.onLineList?.let {
                            MyLog.e("当前在线都有:$it")
                            BaseApplication.onLineFriendIds.clear()
                            BaseApplication.onLineFriendIds.addAll(it)
                        }
                        EventBus.getDefault().post(OnLineRefresh())
                    }
                    6->{
                        //最近聊天列表中最后一次已读的时间
                        data.msg?.readTimes?.forEach {bean->
                            chartDao.changeRead(bean.userId,BaseApplication.userId,bean.readTime)
                        }
                    }
                    //10为系统消息 不用管
                }
            }

            override fun onClose(code: Int, reason: String, remote: Boolean) {
                super.onClose(code, reason, remote)
                //3秒重连一次
            }
        }

        try {
            ThreadPoolManager.execute {
                client?.let {
                    if (!it.isOpen) {
                        it.connectBlocking()
                    }
                }
            }
        } catch (e: java.lang.Exception) {
            Log.d("日志", "连接错误${e.message}")
        }
        handler.removeCallbacksAndMessages(null)
        handler.postDelayed(heart, 10000)
        //十五秒检测一次在线状态
        handler.postDelayed(onLineCheck, 3000)
    }

    private fun connect(msg: String?) {
        ThreadPoolManager.execute {
            try {
                client?.let {
                    if (it.isClosed || !it.isOpen) {
                        //之前从未连接就连接 否则就重连
                        if (it.readyState == ReadyState.NOT_YET_CONNECTED) {
                            it.connectBlocking()
                        } else {
                            it.reconnectBlocking()
                        }

                        if (it.isOpen && msg != null && msg.isNotEmpty()) {
                            it.send(msg)
                        }
                        if (it.isClosed || !it.isOpen) {
                            //消息没有发送出去将状态改为发送失败 并通知页面刷新数据
                            changeMsgStatusToError(msg)
                            runOnUiThread {
                                showToast("抱歉服务未连接")
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                changeMsgStatusToError(msg)
                runOnUiThread {
                    showToast("消息服务异常,请稍后再试")
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
        // 如果Service被杀死，干掉通知
        val mManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        mManager.cancel(noticeId)
        MyLog.d("DaemonService---->onDestroy，前台service被杀死")
        // 重启自己
        val intent = Intent(applicationContext, AppService::class.java)
        startService(intent)
    }
}