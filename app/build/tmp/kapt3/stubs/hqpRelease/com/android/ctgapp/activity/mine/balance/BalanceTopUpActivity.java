package com.android.ctgapp.activity.mine.balance;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 12/28/20
 * 描述: 余额充值 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/activity/mine/balance/BalanceTopUpActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "()V", "currentPayType", "", "mHandler", "Landroid/os/Handler;", "mViewModel", "Lcom/android/ctgapp/activity/mine/balance/BalanceTopUpViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/balance/BalanceTopUpViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "preEdit", "", "preMoney", "sdkPayFlag", "wxApi", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "click", "", "event", "getLayout", "handlerClick", "money", "fromButton", "", "onDestroy", "app_hqpRelease"})
public final class BalanceTopUpActivity extends com.android.ctgapp.base.BaseActivity {
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.lang.String preMoney = "";
    private final int sdkPayFlag = 1;
    private java.lang.String preEdit = "";
    private com.tencent.mm.opensdk.openapi.IWXAPI wxApi;
    private int currentPayType = -1;
    private final android.os.Handler mHandler = null;
    private java.util.HashMap _$_findViewCache;
    
    public BalanceTopUpActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.balance.BalanceTopUpViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void handlerClick(java.lang.String money, boolean fromButton) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
}