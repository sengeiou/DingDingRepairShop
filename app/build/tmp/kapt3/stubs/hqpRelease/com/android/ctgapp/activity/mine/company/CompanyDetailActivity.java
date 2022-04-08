package com.android.ctgapp.activity.mine.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/9
 * 描述: 企业 页面 企业详情 页面 企业信息 页面 公司详情 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020&H\u0016J\"\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020!H\u0014J-\u0010,\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00052\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u001e2\u0006\u0010-\u001a\u00020.H\u0016\u00a2\u0006\u0002\u0010/J\b\u00100\u001a\u00020!H\u0014J\b\u00101\u001a\u00020!H\u0002J\u0010\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020\u0007H\u0016J\b\u00104\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001f\u00a8\u00065"}, d2 = {"Lcom/android/ctgapp/activity/mine/company/CompanyDetailActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/callback/CompanyCallback;", "()V", "attestationStatus", "", "companyEntity", "", "companyId", "getCompanyId", "()I", "companyId$delegate", "Lkotlin/Lazy;", "companyInfo", "Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;", "isAttestation", "", "mBinding", "Lcom/android/ctgapp/databinding/ActivityMyCompanyBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityMyCompanyBinding;", "mBinding$delegate", "mCompanyInfoChangeDialog", "Lcom/android/ctgapp/widget/dialog/company/CompanyInfoChangeCompanyDialog;", "mViewModel", "Lcom/android/ctgapp/activity/mine/company/MyCompanyViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/company/MyCompanyViewModel;", "mViewModel$delegate", "permissions", "", "[Ljava/lang/String;", "changeCompanyInfo", "", "data", "click", "event", "getLayout", "Landroid/widget/LinearLayout;", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onDestroy", "onRequestPermissionsResult", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "refreshCompanyInfo", "saveIntro", "companyIntro", "takePhoto", "app_hqpRelease"})
public final class CompanyDetailActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.callback.CompanyCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy companyId$delegate = null;
    private com.android.ctgapp.entity.CompanyDetailEntity.DataBean companyInfo;
    private java.lang.String companyEntity = "";
    private com.android.ctgapp.widget.dialog.company.CompanyInfoChangeCompanyDialog mCompanyInfoChangeDialog;
    private final java.lang.String[] permissions = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private boolean isAttestation = false;
    private int attestationStatus = -1;
    private java.util.HashMap _$_findViewCache;
    
    public CompanyDetailActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityMyCompanyBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.company.MyCompanyViewModel getMViewModel() {
        return null;
    }
    
    private final int getCompanyId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void refreshCompanyInfo() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void takePhoto() {
    }
    
    @java.lang.Override()
    public void saveIntro(@org.jetbrains.annotations.NotNull()
    java.lang.String companyIntro) {
    }
    
    @java.lang.Override()
    public void changeCompanyInfo(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.CompanyDetailEntity.DataBean data) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
}