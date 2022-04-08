package com.android.ctgapp.adapter.home;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 4/27/21
 * 描述: 采购单 adapter
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/adapter/home/PurchaseAdapter;", "Lcom/android/ctgapp/base/BaseRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntityV2$DataBean$PartsGroupBean;", "listener", "Lcom/android/ctgapp/adapter/home/PurchaseAdapter$PurchaseCallback;", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/home/PurchaseAdapter$PurchaseCallback;)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "MyViewHolder", "PurchaseCallback", "app_hqpRelease"})
public final class PurchaseAdapter extends com.android.ctgapp.base.BaseRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> mList = null;
    private final com.android.ctgapp.adapter.home.PurchaseAdapter.PurchaseCallback listener = null;
    
    public PurchaseAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.home.PurchaseAdapter.PurchaseCallback listener) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/android/ctgapp/adapter/home/PurchaseAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/home/PurchaseAdapter;Landroid/view/View;)V", "m4SLL", "Landroid/widget/LinearLayout;", "getM4SLL", "()Landroid/widget/LinearLayout;", "mAddBTN", "Landroid/widget/FrameLayout;", "getMAddBTN", "()Landroid/widget/FrameLayout;", "mDeleteIV", "Landroid/widget/ImageView;", "getMDeleteIV", "()Landroid/widget/ImageView;", "mGoodsCountTV", "Landroid/widget/TextView;", "getMGoodsCountTV", "()Landroid/widget/TextView;", "mMinusBTN", "getMMinusBTN", "mNameTV", "getMNameTV", "mOENumberET", "Landroid/widget/EditText;", "getMOENumberET", "()Landroid/widget/EditText;", "mOENumberTV", "getMOENumberTV", "mPriceTV", "getMPriceTV", "app_hqpRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mDeleteIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mNameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mPriceTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mOENumberTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mGoodsCountTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.FrameLayout mMinusBTN = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.FrameLayout mAddBTN = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout m4SLL = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.EditText mOENumberET = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMDeleteIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMNameTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMPriceTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMOENumberTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMGoodsCountTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.FrameLayout getMMinusBTN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.FrameLayout getMAddBTN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getM4SLL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.EditText getMOENumberET() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/android/ctgapp/adapter/home/PurchaseAdapter$PurchaseCallback;", "", "deleteItem", "", "position", "", "refreshCount", "number", "unKnowOeEdit", "oe", "", "app_hqpRelease"})
    public static abstract interface PurchaseCallback {
        
        public abstract void refreshCount(int number, int position);
        
        public abstract void deleteItem(int position);
        
        public abstract void unKnowOeEdit(@org.jetbrains.annotations.NotNull()
        java.lang.String oe, int position);
    }
}