package com.android.ctgapp.adapter.mine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/adapter/mine/SwitchCompanyAdapterEmpty;", "Lcom/android/ctgapp/base/BaseEmptyRecyclerViewAdapter;", "context", "Landroid/content/Context;", "mList", "", "Lcom/android/ctgapp/entity/CompanyChangeEntity$DataBean;", "companyChangeListener", "Lcom/android/ctgapp/adapter/mine/SwitchCompanyAdapterEmpty$CompanyChangeListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/mine/SwitchCompanyAdapterEmpty$CompanyChangeListener;)V", "preSelectId", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "handlerData", "", "holder", "position", "CompanyChangeListener", "MyViewHolder", "app_hqpRelease"})
public final class SwitchCompanyAdapterEmpty extends com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.CompanyChangeEntity.DataBean> mList = null;
    private final com.android.ctgapp.adapter.mine.SwitchCompanyAdapterEmpty.CompanyChangeListener companyChangeListener = null;
    private int preSelectId = -1;
    
    public SwitchCompanyAdapterEmpty(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.CompanyChangeEntity.DataBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.mine.SwitchCompanyAdapterEmpty.CompanyChangeListener companyChangeListener) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/android/ctgapp/adapter/mine/SwitchCompanyAdapterEmpty$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/android/ctgapp/adapter/mine/SwitchCompanyAdapterEmpty;Landroid/view/View;)V", "mCompanyCB", "Landroid/widget/CheckBox;", "getMCompanyCB", "()Landroid/widget/CheckBox;", "mCompanyLL", "Landroid/widget/LinearLayout;", "getMCompanyLL", "()Landroid/widget/LinearLayout;", "mCompanyNameTV", "Landroid/widget/TextView;", "getMCompanyNameTV", "()Landroid/widget/TextView;", "mDefaultCompanyTV", "getMDefaultCompanyTV", "app_hqpRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.CheckBox mCompanyCB = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mCompanyNameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mCompanyLL = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mDefaultCompanyTV = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getMCompanyCB() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMCompanyNameTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMCompanyLL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMDefaultCompanyTV() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/adapter/mine/SwitchCompanyAdapterEmpty$CompanyChangeListener;", "", "onCompanyChange", "", "companyId", "", "app_hqpRelease"})
    public static abstract interface CompanyChangeListener {
        
        public abstract void onCompanyChange(int companyId);
    }
}