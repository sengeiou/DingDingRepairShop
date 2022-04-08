package com.android.ctgapp.activity.home.shop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/PartShopViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "addTrolleyResult", "Landroidx/lifecycle/LiveData;", "", "getAddTrolleyResult", "()Landroidx/lifecycle/LiveData;", "attrResult", "getAttrResult", "goodByBannerResult", "getGoodByBannerResult", "goodResult", "getGoodResult", "mAddTrolleyResult", "Landroidx/lifecycle/MutableLiveData;", "mAttrResult", "mGoodByBannerResult", "mGoodResult", "findAttrAfterCategory", "", "body", "Lokhttp3/RequestBody;", "getGoods", "getGoodsByBanner", "goodsAddTrolley", "bean", "Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "app_WLDebug"})
public final class PartShopViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mGoodResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mAddTrolleyResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mAttrResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mGoodByBannerResult = null;
    
    public PartShopViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getGoodResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAddTrolleyResult() {
        return null;
    }
    
    public final void getGoods(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAttrResult() {
        return null;
    }
    
    public final void findAttrAfterCategory(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getGoodByBannerResult() {
        return null;
    }
    
    public final void getGoodsByBanner(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body) {
    }
    
    public final void goodsAddTrolley(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.TrolleyAddGoodsBean bean) {
    }
}