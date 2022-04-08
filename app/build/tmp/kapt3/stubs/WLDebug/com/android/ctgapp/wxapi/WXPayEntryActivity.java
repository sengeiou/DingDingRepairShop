package com.android.ctgapp.wxapi;

import java.lang.System;

/**
 * 微信支付回调页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/android/ctgapp/wxapi/WXPayEntryActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;", "()V", "api", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "click", "", "event", "getLayout", "", "onNewIntent", "intent", "Landroid/content/Intent;", "onReq", "p0", "Lcom/tencent/mm/opensdk/modelbase/BaseReq;", "onResp", "resp", "Lcom/tencent/mm/opensdk/modelbase/BaseResp;", "app_WLDebug"})
public final class WXPayEntryActivity extends com.android.ctgapp.base.BaseActivity implements com.tencent.mm.opensdk.openapi.IWXAPIEventHandler {
    private com.tencent.mm.opensdk.openapi.IWXAPI api;
    private java.util.HashMap _$_findViewCache;
    
    public WXPayEntryActivity() {
        super();
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
    public void onResp(@org.jetbrains.annotations.Nullable()
    com.tencent.mm.opensdk.modelbase.BaseResp resp) {
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