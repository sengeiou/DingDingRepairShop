package com.android.ctgapp.widget.dialog.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2/23/21
 * 描述: 维修等级
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012\u00a8\u0006 "}, d2 = {"Lcom/android/ctgapp/widget/dialog/company/WeiXiuDengJiDialog;", "Lcom/android/ctgapp/base/BaseCompanyDialogFragment;", "Lcom/android/ctgapp/adapter/mine/WeiXiuDengJiAdapter$CallBack;", "selectId", "", "listener", "Lcom/android/ctgapp/widget/dialog/company/WeiXiuDengJiDialog$WXDJCallback;", "(Ljava/lang/Integer;Lcom/android/ctgapp/widget/dialog/company/WeiXiuDengJiDialog$WXDJCallback;)V", "mData", "Lcom/android/ctgapp/entity/CarSeriesEntity$DataBean;", "mList", "Ljava/util/ArrayList;", "mViewModel", "Lcom/android/ctgapp/widget/dialog/company/CarSeriesSelectViewModel;", "getMViewModel", "()Lcom/android/ctgapp/widget/dialog/company/CarSeriesSelectViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "Ljava/lang/Integer;", "getLayout", "onStart", "", "selectCallBack", "select", "", "data", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "WXDJCallback", "app_hqpDebug"})
public final class WeiXiuDengJiDialog extends com.android.ctgapp.base.BaseCompanyDialogFragment implements com.android.ctgapp.adapter.mine.WeiXiuDengJiAdapter.CallBack {
    private final java.lang.Integer selectId = null;
    private final com.android.ctgapp.widget.dialog.company.WeiXiuDengJiDialog.WXDJCallback listener = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private com.android.ctgapp.entity.CarSeriesEntity.DataBean mData;
    private final java.util.ArrayList<com.android.ctgapp.entity.CarSeriesEntity.DataBean> mList = null;
    private java.util.HashMap _$_findViewCache;
    
    public WeiXiuDengJiDialog(@org.jetbrains.annotations.Nullable()
    java.lang.Integer selectId, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.company.WeiXiuDengJiDialog.WXDJCallback listener) {
        super();
    }
    
    private final com.android.ctgapp.widget.dialog.company.CarSeriesSelectViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void viewIsCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void selectCallBack(boolean select, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.CarSeriesEntity.DataBean data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/widget/dialog/company/WeiXiuDengJiDialog$WXDJCallback;", "", "wxdjCallback", "", "data", "Lcom/android/ctgapp/entity/CarSeriesEntity$DataBean;", "app_hqpDebug"})
    public static abstract interface WXDJCallback {
        
        public abstract void wxdjCallback(@org.jetbrains.annotations.Nullable()
        com.android.ctgapp.entity.CarSeriesEntity.DataBean data);
    }
}