package com.android.ctgapp.activity.mine.whitebar;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/27
 * 描述:白条 账单详情 页面 (还款 二级页面) 可以进行对账
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000201H\u0002J\u0018\u00106\u001a\u0002012\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020)H\u0016J\u0010\u00109\u001a\u0002012\u0006\u00107\u001a\u00020\u000fH\u0016J\b\u0010:\u001a\u000201H\u0014J\b\u0010;\u001a\u000201H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\n\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b*\u0010+R#\u0010-\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b.\u0010\b\u00a8\u0006<"}, d2 = {"Lcom/android/ctgapp/activity/mine/whitebar/WhiteBarDetailChildActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/mine/whitebar/WhiteBarDetailChildAdapter$WhiteBarDetailChildCallback;", "()V", "billNo", "", "kotlin.jvm.PlatformType", "getBillNo", "()Ljava/lang/String;", "billNo$delegate", "Lkotlin/Lazy;", "billNoForConfirm", "getBillNoForConfirm", "billNoForConfirm$delegate", "companyId", "", "getCompanyId", "()I", "companyId$delegate", "companyName", "getCompanyName", "companyName$delegate", "mAdapter", "Lcom/android/ctgapp/adapter/mine/whitebar/WhiteBarDetailChildAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/whitebar/WhiteBarDetailChildAdapter;", "mAdapter$delegate", "mBinding", "Lcom/android/ctgapp/databinding/ActivityWhiteBarDetailChildBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityWhiteBarDetailChildBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/mine/WhiteBarDetailChildEntity$DataBean$ListBean;", "mViewModel", "Lcom/android/ctgapp/activity/mine/whitebar/WhiteBarDetailChildViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/whitebar/WhiteBarDetailChildViewModel;", "mViewModel$delegate", "needInvoice", "", "getNeedInvoice", "()Z", "needInvoice$delegate", "totalMoney", "getTotalMoney", "totalMoney$delegate", "click", "", "event", "getLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "handlerCountAndButton", "onCheckBoxClick", "position", "select", "onItemClick", "onResume", "refreshData", "app_hqpRelease"})
public final class WhiteBarDetailChildActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.mine.whitebar.WhiteBarDetailChildAdapter.WhiteBarDetailChildCallback {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mBinding$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.mine.WhiteBarDetailChildEntity.DataBean.ListBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private final kotlin.Lazy companyId$delegate = null;
    private final kotlin.Lazy billNo$delegate = null;
    private final kotlin.Lazy billNoForConfirm$delegate = null;
    private final kotlin.Lazy needInvoice$delegate = null;
    private final kotlin.Lazy totalMoney$delegate = null;
    private final kotlin.Lazy companyName$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public WhiteBarDetailChildActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.whitebar.WhiteBarDetailChildViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.databinding.ActivityWhiteBarDetailChildBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.LinearLayoutCompat getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.whitebar.WhiteBarDetailChildAdapter getMAdapter() {
        return null;
    }
    
    private final int getCompanyId() {
        return 0;
    }
    
    private final java.lang.String getBillNo() {
        return null;
    }
    
    private final java.lang.String getBillNoForConfirm() {
        return null;
    }
    
    private final boolean getNeedInvoice() {
        return false;
    }
    
    private final java.lang.String getTotalMoney() {
        return null;
    }
    
    private final java.lang.String getCompanyName() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void refreshData() {
    }
    
    private final void handlerCountAndButton() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onCheckBoxClick(int position, boolean select) {
    }
    
    @java.lang.Override()
    public void onItemClick(int position) {
    }
}