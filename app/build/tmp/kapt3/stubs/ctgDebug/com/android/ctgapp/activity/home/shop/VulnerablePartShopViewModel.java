package com.android.ctgapp.activity.home.shop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JL\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/VulnerablePartShopViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "addTrolleyResult", "Landroidx/lifecycle/LiveData;", "", "getAddTrolleyResult", "()Landroidx/lifecycle/LiveData;", "goodResult", "getGoodResult", "mAddTrolleyResult", "Landroidx/lifecycle/MutableLiveData;", "mGoodResult", "getGoods", "", "vin", "ctgnum", "query", "sortSales", "sortPrice", "pageNum", "", "pageSize", "brandIdList", "", "goodsAddTrolley", "bean", "Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "app_ctgDebug"})
public final class VulnerablePartShopViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mGoodResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mAddTrolleyResult = null;
    
    public VulnerablePartShopViewModel() {
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
    java.lang.String vin, @org.jetbrains.annotations.NotNull()
    java.lang.String ctgnum, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String sortSales, @org.jetbrains.annotations.NotNull()
    java.lang.String sortPrice, int pageNum, int pageSize, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> brandIdList) {
    }
    
    public final void goodsAddTrolley(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.TrolleyAddGoodsBean bean) {
    }
}