package com.android.ctgapp.activity.home.enquiry;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 5/4/21
 * 描述:选择零件 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002J\b\u0010,\u001a\u00020)H\u0016J\b\u0010-\u001a\u00020)H\u0016J\b\u0010.\u001a\u00020)H\u0016J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J\b\u00103\u001a\u00020)H\u0002J\"\u00104\u001a\u00020)2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000109H\u0014J(\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000206H\u0016J\b\u0010@\u001a\u00020)H\u0014J\b\u0010A\u001a\u00020)H\u0002J\b\u0010B\u001a\u00020)H\u0002J\u0018\u0010C\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0016R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR#\u0010\u000f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/android/ctgapp/activity/home/enquiry/AddPartActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/widget/SelectPartWidget$SelectPartCallBack;", "Lcom/android/ctgapp/adapter/home/AddPartAdapter$AddPartCallback;", "()V", "carId", "", "kotlin.jvm.PlatformType", "getCarId", "()Ljava/lang/String;", "carId$delegate", "Lkotlin/Lazy;", "carIntro", "getCarIntro", "carIntro$delegate", "epc", "getEpc", "epc$delegate", "mAdapter", "Lcom/android/ctgapp/adapter/home/AddPartAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/AddPartAdapter;", "mAdapter$delegate", "mBinding", "Lcom/android/ctgapp/databinding/ActivityAddPartBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityAddPartBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/AddPartBean;", "mParentCategoryId", "mParentPartName", "mViewModel", "Lcom/android/ctgapp/activity/home/enquiry/BatchAddPartViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/enquiry/BatchAddPartViewModel;", "mViewModel$delegate", "selectPartsList", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntityV2$DataBean$PartsGroupBean;", "addView", "", "text", "tag", "click", "event", "finish", "getLayout", "Landroid/widget/LinearLayout;", "handlerOldData", "handlerRightSelectStatue", "handlerSelectList", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onItemClick", "partName", "categoryId", "select", "", "position", "onResume", "refreshDefaultList", "refreshSelectCount", "removeView", "app_ctgRelease"})
public final class AddPartActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.widget.SelectPartWidget.SelectPartCallBack, com.android.ctgapp.adapter.home.AddPartAdapter.AddPartCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy carId$delegate = null;
    private final kotlin.Lazy epc$delegate = null;
    private final kotlin.Lazy carIntro$delegate = null;
    private java.lang.String mParentCategoryId = "";
    private java.lang.String mParentPartName = "";
    private java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> selectPartsList;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.AddPartBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public AddPartActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityAddPartBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.home.enquiry.BatchAddPartViewModel getMViewModel() {
        return null;
    }
    
    private final java.lang.String getCarId() {
        return null;
    }
    
    private final java.lang.String getEpc() {
        return null;
    }
    
    private final java.lang.String getCarIntro() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.AddPartAdapter getMAdapter() {
        return null;
    }
    
    private final void handlerOldData() {
    }
    
    private final void refreshDefaultList() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void addView(java.lang.String text, java.lang.String tag) {
    }
    
    @java.lang.Override()
    public void removeView(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String partName) {
    }
    
    private final void refreshSelectCount() {
    }
    
    private final void handlerRightSelectStatue() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String partName, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, boolean select, int position) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void handlerSelectList() {
    }
}