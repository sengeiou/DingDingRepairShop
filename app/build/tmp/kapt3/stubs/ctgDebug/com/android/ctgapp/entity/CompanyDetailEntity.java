package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/CompanyDetailEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class CompanyDetailEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"id":2222,"orgname":"小薛修理厂","legalman":null,"parentId":null,"shortName":null,"industry":null,"phone":"3333311","province":"江苏省","city":"无锡市","district":"梁溪区","address":"广丰路101号","invitationCode":null,"email":"56566565@qq.com","wechat":null,"logo":null,"websiteUrl":null,"isAttestation":null,"remark":null,"longitude":null,"latitude":null,"employeeScale":null,"allianceType":null,"isFinanceIndependent":null,"createTime":null,"createUserid":null,"updateTime":null,"isDeleted":null,"code":null}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.CompanyDetailEntity.DataBean data;
    private boolean isSuccess = false;
    
    public CompanyDetailEntity() {
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
    public final com.android.ctgapp.entity.CompanyDetailEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.CompanyDetailEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b/\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR\u001c\u0010!\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u001c\u0010$\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\rR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0011\"\u0004\b/\u0010\u0013R\u001e\u00100\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00106\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0011\"\u0004\b;\u0010\u0013R\u001c\u0010<\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000b\"\u0004\b>\u0010\rR\"\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR\u001c\u0010B\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000b\"\u0004\bD\u0010\rR\u001a\u0010E\u001a\u00020FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010G\"\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u000b\"\u0004\bK\u0010\rR\u001c\u0010L\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u000b\"\u0004\bM\u0010\rR\u001c\u0010N\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u000b\"\u0004\bP\u0010\rR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u000b\"\u0004\bS\u0010\rR\u001c\u0010T\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u000b\"\u0004\bV\u0010\rR\u001c\u0010W\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u000b\"\u0004\bY\u0010\rR\u001c\u0010Z\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001c\u0010]\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u000b\"\u0004\b_\u0010\rR\u001c\u0010`\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001c\u0010c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001c\u0010f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001c\u0010i\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u000b\"\u0004\bk\u0010\rR\u001c\u0010l\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u000b\"\u0004\bn\u0010\rR\u001c\u0010o\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001c\u0010r\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u000b\"\u0004\bt\u0010\r\u00a8\u0006u"}, d2 = {"Lcom/android/ctgapp/entity/CompanyDetailEntity$DataBean;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "allianceType", "getAllianceType", "()Ljava/lang/Object;", "setAllianceType", "(Ljava/lang/Object;)V", "attestationStatus", "", "getAttestationStatus", "()I", "setAttestationStatus", "(I)V", "carSeries", "", "Lcom/android/ctgapp/entity/CarSeriesEntity$DataBean;", "getCarSeries", "()Ljava/util/List;", "setCarSeries", "(Ljava/util/List;)V", "city", "getCity", "setCity", "code", "getCode", "setCode", "createTime", "getCreateTime", "setCreateTime", "createUserid", "getCreateUserid", "setCreateUserid", "district", "getDistrict", "setDistrict", "email", "getEmail", "setEmail", "employeeScale", "getEmployeeScale", "setEmployeeScale", "gradeId", "getGradeId", "()Ljava/lang/Integer;", "setGradeId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "gradeName", "getGradeName", "setGradeName", "id", "getId", "setId", "industry", "getIndustry", "setIndustry", "insuranceCompanies", "getInsuranceCompanies", "setInsuranceCompanies", "invitationCode", "getInvitationCode", "setInvitationCode", "isAttestation", "", "()Z", "setAttestation", "(Z)V", "isDeleted", "setDeleted", "isFinanceIndependent", "setFinanceIndependent", "latitude", "getLatitude", "setLatitude", "legalman", "getLegalman", "setLegalman", "logo", "getLogo", "setLogo", "longitude", "getLongitude", "setLongitude", "orgname", "getOrgname", "setOrgname", "parentId", "getParentId", "setParentId", "phone", "getPhone", "setPhone", "province", "getProvince", "setProvince", "remark", "getRemark", "setRemark", "shortName", "getShortName", "setShortName", "updateTime", "getUpdateTime", "setUpdateTime", "websiteUrl", "getWebsiteUrl", "setWebsiteUrl", "wechat", "getWechat", "setWechat", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * id : 2222
         * orgname : 小薛修理厂
         * legalman : null
         * parentId : null
         * shortName : null
         * industry : null
         * phone : 3333311
         * province : 江苏省
         * city : 无锡市
         * district : 梁溪区
         * address : 广丰路101号
         * invitationCode : null
         * email : 56566565@qq.com
         * wechat : null
         * logo : null
         * websiteUrl : null
         * isAttestation : null
         * remark : null
         * longitude : null
         * latitude : null
         * employeeScale : null
         * allianceType : null
         * isFinanceIndependent : null
         * createTime : null
         * createUserid : null
         * updateTime : null
         * isDeleted : null
         * code : null
         */
        private int id = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orgname;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object legalman;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object parentId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object shortName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object industry;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String phone;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String province;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String city;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String district;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String address;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object invitationCode;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String email;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object wechat;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object logo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String websiteUrl;
        private boolean isAttestation = false;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String remark;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object longitude;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object latitude;
        private int employeeScale = -1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object allianceType;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object isFinanceIndependent;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object createUserid;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object updateTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object isDeleted;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object code;
        private int attestationStatus = -1;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.CarSeriesEntity.DataBean> carSeries;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String gradeName = "";
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer gradeId;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.CarSeriesEntity.DataBean> insuranceCompanies;
        
        public DataBean() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgname() {
            return null;
        }
        
        public final void setOrgname(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLegalman() {
            return null;
        }
        
        public final void setLegalman(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getParentId() {
            return null;
        }
        
        public final void setParentId(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getShortName() {
            return null;
        }
        
        public final void setShortName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getIndustry() {
            return null;
        }
        
        public final void setIndustry(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone() {
            return null;
        }
        
        public final void setPhone(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getProvince() {
            return null;
        }
        
        public final void setProvince(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCity() {
            return null;
        }
        
        public final void setCity(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDistrict() {
            return null;
        }
        
        public final void setDistrict(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getInvitationCode() {
            return null;
        }
        
        public final void setInvitationCode(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmail() {
            return null;
        }
        
        public final void setEmail(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getWechat() {
            return null;
        }
        
        public final void setWechat(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLogo() {
            return null;
        }
        
        public final void setLogo(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getWebsiteUrl() {
            return null;
        }
        
        public final void setWebsiteUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean isAttestation() {
            return false;
        }
        
        public final void setAttestation(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRemark() {
            return null;
        }
        
        public final void setRemark(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLongitude() {
            return null;
        }
        
        public final void setLongitude(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLatitude() {
            return null;
        }
        
        public final void setLatitude(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getEmployeeScale() {
            return 0;
        }
        
        public final void setEmployeeScale(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAllianceType() {
            return null;
        }
        
        public final void setAllianceType(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object isFinanceIndependent() {
            return null;
        }
        
        public final void setFinanceIndependent(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.Object getCreateUserid() {
            return null;
        }
        
        public final void setCreateUserid(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.Object isDeleted() {
            return null;
        }
        
        public final void setDeleted(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getAttestationStatus() {
            return 0;
        }
        
        public final void setAttestationStatus(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.CarSeriesEntity.DataBean> getCarSeries() {
            return null;
        }
        
        public final void setCarSeries(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.CarSeriesEntity.DataBean> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGradeName() {
            return null;
        }
        
        public final void setGradeName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getGradeId() {
            return null;
        }
        
        public final void setGradeId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.CarSeriesEntity.DataBean> getInsuranceCompanies() {
            return null;
        }
        
        public final void setInsuranceCompanies(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.CarSeriesEntity.DataBean> p0) {
        }
    }
}