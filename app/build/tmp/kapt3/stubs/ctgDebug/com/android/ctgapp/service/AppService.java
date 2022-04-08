package com.android.ctgapp.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001CB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0006\u0010+\u001a\u00020(J\u0012\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010*H\u0002J\u000e\u0010.\u001a\u00020(2\u0006\u0010-\u001a\u00020/J\u0006\u00100\u001a\u00020(J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020(H\u0016J\b\u00106\u001a\u00020(H\u0016J\"\u00107\u001a\u00020\u00152\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u0015H\u0016J\u0018\u0010:\u001a\u00020(2\u0006\u0010-\u001a\u00020;2\u0006\u0010<\u001a\u00020*H\u0002J\u000e\u0010=\u001a\u00020(2\u0006\u0010-\u001a\u00020*J(\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u00020*2\u0006\u0010A\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u0015H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00060\u001fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/android/ctgapp/service/AppService;", "Landroid/app/Service;", "()V", "chartDao", "Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "getChartDao", "()Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "chartDao$delegate", "Lkotlin/Lazy;", "chartListDao", "Lcom/android/ctgapp/entity/chart/ChartListDao;", "getChartListDao", "()Lcom/android/ctgapp/entity/chart/ChartListDao;", "chartListDao$delegate", "client", "Lcom/android/ctgapp/service/WebSocketClient;", "getClient", "()Lcom/android/ctgapp/service/WebSocketClient;", "setClient", "(Lcom/android/ctgapp/service/WebSocketClient;)V", "clientReconnectCount", "", "getClientReconnectCount", "()I", "setClientReconnectCount", "(I)V", "handler", "Landroid/os/Handler;", "heart", "Ljava/lang/Runnable;", "mBinder", "Lcom/android/ctgapp/service/AppService$LocalBinder;", "manager", "Landroid/app/NotificationManager;", "getManager", "()Landroid/app/NotificationManager;", "manager$delegate", "noticeId", "onLineCheck", "changeMsgStatusToError", "", "str", "", "checkUserOnline", "connect", "msg", "handlerChartList", "Lcom/android/ctgapp/entity/chart/ChartResult;", "initWebSocket", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "flags", "startId", "saveMsgToDatabase", "Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;", "msgId", "sendMeg", "sendNotification", "sender", "content", "otherId", "msgType", "LocalBinder", "app_ctgDebug"})
public final class AppService extends android.app.Service {
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.service.WebSocketClient client;
    private final com.android.ctgapp.service.AppService.LocalBinder mBinder = null;
    private final kotlin.Lazy chartDao$delegate = null;
    private final kotlin.Lazy chartListDao$delegate = null;
    private final int noticeId = 100;
    private final android.os.Handler handler = null;
    private final kotlin.Lazy manager$delegate = null;
    private final java.lang.Runnable onLineCheck = null;
    private final java.lang.Runnable heart = null;
    private int clientReconnectCount = 0;
    
    public AppService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.service.WebSocketClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.service.WebSocketClient p0) {
    }
    
    private final com.android.ctgapp.entity.chart.CurrentChartDao getChartDao() {
        return null;
    }
    
    private final com.android.ctgapp.entity.chart.ChartListDao getChartListDao() {
        return null;
    }
    
    private final android.app.NotificationManager getManager() {
        return null;
    }
    
    /**
     * 检查在线状态
     */
    public final void checkUserOnline() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * 发送通知
     *
     * @param content
     */
    private final void sendNotification(java.lang.String sender, java.lang.String content, int otherId, int msgType) {
    }
    
    /**
     * *发送信息
     */
    public final void sendMeg(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    /**
     * *将消息状态改为发送失败
     */
    private final void changeMsgStatusToError(java.lang.String str) {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void saveMsgToDatabase(com.android.ctgapp.entity.chart.ChartResult.MsgBean msg, java.lang.String msgId) {
    }
    
    public final void handlerChartList(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.ChartResult msg) {
    }
    
    public final int getClientReconnectCount() {
        return 0;
    }
    
    public final void setClientReconnectCount(int p0) {
    }
    
    public final void initWebSocket() {
    }
    
    private final void connect(java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lcom/android/ctgapp/service/AppService$LocalBinder;", "Landroid/os/Binder;", "(Lcom/android/ctgapp/service/AppService;)V", "checkOnline", "", "closeSocket", "handlerList", "msg", "Lcom/android/ctgapp/entity/chart/ChartResult;", "initSocket", "sendMessage", "", "app_ctgDebug"})
    public final class LocalBinder extends android.os.Binder {
        
        public LocalBinder() {
            super();
        }
        
        /**
         * 检测用户在线状态
         */
        public final void checkOnline() {
        }
        
        /**
         * 发送消息
         */
        public final void sendMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
        }
        
        /**
         * 将消息存为消息列表 存入数据库
         */
        public final void handlerList(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.entity.chart.ChartResult msg) {
        }
        
        /**
         * 重新连接socket
         */
        public final void initSocket() {
        }
        
        /**
         * 关闭连接
         */
        public final void closeSocket() {
        }
    }
}