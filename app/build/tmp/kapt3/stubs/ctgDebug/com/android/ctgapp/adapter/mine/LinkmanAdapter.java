package com.android.ctgapp.adapter.mine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0017\u0018B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/adapter/mine/LinkmanAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "Lcom/android/ctgapp/widget/dialog/LinkmanEditAddDialog$AddOverListener;", "canEdit", "", "context", "Landroid/content/Context;", "list", "", "Lcom/android/ctgapp/entity/LinkmanEntity$DataBean;", "listener", "Lcom/android/ctgapp/adapter/mine/LinkmanAdapter$RefreshListener;", "(ZLandroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/mine/LinkmanAdapter$RefreshListener;)V", "addOver", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "holder", "position", "", "MyViewHolder", "RefreshListener", "app_ctgDebug"})
public final class LinkmanAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter implements com.android.ctgapp.widget.dialog.LinkmanEditAddDialog.AddOverListener {
    private boolean canEdit;
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.LinkmanEntity.DataBean> list = null;
    private final com.android.ctgapp.adapter.mine.LinkmanAdapter.RefreshListener listener = null;
    
    public LinkmanAdapter(boolean canEdit, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.LinkmanEntity.DataBean> list, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.mine.LinkmanAdapter.RefreshListener listener) {
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
    
    @java.lang.Override()
    public void addOver() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/adapter/mine/LinkmanAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/mine/LinkmanAdapter;Landroid/view/View;)V", "mCardParent", "Landroid/widget/LinearLayout;", "getMCardParent", "()Landroid/widget/LinearLayout;", "mEditIV", "Landroid/widget/ImageView;", "getMEditIV", "()Landroid/widget/ImageView;", "mHeaderIV", "getMHeaderIV", "mNameTV", "Landroid/widget/TextView;", "getMNameTV", "()Landroid/widget/TextView;", "mPhoneTV", "getMPhoneTV", "mRemarkTV", "getMRemarkTV", "app_ctgDebug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mHeaderIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mEditIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mNameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mPhoneTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mRemarkTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mCardParent = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMHeaderIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMEditIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMNameTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMPhoneTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMRemarkTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMCardParent() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/android/ctgapp/adapter/mine/LinkmanAdapter$RefreshListener;", "", "goRefresh", "", "app_ctgDebug"})
    public static abstract interface RefreshListener {
        
        public abstract void goRefresh();
    }
}