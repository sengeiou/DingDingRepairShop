package com.android.ctgapp.adapter.mine;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/11
 * 描述:商友list适配器 用于聊天名片选择
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/BusinessFriendEntity$DataBean;", "Lkotlin/collections/ArrayList;", "callback", "Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter$Callback;", "isLinkman", "", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter$Callback;Z)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "handlerSelect", "Callback", "MyViewHolder", "app_hqpDebug"})
public final class BusinessFriendSelectAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> mList = null;
    private final com.android.ctgapp.adapter.mine.BusinessFriendSelectAdapter.Callback callback = null;
    private final boolean isLinkman = false;
    
    public BusinessFriendSelectAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.mine.BusinessFriendSelectAdapter.Callback callback, boolean isLinkman) {
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
    
    private final void handlerSelect(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter;Landroid/view/View;)V", "mCheckBox", "Landroid/widget/CheckBox;", "getMCheckBox", "()Landroid/widget/CheckBox;", "mCompanyNameTV", "Landroid/widget/TextView;", "getMCompanyNameTV", "()Landroid/widget/TextView;", "mHeaderIV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getMHeaderIV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "mItemRL", "Landroid/widget/RelativeLayout;", "getMItemRL", "()Landroid/widget/RelativeLayout;", "mOnLineIV", "getMOnLineIV", "mUserNameTV", "getMUserNameTV", "app_hqpDebug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final de.hdodenhof.circleimageview.CircleImageView mHeaderIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mOnLineIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mUserNameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCompanyNameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout mItemRL = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.CheckBox mCheckBox = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.hdodenhof.circleimageview.CircleImageView getMHeaderIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMOnLineIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMUserNameTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCompanyNameTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getMItemRL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getMCheckBox() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter$Callback;", "", "onItemClick", "", "data", "Lcom/android/ctgapp/entity/BusinessFriendEntity$DataBean;", "position", "", "onItemClickForMore", "select", "", "app_hqpDebug"})
    public static abstract interface Callback {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.entity.BusinessFriendEntity.DataBean data, int position);
        
        public abstract void onItemClickForMore(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.entity.BusinessFriendEntity.DataBean data, boolean select);
    }
}