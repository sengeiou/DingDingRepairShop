package com.android.ctgapp.callback;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/7
 * 描述: 购物车管理类
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0010"}, d2 = {"Lcom/android/ctgapp/callback/TrolleyGoodsChangeListener;", "", "changesSelect", "", "ids", "", "", "isSelected", "goodChildItemCheckChange", "shoppingId", "select", "goodCountChange", "trolleyId", "num", "goodDelete", "trolleyIds", "app_ctgDebug"})
public abstract interface TrolleyGoodsChangeListener {
    
    /**
     * *商品选中数量变更
     */
    public abstract void goodCountChange(int trolleyId, int num);
    
    /**
     * *删除商品
     */
    public abstract void goodDelete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> trolleyIds);
    
    /**
     * *商品子菜单选中状态变更
     */
    public abstract void goodChildItemCheckChange(int shoppingId, int select);
    
    /**
     * *批量修改选中状态
     */
    public abstract void changesSelect(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> ids, int isSelected);
}