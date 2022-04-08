package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 1/7/21
 * 描述: 编辑商友 Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0015\u001a\u00020\u0005H\u0016J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/android/ctgapp/widget/dialog/BusinessFriendEditDialog;", "Lcom/android/ctgapp/base/BaseDialogFragment;", "groupName", "", "groupId", "", "name", "remark", "friendId", "entity", "Lcom/android/ctgapp/entity/BusinessFriendInfoEntity;", "listener", "Lcom/android/ctgapp/widget/dialog/BusinessFriendEditDialog$GroupEditCallback;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILcom/android/ctgapp/entity/BusinessFriendInfoEntity;Lcom/android/ctgapp/widget/dialog/BusinessFriendEditDialog$GroupEditCallback;)V", "mGroupId", "mViewModel", "Lcom/android/ctgapp/widget/dialog/company/BusinessFriendEditViewModel;", "getMViewModel", "()Lcom/android/ctgapp/widget/dialog/company/BusinessFriendEditViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "getLayout", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "GroupEditCallback", "app_ctgDebug"})
public final class BusinessFriendEditDialog extends com.android.ctgapp.base.BaseDialogFragment {
    private final java.lang.String groupName = null;
    private final int groupId = 0;
    private java.lang.String name;
    private final java.lang.String remark = null;
    private final int friendId = 0;
    private final com.android.ctgapp.entity.BusinessFriendInfoEntity entity = null;
    private final com.android.ctgapp.widget.dialog.BusinessFriendEditDialog.GroupEditCallback listener = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private int mGroupId = -1;
    private java.util.HashMap _$_findViewCache;
    
    public BusinessFriendEditDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String groupName, int groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String remark, int friendId, @org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.BusinessFriendInfoEntity entity, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.BusinessFriendEditDialog.GroupEditCallback listener) {
        super();
    }
    
    private final com.android.ctgapp.widget.dialog.company.BusinessFriendEditViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void viewIsCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/android/ctgapp/widget/dialog/BusinessFriendEditDialog$GroupEditCallback;", "", "editFinish", "", "app_ctgDebug"})
    public static abstract interface GroupEditCallback {
        
        public abstract void editFinish();
    }
}