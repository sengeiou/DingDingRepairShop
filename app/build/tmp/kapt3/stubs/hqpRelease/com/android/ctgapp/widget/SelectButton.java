package com.android.ctgapp.widget;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/13
 * 描述:带下划线的button 包含select和unSelect设置 选中状态 (用户横向列表的单选)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\bJ\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/android/ctgapp/widget/SelectButton;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "click", "Lcom/android/ctgapp/widget/SelectButton$ButtonClick;", "getClick", "()Lcom/android/ctgapp/widget/SelectButton$ButtonClick;", "setClick", "(Lcom/android/ctgapp/widget/SelectButton$ButtonClick;)V", "color", "", "getColor", "()Ljava/lang/Integer;", "setColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "select", "", "setOnButtonClick", "buttonClick", "setText", "str", "", "unSelect", "ButtonClick", "app_hqpRelease"})
public final class SelectButton extends android.widget.LinearLayout {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer color;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.widget.SelectButton.ButtonClick click;
    private java.util.HashMap _$_findViewCache;
    
    public SelectButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getColor() {
        return null;
    }
    
    public final void setColor(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.widget.SelectButton.ButtonClick getClick() {
        return null;
    }
    
    public final void setClick(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.widget.SelectButton.ButtonClick p0) {
    }
    
    public final void setOnButtonClick(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.SelectButton.ButtonClick buttonClick) {
    }
    
    public final void select() {
    }
    
    public final void unSelect() {
    }
    
    private final void setText(java.lang.String str) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/android/ctgapp/widget/SelectButton$ButtonClick;", "", "onClickListener", "", "app_hqpRelease"})
    public static abstract interface ButtonClick {
        
        public abstract void onClickListener();
    }
}