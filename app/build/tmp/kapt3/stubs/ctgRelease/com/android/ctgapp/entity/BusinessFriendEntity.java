package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/entity/BusinessFriendEntity;", "Ljava/io/Serializable;", "()V", "data", "", "Lcom/android/ctgapp/entity/BusinessFriendEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class BusinessFriendEntity implements java.io.Serializable {
    
    /**
     * status : 0
     * msg : null
     * data : [{"uid":709,"realName":"风","orgname":"享汽配","companyId":888897021,"imageUrl":null,"telephone":"15189519049","friendRemark":null,"status":1},{"uid":710,"realName":"范冬冬","orgname":"车仕客汽车服务","companyId":888897022,"imageUrl":null,"telephone":"15056149269","friendRemark":"我啊","status":1},{"uid":711,"realName":"彭升平","orgname":"南京新汽业汽配有限公司","companyId":888897024,"imageUrl":null,"telephone":"18297962559","friendRemark":null,"status":1},{"uid":715,"realName":"顾晓妍","orgname":"无锡市君德汽车维修有限公司","companyId":888897028,"imageUrl":null,"telephone":"18915279762","friendRemark":null,"status":1},{"uid":716,"realName":"周海亚","orgname":"神州名车专修","companyId":888897029,"imageUrl":null,"telephone":"15061841310","friendRemark":null,"status":1},{"uid":790,"realName":"小Q","orgname":"小Q制造商","companyId":888897135,"imageUrl":"6b0474d0-84a7-4eb6-86b5-607122f119ea.jpg","telephone":"13771511355","friendRemark":null,"status":1},{"uid":718,"realName":"汤本利","orgname":"浩坤汽修","companyId":888897031,"imageUrl":null,"telephone":"13921398372","friendRemark":null,"status":1},{"uid":719,"realName":"祁德健","orgname":"小祁","companyId":888897032,"imageUrl":null,"telephone":"15050670862","friendRemark":null,"status":1}]
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    private boolean isSuccess = false;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> data;
    
    public BusinessFriendEntity() {
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
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010)\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\b\u00a8\u0006,"}, d2 = {"Lcom/android/ctgapp/entity/BusinessFriendEntity$DataBean;", "Ljava/io/Serializable;", "()V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "friendRemark", "", "getFriendRemark", "()Ljava/lang/Object;", "setFriendRemark", "(Ljava/lang/Object;)V", "imageUrl", "getImageUrl", "setImageUrl", "isOnline", "", "()Z", "setOnline", "(Z)V", "orgname", "", "getOrgname", "()Ljava/lang/String;", "setOrgname", "(Ljava/lang/String;)V", "realName", "getRealName", "setRealName", "selected", "getSelected", "setSelected", "status", "getStatus", "setStatus", "telephone", "getTelephone", "setTelephone", "uid", "getUid", "setUid", "app_ctgRelease"})
    public static final class DataBean implements java.io.Serializable {
        
        /**
         * uid : 709
         * realName : 风
         * orgname : 享汽配
         * companyId : 888897021
         * imageUrl : null
         * telephone : 15189519049
         * friendRemark : null
         * status : 1
         */
        private int uid = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String realName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orgname;
        private int companyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object imageUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String telephone;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object friendRemark;
        private int status = 0;
        private boolean selected = false;
        private boolean isOnline = false;
        
        public DataBean() {
            super();
        }
        
        public final int getUid() {
            return 0;
        }
        
        public final void setUid(int p0) {
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
        
        public final int getCompanyId() {
            return 0;
        }
        
        public final void setCompanyId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getImageUrl() {
            return null;
        }
        
        public final void setImageUrl(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.Object getFriendRemark() {
            return null;
        }
        
        public final void setFriendRemark(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getStatus() {
            return 0;
        }
        
        public final void setStatus(int p0) {
        }
        
        public final boolean getSelected() {
            return false;
        }
        
        public final void setSelected(boolean p0) {
        }
        
        public final boolean isOnline() {
            return false;
        }
        
        public final void setOnline(boolean p0) {
        }
    }
}