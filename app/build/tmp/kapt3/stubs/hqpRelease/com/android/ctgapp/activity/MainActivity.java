package com.android.ctgapp.activity;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/29
 * 描述:首页 Activity
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001rB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010N\u001a\u00020OH\u0016J\u0012\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010T\u001a\u00020OH\u0016J\b\u0010U\u001a\u00020VH\u0016J\u001a\u0010W\u001a\u00020O2\u0006\u0010X\u001a\u00020<2\b\b\u0002\u0010Y\u001a\u00020QH\u0002J\u0010\u0010Z\u001a\u00020O2\u0006\u0010[\u001a\u000207H\u0016J\u0010\u0010\\\u001a\u00020O2\u0006\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020OH\u0016J\b\u0010`\u001a\u00020OH\u0014J\u0012\u0010a\u001a\u00020O2\b\u0010b\u001a\u0004\u0018\u00010EH\u0014J\b\u0010c\u001a\u00020OH\u0014J-\u0010d\u001a\u00020O2\u0006\u0010e\u001a\u00020<2\u000e\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u000207062\u0006\u0010f\u001a\u00020gH\u0016\u00a2\u0006\u0002\u0010hJ\b\u0010i\u001a\u00020OH\u0014J\u0010\u0010j\u001a\u00020O2\u0006\u0010k\u001a\u00020lH\u0014J\u0012\u0010m\u001a\u00020Q2\b\u0010T\u001a\u0004\u0018\u00010SH\u0016J\b\u0010n\u001a\u00020OH\u0003J\b\u0010o\u001a\u00020OH\u0002J\u0010\u0010p\u001a\u00020O2\u0006\u0010[\u001a\u000207H\u0016J\u000e\u0010q\u001a\u00020O2\u0006\u0010\u001f\u001a\u00020 R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b2\u00103R\u0019\u00105\u001a\b\u0012\u0004\u0012\u00020706\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u000e\u0010;\u001a\u00020<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010=\u001a\b\u0018\u00010>R\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001b\u0010D\u001a\u00020E8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bH\u0010\n\u001a\u0004\bF\u0010GR\u001b\u0010I\u001a\u00020J8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bK\u0010L\u00a8\u0006s"}, d2 = {"Lcom/android/ctgapp/activity/MainActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/callback/MessageListener;", "()V", "animation", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getAnimation", "()Landroid/view/animation/Animation;", "animation$delegate", "Lkotlin/Lazy;", "chartListDao", "Lcom/android/ctgapp/entity/chart/ChartListDao;", "getChartListDao", "()Lcom/android/ctgapp/entity/chart/ChartListDao;", "chartListDao$delegate", "connect", "Landroid/content/ServiceConnection;", "dealFragment", "Lcom/android/ctgapp/fragment/deal/DealFragment;", "getDealFragment", "()Lcom/android/ctgapp/fragment/deal/DealFragment;", "dealFragment$delegate", "fragmentList", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "homeFragment", "Lcom/android/ctgapp/fragment/home/HomeFragment;", "getHomeFragment", "()Lcom/android/ctgapp/fragment/home/HomeFragment;", "homeFragment$delegate", "listener", "Lcom/android/ctgapp/activity/MainActivity$MyOnTouchListener;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityMainBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityMainBinding;", "mBinding$delegate", "mViewModel", "Lcom/android/ctgapp/activity/mine/UserInfoViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/UserInfoViewModel;", "mViewModel$delegate", "messageFragment", "Lcom/android/ctgapp/fragment/message/MessageFragment;", "getMessageFragment", "()Lcom/android/ctgapp/fragment/message/MessageFragment;", "messageFragment$delegate", "mineFragment", "Lcom/android/ctgapp/fragment/mine/MineFragment;", "getMineFragment", "()Lcom/android/ctgapp/fragment/mine/MineFragment;", "mineFragment$delegate", "permissions", "", "", "getPermissions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "prePosition", "", "sendMessageBinder", "Lcom/android/ctgapp/service/AppService$LocalBinder;", "Lcom/android/ctgapp/service/AppService;", "getSendMessageBinder", "()Lcom/android/ctgapp/service/AppService$LocalBinder;", "setSendMessageBinder", "(Lcom/android/ctgapp/service/AppService$LocalBinder;)V", "service", "Landroid/content/Intent;", "getService", "()Landroid/content/Intent;", "service$delegate", "workFragment", "Lcom/android/ctgapp/fragment/work/WorkFragment;", "getWorkFragment", "()Lcom/android/ctgapp/fragment/work/WorkFragment;", "workFragment$delegate", "click", "", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "event", "getLayout", "Landroid/widget/LinearLayout;", "handlerFootBar", "position", "isQuery", "msgReceive", "msgId", "newMsg", "msg", "Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;", "onBackPressed", "onDestroy", "onNewIntent", "intent", "onPause", "onRequestPermissionsResult", "requestCode", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onTouchEvent", "openNotification", "permissionCheck", "sendMsgError", "setListener", "MyOnTouchListener", "app_hqpRelease"})
public final class MainActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.callback.MessageListener {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private int prePosition = 5;
    private final kotlin.Lazy homeFragment$delegate = null;
    private final kotlin.Lazy messageFragment$delegate = null;
    private final kotlin.Lazy workFragment$delegate = null;
    private final kotlin.Lazy dealFragment$delegate = null;
    private final kotlin.Lazy mineFragment$delegate = null;
    private final kotlin.Lazy service$delegate = null;
    private final kotlin.Lazy chartListDao$delegate = null;
    private final kotlin.Lazy animation$delegate = null;
    private final java.util.ArrayList<androidx.fragment.app.Fragment> fragmentList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] permissions = {"android.permission.READ_CONTACTS", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.service.AppService.LocalBinder sendMessageBinder;
    private final android.content.ServiceConnection connect = null;
    private com.android.ctgapp.activity.MainActivity.MyOnTouchListener listener;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityMainBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.UserInfoViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.fragment.home.HomeFragment getHomeFragment() {
        return null;
    }
    
    private final com.android.ctgapp.fragment.message.MessageFragment getMessageFragment() {
        return null;
    }
    
    private final com.android.ctgapp.fragment.work.WorkFragment getWorkFragment() {
        return null;
    }
    
    private final com.android.ctgapp.fragment.deal.DealFragment getDealFragment() {
        return null;
    }
    
    private final com.android.ctgapp.fragment.mine.MineFragment getMineFragment() {
        return null;
    }
    
    private final android.content.Intent getService() {
        return null;
    }
    
    private final com.android.ctgapp.entity.chart.ChartListDao getChartListDao() {
        return null;
    }
    
    private final android.view.animation.Animation getAnimation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPermissions() {
        return null;
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void permissionCheck() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.service.AppService.LocalBinder getSendMessageBinder() {
        return null;
    }
    
    public final void setSendMessageBinder(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.service.AppService.LocalBinder p0) {
    }
    
    @android.annotation.SuppressLint(value = {"InlinedApi"})
    private final void openNotification() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void handlerFootBar(int position, boolean isQuery) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void newMsg(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.ChartResult.MsgBean msg) {
    }
    
    @java.lang.Override()
    public void msgReceive(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId) {
    }
    
    @java.lang.Override()
    public void sendMsgError(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.activity.MainActivity.MyOnTouchListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/android/ctgapp/activity/MainActivity$MyOnTouchListener;", "", "onDispatch", "", "ev", "Landroid/view/MotionEvent;", "onTouch", "app_hqpRelease"})
    public static abstract interface MyOnTouchListener {
        
        public abstract void onTouch(@org.jetbrains.annotations.Nullable()
        android.view.MotionEvent ev);
        
        public abstract void onDispatch(@org.jetbrains.annotations.Nullable()
        android.view.MotionEvent ev);
    }
}