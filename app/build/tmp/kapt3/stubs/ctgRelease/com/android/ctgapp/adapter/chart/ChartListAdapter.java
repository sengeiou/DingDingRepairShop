package com.android.ctgapp.adapter.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/adapter/chart/ChartListAdapter;", "Lcom/android/ctgapp/base/BaseRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/chart/ChartListEntity;", "listener", "Lcom/android/ctgapp/adapter/chart/ChartListAdapter$ChartListListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/chart/ChartListAdapter$ChartListListener;)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "ChartListListener", "MyViewHolder", "app_ctgRelease"})
public final class ChartListAdapter extends com.android.ctgapp.base.BaseRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.chart.ChartListEntity> mList = null;
    private final com.android.ctgapp.adapter.chart.ChartListAdapter.ChartListListener listener = null;
    
    public ChartListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.chart.ChartListEntity> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.chart.ChartListAdapter.ChartListListener listener) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/adapter/chart/ChartListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/chart/ChartListAdapter;Landroid/view/View;)V", "mBottomLine", "getMBottomLine", "()Landroid/view/View;", "mContentTV", "Landroid/widget/TextView;", "getMContentTV", "()Landroid/widget/TextView;", "mImageHeaderIV", "Landroid/widget/ImageView;", "getMImageHeaderIV", "()Landroid/widget/ImageView;", "mLastTimeTV", "getMLastTimeTV", "mMegCountTV", "getMMegCountTV", "mOnLineIV", "getMOnLineIV", "mParentRL", "Landroid/widget/RelativeLayout;", "getMParentRL", "()Landroid/widget/RelativeLayout;", "mTitleTV", "getMTitleTV", "app_ctgRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mOnLineIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mImageHeaderIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mMegCountTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mTitleTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mContentTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mLastTimeTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout mParentRL = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View mBottomLine = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMOnLineIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMImageHeaderIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMMegCountTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMTitleTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMContentTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMLastTimeTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getMParentRL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMBottomLine() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\u000bJ9\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/android/ctgapp/adapter/chart/ChartListAdapter$ChartListListener;", "", "onItemClick", "", "otherID", "", "groupID", "otherName", "", "otherImage", "companyName", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onItemClickForMore", "app_ctgRelease"})
    public static abstract interface ChartListListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.Nullable()
        java.lang.Integer otherID, @org.jetbrains.annotations.Nullable()
        java.lang.Integer groupID, @org.jetbrains.annotations.NotNull()
        java.lang.String otherName, @org.jetbrains.annotations.NotNull()
        java.lang.String otherImage, @org.jetbrains.annotations.NotNull()
        java.lang.String companyName);
        
        public abstract void onItemClickForMore(@org.jetbrains.annotations.Nullable()
        java.lang.Integer otherID, @org.jetbrains.annotations.Nullable()
        java.lang.Integer groupID, @org.jetbrains.annotations.NotNull()
        java.lang.String otherName, @org.jetbrains.annotations.NotNull()
        java.lang.String otherImage, @org.jetbrains.annotations.NotNull()
        java.lang.String companyName);
    }
}