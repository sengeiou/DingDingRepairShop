package com.android.ctgapp.activity.address;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/10
 * 描述:添加 修改 收货地址 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\"H\u0016J \u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\'"}, d2 = {"Lcom/android/ctgapp/activity/address/AddressEditActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/widget/dialog/CitySelectDialog$SelectOverListener;", "()V", "addressId", "", "cityEntity", "Lcom/android/ctgapp/entity/CityEntity;", "citySelectDialog", "Lcom/android/ctgapp/widget/dialog/CitySelectDialog;", "getCitySelectDialog", "()Lcom/android/ctgapp/widget/dialog/CitySelectDialog;", "citySelectDialog$delegate", "Lkotlin/Lazy;", "isDefault", "", "mBinding", "Lcom/android/ctgapp/databinding/ActivityAddressEditBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityAddressEditBinding;", "mBinding$delegate", "mCity", "mDistrict", "mProvince", "mViewModel", "Lcom/android/ctgapp/activity/address/AddressEditViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/address/AddressEditViewModel;", "mViewModel$delegate", "click", "", "closeSelect", "event", "getLayout", "Landroid/widget/LinearLayout;", "onSelectOver", "province", "city", "district", "app_hqpDebug"})
public final class AddressEditActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.widget.dialog.CitySelectDialog.SelectOverListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.lang.String mProvince = "";
    private java.lang.String mCity = "";
    private java.lang.String mDistrict = "";
    private java.lang.String addressId = "";
    private boolean isDefault = false;
    private com.android.ctgapp.entity.CityEntity cityEntity;
    private final kotlin.Lazy citySelectDialog$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public AddressEditActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivityAddressEditBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.address.AddressEditViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.widget.dialog.CitySelectDialog getCitySelectDialog() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onSelectOver(@org.jetbrains.annotations.NotNull()
    java.lang.String province, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String district) {
    }
    
    @java.lang.Override()
    public void closeSelect() {
    }
}