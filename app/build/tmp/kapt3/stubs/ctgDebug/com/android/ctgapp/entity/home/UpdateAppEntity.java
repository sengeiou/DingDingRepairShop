package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/home/UpdateAppEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/home/UpdateAppEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/home/UpdateAppEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/home/UpdateAppEntity$DataBean;)V", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class UpdateAppEntity {
    private int status = -1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String msg = "";
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.home.UpdateAppEntity.DataBean data;
    
    public UpdateAppEntity() {
        super();
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.entity.home.UpdateAppEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.home.UpdateAppEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/android/ctgapp/entity/home/UpdateAppEntity$DataBean;", "", "()V", "appUrl", "", "getAppUrl", "()Ljava/lang/String;", "setAppUrl", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "resultType", "", "getResultType", "()I", "setResultType", "(I)V", "app_ctgDebug"})
    public static final class DataBean {
        private int resultType = -1;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String appUrl = "";
        @org.jetbrains.annotations.NotNull()
        private java.lang.String message = "";
        
        public DataBean() {
            super();
        }
        
        public final int getResultType() {
            return 0;
        }
        
        public final void setResultType(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAppUrl() {
            return null;
        }
        
        public final void setAppUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public final void setMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}