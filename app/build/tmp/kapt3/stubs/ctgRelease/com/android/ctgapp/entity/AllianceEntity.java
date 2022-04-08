package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/AllianceEntity;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/AllianceEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class AllianceEntity {
    
    /**
     * status : 0
     * msg : null
     * data : [{"allianceId":888897621,"orgname":"A车配联盟","phone":null,"address":null,"logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","isAdd":null}]
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.AllianceEntity.DataBean> data;
    
    public AllianceEntity() {
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
    public final java.util.List<com.android.ctgapp.entity.AllianceEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.AllianceEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0005\"\u0004\b$\u0010\u0007\u00a8\u0006%"}, d2 = {"Lcom/android/ctgapp/entity/AllianceEntity$DataBean;", "", "()V", "address", "getAddress", "()Ljava/lang/Object;", "setAddress", "(Ljava/lang/Object;)V", "allianceId", "", "getAllianceId", "()I", "setAllianceId", "(I)V", "allianceType", "", "getAllianceType", "()Ljava/lang/String;", "setAllianceType", "(Ljava/lang/String;)V", "auditStatus", "getAuditStatus", "setAuditStatus", "isAdded", "", "()Z", "setAdded", "(Z)V", "logo", "getLogo", "setLogo", "orgname", "getOrgname", "setOrgname", "phone", "getPhone", "setPhone", "app_ctgRelease"})
    public static final class DataBean {
        
        /**
         * allianceId : 888897621
         * orgname : A车配联盟
         * phone : null
         * address : null
         * logo : fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg
         * isAdd : null
         */
        private int allianceId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orgname;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object phone;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object address;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String logo;
        private boolean isAdded = false;
        private int auditStatus = -1;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String allianceType = "";
        
        public DataBean() {
            super();
        }
        
        public final int getAllianceId() {
            return 0;
        }
        
        public final void setAllianceId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgname() {
            return null;
        }
        
        public final void setOrgname(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPhone() {
            return null;
        }
        
        public final void setPhone(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLogo() {
            return null;
        }
        
        public final void setLogo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean isAdded() {
            return false;
        }
        
        public final void setAdded(boolean p0) {
        }
        
        public final int getAuditStatus() {
            return 0;
        }
        
        public final void setAuditStatus(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAllianceType() {
            return null;
        }
        
        public final void setAllianceType(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}