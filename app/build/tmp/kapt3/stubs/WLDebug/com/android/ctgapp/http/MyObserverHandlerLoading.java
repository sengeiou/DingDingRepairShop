package com.android.ctgapp.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/http/MyObserverHandlerLoading;", "Lio/reactivex/Observer;", "Lokhttp3/ResponseBody;", "context", "Landroid/content/Context;", "loading", "Lcom/android/ctgapp/widget/dialog/LoadingDialog;", "refresh", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "block", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lcom/android/ctgapp/widget/dialog/LoadingDialog;Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;Lkotlin/jvm/functions/Function1;)V", "onComplete", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "app_WLDebug"})
public class MyObserverHandlerLoading implements io.reactivex.Observer<okhttp3.ResponseBody> {
    private final android.content.Context context = null;
    private final com.android.ctgapp.widget.dialog.LoadingDialog loading = null;
    private final com.scwang.smartrefresh.layout.SmartRefreshLayout refresh = null;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> block = null;
    
    public MyObserverHandlerLoading(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.android.ctgapp.widget.dialog.LoadingDialog loading, @org.jetbrains.annotations.Nullable()
    com.scwang.smartrefresh.layout.SmartRefreshLayout refresh, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> block) {
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