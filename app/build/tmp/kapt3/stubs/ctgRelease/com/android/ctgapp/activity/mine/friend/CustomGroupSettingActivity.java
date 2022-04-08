package com.android.ctgapp.activity.mine.friend;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/11
 * 描述:自定义分组 分组 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/activity/mine/friend/CustomGroupSettingActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/widget/dialog/BusinessFriendGroupEditDialog$GroupCallback;", "()V", "mAdapter", "Lcom/android/ctgapp/adapter/mine/CustomGroupAdapterEmpty;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/CustomGroupAdapterEmpty;", "mAdapter$delegate", "Lkotlin/Lazy;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/FriendGroupEntity$DataBean;", "mViewModel", "Lcom/android/ctgapp/activity/mine/friend/CustomGroupSettingViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/friend/CustomGroupSettingViewModel;", "mViewModel$delegate", "addGroup", "", "groupName", "", "click", "editGroup", "groupId", "", "event", "getLayout", "app_ctgRelease"})
public final class CustomGroupSettingActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.widget.dialog.BusinessFriendGroupEditDialog.GroupCallback {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.FriendGroupEntity.DataBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public CustomGroupSettingActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.friend.CustomGroupSettingViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.CustomGroupAdapterEmpty getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void addGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupName) {
    }
    
    @java.lang.Override()
    public void editGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupName, int groupId) {
    }
}