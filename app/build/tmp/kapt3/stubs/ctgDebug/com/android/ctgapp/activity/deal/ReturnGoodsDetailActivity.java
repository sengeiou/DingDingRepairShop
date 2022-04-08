package com.android.ctgapp.activity.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 12/3/20
 * 描述:退货详情 页面 (未审核之前可以进行修改)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020EH\u0016J\b\u0010G\u001a\u00020EH\u0016J\b\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020EH\u0002J\"\u0010K\u001a\u00020E2\u0006\u0010L\u001a\u00020<2\u0006\u0010M\u001a\u00020<2\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\b\u0010P\u001a\u00020EH\u0014J\u0010\u0010Q\u001a\u00020E2\u0006\u0010R\u001a\u00020\rH\u0016J\b\u0010S\u001a\u00020EH\u0016J\u000e\u0010T\u001a\u00020E2\u0006\u0010U\u001a\u00020<R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0006j\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b$\u0010%R\u000e\u0010\'\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u0019\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b0\u00101R#\u00103\u001a\n 4*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\u0019\u001a\u0004\b5\u00106R#\u00108\u001a\n 4*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\u0019\u001a\u0004\b9\u00106R\u000e\u0010;\u001a\u00020<X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020<X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006V"}, d2 = {"Lcom/android/ctgapp/activity/deal/ReturnGoodsDetailActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/widget/dialog/ReturnGoodsReasonDialog$Callback;", "Lcom/android/ctgapp/widget/dialog/SendGoodsDialog$Callback;", "()V", "changeList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/deal/ReturnGoodsDetailEntity$DataBean$ReturnOrderDetailsBean;", "getChangeList", "()Ljava/util/ArrayList;", "chartList", "Lcom/android/ctgapp/entity/deal/ChatersBean;", "deleteImageIds", "", "imageFiles", "Ljava/io/File;", "Lkotlin/collections/ArrayList;", "imageList", "Lcom/android/ctgapp/entity/deal/ReturnGoodsDetailEntity$DataBean$ReturnPicsBean;", "imageShowList", "mBinding", "Lcom/android/ctgapp/databinding/ActivityReturnGoodsDetailBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityReturnGoodsDetailBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mEditAdapter", "Lcom/android/ctgapp/adapter/deal/ReturnDetailEditAdapter;", "getMEditAdapter", "()Lcom/android/ctgapp/adapter/deal/ReturnDetailEditAdapter;", "mEditAdapter$delegate", "mEditList", "mEntity", "Lcom/android/ctgapp/entity/deal/ReturnGoodsDetailEntity$DataBean;", "mImageAdapter", "Lcom/android/ctgapp/adapter/deal/ReturnDetailImageAdapter;", "getMImageAdapter", "()Lcom/android/ctgapp/adapter/deal/ReturnDetailImageAdapter;", "mImageAdapter$delegate", "mLogisticsNo", "mShowAdapter", "Lcom/android/ctgapp/adapter/deal/ReturnDetailShowAdapter;", "getMShowAdapter", "()Lcom/android/ctgapp/adapter/deal/ReturnDetailShowAdapter;", "mShowAdapter$delegate", "mShowList", "mViewModel", "Lcom/android/ctgapp/activity/deal/ReturnGoodsDetailViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/deal/ReturnGoodsDetailViewModel;", "mViewModel$delegate", "orderId", "kotlin.jvm.PlatformType", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "orderNo", "getOrderNo", "orderNo$delegate", "requestCodePicker", "", "returnOrderId", "selectReason", "selectReasonDetail", "sellerCompanyName", "showModel", "", "statueType", "changeReturnGood", "", "click", "event", "getLayout", "Landroid/widget/LinearLayout;", "initImagePicker", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onItemSelect", "select", "sendGoodsFinish", "showState", "type", "app_ctgDebug"})
public final class ReturnGoodsDetailActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.widget.dialog.ReturnGoodsReasonDialog.Callback, com.android.ctgapp.widget.dialog.SendGoodsDialog.Callback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.lang.String returnOrderId = "";
    private int statueType = -1;
    private final java.util.ArrayList<com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity.DataBean.ReturnOrderDetailsBean> mShowList = null;
    private final kotlin.Lazy orderId$delegate = null;
    private final kotlin.Lazy orderNo$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity.DataBean.ReturnOrderDetailsBean> changeList = null;
    private com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity.DataBean mEntity;
    private final kotlin.Lazy mShowAdapter$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity.DataBean.ReturnOrderDetailsBean> mEditList = null;
    private final kotlin.Lazy mEditAdapter$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity.DataBean.ReturnPicsBean> imageList = null;
    private final kotlin.Lazy mImageAdapter$delegate = null;
    private final int requestCodePicker = 1001;
    private java.lang.String selectReason = "";
    private java.lang.String selectReasonDetail = "";
    private final java.util.ArrayList<java.lang.String> imageShowList = null;
    private final java.util.ArrayList<java.lang.String> deleteImageIds = null;
    private final java.util.ArrayList<java.io.File> imageFiles = null;
    private java.lang.String mLogisticsNo = "";
    private boolean showModel = true;
    private java.util.ArrayList<com.android.ctgapp.entity.deal.ChatersBean> chartList;
    private java.lang.String sellerCompanyName = "";
    private java.util.HashMap _$_findViewCache;
    
    public ReturnGoodsDetailActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityReturnGoodsDetailBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.deal.ReturnGoodsDetailViewModel getMViewModel() {
        return null;
    }
    
    private final java.lang.String getOrderId() {
        return null;
    }
    
    private final java.lang.String getOrderNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity.DataBean.ReturnOrderDetailsBean> getChangeList() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.ReturnDetailShowAdapter getMShowAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.ReturnDetailEditAdapter getMEditAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.deal.ReturnDetailImageAdapter getMImageAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    public final void showState(int type) {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void changeReturnGood() {
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
    
    @java.lang.Override()
    public void sendGoodsFinish() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}