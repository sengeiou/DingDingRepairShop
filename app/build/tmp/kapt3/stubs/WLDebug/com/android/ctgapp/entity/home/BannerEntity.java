package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/home/BannerEntity;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/home/BannerEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_WLDebug"})
public final class BannerEntity {
    
    /**
     * status : 0
     * msg : null
     * data : [{"id":1,"companyId":2222,"picUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/acdBannerPic/414d6b054472425ebf8b0340acc6e113.png","picLinkUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/acdBannerPic/414d6b054472425ebf8b0340acc6e113.png","picName":"414d6b054472425ebf8b0340acc6e113.png","createPersonId":672,"createTime":"2020-10-29T14:02:56","updateTime":null}]
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.BannerEntity.DataBean> data;
    
    public BannerEntity() {
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
    public final java.util.List<com.android.ctgapp.entity.home.BannerEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.BannerEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019\u00a8\u0006#"}, d2 = {"Lcom/android/ctgapp/entity/home/BannerEntity$DataBean;", "", "()V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "createPersonId", "getCreatePersonId", "setCreatePersonId", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "id", "getId", "setId", "picLinkUrl", "getPicLinkUrl", "()Ljava/lang/Object;", "setPicLinkUrl", "(Ljava/lang/Object;)V", "picName", "getPicName", "setPicName", "picUrl", "getPicUrl", "setPicUrl", "updateTime", "getUpdateTime", "setUpdateTime", "app_WLDebug"})
    public static final class DataBean {
        
        /**
         * id : 1
         * companyId : 2222
         * picUrl : https://ctgdev.oss-cn-shanghai.aliyuncs.com/acdBannerPic/414d6b054472425ebf8b0340acc6e113.png
         * picLinkUrl : https://ctgdev.oss-cn-shanghai.aliyuncs.com/acdBannerPic/414d6b054472425ebf8b0340acc6e113.png
         * picName : 414d6b054472425ebf8b0340acc6e113.png
         * createPersonId : 672
         * createTime : 2020-10-29T14:02:56
         * updateTime : null
         */
        private int id = 0;
        private int companyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object picUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object picLinkUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String picName;
        private int createPersonId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object updateTime;
        
        public DataBean() {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        public final int getCompanyId() {
            return 0;
        }
        
        public final void setCompanyId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPicUrl() {
            return null;
        }
        
        public final void setPicUrl(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPicLinkUrl() {
            return null;
        }
        
        public final void setPicLinkUrl(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPicName() {
            return null;
        }
        
        public final void setPicName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getCreatePersonId() {
            return 0;
        }
        
        public final void setCreatePersonId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreateTime() {
            return null;
        }
        
        public final void setCreateTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getUpdateTime() {
            return null;
        }
        
        public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
    }
}