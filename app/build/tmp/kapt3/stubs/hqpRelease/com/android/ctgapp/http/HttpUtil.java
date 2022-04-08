package com.android.ctgapp.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J*\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0011J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nJ \u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001J4\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/http/HttpUtil;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "commonResult", "", "getRequest", "Lokhttp3/Request;", "result", "Lcom/android/ctgapp/http/HttpResult;", "getHandlerError", "context", "Lcom/android/ctgapp/base/BaseActivityV2;", "url", "", "block", "Lkotlin/Function1;", "getHttp", "postHttpWithBody", "any", "postWithBodyHandlerError", "app_hqpRelease"})
public final class HttpUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.http.HttpUtil INSTANCE = null;
    private static okhttp3.OkHttpClient client;
    
    private HttpUtil() {
        super();
    }
    
    public final void getHttp(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.http.HttpResult result) {
    }
    
    public final void getHandlerError(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.base.BaseActivityV2 context, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> block) {
    }
    
    public final void postWithBodyHandlerError(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.base.BaseActivityV2 context, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Object any, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> block) {
    }
    
    public final void postHttpWithBody(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.http.HttpResult result, @org.jetbrains.annotations.Nullable()
    java.lang.Object any) {
    }
    
    private final void commonResult(okhttp3.Request getRequest, com.android.ctgapp.http.HttpResult result) {
    }
}