package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/10
 * 描述:地址选择器 Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u001a\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/widget/dialog/CitySelectDialog;", "Lcom/android/ctgapp/base/BaseCompanyDialogFragment;", "Lcom/android/ctgapp/callback/CitySelectListener;", "entity", "Lcom/android/ctgapp/entity/CityEntity;", "listener", "Lcom/android/ctgapp/widget/dialog/CitySelectDialog$SelectOverListener;", "(Lcom/android/ctgapp/entity/CityEntity;Lcom/android/ctgapp/widget/dialog/CitySelectDialog$SelectOverListener;)V", "mCity", "", "mDistrict", "mProvince", "citySelectOver", "", "city", "districtOver", "district", "getLayout", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "provinceSelectOver", "province", "viewIsCreated", "view", "Landroid/view/View;", "SelectOverListener", "app_ctgRelease"})
public final class CitySelectDialog extends com.android.ctgapp.base.BaseCompanyDialogFragment implements com.android.ctgapp.callback.CitySelectListener {
    private com.android.ctgapp.entity.CityEntity entity;
    private final com.android.ctgapp.widget.dialog.CitySelectDialog.SelectOverListener listener = null;
    private java.lang.String mProvince = "";
    private java.lang.String mCity = "";
    private java.lang.String mDistrict = "";
    private java.util.HashMap _$_findViewCache;
    
    public CitySelectDialog(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.CityEntity entity, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.CitySelectDialog.SelectOverListener listener) {
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
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void provinceSelectOver(@org.jetbrains.annotations.NotNull()
    java.lang.String province) {
    }
    
    @java.lang.Override()
    public void citySelectOver(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
    
    @java.lang.Override()
    public void districtOver(@org.jetbrains.annotations.NotNull()
    java.lang.String district) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Lcom/android/ctgapp/widget/dialog/CitySelectDialog$SelectOverListener;", "", "closeSelect", "", "onSelectOver", "province", "", "city", "district", "app_ctgRelease"})
    public static abstract interface SelectOverListener {
        
        public abstract void onSelectOver(@org.jetbrains.annotations.NotNull()
        java.lang.String province, @org.jetbrains.annotations.NotNull()
        java.lang.String city, @org.jetbrains.annotations.NotNull()
        java.lang.String district);
        
        public abstract void closeSelect();
    }
}