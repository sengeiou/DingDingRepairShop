package com.android.ctgapp.activity.mine.team;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J5\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J=\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u001aJ?\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\n\u00a8\u0006!"}, d2 = {"Lcom/android/ctgapp/activity/mine/team/AddOrEditMemberViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "mResult", "Landroidx/lifecycle/MutableLiveData;", "", "mUserResult", "result", "Landroidx/lifecycle/LiveData;", "getResult", "()Landroidx/lifecycle/LiveData;", "userResult", "getUserResult", "addMember", "", "departmentId", "", "userNo", "userId", "labelId", "isAdmin", "", "(ILjava/lang/String;ILjava/lang/Integer;Z)V", "addMemberAutoRegister", "phone", "name", "(ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;)V", "editMember", "oldDepartmentId", "newDepartmentId", "(Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/Integer;Z)V", "findUser", "removeMember", "app_hqpRelease"})
public final class AddOrEditMemberViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mUserResult = null;
    
    public AddOrEditMemberViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getUserResult() {
        return null;
    }
    
    public final void addMember(int departmentId, @org.jetbrains.annotations.NotNull()
    java.lang.String userNo, int userId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer labelId, boolean isAdmin) {
    }
    
    public final void addMemberAutoRegister(int departmentId, @org.jetbrains.annotations.NotNull()
    java.lang.String userNo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer labelId, boolean isAdmin, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void removeMember(int userId) {
    }
    
    public final void editMember(@org.jetbrains.annotations.Nullable()
    java.lang.Integer oldDepartmentId, int newDepartmentId, int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String userNo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer labelId, boolean isAdmin) {
    }
    
    public final void findUser(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
}