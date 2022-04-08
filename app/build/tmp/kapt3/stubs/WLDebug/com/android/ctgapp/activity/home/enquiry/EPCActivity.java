package com.android.ctgapp.activity.home.enquiry;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/17
 * 描述:EPC 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u00020/2\u0006\u00101\u001a\u0002022\u0006\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020/H\u0016J\b\u00106\u001a\u00020/H\u0016J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020/H\u0002J\u0010\u0010:\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0016J\b\u0010;\u001a\u00020/H\u0014J\u0010\u0010<\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0002R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001b\u0010\u0010\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\nR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/android/ctgapp/activity/home/enquiry/EPCActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/enquiry/EpcMenuAdapter$EpcMenuCallback;", "Lcom/android/ctgapp/adapter/home/enquiry/EpcAdapter$EpcCallback;", "Lcom/android/ctgapp/widget/dialog/company/EpcPartSelectDialog$EpcPartSelectCallback;", "()V", "carId", "", "kotlin.jvm.PlatformType", "getCarId", "()Ljava/lang/String;", "carId$delegate", "Lkotlin/Lazy;", "carIntro", "getCarIntro", "carIntro$delegate", "epc", "getEpc", "epc$delegate", "mAdapter", "Lcom/android/ctgapp/adapter/home/enquiry/EpcAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/enquiry/EpcAdapter;", "mAdapter$delegate", "mBinding", "Lcom/android/ctgapp/databinding/ActivityEpcactivityBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityEpcactivityBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/enquire/EpcRightMenuEntity$DataBean;", "mMenuAdapter", "Lcom/android/ctgapp/adapter/home/enquiry/EpcMenuAdapter;", "getMMenuAdapter", "()Lcom/android/ctgapp/adapter/home/enquiry/EpcMenuAdapter;", "mMenuAdapter$delegate", "mMenuList", "Lcom/android/ctgapp/entity/home/enquire/EpcLeftMenuEntity$DataBean;", "mSelectedDialog", "Lcom/android/ctgapp/widget/dialog/company/EpcPartSelectDialog;", "rightMenuListener", "Lcom/android/ctgapp/http/ObserverListener;", "searchListener", "selectPartsList", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntityV2$DataBean$PartsGroupBean;", "click", "", "epcClick", "position", "", "epcMenuClick", "title", "event", "finish", "getLayout", "Landroid/widget/RelativeLayout;", "handlerSelectHistory", "onItemRemove", "onResume", "selectWhile", "app_WLDebug"})
public final class EPCActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.enquiry.EpcMenuAdapter.EpcMenuCallback, com.android.ctgapp.adapter.home.enquiry.EpcAdapter.EpcCallback, com.android.ctgapp.widget.dialog.company.EpcPartSelectDialog.EpcPartSelectCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.EpcLeftMenuEntity.DataBean> mMenuList = null;
    private final kotlin.Lazy mMenuAdapter$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.enquire.EpcRightMenuEntity.DataBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private com.android.ctgapp.widget.dialog.company.EpcPartSelectDialog mSelectedDialog;
    private final kotlin.Lazy carId$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> selectPartsList = null;
    private final kotlin.Lazy carIntro$delegate = null;
    private final kotlin.Lazy epc$delegate = null;
    private final com.android.ctgapp.http.ObserverListener searchListener = null;
    private final com.android.ctgapp.http.ObserverListener rightMenuListener = null;
    private java.util.HashMap _$_findViewCache;
    
    public EPCActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityEpcactivityBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RelativeLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.enquiry.EpcMenuAdapter getMMenuAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.enquiry.EpcAdapter getMAdapter() {
        return null;
    }
    
    private final java.lang.String getCarId() {
        return null;
    }
    
    private final java.lang.String getCarIntro() {
        return null;
    }
    
    private final java.lang.String getEpc() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void selectWhile(int position) {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void epcMenuClick(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void epcClick(int position) {
    }
    
    private final void handlerSelectHistory() {
    }
    
    @java.lang.Override()
    public void onItemRemove(int position) {
    }
    
    @java.lang.Override()
    public void finish() {
    }
}