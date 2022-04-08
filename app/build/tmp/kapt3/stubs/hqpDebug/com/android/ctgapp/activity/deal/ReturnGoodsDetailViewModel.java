package com.android.ctgapp.activity.deal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J&\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/activity/deal/ReturnGoodsDetailViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "cancelResult", "Landroidx/lifecycle/LiveData;", "", "getCancelResult", "()Landroidx/lifecycle/LiveData;", "changeResult", "getChangeResult", "detailResult", "getDetailResult", "mCancelResult", "Landroidx/lifecycle/MutableLiveData;", "mChangeResult", "mDetailResult", "cancelReturnGoodsOrder", "", "returnOrderId", "changeForRefund", "parts", "Ljava/util/ArrayList;", "Lokhttp3/MultipartBody$Part;", "Lkotlin/collections/ArrayList;", "getReturnGoodsDetail", "orderId", "getReturnGoodsDetailV2", "returnNo", "app_hqpDebug"})
public final class ReturnGoodsDetailViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mDetailResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mCancelResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mChangeResult = null;
    
    public ReturnGoodsDetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDetailResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCancelResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getChangeResult() {
        return null;
    }
    
    public final void getReturnGoodsDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
    
    public final void getReturnGoodsDetailV2(@org.jetbrains.annotations.NotNull()
    java.lang.String returnNo) {
    }
    
    public final void cancelReturnGoodsOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String returnOrderId) {
    }
    
    public final void changeForRefund(@org.jetbrains.annotations.NotNull()
    java.lang.String returnOrderId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<okhttp3.MultipartBody.Part> parts) {
    }
}