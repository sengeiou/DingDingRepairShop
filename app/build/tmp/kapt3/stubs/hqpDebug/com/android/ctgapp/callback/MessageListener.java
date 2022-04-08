package com.android.ctgapp.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/android/ctgapp/callback/MessageListener;", "", "msgReceive", "", "msgId", "", "newMsg", "msg", "Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;", "sendMsgError", "app_hqpDebug"})
public abstract interface MessageListener {
    
    public abstract void newMsg(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.ChartResult.MsgBean msg);
    
    public abstract void msgReceive(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId);
    
    public abstract void sendMsgError(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId);
}