package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/home/RegisterEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/home/RegisterEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/home/RegisterEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/home/RegisterEntity$DataBean;)V", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class RegisterEntity {
    
    /**
     * status : 0
     * msg : 账号注册成功
     * data : {"userId":1509,"companyId":null}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.home.RegisterEntity.DataBean data;
    
    public RegisterEntity() {
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
    public final com.android.ctgapp.entity.home.RegisterEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.home.RegisterEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/android/ctgapp/entity/home/RegisterEntity$DataBean;", "", "()V", "companyId", "getCompanyId", "()Ljava/lang/Object;", "setCompanyId", "(Ljava/lang/Object;)V", "userId", "", "getUserId", "()I", "setUserId", "(I)V", "app_ctgRelease"})
    public static final class DataBean {
        
        /**
         * userId : 1509
         * companyId : null
         */
        private int userId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object companyId;
        
        public DataBean() {
            super();
        }
        
        public final int getUserId() {
            return 0;
        }
        
        public final void setUserId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCompanyId() {
            return null;
        }
        
        public final void setCompanyId(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
    }
}