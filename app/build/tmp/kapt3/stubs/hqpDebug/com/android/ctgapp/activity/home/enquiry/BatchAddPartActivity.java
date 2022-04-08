package com.android.ctgapp.activity.home.enquiry;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 4/27/21
 * 描述:批量添加配件 页面 (外观件.....)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J2\u00107\u001a\u0002082\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00052\b\b\u0002\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u000208H\u0016J\b\u0010A\u001a\u000208H\u0016J\b\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u0002082\u0006\u0010E\u001a\u00020\u0005H\u0002J\u0010\u0010F\u001a\u0002082\u0006\u0010G\u001a\u000200H\u0002J\u0010\u0010H\u001a\u0002082\u0006\u0010E\u001a\u00020\u0005H\u0002J\"\u0010I\u001a\u0002082\u0006\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020&2\b\u0010L\u001a\u0004\u0018\u00010MH\u0014J\b\u0010N\u001a\u000208H\u0002J(\u0010O\u001a\u0002082\u0006\u0010P\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020?2\u0006\u0010R\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0005H\u0016J\b\u0010T\u001a\u000208H\u0014J\u0010\u0010U\u001a\u0002082\u0006\u0010E\u001a\u00020\u0005H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\r\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u00104\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010\n\u001a\u0004\b5\u0010+\u00a8\u0006V"}, d2 = {"Lcom/android/ctgapp/activity/home/enquiry/BatchAddPartActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/BathAddPartChildItemAdapter$PartSearchCallback;", "()V", "carId", "", "kotlin.jvm.PlatformType", "getCarId", "()Ljava/lang/String;", "carId$delegate", "Lkotlin/Lazy;", "currentParentId", "currentPartId", "epc", "getEpc", "epc$delegate", "mAdapter", "Lcom/android/ctgapp/adapter/home/BathAddPartChildItemAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/BathAddPartChildItemAdapter;", "mAdapter$delegate", "mBinding", "Lcom/android/ctgapp/databinding/ActivityBatchAddPartBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityBatchAddPartBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/BatchAddPartEntityV2$DataBean;", "mParentCategoryId", "mParentPartName", "mPreList", "mViewModel", "Lcom/android/ctgapp/activity/home/enquiry/BatchAddPartViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/enquiry/BatchAddPartViewModel;", "mViewModel$delegate", "maskColor", "", "menuPopup", "Landroid/widget/PopupWindow;", "partId", "getPartId", "()I", "partId$delegate", "preChildTag", "preParentId", "preView", "Landroid/view/View;", "selectPartsList", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntityV2$DataBean$PartsGroupBean;", "tranColor", "windowWidth", "getWindowWidth", "windowWidth$delegate", "addView", "", "width", "tag", "container", "Landroid/widget/LinearLayout;", "name", "isEnable", "", "click", "event", "getLayout", "Landroid/widget/RelativeLayout;", "handlerBottomRecyclerView", "id", "handlerClick", "view", "handlerHorizonRecyclerView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onPartParentClick", "onPartSearchClick", "categoryId", "select", "partName", "parentCategoryId", "onPause", "partParentSelect", "app_hqpDebug"})
public final class BatchAddPartActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.BathAddPartChildItemAdapter.PartSearchCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy partId$delegate = null;
    private java.lang.String currentPartId = "";
    private final int maskColor = 0;
    private final int tranColor = 0;
    private final kotlin.Lazy windowWidth$delegate = null;
    private final kotlin.Lazy carId$delegate = null;
    private final kotlin.Lazy epc$delegate = null;
    private java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartEntityV2.DataBean> mPreList;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> selectPartsList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartEntityV2.DataBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.lang.String mParentCategoryId = "";
    private java.lang.String mParentPartName = "";
    private java.lang.String preParentId = "";
    private java.lang.String currentParentId = "";
    private android.view.View preView;
    private java.lang.String preChildTag = "";
    private android.widget.PopupWindow menuPopup;
    private java.util.HashMap _$_findViewCache;
    
    public BatchAddPartActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityBatchAddPartBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RelativeLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.home.enquiry.BatchAddPartViewModel getMViewModel() {
        return null;
    }
    
    private final int getPartId() {
        return 0;
    }
    
    private final int getWindowWidth() {
        return 0;
    }
    
    private final java.lang.String getCarId() {
        return null;
    }
    
    private final java.lang.String getEpc() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.BathAddPartChildItemAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void onPartParentClick() {
    }
    
    private final void handlerClick(android.view.View view) {
    }
    
    private final void handlerHorizonRecyclerView(java.lang.String id) {
    }
    
    private final void partParentSelect(java.lang.String id) {
    }
    
    private final void addView(int width, java.lang.String tag, android.widget.LinearLayout container, java.lang.String name, boolean isEnable) {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onPartSearchClick(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, boolean select, @org.jetbrains.annotations.NotNull()
    java.lang.String partName, @org.jetbrains.annotations.NotNull()
    java.lang.String parentCategoryId) {
    }
    
    private final void handlerBottomRecyclerView(java.lang.String id) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
}