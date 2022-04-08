package com.android.ctgapp.activity.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 11/25/20
 * 描述: 售后/退货 退款 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001dR\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001d\u00a8\u0006*"}, d2 = {"Lcom/android/ctgapp/activity/deal/AfterSaleActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "()V", "binding", "Lcom/android/ctgapp/databinding/ActivityAfterSaleBinding;", "getBinding", "()Lcom/android/ctgapp/databinding/ActivityAfterSaleBinding;", "binding$delegate", "Lkotlin/Lazy;", "isFinished", "", "Ljava/lang/Boolean;", "mAdapter", "Lcom/android/ctgapp/adapter/deal/AfterSaleAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/deal/AfterSaleAdapter;", "mAdapter$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean$RecordsBean;", "mViewModel", "Lcom/android/ctgapp/activity/deal/AfterSaleViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/deal/AfterSaleViewModel;", "mViewModel$delegate", "pageNum", "", "pageSize", "preSelect", "Ljava/lang/Integer;", "statueCode", "buttonClick", "", "type", "(Ljava/lang/Integer;)V", "click", "event", "getData", "getLayout", "Landroid/widget/LinearLayout;", "initData", "onResume", "app_hqpDebug"})
public final class AfterSaleActivity extends com.android.ctgapp.base.BaseActivityV2 {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final int pageSize = 20;
    private int pageNum = 1;
    private java.lang.Integer statueCode;
    private java.lang.Boolean isFinished;
    private java.lang.Integer preSelect;
    private java.util.ArrayList<com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean.RecordsBean> mList;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public AfterSaleActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivityAfterSaleBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.deal.AfterSaleViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.AfterSaleAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void initData() {
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void buttonClick(java.lang.Integer type) {
    }
}