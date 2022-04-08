package com.android.ctgapp.entity.mine.company;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/entity/mine/company/CompanyAllUserEntity;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/mine/company/CompanyAllUserEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "DataBean", "app_ctgRelease"})
public final class CompanyAllUserEntity {
    
    /**
     * status : 0
     * msg : null
     * data : [{"id":593,"name":"黄方健三号"},{"id":1414,"name":"张三"},{"id":1415,"name":null},{"id":1416,"name":"李项"},{"id":1418,"name":"徐"},{"id":1420,"name":null},{"id":1421,"name":"abc"},{"id":1425,"name":"夏"},{"id":1426,"name":"中华"},{"id":1427,"name":"王二"},{"id":1429,"name":"收车业务员"},{"id":1430,"name":"多角色"},{"id":1432,"name":"花枝乱颤"},{"id":1435,"name":"huangfangjian"},{"id":1436,"name":"李四"},{"id":1437,"name":"赵六"},{"id":1664,"name":"18561988803"},{"id":1670,"name":"花花草草"},{"id":1674,"name":"啦啦啦"},{"id":1675,"name":"小姐姐"}]
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.mine.company.CompanyAllUserEntity.DataBean> data;
    
    public CompanyAllUserEntity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.mine.company.CompanyAllUserEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.mine.company.CompanyAllUserEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/mine/company/CompanyAllUserEntity$DataBean;", "Ljava/io/Serializable;", "()V", "id", "", "getId", "()I", "setId", "(I)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "app_ctgRelease"})
    public static final class DataBean implements java.io.Serializable {
        
        /**
         * id : 593
         * name : 黄方健三号
         */
        private int id = -1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        private boolean select = false;
        
        public DataBean() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean getSelect() {
            return false;
        }
        
        public final void setSelect(boolean p0) {
        }
    }
}