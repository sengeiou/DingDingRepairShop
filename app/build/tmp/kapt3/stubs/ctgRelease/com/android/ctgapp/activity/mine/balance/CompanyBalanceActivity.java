package com.android.ctgapp.activity.mine.balance;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 12/28/20
 * 描述: 企业余额 页面 企业账户和联盟账户暂时用一个
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/activity/mine/balance/CompanyBalanceActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "()V", "mAdapter", "Lcom/android/ctgapp/adapter/mine/CompanyBalanceDetailAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/CompanyBalanceDetailAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/CurrentBalanceDetailEntity$DataBean$RecordsBean;", "mViewModel", "Lcom/android/ctgapp/activity/mine/balance/CompanyBalanceViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/balance/CompanyBalanceViewModel;", "mViewModel$delegate", "page", "", "click", "", "event", "getData", "getLayout", "initData", "onBackPressed", "onResume", "app_ctgRelease"})
public final class CompanyBalanceActivity extends com.android.ctgapp.base.BaseActivity {
    private final kotlin.Lazy mViewModel$delegate = null;
    private int page = 1;
    private final java.util.ArrayList<com.android.ctgapp.entity.CurrentBalanceDetailEntity.DataBean.RecordsBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public CompanyBalanceActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.balance.CompanyBalanceViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.CompanyBalanceDetailAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
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
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
}