package com.android.ctgapp.activity.mine.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2/23/21
 * 描述: 公司设置页面 企业信息 页面 (修改)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a03H\u0016J\b\u00104\u001a\u000201H\u0016J\b\u00105\u001a\u000201H\u0016J\u0016\u00106\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a03H\u0016J\b\u00107\u001a\u000201H\u0016J\b\u00108\u001a\u00020#H\u0016J\"\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J \u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0012H\u0016J\u0012\u0010B\u001a\u0002012\b\u0010<\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b&\u0010\'R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010,R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/android/ctgapp/activity/mine/company/CompanyInfoSettingActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/widget/dialog/CitySelectDialog$SelectOverListener;", "Lcom/android/ctgapp/widget/dialog/company/CarSeriesSelectDialog$Callback;", "Lcom/android/ctgapp/widget/dialog/company/WeiXiuDengJiDialog$WXDJCallback;", "Lcom/android/ctgapp/widget/dialog/company/CooperativeInsuranceCompanyDialog$Callback;", "()V", "cityEntity", "Lcom/android/ctgapp/entity/CityEntity;", "citySelectDialog", "Lcom/android/ctgapp/widget/dialog/CitySelectDialog;", "getCitySelectDialog", "()Lcom/android/ctgapp/widget/dialog/CitySelectDialog;", "citySelectDialog$delegate", "Lkotlin/Lazy;", "companyEntity", "Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;", "companyEntityStr", "", "kotlin.jvm.PlatformType", "getCompanyEntityStr", "()Ljava/lang/String;", "companyEntityStr$delegate", "companyIntro", "mBXGSlist", "", "Lcom/android/ctgapp/entity/CarSeriesEntity$DataBean;", "mCarSeriesSelectDialog", "Lcom/android/ctgapp/widget/dialog/company/CarSeriesSelectDialog;", "mCity", "mCooperativeInsuranceCompanyDialog", "Lcom/android/ctgapp/widget/dialog/company/CooperativeInsuranceCompanyDialog;", "mDistrict", "mProvince", "mSize", "", "mViewModel", "Lcom/android/ctgapp/activity/mine/company/MyCompanyViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/company/MyCompanyViewModel;", "mViewModel$delegate", "mWXDJdialog", "Lcom/android/ctgapp/widget/dialog/company/WeiXiuDengJiDialog;", "mWXDJid", "Ljava/lang/Integer;", "mZXCXlist", "menuPopup", "Landroid/widget/PopupWindow;", "chexiCallback", "", "list", "", "click", "closeSelect", "cooperativeInsuranceCompanyCallback", "event", "getLayout", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onSelectOver", "province", "city", "district", "wxdjCallback", "app_WLDebug"})
public final class CompanyInfoSettingActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.widget.dialog.CitySelectDialog.SelectOverListener, com.android.ctgapp.widget.dialog.company.CarSeriesSelectDialog.Callback, com.android.ctgapp.widget.dialog.company.WeiXiuDengJiDialog.WXDJCallback, com.android.ctgapp.widget.dialog.company.CooperativeInsuranceCompanyDialog.Callback {
    private final kotlin.Lazy mViewModel$delegate = null;
    private android.widget.PopupWindow menuPopup;
    private final kotlin.Lazy companyEntityStr$delegate = null;
    private com.android.ctgapp.entity.CompanyDetailEntity.DataBean companyEntity;
    private java.lang.String mProvince = "";
    private java.lang.String mCity = "";
    private java.lang.String mDistrict = "";
    private java.lang.String companyIntro = "";
    private final java.util.Set<com.android.ctgapp.entity.CarSeriesEntity.DataBean> mZXCXlist = null;
    private final java.util.Set<com.android.ctgapp.entity.CarSeriesEntity.DataBean> mBXGSlist = null;
    private java.lang.Integer mWXDJid;
    private int mSize = 0;
    private com.android.ctgapp.widget.dialog.company.CarSeriesSelectDialog mCarSeriesSelectDialog;
    private com.android.ctgapp.widget.dialog.company.CooperativeInsuranceCompanyDialog mCooperativeInsuranceCompanyDialog;
    private com.android.ctgapp.widget.dialog.company.WeiXiuDengJiDialog mWXDJdialog;
    private com.android.ctgapp.entity.CityEntity cityEntity;
    private final kotlin.Lazy citySelectDialog$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public CompanyInfoSettingActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.activity.mine.company.MyCompanyViewModel getMViewModel() {
        return null;
    }
    
    private final java.lang.String getCompanyEntityStr() {
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
    
    @java.lang.Override()
    public void chexiCallback(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.android.ctgapp.entity.CarSeriesEntity.DataBean> list) {
    }
    
    @java.lang.Override()
    public void wxdjCallback(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.CarSeriesEntity.DataBean data) {
    }
    
    @java.lang.Override()
    public void cooperativeInsuranceCompanyCallback(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.android.ctgapp.entity.CarSeriesEntity.DataBean> list) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
}