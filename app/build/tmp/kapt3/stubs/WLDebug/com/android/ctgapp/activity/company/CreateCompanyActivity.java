package com.android.ctgapp.activity.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/30
 * 描述: 创建公司 创建企业 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0017J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020!H\u0014J \u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/android/ctgapp/activity/company/CreateCompanyActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/widget/dialog/CitySelectDialog$SelectOverListener;", "()V", "binding", "Lcom/android/ctgapp/databinding/ActivityCreateCompanyBinding;", "getBinding", "()Lcom/android/ctgapp/databinding/ActivityCreateCompanyBinding;", "binding$delegate", "Lkotlin/Lazy;", "cityEntity", "Lcom/android/ctgapp/entity/CityEntity;", "citySelectDialog", "Lcom/android/ctgapp/widget/dialog/CitySelectDialog;", "mCity", "", "mDistrict", "mProvince", "mSize", "", "mSwitchCompanyViewModel", "Lcom/android/ctgapp/activity/company/SwitchCompanyViewModel;", "getMSwitchCompanyViewModel", "()Lcom/android/ctgapp/activity/company/SwitchCompanyViewModel;", "mSwitchCompanyViewModel$delegate", "mViewModel", "Lcom/android/ctgapp/activity/company/CreateCompanyViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/company/CreateCompanyViewModel;", "mViewModel$delegate", "menuPopup", "Landroid/widget/PopupWindow;", "click", "", "closeSelect", "event", "getLayout", "Landroid/widget/LinearLayout;", "onDestroy", "onSelectOver", "province", "city", "district", "app_WLDebug"})
public final class CreateCompanyActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.widget.dialog.CitySelectDialog.SelectOverListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mSwitchCompanyViewModel$delegate = null;
    private java.lang.String mProvince = "";
    private java.lang.String mCity = "";
    private java.lang.String mDistrict = "";
    private com.android.ctgapp.entity.CityEntity cityEntity;
    private com.android.ctgapp.widget.dialog.CitySelectDialog citySelectDialog;
    private android.widget.PopupWindow menuPopup;
    private int mSize = 0;
    private java.util.HashMap _$_findViewCache;
    
    public CreateCompanyActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.databinding.ActivityCreateCompanyBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.company.CreateCompanyViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.activity.company.SwitchCompanyViewModel getMSwitchCompanyViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
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
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}