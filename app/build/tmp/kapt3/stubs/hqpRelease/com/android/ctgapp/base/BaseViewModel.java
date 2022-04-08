package com.android.ctgapp.base;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/3
 * 描述: ViewModel基类
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "error", "Landroidx/lifecycle/LiveData;", "", "getError", "()Landroidx/lifecycle/LiveData;", "fileResult", "getFileResult", "fileResultWithFileName", "getFileResultWithFileName", "mError", "Landroidx/lifecycle/MutableLiveData;", "mFileResult", "mFileResultWithFileName", "setError", "", "msg", "upLoadFile", "file", "Ljava/io/File;", "upLoadFileResultFileName", "app_hqpRelease"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mError = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mFileResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mFileResultWithFileName = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFileResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFileResultWithFileName() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void upLoadFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    public final void upLoadFileResultFileName(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
}