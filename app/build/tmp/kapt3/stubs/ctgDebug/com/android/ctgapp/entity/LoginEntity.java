package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/entity/LoginEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/LoginEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/LoginEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/LoginEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class LoginEntity {
    
    /**
     * status : 0
     * msg : 登陆成功
     * data : {"userId":1309,"telephone":"18312345678","realName":"123","nickname":null,"sex":1,"status":0,"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhbGxpYW5jZUlkIjo4ODg4OTc2ODYsImF1ZCI6IkNUR19BUFAiLCJyZWFsTmFtZSI6IjEyMyIsImNvbXBhbnlJRCI6MjIyMiwiY29tcGFueU5hbWUiOiLlsI_olpvkv67nkIbljoIiLCJpc3MiOiJ3d3cuY3Rnb2UuY29tIiwiaW5kdXN0cnkiOiJSRVBBSVJTSE9QIiwiaWF0IjoxNjAyMjIzOTc4LCJ1c2VySUQiOjEzMDksInBsYXRmb3JtIjoiQ1RHX0FQUCIsInVzZXJuYW1lIjoiMTgzMTIzNDU2NzgiLCJpbmR1c3RyeUNvZGUiOiLkv67nkIbljoIifQ.7eBOdkTRQbzUQkdjrfvczG1VgCfWCeIWGpYLUIlzE48","ctgid":"F0FQQA","imageUrl":"@_@.jpg","industry":"REPAIRSHOP","industryCode":"修理厂","companyId":2222,"companyName":"小薛修理厂","allianceId":null,"allianceName":null,"allianceRole":null,"allianceType":null,"defaultCompanyId":2222,"defaultCompanyName":"小薛修理厂","companyList":null,"allianceList":null}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.LoginEntity.DataBean data;
    private boolean isSuccess = false;
    
    public LoginEntity() {
        super();
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.entity.LoginEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.LoginEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001a\u0010&\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u001c\u0010,\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001c\u0010/\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\u001c\u00102\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001a\u00105\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00107\"\u0004\b;\u00109R\u001c\u0010<\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000b\"\u0004\b>\u0010\rR\u001c\u0010?\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010 \"\u0004\bA\u0010\"R\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001c\u0010H\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\"R\u001c\u0010K\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010 \"\u0004\bM\u0010\"R\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\b\u00a8\u0006Q"}, d2 = {"Lcom/android/ctgapp/entity/LoginEntity$DataBean;", "", "()V", "allianceId", "", "getAllianceId", "()I", "setAllianceId", "(I)V", "allianceList", "getAllianceList", "()Ljava/lang/Object;", "setAllianceList", "(Ljava/lang/Object;)V", "allianceName", "getAllianceName", "setAllianceName", "allianceRole", "getAllianceRole", "setAllianceRole", "allianceType", "getAllianceType", "setAllianceType", "companyId", "getCompanyId", "setCompanyId", "companyList", "getCompanyList", "setCompanyList", "companyName", "", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "ctgid", "getCtgid", "setCtgid", "defaultCompanyId", "getDefaultCompanyId", "setDefaultCompanyId", "defaultCompanyName", "getDefaultCompanyName", "setDefaultCompanyName", "imageUrl", "getImageUrl", "setImageUrl", "industry", "getIndustry", "setIndustry", "industryCode", "getIndustryCode", "setIndustryCode", "isCompanyAdmin", "", "()Z", "setCompanyAdmin", "(Z)V", "isCompanyCreator", "setCompanyCreator", "nickname", "getNickname", "setNickname", "realName", "getRealName", "setRealName", "sex", "getSex", "setSex", "status", "getStatus", "setStatus", "telephone", "getTelephone", "setTelephone", "token", "getToken", "setToken", "userId", "getUserId", "setUserId", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * userId : 1309
         * telephone : 18312345678
         * realName : 123
         * nickname : null
         * sex : 1
         * status : 0
         * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhbGxpYW5jZUlkIjo4ODg4OTc2ODYsImF1ZCI6IkNUR19BUFAiLCJyZWFsTmFtZSI6IjEyMyIsImNvbXBhbnlJRCI6MjIyMiwiY29tcGFueU5hbWUiOiLlsI_olpvkv67nkIbljoIiLCJpc3MiOiJ3d3cuY3Rnb2UuY29tIiwiaW5kdXN0cnkiOiJSRVBBSVJTSE9QIiwiaWF0IjoxNjAyMjIzOTc4LCJ1c2VySUQiOjEzMDksInBsYXRmb3JtIjoiQ1RHX0FQUCIsInVzZXJuYW1lIjoiMTgzMTIzNDU2NzgiLCJpbmR1c3RyeUNvZGUiOiLkv67nkIbljoIifQ.7eBOdkTRQbzUQkdjrfvczG1VgCfWCeIWGpYLUIlzE48
         * ctgid : F0FQQA
         * imageUrl : @_@.jpg
         * industry : REPAIRSHOP
         * industryCode : 修理厂
         * companyId : 2222
         * companyName : 小薛修理厂
         * allianceId : null
         * allianceName : null
         * allianceRole : null
         * allianceType : null
         * defaultCompanyId : 2222
         * defaultCompanyName : 小薛修理厂
         * companyList : null
         * allianceList : null
         */
        private int userId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String telephone;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String realName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object nickname;
        private int sex = 0;
        private int status = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String token;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ctgid;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String imageUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String industry;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String industryCode;
        private int companyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String companyName;
        private int allianceId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object allianceName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object allianceRole;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object allianceType;
        private int defaultCompanyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String defaultCompanyName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object companyList;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object allianceList;
        private boolean isCompanyAdmin = false;
        private boolean isCompanyCreator = false;
        
        public DataBean() {
            super();
        }
        
        public final int getUserId() {
            return 0;
        }
        
        public final void setUserId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTelephone() {
            return null;
        }
        
        public final void setTelephone(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRealName() {
            return null;
        }
        
        public final void setRealName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getNickname() {
            return null;
        }
        
        public final void setNickname(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getSex() {
            return 0;
        }
        
        public final void setSex(int p0) {
        }
        
        public final int getStatus() {
            return 0;
        }
        
        public final void setStatus(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getToken() {
            return null;
        }
        
        public final void setToken(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCtgid() {
            return null;
        }
        
        public final void setCtgid(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageUrl() {
            return null;
        }
        
        public final void setImageUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIndustry() {
            return null;
        }
        
        public final void setIndustry(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIndustryCode() {
            return null;
        }
        
        public final void setIndustryCode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
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
        
        public final int getAllianceId() {
            return 0;
        }
        
        public final void setAllianceId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAllianceName() {
            return null;
        }
        
        public final void setAllianceName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAllianceRole() {
            return null;
        }
        
        public final void setAllianceRole(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAllianceType() {
            return null;
        }
        
        public final void setAllianceType(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getDefaultCompanyId() {
            return 0;
        }
        
        public final void setDefaultCompanyId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultCompanyName() {
            return null;
        }
        
        public final void setDefaultCompanyName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCompanyList() {
            return null;
        }
        
        public final void setCompanyList(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAllianceList() {
            return null;
        }
        
        public final void setAllianceList(@org.jetbrains.annotations.Nullable()
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
    }
}