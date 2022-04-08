package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/11
 * 描述: 商友 多电话号码选择
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/android/ctgapp/widget/dialog/DepartmentAddDialog;", "Lcom/android/ctgapp/base/BaseDialogFragment;", "callback", "Lcom/android/ctgapp/widget/dialog/DepartmentAddDialog$DepartmentAddListener;", "departmentId", "", "(Lcom/android/ctgapp/widget/dialog/DepartmentAddDialog$DepartmentAddListener;I)V", "getLayout", "viewIsCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "DepartmentAddListener", "app_hqpRelease"})
public final class DepartmentAddDialog extends com.android.ctgapp.base.BaseDialogFragment {
    private final com.android.ctgapp.widget.dialog.DepartmentAddDialog.DepartmentAddListener callback = null;
    private final int departmentId = 0;
    private java.util.HashMap _$_findViewCache;
    
    public DepartmentAddDialog(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.DepartmentAddDialog.DepartmentAddListener callback, int departmentId) {
        super();
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/android/ctgapp/widget/dialog/DepartmentAddDialog$DepartmentAddListener;", "", "addDepartment", "", "departmentName", "", "editDepartment", "departmentId", "", "app_hqpRelease"})
    public static abstract interface DepartmentAddListener {
        
        public abstract void addDepartment(@org.jetbrains.annotations.NotNull()
        java.lang.String departmentName);
        
        public abstract void editDepartment(@org.jetbrains.annotations.NotNull()
        java.lang.String departmentName, int departmentId);
    }
}