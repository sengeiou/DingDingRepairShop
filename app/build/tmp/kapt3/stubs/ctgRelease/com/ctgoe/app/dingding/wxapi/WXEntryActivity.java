package com.ctgoe.app.dingding.wxapi;

import java.lang.System;

/**
 * 公众号回调
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lcom/ctgoe/app/dingding/wxapi/WXEntryActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;", "()V", "api", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityWxentryBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityWxentryBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "click", "", "error", "event", "getLayout", "Landroid/widget/RelativeLayout;", "onNewIntent", "intent", "Landroid/content/Intent;", "onReq", "p0", "Lcom/tencent/mm/opensdk/modelbase/BaseReq;", "onResp", "resp", "Lcom/tencent/mm/opensdk/modelbase/BaseResp;", "app_ctgRelease"})
public final class WXEntryActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.tencent.mm.opensdk.openapi.IWXAPIEventHandler {
    private final kotlin.Lazy mBinding$delegate = null;
    private com.tencent.mm.opensdk.openapi.IWXAPI api;
    private java.util.HashMap _$_findViewCache;
    
    public WXEntryActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityWxentryBinding getMBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.RelativeLayout getLayout() {
        return null;
    }
    
    @java.lang.Override()
    public void onResp(@org.jetbrains.annotations.NotNull()
    com.tencent.mm.opensdk.modelbase.BaseResp resp) {
    }
    
    private final void error() {
    }
    
    @java.lang.Override()
    public void onReq(@org.jetbrains.annotations.Nullable()
    com.tencent.mm.opensdk.modelbase.BaseReq p0) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
}