package com.android.ctgapp.fragment.message;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/29
 * 描述: 消息 Fragment
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0016J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u000204H\u0007J\u0010\u00102\u001a\u0002002\u0006\u00105\u001a\u000206H\u0007J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000200H\u0016J9\u0010:\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u0001082\b\u0010<\u001a\u0004\u0018\u0001082\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0016\u00a2\u0006\u0002\u0010AJ9\u0010B\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u0001082\b\u0010<\u001a\u0004\u0018\u0001082\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0016\u00a2\u0006\u0002\u0010AJ\b\u0010C\u001a\u000200H\u0016J\u0006\u0010D\u001a\u000200R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b&\u0010\'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\t\u001a\u0004\b+\u0010,R\u000e\u0010.\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/android/ctgapp/fragment/message/MessageFragment;", "Lcom/android/ctgapp/base/BaseFragment;", "Lcom/android/ctgapp/adapter/chart/ChartListAdapter$ChartListListener;", "()V", "chartListDao", "Lcom/android/ctgapp/entity/chart/ChartListDao;", "getChartListDao", "()Lcom/android/ctgapp/entity/chart/ChartListDao;", "chartListDao$delegate", "Lkotlin/Lazy;", "copyList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/chart/ChartListEntity;", "currentChartDao", "Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "getCurrentChartDao", "()Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "currentChartDao$delegate", "getHistoryRead", "", "getGetHistoryRead", "()Z", "setGetHistoryRead", "(Z)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "listener", "Lcom/android/ctgapp/http/ObserverListener;", "getListener", "()Lcom/android/ctgapp/http/ObserverListener;", "mAdapter", "Lcom/android/ctgapp/adapter/chart/ChartListAdapter;", "mList", "mUserInfoViewModel", "Lcom/android/ctgapp/activity/mine/UserInfoViewModel;", "getMUserInfoViewModel", "()Lcom/android/ctgapp/activity/mine/UserInfoViewModel;", "mUserInfoViewModel$delegate", "mViewModel", "Lcom/android/ctgapp/fragment/message/MessageFragmentViewModel;", "getMViewModel", "()Lcom/android/ctgapp/fragment/message/MessageFragmentViewModel;", "mViewModel$delegate", "searchModel", "click", "", "event", "eventBus", "notify", "Lcom/android/ctgapp/event/NotifySystemRefresh;", "type", "Lcom/android/ctgapp/event/OnLineRefresh;", "getLayout", "", "onDestroy", "onItemClick", "otherID", "groupID", "otherName", "", "otherImage", "companyName", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onItemClickForMore", "onResume", "refreshMessage", "app_ctgRelease"})
public final class MessageFragment extends com.android.ctgapp.base.BaseFragment implements com.android.ctgapp.adapter.chart.ChartListAdapter.ChartListListener {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mUserInfoViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.chart.ChartListEntity> mList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.chart.ChartListEntity> copyList = null;
    private com.android.ctgapp.adapter.chart.ChartListAdapter mAdapter;
    private final kotlin.Lazy chartListDao$delegate = null;
    private final kotlin.Lazy currentChartDao$delegate = null;
    private final kotlin.Lazy handler$delegate = null;
    private boolean searchModel = false;
    @org.jetbrains.annotations.NotNull()
    private final com.android.ctgapp.http.ObserverListener listener = null;
    private boolean getHistoryRead = true;
    private java.util.HashMap _$_findViewCache;
    
    public MessageFragment() {
        super(false);
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.fragment.message.MessageFragmentViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.UserInfoViewModel getMUserInfoViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.entity.chart.ChartListDao getChartListDao() {
        return null;
    }
    
    private final com.android.ctgapp.entity.chart.CurrentChartDao getCurrentChartDao() {
        return null;
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN, sticky = true, priority = 1)
    public final void eventBus(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.NotifySystemRefresh notify) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.http.ObserverListener getListener() {
        return null;
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void eventBus(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.OnLineRefresh type) {
    }
    
    public final boolean getGetHistoryRead() {
        return false;
    }
    
    public final void setGetHistoryRead(boolean p0) {
    }
    
    public final void refreshMessage() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    java.lang.Integer otherID, @org.jetbrains.annotations.Nullable()
    java.lang.Integer groupID, @org.jetbrains.annotations.NotNull()
    java.lang.String otherName, @org.jetbrains.annotations.NotNull()
    java.lang.String otherImage, @org.jetbrains.annotations.NotNull()
    java.lang.String companyName) {
    }
    
    @java.lang.Override()
    public void onItemClickForMore(@org.jetbrains.annotations.Nullable()
    java.lang.Integer otherID, @org.jetbrains.annotations.Nullable()
    java.lang.Integer groupID, @org.jetbrains.annotations.NotNull()
    java.lang.String otherName, @org.jetbrains.annotations.NotNull()
    java.lang.String otherImage, @org.jetbrains.annotations.NotNull()
    java.lang.String companyName) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}