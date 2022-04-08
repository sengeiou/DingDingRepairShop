package com.android.ctgapp.activity.home.shop;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/9
 * 描述: 确认订单 页面 购物车下单
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020EH\u0016J\u0010\u0010G\u001a\u00020E2\u0006\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u00020MH\u0016J\"\u0010N\u001a\u00020E2\u0006\u0010O\u001a\u00020\f2\u0006\u0010P\u001a\u00020\f2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0014J\u0010\u0010S\u001a\u00020E2\u0006\u0010\u0013\u001a\u00020TH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b\'\u0010(R\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\nR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\b\"\u0004\b/\u0010\nR\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00102\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\nR\u000e\u00105\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00106\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006U"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/OrderConfirmActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "()V", "addressDetail", "", "beanStr", "city", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "companyId", "", "couponId", "couponParameters", "currentAddressId", "district", "getDistrict", "setDistrict", "entity", "Lcom/android/ctgapp/entity/home/TrolleyEntity;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityOrderConfirmBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityOrderConfirmBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mCheckoutView", "Lcom/android/ctgapp/activity/home/shop/CheckoutViewModel;", "getMCheckoutView", "()Lcom/android/ctgapp/activity/home/shop/CheckoutViewModel;", "mCheckoutView$delegate", "mCouponViewModel", "Lcom/android/ctgapp/activity/home/shop/CouponViewModel;", "getMCouponViewModel", "()Lcom/android/ctgapp/activity/home/shop/CouponViewModel;", "mCouponViewModel$delegate", "mViewModel", "Lcom/android/ctgapp/activity/home/shop/OrderConfirmViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/shop/OrderConfirmViewModel;", "mViewModel$delegate", "name", "getName", "setName", "phone", "getPhone", "setPhone", "priceWithCoupon", "Ljava/math/BigDecimal;", "province", "getProvince", "setProvince", "realPrice", "realremission", "getRealremission", "()Ljava/math/BigDecimal;", "setRealremission", "(Ljava/math/BigDecimal;)V", "selectEntity", "sellerCompanyId", "supportWithCredit", "", "totalNumber", "totalPrice", "voucherClientId", "voucherId", "whiteBarMoney", "click", "", "event", "getCounponData", "goodsEntity", "Lcom/android/ctgapp/entity/home/TrolleyEntity$DataBean;", "getData", "Lcom/android/ctgapp/entity/home/CreateOrderBean;", "getLayout", "Landroid/widget/LinearLayout;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "setData", "Lcom/android/ctgapp/entity/AddressEntity$DataBean;", "app_WLDebug"})
public final class OrderConfirmActivity extends com.android.ctgapp.base.BaseActivityV2 {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mCouponViewModel$delegate = null;
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mCheckoutView$delegate = null;
    private java.math.BigDecimal totalPrice;
    private java.math.BigDecimal priceWithCoupon;
    private int totalNumber = 0;
    private java.lang.String realPrice = "";
    private int couponId = -1;
    private boolean supportWithCredit = true;
    private java.lang.String voucherId = "";
    private java.lang.String voucherClientId = "";
    private java.lang.String beanStr = "";
    private final com.android.ctgapp.entity.home.TrolleyEntity selectEntity = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String province = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String city = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String district = "";
    private java.lang.String addressDetail = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phone = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "";
    private int currentAddressId = 0;
    private java.lang.String whiteBarMoney = "";
    private int sellerCompanyId = -1;
    private com.android.ctgapp.entity.home.TrolleyEntity entity;
    private int companyId = 0;
    private java.lang.String couponParameters = "";
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal realremission;
    private java.util.HashMap _$_findViewCache;
    
    public OrderConfirmActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.home.shop.OrderConfirmViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.activity.home.shop.CouponViewModel getMCouponViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.databinding.ActivityOrderConfirmBinding getMBinding() {
        return null;
    }
    
    private final com.android.ctgapp.activity.home.shop.CheckoutViewModel getMCheckoutView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProvince() {
        return null;
    }
    
    public final void setProvince(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrict() {
        return null;
    }
    
    public final void setDistrict(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getRealremission() {
        return null;
    }
    
    public final void setRealremission(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void getCounponData(com.android.ctgapp.entity.home.TrolleyEntity.DataBean goodsEntity) {
    }
    
    private final com.android.ctgapp.entity.home.CreateOrderBean getData() {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void setData(com.android.ctgapp.entity.AddressEntity.DataBean entity) {
    }
}