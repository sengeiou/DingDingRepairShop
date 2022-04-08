package com.android.ctgapp.adapter.home.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/adapter/home/address/AddressAdapter;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/AddressEntity$DataBean;", "listener", "Lcom/android/ctgapp/adapter/home/address/AddressAdapter$ChangeAddress;", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/home/address/AddressAdapter$ChangeAddress;)V", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "", "ChangeAddress", "MyViewHolder", "app_ctgRelease"})
public final class AddressAdapter extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.AddressEntity.DataBean> mList = null;
    private final com.android.ctgapp.adapter.home.address.AddressAdapter.ChangeAddress listener = null;
    
    public AddressAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.AddressEntity.DataBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.home.address.AddressAdapter.ChangeAddress listener) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/adapter/home/address/AddressAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/home/address/AddressAdapter;Landroid/view/View;)V", "mAddressTV", "Landroid/widget/TextView;", "getMAddressTV", "()Landroid/widget/TextView;", "mCheckBox", "Landroid/widget/CheckBox;", "getMCheckBox", "()Landroid/widget/CheckBox;", "mCheckBoxTV", "getMCheckBoxTV", "mDeleteTV", "getMDeleteTV", "mEditTextTV", "getMEditTextTV", "mNameTV", "getMNameTV", "mParentLL", "Landroid/widget/LinearLayout;", "getMParentLL", "()Landroid/widget/LinearLayout;", "mPhoneTV", "getMPhoneTV", "app_ctgRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mNameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mPhoneTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mAddressTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCheckBoxTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mDeleteTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mEditTextTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.CheckBox mCheckBox = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mParentLL = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
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
        public final android.widget.TextView getMAddressTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCheckBoxTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMDeleteTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMEditTextTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getMCheckBox() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMParentLL() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/android/ctgapp/adapter/home/address/AddressAdapter$ChangeAddress;", "", "addressSelect", "", "bean", "Lcom/android/ctgapp/entity/AddressEntity$DataBean;", "deleteAddress", "addressId", "", "setDefault", "updateAddress", "app_ctgRelease"})
    public static abstract interface ChangeAddress {
        
        public abstract void deleteAddress(int addressId);
        
        public abstract void updateAddress(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.entity.AddressEntity.DataBean bean);
        
        public abstract void setDefault(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.entity.AddressEntity.DataBean bean);
        
        public abstract void addressSelect(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.entity.AddressEntity.DataBean bean);
    }
}