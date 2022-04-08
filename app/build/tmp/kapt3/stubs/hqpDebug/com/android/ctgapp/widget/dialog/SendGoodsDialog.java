package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 3/18/21
 * 描述:售后 发货dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/android/ctgapp/widget/dialog/SendGoodsDialog;", "Lcom/android/ctgapp/base/BaseDialogFragment;", "orderID", "", "listener", "Lcom/android/ctgapp/widget/dialog/SendGoodsDialog$Callback;", "(Ljava/lang/String;Lcom/android/ctgapp/widget/dialog/SendGoodsDialog$Callback;)V", "loading", "Lcom/android/ctgapp/widget/dialog/LoadingDialog;", "getLoading", "()Lcom/android/ctgapp/widget/dialog/LoadingDialog;", "loading$delegate", "Lkotlin/Lazy;", "mViewModel", "Lcom/android/ctgapp/widget/dialog/SendGoodsViewModel;", "getMViewModel", "()Lcom/android/ctgapp/widget/dialog/SendGoodsViewModel;", "mViewModel$delegate", "dismissDialog", "", "getLayout", "", "onDestroyView", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callback", "app_hqpDebug"})
public final class SendGoodsDialog extends com.android.ctgapp.base.BaseDialogFragment {
    private final java.lang.String orderID = null;
    private final com.android.ctgapp.widget.dialog.SendGoodsDialog.Callback listener = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loading$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public SendGoodsDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String orderID, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.SendGoodsDialog.Callback listener) {
        super();
    }
    
    private final com.android.ctgapp.widget.dialog.SendGoodsViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.widget.dialog.LoadingDialog getLoading() {
        return null;
    }
    
    @java.lang.Override()
    public void viewIsCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void dismissDialog() {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/android/ctgapp/widget/dialog/SendGoodsDialog$Callback;", "", "sendGoodsFinish", "", "app_hqpDebug"})
    public static abstract interface Callback {
        
        public abstract void sendGoodsFinish();
    }
}