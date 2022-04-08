package com.android.ctgapp.activity.mine.whitebar;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/6/7
 * 描述:账单详情 页面 (提前还款 一级)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0014J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u0018H\u0014J\b\u0010%\u001a\u00020\u0018H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006&"}, d2 = {"Lcom/android/ctgapp/activity/mine/whitebar/PrepaymentActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/mine/whitebar/PrepaymentAdapter$PrepaymentCallback;", "()V", "mAdapter", "Lcom/android/ctgapp/adapter/mine/whitebar/PrepaymentAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/whitebar/PrepaymentAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityPrepaymentBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityPrepaymentBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/mine/PrepaymentEntity$DataBean$ListBean;", "mViewModel", "Lcom/android/ctgapp/activity/mine/whitebar/PrepaymentViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/whitebar/PrepaymentViewModel;", "mViewModel$delegate", "click", "", "event", "getLayout", "Landroid/widget/RelativeLayout;", "handlerCountAndButton", "onCheckBoxCheck", "position", "", "select", "", "onDestroy", "onItemSelect", "onResume", "refreshData", "app_ctgRelease"})
public final class PrepaymentActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.mine.whitebar.PrepaymentAdapter.PrepaymentCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.mine.PrepaymentEntity.DataBean.ListBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public PrepaymentActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityPrepaymentBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RelativeLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.whitebar.PrepaymentViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.whitebar.PrepaymentAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
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
    public void onCheckBoxCheck(int position, boolean select) {
    }
    
    private final void refreshData() {
    }
    
    private final void handlerCountAndButton() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}