package com.android.ctgapp.activity.mine.friend;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/12
 * 描述:添加商友 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\"\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J-\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/android/ctgapp/activity/mine/friend/AddBusinessFriendActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "()V", "groupId", "", "mPhoneNumList", "", "mViewModel", "Lcom/android/ctgapp/activity/mine/friend/AddBusinessFriendViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/friend/AddBusinessFriendViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "permissions", "", "[Ljava/lang/String;", "userId", "Ljava/lang/Integer;", "check", "", "click", "event", "getLayout", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onRequestPermissionsResult", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_ctgDebug"})
public final class AddBusinessFriendActivity extends com.android.ctgapp.base.BaseActivity {
    private int groupId = -1;
    private final java.lang.String[] permissions = {"android.permission.READ_CONTACTS"};
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.lang.String mPhoneNumList = "";
    private java.lang.Integer userId;
    private java.util.HashMap _$_findViewCache;
    
    public AddBusinessFriendActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.friend.AddBusinessFriendViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void check() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
}