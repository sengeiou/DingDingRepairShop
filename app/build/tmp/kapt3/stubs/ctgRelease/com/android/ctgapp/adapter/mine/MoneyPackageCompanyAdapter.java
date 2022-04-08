package com.android.ctgapp.adapter.mine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/android/ctgapp/adapter/mine/MoneyPackageCompanyAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/mine/company/RechargeEntity$DataBean;", "(Landroid/content/Context;Ljava/util/List;)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "MyViewHolder", "app_ctgRelease"})
public final class MoneyPackageCompanyAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.mine.company.RechargeEntity.DataBean> mList = null;
    
    public MoneyPackageCompanyAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.mine.company.RechargeEntity.DataBean> mList) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/adapter/mine/MoneyPackageCompanyAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/android/ctgapp/databinding/ItemMoneyPackageCompanyListBinding;", "(Lcom/android/ctgapp/adapter/mine/MoneyPackageCompanyAdapter;Lcom/android/ctgapp/databinding/ItemMoneyPackageCompanyListBinding;)V", "mCompanyName", "Landroid/widget/TextView;", "getMCompanyName", "()Landroid/widget/TextView;", "mImageView", "Lde/hdodenhof/circleimageview/CircleImageView;", "getMImageView", "()Lde/hdodenhof/circleimageview/CircleImageView;", "mIsActivityIm", "Landroid/widget/ImageView;", "getMIsActivityIm", "()Landroid/widget/ImageView;", "mMoney", "getMMoney", "mParentLL", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getMParentLL", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "mVoucherNum", "getMVoucherNum", "app_ctgRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCompanyName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mMoney = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.LinearLayoutCompat mParentLL = null;
        @org.jetbrains.annotations.NotNull()
        private final de.hdodenhof.circleimageview.CircleImageView mImageView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mVoucherNum = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mIsActivityIm = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.databinding.ItemMoneyPackageCompanyListBinding view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCompanyName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMMoney() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.LinearLayoutCompat getMParentLL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.hdodenhof.circleimageview.CircleImageView getMImageView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMVoucherNum() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMIsActivityIm() {
            return null;
        }
    }
}