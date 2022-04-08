package com.android.ctgapp.http;

import java.lang.System;

/**
 * 创建时间:2018/12/4
 * 作者:LiBW
 * 描述:通用Observer需要自己对代码进行try catch处理
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/android/ctgapp/http/MyObserver;", "Lio/reactivex/Observer;", "Lokhttp3/ResponseBody;", "listener", "Lcom/android/ctgapp/http/ObserverListener;", "(Lcom/android/ctgapp/http/ObserverListener;)V", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "app_WLDebug"})
public class MyObserver implements io.reactivex.Observer<okhttp3.ResponseBody> {
    private final com.android.ctgapp.http.ObserverListener listener = null;
    
    public MyObserver(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.http.ObserverListener listener) {
        super();
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @java.lang.Override()
    public void onSubscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable d) {
    }
    
    @java.lang.Override()
    public void onNext(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody t) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
}