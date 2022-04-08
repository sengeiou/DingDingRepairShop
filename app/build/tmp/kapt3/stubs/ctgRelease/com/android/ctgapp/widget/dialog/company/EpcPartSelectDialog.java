package com.android.ctgapp.widget.dialog.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/8/2
 * 描述:EPC选中 菜单 Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/widget/dialog/company/EpcPartSelectDialog;", "Lcom/android/ctgapp/base/BaseCompanyDialogFragment;", "Lcom/android/ctgapp/adapter/home/enquiry/EpcSelectedAdapter$EpcSelectCallback;", "list", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntityV2$DataBean$PartsGroupBean;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/android/ctgapp/widget/dialog/company/EpcPartSelectDialog$EpcPartSelectCallback;", "(Ljava/util/ArrayList;Lcom/android/ctgapp/widget/dialog/company/EpcPartSelectDialog$EpcPartSelectCallback;)V", "mAdapter", "Lcom/android/ctgapp/adapter/home/enquiry/EpcSelectedAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/enquiry/EpcSelectedAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "epcPartDelete", "", "position", "", "getLayout", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "EpcPartSelectCallback", "app_ctgRelease"})
public final class EpcPartSelectDialog extends com.android.ctgapp.base.BaseCompanyDialogFragment implements com.android.ctgapp.adapter.home.enquiry.EpcSelectedAdapter.EpcSelectCallback {
    private final java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> list = null;
    private final com.android.ctgapp.widget.dialog.company.EpcPartSelectDialog.EpcPartSelectCallback listener = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public EpcPartSelectDialog(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> list, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.company.EpcPartSelectDialog.EpcPartSelectCallback listener) {
        super();
    }
    
    private final com.android.ctgapp.adapter.home.enquiry.EpcSelectedAdapter getMAdapter() {
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
    public void epcPartDelete(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/widget/dialog/company/EpcPartSelectDialog$EpcPartSelectCallback;", "", "onItemRemove", "", "position", "", "app_ctgRelease"})
    public static abstract interface EpcPartSelectCallback {
        
        public abstract void onItemRemove(int position);
    }
}