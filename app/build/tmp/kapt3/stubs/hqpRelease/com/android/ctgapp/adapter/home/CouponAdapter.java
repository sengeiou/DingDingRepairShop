package com.android.ctgapp.adapter.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/adapter/home/CouponAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/CouponAllEntity$Data;", "click", "Lcom/android/ctgapp/adapter/home/CouponAdapter$Click;", "position", "", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/home/CouponAdapter$Click;I)V", "currentselected", "getCurrentselected", "()I", "setCurrentselected", "(I)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "Click", "MyViewHolder", "app_hqpRelease"})
public final class CouponAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.CouponAllEntity.Data> mList = null;
    private final com.android.ctgapp.adapter.home.CouponAdapter.Click click = null;
    private int currentselected;
    
    public CouponAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.CouponAllEntity.Data> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.home.CouponAdapter.Click click, int position) {
        super(null, null);
    }
    
    public final int getCurrentselected() {
        return 0;
    }
    
    public final void setCurrentselected(int p0) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0011\u0010!\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010#\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\f\u00a8\u0006\'"}, d2 = {"Lcom/android/ctgapp/adapter/home/CouponAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/home/CouponAdapter;Landroid/view/View;)V", "mButtonRL", "Landroid/widget/RelativeLayout;", "getMButtonRL", "()Landroid/widget/RelativeLayout;", "mButtonTV", "Landroid/widget/TextView;", "getMButtonTV", "()Landroid/widget/TextView;", "mCheak", "Landroid/widget/CheckBox;", "getMCheak", "()Landroid/widget/CheckBox;", "mCouponBrandTV", "getMCouponBrandTV", "mCouponNameHeadTV", "getMCouponNameHeadTV", "mCouponNameTV", "getMCouponNameTV", "mCouponWayTV", "getMCouponWayTV", "mHeadLL", "Landroid/widget/LinearLayout;", "getMHeadLL", "()Landroid/widget/LinearLayout;", "mLeftAmountTV", "getMLeftAmountTV", "mMoneyTV", "getMMoneyTV", "mParentLL", "getMParentLL", "mRuleTV", "getMRuleTV", "mUseTimeTV", "getMUseTimeTV", "app_hqpRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mParentLL = null;
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
        private final android.widget.CheckBox mCheak = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCouponBrandTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mLeftAmountTV = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMParentLL() {
            return null;
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
        public final android.widget.CheckBox getMCheak() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCouponBrandTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMLeftAmountTV() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/adapter/home/CouponAdapter$Click;", "", "onItemSelect", "", "position", "", "app_hqpRelease"})
    public static abstract interface Click {
        
        public abstract void onItemSelect(int position);
    }
}