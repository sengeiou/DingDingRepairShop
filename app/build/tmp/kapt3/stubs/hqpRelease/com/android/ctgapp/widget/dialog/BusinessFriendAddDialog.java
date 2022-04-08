package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 4/10/21
 * 描述: 添加商友 Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/android/ctgapp/widget/dialog/BusinessFriendAddDialog;", "Lcom/android/ctgapp/base/BaseDialogFragment;", "friendId", "", "name", "", "listener", "Lcom/android/ctgapp/widget/dialog/BusinessFriendAddDialog$AddCallback;", "(ILjava/lang/String;Lcom/android/ctgapp/widget/dialog/BusinessFriendAddDialog$AddCallback;)V", "mGroupId", "mViewModel", "Lcom/android/ctgapp/widget/dialog/company/BusinessFriendEditViewModel;", "getMViewModel", "()Lcom/android/ctgapp/widget/dialog/company/BusinessFriendEditViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "getLayout", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "AddCallback", "app_hqpRelease"})
public final class BusinessFriendAddDialog extends com.android.ctgapp.base.BaseDialogFragment {
    private final int friendId = 0;
    private final java.lang.String name = null;
    private final com.android.ctgapp.widget.dialog.BusinessFriendAddDialog.AddCallback listener = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private int mGroupId = -1;
    private java.util.HashMap _$_findViewCache;
    
    public BusinessFriendAddDialog(int friendId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.BusinessFriendAddDialog.AddCallback listener) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/android/ctgapp/widget/dialog/BusinessFriendAddDialog$AddCallback;", "", "addFinish", "", "app_hqpRelease"})
    public static abstract interface AddCallback {
        
        public abstract void addFinish();
    }
}