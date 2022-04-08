package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 3/18/21
 * 描述:日期选择dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog;", "Landroidx/fragment/app/DialogFragment;", "listener", "Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog$Callback;", "year", "", "moth", "(Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog$Callback;Ljava/lang/String;Ljava/lang/String;)V", "month", "", "getMonth", "()I", "getYear", "getLayout", "hidDay", "", "mDatePicker", "Landroid/widget/DatePicker;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Callback", "app_WLDebug"})
public final class MyDatePickerDialog extends androidx.fragment.app.DialogFragment {
    private final com.android.ctgapp.widget.dialog.MyDatePickerDialog.Callback listener = null;
    private final int year = 0;
    private final int month = 0;
    private java.util.HashMap _$_findViewCache;
    
    public MyDatePickerDialog(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.MyDatePickerDialog.Callback listener, @org.jetbrains.annotations.NotNull()
    java.lang.String year, @org.jetbrains.annotations.NotNull()
    java.lang.String moth) {
        super();
    }
    
    public final int getYear() {
        return 0;
    }
    
    public final int getMonth() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * 隐藏DatePicker中的日期显示
     *
     * @param mDatePicker
     */
    private final void hidDay(android.widget.DatePicker mDatePicker) {
    }
    
    public final int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog$Callback;", "", "getTime", "", "year", "", "month", "app_WLDebug"})
    public static abstract interface Callback {
        
        public abstract void getTime(int year, int month);
    }
}