package com.android.ctgapp.fragment.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/13
 * 描述: 询价记录 Fragment
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001cH\u0007J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/android/ctgapp/fragment/deal/QueryLogFragment;", "Lcom/android/ctgapp/base/BaseFragment;", "Lcom/android/ctgapp/adapter/deal/QueryRecordAdapter$QueryRecordListClick;", "()V", "listener", "Lcom/android/ctgapp/http/MyObserver;", "getListener", "()Lcom/android/ctgapp/http/MyObserver;", "mAdapter", "Lcom/android/ctgapp/adapter/deal/QueryRecordAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/deal/QueryRecordAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/EnquiryListEntity$DataBean$RecordsBean;", "page", "", "preSelect", "Ljava/lang/Integer;", "buttonClick", "", "type", "(Ljava/lang/Integer;)V", "click", "event", "eventBus", "Lcom/android/ctgapp/event/OrderRefresh;", "getData", "getLayout", "onDestroy", "onListItemClick", "enquiryId", "statuesCode", "app_hqpRelease"})
public final class QueryLogFragment extends com.android.ctgapp.base.BaseFragment implements com.android.ctgapp.adapter.deal.QueryRecordAdapter.QueryRecordListClick {
    private java.lang.Integer preSelect;
    private int page = 1;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.EnquiryListEntity.DataBean.RecordsBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.android.ctgapp.http.MyObserver listener = null;
    private java.util.HashMap _$_findViewCache;
    
    public QueryLogFragment() {
        super(false);
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.adapter.deal.QueryRecordAdapter getMAdapter() {
        return null;
    }
    
    private final void getData() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void eventBus(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.OrderRefresh type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.http.MyObserver getListener() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onListItemClick(int enquiryId, int statuesCode) {
    }
    
    private final void buttonClick(java.lang.Integer type) {
    }
}