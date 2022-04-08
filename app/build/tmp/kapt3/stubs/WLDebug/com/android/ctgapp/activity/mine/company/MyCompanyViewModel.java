package com.android.ctgapp.activity.mine.company;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ=\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u00a2\u0006\u0002\u0010!R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\u00a8\u0006\""}, d2 = {"Lcom/android/ctgapp/activity/mine/company/MyCompanyViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "commonUpdateResult", "Landroidx/lifecycle/LiveData;", "", "getCommonUpdateResult", "()Landroidx/lifecycle/LiveData;", "companyDetailResult", "getCompanyDetailResult", "mCommonUpdateResult", "Landroidx/lifecycle/MutableLiveData;", "mCompanyDetailResult", "mRangeResult", "rangeResult", "getRangeResult", "changeCompanyLogo", "", "logoUrl", "getCompanyDetail", "companyId", "", "getCompanyRange", "getMyCompany", "updateCompanyInfo", "data", "Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;", "updateCompanyInfoV2", "carSeries", "", "Lcom/android/ctgapp/entity/CarSeriesEntity$DataBean;", "gradeId", "insuranceCompanies", "(Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/Set;)V", "app_WLDebug"})
public final class MyCompanyViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mCompanyDetailResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mCommonUpdateResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mRangeResult = null;
    
    public MyCompanyViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCompanyDetailResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCommonUpdateResult() {
        return null;
    }
    
    public final void getCompanyDetail(int companyId) {
    }
    
    public final void getMyCompany() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getRangeResult() {
        return null;
    }
    
    public final void getCompanyRange() {
    }
    
    public final void updateCompanyInfo(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.CompanyDetailEntity.DataBean data) {
    }
    
    public final void updateCompanyInfoV2(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.CompanyDetailEntity.DataBean data, @org.jetbrains.annotations.Nullable()
    java.util.Set<com.android.ctgapp.entity.CarSeriesEntity.DataBean> carSeries, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gradeId, @org.jetbrains.annotations.Nullable()
    java.util.Set<com.android.ctgapp.entity.CarSeriesEntity.DataBean> insuranceCompanies) {
    }
    
    public final void changeCompanyLogo(@org.jetbrains.annotations.NotNull()
    java.lang.String logoUrl) {
    }
}