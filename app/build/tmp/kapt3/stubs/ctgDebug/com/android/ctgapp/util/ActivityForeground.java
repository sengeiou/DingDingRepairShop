package com.android.ctgapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/android/ctgapp/util/ActivityForeground;", "", "()V", "isForeground", "", "activity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "className", "", "app_ctgDebug"})
public final class ActivityForeground {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.util.ActivityForeground INSTANCE = null;
    
    private ActivityForeground() {
        super();
    }
    
    /**
     * 判断某个界面是否在前台
     *
     * @param activity 要判断的Activity
     * @return 是否在前台显示
     */
    public final boolean isForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return false;
    }
    
    /**
     * 判断某个界面是否在前台
     * @param context   Context
     * @param className 界面的类名
     * @return 是否在前台显示
     */
    public final boolean isForeground(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String className) {
        return false;
    }
}