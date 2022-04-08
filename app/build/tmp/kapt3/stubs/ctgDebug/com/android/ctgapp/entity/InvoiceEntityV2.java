package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/InvoiceEntityV2;", "", "()V", "data", "Lcom/android/ctgapp/entity/InvoiceEntityV2$DataBean;", "getData", "()Lcom/android/ctgapp/entity/InvoiceEntityV2$DataBean;", "setData", "(Lcom/android/ctgapp/entity/InvoiceEntityV2$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class InvoiceEntityV2 {
    
    /**
     * status : 0
     * msg : null
     * data : {"id":null,"licenseName":null,"licenseAddress":null,"taxpayerNum":null,"reservedTel":null,"bankName":null,"bankAccount":null}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.InvoiceEntityV2.DataBean data;
    
    public InvoiceEntityV2() {
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
    public final com.android.ctgapp.entity.InvoiceEntityV2.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.InvoiceEntityV2.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/android/ctgapp/entity/InvoiceEntityV2$DataBean;", "", "()V", "bankAccount", "getBankAccount", "()Ljava/lang/Object;", "setBankAccount", "(Ljava/lang/Object;)V", "bankName", "getBankName", "setBankName", "id", "", "getId", "()I", "setId", "(I)V", "licenseAddress", "getLicenseAddress", "setLicenseAddress", "licenseName", "getLicenseName", "setLicenseName", "reservedTel", "getReservedTel", "setReservedTel", "taxpayerNum", "getTaxpayerNum", "setTaxpayerNum", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * id : null
         * licenseName : null
         * licenseAddress : null
         * taxpayerNum : null
         * reservedTel : null
         * bankName : null
         * bankAccount : null
         */
        private int id = -1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object licenseName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object licenseAddress;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object taxpayerNum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object reservedTel;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object bankName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object bankAccount;
        
        public DataBean() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLicenseName() {
            return null;
        }
        
        public final void setLicenseName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLicenseAddress() {
            return null;
        }
        
        public final void setLicenseAddress(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getTaxpayerNum() {
            return null;
        }
        
        public final void setTaxpayerNum(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getReservedTel() {
            return null;
        }
        
        public final void setReservedTel(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getBankName() {
            return null;
        }
        
        public final void setBankName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getBankAccount() {
            return null;
        }
        
        public final void setBankAccount(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
    }
}