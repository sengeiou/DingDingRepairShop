package com.android.ctgapp.activity.home.enquiry;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/17
 * 描述:Epc详情 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020-H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020-H\u0002J\b\u00107\u001a\u00020-H\u0002J\u0010\u00108\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0016J\b\u00109\u001a\u00020-H\u0014J\u0010\u0010:\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0012\u0010\bR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b%\u0010\bR\u001b\u0010\'\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b(\u0010\bR\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/android/ctgapp/activity/home/enquiry/EpcDetailActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/enquiry/EpcDetailAdapter$EpcDetailCallback;", "Lcom/android/ctgapp/widget/dialog/company/EpcPartSelectDialog$EpcPartSelectCallback;", "()V", "carID", "", "getCarID", "()Ljava/lang/String;", "carID$delegate", "Lkotlin/Lazy;", "categoryId", "getCategoryId", "categoryId$delegate", "epc", "getEpc", "epc$delegate", "img", "getImg", "img$delegate", "mAdapter", "Lcom/android/ctgapp/adapter/home/enquiry/EpcDetailAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/enquiry/EpcDetailAdapter;", "mAdapter$delegate", "mBannerList", "Ljava/util/ArrayList;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityEpcDetailBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityEpcDetailBinding;", "mBinding$delegate", "mList", "Lcom/android/ctgapp/entity/home/enquire/EpcDetailEntity$DataBean;", "mSelectedDialog", "Lcom/android/ctgapp/widget/dialog/company/EpcPartSelectDialog;", "parentCategoryId", "getParentCategoryId", "parentCategoryId$delegate", "partName", "getPartName", "partName$delegate", "selectPartsList", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntityV2$DataBean$PartsGroupBean;", "click", "", "epcDetailClick", "position", "", "select", "", "event", "getLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "handlerSelect", "handlerSelectHistory", "onItemRemove", "onPause", "partDetail", "app_ctgDebug"})
public final class EpcDetailActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.enquiry.EpcDetailAdapter.EpcDetailCallback, com.android.ctgapp.widget.dialog.company.EpcPartSelectDialog.EpcPartSelectCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.EpcDetailEntity.DataBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private final kotlin.Lazy carID$delegate = null;
    private final kotlin.Lazy parentCategoryId$delegate = null;
    private final kotlin.Lazy categoryId$delegate = null;
    private final kotlin.Lazy partName$delegate = null;
    private final kotlin.Lazy epc$delegate = null;
    private final kotlin.Lazy img$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> selectPartsList = null;
    private com.android.ctgapp.widget.dialog.company.EpcPartSelectDialog mSelectedDialog;
    private final java.util.ArrayList<java.lang.String> mBannerList = null;
    private java.util.HashMap _$_findViewCache;
    
    public EpcDetailActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityEpcDetailBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.LinearLayoutCompat getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.enquiry.EpcDetailAdapter getMAdapter() {
        return null;
    }
    
    private final java.lang.String getCarID() {
        return null;
    }
    
    private final java.lang.String getParentCategoryId() {
        return null;
    }
    
    private final java.lang.String getCategoryId() {
        return null;
    }
    
    private final java.lang.String getPartName() {
        return null;
    }
    
    private final java.lang.String getEpc() {
        return null;
    }
    
    private final java.lang.String getImg() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void handlerSelectHistory() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void handlerSelect() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void epcDetailClick(int position, boolean select) {
    }
    
    @java.lang.Override()
    public void partDetail(int position) {
    }
    
    @java.lang.Override()
    public void onItemRemove(int position) {
    }
}