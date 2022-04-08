package com.android.ctgapp.adapter.mine;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/30
 * 描述:加入企业 列表 adapter
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/adapter/mine/JoinCompanyAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/CompanyCanJoinEntity$DataBean$RecordsBean;", "listener", "Lcom/android/ctgapp/adapter/mine/JoinCompanyAdapter$JoinCompanyListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/mine/JoinCompanyAdapter$JoinCompanyListener;)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "JoinCompanyListener", "MyViewHolder", "app_WLDebug"})
public final class JoinCompanyAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.CompanyCanJoinEntity.DataBean.RecordsBean> mList = null;
    private final com.android.ctgapp.adapter.mine.JoinCompanyAdapter.JoinCompanyListener listener = null;
    
    public JoinCompanyAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.CompanyCanJoinEntity.DataBean.RecordsBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.mine.JoinCompanyAdapter.JoinCompanyListener listener) {
        super(null, null);
    }
    
    @java.lang.Override()
    public void handlerData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/adapter/mine/JoinCompanyAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/mine/JoinCompanyAdapter;Landroid/view/View;)V", "mAddressIV", "Landroid/widget/ImageView;", "getMAddressIV", "()Landroid/widget/ImageView;", "mCompanyAddressTV", "Landroid/widget/TextView;", "getMCompanyAddressTV", "()Landroid/widget/TextView;", "mCompanyNameTV", "getMCompanyNameTV", "mCompanyPhoneTV", "getMCompanyPhoneTV", "mCompanyPhotoIV", "getMCompanyPhotoIV", "mCompanyTypeTV", "getMCompanyTypeTV", "mJoinBTN", "getMJoinBTN", "mPhoneIV", "getMPhoneIV", "app_WLDebug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mCompanyPhotoIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCompanyNameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCompanyTypeTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCompanyAddressTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCompanyPhoneTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mJoinBTN = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mAddressIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mPhoneIV = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMCompanyPhotoIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCompanyNameTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCompanyTypeTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCompanyAddressTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCompanyPhoneTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMJoinBTN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMAddressIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMPhoneIV() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/adapter/mine/JoinCompanyAdapter$JoinCompanyListener;", "", "onJoinButtonClickListener", "", "companyId", "", "app_WLDebug"})
    public static abstract interface JoinCompanyListener {
        
        public abstract void onJoinButtonClickListener(int companyId);
    }
}