package com.android.ctgapp.activity.home.shop;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/10
 * 描述: 收银台 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020+H\u0014J\u0010\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\fH\u0002J\b\u00102\u001a\u00020+H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0002R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/CheckoutActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "()V", "continuePayEntity", "Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean;", "counponBean", "", "getCounponBean", "()Ljava/lang/String;", "counponBean$delegate", "Lkotlin/Lazy;", "currentPayType", "", "entity", "Lcom/android/ctgapp/entity/home/CreateOrderBean;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityCheckstandBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityCheckstandBinding;", "mBinding$delegate", "mHandler", "Landroid/os/Handler;", "getMHandler$annotations", "mStoredCardViewModel", "Lcom/android/ctgapp/activity/mine/money/MyMoneyPackageViewModel;", "getMStoredCardViewModel", "()Lcom/android/ctgapp/activity/mine/money/MyMoneyPackageViewModel;", "mStoredCardViewModel$delegate", "mViewModel", "Lcom/android/ctgapp/activity/home/shop/CheckoutViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/shop/CheckoutViewModel;", "mViewModel$delegate", "needPayTotal", "Ljava/math/BigDecimal;", "sdkPayFlag", "storeCash", "storedCardLeft", "timer", "Landroid/os/CountDownTimer;", "wxApi", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "click", "", "event", "getLayout", "Landroid/widget/LinearLayout;", "onDestroy", "showTime", "time", "startpay", "app_WLDebug"})
public final class CheckoutActivity extends com.android.ctgapp.base.BaseActivityV2 {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mStoredCardViewModel$delegate = null;
    private final kotlin.Lazy counponBean$delegate = null;
    private com.android.ctgapp.entity.home.CreateOrderBean entity;
    private final int sdkPayFlag = 1;
    private int currentPayType = -1;
    private android.os.CountDownTimer timer;
    private java.math.BigDecimal storedCardLeft;
    private com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean continuePayEntity;
    private final kotlin.Lazy mViewModel$delegate = null;
    private com.tencent.mm.opensdk.openapi.IWXAPI wxApi;
    private java.math.BigDecimal needPayTotal;
    private java.math.BigDecimal storeCash;
    private final android.os.Handler mHandler = null;
    private java.util.HashMap _$_findViewCache;
    
    public CheckoutActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityCheckstandBinding getMBinding() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.money.MyMoneyPackageViewModel getMStoredCardViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final java.lang.String getCounponBean() {
        return null;
    }
    
    private final com.android.ctgapp.activity.home.shop.CheckoutViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void showTime(int time) {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    private static void getMHandler$annotations() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void startpay() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}