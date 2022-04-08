package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/WhiteBarEntity;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/WhiteBarEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class WhiteBarEntity {
    
    /**
     * status : 0
     * msg : null
     * data : [{"id":106,"whiteCompanyId":888897987,"companyId":65551,"creditLimit":0,"used":1,"tempCreditLimit":0,"tempStartTime":null,"tempEndTime":null,"reconciliationDay":"次月1日","settlingDay":"20","rate":null,"type":1,"createTime":"2020-12-31 13:17:37","updateTime":null,"responsibleUserId":null,"returnMoney":1,"ogrName":"测试一夏经销","balck":false}]
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.WhiteBarEntity.DataBean> data;
    
    public WhiteBarEntity() {
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
    public final java.util.List<com.android.ctgapp.entity.WhiteBarEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.WhiteBarEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b-\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b\'\u0010\u000eR\u001c\u0010(\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001a\u0010+\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u001c\u0010.\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eR\u001a\u00101\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u0010\u0014R\u001c\u00104\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001c\u00107\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\"\"\u0004\b9\u0010$R\u001a\u0010:\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001c\u0010=\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R\u001a\u0010@\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0012\"\u0004\bB\u0010\u0014R\u001a\u0010C\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\b\u00a8\u0006F"}, d2 = {"Lcom/android/ctgapp/entity/WhiteBarEntity$DataBean;", "", "()V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "creditLimit", "", "getCreditLimit", "()D", "setCreditLimit", "(D)V", "id", "getId", "setId", "isBalck", "", "()Z", "setBalck", "(Z)V", "ogrName", "getOgrName", "setOgrName", "rate", "getRate", "()Ljava/lang/Object;", "setRate", "(Ljava/lang/Object;)V", "reconciliationDay", "getReconciliationDay", "setReconciliationDay", "responsibleUserId", "getResponsibleUserId", "setResponsibleUserId", "returnMoney", "getReturnMoney", "setReturnMoney", "settlingDay", "getSettlingDay", "setSettlingDay", "tempCreditLimit", "getTempCreditLimit", "setTempCreditLimit", "tempEndTime", "getTempEndTime", "setTempEndTime", "tempStartTime", "getTempStartTime", "setTempStartTime", "type", "getType", "setType", "updateTime", "getUpdateTime", "setUpdateTime", "used", "getUsed", "setUsed", "whiteCompanyId", "getWhiteCompanyId", "setWhiteCompanyId", "app_ctgRelease"})
    public static final class DataBean {
        
        /**
         * id : 106
         * whiteCompanyId : 888897987
         * companyId : 65551
         * creditLimit : 0.0
         * used : 1.0
         * tempCreditLimit : 0.0
         * tempStartTime : null
         * tempEndTime : null
         * reconciliationDay : 次月1日
         * settlingDay : 20
         * rate : null
         * type : 1
         * createTime : 2020-12-31 13:17:37
         * updateTime : null
         * responsibleUserId : null
         * returnMoney : 1.0
         * ogrName : 测试一夏经销
         * balck : false
         */
        private int id = 0;
        private int whiteCompanyId = 0;
        private int companyId = 0;
        private double creditLimit = 0.0;
        private double used = 0.0;
        private double tempCreditLimit = 0.0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object tempStartTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object tempEndTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String reconciliationDay;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String settlingDay;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object rate;
        private int type = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object updateTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object responsibleUserId;
        private double returnMoney = 0.0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ogrName;
        private boolean isBalck = false;
        
        public DataBean() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        public final int getWhiteCompanyId() {
            return 0;
        }
        
        public final void setWhiteCompanyId(int p0) {
        }
        
        public final int getCompanyId() {
            return 0;
        }
        
        public final void setCompanyId(int p0) {
        }
        
        public final double getCreditLimit() {
            return 0.0;
        }
        
        public final void setCreditLimit(double p0) {
        }
        
        public final double getUsed() {
            return 0.0;
        }
        
        public final void setUsed(double p0) {
        }
        
        public final double getTempCreditLimit() {
            return 0.0;
        }
        
        public final void setTempCreditLimit(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getTempStartTime() {
            return null;
        }
        
        public final void setTempStartTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getTempEndTime() {
            return null;
        }
        
        public final void setTempEndTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReconciliationDay() {
            return null;
        }
        
        public final void setReconciliationDay(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSettlingDay() {
            return null;
        }
        
        public final void setSettlingDay(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getRate() {
            return null;
        }
        
        public final void setRate(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getType() {
            return 0;
        }
        
        public final void setType(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreateTime() {
            return null;
        }
        
        public final void setCreateTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getUpdateTime() {
            return null;
        }
        
        public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getResponsibleUserId() {
            return null;
        }
        
        public final void setResponsibleUserId(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final double getReturnMoney() {
            return 0.0;
        }
        
        public final void setReturnMoney(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOgrName() {
            return null;
        }
        
        public final void setOgrName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean isBalck() {
            return false;
        }
        
        public final void setBalck(boolean p0) {
        }
    }
}