package com.android.ctgapp.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/service/WebSocketClient;", "Lorg/java_websocket/client/WebSocketClient;", "serverUri", "Ljava/net/URI;", "(Ljava/net/URI;)V", "onClose", "", "code", "", "reason", "", "remote", "", "onError", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onMessage", "message", "onOpen", "handshakedata", "Lorg/java_websocket/handshake/ServerHandshake;", "app_ctgRelease"})
public class WebSocketClient extends org.java_websocket.client.WebSocketClient {
    
    public WebSocketClient(@org.jetbrains.annotations.NotNull()
    java.net.URI serverUri) {
        super(null);
    }
    
    /**
     * *在webSocket连接开启时调用
     */
    @java.lang.Override()
    public void onOpen(@org.jetbrains.annotations.NotNull()
    org.java_websocket.handshake.ServerHandshake handshakedata) {
    }
    
    /**
     * *接收到消息时调用
     */
    @java.lang.Override()
    public void onMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * *连接断开时调用
     */
    @java.lang.Override()
    public void onClose(int code, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, boolean remote) {
    }
    
    /**
     * *连接出错时调用
     */
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Exception ex) {
    }
}