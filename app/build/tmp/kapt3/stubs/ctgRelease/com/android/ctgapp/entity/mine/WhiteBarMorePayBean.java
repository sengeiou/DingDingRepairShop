package com.android.ctgapp.entity.mine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/android/ctgapp/entity/mine/WhiteBarMorePayBean;", "Ljava/io/Serializable;", "()V", "data", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/mine/WhiteBarMorePayBean$Data;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "repayWay", "", "getRepayWay", "()I", "setRepayWay", "(I)V", "Data", "app_ctgRelease"})
public final class WhiteBarMorePayBean implements java.io.Serializable {
    private int repayWay = -1;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.android.ctgapp.entity.mine.WhiteBarMorePayBean.Data> data;
    
    public WhiteBarMorePayBean() {
        super();
    }
    
    public final int getRepayWay() {
        return 0;
    }
    
    public final void setRepayWay(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.android.ctgapp.entity.mine.WhiteBarMorePayBean.Data> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.android.ctgapp.entity.mine.WhiteBarMorePayBean.Data> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/android/ctgapp/entity/mine/WhiteBarMorePayBean$Data;", "Ljava/io/Serializable;", "()V", "orderNo", "", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "totalPrice", "getTotalPrice", "setTotalPrice", "app_ctgRelease"})
    public static final class Data implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String orderNo = "";
        @org.jetbrains.annotations.NotNull()
        private java.lang.String totalPrice = "";
        
        public Data() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrderNo() {
            return null;
        }
        
        public final void setOrderNo(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTotalPrice() {
            return null;
        }
        
        public final void setTotalPrice(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}