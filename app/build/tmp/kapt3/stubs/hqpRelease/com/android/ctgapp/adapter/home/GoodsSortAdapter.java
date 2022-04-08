package com.android.ctgapp.adapter.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/adapter/home/GoodsSortAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/android/ctgapp/adapter/home/GoodsSortAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/home/GoodsDetailBean;", "listener", "Lcom/android/ctgapp/adapter/home/GoodsSortAdapter$GoodsSortAdapterListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/home/GoodsSortAdapter$GoodsSortAdapterListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "GoodsSortAdapterListener", "MyViewHolder", "app_hqpRelease"})
public final class GoodsSortAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.android.ctgapp.adapter.home.GoodsSortAdapter.MyViewHolder> {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> mList = null;
    private final com.android.ctgapp.adapter.home.GoodsSortAdapter.GoodsSortAdapterListener listener = null;
    
    public GoodsSortAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.home.GoodsSortAdapter.GoodsSortAdapterListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.ctgapp.adapter.home.GoodsSortAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.home.GoodsSortAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/adapter/home/GoodsSortAdapter$GoodsSortAdapterListener;", "", "onItemSelect", "", "position", "", "app_hqpRelease"})
    public static abstract interface GoodsSortAdapterListener {
        
        public abstract void onItemSelect(int position);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/android/ctgapp/adapter/home/GoodsSortAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/android/ctgapp/databinding/ItemGoodsSortListBinding;", "(Lcom/android/ctgapp/adapter/home/GoodsSortAdapter;Lcom/android/ctgapp/databinding/ItemGoodsSortListBinding;)V", "mNameTV", "Landroid/widget/TextView;", "getMNameTV", "()Landroid/widget/TextView;", "mParentLL", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getMParentLL", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "app_hqpRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.LinearLayoutCompat mParentLL = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mNameTV = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.databinding.ItemGoodsSortListBinding view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.LinearLayoutCompat getMParentLL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMNameTV() {
            return null;
        }
    }
}