package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/CompanyCanJoinEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/CompanyCanJoinEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/CompanyCanJoinEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/CompanyCanJoinEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpDebug"})
public final class CompanyCanJoinEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"id":2222,"orgname":"小薛修理厂","legalman":"汪步东","parentId":null,"shortName":"畅运","industry":"REPAIRSHOP","phone":"13312345678","province":"江苏省","city":"无锡市","district":"梁溪区","address":"广丰路101号","invitationCode":"384170261","email":"156566565@qq.com","wechat":"2651","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","websiteUrl":"www.hqp.com","isAttestation":null,"remark":"我的公司非常哇塞 突突突突突突饿的","longitude":null,"latitude":null,"employeeScale":3,"allianceType":0,"isFinanceIndependent":true,"createTime":"2019-07-17T15:52:55","createUserid":21,"updateTime":"2020-12-19T16:57:21","isDeleted":false,"code":null,"aliPayNo":"202010BB3d72b65a56414bb4b855a3045c1afB13","weChatNo":null,"companySource":null},{"id":65551,"orgname":"小黄维修","legalman":null,"parentId":null,"shortName":null,"industry":"REPAIRSHOP","phone":"110112119","province":"天津市","city":"天津市","district":"和平区","address":null,"invitationCode":"613824570","email":null,"wechat":null,"logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","websiteUrl":null,"isAttestation":null,"remark":"哈巴\n","longitude":null,"latitude":null,"employeeScale":null,"allianceType":0,"isFinanceIndependent":true,"createTime":"2018-02-03T14:31:20","createUserid":1309,"updateTime":"2020-12-21T20:31:50","isDeleted":false,"code":null,"aliPayNo":null,"weChatNo":null,"companySource":null}],"total":275,"size":2,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":138}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.CompanyCanJoinEntity.DataBean data;
    
    public CompanyCanJoinEntity() {
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
    public final com.android.ctgapp.entity.CompanyCanJoinEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.CompanyCanJoinEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R \u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\"\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001a\u0010\'\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\u001a\u0010*\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\r\u00a8\u0006."}, d2 = {"Lcom/android/ctgapp/entity/CompanyCanJoinEntity$DataBean;", "", "()V", "countId", "getCountId", "()Ljava/lang/Object;", "setCountId", "(Ljava/lang/Object;)V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "isHitCount", "", "()Z", "setHitCount", "(Z)V", "isOptimizeCountSql", "setOptimizeCountSql", "isSearchCount", "setSearchCount", "maxLimit", "getMaxLimit", "setMaxLimit", "orders", "", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "pages", "getPages", "setPages", "records", "Lcom/android/ctgapp/entity/CompanyCanJoinEntity$DataBean$RecordsBean;", "getRecords", "setRecords", "size", "getSize", "setSize", "total", "getTotal", "setTotal", "RecordsBean", "app_hqpDebug"})
    public static final class DataBean {
        
        /**
         * records : [{"id":2222,"orgname":"小薛修理厂","legalman":"汪步东","parentId":null,"shortName":"畅运","industry":"REPAIRSHOP","phone":"13312345678","province":"江苏省","city":"无锡市","district":"梁溪区","address":"广丰路101号","invitationCode":"384170261","email":"156566565@qq.com","wechat":"2651","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","websiteUrl":"www.hqp.com","isAttestation":null,"remark":"我的公司非常哇塞 突突突突突突饿的","longitude":null,"latitude":null,"employeeScale":3,"allianceType":0,"isFinanceIndependent":true,"createTime":"2019-07-17T15:52:55","createUserid":21,"updateTime":"2020-12-19T16:57:21","isDeleted":false,"code":null,"aliPayNo":"202010BB3d72b65a56414bb4b855a3045c1afB13","weChatNo":null,"companySource":null},{"id":65551,"orgname":"小黄维修","legalman":null,"parentId":null,"shortName":null,"industry":"REPAIRSHOP","phone":"110112119","province":"天津市","city":"天津市","district":"和平区","address":null,"invitationCode":"613824570","email":null,"wechat":null,"logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","websiteUrl":null,"isAttestation":null,"remark":"哈巴\n","longitude":null,"latitude":null,"employeeScale":null,"allianceType":0,"isFinanceIndependent":true,"createTime":"2018-02-03T14:31:20","createUserid":1309,"updateTime":"2020-12-21T20:31:50","isDeleted":false,"code":null,"aliPayNo":null,"weChatNo":null,"companySource":null}]
         * total : 275
         * size : 2
         * current : 1
         * orders : []
         * optimizeCountSql : true
         * hitCount : false
         * countId : null
         * maxLimit : null
         * searchCount : true
         * pages : 138
         */
        private int total = 0;
        private int size = 0;
        private int current = 0;
        private boolean isOptimizeCountSql = false;
        private boolean isHitCount = false;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object countId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object maxLimit;
        private boolean isSearchCount = false;
        private int pages = 0;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.CompanyCanJoinEntity.DataBean.RecordsBean> records;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<?> orders;
        
        public DataBean() {
            super();
        }
        
        public final int getTotal() {
            return 0;
        }
        
        public final void setTotal(int p0) {
        }
        
        public final int getSize() {
            return 0;
        }
        
        public final void setSize(int p0) {
        }
        
        public final int getCurrent() {
            return 0;
        }
        
        public final void setCurrent(int p0) {
        }
        
        public final boolean isOptimizeCountSql() {
            return false;
        }
        
        public final void setOptimizeCountSql(boolean p0) {
        }
        
        public final boolean isHitCount() {
            return false;
        }
        
        public final void setHitCount(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCountId() {
            return null;
        }
        
        public final void setCountId(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getMaxLimit() {
            return null;
        }
        
        public final void setMaxLimit(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final boolean isSearchCount() {
            return false;
        }
        
        public final void setSearchCount(boolean p0) {
        }
        
        public final int getPages() {
            return 0;
        }
        
        public final void setPages(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.CompanyCanJoinEntity.DataBean.RecordsBean> getRecords() {
            return null;
        }
        
        public final void setRecords(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.CompanyCanJoinEntity.DataBean.RecordsBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<?> getOrders() {
            return null;
        }
        
        public final void setOrders(@org.jetbrains.annotations.Nullable()
        java.util.List<?> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b=\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020-J\u000e\u0010m\u001a\u00020k2\u0006\u0010n\u001a\u00020-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011R\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R\u001c\u00105\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001c\u0010;\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u0010\u0019R\u001e\u0010>\u001a\u00020-2\u0006\u0010=\u001a\u00020-@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u001e\u0010?\u001a\u00020-2\u0006\u0010=\u001a\u00020-@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010/R\u001c\u0010@\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0017\"\u0004\bB\u0010\u0019R\u001c\u0010C\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\bR\u001c\u0010F\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\bR\u001c\u0010I\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0017\"\u0004\bK\u0010\u0019R\u001c\u0010L\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR\u001c\u0010O\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0017\"\u0004\bQ\u0010\u0019R\u001c\u0010R\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0006\"\u0004\bT\u0010\bR\u001c\u0010U\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0006\"\u0004\bW\u0010\bR\u001c\u0010X\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0006\"\u0004\bZ\u0010\bR\u001c\u0010[\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0006\"\u0004\b]\u0010\bR\u001c\u0010^\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0006\"\u0004\b`\u0010\bR\u001c\u0010a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0017\"\u0004\bc\u0010\u0019R\u001c\u0010d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0006\"\u0004\bf\u0010\bR\u001c\u0010g\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0006\"\u0004\bi\u0010\b\u00a8\u0006o"}, d2 = {"Lcom/android/ctgapp/entity/CompanyCanJoinEntity$DataBean$RecordsBean;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "aliPayNo", "getAliPayNo", "setAliPayNo", "allianceType", "", "getAllianceType", "()I", "setAllianceType", "(I)V", "city", "getCity", "setCity", "code", "getCode", "()Ljava/lang/Object;", "setCode", "(Ljava/lang/Object;)V", "companySource", "getCompanySource", "setCompanySource", "createTime", "getCreateTime", "setCreateTime", "createUserid", "getCreateUserid", "setCreateUserid", "district", "getDistrict", "setDistrict", "email", "getEmail", "setEmail", "employeeScale", "getEmployeeScale", "setEmployeeScale", "hasApply", "", "getHasApply", "()Z", "setHasApply", "(Z)V", "id", "getId", "setId", "industry", "getIndustry", "setIndustry", "invitationCode", "getInvitationCode", "setInvitationCode", "isAttestation", "setAttestation", "<set-?>", "isIsDeleted", "isIsFinanceIndependent", "latitude", "getLatitude", "setLatitude", "legalman", "getLegalman", "setLegalman", "logo", "getLogo", "setLogo", "longitude", "getLongitude", "setLongitude", "orgname", "getOrgname", "setOrgname", "parentId", "getParentId", "setParentId", "phone", "getPhone", "setPhone", "province", "getProvince", "setProvince", "remark", "getRemark", "setRemark", "shortName", "getShortName", "setShortName", "updateTime", "getUpdateTime", "setUpdateTime", "weChatNo", "getWeChatNo", "setWeChatNo", "websiteUrl", "getWebsiteUrl", "setWebsiteUrl", "wechat", "getWechat", "setWechat", "setIsDeleted", "", "isDeleted", "setIsFinanceIndependent", "isFinanceIndependent", "app_hqpDebug"})
        public static final class RecordsBean {
            
            /**
             * id : 2222
             * orgname : 小薛修理厂
             * legalman : 汪步东
             * parentId : null
             * shortName : 畅运
             * industry : REPAIRSHOP
             * phone : 13312345678
             * province : 江苏省
             * city : 无锡市
             * district : 梁溪区
             * address : 广丰路101号
             * invitationCode : 384170261
             * email : 156566565@qq.com
             * wechat : 2651
             * logo : fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg
             * websiteUrl : www.hqp.com
             * isAttestation : null
             * remark : 我的公司非常哇塞 突突突突突突饿的
             * longitude : null
             * latitude : null
             * employeeScale : 3
             * allianceType : 0
             * isFinanceIndependent : true
             * createTime : 2019-07-17T15:52:55
             * createUserid : 21
             * updateTime : 2020-12-19T16:57:21
             * isDeleted : false
             * code : null
             * aliPayNo : 202010BB3d72b65a56414bb4b855a3045c1afB13
             * weChatNo : null
             * companySource : null
             */
            private int id = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orgname;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String legalman;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object parentId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String shortName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String industry;
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
            private java.lang.String invitationCode;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String email;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String wechat;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String logo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String websiteUrl;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object isAttestation;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String remark;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object longitude;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object latitude;
            private int employeeScale = 0;
            private int allianceType = 0;
            private boolean isIsFinanceIndependent = false;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String createTime;
            private int createUserid = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String updateTime;
            private boolean isIsDeleted = false;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object code;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String aliPayNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object weChatNo;
            private boolean hasApply = false;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object companySource;
            
            public RecordsBean() {
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
            public final java.lang.String getLegalman() {
                return null;
            }
            
            public final void setLegalman(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getParentId() {
                return null;
            }
            
            public final void setParentId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getShortName() {
                return null;
            }
            
            public final void setShortName(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getInvitationCode() {
                return null;
            }
            
            public final void setInvitationCode(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getEmail() {
                return null;
            }
            
            public final void setEmail(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getWechat() {
                return null;
            }
            
            public final void setWechat(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLogo() {
                return null;
            }
            
            public final void setLogo(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getWebsiteUrl() {
                return null;
            }
            
            public final void setWebsiteUrl(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object isAttestation() {
                return null;
            }
            
            public final void setAttestation(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
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
            
            public final int getAllianceType() {
                return 0;
            }
            
            public final void setAllianceType(int p0) {
            }
            
            public final boolean isIsFinanceIndependent() {
                return false;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCreateTime() {
                return null;
            }
            
            public final void setCreateTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final int getCreateUserid() {
                return 0;
            }
            
            public final void setCreateUserid(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getUpdateTime() {
                return null;
            }
            
            public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final boolean isIsDeleted() {
                return false;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCode() {
                return null;
            }
            
            public final void setCode(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAliPayNo() {
                return null;
            }
            
            public final void setAliPayNo(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getWeChatNo() {
                return null;
            }
            
            public final void setWeChatNo(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final boolean getHasApply() {
                return false;
            }
            
            public final void setHasApply(boolean p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCompanySource() {
                return null;
            }
            
            public final void setCompanySource(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final void setIsFinanceIndependent(boolean isFinanceIndependent) {
            }
            
            public final void setIsDeleted(boolean isDeleted) {
            }
        }
    }
}