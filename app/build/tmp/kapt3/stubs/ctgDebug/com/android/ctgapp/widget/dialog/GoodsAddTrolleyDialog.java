package com.android.ctgapp.widget.dialog;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/10
 * 描述:加入购物车 Dialog 立即购买 Dialog
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/android/ctgapp/widget/dialog/GoodsAddTrolleyDialog;", "Lcom/android/ctgapp/base/BaseDialogFromBottomFragment;", "Lcom/android/ctgapp/adapter/home/GoodsSortAdapter$GoodsSortAdapterListener;", "bean", "Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "listener", "Lcom/android/ctgapp/widget/dialog/GoodsAddTrolleyDialog$AddTrolley;", "(Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;Lcom/android/ctgapp/widget/dialog/GoodsAddTrolleyDialog$AddTrolley;)V", "entity", "number", "", "otherSortList", "", "Lcom/android/ctgapp/entity/home/GoodsDetailBean;", "getOtherSortList", "()Ljava/util/List;", "setOtherSortList", "(Ljava/util/List;)V", "selectPartId", "", "getLayout", "onItemSelect", "", "position", "onStart", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "AddTrolley", "app_ctgDebug"})
public final class GoodsAddTrolleyDialog extends com.android.ctgapp.base.BaseDialogFromBottomFragment implements com.android.ctgapp.adapter.home.GoodsSortAdapter.GoodsSortAdapterListener {
    private final com.android.ctgapp.entity.home.TrolleyAddGoodsBean bean = null;
    private final com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog.AddTrolley listener = null;
    private com.android.ctgapp.entity.home.TrolleyAddGoodsBean entity;
    private int number = 1;
    private java.lang.String selectPartId = "";
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> otherSortList;
    private java.util.HashMap _$_findViewCache;
    
    public GoodsAddTrolleyDialog(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.TrolleyAddGoodsBean bean, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog.AddTrolley listener) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> getOtherSortList() {
        return null;
    }
    
    public final void setOtherSortList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> p0) {
    }
    
    @java.lang.Override()
    public void onStart() {
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
    public void onItemSelect(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/android/ctgapp/widget/dialog/GoodsAddTrolleyDialog$AddTrolley;", "", "addGoodsToTrolley", "", "bean", "Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "onPartSortSelect", "partId", "", "app_ctgDebug"})
    public static abstract interface AddTrolley {
        
        public abstract void addGoodsToTrolley(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.entity.home.TrolleyAddGoodsBean bean);
        
        public abstract void onPartSortSelect(@org.jetbrains.annotations.NotNull()
        java.lang.String partId);
    }
}