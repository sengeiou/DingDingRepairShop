package com.android.ctgapp.entity.mine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/mine/WhitePayResultEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/mine/WhitePayResultEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/mine/WhitePayResultEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/mine/WhitePayResultEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpRelease"})
public final class WhitePayResultEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"repayOrderNo":"HK20210609162233240CRRQ006","orderInfo":"{\"package\":\"Sign=WXPay\",\"appid\":\"wx635283d6cec45ac9\",\"sign\":\"D515AFFB052512DD8A918AC3A131BD96\",\"partnerid\":\"1545788671\",\"prepayid\":\"wx0916223362568732f073c5768f2bbf0000\",\"noncestr\":\"1623226953723\",\"timestamp\":\"1623226953\"}"}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.mine.WhitePayResultEntity.DataBean data;
    private boolean isSuccess = false;
    
    public WhitePayResultEntity() {
        super();
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.entity.mine.WhitePayResultEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.mine.WhitePayResultEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/android/ctgapp/entity/mine/WhitePayResultEntity$DataBean;", "", "()V", "orderInfo", "", "getOrderInfo", "()Ljava/lang/String;", "setOrderInfo", "(Ljava/lang/String;)V", "repayOrderNo", "getRepayOrderNo", "setRepayOrderNo", "app_hqpRelease"})
    public static final class DataBean {
        
        /**
         * repayOrderNo : HK20210609162233240CRRQ006
         * orderInfo : {"package":"Sign=WXPay","appid":"wx635283d6cec45ac9","sign":"D515AFFB052512DD8A918AC3A131BD96","partnerid":"1545788671","prepayid":"wx0916223362568732f073c5768f2bbf0000","noncestr":"1623226953723","timestamp":"1623226953"}
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String repayOrderNo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orderInfo;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRepayOrderNo() {
            return null;
        }
        
        public final void setRepayOrderNo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrderInfo() {
            return null;
        }
        
        public final void setOrderInfo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
    }
}