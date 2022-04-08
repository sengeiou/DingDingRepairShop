package com.android.ctgapp.activity.mine.whitebar;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/6/10
 * 描述:账单详情 页面(提前还款 二级)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0006\u0010!\u001a\u00020\u001fJ\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001fH\u0002J\u0018\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u001fH\u0014J\b\u0010+\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/android/ctgapp/activity/mine/whitebar/PrepaymentChildActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/mine/whitebar/PrepaymentChildAdapter$PrepaymentChildCallback;", "()V", "companyId", "", "getCompanyId", "()I", "companyId$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/android/ctgapp/adapter/mine/whitebar/PrepaymentChildAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/whitebar/PrepaymentChildAdapter;", "mAdapter$delegate", "mBinding", "Lcom/android/ctgapp/databinding/ActivityPrepaymentChildBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityPrepaymentChildBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean$PageBean$RecordsBean;", "mViewModel", "Lcom/android/ctgapp/activity/mine/whitebar/PrepaymentChildViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/whitebar/PrepaymentChildViewModel;", "mViewModel$delegate", "page", "size", "click", "", "event", "getData", "getLayout", "Landroid/widget/RelativeLayout;", "handlerCountAndButton", "onCheckBoxCheck", "position", "select", "", "onItemSelect", "onResume", "refreshData", "app_hqpRelease"})
public final class PrepaymentChildActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.mine.whitebar.PrepaymentChildAdapter.PrepaymentChildCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private int page = 1;
    private int size = 20;
    private java.util.ArrayList<com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean.PageBean.RecordsBean> mList;
    private final kotlin.Lazy mAdapter$delegate = null;
    private final kotlin.Lazy companyId$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public PrepaymentChildActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityPrepaymentChildBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RelativeLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.whitebar.PrepaymentChildViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.whitebar.PrepaymentChildAdapter getMAdapter() {
        return null;
    }
    
    private final int getCompanyId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void getData() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onItemSelect(int position) {
    }
    
    @java.lang.Override()
    public void onCheckBoxCheck(int position, boolean select) {
    }
    
    private final void handlerCountAndButton() {
    }
    
    private final void refreshData() {
    }
}