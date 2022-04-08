package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/ClientEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/ClientEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/ClientEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/ClientEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class ClientEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"companyId":12345,"orgname":"无锡畅通汽配公司","phone":"051082756645","industry":"经销商","logo":"672bce99-ad6f-41c3-830e-054f3dae68eb.gif","responsiblePerson":null}],"total":1,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.ClientEntity.DataBean data;
    
    public ClientEntity() {
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
    public final com.android.ctgapp.entity.ClientEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.ClientEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R \u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\"\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001a\u0010\'\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\u001a\u0010*\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\r\u00a8\u0006."}, d2 = {"Lcom/android/ctgapp/entity/ClientEntity$DataBean;", "", "()V", "countId", "getCountId", "()Ljava/lang/Object;", "setCountId", "(Ljava/lang/Object;)V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "isHitCount", "", "()Z", "setHitCount", "(Z)V", "isOptimizeCountSql", "setOptimizeCountSql", "isSearchCount", "setSearchCount", "maxLimit", "getMaxLimit", "setMaxLimit", "orders", "", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "pages", "getPages", "setPages", "records", "Lcom/android/ctgapp/entity/ClientEntity$DataBean$RecordsBean;", "getRecords", "setRecords", "size", "getSize", "setSize", "total", "getTotal", "setTotal", "RecordsBean", "app_ctgRelease"})
    public static final class DataBean {
        
        /**
         * records : [{"companyId":12345,"orgname":"无锡畅通汽配公司","phone":"051082756645","industry":"经销商","logo":"672bce99-ad6f-41c3-830e-054f3dae68eb.gif","responsiblePerson":null}]
         * total : 1
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
        private java.util.List<com.android.ctgapp.entity.ClientEntity.DataBean.RecordsBean> records;
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
        public final java.util.List<com.android.ctgapp.entity.ClientEntity.DataBean.RecordsBean> getRecords() {
            return null;
        }
        
        public final void setRecords(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.ClientEntity.DataBean.RecordsBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<?> getOrders() {
            return null;
        }
        
        public final void setOrders(@org.jetbrains.annotations.Nullable()
        java.util.List<?> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/android/ctgapp/entity/ClientEntity$DataBean$RecordsBean;", "", "()V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "createUser", "", "getCreateUser", "()Ljava/lang/String;", "setCreateUser", "(Ljava/lang/String;)V", "industry", "getIndustry", "setIndustry", "logo", "getLogo", "setLogo", "orgname", "getOrgname", "setOrgname", "phone", "getPhone", "setPhone", "responsiblePerson", "getResponsiblePerson", "setResponsiblePerson", "app_ctgRelease"})
        public static final class RecordsBean {
            
            /**
             * companyId : 12345
             * orgname : 无锡畅通汽配公司
             * phone : 051082756645
             * industry : 经销商
             * logo : 672bce99-ad6f-41c3-830e-054f3dae68eb.gif
             * responsiblePerson : null
             */
            private int companyId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orgname;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String createUser;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String phone;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String industry;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String logo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String responsiblePerson;
            
            public RecordsBean() {
                super();
            }
            
            public final int getCompanyId() {
                return 0;
            }
            
            public final void setCompanyId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOrgname() {
                return null;
            }
            
            public final void setOrgname(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCreateUser() {
                return null;
            }
            
            public final void setCreateUser(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getIndustry() {
                return null;
            }
            
            public final void setIndustry(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getResponsiblePerson() {
                return null;
            }
            
            public final void setResponsiblePerson(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
    }
}