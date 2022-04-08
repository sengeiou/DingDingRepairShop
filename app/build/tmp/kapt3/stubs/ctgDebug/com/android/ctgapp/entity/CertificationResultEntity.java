package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/CertificationResultEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/CertificationResultEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/CertificationResultEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/CertificationResultEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class CertificationResultEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"id":1,"userId":1309,"realName":"老虎","idcardNum":"230777777777777777","aimage":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","bimage":"af1ca2e9-6e28-471d-940e-bb64e26ab4ae.jpeg","status":0,"reason":null,"createTime":"2020-12-19T16:54:40","updateTime":"2020-12-19T16:56:47"}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.CertificationResultEntity.DataBean data;
    
    public CertificationResultEntity() {
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
    public final com.android.ctgapp.entity.CertificationResultEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.CertificationResultEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001a\u0010&\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0012\"\u0004\b(\u0010\u0014\u00a8\u0006)"}, d2 = {"Lcom/android/ctgapp/entity/CertificationResultEntity$DataBean;", "", "()V", "aimage", "", "getAimage", "()Ljava/lang/String;", "setAimage", "(Ljava/lang/String;)V", "bimage", "getBimage", "setBimage", "createTime", "getCreateTime", "setCreateTime", "id", "", "getId", "()I", "setId", "(I)V", "idcardNum", "getIdcardNum", "setIdcardNum", "realName", "getRealName", "setRealName", "reason", "getReason", "()Ljava/lang/Object;", "setReason", "(Ljava/lang/Object;)V", "status", "getStatus", "setStatus", "updateTime", "getUpdateTime", "setUpdateTime", "userId", "getUserId", "setUserId", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * id : 1
         * userId : 1309
         * realName : 老虎
         * idcardNum : 230777777777777777
         * aimage : fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg
         * bimage : af1ca2e9-6e28-471d-940e-bb64e26ab4ae.jpeg
         * status : 0
         * reason : null
         * createTime : 2020-12-19T16:54:40
         * updateTime : 2020-12-19T16:56:47
         */
        private int id = 0;
        private int userId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String realName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String idcardNum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String aimage;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String bimage;
        private int status = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object reason;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String updateTime;
        
        public DataBean() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        public final int getUserId() {
            return 0;
        }
        
        public final void setUserId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRealName() {
            return null;
        }
        
        public final void setRealName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIdcardNum() {
            return null;
        }
        
        public final void setIdcardNum(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAimage() {
            return null;
        }
        
        public final void setAimage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBimage() {
            return null;
        }
        
        public final void setBimage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getStatus() {
            return 0;
        }
        
        public final void setStatus(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getReason() {
            return null;
        }
        
        public final void setReason(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreateTime() {
            return null;
        }
        
        public final void setCreateTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUpdateTime() {
            return null;
        }
        
        public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
    }
}