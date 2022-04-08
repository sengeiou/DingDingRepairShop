package com.android.ctgapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u0010"}, d2 = {"Lcom/android/ctgapp/util/MyPermissionUtil;", "", "()V", "getAppDetailSettingIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getBottomNavigatorHeight", "", "getPhoneBrand", "", "jumpToPermissionDialog", "", "unSelect", "", "jumpToPermissionSetting", "app_WLDebug"})
public final class MyPermissionUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.util.MyPermissionUtil INSTANCE = null;
    
    private MyPermissionUtil() {
        super();
    }
    
    public final void jumpToPermissionDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> unSelect, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void jumpToPermissionSetting(android.content.Context context) {
    }
    
    private final android.content.Intent getAppDetailSettingIntent(android.content.Context context) {
        return null;
    }
    
    /**
     * 获取手机品牌
     */
    private final java.lang.String getPhoneBrand() {
        return null;
    }
    
    /**
     * 如果有底部导航栏 获取底部导航栏高度
     */
    public final int getBottomNavigatorHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
}