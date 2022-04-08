package com.android.ctgapp.activity.mine;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 12/30/20
 * 描述: 所有优惠券 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0004H\u0002J\b\u0010\'\u001a\u00020\u0004H\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0004H\u0002J\u0010\u0010*\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0004H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u001e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001f\u0010\rR\u000e\u0010!\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/android/ctgapp/activity/mine/ALLCouponsActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "()V", "currentCanUseType", "", "getCurrentCanUseType", "()I", "setCurrentCanUseType", "(I)V", "fromCompanyId", "", "kotlin.jvm.PlatformType", "getFromCompanyId", "()Ljava/lang/String;", "fromCompanyId$delegate", "Lkotlin/Lazy;", "isOverdue", "Ljava/lang/Integer;", "isUsed", "mAdapter", "Lcom/android/ctgapp/adapter/home/AllCouponAdapter;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/CouponAllEntity$Data;", "mViewModel", "Lcom/android/ctgapp/activity/mine/ALLCouponsViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/ALLCouponsViewModel;", "mViewModel$delegate", "pageNum", "platformClientId", "getPlatformClientId", "platformClientId$delegate", "preSelectPosition", "click", "", "event", "getData", "status", "getLayout", "handlerPosition", "position", "initData", "app_ctgRelease"})
public final class ALLCouponsActivity extends com.android.ctgapp.base.BaseActivity {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.CouponAllEntity.Data> mList = null;
    private final com.android.ctgapp.adapter.home.AllCouponAdapter mAdapter = null;
    private final kotlin.Lazy platformClientId$delegate = null;
    private final kotlin.Lazy fromCompanyId$delegate = null;
    private int currentCanUseType = -1;
    private int preSelectPosition = -1;
    private java.lang.Integer isUsed = 1;
    private java.lang.Integer isOverdue = 1;
    private int pageNum = 1;
    private java.util.HashMap _$_findViewCache;
    
    public ALLCouponsActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.ALLCouponsViewModel getMViewModel() {
        return null;
    }
    
    public final java.lang.String getPlatformClientId() {
        return null;
    }
    
    public final java.lang.String getFromCompanyId() {
        return null;
    }
    
    public final int getCurrentCanUseType() {
        return 0;
    }
    
    public final void setCurrentCanUseType(int p0) {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void initData(int status) {
    }
    
    private final void getData(int status) {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void handlerPosition(int position) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
}