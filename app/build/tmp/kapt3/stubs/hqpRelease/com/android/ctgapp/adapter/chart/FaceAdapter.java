package com.android.ctgapp.adapter.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/adapter/chart/FaceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/android/ctgapp/adapter/chart/FaceAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/chart/ChartFaceBean;", "(Landroid/content/Context;[Lcom/android/ctgapp/entity/chart/ChartFaceBean;)V", "listener", "Lcom/android/ctgapp/adapter/chart/FaceAdapter$FaceItemCheck;", "[Lcom/android/ctgapp/entity/chart/ChartFaceBean;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnclickListener", "FaceItemCheck", "MyViewHolder", "app_hqpRelease"})
public final class FaceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.android.ctgapp.adapter.chart.FaceAdapter.MyViewHolder> {
    private final android.content.Context context = null;
    private final com.android.ctgapp.entity.chart.ChartFaceBean[] mList = null;
    private com.android.ctgapp.adapter.chart.FaceAdapter.FaceItemCheck listener;
    
    public FaceAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.ChartFaceBean[] mList) {
        super();
    }
    
    public final void setOnclickListener(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.chart.FaceAdapter.FaceItemCheck listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.ctgapp.adapter.chart.FaceAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.chart.FaceAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/android/ctgapp/adapter/chart/FaceAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/chart/FaceAdapter;Landroid/view/View;)V", "mFaceIdIV", "Landroid/widget/ImageView;", "getMFaceIdIV", "()Landroid/widget/ImageView;", "mPrentLL", "Landroid/widget/LinearLayout;", "getMPrentLL", "()Landroid/widget/LinearLayout;", "app_hqpRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mFaceIdIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mPrentLL = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMFaceIdIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMPrentLL() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/android/ctgapp/adapter/chart/FaceAdapter$FaceItemCheck;", "", "onItemClickListener", "", "resourceId", "", "imageName", "", "app_hqpRelease"})
    public static abstract interface FaceItemCheck {
        
        public abstract void onItemClickListener(int resourceId, @org.jetbrains.annotations.NotNull()
        java.lang.String imageName);
    }
}