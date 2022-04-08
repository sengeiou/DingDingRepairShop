package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 3/18/21
 * 描述:日期选择dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\fH\u0016J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog;", "Lcom/android/ctgapp/base/BaseDialogFragment;", "listener", "Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog$Callback;", "(Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog$Callback;)V", "loading", "Lcom/android/ctgapp/widget/dialog/LoadingDialog;", "getLoading", "()Lcom/android/ctgapp/widget/dialog/LoadingDialog;", "loading$delegate", "Lkotlin/Lazy;", "dismissDialog", "", "getLayout", "", "hidDay", "mDatePicker", "Landroid/widget/DatePicker;", "onDestroyView", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callback", "app_ctgRelease"})
public final class MyDatePickerDialog extends com.android.ctgapp.base.BaseDialogFragment {
    private final com.android.ctgapp.widget.dialog.MyDatePickerDialog.Callback listener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loading$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public MyDatePickerDialog(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.MyDatePickerDialog.Callback listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.widget.dialog.LoadingDialog getLoading() {
        return null;
    }
    
    @java.lang.Override()
    public void viewIsCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 隐藏DatePicker中的日期显示
     *
     * @param mDatePicker
     */
    private final void hidDay(android.widget.DatePicker mDatePicker) {
    }
    
    private final void dismissDialog() {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog$Callback;", "", "getTime", "", "year", "", "month", "app_ctgRelease"})
    public static abstract interface Callback {
        
        public abstract void getTime(int year, int month);
    }
}