package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/BusinessFriendInfoEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/BusinessFriendInfoEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/BusinessFriendInfoEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/BusinessFriendInfoEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class BusinessFriendInfoEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"groupName":null,"friendRemark":"我啊","userinfo":{"id":710,"realName":"范冬冬","orgname":"车仕客汽车服务","telephone":"15056149269","address":"江苏省无锡市新吴区梅育路63号","departmentName":null,"industry":"修理厂"}}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.BusinessFriendInfoEntity.DataBean data;
    
    public BusinessFriendInfoEntity() {
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
    public final com.android.ctgapp.entity.BusinessFriendInfoEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.BusinessFriendInfoEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/BusinessFriendInfoEntity$DataBean;", "", "()V", "friendRemark", "", "getFriendRemark", "()Ljava/lang/String;", "setFriendRemark", "(Ljava/lang/String;)V", "groupName", "getGroupName", "()Ljava/lang/Object;", "setGroupName", "(Ljava/lang/Object;)V", "userinfo", "Lcom/android/ctgapp/entity/BusinessFriendInfoEntity$DataBean$UserinfoBean;", "getUserinfo", "()Lcom/android/ctgapp/entity/BusinessFriendInfoEntity$DataBean$UserinfoBean;", "setUserinfo", "(Lcom/android/ctgapp/entity/BusinessFriendInfoEntity$DataBean$UserinfoBean;)V", "UserinfoBean", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * groupName : null
         * friendRemark : 我啊
         * userinfo : {"id":710,"realName":"范冬冬","orgname":"车仕客汽车服务","telephone":"15056149269","address":"江苏省无锡市新吴区梅育路63号","departmentName":null,"industry":"修理厂"}
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object groupName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String friendRemark;
        @org.jetbrains.annotations.Nullable()
        private com.android.ctgapp.entity.BusinessFriendInfoEntity.DataBean.UserinfoBean userinfo;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getGroupName() {
            return null;
        }
        
        public final void setGroupName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFriendRemark() {
            return null;
        }
        
        public final void setFriendRemark(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.android.ctgapp.entity.BusinessFriendInfoEntity.DataBean.UserinfoBean getUserinfo() {
            return null;
        }
        
        public final void setUserinfo(@org.jetbrains.annotations.Nullable()
        com.android.ctgapp.entity.BusinessFriendInfoEntity.DataBean.UserinfoBean p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b\u00a8\u0006%"}, d2 = {"Lcom/android/ctgapp/entity/BusinessFriendInfoEntity$DataBean$UserinfoBean;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "departmentName", "getDepartmentName", "()Ljava/lang/Object;", "setDepartmentName", "(Ljava/lang/Object;)V", "id", "", "getId", "()I", "setId", "(I)V", "industry", "getIndustry", "setIndustry", "isAdded", "", "()Z", "setAdded", "(Z)V", "orgname", "getOrgname", "setOrgname", "realName", "getRealName", "setRealName", "telephone", "getTelephone", "setTelephone", "app_ctgDebug"})
        public static final class UserinfoBean {
            
            /**
             * id : 710
             * realName : 范冬冬
             * orgname : 车仕客汽车服务
             * telephone : 15056149269
             * address : 江苏省无锡市新吴区梅育路63号
             * departmentName : null
             * industry : 修理厂
             */
            private int id = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String realName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orgname;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String telephone;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String address;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object departmentName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String industry;
            private boolean isAdded = true;
            
            public UserinfoBean() {
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
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOrgname() {
                return null;
            }
            
            public final void setOrgname(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getIndustry() {
                return null;
            }
            
            public final void setIndustry(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final boolean isAdded() {
                return false;
            }
            
            public final void setAdded(boolean p0) {
            }
        }
    }
}