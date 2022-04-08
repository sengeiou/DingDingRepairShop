package com.android.ctgapp.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/android/ctgapp/callback/CitySelectListener;", "", "citySelectOver", "", "city", "", "districtOver", "district", "provinceSelectOver", "province", "app_hqpRelease"})
public abstract interface CitySelectListener {
    
    /**
     * *点击省份选择
     */
    public abstract void provinceSelectOver(@org.jetbrains.annotations.NotNull()
    java.lang.String province);
    
    /**
     * *点击城市选择
     */
    public abstract void citySelectOver(@org.jetbrains.annotations.NotNull()
    java.lang.String city);
    
    /**
     * *点击区选择
     */
    public abstract void districtOver(@org.jetbrains.annotations.NotNull()
    java.lang.String district);
}