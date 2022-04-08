package com.android.ctgapp.activity.home.shop;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/2
 * 描述: 商品详情 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\u001aH\u0014J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/GoodsDetailActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/widget/dialog/GoodsAddTrolleyDialog$AddTrolley;", "()V", "canScroll", "", "delayTime", "", "detailPosition", "", "entity", "Lcom/android/ctgapp/entity/home/GoodsDetailBean;", "handler", "Landroid/os/Handler;", "mViewModel", "Lcom/android/ctgapp/activity/home/shop/GoodsDetailViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/shop/GoodsDetailViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "partId", "", "getPartId", "()Ljava/lang/String;", "partId$delegate", "addGoodsToTrolley", "", "bean", "Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "click", "event", "getLayout", "onDestroy", "onPartSortSelect", "showTrolleyDialog", "app_WLDebug"})
public final class GoodsDetailActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog.AddTrolley {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy partId$delegate = null;
    private com.android.ctgapp.entity.home.GoodsDetailBean entity;
    private int detailPosition = 0;
    private boolean canScroll = true;
    private final long delayTime = 500L;
    private final android.os.Handler handler = null;
    private java.util.HashMap _$_findViewCache;
    
    public GoodsDetailActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.activity.home.shop.GoodsDetailViewModel getMViewModel() {
        return null;
    }
    
    private final java.lang.String getPartId() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void showTrolleyDialog() {
    }
    
    @java.lang.Override()
    public void addGoodsToTrolley(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.TrolleyAddGoodsBean bean) {
    }
    
    @java.lang.Override()
    public void onPartSortSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String partId) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}