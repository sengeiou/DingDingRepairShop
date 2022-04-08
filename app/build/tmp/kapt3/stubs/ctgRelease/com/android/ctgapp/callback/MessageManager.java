package com.android.ctgapp.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/android/ctgapp/callback/MessageManager;", "", "()V", "listeners", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/callback/MessageListener;", "changeMessageToReceive", "", "msgId", "", "newMessage", "message", "Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;", "removeCallback", "listener", "sendMsgError", "setCallback", "app_ctgRelease"})
public final class MessageManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.callback.MessageManager INSTANCE = null;
    private static java.util.ArrayList<com.android.ctgapp.callback.MessageListener> listeners;
    
    private MessageManager() {
        super();
    }
    
    public final void removeCallback(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.callback.MessageListener listener) {
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.callback.MessageListener listener) {
    }
    
    public final void newMessage(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.ChartResult.MsgBean message) {
    }
    
    public final void changeMessageToReceive(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId) {
    }
    
    public final void sendMsgError(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId) {
    }
}