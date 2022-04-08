package com.android.ctgapp.activity.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/7/30
 * 描述: 询价单 确认订单 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020<H\u0016J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020AH\u0016J\"\u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u0010\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020IH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR\u001b\u0010&\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b\'\u0010\bR\u001a\u0010)\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR\u001a\u0010,\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR\u001a\u00108\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\r\"\u0004\b:\u0010\u000f\u00a8\u0006J"}, d2 = {"Lcom/android/ctgapp/activity/deal/EnquireOrderConfirmActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "()V", "addressDetail", "", "buyerCompanyId", "", "getBuyerCompanyId", "()I", "buyerCompanyId$delegate", "Lkotlin/Lazy;", "city", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "currentAddressId", "district", "getDistrict", "setDistrict", "mBinding", "Lcom/android/ctgapp/databinding/ActivityEnquireOrderConfirmBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityEnquireOrderConfirmBinding;", "mBinding$delegate", "mDataBean", "Lcom/android/ctgapp/entity/home/QuotationDetailEntity;", "getMDataBean", "()Lcom/android/ctgapp/entity/home/QuotationDetailEntity;", "mDataBean$delegate", "mViewModel", "Lcom/android/ctgapp/activity/home/shop/OrderConfirmViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/shop/OrderConfirmViewModel;", "mViewModel$delegate", "name", "getName", "setName", "orderType", "getOrderType", "orderType$delegate", "phone", "getPhone", "setPhone", "province", "getProvince", "setProvince", "supportWithCredit", "", "getSupportWithCredit", "()Z", "setSupportWithCredit", "(Z)V", "totalPrice", "getTotalPrice", "setTotalPrice", "whiteBarMoney", "getWhiteBarMoney", "setWhiteBarMoney", "click", "", "event", "getData", "Lcom/android/ctgapp/entity/home/CreateOrderBean;", "getLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "setData", "entity", "Lcom/android/ctgapp/entity/AddressEntity$DataBean;", "app_hqpRelease"})
public final class EnquireOrderConfirmActivity extends com.android.ctgapp.base.BaseActivityV2 {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mDataBean$delegate = null;
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
    @org.jetbrains.annotations.NotNull()
    private java.lang.String whiteBarMoney = "";
    private boolean supportWithCredit = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String totalPrice = "";
    private int currentAddressId = 0;
    private final kotlin.Lazy buyerCompanyId$delegate = null;
    private final kotlin.Lazy orderType$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public EnquireOrderConfirmActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.home.shop.OrderConfirmViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.databinding.ActivityEnquireOrderConfirmBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.LinearLayoutCompat getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.entity.home.QuotationDetailEntity getMDataBean() {
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
    public final java.lang.String getWhiteBarMoney() {
        return null;
    }
    
    public final void setWhiteBarMoney(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getSupportWithCredit() {
        return false;
    }
    
    public final void setSupportWithCredit(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalPrice() {
        return null;
    }
    
    public final void setTotalPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final int getBuyerCompanyId() {
        return 0;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final int getOrderType() {
        return 0;
    }
    
    private final com.android.ctgapp.entity.home.CreateOrderBean getData() {
        return null;
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void setData(com.android.ctgapp.entity.AddressEntity.DataBean entity) {
    }
}