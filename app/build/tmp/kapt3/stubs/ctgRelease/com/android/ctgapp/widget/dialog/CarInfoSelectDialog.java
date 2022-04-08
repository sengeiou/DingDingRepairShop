package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/8/3
 * 描述:车型配置选择 Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/widget/dialog/CarInfoSelectDialog;", "Lcom/android/ctgapp/base/BaseDialogFragment;", "Lcom/android/ctgapp/adapter/home/enquiry/CarConfigSelectAdapter$CarConfigSelectCallback;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/CarConfigSelectBean;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/android/ctgapp/widget/dialog/CarInfoSelectDialog$CarInfoSelectCallBack;", "(Ljava/util/ArrayList;Lcom/android/ctgapp/widget/dialog/CarInfoSelectDialog$CarInfoSelectCallBack;)V", "getLayout", "", "onItemClick", "", "carId", "", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "CarInfoSelectCallBack", "app_ctgRelease"})
public final class CarInfoSelectDialog extends com.android.ctgapp.base.BaseDialogFragment implements com.android.ctgapp.adapter.home.enquiry.CarConfigSelectAdapter.CarConfigSelectCallback {
    private final java.util.ArrayList<com.android.ctgapp.entity.home.CarConfigSelectBean> mList = null;
    private final com.android.ctgapp.widget.dialog.CarInfoSelectDialog.CarInfoSelectCallBack listener = null;
    private java.util.HashMap _$_findViewCache;
    
    public CarInfoSelectDialog(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.home.CarConfigSelectBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.CarInfoSelectDialog.CarInfoSelectCallBack listener) {
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
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String carId) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/widget/dialog/CarInfoSelectDialog$CarInfoSelectCallBack;", "", "onCarIdSelect", "", "carID", "", "app_ctgRelease"})
    public static abstract interface CarInfoSelectCallBack {
        
        public abstract void onCarIdSelect(@org.jetbrains.annotations.NotNull()
        java.lang.String carID);
    }
}