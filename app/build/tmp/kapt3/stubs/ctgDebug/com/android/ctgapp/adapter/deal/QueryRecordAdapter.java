package com.android.ctgapp.adapter.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/6
 * 描述: 询价记录适配器
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/adapter/deal/QueryRecordAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/home/EnquiryListEntity$DataBean$RecordsBean;", "listener", "Lcom/android/ctgapp/adapter/deal/QueryRecordAdapter$QueryRecordListClick;", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/deal/QueryRecordAdapter$QueryRecordListClick;)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "MyViewHolder", "QueryRecordListClick", "app_ctgDebug"})
public final class QueryRecordAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.home.EnquiryListEntity.DataBean.RecordsBean> mList = null;
    private final com.android.ctgapp.adapter.deal.QueryRecordAdapter.QueryRecordListClick listener = null;
    
    public QueryRecordAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.home.EnquiryListEntity.DataBean.RecordsBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.deal.QueryRecordAdapter.QueryRecordListClick listener) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void handlerData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/adapter/deal/QueryRecordAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/deal/QueryRecordAdapter;Landroid/view/View;)V", "mCarNameTV", "Landroid/widget/TextView;", "getMCarNameTV", "()Landroid/widget/TextView;", "mCompanyNumberTV", "getMCompanyNumberTV", "mOrderTV", "getMOrderTV", "mParentLL", "Landroid/widget/LinearLayout;", "getMParentLL", "()Landroid/widget/LinearLayout;", "mPersonTV", "getMPersonTV", "mStatusTV", "getMStatusTV", "mTimeTV", "getMTimeTV", "app_ctgDebug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCarNameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mStatusTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mTimeTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mOrderTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mPersonTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCompanyNumberTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mParentLL = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCarNameTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMStatusTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMTimeTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMOrderTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMPersonTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCompanyNumberTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMParentLL() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/android/ctgapp/adapter/deal/QueryRecordAdapter$QueryRecordListClick;", "", "onListItemClick", "", "enquiryId", "", "statuesCode", "app_ctgDebug"})
    public static abstract interface QueryRecordListClick {
        
        public abstract void onListItemClick(int enquiryId, int statuesCode);
    }
}