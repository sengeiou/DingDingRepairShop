package com.android.ctgapp.activity.home.shop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/EnquiryViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "addPartResult", "Landroidx/lifecycle/LiveData;", "", "getAddPartResult", "()Landroidx/lifecycle/LiveData;", "companyResult", "getCompanyResult", "imagesResult", "getImagesResult", "mAddPartResult", "Landroidx/lifecycle/MutableLiveData;", "mCompanyResult", "mImagesResult", "mSubmitResult", "submitResult", "getSubmitResult", "getBatchAddPatch", "", "queryGetCompany", "carRange", "submitOrder", "body", "Lokhttp3/RequestBody;", "uploadImage", "img", "Ljava/util/ArrayList;", "Lokhttp3/MultipartBody$Part;", "app_hqpDebug"})
public final class EnquiryViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mAddPartResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mCompanyResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mSubmitResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mImagesResult = null;
    
    public EnquiryViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAddPartResult() {
        return null;
    }
    
    public final void getBatchAddPatch() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCompanyResult() {
        return null;
    }
    
    public final void queryGetCompany(@org.jetbrains.annotations.NotNull()
    java.lang.String carRange) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSubmitResult() {
        return null;
    }
    
    public final void submitOrder(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getImagesResult() {
        return null;
    }
    
    /**
     * 多图上传
     */
    public final void uploadImage(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<okhttp3.MultipartBody.Part> img) {
    }
}