package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/InvoiceEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/InvoiceEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/InvoiceEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/InvoiceEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class InvoiceEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"id":39,"companyId":65551,"companyName":"ceshi","companyAddress":"eqeqwe","taxNum":"12321","telephoneNum":"1231231","rank":"zz111z","rankNumber":"qweq","createUserId":12,"updateTime":"2020-12-22 03:32:21","createTime":null}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.InvoiceEntity.DataBean data;
    private boolean isSuccess = false;
    
    public InvoiceEntity() {
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
    public final com.android.ctgapp.entity.InvoiceEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.InvoiceEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001a\u0010\u001d\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\b\u00a8\u0006,"}, d2 = {"Lcom/android/ctgapp/entity/InvoiceEntity$DataBean;", "", "()V", "comRank", "", "getComRank", "()Ljava/lang/String;", "setComRank", "(Ljava/lang/String;)V", "companyAddress", "getCompanyAddress", "setCompanyAddress", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "companyName", "getCompanyName", "setCompanyName", "createTime", "getCreateTime", "()Ljava/lang/Object;", "setCreateTime", "(Ljava/lang/Object;)V", "createUserId", "getCreateUserId", "setCreateUserId", "id", "getId", "setId", "rankNumber", "getRankNumber", "setRankNumber", "taxNum", "getTaxNum", "setTaxNum", "telephoneNum", "getTelephoneNum", "setTelephoneNum", "updateTime", "getUpdateTime", "setUpdateTime", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * id : 39
         * companyId : 65551
         * companyName : ceshi
         * companyAddress : eqeqwe
         * taxNum : 12321
         * telephoneNum : 1231231
         * rank : zz111z
         * rankNumber : qweq
         * createUserId : 12
         * updateTime : 2020-12-22 03:32:21
         * createTime : null
         */
        private int id = 0;
        private int companyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String companyName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String companyAddress;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String taxNum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String telephoneNum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String comRank;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String rankNumber;
        private int createUserId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String updateTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object createTime;
        
        public DataBean() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        public final int getCompanyId() {
            return 0;
        }
        
        public final void setCompanyId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCompanyName() {
            return null;
        }
        
        public final void setCompanyName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCompanyAddress() {
            return null;
        }
        
        public final void setCompanyAddress(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTaxNum() {
            return null;
        }
        
        public final void setTaxNum(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTelephoneNum() {
            return null;
        }
        
        public final void setTelephoneNum(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getComRank() {
            return null;
        }
        
        public final void setComRank(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRankNumber() {
            return null;
        }
        
        public final void setRankNumber(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getCreateUserId() {
            return 0;
        }
        
        public final void setCreateUserId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUpdateTime() {
            return null;
        }
        
        public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCreateTime() {
            return null;
        }
        
        public final void setCreateTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
    }
}