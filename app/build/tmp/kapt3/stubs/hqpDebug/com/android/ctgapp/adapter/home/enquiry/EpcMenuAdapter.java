package com.android.ctgapp.adapter.home.enquiry;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/adapter/home/enquiry/EpcMenuAdapter;", "Lcom/android/ctgapp/base/BaseRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/home/enquire/EpcLeftMenuEntity$DataBean;", "epcMenuCallback", "Lcom/android/ctgapp/adapter/home/enquiry/EpcMenuAdapter$EpcMenuCallback;", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/home/enquiry/EpcMenuAdapter$EpcMenuCallback;)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "EpcMenuCallback", "MyViewHolder", "app_hqpDebug"})
public final class EpcMenuAdapter extends com.android.ctgapp.base.BaseRecyclerViewAdapter {
    private final android.content.Context context = null;
    private java.util.List<com.android.ctgapp.entity.home.enquire.EpcLeftMenuEntity.DataBean> mList;
    private final com.android.ctgapp.adapter.home.enquiry.EpcMenuAdapter.EpcMenuCallback epcMenuCallback = null;
    
    public EpcMenuAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.home.enquire.EpcLeftMenuEntity.DataBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.home.enquiry.EpcMenuAdapter.EpcMenuCallback epcMenuCallback) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/android/ctgapp/adapter/home/enquiry/EpcMenuAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/home/enquiry/EpcMenuAdapter;Landroid/view/View;)V", "mIndexTV", "Landroid/widget/TextView;", "getMIndexTV", "()Landroid/widget/TextView;", "mParentRL", "Landroid/widget/RelativeLayout;", "getMParentRL", "()Landroid/widget/RelativeLayout;", "mStartView", "getMStartView", "()Landroid/view/View;", "mTextView", "getMTextView", "app_hqpDebug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View mStartView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mIndexTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout mParentRL = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMStartView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMIndexTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getMParentRL() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/android/ctgapp/adapter/home/enquiry/EpcMenuAdapter$EpcMenuCallback;", "", "epcMenuClick", "", "position", "", "title", "", "app_hqpDebug"})
    public static abstract interface EpcMenuCallback {
        
        public abstract void epcMenuClick(int position, @org.jetbrains.annotations.NotNull()
        java.lang.String title);
    }
}