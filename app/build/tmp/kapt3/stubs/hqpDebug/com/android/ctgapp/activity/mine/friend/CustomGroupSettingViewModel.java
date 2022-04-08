package com.android.ctgapp.activity.mine.friend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/activity/mine/friend/CustomGroupSettingViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "commonGroup", "Landroidx/lifecycle/LiveData;", "", "getCommonGroup", "()Landroidx/lifecycle/LiveData;", "customFriendGroup", "getCustomFriendGroup", "mCommonResult", "Landroidx/lifecycle/MutableLiveData;", "mCustomFriendGroup", "addGroup", "", "groupName", "deleteGroup", "id", "", "editGroup", "groupId", "findCustomIndustry", "app_hqpDebug"})
public final class CustomGroupSettingViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mCustomFriendGroup = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mCommonResult = null;
    
    public CustomGroupSettingViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCustomFriendGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCommonGroup() {
        return null;
    }
    
    /**
     * *获取自定义商友分组
     */
    public final void findCustomIndustry() {
    }
    
    /**
     * *删除自定义分组商友
     */
    public final void deleteGroup(int id) {
    }
    
    /**
     * *添加分组
     */
    public final void addGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupName) {
    }
    
    /**
     * *编辑分组
     */
    public final void editGroup(int groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String groupName) {
    }
}