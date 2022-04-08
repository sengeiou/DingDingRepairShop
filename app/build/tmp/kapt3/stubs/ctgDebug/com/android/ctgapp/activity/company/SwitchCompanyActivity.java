package com.android.ctgapp.activity.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/29
 * 描述:切换企业 页面 切换公司
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020\u001eH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006&"}, d2 = {"Lcom/android/ctgapp/activity/company/SwitchCompanyActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/mine/SwitchCompanyAdapterEmpty$CompanyChangeListener;", "()V", "binding", "Lcom/android/ctgapp/databinding/ActivitySwicthCompanyBinding;", "getBinding", "()Lcom/android/ctgapp/databinding/ActivitySwicthCompanyBinding;", "binding$delegate", "Lkotlin/Lazy;", "currentCompanyId", "", "getCurrentCompanyId", "()I", "setCurrentCompanyId", "(I)V", "defaultCompanyId", "getDefaultCompanyId", "setDefaultCompanyId", "mAdapter", "Lcom/android/ctgapp/adapter/mine/SwitchCompanyAdapterEmpty;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/CompanyChangeEntity$DataBean;", "mViewModel", "Lcom/android/ctgapp/activity/company/SwitchCompanyViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/company/SwitchCompanyViewModel;", "mViewModel$delegate", "click", "", "event", "getLayout", "Landroid/widget/RelativeLayout;", "onBackPressed", "onCompanyChange", "companyId", "onResume", "app_ctgDebug"})
public final class SwitchCompanyActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.mine.SwitchCompanyAdapterEmpty.CompanyChangeListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.CompanyChangeEntity.DataBean> mList = null;
    private final com.android.ctgapp.adapter.mine.SwitchCompanyAdapterEmpty mAdapter = null;
    private int currentCompanyId;
    private int defaultCompanyId = -1;
    private java.util.HashMap _$_findViewCache;
    
    public SwitchCompanyActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivitySwicthCompanyBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RelativeLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.company.SwitchCompanyViewModel getMViewModel() {
        return null;
    }
    
    public final int getCurrentCompanyId() {
        return 0;
    }
    
    public final void setCurrentCompanyId(int p0) {
    }
    
    public final int getDefaultCompanyId() {
        return 0;
    }
    
    public final void setDefaultCompanyId(int p0) {
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
    public void onCompanyChange(int companyId) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
}