package com.android.ctgapp.widget.dialog.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/10
 * 描述:公司信息修改
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J \u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0016J\u001a\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/android/ctgapp/widget/dialog/company/CompanyInfoChangeCompanyDialog;", "Lcom/android/ctgapp/base/BaseCompanyDialogFragment;", "Lcom/android/ctgapp/widget/dialog/CitySelectDialog$SelectOverListener;", "companyInfo", "Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;", "companyCallback", "Lcom/android/ctgapp/callback/CompanyCallback;", "(Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;Lcom/android/ctgapp/callback/CompanyCallback;)V", "cityEntity", "Lcom/android/ctgapp/entity/CityEntity;", "citySelectDialog", "Lcom/android/ctgapp/widget/dialog/CitySelectDialog;", "getCitySelectDialog", "()Lcom/android/ctgapp/widget/dialog/CitySelectDialog;", "citySelectDialog$delegate", "Lkotlin/Lazy;", "entity", "mCity", "", "mDistrict", "mProvince", "mSize", "", "menuPopup", "Landroid/widget/PopupWindow;", "closeSelect", "", "getLayout", "onDestroy", "onSelectOver", "province", "city", "district", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_ctgRelease"})
public final class CompanyInfoChangeCompanyDialog extends com.android.ctgapp.base.BaseCompanyDialogFragment implements com.android.ctgapp.widget.dialog.CitySelectDialog.SelectOverListener {
    private final com.android.ctgapp.entity.CompanyDetailEntity.DataBean companyInfo = null;
    private final com.android.ctgapp.callback.CompanyCallback companyCallback = null;
    private com.android.ctgapp.entity.CompanyDetailEntity.DataBean entity;
    private android.widget.PopupWindow menuPopup;
    private java.lang.String mProvince = "";
    private java.lang.String mCity = "";
    private java.lang.String mDistrict = "";
    private com.android.ctgapp.entity.CityEntity cityEntity;
    private final kotlin.Lazy citySelectDialog$delegate = null;
    private int mSize = 0;
    private java.util.HashMap _$_findViewCache;
    
    public CompanyInfoChangeCompanyDialog(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.CompanyDetailEntity.DataBean companyInfo, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.callback.CompanyCallback companyCallback) {
        super();
    }
    
    private final com.android.ctgapp.widget.dialog.CitySelectDialog getCitySelectDialog() {
        return null;
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
    public void onSelectOver(@org.jetbrains.annotations.NotNull()
    java.lang.String province, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String district) {
    }
    
    @java.lang.Override()
    public void closeSelect() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}