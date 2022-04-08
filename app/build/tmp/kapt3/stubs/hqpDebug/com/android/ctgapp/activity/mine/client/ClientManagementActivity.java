package com.android.ctgapp.activity.mine.client;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/23
 * 描述:供应商管理 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020\u001bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/android/ctgapp/activity/mine/client/ClientManagementActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/adapter/mine/ClientAdapter$ClientCallback;", "()V", "clientType", "", "mAdapter", "Lcom/android/ctgapp/adapter/mine/ClientAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/ClientAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/ClientEntity$DataBean$RecordsBean;", "mManagerCode", "", "mViewModel", "Lcom/android/ctgapp/activity/mine/client/ClientManagementViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/client/ClientManagementViewModel;", "mViewModel$delegate", "page", "removePosition", "searchText", "size", "click", "", "event", "getData", "getLayout", "initData", "onClientItemClick", "data", "onResume", "app_hqpDebug"})
public final class ClientManagementActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.adapter.mine.ClientAdapter.ClientCallback {
    private java.lang.String clientType = "upstream";
    private java.lang.String searchText = "";
    private int page = 1;
    private final int size = 20;
    private final java.util.ArrayList<com.android.ctgapp.entity.ClientEntity.DataBean.RecordsBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final int mManagerCode = 100;
    private int removePosition = 0;
    private java.util.HashMap _$_findViewCache;
    
    public ClientManagementActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.adapter.mine.ClientAdapter getMAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.client.ClientManagementViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void getData() {
    }
    
    private final void initData() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onClientItemClick(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.ClientEntity.DataBean.RecordsBean data) {
    }
}