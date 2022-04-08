package com.android.ctgapp.activity.message.chart;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 1/26/21
 * 描述: 聊天 订单 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001aH\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/android/ctgapp/activity/message/chart/ChartOrderActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/adapter/deal/ChartOrderAdapter$ItemClickCallback;", "()V", "mAdapter", "Lcom/android/ctgapp/adapter/deal/ChartOrderAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/deal/ChartOrderAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mBuyerName", "", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/OrderEntity$DataBean$RecordsBean;", "mOrderDetailViewModel", "Lcom/android/ctgapp/activity/deal/OrderDetailViewModel;", "getMOrderDetailViewModel", "()Lcom/android/ctgapp/activity/deal/OrderDetailViewModel;", "mOrderDetailViewModel$delegate", "mViewModel", "Lcom/android/ctgapp/fragment/deal/DealOrderViewModel;", "getMViewModel", "()Lcom/android/ctgapp/fragment/deal/DealOrderViewModel;", "mViewModel$delegate", "page", "", "size", "click", "", "event", "getData", "getLayout", "onItemClick", "bean", "app_hqpRelease"})
public final class ChartOrderActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.adapter.deal.ChartOrderAdapter.ItemClickCallback {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mOrderDetailViewModel$delegate = null;
    private int page = 1;
    private final int size = 20;
    private final java.util.ArrayList<com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.lang.String mBuyerName = "";
    private java.util.HashMap _$_findViewCache;
    
    public ChartOrderActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.fragment.deal.DealOrderViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.activity.deal.OrderDetailViewModel getMOrderDetailViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.ChartOrderAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean bean) {
    }
}