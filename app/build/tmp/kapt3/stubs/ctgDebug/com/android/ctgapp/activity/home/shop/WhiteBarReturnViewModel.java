package com.android.ctgapp.activity.home.shop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/WhiteBarReturnViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "mMoreResult", "Landroidx/lifecycle/MutableLiveData;", "", "mResult", "moreResult", "Landroidx/lifecycle/LiveData;", "getMoreResult", "()Landroidx/lifecycle/LiveData;", "result", "getResult", "whiteBarReturnMore", "", "payBean", "Lcom/android/ctgapp/entity/mine/WhiteBarMorePayBean;", "whiteBarReturnSingle", "orderId", "repayWay", "", "app_ctgDebug"})
public final class WhiteBarReturnViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mMoreResult = null;
    
    public WhiteBarReturnViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResult() {
        return null;
    }
    
    public final void whiteBarReturnSingle(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, int repayWay) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getMoreResult() {
        return null;
    }
    
    public final void whiteBarReturnMore(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.mine.WhiteBarMorePayBean payBean) {
    }
}