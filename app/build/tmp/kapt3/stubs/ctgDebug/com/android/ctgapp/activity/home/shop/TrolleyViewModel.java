package com.android.ctgapp.activity.home.shop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0014J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017J\u0014\u0010\u001d\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007\u00a8\u0006\u001f"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/TrolleyViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "changesSelectResult", "Landroidx/lifecycle/LiveData;", "", "getChangesSelectResult", "()Landroidx/lifecycle/LiveData;", "mChangesSelectResult", "Landroidx/lifecycle/MutableLiveData;", "mResult", "mTrolleyDeleteResult", "mTrolleyResult", "result", "getResult", "trolleyDeleteResult", "getTrolleyDeleteResult", "trolleyResult", "getTrolleyResult", "changesSelect", "", "ids", "", "", "isSelected", "getTrolley", "trolleyChangeCount", "trolleyId", "num", "trolleyDelete", "trolleyIds", "app_ctgDebug"})
public final class TrolleyViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mChangesSelectResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mTrolleyResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mTrolleyDeleteResult = null;
    
    public TrolleyViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getChangesSelectResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTrolleyResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTrolleyDeleteResult() {
        return null;
    }
    
    public final void getTrolley() {
    }
    
    public final void trolleyChangeCount(int trolleyId, int num) {
    }
    
    public final void trolleyDelete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> trolleyIds) {
    }
    
    public final void changesSelect(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> ids, int isSelected) {
    }
}