package com.android.ctgapp.entity.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/chart/SearchTeamEntity;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/chart/SearchTeamEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_WLDebug"})
public final class SearchTeamEntity {
    
    /**
     * status : 0
     * msg : null
     * data : [{"companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8","users":[{"id":1260,"realName":"朱佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"18552026537","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"1ab211ee-677e-4fae-9a3a-aab8c2303c51.jpeg"},{"id":1365,"realName":"朱佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"13921131566","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"@_@.jpg"},{"id":1382,"realName":"朱佳佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"13821131593","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"@_@.jpg"}]}]
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.chart.SearchTeamEntity.DataBean> data;
    
    public SearchTeamEntity() {
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
    public final java.util.List<com.android.ctgapp.entity.chart.SearchTeamEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.chart.SearchTeamEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/chart/SearchTeamEntity$DataBean;", "", "()V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "logo", "", "getLogo", "()Ljava/lang/String;", "setLogo", "(Ljava/lang/String;)V", "orgname", "getOrgname", "setOrgname", "users", "", "Lcom/android/ctgapp/entity/chart/SearchTeamEntity$DataBean$UsersBean;", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "UsersBean", "app_WLDebug"})
    public static final class DataBean {
        
        /**
         * companyId : 888897686
         * orgname : 郑州报废机动车回收中心
         * logo : fc8ef8a8
         * users : [{"id":1260,"realName":"朱佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"18552026537","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"1ab211ee-677e-4fae-9a3a-aab8c2303c51.jpeg"},{"id":1365,"realName":"朱佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"13921131566","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"@_@.jpg"},{"id":1382,"realName":"朱佳佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"13821131593","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"@_@.jpg"}]
         */
        private int companyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orgname;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String logo;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.chart.SearchTeamEntity.DataBean.UsersBean> users;
        
        public DataBean() {
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
        public final java.lang.String getLogo() {
            return null;
        }
        
        public final void setLogo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.chart.SearchTeamEntity.DataBean.UsersBean> getUsers() {
            return null;
        }
        
        public final void setUsers(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.chart.SearchTeamEntity.DataBean.UsersBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\b\u00a8\u0006)"}, d2 = {"Lcom/android/ctgapp/entity/chart/SearchTeamEntity$DataBean$UsersBean;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "departmentName", "getDepartmentName", "()Ljava/lang/Object;", "setDepartmentName", "(Ljava/lang/Object;)V", "id", "getId", "setId", "imageUrl", "getImageUrl", "setImageUrl", "industry", "getIndustry", "setIndustry", "logo", "getLogo", "setLogo", "orgname", "getOrgname", "setOrgname", "realName", "getRealName", "setRealName", "telephone", "getTelephone", "setTelephone", "app_WLDebug"})
        public static final class UsersBean {
            
            /**
             * id : 1260
             * realName : 朱佳
             * companyId : 888897686
             * orgname : 郑州报废机动车回收中心
             * logo : fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg
             * telephone : 18552026537
             * address : 河南省郑州市中原区河南郑州
             * departmentName : null
             * industry : null
             * imageUrl : 1ab211ee-677e-4fae-9a3a-aab8c2303c51.jpeg
             */
            private int id = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String realName;
            private int companyId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orgname;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String logo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String telephone;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String address;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object departmentName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object industry;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String imageUrl;
            
            public UsersBean() {
                super();
            }
            
            public final int getId() {
                return 0;
            }
            
            public final void setId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getRealName() {
                return null;
            }
            
            public final void setRealName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
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
            public final java.lang.String getLogo() {
                return null;
            }
            
            public final void setLogo(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTelephone() {
                return null;
            }
            
            public final void setTelephone(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Object getDepartmentName() {
                return null;
            }
            
            public final void setDepartmentName(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getImageUrl() {
                return null;
            }
            
            public final void setImageUrl(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
    }
}