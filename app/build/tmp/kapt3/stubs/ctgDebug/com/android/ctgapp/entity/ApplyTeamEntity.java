package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/ApplyTeamEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/ApplyTeamEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/ApplyTeamEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/ApplyTeamEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class ApplyTeamEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"id":89,"applyUserId":1544,"companyId":65551,"msg":"测试4申请加入您的公司。","applyTime":"2020-12-30 15:19:59","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"测试4","applyUserTelephone":"18206195151","applyUserImageUrl":null},{"id":88,"applyUserId":1540,"companyId":65551,"msg":"123申请加入您的公司。","applyTime":"2020-12-25 12:53:23","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"123","applyUserTelephone":"89898989898","applyUserImageUrl":null},{"id":87,"applyUserId":1539,"companyId":65551,"msg":"123申请加入您的公司。","applyTime":"2020-12-25 10:23:05","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"123","applyUserTelephone":"12121212121","applyUserImageUrl":null},{"id":86,"applyUserId":1533,"companyId":65551,"msg":"注册测试1申请加入您的公司。","applyTime":"2020-12-24 15:23:47","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"注册测试1","applyUserTelephone":"18206191236","applyUserImageUrl":null},{"id":83,"applyUserId":1309,"companyId":65551,"msg":" 112123申请加入您的公司。","applyTime":"2020-12-23 17:25:33","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":" 112123","applyUserTelephone":"18312345678","applyUserImageUrl":"998de99d-7059-45f8-8c7e-4b36b1f7ebd6.png"},{"id":82,"applyUserId":1457,"companyId":65551,"msg":"啾啾申请加入您的公司。","applyTime":"2020-12-23 16:20:33","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"啾啾","applyUserTelephone":"18206198888","applyUserImageUrl":"dcdd2aa6-e07d-4af0-a195-d933b42a37db.png"}],"total":6,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.ApplyTeamEntity.DataBean data;
    
    public ApplyTeamEntity() {
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
    public final com.android.ctgapp.entity.ApplyTeamEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.ApplyTeamEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R \u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\"\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001a\u0010\'\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\u001a\u0010*\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\r\u00a8\u0006."}, d2 = {"Lcom/android/ctgapp/entity/ApplyTeamEntity$DataBean;", "", "()V", "countId", "getCountId", "()Ljava/lang/Object;", "setCountId", "(Ljava/lang/Object;)V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "isHitCount", "", "()Z", "setHitCount", "(Z)V", "isOptimizeCountSql", "setOptimizeCountSql", "isSearchCount", "setSearchCount", "maxLimit", "getMaxLimit", "setMaxLimit", "orders", "", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "pages", "getPages", "setPages", "records", "Lcom/android/ctgapp/entity/ApplyTeamEntity$DataBean$RecordsBean;", "getRecords", "setRecords", "size", "getSize", "setSize", "total", "getTotal", "setTotal", "RecordsBean", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * records : [{"id":89,"applyUserId":1544,"companyId":65551,"msg":"测试4申请加入您的公司。","applyTime":"2020-12-30 15:19:59","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"测试4","applyUserTelephone":"18206195151","applyUserImageUrl":null},{"id":88,"applyUserId":1540,"companyId":65551,"msg":"123申请加入您的公司。","applyTime":"2020-12-25 12:53:23","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"123","applyUserTelephone":"89898989898","applyUserImageUrl":null},{"id":87,"applyUserId":1539,"companyId":65551,"msg":"123申请加入您的公司。","applyTime":"2020-12-25 10:23:05","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"123","applyUserTelephone":"12121212121","applyUserImageUrl":null},{"id":86,"applyUserId":1533,"companyId":65551,"msg":"注册测试1申请加入您的公司。","applyTime":"2020-12-24 15:23:47","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"注册测试1","applyUserTelephone":"18206191236","applyUserImageUrl":null},{"id":83,"applyUserId":1309,"companyId":65551,"msg":" 112123申请加入您的公司。","applyTime":"2020-12-23 17:25:33","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":" 112123","applyUserTelephone":"18312345678","applyUserImageUrl":"998de99d-7059-45f8-8c7e-4b36b1f7ebd6.png"},{"id":82,"applyUserId":1457,"companyId":65551,"msg":"啾啾申请加入您的公司。","applyTime":"2020-12-23 16:20:33","auditStatus":0,"auditorId":null,"updateTime":null,"orgname":"小黄维修","applyUserName":"啾啾","applyUserTelephone":"18206198888","applyUserImageUrl":"dcdd2aa6-e07d-4af0-a195-d933b42a37db.png"}]
         * total : 6
         * size : 20
         * current : 1
         * orders : []
         * optimizeCountSql : true
         * hitCount : false
         * countId : null
         * maxLimit : null
         * searchCount : true
         * pages : 1
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
        private java.util.List<com.android.ctgapp.entity.ApplyTeamEntity.DataBean.RecordsBean> records;
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
        public final java.util.List<com.android.ctgapp.entity.ApplyTeamEntity.DataBean.RecordsBean> getRecords() {
            return null;
        }
        
        public final void setRecords(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.ApplyTeamEntity.DataBean.RecordsBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<?> getOrders() {
            return null;
        }
        
        public final void setOrders(@org.jetbrains.annotations.Nullable()
        java.util.List<?> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b%\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010\u0013\u00a8\u0006/"}, d2 = {"Lcom/android/ctgapp/entity/ApplyTeamEntity$DataBean$RecordsBean;", "", "()V", "applyTime", "", "getApplyTime", "()Ljava/lang/String;", "setApplyTime", "(Ljava/lang/String;)V", "applyUserId", "", "getApplyUserId", "()I", "setApplyUserId", "(I)V", "applyUserImageUrl", "getApplyUserImageUrl", "()Ljava/lang/Object;", "setApplyUserImageUrl", "(Ljava/lang/Object;)V", "applyUserName", "getApplyUserName", "setApplyUserName", "applyUserTelephone", "getApplyUserTelephone", "setApplyUserTelephone", "auditStatus", "getAuditStatus", "setAuditStatus", "auditorId", "getAuditorId", "setAuditorId", "companyId", "getCompanyId", "setCompanyId", "id", "getId", "setId", "msg", "getMsg", "setMsg", "orgname", "getOrgname", "setOrgname", "updateTime", "getUpdateTime", "setUpdateTime", "app_ctgDebug"})
        public static final class RecordsBean {
            
            /**
             * id : 89
             * applyUserId : 1544
             * companyId : 65551
             * msg : 测试4申请加入您的公司。
             * applyTime : 2020-12-30 15:19:59
             * auditStatus : 0
             * auditorId : null
             * updateTime : null
             * orgname : 小黄维修
             * applyUserName : 测试4
             * applyUserTelephone : 18206195151
             * applyUserImageUrl : null
             */
            private int id = 0;
            private int applyUserId = 0;
            private int companyId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String msg;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String applyTime;
            private int auditStatus = -1;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object auditorId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object updateTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orgname;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String applyUserName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String applyUserTelephone;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object applyUserImageUrl;
            
            public RecordsBean() {
                super();
            }
            
            public final int getId() {
                return 0;
            }
            
            public final void setId(int p0) {
            }
            
            public final int getApplyUserId() {
                return 0;
            }
            
            public final void setApplyUserId(int p0) {
            }
            
            public final int getCompanyId() {
                return 0;
            }
            
            public final void setCompanyId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getMsg() {
                return null;
            }
            
            public final void setMsg(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getApplyTime() {
                return null;
            }
            
            public final void setApplyTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final int getAuditStatus() {
                return 0;
            }
            
            public final void setAuditStatus(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAuditorId() {
                return null;
            }
            
            public final void setAuditorId(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getOrgname() {
                return null;
            }
            
            public final void setOrgname(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getApplyUserName() {
                return null;
            }
            
            public final void setApplyUserName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getApplyUserTelephone() {
                return null;
            }
            
            public final void setApplyUserTelephone(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getApplyUserImageUrl() {
                return null;
            }
            
            public final void setApplyUserImageUrl(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
        }
    }
}