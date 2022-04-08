package com.android.ctgapp.activity.mine.team;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0014J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/activity/mine/team/DepartmentSelectViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "addDepartmentResult", "Landroidx/lifecycle/LiveData;", "", "getAddDepartmentResult", "()Landroidx/lifecycle/LiveData;", "departmentListResult", "getDepartmentListResult", "mAddDepartmentResult", "Landroidx/lifecycle/MutableLiveData;", "mDepartmentListResult", "mResult", "result", "getResult", "addDepartment", "", "parentDepartmentName", "parentDepartmentId", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "deleteDepartment", "departmentId", "editDepartment", "departmentName", "getDepartment", "app_ctgRelease"})
public final class DepartmentSelectViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mDepartmentListResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mAddDepartmentResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mResult = null;
    
    public DepartmentSelectViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDepartmentListResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAddDepartmentResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResult() {
        return null;
    }
    
    public final void getDepartment(int departmentId) {
    }
    
    public final void addDepartment(@org.jetbrains.annotations.NotNull()
    java.lang.String parentDepartmentName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer parentDepartmentId) {
    }
    
    public final void editDepartment(@org.jetbrains.annotations.NotNull()
    java.lang.String departmentName, int departmentId) {
    }
    
    public final void deleteDepartment(int departmentId) {
    }
}