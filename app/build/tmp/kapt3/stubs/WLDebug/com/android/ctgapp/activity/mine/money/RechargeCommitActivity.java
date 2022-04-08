package com.android.ctgapp.activity.mine.money;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000201H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0002R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001b\u0010\'\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\b\u0018\u00010,R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/android/ctgapp/activity/mine/money/RechargeCommitActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "()V", "activityid", "", "getActivityid", "()I", "activityid$delegate", "Lkotlin/Lazy;", "count", "getCount", "setCount", "(I)V", "currentPayType", "intentFilter", "Landroid/content/IntentFilter;", "liushuiListener", "Lcom/android/ctgapp/http/ObserverListener;", "getLiushuiListener", "()Lcom/android/ctgapp/http/ObserverListener;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityRechargeCommitBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityRechargeCommitBinding;", "mBinding$delegate", "mHandler", "Landroid/os/Handler;", "getMHandler$annotations", "mViewModel", "Lcom/android/ctgapp/activity/mine/money/MyMoneyPackageViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/money/MyMoneyPackageViewModel;", "mViewModel$delegate", "map", "Ljava/util/HashMap;", "", "", "getMap", "()Ljava/util/HashMap;", "money", "getMoney", "()Ljava/lang/String;", "money$delegate", "myReceiver", "Lcom/android/ctgapp/activity/mine/money/RechargeCommitActivity$MyReceiver;", "sdkPayFlag", "wxApi", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "click", "", "event", "getLayout", "Landroid/widget/LinearLayout;", "onDestroy", "MyReceiver", "app_WLDebug"})
public final class RechargeCommitActivity extends com.android.ctgapp.base.BaseActivityV2 {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy money$delegate = null;
    private final kotlin.Lazy activityid$delegate = null;
    private com.tencent.mm.opensdk.openapi.IWXAPI wxApi;
    private final int sdkPayFlag = 1;
    private int count = 0;
    private final kotlin.Lazy mViewModel$delegate = null;
    private int currentPayType = -1;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.String, java.lang.Object> map = null;
    private com.android.ctgapp.activity.mine.money.RechargeCommitActivity.MyReceiver myReceiver;
    private android.content.IntentFilter intentFilter;
    private final android.os.Handler mHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final com.android.ctgapp.http.ObserverListener liushuiListener = null;
    private java.util.HashMap _$_findViewCache;
    
    public RechargeCommitActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityRechargeCommitBinding getMBinding() {
        return null;
    }
    
    private final java.lang.String getMoney() {
        return null;
    }
    
    private final int getActivityid() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    private final com.android.ctgapp.activity.mine.money.MyMoneyPackageViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.Object> getMap() {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    private static void getMHandler$annotations() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.http.ObserverListener getLiushuiListener() {
        return null;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/android/ctgapp/activity/mine/money/RechargeCommitActivity$MyReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/android/ctgapp/activity/mine/money/RechargeCommitActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_WLDebug"})
    final class MyReceiver extends android.content.BroadcastReceiver {
        
        public MyReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
}