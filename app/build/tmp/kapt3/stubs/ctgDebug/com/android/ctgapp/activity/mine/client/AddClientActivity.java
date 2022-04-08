package com.android.ctgapp.activity.mine.client;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/23
 * 描述: 添加供应商 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0006\u0010%\u001a\u00020!J\b\u0010&\u001a\u00020\u001bH\u0016J\u0006\u0010\'\u001a\u00020!J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u001bH\u0016J\b\u0010*\u001a\u00020!H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/android/ctgapp/activity/mine/client/AddClientActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/adapter/mine/AddClientHorizontalMenuAdapter$SelectCallback;", "Lcom/android/ctgapp/adapter/mine/AddClientAdapter$AddClientListener;", "()V", "mAdapter", "Lcom/android/ctgapp/adapter/mine/AddClientAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/AddClientAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mHorizontalMenuAdapter", "Lcom/android/ctgapp/adapter/mine/AddClientHorizontalMenuAdapter;", "getMHorizontalMenuAdapter", "()Lcom/android/ctgapp/adapter/mine/AddClientHorizontalMenuAdapter;", "mHorizontalMenuAdapter$delegate", "mHorizontalMenuList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/AddClientHorizontalItemEntity;", "mList", "Lcom/android/ctgapp/entity/ClientCanJoinEntity$DataBean$RecordsBean;", "mViewModel", "Lcom/android/ctgapp/activity/mine/client/AddClientViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/client/AddClientViewModel;", "mViewModel$delegate", "page", "", "search", "", "searchCode", "size", "click", "", "event", "findByIndustryCode", "industryCode", "getData", "getLayout", "initData", "onItemClick", "companyId", "onResume", "app_ctgDebug"})
public final class AddClientActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.adapter.mine.AddClientHorizontalMenuAdapter.SelectCallback, com.android.ctgapp.adapter.mine.AddClientAdapter.AddClientListener {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.AddClientHorizontalItemEntity> mHorizontalMenuList = null;
    private final kotlin.Lazy mHorizontalMenuAdapter$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.ClientCanJoinEntity.DataBean.RecordsBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.lang.String search = "";
    private java.lang.String searchCode = "";
    private int page = 1;
    private int size = 20;
    private java.util.HashMap _$_findViewCache;
    
    public AddClientActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.client.AddClientViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.AddClientHorizontalMenuAdapter getMHorizontalMenuAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.AddClientAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void initData() {
    }
    
    public final void getData() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void findByIndustryCode(@org.jetbrains.annotations.NotNull()
    java.lang.String industryCode) {
    }
    
    @java.lang.Override()
    public void onItemClick(int companyId) {
    }
}