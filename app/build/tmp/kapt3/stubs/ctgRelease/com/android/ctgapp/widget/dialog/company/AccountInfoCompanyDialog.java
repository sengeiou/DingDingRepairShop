package com.android.ctgapp.widget.dialog.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/10
 * 描述:账户信息Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/android/ctgapp/widget/dialog/company/AccountInfoCompanyDialog;", "Lcom/android/ctgapp/base/BaseCompanyDialogFragment;", "companyId", "", "canEdit", "", "(IZ)V", "isNew", "mId", "mViewModel", "Lcom/android/ctgapp/widget/dialog/company/AccountInfoCompanyViewModel;", "getMViewModel", "()Lcom/android/ctgapp/widget/dialog/company/AccountInfoCompanyViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "changeStatue", "", "boolean", "getLayout", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_ctgRelease"})
public final class AccountInfoCompanyDialog extends com.android.ctgapp.base.BaseCompanyDialogFragment {
    private final int companyId = 0;
    private final boolean canEdit = false;
    private boolean isNew = true;
    private int mId = -1;
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public AccountInfoCompanyDialog(int companyId, boolean canEdit) {
        super();
    }
    
    private final com.android.ctgapp.widget.dialog.company.AccountInfoCompanyViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void viewIsCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void changeStatue(boolean p0_32355860) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
}