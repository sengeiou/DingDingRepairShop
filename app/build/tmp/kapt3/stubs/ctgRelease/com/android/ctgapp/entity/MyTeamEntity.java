package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/entity/MyTeamEntity;", "Ljava/io/Serializable;", "()V", "data", "", "Lcom/android/ctgapp/entity/MyTeamEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "msg", "", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class MyTeamEntity implements java.io.Serializable {
    
    /**
     * status : 0
     * msg : null
     * data : [{"userId":null,"realName":"吴家宝","telephone":"18755180000","departmentName":"开发部","imageUrl":"03a7047f-fc33-47eb-814f-31043c78d478.png","status":1},{"userId":null,"realName":"薛晨","telephone":"15906195614","departmentName":"开发部","imageUrl":"03a7047f-fc33-47eb-814f-31043c78d478.png","status":1}]
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.MyTeamEntity.DataBean> data;
    
    public MyTeamEntity() {
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
    public final java.util.List<com.android.ctgapp.entity.MyTeamEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.MyTeamEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001a\u0010+\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u001c\u0010.\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000f\u00a8\u00061"}, d2 = {"Lcom/android/ctgapp/entity/MyTeamEntity$DataBean;", "Ljava/io/Serializable;", "()V", "departmentId", "", "getDepartmentId", "()Ljava/lang/Integer;", "setDepartmentId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "departmentName", "", "getDepartmentName", "()Ljava/lang/String;", "setDepartmentName", "(Ljava/lang/String;)V", "imageUrl", "getImageUrl", "setImageUrl", "isCompanyAdmin", "", "()Z", "setCompanyAdmin", "(Z)V", "isCompanyCreator", "setCompanyCreator", "labelName", "getLabelName", "setLabelName", "positionLabelId", "getPositionLabelId", "()I", "setPositionLabelId", "(I)V", "realName", "getRealName", "setRealName", "status", "getStatus", "setStatus", "telephone", "getTelephone", "setTelephone", "userId", "getUserId", "setUserId", "userNo", "getUserNo", "setUserNo", "app_ctgRelease"})
    public static final class DataBean implements java.io.Serializable {
        
        /**
         * userId : null
         * realName : 吴家宝
         * telephone : 18755180000
         * departmentName : 开发部
         * imageUrl : 03a7047f-fc33-47eb-814f-31043c78d478.png
         * status : 1
         */
        private int userId = -1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String realName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String labelName;
        private int positionLabelId = -1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String telephone;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String departmentName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer departmentId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String imageUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String userNo;
        private int status = 0;
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
        public final java.lang.String getRealName() {
            return null;
        }
        
        public final void setRealName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLabelName() {
            return null;
        }
        
        public final void setLabelName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getPositionLabelId() {
            return 0;
        }
        
        public final void setPositionLabelId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTelephone() {
            return null;
        }
        
        public final void setTelephone(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDepartmentName() {
            return null;
        }
        
        public final void setDepartmentName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getDepartmentId() {
            return null;
        }
        
        public final void setDepartmentId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageUrl() {
            return null;
        }
        
        public final void setImageUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUserNo() {
            return null;
        }
        
        public final void setUserNo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getStatus() {
            return 0;
        }
        
        public final void setStatus(int p0) {
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