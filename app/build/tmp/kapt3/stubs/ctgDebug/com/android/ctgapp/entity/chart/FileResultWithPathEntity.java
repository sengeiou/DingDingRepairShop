package com.android.ctgapp.entity.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/chart/FileResultWithPathEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/chart/FileResultWithPathEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/chart/FileResultWithPathEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/chart/FileResultWithPathEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class FileResultWithPathEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"filename":"magazine-unlock-05-2.3.7012-EEBDFB1175C5C5B1D0099E8641504969.jpeg","a":"/storage/emulated/0/MagazineUnlock/magazine-unlock-05-2.3.7012-EEBDFB1175C5C5B1D0099E8641504969.jpg","url":"90e17e61-6161-4c4e-bc83-4863802cc1fa.jpeg"}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.chart.FileResultWithPathEntity.DataBean data;
    
    public FileResultWithPathEntity() {
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
    public final com.android.ctgapp.entity.chart.FileResultWithPathEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.chart.FileResultWithPathEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/android/ctgapp/entity/chart/FileResultWithPathEntity$DataBean;", "", "()V", "filename", "", "getFilename", "()Ljava/lang/String;", "setFilename", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * filename : magazine-unlock-05-2.3.7012-EEBDFB1175C5C5B1D0099E8641504969.jpeg
         * url : 90e17e61-6161-4c4e-bc83-4863802cc1fa.jpeg
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String filename;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String url;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFilename() {
            return null;
        }
        
        public final void setFilename(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final void setUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
    }
}