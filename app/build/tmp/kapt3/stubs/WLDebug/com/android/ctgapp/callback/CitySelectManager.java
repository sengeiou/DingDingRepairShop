package com.android.ctgapp.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/android/ctgapp/callback/CitySelectManager;", "", "()V", "listener", "Lcom/android/ctgapp/callback/CitySelectListener;", "citySelectOver", "", "city", "", "districtOver", "district", "provinceSelectOver", "province", "setCallback", "app_WLDebug"})
public final class CitySelectManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.callback.CitySelectManager INSTANCE = null;
    private static com.android.ctgapp.callback.CitySelectListener listener;
    
    private CitySelectManager() {
        super();
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.callback.CitySelectListener listener) {
    }
    
    /**
     * *点击省份选择
     */
    public final void provinceSelectOver(@org.jetbrains.annotations.NotNull()
    java.lang.String province) {
    }
    
    /**
     * *点击城市选择
     */
    public final void citySelectOver(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
    
    /**
     * *点击区选择
     */
    public final void districtOver(@org.jetbrains.annotations.NotNull()
    java.lang.String district) {
    }
}