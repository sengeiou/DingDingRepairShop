package com.android.ctgapp.activity.home.shop;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 11/26/20
 * 描述: 优惠券 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016J\b\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002012\u0006\u0010,\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u000e\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010/\u00a8\u00067"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/CouponActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/CouponAdapter$Click;", "()V", "canNotUseList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/CouponAllEntity$Data;", "canUseList", "couponParameters", "", "kotlin.jvm.PlatformType", "getCouponParameters", "()Ljava/lang/String;", "couponParameters$delegate", "Lkotlin/Lazy;", "currentCanUseType", "", "getCurrentCanUseType", "()Z", "setCurrentCanUseType", "(Z)V", "entity", "Lcom/android/ctgapp/entity/home/CreateOrderBean;", "goodsEntity", "Lcom/android/ctgapp/entity/home/GoodsDetailBean;", "mAdapter", "Lcom/android/ctgapp/adapter/home/CouponAdapter;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityCouponBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityCouponBinding;", "mBinding$delegate", "mList", "mViewModel", "Lcom/android/ctgapp/activity/home/shop/CouponViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/shop/CouponViewModel;", "mViewModel$delegate", "totalPrice", "Ljava/math/BigDecimal;", "getTotalPrice", "()Ljava/math/BigDecimal;", "setTotalPrice", "(Ljava/math/BigDecimal;)V", "voucherClientId", "getVoucherClientId", "setVoucherClientId", "(Ljava/lang/String;)V", "click", "", "event", "getLayout", "Landroid/widget/LinearLayout;", "onItemSelect", "Voucher", "app_ctgDebug"})
public final class CouponActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.CouponAdapter.Click {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy couponParameters$delegate = null;
    private com.android.ctgapp.entity.home.CreateOrderBean entity;
    private com.android.ctgapp.entity.home.GoodsDetailBean goodsEntity;
    private final java.util.ArrayList<com.android.ctgapp.entity.CouponAllEntity.Data> mList = null;
    private com.android.ctgapp.adapter.home.CouponAdapter mAdapter;
    private java.util.ArrayList<com.android.ctgapp.entity.CouponAllEntity.Data> canUseList;
    private java.util.ArrayList<com.android.ctgapp.entity.CouponAllEntity.Data> canNotUseList;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal totalPrice;
    private boolean currentCanUseType = true;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String voucherClientId = "";
    private java.util.HashMap _$_findViewCache;
    
    public CouponActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityCouponBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.home.shop.CouponViewModel getMViewModel() {
        return null;
    }
    
    private final java.lang.String getCouponParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getTotalPrice() {
        return null;
    }
    
    public final void setTotalPrice(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal p0) {
    }
    
    public final boolean getCurrentCanUseType() {
        return false;
    }
    
    public final void setCurrentCanUseType(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVoucherClientId() {
        return null;
    }
    
    public final void setVoucherClientId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onItemSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String voucherClientId) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/CouponActivity$Voucher;", "", "()V", "brandId", "", "getBrandId", "()Ljava/lang/Integer;", "setBrandId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "ctgnum", "", "getCtgnum", "()Ljava/lang/String;", "setCtgnum", "(Ljava/lang/String;)V", "goodsId", "getGoodsId", "setGoodsId", "totalPrice", "getTotalPrice", "setTotalPrice", "app_ctgDebug"})
    public static final class Voucher {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer brandId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String goodsId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ctgnum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String totalPrice;
        
        public Voucher() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getBrandId() {
            return null;
        }
        
        public final void setBrandId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGoodsId() {
            return null;
        }
        
        public final void setGoodsId(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCtgnum() {
            return null;
        }
        
        public final void setCtgnum(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTotalPrice() {
            return null;
        }
        
        public final void setTotalPrice(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
    }
}