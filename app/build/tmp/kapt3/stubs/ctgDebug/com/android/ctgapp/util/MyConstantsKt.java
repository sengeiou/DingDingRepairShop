package com.android.ctgapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0012\u0010\u0019\u001a\u00020\u0018*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\"\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\"\u001a\u0010\u0012\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"PERMISSION_APPLY_CODE", "", "THE_FALSE", "THE_TRUE", "TakePhotoPermissions", "", "", "getTakePhotoPermissions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "globalCashChangeNo", "getGlobalCashChangeNo", "()Ljava/lang/String;", "setGlobalCashChangeNo", "(Ljava/lang/String;)V", "globalWxAppId", "getGlobalWxAppId", "setGlobalWxAppId", "wxChatFrom", "getWxChatFrom", "()I", "setWxChatFrom", "(I)V", "initLogin", "", "handlerVisibility", "Landroid/view/View;", "visibility", "", "app_ctgDebug"})
public final class MyConstantsKt {
    
    /**
     * 作者:LiBW
     * 创建日期: 2020/10/9
     * 描述: 常量类
     */
    public static final int PERMISSION_APPLY_CODE = 100;
    public static final int THE_TRUE = 1;
    public static final int THE_FALSE = 0;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] TakePhotoPermissions = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String globalWxAppId = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String globalCashChangeNo = "";
    
    /**
     * *微信支付来自哪里1 订单支付 2余额充值 3白条还款(订单页面单笔还款)
     */
    private static int wxChatFrom = 0;
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String[] getTakePhotoPermissions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getGlobalWxAppId() {
        return null;
    }
    
    public static final void setGlobalWxAppId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getGlobalCashChangeNo() {
        return null;
    }
    
    public static final void setGlobalCashChangeNo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public static final int getWxChatFrom() {
        return 0;
    }
    
    public static final void setWxChatFrom(int p0) {
    }
    
    public static final void initLogin() {
    }
    
    public static final void handlerVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View $this$handlerVisibility, boolean visibility) {
    }
}