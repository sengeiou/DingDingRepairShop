package com.android.ctgapp.fragment.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0017J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007\u00a8\u0006 "}, d2 = {"Lcom/android/ctgapp/fragment/home/HomeFragmentViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "addTrolleyResult", "Landroidx/lifecycle/LiveData;", "", "getAddTrolleyResult", "()Landroidx/lifecycle/LiveData;", "bannerResult", "getBannerResult", "goodByBannerResult", "getGoodByBannerResult", "hotGoodsResult", "getHotGoodsResult", "mAddTrolleyResult", "Landroidx/lifecycle/MutableLiveData;", "mBannerResult", "mGoodByBannerResult", "mHotGoodsResult", "mNoticeResult", "noticeResult", "getNoticeResult", "getBanner", "", "getGoodsByBanner", "body", "Lokhttp3/RequestBody;", "getHotGoods", "getNotice", "goodsAddTrolley", "bean", "Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "app_ctgRelease"})
public final class HomeFragmentViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mBannerResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mNoticeResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mGoodByBannerResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mHotGoodsResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mAddTrolleyResult = null;
    
    public HomeFragmentViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getBannerResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNoticeResult() {
        return null;
    }
    
    /**
     * 获取轮播图
     */
    public final void getBanner() {
    }
    
    /**
     * 获取通知
     */
    public final void getNotice() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getGoodByBannerResult() {
        return null;
    }
    
    /**
     * 获取轮播图中的商品信息
     */
    public final void getGoodsByBanner(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getHotGoodsResult() {
        return null;
    }
    
    /**
     * 获取热销商品
     */
    public final void getHotGoods() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAddTrolleyResult() {
        return null;
    }
    
    public final void goodsAddTrolley(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.TrolleyAddGoodsBean bean) {
    }
}