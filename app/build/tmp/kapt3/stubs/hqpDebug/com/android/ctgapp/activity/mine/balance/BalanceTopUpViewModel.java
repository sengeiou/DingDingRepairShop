package com.android.ctgapp.activity.mine.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/android/ctgapp/activity/mine/balance/BalanceTopUpViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "applyResult", "Landroidx/lifecycle/LiveData;", "", "getApplyResult", "()Landroidx/lifecycle/LiveData;", "mApplyResult", "Landroidx/lifecycle/MutableLiveData;", "mPayResult", "payResult", "getPayResult", "applyPay", "", "body", "Lokhttp3/RequestBody;", "app_hqpDebug"})
public final class BalanceTopUpViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mApplyResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mPayResult = null;
    
    public BalanceTopUpViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getApplyResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPayResult() {
        return null;
    }
    
    /**
     * *发起支付请求
     */
    public final void applyPay(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body) {
    }
}