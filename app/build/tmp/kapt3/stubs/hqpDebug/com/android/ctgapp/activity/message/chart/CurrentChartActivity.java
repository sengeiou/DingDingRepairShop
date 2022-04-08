package com.android.ctgapp.activity.message.chart;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 1/3/21
 * 描述: 当前聊天 页面(单聊)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\\\u001a\u00020]H\u0017J\b\u0010^\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020`H\u0007J\u0010\u0010a\u001a\u00020]2\u0006\u0010b\u001a\u00020\u000eH\u0002J\b\u0010c\u001a\u00020dH\u0016J \u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020&2\u0006\u0010h\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020&H\u0002J\"\u0010i\u001a\u00020]2\u0006\u0010g\u001a\u00020&2\u0006\u0010h\u001a\u00020\u001b2\b\b\u0002\u0010j\u001a\u00020\u000eH\u0002J\u0018\u0010k\u001a\u00020]2\u0006\u0010g\u001a\u00020&2\u0006\u0010h\u001a\u00020\u001bH\u0002J\u0010\u0010l\u001a\u00020]2\u0006\u0010m\u001a\u00020nH\u0002J\b\u0010o\u001a\u00020]H\u0002J \u0010p\u001a\u00020]2\u0006\u0010q\u001a\u00020&2\u0006\u0010r\u001a\u00020&2\u0006\u0010h\u001a\u00020\u001bH\u0016J\u0012\u0010s\u001a\u00020]2\b\b\u0002\u0010t\u001a\u00020\u000eH\u0002J\u0010\u0010u\u001a\u00020]2\u0006\u0010q\u001a\u00020&H\u0016J\u0010\u0010v\u001a\u00020]2\u0006\u0010r\u001a\u000204H\u0016J\"\u0010w\u001a\u00020]2\u0006\u0010x\u001a\u00020\u001b2\u0006\u0010y\u001a\u00020\u001b2\b\u0010z\u001a\u0004\u0018\u00010{H\u0014J\b\u0010|\u001a\u00020]H\u0014J\b\u0010}\u001a\u00020]H\u0016J\u001f\u0010~\u001a\u00020]2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0016J\u0014\u0010\u0083\u0001\u001a\u00020]2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\u0012\u0010\u0084\u0001\u001a\u00020]2\u0007\u0010\u0085\u0001\u001a\u00020&H\u0016J\'\u0010\u0086\u0001\u001a\u00020]2\u0007\u0010\u0085\u0001\u001a\u00020&2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u001bH\u0016J\u0011\u0010\u008a\u0001\u001a\u00020]2\u0006\u0010q\u001a\u00020&H\u0016J\u0012\u0010\u008b\u0001\u001a\u00020]2\u0007\u0010\u008c\u0001\u001a\u00020&H\u0002J\u0011\u0010\u008d\u0001\u001a\u00020]2\u0006\u0010m\u001a\u00020nH\u0002J\u001b\u0010\u008e\u0001\u001a\u00020]2\u0007\u0010\u008f\u0001\u001a\u00020\u001b2\u0007\u0010\u0090\u0001\u001a\u00020&H\u0002J\u0012\u0010\u0091\u0001\u001a\u00020]2\u0007\u0010\u0092\u0001\u001a\u00020\u001bH\u0002J\t\u0010\u0093\u0001\u001a\u00020]H\u0002R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\'\u001a\u00020(8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b)\u0010*R\u000e\u0010,\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b/\u00100R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\f\u001a\u0004\b7\u00108R\u001b\u0010:\u001a\u00020;8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b<\u0010=R\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010\f\u001a\u0004\bA\u0010BR\u000e\u0010D\u001a\u00020\u001bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001b\u0010J\u001a\u00020\u001b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bK\u0010GR\u001b\u0010M\u001a\u00020&8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\bN\u0010OR\u001b\u0010Q\u001a\u00020&8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bS\u0010\f\u001a\u0004\bR\u0010OR\u000e\u0010T\u001a\u00020\u001bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020W03X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0018\u00010YR\u00020ZX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0094\u0001"}, d2 = {"Lcom/android/ctgapp/activity/message/chart/CurrentChartActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/chart/ChartAdapter$MassageListClickListener;", "Landroid/content/ServiceConnection;", "Lcom/android/ctgapp/callback/MessageListener;", "()V", "animationIn", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getAnimationIn", "()Landroid/view/animation/Animation;", "animationIn$delegate", "Lkotlin/Lazy;", "canGetHistoryMsg", "", "chartDao", "Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "getChartDao", "()Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "chartDao$delegate", "chartListDao", "Lcom/android/ctgapp/entity/chart/ChartListDao;", "getChartListDao", "()Lcom/android/ctgapp/entity/chart/ChartListDao;", "chartListDao$delegate", "connect", "currentMessageType", "", "currentType", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "isTop", "lastMsgTime", "", "lastOSSTime", "", "mAdapter", "Lcom/android/ctgapp/adapter/chart/ChartAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/chart/ChartAdapter;", "mAdapter$delegate", "mAudioPath", "mBinding", "Lcom/android/ctgapp/databinding/ActivityCurrentChartBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityCurrentChartBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;", "mPlayer", "Landroid/media/MediaPlayer;", "getMPlayer", "()Landroid/media/MediaPlayer;", "mPlayer$delegate", "mUserInfoViewModel", "Lcom/android/ctgapp/activity/mine/UserInfoViewModel;", "getMUserInfoViewModel", "()Lcom/android/ctgapp/activity/mine/UserInfoViewModel;", "mUserInfoViewModel$delegate", "mViewModel", "Lcom/android/ctgapp/activity/message/chart/CurrentChartViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/message/chart/CurrentChartViewModel;", "mViewModel$delegate", "orderResultCode", "otherCompanyId", "getOtherCompanyId", "()I", "setOtherCompanyId", "(I)V", "otherID", "getOtherID", "otherID$delegate", "otherImage", "getOtherImage", "()Ljava/lang/String;", "otherImage$delegate", "otherName", "getOtherName", "otherName$delegate", "pageSize", "preVoicePlayerPosition", "resendFilePathList", "Lcom/android/ctgapp/entity/chart/ResendFileMessageBean;", "sendMessageBinder", "Lcom/android/ctgapp/service/AppService$LocalBinder;", "Lcom/android/ctgapp/service/AppService;", "uuid", "click", "", "event", "e", "Lcom/android/ctgapp/event/MessageIsRead;", "findChartHistory", "toBottom", "getLayout", "Landroid/widget/RelativeLayout;", "handlerMessage", "Lcom/android/ctgapp/entity/chart/ChartResult;", "msgJson", "msgType", "handlerMessageToListAndSave", "clearEdit", "handlerMessageToService", "handlerVideo", "videoBean", "Lcom/android/ctgapp/entity/chart/ChartVoiceEntity;", "initTakePhotoPermission", "messageResend", "msgId", "msg", "moveToBottom", "slow", "msgReceive", "newMsg", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onOtherHeadClick", "onServiceConnected", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "onVideoClick", "url", "onVoiceClick", "imageView", "Landroid/widget/ImageView;", "position", "sendMsgError", "sendPhoto", "imagePath", "sendVideo", "sendVoice", "voiceTimeLength", "voiceFilePath", "showLayout", "type", "tellClientMessageIsRead", "app_hqpDebug"})
public final class CurrentChartActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.chart.ChartAdapter.MassageListClickListener, android.content.ServiceConnection, com.android.ctgapp.callback.MessageListener {
    private final kotlin.Lazy mBinding$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.chart.ChartResult.MsgBean> mList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.ArrayList<com.android.ctgapp.entity.chart.ResendFileMessageBean> resendFilePathList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy otherID$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy otherName$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy otherImage$delegate = null;
    private int otherCompanyId = -1;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mUserInfoViewModel$delegate = null;
    
    /**
     * 当前状态  0键盘 1表情 2多功能  3语音  4关闭多功能
     */
    private int currentType = 0;
    private final int pageSize = 30;
    private int currentMessageType = -1;
    private final kotlin.Lazy animationIn$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.lang.String uuid = "";
    private long lastMsgTime;
    private java.lang.String lastOSSTime = "";
    private boolean canGetHistoryMsg = true;
    private boolean isTop = false;
    private final kotlin.Lazy handler$delegate = null;
    private final kotlin.Lazy chartDao$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy chartListDao$delegate = null;
    private com.android.ctgapp.service.AppService.LocalBinder sendMessageBinder;
    
    /**
     * 录音文件路径
     */
    private java.lang.String mAudioPath = "";
    private final android.content.ServiceConnection connect = null;
    private final int orderResultCode = 10002;
    private int preVoicePlayerPosition = -1;
    private final kotlin.Lazy mPlayer$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public CurrentChartActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityCurrentChartBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RelativeLayout getLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.adapter.chart.ChartAdapter getMAdapter() {
        return null;
    }
    
    public final int getOtherID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtherName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtherImage() {
        return null;
    }
    
    public final int getOtherCompanyId() {
        return 0;
    }
    
    public final void setOtherCompanyId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.activity.mine.UserInfoViewModel getMUserInfoViewModel() {
        return null;
    }
    
    private final android.view.animation.Animation getAnimationIn() {
        return null;
    }
    
    private final com.android.ctgapp.activity.message.chart.CurrentChartViewModel getMViewModel() {
        return null;
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    private final com.android.ctgapp.entity.chart.CurrentChartDao getChartDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.entity.chart.ChartListDao getChartListDao() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void moveToBottom(boolean slow) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public void click() {
    }
    
    private final void sendVoice(int voiceTimeLength, java.lang.String voiceFilePath) {
    }
    
    /**
     * 当前状态  0键盘 1表情 2多功能  3语音
     */
    private final void showLayout(int type) {
    }
    
    private final void findChartHistory(boolean toBottom) {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void event(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.MessageIsRead e) {
    }
    
    @java.lang.Override()
    public void messageResend(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, int msgType) {
    }
    
    @java.lang.Override()
    public void onVideoClick(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    private final android.media.MediaPlayer getMPlayer() {
        return null;
    }
    
    @java.lang.Override()
    public void onVoiceClick(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView imageView, int position) {
    }
    
    @java.lang.Override()
    public void onOtherHeadClick() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @kotlin.Suppress(names = {"INACCESSIBLE_TYPE"})
    private final void handlerVideo(com.android.ctgapp.entity.chart.ChartVoiceEntity videoBean) {
    }
    
    private final void sendPhoto(java.lang.String imagePath) {
    }
    
    private final void sendVideo(com.android.ctgapp.entity.chart.ChartVoiceEntity videoBean) {
    }
    
    private final com.android.ctgapp.entity.chart.ChartResult handlerMessage(java.lang.String msgJson, int msgType, java.lang.String uuid) {
        return null;
    }
    
    private final void handlerMessageToListAndSave(java.lang.String msgJson, int msgType, boolean clearEdit) {
    }
    
    private final void handlerMessageToService(java.lang.String msgJson, int msgType) {
    }
    
    private final void initTakePhotoPermission() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onServiceConnected(@org.jetbrains.annotations.Nullable()
    android.content.ComponentName name, @org.jetbrains.annotations.Nullable()
    android.os.IBinder service) {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected(@org.jetbrains.annotations.Nullable()
    android.content.ComponentName name) {
    }
    
    @java.lang.Override()
    public void newMsg(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.ChartResult.MsgBean msg) {
    }
    
    private final void tellClientMessageIsRead() {
    }
    
    @java.lang.Override()
    public void msgReceive(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId) {
    }
    
    @java.lang.Override()
    public void sendMsgError(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId) {
    }
}