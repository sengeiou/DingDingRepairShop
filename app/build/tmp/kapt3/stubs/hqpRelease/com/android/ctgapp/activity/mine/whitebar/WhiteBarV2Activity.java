package com.android.ctgapp.activity.mine.whitebar;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/26
 * 描述: 白条 页面 白条账单 挂账账单 页面 我的白条 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0014J \u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\'H\u0016J\u0012\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u001dH\u0014J\b\u0010,\u001a\u00020\u001dH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006-"}, d2 = {"Lcom/android/ctgapp/activity/mine/whitebar/WhiteBarV2Activity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/mine/whitebar/WhiteBarAdapterV2$WhiteBarAdapterV2CallBack;", "()V", "mAdapter", "Lcom/android/ctgapp/adapter/mine/whitebar/WhiteBarAdapterV2;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/whitebar/WhiteBarAdapterV2;", "mAdapter$delegate", "Lkotlin/Lazy;", "mAllCanSelect", "", "mAllUnPayMoney", "", "mBinding", "Lcom/android/ctgapp/databinding/ActivityWhiteBarV2Binding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityWhiteBarV2Binding;", "mBinding$delegate", "mCurrentSelect", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/WhiteBarEntityV2$DataBean$ListBeanX;", "mViewModel", "Lcom/android/ctgapp/activity/mine/whitebar/WhiteBarViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/whitebar/WhiteBarViewModel;", "mViewModel$delegate", "click", "", "event", "getLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "handlerCountAndButton", "onDestroy", "onItemClick", "positionParent", "positionChild", "select", "", "onNewIntent", "intent", "Landroid/content/Intent;", "onResume", "refreshData", "app_hqpRelease"})
public final class WhiteBarV2Activity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.mine.whitebar.WhiteBarAdapterV2.WhiteBarAdapterV2CallBack {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.WhiteBarEntityV2.DataBean.ListBeanX> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.lang.String mAllUnPayMoney = "0";
    private int mAllCanSelect = 0;
    private int mCurrentSelect = 0;
    private java.util.HashMap _$_findViewCache;
    
    public WhiteBarV2Activity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityWhiteBarV2Binding getMBinding() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.whitebar.WhiteBarViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.whitebar.WhiteBarAdapterV2 getMAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.LinearLayoutCompat getLayout() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void refreshData() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void handlerCountAndButton() {
    }
    
    @java.lang.Override()
    public void onItemClick(int positionParent, int positionChild, boolean select) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}