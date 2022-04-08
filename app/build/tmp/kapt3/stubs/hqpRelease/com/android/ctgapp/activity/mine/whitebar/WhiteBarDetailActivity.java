package com.android.ctgapp.activity.mine.whitebar;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/27
 * 描述:白条 账单详情 页面 (还款 一级页面)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020!H\u0002J\u0018\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fH\u0016J\u0010\u0010*\u001a\u00020!2\u0006\u0010\'\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020!H\u0014J\b\u0010,\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/android/ctgapp/activity/mine/whitebar/WhiteBarDetailActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/mine/whitebar/WhitBarDetailAdapter$WhitBarDetailCallback;", "()V", "allMoney", "", "billNo", "kotlin.jvm.PlatformType", "getBillNo", "()Ljava/lang/String;", "billNo$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/android/ctgapp/adapter/mine/whitebar/WhitBarDetailAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/whitebar/WhitBarDetailAdapter;", "mAdapter$delegate", "mBinding", "Lcom/android/ctgapp/databinding/ActivityWhiteBarDetailBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityWhiteBarDetailBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/mine/WhiteBarDetailEntity$DataBean$ListBean;", "mViewModel", "Lcom/android/ctgapp/activity/mine/whitebar/WhiteBarDetailViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/whitebar/WhiteBarDetailViewModel;", "mViewModel$delegate", "needInvoice", "", "click", "", "event", "getLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "handlerCountAndButton", "onCheckBoxSelect", "position", "", "select", "onItemSelect", "onResume", "refreshData", "app_hqpRelease"})
public final class WhiteBarDetailActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.mine.whitebar.WhitBarDetailAdapter.WhitBarDetailCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy billNo$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.mine.WhiteBarDetailEntity.DataBean.ListBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private boolean needInvoice = false;
    private java.lang.String allMoney = "";
    private java.util.HashMap _$_findViewCache;
    
    public WhiteBarDetailActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityWhiteBarDetailBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.LinearLayoutCompat getLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.activity.mine.whitebar.WhiteBarDetailViewModel getMViewModel() {
        return null;
    }
    
    private final java.lang.String getBillNo() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.whitebar.WhitBarDetailAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void refreshData() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onItemSelect(int position) {
    }
    
    @java.lang.Override()
    public void onCheckBoxSelect(int position, boolean select) {
    }
    
    private final void handlerCountAndButton() {
    }
}