package com.android.ctgapp.adapter.deal;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 11/16/20
 * 描述: 订单 适配器
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0015\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/adapter/deal/OrderAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "Lcom/android/ctgapp/widget/dialog/SendGoodsDialog$Callback;", "context", "Landroidx/fragment/app/FragmentActivity;", "mList", "", "Lcom/android/ctgapp/entity/OrderEntity$DataBean$RecordsBean;", "listener", "Lcom/android/ctgapp/adapter/deal/OrderAdapter$OrderListener;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;Lcom/android/ctgapp/adapter/deal/OrderAdapter$OrderListener;)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "sendGoodsFinish", "MyViewHolder", "OrderListener", "app_hqpRelease"})
public final class OrderAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter implements com.android.ctgapp.widget.dialog.SendGoodsDialog.Callback {
    private final androidx.fragment.app.FragmentActivity context = null;
    private final java.util.List<com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean> mList = null;
    private final com.android.ctgapp.adapter.deal.OrderAdapter.OrderListener listener = null;
    
    public OrderAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.deal.OrderAdapter.OrderListener listener) {
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
    public void sendGoodsFinish() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/adapter/deal/OrderAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/deal/OrderAdapter;Landroid/view/View;)V", "mOrderCreateTimeTV", "Landroid/widget/TextView;", "getMOrderCreateTimeTV", "()Landroid/widget/TextView;", "mOrderId", "getMOrderId", "mParentLL", "Landroid/widget/LinearLayout;", "getMParentLL", "()Landroid/widget/LinearLayout;", "mPartNamesTV", "getMPartNamesTV", "mSellerTV", "getMSellerTV", "mSendTV", "getMSendTV", "mStatusTV", "getMStatusTV", "mTotalPriceTV", "getMTotalPriceTV", "app_hqpRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mOrderId = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mStatusTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mOrderCreateTimeTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mSellerTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mPartNamesTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mSendTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mTotalPriceTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mParentLL = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMOrderId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMStatusTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMOrderCreateTimeTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMSellerTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMPartNamesTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMSendTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMTotalPriceTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMParentLL() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/android/ctgapp/adapter/deal/OrderAdapter$OrderListener;", "", "onReturnCallback", "", "app_hqpRelease"})
    public static abstract interface OrderListener {
        
        public abstract void onReturnCallback();
    }
}