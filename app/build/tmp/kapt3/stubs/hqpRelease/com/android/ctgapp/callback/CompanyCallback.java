package com.android.ctgapp.callback;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/10
 * 描述: 修改公司信息
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/android/ctgapp/callback/CompanyCallback;", "", "changeCompanyInfo", "", "data", "Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;", "saveIntro", "companyIntro", "", "app_hqpRelease"})
public abstract interface CompanyCallback {
    
    public abstract void saveIntro(@org.jetbrains.annotations.NotNull()
    java.lang.String companyIntro);
    
    public abstract void changeCompanyInfo(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.CompanyDetailEntity.DataBean data);
}