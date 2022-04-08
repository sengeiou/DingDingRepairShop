package com.android.ctgapp.adapter.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/adapter/chart/SystemNotifyAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/chart/SystemNotifyEntity$DataBean$RecordsBean;", "(Landroid/content/Context;Ljava/util/List;)V", "listener", "Lcom/android/ctgapp/adapter/chart/SystemNotifyAdapter$SystemNotifyListener;", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "getListener", "", "handlerData", "holder", "position", "", "MyViewHolder", "SystemNotifyListener", "app_ctgDebug"})
public final class SystemNotifyAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.chart.SystemNotifyEntity.DataBean.RecordsBean> mList = null;
    private com.android.ctgapp.adapter.chart.SystemNotifyAdapter.SystemNotifyListener listener;
    
    public SystemNotifyAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.chart.SystemNotifyEntity.DataBean.RecordsBean> mList) {
        super(null, null);
    }
    
    public final void getListener(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.chart.SystemNotifyAdapter.SystemNotifyListener listener) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2 = {"Lcom/android/ctgapp/adapter/chart/SystemNotifyAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/chart/SystemNotifyAdapter;Landroid/view/View;)V", "mCompanyNameTV", "Landroid/widget/TextView;", "getMCompanyNameTV", "()Landroid/widget/TextView;", "setMCompanyNameTV", "(Landroid/widget/TextView;)V", "mContantTV", "getMContantTV", "setMContantTV", "mParentLL", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getMParentLL", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "setMParentLL", "(Landroidx/appcompat/widget/LinearLayoutCompat;)V", "mTimeTV", "getMTimeTV", "setMTimeTV", "mTitleTV", "getMTitleTV", "setMTitleTV", "mUnreadIV", "Landroid/widget/ImageView;", "getMUnreadIV", "()Landroid/widget/ImageView;", "setMUnreadIV", "(Landroid/widget/ImageView;)V", "app_ctgDebug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.LinearLayoutCompat mParentLL;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mCompanyNameTV;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mTitleTV;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mTimeTV;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mContantTV;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView mUnreadIV;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.LinearLayoutCompat getMParentLL() {
            return null;
        }
        
        public final void setMParentLL(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.LinearLayoutCompat p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCompanyNameTV() {
            return null;
        }
        
        public final void setMCompanyNameTV(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMTitleTV() {
            return null;
        }
        
        public final void setMTitleTV(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMTimeTV() {
            return null;
        }
        
        public final void setMTimeTV(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMContantTV() {
            return null;
        }
        
        public final void setMContantTV(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMUnreadIV() {
            return null;
        }
        
        public final void setMUnreadIV(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/adapter/chart/SystemNotifyAdapter$SystemNotifyListener;", "", "onItemClickListener", "", "position", "", "app_ctgDebug"})
    public static abstract interface SystemNotifyListener {
        
        public abstract void onItemClickListener(int position);
    }
}