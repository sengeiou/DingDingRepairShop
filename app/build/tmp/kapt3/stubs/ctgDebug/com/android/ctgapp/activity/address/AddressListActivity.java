package com.android.ctgapp.activity.address;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 11/20/20
 * 描述:收货地址列表 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u001fH\u0014J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006+"}, d2 = {"Lcom/android/ctgapp/activity/address/AddressListActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/address/AddressAdapter$ChangeAddress;", "()V", "binding", "Lcom/android/ctgapp/databinding/ActivityAddressListBinding;", "getBinding", "()Lcom/android/ctgapp/databinding/ActivityAddressListBinding;", "binding$delegate", "Lkotlin/Lazy;", "canExit", "", "getCanExit", "()Z", "canExit$delegate", "deleteAddressIds", "Ljava/util/ArrayList;", "", "mAdapter", "Lcom/android/ctgapp/adapter/home/address/AddressAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/address/AddressAdapter;", "mAdapter$delegate", "mList", "Lcom/android/ctgapp/entity/AddressEntity$DataBean;", "mViewModel", "Lcom/android/ctgapp/activity/address/AddressListViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/address/AddressListViewModel;", "mViewModel$delegate", "addressSelect", "", "bean", "click", "deleteAddress", "addressId", "event", "getData", "getLayout", "Landroid/widget/LinearLayout;", "onResume", "setDefault", "updateAddress", "app_ctgDebug"})
public final class AddressListActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.address.AddressAdapter.ChangeAddress {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.AddressEntity.DataBean> mList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mAdapter$delegate = null;
    private final java.util.ArrayList<java.lang.Integer> deleteAddressIds = null;
    private final kotlin.Lazy canExit$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public AddressListActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivityAddressListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.address.AddressListViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.adapter.home.address.AddressAdapter getMAdapter() {
        return null;
    }
    
    private final boolean getCanExit() {
        return false;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void deleteAddress(int addressId) {
    }
    
    @java.lang.Override()
    public void updateAddress(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.AddressEntity.DataBean bean) {
    }
    
    @java.lang.Override()
    public void setDefault(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.AddressEntity.DataBean bean) {
    }
    
    @java.lang.Override()
    public void addressSelect(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.AddressEntity.DataBean bean) {
    }
}