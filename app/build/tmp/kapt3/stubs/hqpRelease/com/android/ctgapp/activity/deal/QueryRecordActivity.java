package com.android.ctgapp.activity.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/6
 * 描述:询价记录 询价详情 页面 按配件/按供应商(废弃)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020?H\u0016J\u0006\u0010A\u001a\u00020?J\b\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020?H\u0002J\u0010\u0010E\u001a\u00020?2\u0006\u0010F\u001a\u00020\bH\u0002J\u0018\u0010G\u001a\u00020?2\u0006\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020JH\u0016J\u0016\u0010K\u001a\u00020?2\u0006\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020JR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b \u0010\u001dR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b(\u0010%R\u001b\u0010*\u001a\u00020+8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\r\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\u0011R\u000e\u00102\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000b\"\u0004\b6\u0010\u0011R\u0014\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020;0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/android/ctgapp/activity/deal/QueryRecordActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/deal/QueryRecordParentAdapter$RightCallback;", "()V", "allDataWhitOutHandler", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/EnquireWhiteEntityV2$DataBean$QuotationDetailsBean;", "displayModel", "", "enquiryId", "getEnquiryId", "()I", "enquiryId$delegate", "Lkotlin/Lazy;", "flowFlag", "getFlowFlag", "setFlowFlag", "(I)V", "listener", "Lcom/android/ctgapp/http/ObserverListener;", "listener2", "listenerLeftCompany", "Lcom/android/ctgapp/adapter/deal/QueryByPartMenuAdapter$MenuListener;", "listenerLeftPart", "listenerRightCompany", "listenerRightPart", "mAdapterLeftCompany", "Lcom/android/ctgapp/adapter/deal/QueryByPartMenuAdapter;", "getMAdapterLeftCompany", "()Lcom/android/ctgapp/adapter/deal/QueryByPartMenuAdapter;", "mAdapterLeftCompany$delegate", "mAdapterLeftPart", "getMAdapterLeftPart", "mAdapterLeftPart$delegate", "mAdapterRightCompany", "Lcom/android/ctgapp/adapter/deal/QueryRecordParentAdapter;", "getMAdapterRightCompany", "()Lcom/android/ctgapp/adapter/deal/QueryRecordParentAdapter;", "mAdapterRightCompany$delegate", "mAdapterRightPart", "getMAdapterRightPart", "mAdapterRightPart$delegate", "mBinding", "Lcom/android/ctgapp/databinding/ActivityQueryRecordBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityQueryRecordBinding;", "mBinding$delegate", "mCreateUserid", "getMCreateUserid", "setMCreateUserid", "mCurrentLeftCompanyId", "mCurrentLeftPartId", "mEnquiryId", "getMEnquiryId", "setMEnquiryId", "mListLeftCompany", "Lcom/android/ctgapp/entity/home/enquire/LeftMenuBean;", "mListLeftPart", "mListRightAll", "Lcom/android/ctgapp/entity/home/enquire/RightBean;", "mListRightCompany", "mListRightPart", "click", "", "event", "getData", "getLayout", "Landroid/widget/LinearLayout;", "handlerRightByPart", "handlerSubmit", "companyID", "onItemClick", "data", "isCheck", "", "rightClickHandler", "app_hqpRelease"})
public final class QueryRecordActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.deal.QueryRecordParentAdapter.RightCallback {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mBinding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy enquiryId$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.LeftMenuBean> mListLeftPart = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.LeftMenuBean> mListLeftCompany = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.RightBean> mListRightPart = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.RightBean> mListRightCompany = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.RightBean> mListRightAll = null;
    private final kotlin.Lazy mAdapterLeftPart$delegate = null;
    private final kotlin.Lazy mAdapterLeftCompany$delegate = null;
    private final kotlin.Lazy mAdapterRightPart$delegate = null;
    private final kotlin.Lazy mAdapterRightCompany$delegate = null;
    private int mCurrentLeftPartId = 0;
    private int mCurrentLeftCompanyId = 0;
    private int displayModel = 2;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.EnquireWhiteEntityV2.DataBean.QuotationDetailsBean> allDataWhitOutHandler = null;
    private int flowFlag = 0;
    private int mCreateUserid = 0;
    private int mEnquiryId = 0;
    private final com.android.ctgapp.adapter.deal.QueryRecordParentAdapter.RightCallback listenerRightPart = null;
    private final com.android.ctgapp.adapter.deal.QueryRecordParentAdapter.RightCallback listenerRightCompany = null;
    private final com.android.ctgapp.adapter.deal.QueryByPartMenuAdapter.MenuListener listenerLeftPart = null;
    private final com.android.ctgapp.adapter.deal.QueryByPartMenuAdapter.MenuListener listenerLeftCompany = null;
    private final com.android.ctgapp.http.ObserverListener listener2 = null;
    private final com.android.ctgapp.http.ObserverListener listener = null;
    private java.util.HashMap _$_findViewCache;
    
    public QueryRecordActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivityQueryRecordBinding getMBinding() {
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
    
    private final com.android.ctgapp.adapter.deal.QueryByPartMenuAdapter getMAdapterLeftPart() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.QueryByPartMenuAdapter getMAdapterLeftCompany() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.QueryRecordParentAdapter getMAdapterRightPart() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.QueryRecordParentAdapter getMAdapterRightCompany() {
        return null;
    }
    
    public final int getFlowFlag() {
        return 0;
    }
    
    public final void setFlowFlag(int p0) {
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
    
    public final void rightClickHandler(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.enquire.RightBean data, boolean isCheck) {
    }
    
    public final void getData() {
    }
    
    private final void handlerRightByPart() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void handlerSubmit(int companyID) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.enquire.RightBean data, boolean isCheck) {
    }
}