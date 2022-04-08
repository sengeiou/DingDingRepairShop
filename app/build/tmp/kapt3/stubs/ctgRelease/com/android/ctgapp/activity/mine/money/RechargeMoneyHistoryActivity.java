package com.android.ctgapp.activity.mine.money;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/12/23
 * 描述: 充值记录 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'H\u0016J\b\u0010)\u001a\u00020\u001eH\u0014J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\'H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006,"}, d2 = {"Lcom/android/ctgapp/activity/mine/money/RechargeMoneyHistoryActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog$Callback;", "()V", "mAdapter", "Lcom/android/ctgapp/adapter/mine/RechargeHistoryChildAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/RechargeHistoryChildAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityRechargeMoneyHistoryBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityRechargeMoneyHistoryBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/RechargeHistoryEntity$Data;", "mViewModel", "Lcom/android/ctgapp/activity/mine/money/MyMoneyPackageViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/money/MyMoneyPackageViewModel;", "mViewModel$delegate", "myDatePickerDialog", "Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog;", "getMyDatePickerDialog", "()Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog;", "setMyDatePickerDialog", "(Lcom/android/ctgapp/widget/dialog/MyDatePickerDialog;)V", "click", "", "event", "getData", "time", "", "getLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getTime", "year", "", "month", "onDestroy", "savetwo", "data", "app_ctgRelease"})
public final class RechargeMoneyHistoryActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.widget.dialog.MyDatePickerDialog.Callback {
    private final kotlin.Lazy mBinding$delegate = null;
    private java.util.ArrayList<com.android.ctgapp.entity.RechargeHistoryEntity.Data> mList;
    private final kotlin.Lazy mAdapter$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.widget.dialog.MyDatePickerDialog myDatePickerDialog;
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public RechargeMoneyHistoryActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityRechargeMoneyHistoryBinding getMBinding() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.RechargeHistoryChildAdapter getMAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.widget.dialog.MyDatePickerDialog getMyDatePickerDialog() {
        return null;
    }
    
    public final void setMyDatePickerDialog(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.widget.dialog.MyDatePickerDialog p0) {
    }
    
    private final com.android.ctgapp.activity.mine.money.MyMoneyPackageViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.LinearLayoutCompat getLayout() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void getData(java.lang.String time) {
    }
    
    private final java.lang.String savetwo(int data) {
        return null;
    }
    
    @java.lang.Override()
    public void getTime(int year, int month) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}