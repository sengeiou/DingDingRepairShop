package com.android.ctgapp.activity.deal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/activity/deal/LaunchAfterSaleViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "applyResult", "Landroidx/lifecycle/LiveData;", "", "getApplyResult", "()Landroidx/lifecycle/LiveData;", "mApplyResult", "Landroidx/lifecycle/MutableLiveData;", "mOrderDetailResult", "orderDetailResult", "getOrderDetailResult", "applyForRefund", "", "orderId", "parts", "Ljava/util/ArrayList;", "Lokhttp3/MultipartBody$Part;", "Lkotlin/collections/ArrayList;", "getOrderDetail", "app_WLDebug"})
public final class LaunchAfterSaleViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mApplyResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mOrderDetailResult = null;
    
    public LaunchAfterSaleViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getApplyResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getOrderDetailResult() {
        return null;
    }
    
    public final void getOrderDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
    
    public final void applyForRefund(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<okhttp3.MultipartBody.Part> parts) {
    }
}