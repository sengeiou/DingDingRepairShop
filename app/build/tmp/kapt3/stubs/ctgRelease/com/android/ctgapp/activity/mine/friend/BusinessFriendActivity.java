package com.android.ctgapp.activity.mine.friend;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/11
 * 描述: 商友 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000207H\u0016J\b\u00109\u001a\u000207H\u0016J\u0018\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bH\u0016J\u0010\u0010=\u001a\u0002072\u0006\u0010>\u001a\u000201H\u0016J\u0018\u0010?\u001a\u0002072\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bH\u0016J\b\u0010@\u001a\u000201H\u0016J\b\u0010A\u001a\u000207H\u0002J\u0010\u0010B\u001a\u0002072\u0006\u0010C\u001a\u00020\u0011H\u0016J-\u0010D\u001a\u0002072\u0006\u0010E\u001a\u0002012\u000e\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0.2\u0006\u0010F\u001a\u00020GH\u0016\u00a2\u0006\u0002\u0010HJ\b\u0010I\u001a\u000207H\u0014J\u0014\u0010J\u001a\u0002072\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010J\u0014\u0010L\u001a\u0002072\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010J\u0006\u0010M\u001a\u000207R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0.X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010/R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00102\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u0010\u000e\u001a\u0004\b3\u00104\u00a8\u0006N"}, d2 = {"Lcom/android/ctgapp/activity/mine/friend/BusinessFriendActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/adapter/mine/BusinessFriendHorizontalGroupAdapter$SelectCallback;", "Lcom/android/ctgapp/adapter/mine/BusinessFriendAdapter$Callback;", "()V", "allIsFine", "", "currentSelect", "", "mAdapter", "Lcom/android/ctgapp/adapter/mine/BusinessFriendAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/BusinessFriendAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mCopyList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/BusinessFriendEntity$DataBean;", "mCustomGroupAdapter", "Lcom/android/ctgapp/adapter/mine/CustomGroupSelectAdapterEmpty;", "getMCustomGroupAdapter", "()Lcom/android/ctgapp/adapter/mine/CustomGroupSelectAdapterEmpty;", "mCustomGroupAdapter$delegate", "mCustomGroupList", "Lcom/android/ctgapp/entity/BusinessFriendGroupEntity$DataBean;", "mData", "mFixGroupAdapter", "getMFixGroupAdapter", "mFixGroupAdapter$delegate", "mFixGroupList", "mHorizontalAdapter", "Lcom/android/ctgapp/adapter/mine/BusinessFriendHorizontalGroupAdapter;", "mHorizontalLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getMHorizontalLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "mHorizontalLayoutManager$delegate", "mHorizontalList", "Lcom/android/ctgapp/entity/BusinessFriendHorizontalItemEntity;", "mList", "mViewModel", "Lcom/android/ctgapp/activity/mine/friend/BusinessFriendViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/friend/BusinessFriendViewModel;", "mViewModel$delegate", "permissions", "", "[Ljava/lang/String;", "preSearch", "", "returnToChart", "getReturnToChart", "()Z", "returnToChart$delegate", "check", "", "click", "event", "findAll", "industry", "industryName", "findByCustomId", "id", "findByFixIndustry", "getLayout", "handlerHorizontalGroup", "onItemClick", "data", "onRequestPermissionsResult", "requestCode", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "setCustomGroup", "list", "setFixGroup", "settingCustomGroup", "app_ctgRelease"})
public final class BusinessFriendActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.adapter.mine.BusinessFriendHorizontalGroupAdapter.SelectCallback, com.android.ctgapp.adapter.mine.BusinessFriendAdapter.Callback {
    private final java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> mList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> mCopyList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendGroupEntity.DataBean> mFixGroupList;
    private final kotlin.Lazy mFixGroupAdapter$delegate = null;
    private java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendGroupEntity.DataBean> mCustomGroupList;
    private final kotlin.Lazy mCustomGroupAdapter$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendHorizontalItemEntity> mHorizontalList = null;
    private com.android.ctgapp.adapter.mine.BusinessFriendHorizontalGroupAdapter mHorizontalAdapter;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.lang.String[] permissions = {"android.permission.READ_CONTACTS"};
    private java.lang.String currentSelect = "ALL";
    private final kotlin.Lazy returnToChart$delegate = null;
    private int preSearch = 0;
    private boolean allIsFine = false;
    private final kotlin.Lazy mHorizontalLayoutManager$delegate = null;
    private com.android.ctgapp.entity.BusinessFriendEntity.DataBean mData;
    private java.util.HashMap _$_findViewCache;
    
    public BusinessFriendActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.adapter.mine.BusinessFriendAdapter getMAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.CustomGroupSelectAdapterEmpty getMFixGroupAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.CustomGroupSelectAdapterEmpty getMCustomGroupAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.friend.BusinessFriendViewModel getMViewModel() {
        return null;
    }
    
    private final boolean getReturnToChart() {
        return false;
    }
    
    private final androidx.recyclerview.widget.LinearLayoutManager getMHorizontalLayoutManager() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void handlerHorizontalGroup() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    public final void setFixGroup(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendGroupEntity.DataBean> list) {
    }
    
    public final void setCustomGroup(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendGroupEntity.DataBean> list) {
    }
    
    public final void settingCustomGroup() {
    }
    
    @java.lang.Override()
    public void findByFixIndustry(@org.jetbrains.annotations.NotNull()
    java.lang.String industry, @org.jetbrains.annotations.NotNull()
    java.lang.String industryName) {
    }
    
    @java.lang.Override()
    public void findByCustomId(int id) {
    }
    
    @java.lang.Override()
    public void findAll(@org.jetbrains.annotations.NotNull()
    java.lang.String industry, @org.jetbrains.annotations.NotNull()
    java.lang.String industryName) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.BusinessFriendEntity.DataBean data) {
    }
    
    private final void check() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
}