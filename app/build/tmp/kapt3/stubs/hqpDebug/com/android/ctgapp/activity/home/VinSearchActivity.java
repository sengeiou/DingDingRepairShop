package com.android.ctgapp.activity.home;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/3
 * 描述: 车架号查询 页面 VIN 车辆信息 页面 VIN查询 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\"H\u0002J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0002J\"\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u0010\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0005H\u0016J\u0012\u00105\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/android/ctgapp/activity/home/VinSearchActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/widget/dialog/CarInfoSelectDialog$CarInfoSelectCallBack;", "()V", "carBrand", "", "carFactory", "carIcon", "carIntro", "carIntroDetail", "carRange", "epc", "mBinding", "Lcom/android/ctgapp/databinding/ActivityVinSearchBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityVinSearchBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mCarId", "mData", "mViewModel", "Lcom/android/ctgapp/activity/home/VinSearchViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/VinSearchViewModel;", "mViewModel$delegate", "vinCode", "vinKeyboardUtil", "Lcom/android/ctgapp/util/VinKeyboardUtil;", "getVinKeyboardUtil", "()Lcom/android/ctgapp/util/VinKeyboardUtil;", "vinKeyboardUtil$delegate", "vinResultCode", "", "click", "", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "event", "getLayout", "Landroid/widget/RelativeLayout;", "getVIN", "handlerVinHistory", "vinData", "Lcom/android/ctgapp/entity/home/VinResultEntityV3$DataBean;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCarIdSelect", "carID", "onTouchEvent", "app_hqpDebug"})
public final class VinSearchActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.widget.dialog.CarInfoSelectDialog.CarInfoSelectCallBack {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.lang.String vinCode = "";
    private java.lang.String carIntro = "";
    private java.lang.String carIcon = "";
    private java.lang.String carIntroDetail = "";
    private java.lang.String epc = "";
    private final kotlin.Lazy vinKeyboardUtil$delegate = null;
    private final int vinResultCode = 101;
    private java.lang.String mCarId = "";
    private java.lang.String carBrand = "";
    private java.lang.String carFactory = "";
    private java.lang.String carRange = "";
    private java.lang.String mData = "";
    private java.util.HashMap _$_findViewCache;
    
    public VinSearchActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityVinSearchBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RelativeLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.home.VinSearchViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.util.VinKeyboardUtil getVinKeyboardUtil() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void handlerVinHistory(com.android.ctgapp.entity.home.VinResultEntityV3.DataBean vinData) {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void getVIN() {
    }
    
    @java.lang.Override()
    public void onCarIdSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String carID) {
    }
}