package com.android.ctgapp.widget;

import java.lang.System;

/**
 * 创建时间:2019/6/21
 * @author LiBW
 * 描述:自定义Toast
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/widget/CustomToast;", "Landroid/widget/Toast;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "Companion", "app_ctgRelease"})
public final class CustomToast extends android.widget.Toast {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.widget.CustomToast.Companion Companion = null;
    private static com.android.ctgapp.widget.CustomToast mToast;
    
    public CustomToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/android/ctgapp/widget/CustomToast$Companion;", "", "()V", "mToast", "Lcom/android/ctgapp/widget/CustomToast;", "showToast", "", "context", "Landroid/content/Context;", "msg", "", "app_ctgRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void showToast(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
        }
    }
}