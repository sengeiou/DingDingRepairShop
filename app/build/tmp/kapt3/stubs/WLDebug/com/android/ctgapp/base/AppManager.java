package com.android.ctgapp.base;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/8/15
 * 描述: Activity管理类
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/android/ctgapp/base/AppManager;", "", "()V", "activityStack", "Ljava/util/Stack;", "Landroid/app/Activity;", "addActivity", "", "activity", "currentActivity", "exitApp", "context", "Landroid/content/Context;", "finishActivity", "finishAllActivity", "Companion", "app_WLDebug"})
public final class AppManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.base.AppManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy instance$delegate = null;
    private final java.util.Stack<android.app.Activity> activityStack = null;
    
    private AppManager() {
        super();
    }
    
    /**
     * 入栈
     */
    public final void addActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * 出栈
     */
    public final void finishActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * 当前Activity
     */
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity currentActivity() {
        return null;
    }
    
    /**
     * 清理栈
     */
    public final void finishAllActivity() {
    }
    
    /**
     * 关闭APP
     */
    public final void exitApp(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/android/ctgapp/base/AppManager$Companion;", "", "()V", "instance", "Lcom/android/ctgapp/base/AppManager;", "getInstance", "()Lcom/android/ctgapp/base/AppManager;", "instance$delegate", "Lkotlin/Lazy;", "app_WLDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.ctgapp.base.AppManager getInstance() {
            return null;
        }
    }
}