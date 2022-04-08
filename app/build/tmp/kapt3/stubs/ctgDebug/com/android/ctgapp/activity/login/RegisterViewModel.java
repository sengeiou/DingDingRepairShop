package com.android.ctgapp.activity.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/android/ctgapp/activity/login/RegisterViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "authCodeResult", "Landroidx/lifecycle/LiveData;", "", "getAuthCodeResult", "()Landroidx/lifecycle/LiveData;", "confirmResult", "getConfirmResult", "loginResult", "getLoginResult", "mAuthCodeResult", "Landroidx/lifecycle/MutableLiveData;", "mConfirmResult", "mLoginResult", "getAuthCode", "", "phone", "loginByPassword", "password", "userRegister", "body", "Lokhttp3/RequestBody;", "app_ctgDebug"})
public final class RegisterViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mAuthCodeResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mConfirmResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mLoginResult = null;
    
    public RegisterViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAuthCodeResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getConfirmResult() {
        return null;
    }
    
    /**
     * *获取验证码
     */
    public final void getAuthCode(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    /**
     * *提交注册
     */
    public final void userRegister(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getLoginResult() {
        return null;
    }
    
    /**
     * *密码登录
     */
    public final void loginByPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
}