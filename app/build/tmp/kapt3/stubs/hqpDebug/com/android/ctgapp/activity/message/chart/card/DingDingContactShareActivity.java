package com.android.ctgapp.activity.message.chart.card;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2/24/21
 * 描述:分享名片页面 钉钉联系人 选择联系人 页面 V2
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020 H\u0016J(\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020 H\u0002J(\u0010C\u001a\u00020:2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020\u00042\u0006\u0010#\u001a\u00020 H\u0002J(\u0010D\u001a\u00020:2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020 H\u0002J\b\u0010E\u001a\u00020:H\u0016J\b\u0010F\u001a\u00020:H\u0014J\u0006\u0010G\u001a\u00020:R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\t\u001a\u0004\b$\u0010%R\u001a\u0010\'\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010*R\u001b\u0010.\u001a\u00020\u001b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b/\u0010\u001cR\u0014\u00101\u001a\b\u0018\u000102R\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00104\u001a\u0002058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b6\u00107\u00a8\u0006H"}, d2 = {"Lcom/android/ctgapp/activity/message/chart/card/DingDingContactShareActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "()V", "cardInfo", "", "kotlin.jvm.PlatformType", "getCardInfo", "()Ljava/lang/String;", "cardInfo$delegate", "Lkotlin/Lazy;", "chartDao", "Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "getChartDao", "()Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "chartDao$delegate", "connect", "Landroid/content/ServiceConnection;", "currentSelect", "getCurrentSelect", "setCurrentSelect", "(Ljava/lang/String;)V", "friendFragment", "Lcom/android/ctgapp/activity/message/chart/card/ChartFriendFragment;", "getFriendFragment", "()Lcom/android/ctgapp/activity/message/chart/card/ChartFriendFragment;", "friendFragment$delegate", "isLineman", "", "()Z", "isLineman$delegate", "mSelectList", "", "", "getMSelectList", "()Ljava/util/Set;", "otherID", "getOtherID", "()I", "otherID$delegate", "preSelect", "getPreSelect", "setPreSelect", "(I)V", "preSelectId", "getPreSelectId", "setPreSelectId", "returnToChart", "getReturnToChart", "returnToChart$delegate", "sendMessageBinder", "Lcom/android/ctgapp/service/AppService$LocalBinder;", "Lcom/android/ctgapp/service/AppService;", "teamFragment", "Lcom/android/ctgapp/activity/message/chart/card/ChartTeamFragment;", "getTeamFragment", "()Lcom/android/ctgapp/activity/message/chart/card/ChartTeamFragment;", "teamFragment$delegate", "click", "", "event", "getLayout", "handlerMessage", "Lcom/android/ctgapp/entity/chart/ChartResult;", "msgJson", "msgType", "uuid", "receiverId", "handlerMessageToSave", "handlerMessageToService", "onBackPressed", "onDestroy", "refreshSelectCount", "app_hqpDebug"})
public final class DingDingContactShareActivity extends com.android.ctgapp.base.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy friendFragment$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy teamFragment$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy otherID$delegate = null;
    private final kotlin.Lazy cardInfo$delegate = null;
    private final kotlin.Lazy chartDao$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy returnToChart$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.Integer> mSelectList = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentSelect = "";
    private int preSelect = -1;
    private int preSelectId = -1;
    private final kotlin.Lazy isLineman$delegate = null;
    private com.android.ctgapp.service.AppService.LocalBinder sendMessageBinder;
    private final android.content.ServiceConnection connect = null;
    private java.util.HashMap _$_findViewCache;
    
    public DingDingContactShareActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.activity.message.chart.card.ChartFriendFragment getFriendFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.activity.message.chart.card.ChartTeamFragment getTeamFragment() {
        return null;
    }
    
    public final int getOtherID() {
        return 0;
    }
    
    private final java.lang.String getCardInfo() {
        return null;
    }
    
    private final com.android.ctgapp.entity.chart.CurrentChartDao getChartDao() {
        return null;
    }
    
    public final boolean getReturnToChart() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Integer> getMSelectList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentSelect() {
        return null;
    }
    
    public final void setCurrentSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPreSelect() {
        return 0;
    }
    
    public final void setPreSelect(int p0) {
    }
    
    public final int getPreSelectId() {
        return 0;
    }
    
    public final void setPreSelectId(int p0) {
    }
    
    private final boolean isLineman() {
        return false;
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
    
    private final void handlerMessageToSave(java.lang.String msgJson, int msgType, java.lang.String uuid, int otherID) {
    }
    
    private final void handlerMessageToService(java.lang.String msgJson, int msgType, java.lang.String uuid, int receiverId) {
    }
    
    private final com.android.ctgapp.entity.chart.ChartResult handlerMessage(java.lang.String msgJson, int msgType, java.lang.String uuid, int receiverId) {
        return null;
    }
    
    public final void refreshSelectCount() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}