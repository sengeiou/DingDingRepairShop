package com.android.ctgapp.activity.mine.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/activity/mine/client/ClientManagementViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "clientResult", "Landroidx/lifecycle/LiveData;", "", "getClientResult", "()Landroidx/lifecycle/LiveData;", "mClientResult", "Landroidx/lifecycle/MutableLiveData;", "mRemoveResult", "removeResult", "getRemoveResult", "getClientList", "", "clientType", "searchText", "pageSize", "", "pageNum", "removeClient", "clientId", "app_ctgDebug"})
public final class ClientManagementViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mClientResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mRemoveResult = null;
    
    public ClientManagementViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getClientResult() {
        return null;
    }
    
    public final void getClientList(@org.jetbrains.annotations.NotNull()
    java.lang.String clientType, @org.jetbrains.annotations.NotNull()
    java.lang.String searchText, int pageSize, int pageNum) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getRemoveResult() {
        return null;
    }
    
    public final void removeClient(@org.jetbrains.annotations.NotNull()
    java.lang.String clientType, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId) {
    }
}