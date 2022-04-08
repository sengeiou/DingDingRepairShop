package com.android.ctgapp.activity.deal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/activity/deal/OrderDetailViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "cancelResult", "Landroidx/lifecycle/LiveData;", "", "getCancelResult", "()Landroidx/lifecycle/LiveData;", "confirmResult", "getConfirmResult", "creditConfirmResult", "getCreditConfirmResult", "mCancelResult", "Landroidx/lifecycle/MutableLiveData;", "mConfirmResult", "mCreditConfirmResult", "mResult", "result", "getResult", "cancelOrder", "", "orderId", "confirmGetGoods", "findOrderSupportWithCredit", "getOrderDetail", "app_hqpRelease"})
public final class OrderDetailViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mConfirmResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mCancelResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mCreditConfirmResult = null;
    
    public OrderDetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getConfirmResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCancelResult() {
        return null;
    }
    
    public final void getOrderDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
    
    public final void cancelOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
    
    public final void confirmGetGoods(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCreditConfirmResult() {
        return null;
    }
    
    public final void findOrderSupportWithCredit(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
}