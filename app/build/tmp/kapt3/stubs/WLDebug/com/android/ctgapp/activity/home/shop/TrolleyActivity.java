package com.android.ctgapp.activity.home.shop;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/5
 * 描述: 购物车 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u0019H\u0002J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001cH\u0016J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u001cH\u0016J\u0016\u0010(\u001a\u00020\u00192\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\b\u0010*\u001a\u00020\u0019H\u0014J\b\u0010+\u001a\u00020\u0019H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/TrolleyActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/callback/TrolleyGoodsChangeListener;", "()V", "entity", "Lcom/android/ctgapp/entity/home/TrolleyEntity;", "mAdapter", "Lcom/android/ctgapp/adapter/home/TrolleyAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/TrolleyAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/TrolleyEntity$DataBean;", "mViewModel", "Lcom/android/ctgapp/activity/home/shop/TrolleyViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/shop/TrolleyViewModel;", "mViewModel$delegate", "managerType", "", "totalPrice", "Ljava/math/BigDecimal;", "changesSelect", "", "ids", "", "", "isSelected", "click", "event", "getLayout", "getTrolley", "goodChildItemCheckChange", "shoppingId", "select", "goodCountChange", "trolleyId", "num", "goodDelete", "trolleyIds", "onDestroy", "onResume", "app_WLDebug"})
public final class TrolleyActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.callback.TrolleyGoodsChangeListener {
    private final kotlin.Lazy mViewModel$delegate = null;
    private boolean managerType = false;
    private java.math.BigDecimal totalPrice;
    private com.android.ctgapp.entity.home.TrolleyEntity entity;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.TrolleyEntity.DataBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public TrolleyActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.home.shop.TrolleyViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.TrolleyAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void getTrolley() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void goodCountChange(int trolleyId, int num) {
    }
    
    @java.lang.Override()
    public void goodDelete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> trolleyIds) {
    }
    
    @java.lang.Override()
    public void goodChildItemCheckChange(int shoppingId, int select) {
    }
    
    @java.lang.Override()
    public void changesSelect(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> ids, int isSelected) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
}