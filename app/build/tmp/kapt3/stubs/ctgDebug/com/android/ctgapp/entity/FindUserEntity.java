package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/FindUserEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/FindUserEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/FindUserEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/FindUserEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class FindUserEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"id":1550,"defaultCompanyId":888898041,"defaultAllianceId":null,"telephone":"13373655566","password":"0c27393026fb2efff2cf9867b61c844c","nickname":null,"status":0,"province":null,"city":null,"district":null,"address":null,"email":null,"sex":3,"realName":"将计就计","imageUrl":null,"createTime":"2020-12-30 16:58:51","updateTime":"2020-12-30 16:58:51","registerTime":"2020-12-30T16:58:51","ctgid":null,"isDeleted":false,"identificationStatus":null}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.FindUserEntity.DataBean data;
    
    public FindUserEntity() {
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
    public final com.android.ctgapp.entity.FindUserEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.FindUserEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007R\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u001a\u0010#\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001c\u0010&\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0005\"\u0004\b(\u0010\u0007R\u001c\u0010)\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001e\u00104\u001a\u00020-2\u0006\u00103\u001a\u00020-@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u001c\u00105\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0005\"\u0004\b7\u0010\u0007R\u001c\u00108\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010\u0010R\u001c\u0010;\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0005\"\u0004\b=\u0010\u0007R\u001c\u0010>\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000e\"\u0004\b@\u0010\u0010R\u001c\u0010A\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010\u0010R\u001a\u0010D\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001a\"\u0004\bF\u0010\u001cR\u001a\u0010G\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010\u001cR\u001c\u0010J\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u000e\"\u0004\bL\u0010\u0010R\u001c\u0010M\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000e\"\u0004\bO\u0010\u0010\u00a8\u0006S"}, d2 = {"Lcom/android/ctgapp/entity/FindUserEntity$DataBean;", "", "()V", "address", "getAddress", "()Ljava/lang/Object;", "setAddress", "(Ljava/lang/Object;)V", "city", "getCity", "setCity", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "ctgid", "getCtgid", "setCtgid", "defaultAllianceId", "getDefaultAllianceId", "setDefaultAllianceId", "defaultCompanyId", "", "getDefaultCompanyId", "()I", "setDefaultCompanyId", "(I)V", "district", "getDistrict", "setDistrict", "email", "getEmail", "setEmail", "id", "getId", "setId", "identificationStatus", "getIdentificationStatus", "setIdentificationStatus", "imageUrl", "getImageUrl", "setImageUrl", "isCompanyAdmin", "", "()Z", "setCompanyAdmin", "(Z)V", "isCompanyCreator", "setCompanyCreator", "<set-?>", "isIsDeleted", "nickname", "getNickname", "setNickname", "password", "getPassword", "setPassword", "province", "getProvince", "setProvince", "realName", "getRealName", "setRealName", "registerTime", "getRegisterTime", "setRegisterTime", "sex", "getSex", "setSex", "status", "getStatus", "setStatus", "telephone", "getTelephone", "setTelephone", "updateTime", "getUpdateTime", "setUpdateTime", "setIsDeleted", "", "isDeleted", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * id : 1550
         * defaultCompanyId : 888898041
         * defaultAllianceId : null
         * telephone : 13373655566
         * password : 0c27393026fb2efff2cf9867b61c844c
         * nickname : null
         * status : 0
         * province : null
         * city : null
         * district : null
         * address : null
         * email : null
         * sex : 3
         * realName : 将计就计
         * imageUrl : null
         * createTime : 2020-12-30 16:58:51
         * updateTime : 2020-12-30 16:58:51
         * registerTime : 2020-12-30T16:58:51
         * ctgid : null
         * isDeleted : false
         * identificationStatus : null
         */
        private int id = 0;
        private int defaultCompanyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object defaultAllianceId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String telephone;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String password;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object nickname;
        private int status = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object province;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object city;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object district;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object address;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object email;
        private int sex = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String realName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object imageUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String updateTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String registerTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object ctgid;
        private boolean isIsDeleted = false;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object identificationStatus;
        private boolean isCompanyAdmin = false;
        private boolean isCompanyCreator = false;
        
        public DataBean() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        public final int getDefaultCompanyId() {
            return 0;
        }
        
        public final void setDefaultCompanyId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getDefaultAllianceId() {
            return null;
        }
        
        public final void setDefaultAllianceId(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTelephone() {
            return null;
        }
        
        public final void setTelephone(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPassword() {
            return null;
        }
        
        public final void setPassword(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getNickname() {
            return null;
        }
        
        public final void setNickname(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getStatus() {
            return 0;
        }
        
        public final void setStatus(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getProvince() {
            return null;
        }
        
        public final void setProvince(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCity() {
            return null;
        }
        
        public final void setCity(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getDistrict() {
            return null;
        }
        
        public final void setDistrict(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.Object getEmail() {
            return null;
        }
        
        public final void setEmail(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getSex() {
            return 0;
        }
        
        public final void setSex(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRealName() {
            return null;
        }
        
        public final void setRealName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getImageUrl() {
            return null;
        }
        
        public final void setImageUrl(@org.jetbrains.annotations.Nullable()
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRegisterTime() {
            return null;
        }
        
        public final void setRegisterTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCtgid() {
            return null;
        }
        
        public final void setCtgid(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final boolean isIsDeleted() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getIdentificationStatus() {
            return null;
        }
        
        public final void setIdentificationStatus(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final boolean isCompanyAdmin() {
            return false;
        }
        
        public final void setCompanyAdmin(boolean p0) {
        }
        
        public final boolean isCompanyCreator() {
            return false;
        }
        
        public final void setCompanyCreator(boolean p0) {
        }
        
        public final void setIsDeleted(boolean isDeleted) {
        }
    }
}