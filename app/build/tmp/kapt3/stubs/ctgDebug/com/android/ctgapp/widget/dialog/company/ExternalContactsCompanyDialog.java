package com.android.ctgapp.widget.dialog.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/10
 * 描述:对外联系人 Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Lcom/android/ctgapp/widget/dialog/company/ExternalContactsCompanyDialog;", "Lcom/android/ctgapp/base/BaseCompanyDialogFragment;", "Lcom/android/ctgapp/widget/dialog/LinkmanEditAddDialog$AddOverListener;", "Lcom/android/ctgapp/adapter/mine/LinkmanAdapter$RefreshListener;", "mCompanyId", "", "canEdit", "", "(IZ)V", "list", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/LinkmanEntity$DataBean;", "getList", "()Ljava/util/ArrayList;", "mAdapter", "Lcom/android/ctgapp/adapter/mine/LinkmanAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/LinkmanAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mViewModel", "Lcom/android/ctgapp/widget/dialog/company/ExternalContactsCompanyViewModel;", "getMViewModel", "()Lcom/android/ctgapp/widget/dialog/company/ExternalContactsCompanyViewModel;", "mViewModel$delegate", "addOver", "", "getLayout", "goRefresh", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_ctgDebug"})
public final class ExternalContactsCompanyDialog extends com.android.ctgapp.base.BaseCompanyDialogFragment implements com.android.ctgapp.widget.dialog.LinkmanEditAddDialog.AddOverListener, com.android.ctgapp.adapter.mine.LinkmanAdapter.RefreshListener {
    private final int mCompanyId = 0;
    private boolean canEdit;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.android.ctgapp.entity.LinkmanEntity.DataBean> list = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public ExternalContactsCompanyDialog(int mCompanyId, boolean canEdit) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.widget.dialog.company.ExternalContactsCompanyViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.LinkmanEntity.DataBean> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.adapter.mine.LinkmanAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void viewIsCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void addOver() {
    }
    
    @java.lang.Override()
    public void goRefresh() {
    }
}