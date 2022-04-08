package com.android.ctgapp.activity.login;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/30
 * 描述: 登录 页面
 * 仅仅判断登录是否过期
 * 如果登录没有过期则进入主页
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/android/ctgapp/activity/login/LoginActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "()V", "authCodeType", "", "countTimer", "Landroid/os/CountDownTimer;", "fromLeft", "Landroid/view/animation/TranslateAnimation;", "fromRight", "indexPosition", "", "mBinding", "Lcom/android/ctgapp/databinding/ActivityLoginBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityLoginBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mViewModel", "Lcom/android/ctgapp/activity/login/LoginViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/login/LoginViewModel;", "mViewModel$delegate", "showPassword", "toLeft", "toMiss", "Landroid/view/animation/AlphaAnimation;", "toRight", "toShow", "click", "", "event", "exitApp", "getLayout", "Landroid/widget/LinearLayout;", "handlerLoginType", "onBackPressed", "onDestroy", "app_ctgRelease"})
public final class LoginActivity extends com.android.ctgapp.base.BaseActivityV2 {
    private final kotlin.Lazy mBinding$delegate = null;
    private boolean authCodeType = true;
    private final kotlin.Lazy mViewModel$delegate = null;
    private int indexPosition = 0;
    private final android.os.CountDownTimer countTimer = null;
    private final android.view.animation.TranslateAnimation toLeft = null;
    private final android.view.animation.TranslateAnimation toRight = null;
    private final android.view.animation.TranslateAnimation fromRight = null;
    private final android.view.animation.TranslateAnimation fromLeft = null;
    private final android.view.animation.AlphaAnimation toMiss = null;
    private final android.view.animation.AlphaAnimation toShow = null;
    private boolean showPassword = false;
    private java.util.HashMap _$_findViewCache;
    
    public LoginActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityLoginBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.login.LoginViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void handlerLoginType() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void exitApp() {
    }
}