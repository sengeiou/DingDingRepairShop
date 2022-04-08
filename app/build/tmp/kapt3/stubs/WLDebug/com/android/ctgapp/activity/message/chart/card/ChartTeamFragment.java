package com.android.ctgapp.activity.message.chart.card;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2/25/21
 * 描述:聊天选择同事
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0007J\b\u0010\"\u001a\u00020#H\u0016J0\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`%2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`%H\u0002J \u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020#H\u0016J(\u0010,\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020#H\u0016J\b\u0010.\u001a\u00020\u001eH\u0016J\u0006\u0010/\u001a\u00020\u001eJ\u000e\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00063"}, d2 = {"Lcom/android/ctgapp/activity/message/chart/card/ChartTeamFragment;", "Lcom/android/ctgapp/base/BaseFragment;", "Lcom/android/ctgapp/adapter/mine/DingDingTeamAdapter$Callback;", "isLinkman", "", "(Z)V", "mActivity", "Lcom/android/ctgapp/activity/message/chart/card/DingDingContactShareActivity;", "getMActivity", "()Lcom/android/ctgapp/activity/message/chart/card/DingDingContactShareActivity;", "mActivity$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/android/ctgapp/adapter/mine/DingDingTeamAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/DingDingTeamAdapter;", "setMAdapter", "(Lcom/android/ctgapp/adapter/mine/DingDingTeamAdapter;)V", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/chart/AllTeamEntity$DataBean;", "getMList", "()Ljava/util/ArrayList;", "mSearchList", "mViewModel", "Lcom/android/ctgapp/activity/message/chart/card/AllTeamViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/message/chart/card/AllTeamViewModel;", "mViewModel$delegate", "click", "", "event", "o", "Lcom/android/ctgapp/event/OnLineRefresh;", "getLayout", "", "handlerOnline", "Lkotlin/collections/ArrayList;", "list", "onItemClick", "data", "Lcom/android/ctgapp/entity/chart/AllTeamEntity$DataBean$UsersBean;", "parentPosition", "childPosition", "onItemClickForMore", "select", "onResume", "refresh", "search", "str", "", "app_WLDebug"})
public final class ChartTeamFragment extends com.android.ctgapp.base.BaseFragment implements com.android.ctgapp.adapter.mine.DingDingTeamAdapter.Callback {
    private boolean isLinkman;
    private final kotlin.Lazy mActivity$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.android.ctgapp.entity.chart.AllTeamEntity.DataBean> mList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.chart.AllTeamEntity.DataBean> mSearchList = null;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.adapter.mine.DingDingTeamAdapter mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public ChartTeamFragment(boolean isLinkman) {
        super(false);
    }
    
    private final com.android.ctgapp.activity.message.chart.card.DingDingContactShareActivity getMActivity() {
        return null;
    }
    
    private final com.android.ctgapp.activity.message.chart.card.AllTeamViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.chart.AllTeamEntity.DataBean> getMList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.adapter.mine.DingDingTeamAdapter getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.adapter.mine.DingDingTeamAdapter p0) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void event(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.OnLineRefresh o) {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Override()
    public void event() {
    }
    
    private final java.util.ArrayList<com.android.ctgapp.entity.chart.AllTeamEntity.DataBean> handlerOnline(java.util.ArrayList<com.android.ctgapp.entity.chart.AllTeamEntity.DataBean> list) {
        return null;
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void refresh() {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.AllTeamEntity.DataBean.UsersBean data, int parentPosition, int childPosition) {
    }
    
    @java.lang.Override()
    public void onItemClickForMore(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.AllTeamEntity.DataBean.UsersBean data, boolean select, int parentPosition, int childPosition) {
    }
}