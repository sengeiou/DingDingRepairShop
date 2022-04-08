package com.android.ctgapp.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001f"}, d2 = {"Lcom/android/ctgapp/widget/SelectPartWidget;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "listener", "Lcom/android/ctgapp/widget/SelectPartWidget$SelectPartCallBack;", "getListener", "()Lcom/android/ctgapp/widget/SelectPartWidget$SelectPartCallBack;", "setListener", "(Lcom/android/ctgapp/widget/SelectPartWidget$SelectPartCallBack;)V", "mDeleteBTN", "Landroid/widget/ImageView;", "getMDeleteBTN", "()Landroid/widget/ImageView;", "setMDeleteBTN", "(Landroid/widget/ImageView;)V", "mTextView", "Landroid/widget/TextView;", "getMTextView", "()Landroid/widget/TextView;", "setMTextView", "(Landroid/widget/TextView;)V", "setOnClick", "", "textSet", "str", "", "SelectPartCallBack", "app_hqpDebug"})
public final class SelectPartWidget extends android.widget.LinearLayout {
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView mTextView;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView mDeleteBTN;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.widget.SelectPartWidget.SelectPartCallBack listener;
    private java.util.HashMap _$_findViewCache;
    
    public SelectPartWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getMTextView() {
        return null;
    }
    
    public final void setMTextView(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getMDeleteBTN() {
        return null;
    }
    
    public final void setMDeleteBTN(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.widget.SelectPartWidget.SelectPartCallBack getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.widget.SelectPartWidget.SelectPartCallBack p0) {
    }
    
    public final void textSet(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.SelectPartWidget.SelectPartCallBack listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/android/ctgapp/widget/SelectPartWidget$SelectPartCallBack;", "", "removeView", "", "tag", "", "partName", "app_hqpDebug"})
    public static abstract interface SelectPartCallBack {
        
        public abstract void removeView(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String partName);
    }
}