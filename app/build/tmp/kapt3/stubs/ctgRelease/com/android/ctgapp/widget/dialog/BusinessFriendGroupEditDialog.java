package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/11
 * 描述: 自定义商友分组 编辑和添加
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\n\u001a\u00020\u0005H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/android/ctgapp/widget/dialog/BusinessFriendGroupEditDialog;", "Lcom/android/ctgapp/base/BaseDialogFragment;", "callback", "Lcom/android/ctgapp/widget/dialog/BusinessFriendGroupEditDialog$GroupCallback;", "groupId", "", "groupName", "", "(Lcom/android/ctgapp/widget/dialog/BusinessFriendGroupEditDialog$GroupCallback;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Integer;", "getLayout", "viewIsCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "GroupCallback", "app_ctgRelease"})
public final class BusinessFriendGroupEditDialog extends com.android.ctgapp.base.BaseDialogFragment {
    private final com.android.ctgapp.widget.dialog.BusinessFriendGroupEditDialog.GroupCallback callback = null;
    private final java.lang.Integer groupId = null;
    private final java.lang.String groupName = null;
    private java.util.HashMap _$_findViewCache;
    
    public BusinessFriendGroupEditDialog(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.BusinessFriendGroupEditDialog.GroupCallback callback, @org.jetbrains.annotations.Nullable()
    java.lang.Integer groupId, @org.jetbrains.annotations.Nullable()
    java.lang.String groupName) {
        super();
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/android/ctgapp/widget/dialog/BusinessFriendGroupEditDialog$GroupCallback;", "", "addGroup", "", "groupName", "", "editGroup", "groupId", "", "app_ctgRelease"})
    public static abstract interface GroupCallback {
        
        public abstract void addGroup(@org.jetbrains.annotations.NotNull()
        java.lang.String groupName);
        
        public abstract void editGroup(@org.jetbrains.annotations.NotNull()
        java.lang.String groupName, int groupId);
    }
}