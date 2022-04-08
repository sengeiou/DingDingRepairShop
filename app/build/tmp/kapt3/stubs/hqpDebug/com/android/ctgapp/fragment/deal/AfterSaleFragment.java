package com.android.ctgapp.fragment.deal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020&H\u0007J\b\u0010\'\u001a\u00020 H\u0002J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001dR\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001d\u00a8\u00060"}, d2 = {"Lcom/android/ctgapp/fragment/deal/AfterSaleFragment;", "Lcom/android/ctgapp/base/BaseFragmentV2;", "()V", "_binding", "Lcom/android/ctgapp/databinding/ActivityAfterSaleBinding;", "binding", "getBinding", "()Lcom/android/ctgapp/databinding/ActivityAfterSaleBinding;", "isFinished", "", "Ljava/lang/Boolean;", "mAdapter", "Lcom/android/ctgapp/adapter/deal/AfterSaleAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/deal/AfterSaleAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean$RecordsBean;", "mViewModel", "Lcom/android/ctgapp/activity/deal/AfterSaleViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/deal/AfterSaleViewModel;", "mViewModel$delegate", "pageNum", "", "pageSize", "preSelect", "Ljava/lang/Integer;", "statueCode", "buttonClick", "", "type", "(Ljava/lang/Integer;)V", "click", "event", "eventBus", "Lcom/android/ctgapp/event/OrderRefresh;", "getData", "getLayout", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initData", "onDestroy", "app_hqpDebug"})
public final class AfterSaleFragment extends com.android.ctgapp.base.BaseFragmentV2 {
    private com.android.ctgapp.databinding.ActivityAfterSaleBinding _binding;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final int pageSize = 20;
    private int pageNum = 1;
    private java.lang.Integer statueCode;
    private java.lang.Boolean isFinished;
    private java.lang.Integer preSelect;
    private java.util.ArrayList<com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean.RecordsBean> mList;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public AfterSaleFragment() {
        super(false);
    }
    
    private final com.android.ctgapp.databinding.ActivityAfterSaleBinding getBinding() {
        return null;
    }
    
    private final com.android.ctgapp.activity.deal.AfterSaleViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.AfterSaleAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void buttonClick(java.lang.Integer type) {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void eventBus(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.OrderRefresh type) {
    }
    
    private final void initData() {
    }
    
    private final void getData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getLayout(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}