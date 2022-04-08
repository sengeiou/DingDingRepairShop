package com.android.ctgapp.activity.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/30
 * 描述:加入企业 加入公司 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001aH\u0016J\b\u0010\'\u001a\u00020\u001fH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/android/ctgapp/activity/company/JoinCompanyActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/mine/JoinCompanyAdapter$JoinCompanyListener;", "()V", "binding", "Lcom/android/ctgapp/databinding/ActivityJoinCompanyBinding;", "getBinding", "()Lcom/android/ctgapp/databinding/ActivityJoinCompanyBinding;", "binding$delegate", "Lkotlin/Lazy;", "clearList", "", "mAdapter", "Lcom/android/ctgapp/adapter/mine/JoinCompanyAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/JoinCompanyAdapter;", "mAdapter$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/CompanyCanJoinEntity$DataBean$RecordsBean;", "mViewModel", "Lcom/android/ctgapp/activity/company/JoinCompanyViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/company/JoinCompanyViewModel;", "mViewModel$delegate", "pageNum", "", "pageSize", "search", "", "click", "", "event", "getData", "getLayout", "Landroid/widget/RelativeLayout;", "initData", "onJoinButtonClickListener", "companyId", "onResume", "app_hqpDebug"})
public final class JoinCompanyActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.mine.JoinCompanyAdapter.JoinCompanyListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.CompanyCanJoinEntity.DataBean.RecordsBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private int pageNum = 1;
    private int pageSize = 20;
    private java.lang.String search = "";
    private boolean clearList = false;
    private java.util.HashMap _$_findViewCache;
    
    public JoinCompanyActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivityJoinCompanyBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RelativeLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.JoinCompanyAdapter getMAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.activity.company.JoinCompanyViewModel getMViewModel() {
        return null;
    }
    
    private final void initData() {
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onJoinButtonClickListener(int companyId) {
    }
}