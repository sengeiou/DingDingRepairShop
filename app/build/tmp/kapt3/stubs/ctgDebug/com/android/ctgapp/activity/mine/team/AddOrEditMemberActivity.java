package com.android.ctgapp.activity.mine.team;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/11
 * 描述: 添加员工 编辑员工 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\"\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/android/ctgapp/activity/mine/team/AddOrEditMemberActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "()V", "autoRegister", "", "departmentId", "", "departmentName", "", "isAdmin", "isEdit", "labelId", "Ljava/lang/Integer;", "labelName", "mBinding", "Lcom/android/ctgapp/databinding/ActivityAddMemberBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityAddMemberBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mViewModel", "Lcom/android/ctgapp/activity/mine/team/AddOrEditMemberViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/team/AddOrEditMemberViewModel;", "mViewModel$delegate", "olderDepartmentId", "userId", "userNo", "click", "", "event", "getLayout", "Landroid/widget/LinearLayout;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "app_ctgDebug"})
public final class AddOrEditMemberActivity extends com.android.ctgapp.base.BaseActivityV2 {
    private final kotlin.Lazy mBinding$delegate = null;
    private java.lang.String labelName = "";
    private java.lang.Integer labelId;
    private java.lang.String userNo = "";
    private boolean isEdit = false;
    private boolean isAdmin = false;
    private java.lang.String departmentName = "";
    private int departmentId = -1;
    private java.lang.Integer olderDepartmentId;
    private java.lang.Integer userId;
    private final kotlin.Lazy mViewModel$delegate = null;
    private boolean autoRegister = false;
    private java.util.HashMap _$_findViewCache;
    
    public AddOrEditMemberActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityAddMemberBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.mine.team.AddOrEditMemberViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
}