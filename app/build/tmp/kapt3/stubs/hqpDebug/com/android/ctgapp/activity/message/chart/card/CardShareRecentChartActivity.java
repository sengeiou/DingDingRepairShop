package com.android.ctgapp.activity.message.chart.card;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2/25/21
 * 描述: 最近聊天 页面 分享名片到最近聊天
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020 H\u0016J(\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020 H\u0002J(\u00107\u001a\u00020.2\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u00052\u0006\u00108\u001a\u00020 H\u0002J(\u00109\u001a\u00020.2\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020 H\u0002J?\u0010:\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u00010 2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020 H\u0016\u00a2\u0006\u0002\u0010AR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b\'\u0010(R\u0014\u0010*\u001a\b\u0018\u00010+R\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/android/ctgapp/activity/message/chart/card/CardShareRecentChartActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/adapter/chart/ChartListForShareAdapter$ChartListListener;", "()V", "cardInfo", "", "kotlin.jvm.PlatformType", "getCardInfo", "()Ljava/lang/String;", "cardInfo$delegate", "Lkotlin/Lazy;", "chartDao", "Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "getChartDao", "()Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "chartDao$delegate", "chartListDao", "Lcom/android/ctgapp/entity/chart/ChartListDao;", "getChartListDao", "()Lcom/android/ctgapp/entity/chart/ChartListDao;", "chartListDao$delegate", "connect", "Landroid/content/ServiceConnection;", "mAdapter", "Lcom/android/ctgapp/adapter/chart/ChartListForShareAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/chart/ChartListForShareAdapter;", "mAdapter$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/chart/ChartListCopyEntity;", "mSelectList", "", "mUserId", "getMUserId", "()I", "mUserId$delegate", "mViewModel", "Lcom/android/ctgapp/activity/mine/UserInfoViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/UserInfoViewModel;", "mViewModel$delegate", "sendMessageBinder", "Lcom/android/ctgapp/service/AppService$LocalBinder;", "Lcom/android/ctgapp/service/AppService;", "click", "", "event", "getLayout", "handlerMessage", "Lcom/android/ctgapp/entity/chart/ChartResult;", "msgJson", "msgType", "uuid", "receiverId", "handlerMessageToSave", "otherID", "handlerMessageToService", "onItemClick", "otherName", "otherImage", "companyName", "isSelect", "", "position", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "app_hqpDebug"})
public final class CardShareRecentChartActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.adapter.chart.ChartListForShareAdapter.ChartListListener {
    private final kotlin.Lazy cardInfo$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mUserId$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.chart.ChartListCopyEntity> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private final kotlin.Lazy chartListDao$delegate = null;
    private final kotlin.Lazy chartDao$delegate = null;
    private final java.util.ArrayList<java.lang.Integer> mSelectList = null;
    private com.android.ctgapp.service.AppService.LocalBinder sendMessageBinder;
    private final android.content.ServiceConnection connect = null;
    private java.util.HashMap _$_findViewCache;
    
    public CardShareRecentChartActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final java.lang.String getCardInfo() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.UserInfoViewModel getMViewModel() {
        return null;
    }
    
    private final int getMUserId() {
        return 0;
    }
    
    private final com.android.ctgapp.adapter.chart.ChartListForShareAdapter getMAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.entity.chart.ChartListDao getChartListDao() {
        return null;
    }
    
    private final com.android.ctgapp.entity.chart.CurrentChartDao getChartDao() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void handlerMessageToSave(java.lang.String msgJson, int msgType, java.lang.String uuid, int otherID) {
    }
    
    private final void handlerMessageToService(java.lang.String msgJson, int msgType, java.lang.String uuid, int receiverId) {
    }
    
    private final com.android.ctgapp.entity.chart.ChartResult handlerMessage(java.lang.String msgJson, int msgType, java.lang.String uuid, int receiverId) {
        return null;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    java.lang.Integer otherID, @org.jetbrains.annotations.NotNull()
    java.lang.String otherName, @org.jetbrains.annotations.NotNull()
    java.lang.String otherImage, @org.jetbrains.annotations.NotNull()
    java.lang.String companyName, boolean isSelect, int position) {
    }
}