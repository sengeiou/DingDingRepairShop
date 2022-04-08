package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/home/NoticeEntityV2;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/home/NoticeEntityV2$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class NoticeEntityV2 {
    
    /**
     * status : 0
     * msg : null
     * data : [{"id":17,"companyId":12345,"noticeTitle":"我再测试一下","noticeText":"我再测试一下","createPersonId":1,"createTime":"2021-04-09 09:46:35","isShow":true,"updateTime":null,"industry":"AGENCY","auditStatus":1,"opinion":"可以"}]
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.NoticeEntityV2.DataBean> data;
    
    public NoticeEntityV2() {
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
    public final java.util.List<com.android.ctgapp.entity.home.NoticeEntityV2.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.NoticeEntityV2.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001c\u0010%\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b\'\u0010\u0014R\u001c\u0010(\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00060"}, d2 = {"Lcom/android/ctgapp/entity/home/NoticeEntityV2$DataBean;", "", "()V", "auditStatus", "", "getAuditStatus", "()I", "setAuditStatus", "(I)V", "companyId", "getCompanyId", "setCompanyId", "createPersonId", "getCreatePersonId", "setCreatePersonId", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "id", "getId", "setId", "industry", "getIndustry", "setIndustry", "<set-?>", "", "isIsShow", "()Z", "noticeText", "getNoticeText", "setNoticeText", "noticeTitle", "getNoticeTitle", "setNoticeTitle", "opinion", "getOpinion", "setOpinion", "updateTime", "getUpdateTime", "()Ljava/lang/Object;", "setUpdateTime", "(Ljava/lang/Object;)V", "setIsShow", "", "isShow", "app_ctgRelease"})
    public static final class DataBean {
        
        /**
         * id : 17
         * companyId : 12345
         * noticeTitle : 我再测试一下
         * noticeText : 我再测试一下
         * createPersonId : 1
         * createTime : 2021-04-09 09:46:35
         * isShow : true
         * updateTime : null
         * industry : AGENCY
         * auditStatus : 1
         * opinion : 可以
         */
        private int id = 0;
        private int companyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String noticeTitle;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String noticeText;
        private int createPersonId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String createTime;
        private boolean isIsShow = false;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object updateTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String industry;
        private int auditStatus = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String opinion;
        
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
        public final java.lang.String getNoticeTitle() {
            return null;
        }
        
        public final void setNoticeTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getNoticeText() {
            return null;
        }
        
        public final void setNoticeText(@org.jetbrains.annotations.Nullable()
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
        
        public final boolean isIsShow() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getUpdateTime() {
            return null;
        }
        
        public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIndustry() {
            return null;
        }
        
        public final void setIndustry(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getAuditStatus() {
            return 0;
        }
        
        public final void setAuditStatus(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOpinion() {
            return null;
        }
        
        public final void setOpinion(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final void setIsShow(boolean isShow) {
        }
    }
}