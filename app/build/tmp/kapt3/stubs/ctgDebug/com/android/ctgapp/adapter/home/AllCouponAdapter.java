package com.android.ctgapp.adapter.home;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 12/30/20
 * 描述: 全部优惠券页面使用的适配器
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0012R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/adapter/home/AllCouponAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/CouponAllEntity$Data;", "(Landroid/content/Context;Ljava/util/List;)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "reshow", "Lcom/android/ctgapp/adapter/home/AllCouponAdapter$MyViewHolder;", "data", "", "MyViewHolder", "app_ctgDebug"})
public final class AllCouponAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.CouponAllEntity.Data> mList = null;
    
    public AllCouponAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.CouponAllEntity.Data> mList) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    private final void reshow(com.android.ctgapp.adapter.home.AllCouponAdapter.MyViewHolder holder, boolean data) {
    }
    
    @java.lang.Override()
    public void handlerData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010!\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\'\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\fR\u0011\u0010)\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\f\u00a8\u0006+"}, d2 = {"Lcom/android/ctgapp/adapter/home/AllCouponAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/home/AllCouponAdapter;Landroid/view/View;)V", "mButtonRL", "Landroid/widget/RelativeLayout;", "getMButtonRL", "()Landroid/widget/RelativeLayout;", "mButtonTV", "Landroid/widget/TextView;", "getMButtonTV", "()Landroid/widget/TextView;", "mChildCouponRV", "Landroidx/recyclerview/widget/RecyclerView;", "getMChildCouponRV", "()Landroidx/recyclerview/widget/RecyclerView;", "mCouponBrandTV", "getMCouponBrandTV", "mCouponNameHeadTV", "getMCouponNameHeadTV", "mCouponNameTV", "getMCouponNameTV", "mCouponWayTV", "getMCouponWayTV", "mCtgnumTV", "getMCtgnumTV", "mDetails", "Landroid/widget/LinearLayout;", "getMDetails", "()Landroid/widget/LinearLayout;", "mHeadLL", "getMHeadLL", "mLeftAmountTV", "getMLeftAmountTV", "mMoneyTV", "getMMoneyTV", "mParentLL", "getMParentLL", "mRuleTV", "getMRuleTV", "mUseTimeTV", "getMUseTimeTV", "app_ctgDebug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mMoneyTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCouponNameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mUseTimeTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCouponWayTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mRuleTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCouponNameHeadTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mButtonTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout mButtonRL = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mHeadLL = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mLeftAmountTV = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.recyclerview.widget.RecyclerView mChildCouponRV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mDetails = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mParentLL = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCouponBrandTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCtgnumTV = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMMoneyTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCouponNameTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMUseTimeTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCouponWayTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMRuleTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCouponNameHeadTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMButtonTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getMButtonRL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMHeadLL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMLeftAmountTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getMChildCouponRV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMParentLL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCouponBrandTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCtgnumTV() {
            return null;
        }
    }
}