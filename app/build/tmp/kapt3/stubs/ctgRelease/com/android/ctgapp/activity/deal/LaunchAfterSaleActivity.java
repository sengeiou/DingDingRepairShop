package com.android.ctgapp.activity.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 11/18/20
 * 描述: 发起售后 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020&H\u0002J\"\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020#X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/android/ctgapp/activity/deal/LaunchAfterSaleActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/widget/dialog/ReturnGoodsReasonDialog$Callback;", "()V", "binding", "Lcom/android/ctgapp/databinding/ActivityLacunchAfterSaleBinding;", "getBinding", "()Lcom/android/ctgapp/databinding/ActivityLacunchAfterSaleBinding;", "binding$delegate", "Lkotlin/Lazy;", "hasUseCoupon", "", "getHasUseCoupon", "()Z", "hasUseCoupon$delegate", "imageFiles", "Ljava/util/ArrayList;", "Ljava/io/File;", "Lkotlin/collections/ArrayList;", "imageShowList", "", "mList", "Lcom/android/ctgapp/entity/deal/CanRefundEntity$DataBean;", "getMList", "()Ljava/util/ArrayList;", "mViewModel", "Lcom/android/ctgapp/activity/deal/LaunchAfterSaleViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/deal/LaunchAfterSaleViewModel;", "mViewModel$delegate", "orderId", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "requestCodePicker", "", "selectReason", "click", "", "event", "getLayout", "Landroid/widget/LinearLayout;", "initImagePicker", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onItemSelect", "select", "app_ctgRelease"})
public final class LaunchAfterSaleActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.widget.dialog.ReturnGoodsReasonDialog.Callback {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy hasUseCoupon$delegate = null;
    private final int requestCodePicker = 1001;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.android.ctgapp.entity.deal.CanRefundEntity.DataBean> mList = null;
    private final kotlin.Lazy orderId$delegate = null;
    private java.lang.String selectReason = "";
    private final java.util.ArrayList<java.lang.String> imageShowList = null;
    private final java.util.ArrayList<java.io.File> imageFiles = null;
    private java.util.HashMap _$_findViewCache;
    
    public LaunchAfterSaleActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivityLacunchAfterSaleBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.deal.LaunchAfterSaleViewModel getMViewModel() {
        return null;
    }
    
    private final boolean getHasUseCoupon() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.deal.CanRefundEntity.DataBean> getMList() {
        return null;
    }
    
    private final java.lang.String getOrderId() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void initImagePicker() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onItemSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String select) {
    }
}