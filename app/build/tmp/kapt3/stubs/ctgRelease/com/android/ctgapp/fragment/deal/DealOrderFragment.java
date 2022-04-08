package com.android.ctgapp.fragment.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 11/14/20
 * 描述: 成交订单 页面 Fragment
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/android/ctgapp/fragment/deal/DealOrderFragment;", "Lcom/android/ctgapp/base/BaseFragment;", "Lcom/android/ctgapp/adapter/deal/OrderAdapter$OrderListener;", "()V", "mAdapter", "Lcom/android/ctgapp/adapter/deal/OrderAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/deal/OrderAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/OrderEntity$DataBean$RecordsBean;", "mViewModel", "Lcom/android/ctgapp/fragment/deal/DealOrderViewModel;", "getMViewModel", "()Lcom/android/ctgapp/fragment/deal/DealOrderViewModel;", "mViewModel$delegate", "needInit", "", "page", "", "preSelect", "Ljava/lang/Integer;", "size", "buttonClick", "", "type", "(Ljava/lang/Integer;)V", "click", "event", "eventBus", "Lcom/android/ctgapp/event/OrderRefresh;", "getLayout", "getOrder", "initOrder", "onReturnCallback", "app_ctgRelease"})
public final class DealOrderFragment extends com.android.ctgapp.base.BaseFragment implements com.android.ctgapp.adapter.deal.OrderAdapter.OrderListener {
    private java.lang.Integer preSelect;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private int page = 1;
    private int size = 20;
    private boolean needInit = false;
    private java.util.HashMap _$_findViewCache;
    
    public DealOrderFragment() {
        super(false);
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.fragment.deal.DealOrderViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.OrderAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void eventBus(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.OrderRefresh type) {
    }
    
    private final void initOrder() {
    }
    
    private final void getOrder() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void buttonClick(java.lang.Integer type) {
    }
    
    @java.lang.Override()
    public void onReturnCallback() {
    }
}