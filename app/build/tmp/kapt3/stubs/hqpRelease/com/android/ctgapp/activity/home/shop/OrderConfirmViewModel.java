package com.android.ctgapp.activity.home.shop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/OrderConfirmViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "addressResult", "Landroidx/lifecycle/LiveData;", "", "getAddressResult", "()Landroidx/lifecycle/LiveData;", "goodsResult", "getGoodsResult", "mAddressResult", "Landroidx/lifecycle/MutableLiveData;", "mGoodsResult", "mResult", "result", "getResult", "getAddress", "", "getGoodsDetail", "goodsId", "queryShoppingSupportWithCredit", "shoppingSupportWithCreditBean", "Lcom/android/ctgapp/entity/home/ShoppingSupportWithCreditBean;", "app_hqpRelease"})
public final class OrderConfirmViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mGoodsResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mAddressResult = null;
    
    public OrderConfirmViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getGoodsResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAddressResult() {
        return null;
    }
    
    public final void queryShoppingSupportWithCredit(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.ShoppingSupportWithCreditBean shoppingSupportWithCreditBean) {
    }
    
    public final void getGoodsDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String goodsId) {
    }
    
    public final void getAddress() {
    }
}