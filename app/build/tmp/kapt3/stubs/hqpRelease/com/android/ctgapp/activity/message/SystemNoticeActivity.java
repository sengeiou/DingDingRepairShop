package com.android.ctgapp.activity.message;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/7/31
 * 描述:系统通知 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0014J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u001bH\u0014J\b\u0010$\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/android/ctgapp/activity/message/SystemNoticeActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/chart/SystemNotifyAdapter$SystemNotifyListener;", "()V", "deletePosition", "", "listener", "Lcom/android/ctgapp/http/ObserverListener;", "mAdapter", "Lcom/android/ctgapp/adapter/chart/SystemNotifyAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/chart/SystemNotifyAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mBinding", "Lcom/android/ctgapp/databinding/ActivitySystemNoticeBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivitySystemNoticeBinding;", "mBinding$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/chart/SystemNotifyEntity$DataBean$RecordsBean;", "page", "redAllListener", "redListener", "redPosition", "click", "", "event", "getData", "getLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "onDestroy", "onItemClickListener", "position", "onResume", "removeLoading", "app_hqpRelease"})
public final class SystemNoticeActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.chart.SystemNotifyAdapter.SystemNotifyListener {
    private final kotlin.Lazy mBinding$delegate = null;
    private int page = 1;
    private final java.util.ArrayList<com.android.ctgapp.entity.chart.SystemNotifyEntity.DataBean.RecordsBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private int redPosition = 0;
    private final com.android.ctgapp.http.ObserverListener listener = null;
    private int deletePosition = 0;
    private final com.android.ctgapp.http.ObserverListener redAllListener = null;
    private final com.android.ctgapp.http.ObserverListener redListener = null;
    private java.util.HashMap _$_findViewCache;
    
    public SystemNoticeActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivitySystemNoticeBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.LinearLayoutCompat getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.chart.SystemNotifyAdapter getMAdapter() {
        return null;
    }
    
    private final void getData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void removeLoading() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onItemClickListener(int position) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}