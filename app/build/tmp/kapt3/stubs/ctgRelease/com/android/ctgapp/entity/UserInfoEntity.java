package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/UserInfoEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/UserInfoEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/UserInfoEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/UserInfoEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class UserInfoEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"id":1309,"defaultCompanyId":null,"defaultAllianceId":null,"telephone":"18312345678","password":null,"nickname":null,"status":null,"province":null,"city":null,"district":null,"address":null,"email":null,"sex":1,"realName":"123","imageUrl":null,"createTime":null,"updateTime":null,"registerTime":null,"ctgid":null,"isDeleted":null,"identificationStatus":"未认证"}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.UserInfoEntity.DataBean data;
    
    public UserInfoEntity() {
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
    public final com.android.ctgapp.entity.UserInfoEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.UserInfoEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b4\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007R\u001a\u0010&\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001d\"\u0004\b(\u0010\u001fR\u001a\u0010)\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010,\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R\u001c\u0010/\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u001c\u00102\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0005\"\u0004\b3\u0010\u0007R\u001c\u00104\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0005\"\u0004\b6\u0010\u0007R\u001c\u00107\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0005\"\u0004\b9\u0010\u0007R\u001c\u0010:\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0005\"\u0004\b<\u0010\u0007R\u001c\u0010=\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR\u001c\u0010@\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0005\"\u0004\bB\u0010\u0007R\u001a\u0010C\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0017\"\u0004\bE\u0010\u0019R\u001c\u0010F\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0005\"\u0004\bH\u0010\u0007R\u001c\u0010I\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001d\"\u0004\bK\u0010\u001fR\u001c\u0010L\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0005\"\u0004\bN\u0010\u0007\u00a8\u0006O"}, d2 = {"Lcom/android/ctgapp/entity/UserInfoEntity$DataBean;", "", "()V", "address", "getAddress", "()Ljava/lang/Object;", "setAddress", "(Ljava/lang/Object;)V", "city", "getCity", "setCity", "createTime", "getCreateTime", "setCreateTime", "ctgid", "getCtgid", "setCtgid", "defaultAllianceId", "getDefaultAllianceId", "setDefaultAllianceId", "defaultCompanyId", "", "getDefaultCompanyId", "()I", "setDefaultCompanyId", "(I)V", "defaultCompanyName", "", "getDefaultCompanyName", "()Ljava/lang/String;", "setDefaultCompanyName", "(Ljava/lang/String;)V", "district", "getDistrict", "setDistrict", "email", "getEmail", "setEmail", "externalPost", "getExternalPost", "setExternalPost", "id", "getId", "setId", "identificationStatus", "getIdentificationStatus", "setIdentificationStatus", "imageUrl", "getImageUrl", "setImageUrl", "isDeleted", "setDeleted", "nickname", "getNickname", "setNickname", "password", "getPassword", "setPassword", "province", "getProvince", "setProvince", "realName", "getRealName", "setRealName", "registerTime", "getRegisterTime", "setRegisterTime", "sex", "getSex", "setSex", "status", "getStatus", "setStatus", "telephone", "getTelephone", "setTelephone", "updateTime", "getUpdateTime", "setUpdateTime", "app_ctgRelease"})
    public static final class DataBean {
        
        /**
         * id : 1309
         * defaultCompanyId : null
         * defaultAllianceId : null
         * telephone : 18312345678
         * password : null
         * nickname : null
         * status : null
         * province : null
         * city : null
         * district : null
         * address : null
         * email : null
         * sex : 1
         * realName : 123
         * imageUrl : null
         * createTime : null
         * updateTime : null
         * registerTime : null
         * ctgid : null
         * isDeleted : null
         * identificationStatus : 未认证
         */
        private int id = 0;
        private int defaultCompanyId = -1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object defaultAllianceId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String telephone;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object password;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object nickname;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object status;
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
        private java.lang.Object createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object updateTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object registerTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object ctgid;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object isDeleted;
        private int identificationStatus = -1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String defaultCompanyName;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String externalPost = "";
        
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
        public final java.lang.Object getPassword() {
            return null;
        }
        
        public final void setPassword(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getNickname() {
            return null;
        }
        
        public final void setNickname(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getStatus() {
            return null;
        }
        
        public final void setStatus(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
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
        public final java.lang.Object getCreateTime() {
            return null;
        }
        
        public final void setCreateTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getUpdateTime() {
            return null;
        }
        
        public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getRegisterTime() {
            return null;
        }
        
        public final void setRegisterTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCtgid() {
            return null;
        }
        
        public final void setCtgid(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object isDeleted() {
            return null;
        }
        
        public final void setDeleted(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getIdentificationStatus() {
            return 0;
        }
        
        public final void setIdentificationStatus(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultCompanyName() {
            return null;
        }
        
        public final void setDefaultCompanyName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getExternalPost() {
            return null;
        }
        
        public final void setExternalPost(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}