package com.android.ctgapp.activity.deal;

import java.lang.System;

/**
 * `
 * 作者:LiBW
 * 创建日期: 11/16/20
 * 描述: 订单详情 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020!H\u0016J\b\u0010&\u001a\u00020!H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006\'"}, d2 = {"Lcom/android/ctgapp/activity/deal/OrderDetailActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "()V", "binding", "Lcom/android/ctgapp/databinding/ActivityOrderDetailBinding;", "getBinding", "()Lcom/android/ctgapp/databinding/ActivityOrderDetailBinding;", "binding$delegate", "Lkotlin/Lazy;", "chartList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/deal/ChatersBean;", "entityStr", "", "hasUseCoupon", "", "mOrderId", "mViewModel", "Lcom/android/ctgapp/activity/deal/OrderDetailViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/deal/OrderDetailViewModel;", "mViewModel$delegate", "needReturnMoney", "payMoney", "sellerCompanyId", "", "sellerCompanyName", "type", "getType", "()I", "setType", "(I)V", "click", "", "event", "getLayout", "Landroid/widget/LinearLayout;", "onBackPressed", "onDestroy", "app_ctgRelease"})
public final class OrderDetailActivity extends com.android.ctgapp.base.BaseActivityV2 {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private int type = -1;
    private java.lang.String entityStr = "";
    private java.lang.String mOrderId = "";
    private java.lang.String payMoney = "";
    private java.lang.String needReturnMoney = "";
    private int sellerCompanyId = -1;
    private java.util.ArrayList<com.android.ctgapp.entity.deal.ChatersBean> chartList;
    private java.lang.String sellerCompanyName = "";
    private boolean hasUseCoupon = false;
    private java.util.HashMap _$_findViewCache;
    
    public OrderDetailActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivityOrderDetailBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.deal.OrderDetailViewModel getMViewModel() {
        return null;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
}