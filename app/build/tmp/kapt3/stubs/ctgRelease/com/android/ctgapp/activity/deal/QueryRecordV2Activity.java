package com.android.ctgapp.activity.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/9/1
 * 描述:询价记录 询价详情 页面 按配件/按供应商 新版
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0016J\u0006\u00102\u001a\u000200J\b\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u0006H\u0002J\u0010\u00107\u001a\u0002002\u0006\u00108\u001a\u00020\u0006H\u0016J\b\u00109\u001a\u000200H\u0014J\u0018\u0010:\u001a\u0002002\u0006\u00108\u001a\u00020\u00062\u0006\u0010;\u001a\u00020<H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000fR\u000e\u0010\u001a\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/android/ctgapp/activity/deal/QueryRecordV2Activity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/deal/QueryLeftMenuAdapter$LeftMenuListener;", "Lcom/android/ctgapp/adapter/deal/QueryRightPartAdapter$RightCallback;", "()V", "displayModel", "", "enquiryId", "getEnquiryId", "()I", "enquiryId$delegate", "Lkotlin/Lazy;", "flowFlag", "getFlowFlag", "setFlowFlag", "(I)V", "listener2", "Lcom/android/ctgapp/http/ObserverListener;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityQueryRecordV2Binding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityQueryRecordV2Binding;", "mBinding$delegate", "mCreateUserid", "getMCreateUserid", "setMCreateUserid", "mCurrentSupplierId", "mCurrentSupplierName", "", "mEnquiryId", "getMEnquiryId", "setMEnquiryId", "mLeftAdapter", "Lcom/android/ctgapp/adapter/deal/QueryLeftMenuAdapter;", "getMLeftAdapter", "()Lcom/android/ctgapp/adapter/deal/QueryLeftMenuAdapter;", "mLeftAdapter$delegate", "mLeftList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/enquire/EnquireDetailByCompanyEntityV2$DataBean$ImmutablePairsBean;", "mRightAdapter", "Lcom/android/ctgapp/adapter/deal/QueryRightPartAdapter;", "getMRightAdapter", "()Lcom/android/ctgapp/adapter/deal/QueryRightPartAdapter;", "mRightAdapter$delegate", "mRightList", "Lcom/android/ctgapp/entity/home/enquire/EnquireDetailByCompanyEntityV2$DataBean$ImmutablePairsBean$ItemsBean;", "click", "", "event", "getData", "getLayout", "Landroid/widget/LinearLayout;", "handlerSubmit", "companyID", "leftItemSelect", "position", "onDestroy", "onRightItemClick", "select", "", "app_ctgRelease"})
public final class QueryRecordV2Activity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.deal.QueryLeftMenuAdapter.LeftMenuListener, com.android.ctgapp.adapter.deal.QueryRightPartAdapter.RightCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy enquiryId$delegate = null;
    private int displayModel = 2;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.EnquireDetailByCompanyEntityV2.DataBean.ImmutablePairsBean> mLeftList = null;
    private final kotlin.Lazy mLeftAdapter$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.EnquireDetailByCompanyEntityV2.DataBean.ImmutablePairsBean.ItemsBean> mRightList = null;
    private final kotlin.Lazy mRightAdapter$delegate = null;
    private int mCurrentSupplierId = -1;
    private java.lang.String mCurrentSupplierName = "";
    private int mCreateUserid = 0;
    private int mEnquiryId = 0;
    private int flowFlag = 0;
    private final com.android.ctgapp.http.ObserverListener listener2 = null;
    private java.util.HashMap _$_findViewCache;
    
    public QueryRecordV2Activity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityQueryRecordV2Binding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    public final int getEnquiryId() {
        return 0;
    }
    
    private final com.android.ctgapp.adapter.deal.QueryLeftMenuAdapter getMLeftAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.QueryRightPartAdapter getMRightAdapter() {
        return null;
    }
    
    public final int getMCreateUserid() {
        return 0;
    }
    
    public final void setMCreateUserid(int p0) {
    }
    
    public final int getMEnquiryId() {
        return 0;
    }
    
    public final void setMEnquiryId(int p0) {
    }
    
    public final int getFlowFlag() {
        return 0;
    }
    
    public final void setFlowFlag(int p0) {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void getData() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void handlerSubmit(int companyID) {
    }
    
    @java.lang.Override()
    public void leftItemSelect(int position) {
    }
    
    @java.lang.Override()
    public void onRightItemClick(int position, boolean select) {
    }
}