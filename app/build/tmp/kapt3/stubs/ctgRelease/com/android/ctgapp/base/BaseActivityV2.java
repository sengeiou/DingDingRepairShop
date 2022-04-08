package com.android.ctgapp.base;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/8/15
 * 描述:Activity基类
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH&J\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\nH&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\nH\u0014J\u0006\u0010\u0017\u001a\u00020\nR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/android/ctgapp/base/BaseActivityV2;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "loading", "Lcom/android/ctgapp/widget/dialog/LoadingDialog;", "getLoading", "()Lcom/android/ctgapp/widget/dialog/LoadingDialog;", "loading$delegate", "Lkotlin/Lazy;", "changeStatusIconColor", "", "isDark", "", "changeTransparentStatusBar", "click", "dismissLoading", "event", "getLayout", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showLoading", "app_ctgRelease"})
public abstract class BaseActivityV2 extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loading$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivityV2() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.widget.dialog.LoadingDialog getLoading() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showLoading() {
    }
    
    public final void dismissLoading() {
    }
    
    /**
     * 获取布局
     */
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getLayout();
    
    /**
     * 布局加载完毕处理操作
     */
    public abstract void event();
    
    /**
     * 点击事件
     */
    public abstract void click();
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * 切换为透明状态栏
     */
    private final void changeTransparentStatusBar() {
    }
    
    /**
     * 切换状态栏图标颜色
     * @param isDark true为黑色 false为白色
     */
    protected final void changeStatusIconColor(boolean isDark) {
    }
}