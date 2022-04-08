package com.android.ctgapp.activity.message.chart;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 3/31/21
 * 描述: 团队成员详情 商友详情  名片详情 页面(融合) 个人详情V2
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020)H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\"\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020)H\u0014J\b\u00104\u001a\u00020)H\u0014J\u001c\u00105\u001a\u00020)*\u0002062\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0010H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\"X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010#R\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\"X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010#R\u001b\u0010%\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\n\u001a\u0004\b&\u0010\b\u00a8\u0006:"}, d2 = {"Lcom/android/ctgapp/activity/message/chart/PersonInfoActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/widget/dialog/BusinessFriendEditDialog$GroupEditCallback;", "Lcom/android/ctgapp/widget/dialog/BusinessFriendAddDialog$AddCallback;", "()V", "companyId", "", "getCompanyId", "()I", "companyId$delegate", "Lkotlin/Lazy;", "friendEntity", "Lcom/android/ctgapp/entity/BusinessFriendInfoEntity;", "mBusinessFriendEditDialog", "Lcom/android/ctgapp/widget/dialog/BusinessFriendEditDialog;", "mCompanyName", "", "mGroupId", "mGroupName", "mImage", "getMImage", "()Ljava/lang/String;", "mImage$delegate", "mName", "mPhone", "mRemark", "mViewModel", "Lcom/android/ctgapp/activity/mine/friend/MyBusinessFriendViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/friend/MyBusinessFriendViewModel;", "mViewModel$delegate", "menuPopup", "Landroid/widget/PopupWindow;", "permissions", "", "[Ljava/lang/String;", "readContactPermission", "userId", "getUserId", "userId$delegate", "addFinish", "", "click", "editFinish", "event", "getLayout", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onResume", "addContactToPhone", "Landroid/content/Context;", "name", "tel", "Companion", "app_ctgRelease"})
public final class PersonInfoActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.widget.dialog.BusinessFriendEditDialog.GroupEditCallback, com.android.ctgapp.widget.dialog.BusinessFriendAddDialog.AddCallback {
    private final kotlin.Lazy mViewModel$delegate = null;
    private com.android.ctgapp.entity.BusinessFriendInfoEntity friendEntity;
    private java.lang.String mName = "";
    private java.lang.String mPhone = "";
    private java.lang.String mCompanyName = "";
    private java.lang.String mRemark = "";
    private java.lang.String mGroupName = "";
    private int mGroupId = -1;
    private android.widget.PopupWindow menuPopup;
    private com.android.ctgapp.widget.dialog.BusinessFriendEditDialog mBusinessFriendEditDialog;
    private final kotlin.Lazy userId$delegate = null;
    private final kotlin.Lazy mImage$delegate = null;
    private final kotlin.Lazy companyId$delegate = null;
    private final java.lang.String[] permissions = {"android.permission.WRITE_CONTACTS"};
    private final java.lang.String[] readContactPermission = {"android.permission.READ_CONTACTS"};
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.activity.message.chart.PersonInfoActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public PersonInfoActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.activity.mine.friend.MyBusinessFriendViewModel getMViewModel() {
        return null;
    }
    
    private final int getUserId() {
        return 0;
    }
    
    private final java.lang.String getMImage() {
        return null;
    }
    
    private final int getCompanyId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void addContactToPhone(android.content.Context $this$addContactToPhone, java.lang.String name, java.lang.String tel) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void editFinish() {
    }
    
    @java.lang.Override()
    public void addFinish() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b\u00a8\u0006\f"}, d2 = {"Lcom/android/ctgapp/activity/message/chart/PersonInfoActivity$Companion;", "", "()V", "jumpHere", "", "context", "Landroid/content/Context;", "otherID", "", "otherImage", "", "companyId", "app_ctgRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void jumpHere(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int otherID, @org.jetbrains.annotations.NotNull()
        java.lang.String otherImage, int companyId) {
        }
    }
}