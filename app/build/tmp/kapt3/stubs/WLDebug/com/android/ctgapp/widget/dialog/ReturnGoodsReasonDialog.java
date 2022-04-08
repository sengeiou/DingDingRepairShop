package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 12/9/20
 * 描述: 退货原因Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/android/ctgapp/widget/dialog/ReturnGoodsReasonDialog;", "Lcom/android/ctgapp/base/BaseDialogFromBottomFragment;", "selectReason", "", "callback", "Lcom/android/ctgapp/widget/dialog/ReturnGoodsReasonDialog$Callback;", "(Ljava/lang/String;Lcom/android/ctgapp/widget/dialog/ReturnGoodsReasonDialog$Callback;)V", "selectStr", "getLayout", "", "viewIsCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callback", "app_WLDebug"})
public final class ReturnGoodsReasonDialog extends com.android.ctgapp.base.BaseDialogFromBottomFragment {
    private final java.lang.String selectReason = null;
    private final com.android.ctgapp.widget.dialog.ReturnGoodsReasonDialog.Callback callback = null;
    private java.lang.String selectStr;
    private java.util.HashMap _$_findViewCache;
    
    public ReturnGoodsReasonDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String selectReason, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.ReturnGoodsReasonDialog.Callback callback) {
        super();
    }
    
    @java.lang.Override()
    public void viewIsCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/widget/dialog/ReturnGoodsReasonDialog$Callback;", "", "onItemSelect", "", "select", "", "app_WLDebug"})
    public static abstract interface Callback {
        
        public abstract void onItemSelect(@org.jetbrains.annotations.NotNull()
        java.lang.String select);
    }
}