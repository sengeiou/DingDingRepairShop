package com.android.ctgapp.widget;

import java.lang.System;

/**
 * 作者:LiBW
 * 描述: 滚动
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/android/ctgapp/widget/MarqueeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isFocused", "", "onFocusChanged", "", "focused", "direction", "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onWindowFocusChanged", "hasWindowFocus", "app_ctgRelease"})
public final class MarqueeTextView extends androidx.appcompat.widget.AppCompatTextView {
    private java.util.HashMap _$_findViewCache;
    
    public MarqueeTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attr) {
        super(null);
    }
    
    @java.lang.Override()
    public boolean isFocused() {
        return false;
    }
    
    @java.lang.Override()
    protected void onFocusChanged(boolean focused, int direction, @org.jetbrains.annotations.Nullable()
    android.graphics.Rect previouslyFocusedRect) {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasWindowFocus) {
    }
}