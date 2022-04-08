package com.android.ctgapp.widget;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 3/26/21
 * 描述:折线图描述
 */
@android.annotation.SuppressLint(value = {"ViewConstructor"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/widget/ChartDetailDescribe;", "Lcom/github/mikephil/charting/components/MarkerView;", "context", "Landroid/content/Context;", "layoutResource", "", "mList", "", "Lcom/android/ctgapp/entity/mine/DescribeLineBean;", "(Landroid/content/Context;ILjava/util/List;)V", "mDayTV", "Landroid/widget/TextView;", "mTitleTV", "getOffset", "Lcom/github/mikephil/charting/utils/MPPointF;", "refreshContent", "", "e", "Lcom/github/mikephil/charting/data/Entry;", "highlight", "Lcom/github/mikephil/charting/highlight/Highlight;", "app_hqpRelease"})
public final class ChartDetailDescribe extends com.github.mikephil.charting.components.MarkerView {
    private final java.util.List<com.android.ctgapp.entity.mine.DescribeLineBean> mList = null;
    private final android.widget.TextView mTitleTV = null;
    private final android.widget.TextView mDayTV = null;
    private java.util.HashMap _$_findViewCache;
    
    public ChartDetailDescribe(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int layoutResource, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.mine.DescribeLineBean> mList) {
        super(null, 0);
    }
    
    @java.lang.Override()
    public void refreshContent(@org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.data.Entry e, @org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.highlight.Highlight highlight) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.github.mikephil.charting.utils.MPPointF getOffset() {
        return null;
    }
}