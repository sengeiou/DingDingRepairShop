package com.android.ctgapp.widget;

import java.lang.System;

/**
 * 作者:LiBW
 * 描述: 通知滚动器
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/android/ctgapp/widget/NotifyTextView;", "Landroid/widget/ViewFlipper;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mBulletinEnterAnim", "", "mBulletinInterval", "mBulletinLeaveAnim", "mOnBulletinItemClickListener", "Lme/bakumon/library/view/BulletinView$OnBulletinItemClickListener;", "onClick", "", "view", "Landroid/view/View;", "setAdapter", "adapter", "Lme/bakumon/library/adapter/BulletinAdapter;", "setOnBulletinItemClickListener", "onBulletinItemClickListener", "OnBulletinItemClickListener", "app_WLDebug"})
public final class NotifyTextView extends android.widget.ViewFlipper implements android.view.View.OnClickListener {
    private int mBulletinInterval = 3000;
    private int mBulletinEnterAnim = com.android.ctgapp.R.anim.bulletin_item_enter;
    private int mBulletinLeaveAnim = com.android.ctgapp.R.anim.bulletin_item_leave;
    private me.bakumon.library.view.BulletinView.OnBulletinItemClickListener mOnBulletinItemClickListener;
    private java.util.HashMap _$_findViewCache;
    
    public NotifyTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    me.bakumon.library.adapter.BulletinAdapter<?> adapter) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * 设置公告条目点击监听器
     *
     * @param onBulletinItemClickListener 公告条目点击监听器
     */
    public final void setOnBulletinItemClickListener(@org.jetbrains.annotations.Nullable()
    me.bakumon.library.view.BulletinView.OnBulletinItemClickListener onBulletinItemClickListener) {
    }
    
    /**
     * 公告条目点击监听接口
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/ctgapp/widget/NotifyTextView$OnBulletinItemClickListener;", "", "onBulletinItemClick", "", "position", "", "app_WLDebug"})
    public static abstract interface OnBulletinItemClickListener {
        
        public abstract void onBulletinItemClick(int position);
    }
}