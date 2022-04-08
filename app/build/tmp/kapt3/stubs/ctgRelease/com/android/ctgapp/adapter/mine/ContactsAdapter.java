package com.android.ctgapp.adapter.mine;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/14
 * 描述: Contact联系人适配器
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/android/ctgapp/adapter/mine/ContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/android/ctgapp/adapter/mine/ContactsAdapter$ContactsViewHolder;", "contacts", "", "Lcom/android/ctgapp/entity/ContactModel;", "callback", "Lcom/android/ctgapp/callback/PhoneNumSelectCallback;", "(Ljava/util/List;Lcom/android/ctgapp/callback/PhoneNumSelectCallback;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ContactsViewHolder", "app_ctgRelease"})
public final class ContactsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.android.ctgapp.adapter.mine.ContactsAdapter.ContactsViewHolder> {
    private final java.util.List<com.android.ctgapp.entity.ContactModel> contacts = null;
    private final com.android.ctgapp.callback.PhoneNumSelectCallback callback = null;
    
    public ContactsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.ContactModel> contacts, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.callback.PhoneNumSelectCallback callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.ctgapp.adapter.mine.ContactsAdapter.ContactsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.mine.ContactsAdapter.ContactsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/adapter/mine/ContactsAdapter$ContactsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/mine/ContactsAdapter;Landroid/view/View;)V", "mAddTV", "Landroid/widget/TextView;", "getMAddTV", "()Landroid/widget/TextView;", "setMAddTV", "(Landroid/widget/TextView;)V", "mContactImageIV", "Landroid/widget/ImageView;", "getMContactImageIV", "()Landroid/widget/ImageView;", "setMContactImageIV", "(Landroid/widget/ImageView;)V", "mContactName", "getMContactName", "setMContactName", "mIndexTV", "getMIndexTV", "setMIndexTV", "mPhoneNumTV", "getMPhoneNumTV", "setMPhoneNumTV", "app_ctgRelease"})
    public final class ContactsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mIndexTV;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView mContactImageIV;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mContactName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mAddTV;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mPhoneNumTV;
        
        public ContactsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMIndexTV() {
            return null;
        }
        
        public final void setMIndexTV(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMContactImageIV() {
            return null;
        }
        
        public final void setMContactImageIV(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMContactName() {
            return null;
        }
        
        public final void setMContactName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMAddTV() {
            return null;
        }
        
        public final void setMAddTV(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMPhoneNumTV() {
            return null;
        }
        
        public final void setMPhoneNumTV(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}