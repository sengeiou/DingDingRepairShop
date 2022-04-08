package com.android.ctgapp.activity.mine.team;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/19
 * 描述: 部门选择 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0018\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\u0016\u0010+\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\tJ\u0018\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0016\u0010.\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006/"}, d2 = {"Lcom/android/ctgapp/activity/mine/team/DepartmentSelectActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/widget/dialog/DepartmentAddDialog$DepartmentAddListener;", "Lcom/android/ctgapp/adapter/mine/DepartmentHorizontalAdapter$HorizontalListener;", "()V", "currentDepartmentId", "", "currentSelectId", "currentSelectName", "", "mAdapter", "Lcom/android/ctgapp/adapter/mine/DepartmentAdapter;", "mHorizontalAdapter", "Lcom/android/ctgapp/adapter/mine/DepartmentHorizontalAdapter;", "getMHorizontalAdapter", "()Lcom/android/ctgapp/adapter/mine/DepartmentHorizontalAdapter;", "mHorizontalAdapter$delegate", "Lkotlin/Lazy;", "mHorizontalList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/DepartmentHorizontalEntity;", "mList", "Lcom/android/ctgapp/entity/DepartmentListEntity$DataBean;", "getMList", "()Ljava/util/ArrayList;", "mViewModel", "Lcom/android/ctgapp/activity/mine/team/DepartmentSelectViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/team/DepartmentSelectViewModel;", "mViewModel$delegate", "preSelectId", "getPreSelectId", "()I", "setPreSelectId", "(I)V", "addDepartment", "", "departmentName", "click", "editDepartment", "departmentId", "event", "getLayout", "itemSelectResult", "onItemClickListener", "index", "verticalItem", "app_ctgDebug"})
public final class DepartmentSelectActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.widget.dialog.DepartmentAddDialog.DepartmentAddListener, com.android.ctgapp.adapter.mine.DepartmentHorizontalAdapter.HorizontalListener {
    private int currentDepartmentId = 0;
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.android.ctgapp.entity.DepartmentListEntity.DataBean> mList = null;
    private com.android.ctgapp.adapter.mine.DepartmentAdapter mAdapter;
    private final java.util.ArrayList<com.android.ctgapp.entity.DepartmentHorizontalEntity> mHorizontalList = null;
    private final kotlin.Lazy mHorizontalAdapter$delegate = null;
    private java.lang.String currentSelectName = "";
    private int currentSelectId = -1;
    private int preSelectId = -1;
    private java.util.HashMap _$_findViewCache;
    
    public DepartmentSelectActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.team.DepartmentSelectViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.DepartmentListEntity.DataBean> getMList() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.DepartmentHorizontalAdapter getMHorizontalAdapter() {
        return null;
    }
    
    public final int getPreSelectId() {
        return 0;
    }
    
    public final void setPreSelectId(int p0) {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    public final void verticalItem(int departmentId, @org.jetbrains.annotations.NotNull()
    java.lang.String departmentName) {
    }
    
    public final void itemSelectResult(int departmentId, @org.jetbrains.annotations.NotNull()
    java.lang.String departmentName) {
    }
    
    @java.lang.Override()
    public void addDepartment(@org.jetbrains.annotations.NotNull()
    java.lang.String departmentName) {
    }
    
    @java.lang.Override()
    public void editDepartment(@org.jetbrains.annotations.NotNull()
    java.lang.String departmentName, int departmentId) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onItemClickListener(int index, int departmentId) {
    }
}