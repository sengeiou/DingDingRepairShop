package com.android.ctgapp.activity.home.enquiry;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/7
 * 描述:批量添加配件  页面 添加配件 页面(不懂咋选就选我)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/android/ctgapp/activity/home/enquiry/BatchAddPartSelectMoreActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/BatchAddPartSelectMoreAdapter$BatchAddPartSelectMoreAdapterCallBack;", "()V", "mBinding", "Lcom/android/ctgapp/databinding/ActivityBatchAddPartSelectMoreBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityBatchAddPartSelectMoreBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntityV2$DataBean$PartsGroupBean;", "mParentCategoryIdFlag", "", "mParentPartName", "needEmptyOEPart", "", "getNeedEmptyOEPart", "()Z", "setNeedEmptyOEPart", "(Z)V", "click", "", "event", "getLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "onItemSelect", "data", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntity$DataBean;", "select", "app_hqpRelease"})
public final class BatchAddPartSelectMoreActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.BatchAddPartSelectMoreAdapter.BatchAddPartSelectMoreAdapterCallBack {
    private java.lang.String mParentPartName = "";
    private java.lang.String mParentCategoryIdFlag = "";
    private final kotlin.Lazy mBinding$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> mList = null;
    private boolean needEmptyOEPart = false;
    private java.util.HashMap _$_findViewCache;
    
    public BatchAddPartSelectMoreActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityBatchAddPartSelectMoreBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.LinearLayoutCompat getLayout() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    public final boolean getNeedEmptyOEPart() {
        return false;
    }
    
    public final void setNeedEmptyOEPart(boolean p0) {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onItemSelect(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.BatchAddPartChildEntity.DataBean data, boolean select) {
    }
}