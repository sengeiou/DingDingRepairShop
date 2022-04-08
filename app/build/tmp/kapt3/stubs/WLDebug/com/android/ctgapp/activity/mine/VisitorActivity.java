package com.android.ctgapp.activity.mine;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 1/3/21
 * 描述: 访客 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/android/ctgapp/activity/mine/VisitorActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "()V", "lineList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/mine/VisitorLineEntity$DataBean$VisitorsBean;", "mAdapter", "Lcom/android/ctgapp/adapter/mine/VisitorAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/VisitorAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mList", "Lcom/android/ctgapp/entity/mine/VisitorListEntity$DataBean;", "mViewModel", "Lcom/android/ctgapp/activity/mine/VisitorViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/VisitorViewModel;", "mViewModel$delegate", "profitPoint", "Lcom/github/mikephil/charting/data/Entry;", "skeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "skeletonCard", "click", "", "event", "getLayout", "", "initProfitChart", "app_WLDebug"})
public final class VisitorActivity extends com.android.ctgapp.base.BaseActivity {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.mine.VisitorListEntity.DataBean> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private final java.util.ArrayList<com.github.mikephil.charting.data.Entry> profitPoint = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.mine.VisitorLineEntity.DataBean.VisitorsBean> lineList = null;
    private com.ethanhua.skeleton.SkeletonScreen skeleton;
    private com.ethanhua.skeleton.SkeletonScreen skeletonCard;
    private java.util.HashMap _$_findViewCache;
    
    public VisitorActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.mine.VisitorViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.VisitorAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final void initProfitChart() {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
}