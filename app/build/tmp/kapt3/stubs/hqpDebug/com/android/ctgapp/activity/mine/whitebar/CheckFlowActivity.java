package com.android.ctgapp.activity.mine.whitebar;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/26
 * 描述:查看流水 页面 交易流水 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020 H\u0002J\u0018\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/android/ctgapp/activity/mine/whitebar/CheckFlowActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "()V", "actionType", "", "binding", "Lcom/android/ctgapp/databinding/ActivityCheckFlowBinding;", "getBinding", "()Lcom/android/ctgapp/databinding/ActivityCheckFlowBinding;", "binding$delegate", "Lkotlin/Lazy;", "invoiceType", "liushuiListener", "Lcom/android/ctgapp/http/ObserverListener;", "getLiushuiListener", "()Lcom/android/ctgapp/http/ObserverListener;", "mAdapter", "Lcom/android/ctgapp/adapter/mine/CheckFlowAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/CheckFlowAdapter;", "mAdapter$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/mine/JiaoYiLiuShuiEntity$DataBean$RecordsBean;", "mMap", "Ljava/util/HashMap;", "", "mPreMap", "page", "payWay", "search", "click", "", "event", "getData", "getLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "initData", "refreshDraw", "position", "position2", "app_hqpDebug"})
public final class CheckFlowActivity extends com.android.ctgapp.base.BaseActivityV2 {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.mine.JiaoYiLiuShuiEntity.DataBean.RecordsBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap<java.lang.Integer, java.lang.Integer> mMap;
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> mPreMap = null;
    private java.lang.String search = "";
    private int page = 1;
    private java.lang.String payWay = "";
    private java.lang.String invoiceType = "";
    private java.lang.String actionType = "";
    @org.jetbrains.annotations.NotNull()
    private final com.android.ctgapp.http.ObserverListener liushuiListener = null;
    private java.util.HashMap _$_findViewCache;
    
    public CheckFlowActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.drawerlayout.widget.DrawerLayout getLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivityCheckFlowBinding getBinding() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.CheckFlowAdapter getMAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.http.ObserverListener getLiushuiListener() {
        return null;
    }
    
    private final void initData() {
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void refreshDraw(int position, int position2) {
    }
}