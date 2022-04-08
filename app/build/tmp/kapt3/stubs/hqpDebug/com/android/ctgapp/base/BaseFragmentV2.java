package com.android.ctgapp.base;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/29
 * 描述: Fragment基础类
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J&\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/base/BaseFragmentV2;", "Landroidx/fragment/app/Fragment;", "needEventBus", "", "(Z)V", "loading", "Lcom/android/ctgapp/widget/dialog/LoadingDialog;", "getLoading", "()Lcom/android/ctgapp/widget/dialog/LoadingDialog;", "loading$delegate", "Lkotlin/Lazy;", "click", "", "event", "getLayout", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "app_hqpDebug"})
public abstract class BaseFragmentV2 extends androidx.fragment.app.Fragment {
    private final boolean needEventBus = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loading$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public BaseFragmentV2() {
        super();
    }
    
    public BaseFragmentV2(boolean needEventBus) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.widget.dialog.LoadingDialog getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void event();
    
    public abstract void click();
    
    /**
     * 获取布局
     */
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getLayout(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container);
    
    @java.lang.Override()
    public void onDestroy() {
    }
}