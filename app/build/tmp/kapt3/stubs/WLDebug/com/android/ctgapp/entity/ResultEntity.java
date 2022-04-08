package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0007R\u0018\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/android/ctgapp/entity/ResultEntity;", "T", "", "data", "status", "", "msg", "(Ljava/lang/Object;ILjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsg", "getStatus", "()I", "app_WLDebug"})
public final class ResultEntity<T extends java.lang.Object> {
    @com.google.gson.annotations.SerializedName(value = "data")
    private final T data = null;
    @com.google.gson.annotations.SerializedName(value = "status")
    private final int status = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "msg")
    private final java.lang.Object msg = null;
    
    public ResultEntity(T data, int status, @org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
        super();
    }
    
    public final T getData() {
        return null;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMsg() {
        return null;
    }
}