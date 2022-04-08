package com.android.ctgapp.activity.mine.team;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2/18/21
 * 描述:员工管理页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/activity/mine/team/ManagementTeamActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/adapter/mine/MyTeamAdapter$Listener;", "()V", "mAdapter", "Lcom/android/ctgapp/adapter/mine/MyTeamAdapter;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/MyTeamEntity$DataBean;", "mSearchText", "", "mViewModel", "Lcom/android/ctgapp/activity/mine/team/MyTeamViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/team/MyTeamViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "click", "", "event", "getData", "getLayout", "", "onEditSelectListener", "data", "onItemSelectListener", "onResume", "app_WLDebug"})
public final class ManagementTeamActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.adapter.mine.MyTeamAdapter.Listener {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.MyTeamEntity.DataBean> mList = null;
    private com.android.ctgapp.adapter.mine.MyTeamAdapter mAdapter;
    private java.lang.String mSearchText = "";
    private java.util.HashMap _$_findViewCache;
    
    public ManagementTeamActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.team.MyTeamViewModel getMViewModel() {
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
    public int getLayout() {
        return 0;
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