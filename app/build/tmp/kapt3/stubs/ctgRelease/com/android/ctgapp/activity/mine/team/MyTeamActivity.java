package com.android.ctgapp.activity.mine.team;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/11
 * 描述:我的团队  页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000209H\u0016J\b\u0010;\u001a\u000209H\u0002J\b\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u000209H\u0016J\u0010\u0010>\u001a\u0002092\u0006\u0010?\u001a\u000201H\u0016J\u0010\u0010@\u001a\u0002092\u0006\u0010?\u001a\u000201H\u0016J\b\u0010A\u001a\u000209H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b&\u0010\'R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b-\u0010.R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b5\u00106\u00a8\u0006B"}, d2 = {"Lcom/android/ctgapp/activity/mine/team/MyTeamActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/adapter/mine/MyTeamAdapter$Listener;", "()V", "departmentSelectId", "", "getDepartmentSelectId", "()I", "setDepartmentSelectId", "(I)V", "departmentSelectName", "", "getDepartmentSelectName", "()Ljava/lang/String;", "setDepartmentSelectName", "(Ljava/lang/String;)V", "isManager", "", "Ljava/lang/Boolean;", "labelSelectId", "getLabelSelectId", "setLabelSelectId", "labelSelectName", "getLabelSelectName", "setLabelSelectName", "mAdapter", "Lcom/android/ctgapp/adapter/mine/MyTeamAdapter;", "mDepartmentAdapter", "Lcom/android/ctgapp/adapter/mine/TeamDepartmentMenuAdapter;", "getMDepartmentAdapter", "()Lcom/android/ctgapp/adapter/mine/TeamDepartmentMenuAdapter;", "mDepartmentAdapter$delegate", "Lkotlin/Lazy;", "mDepartmentList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/DepartmentMenusEntity$DataBean;", "mLabelAdapter", "Lcom/android/ctgapp/adapter/mine/TeamDepartmentLabelAdapter;", "getMLabelAdapter", "()Lcom/android/ctgapp/adapter/mine/TeamDepartmentLabelAdapter;", "mLabelAdapter$delegate", "mLabelList", "Lcom/android/ctgapp/entity/mine/LabelEntity$DataBean;", "mLabelModel", "Lcom/android/ctgapp/activity/mine/team/SelectPositionViewMode;", "getMLabelModel", "()Lcom/android/ctgapp/activity/mine/team/SelectPositionViewMode;", "mLabelModel$delegate", "mList", "Lcom/android/ctgapp/entity/MyTeamEntity$DataBean;", "mSearchText", "mViewModel", "Lcom/android/ctgapp/activity/mine/team/MyTeamViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/team/MyTeamViewModel;", "mViewModel$delegate", "click", "", "event", "getData", "getLayout", "onBackPressed", "onEditSelectListener", "data", "onItemSelectListener", "onResume", "app_ctgRelease"})
public final class MyTeamActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.adapter.mine.MyTeamAdapter.Listener {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mLabelModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.MyTeamEntity.DataBean> mList = null;
    private com.android.ctgapp.adapter.mine.MyTeamAdapter mAdapter;
    private java.lang.String mSearchText = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String departmentSelectName = "";
    private int departmentSelectId = -1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String labelSelectName = "";
    private int labelSelectId = -1;
    private java.lang.Boolean isManager;
    private final java.util.ArrayList<com.android.ctgapp.entity.DepartmentMenusEntity.DataBean> mDepartmentList = null;
    private final kotlin.Lazy mDepartmentAdapter$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.mine.LabelEntity.DataBean> mLabelList = null;
    private final kotlin.Lazy mLabelAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public MyTeamActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.activity.mine.team.MyTeamViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.team.SelectPositionViewMode getMLabelModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDepartmentSelectName() {
        return null;
    }
    
    public final void setDepartmentSelectName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getDepartmentSelectId() {
        return 0;
    }
    
    public final void setDepartmentSelectId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabelSelectName() {
        return null;
    }
    
    public final void setLabelSelectName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getLabelSelectId() {
        return 0;
    }
    
    public final void setLabelSelectId(int p0) {
    }
    
    private final com.android.ctgapp.adapter.mine.TeamDepartmentMenuAdapter getMDepartmentAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.TeamDepartmentLabelAdapter getMLabelAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onEditSelectListener(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.MyTeamEntity.DataBean data) {
    }
    
    @java.lang.Override()
    public void onItemSelectListener(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.MyTeamEntity.DataBean data) {
    }
}