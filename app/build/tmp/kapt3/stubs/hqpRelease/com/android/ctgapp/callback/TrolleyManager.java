package com.android.ctgapp.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rJ\u0014\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/android/ctgapp/callback/TrolleyManager;", "", "()V", "listener", "Lcom/android/ctgapp/callback/TrolleyGoodsChangeListener;", "getListener", "()Lcom/android/ctgapp/callback/TrolleyGoodsChangeListener;", "setListener", "(Lcom/android/ctgapp/callback/TrolleyGoodsChangeListener;)V", "changesSelect", "", "ids", "", "", "isSelected", "goodChildItemCheckChange", "shoppingId", "select", "goodCountChange", "trolleyId", "num", "goodDelete", "trolleyIds", "setCallback", "app_hqpRelease"})
public final class TrolleyManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.callback.TrolleyManager INSTANCE = null;
    @org.jetbrains.annotations.Nullable()
    private static com.android.ctgapp.callback.TrolleyGoodsChangeListener listener;
    
    private TrolleyManager() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.callback.TrolleyGoodsChangeListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.callback.TrolleyGoodsChangeListener p0) {
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.callback.TrolleyGoodsChangeListener listener) {
    }
    
    public final void goodCountChange(int trolleyId, int num) {
    }
    
    public final void goodDelete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> trolleyIds) {
    }
    
    public final void goodChildItemCheckChange(int shoppingId, int select) {
    }
    
    public final void changesSelect(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> ids, int isSelected) {
    }
}