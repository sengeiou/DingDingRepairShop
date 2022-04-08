package com.android.ctgapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u001f\u001a\u00020\u001bJ\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/android/ctgapp/util/VinKeyboardUtil;", "", "mActivity", "Landroid/app/Activity;", "edit", "Landroid/widget/EditText;", "(Landroid/app/Activity;Landroid/widget/EditText;)V", "closeAnimation", "Landroid/view/animation/Animation;", "confirmListener", "Lcom/android/ctgapp/util/VinKeyboardUtil$MyKeyBoardCallback;", "isShow", "", "()Z", "listener", "Landroid/inputmethodservice/KeyboardView$OnKeyboardActionListener;", "mContext", "Landroid/content/Context;", "mEdit", "mKeyboardView", "Landroid/inputmethodservice/KeyboardView;", "openAnimation", "vin_keyboard", "Landroid/inputmethodservice/Keyboard;", "getKeyBoardHeight", "", "hideKeyboard", "", "hideSoftInputMethod", "init", "setListener", "showKeyboard", "startAnimation", "stopAnimation", "MyKeyBoardCallback", "app_hqpRelease"})
public final class VinKeyboardUtil {
    private final android.app.Activity mActivity = null;
    private com.android.ctgapp.util.VinKeyboardUtil.MyKeyBoardCallback confirmListener;
    private final android.content.Context mContext = null;
    private final android.inputmethodservice.KeyboardView mKeyboardView = null;
    private final android.widget.EditText mEdit = null;
    
    /**
     * VIN码键盘
     */
    private final android.inputmethodservice.Keyboard vin_keyboard = null;
    
    /**
     * 判定是否是中文的正则表达式 [\\u4e00-\\u9fa5]判断一个中文 [\\u4e00-\\u9fa5]+多个中文
     */
    private final android.inputmethodservice.KeyboardView.OnKeyboardActionListener listener = null;
    private android.view.animation.Animation openAnimation;
    private android.view.animation.Animation closeAnimation;
    
    public VinKeyboardUtil(@org.jetbrains.annotations.NotNull()
    android.app.Activity mActivity, @org.jetbrains.annotations.NotNull()
    android.widget.EditText edit) {
        super();
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.util.VinKeyboardUtil.MyKeyBoardCallback confirmListener) {
    }
    
    public final boolean isShow() {
        return false;
    }
    
    /**
     * 软键盘展示
     */
    public final void showKeyboard() {
    }
    
    /**
     * 软键盘隐藏
     */
    public final void hideKeyboard() {
    }
    
    public final int getKeyBoardHeight() {
        return 0;
    }
    
    /**
     * 禁掉系统软键盘
     */
    public final void hideSoftInputMethod() {
    }
    
    private final void init() {
    }
    
    private final void startAnimation() {
    }
    
    private final void stopAnimation() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/android/ctgapp/util/VinKeyboardUtil$MyKeyBoardCallback;", "", "onConfirmClick", "", "app_hqpRelease"})
    public static abstract interface MyKeyBoardCallback {
        
        public abstract void onConfirmClick();
    }
}