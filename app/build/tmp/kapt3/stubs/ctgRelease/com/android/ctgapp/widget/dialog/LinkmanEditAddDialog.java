package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/11
 * 描述: 编辑和添加联系人 传入entity则为编辑模式 Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/widget/dialog/LinkmanEditAddDialog;", "Lcom/android/ctgapp/base/BaseDialogFragment;", "Lcom/android/ctgapp/callback/ContactSelectListener;", "listener", "Lcom/android/ctgapp/widget/dialog/LinkmanEditAddDialog$AddOverListener;", "entity", "Lcom/android/ctgapp/entity/LinkmanUseEntity;", "(Lcom/android/ctgapp/widget/dialog/LinkmanEditAddDialog$AddOverListener;Lcom/android/ctgapp/entity/LinkmanUseEntity;)V", "linkmanId", "", "mViewModel", "Lcom/android/ctgapp/widget/dialog/LinkmanEditAddViewModel;", "getMViewModel", "()Lcom/android/ctgapp/widget/dialog/LinkmanEditAddViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "getLayout", "onContactSelected", "", "data", "Lcom/android/ctgapp/entity/ContactUnAddEntity$DataBean$RecordsBean;", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "AddOverListener", "app_ctgRelease"})
public final class LinkmanEditAddDialog extends com.android.ctgapp.base.BaseDialogFragment implements com.android.ctgapp.callback.ContactSelectListener {
    private final com.android.ctgapp.widget.dialog.LinkmanEditAddDialog.AddOverListener listener = null;
    private final com.android.ctgapp.entity.LinkmanUseEntity entity = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private int linkmanId = -1;
    private java.util.HashMap _$_findViewCache;
    
    public LinkmanEditAddDialog(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.LinkmanEditAddDialog.AddOverListener listener, @org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.LinkmanUseEntity entity) {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.widget.dialog.LinkmanEditAddViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void viewIsCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onContactSelected(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.ContactUnAddEntity.DataBean.RecordsBean data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/android/ctgapp/widget/dialog/LinkmanEditAddDialog$AddOverListener;", "", "addOver", "", "app_ctgRelease"})
    public static abstract interface AddOverListener {
        
        public abstract void addOver();
    }
}