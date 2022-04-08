package com.android.ctgapp.activity.mine.friend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015J\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0011R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/activity/mine/friend/BusinessFriendViewModel;", "Lcom/android/ctgapp/base/BaseViewModel;", "()V", "allResult", "Landroidx/lifecycle/LiveData;", "", "getAllResult", "()Landroidx/lifecycle/LiveData;", "customFriendGroup", "getCustomFriendGroup", "mAllResult", "Landroidx/lifecycle/MutableLiveData;", "mCustomFriendGroup", "mSaveGroupResult", "saveGroupResult", "getSaveGroupResult", "bulkEditGroup", "", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/BusinessFriendGroupEntity$DataBean;", "Lkotlin/collections/ArrayList;", "findAll", "findByIndustry", "id", "", "industry", "getCustomGroup", "app_hqpRelease"})
public final class BusinessFriendViewModel extends com.android.ctgapp.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mAllResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mCustomFriendGroup = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mSaveGroupResult = null;
    
    public BusinessFriendViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAllResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCustomFriendGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSaveGroupResult() {
        return null;
    }
    
    /**
     * *查询所有
     */
    public final void findAll() {
    }
    
    /**
     * *根据修理厂等字段查询
     */
    public final void findByIndustry(@org.jetbrains.annotations.NotNull()
    java.lang.String industry) {
    }
    
    /**
     * *根据自定义Group的ID查询
     */
    public final void findByIndustry(int id) {
    }
    
    /**
     * *获取自定义商友分组
     */
    public final void getCustomGroup() {
    }
    
    /**
     * *批量修改自定义商友选中状态
     */
    public final void bulkEditGroup(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendGroupEntity.DataBean> mList) {
    }
}