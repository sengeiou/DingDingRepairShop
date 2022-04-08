package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/LinkmanEntity;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/LinkmanEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpRelease"})
public final class LinkmanEntity {
    
    /**
     * status : 0
     * msg : null
     * data : [{"id":1,"companyId":2222,"userId":1413,"linkmanName":"一号子客服","linkmanTel":"13621161596","createTime":null,"updateTime":null},{"id":2,"companyId":2222,"userId":1414,"linkmanName":"送送","linkmanTel":"19900000001","createTime":null,"updateTime":null},{"id":3,"companyId":2222,"userId":1415,"linkmanName":"张三","linkmanTel":"13721141577","createTime":null,"updateTime":null},{"id":4,"companyId":2222,"userId":1416,"linkmanName":null,"linkmanTel":"18206197788","createTime":null,"updateTime":null},{"id":5,"companyId":2222,"userId":1417,"linkmanName":"李项","linkmanTel":"13621141602","createTime":null,"updateTime":null},{"id":6,"companyId":2222,"userId":1418,"linkmanName":"娟儿","linkmanTel":"19912346777","createTime":null,"updateTime":null},{"id":7,"companyId":2222,"userId":1420,"linkmanName":"徐","linkmanTel":"18206195678","createTime":null,"updateTime":null},{"id":8,"companyId":2222,"userId":1421,"linkmanName":null,"linkmanTel":"17712345678","createTime":null,"updateTime":null},{"id":9,"companyId":2222,"userId":1425,"linkmanName":"abc","linkmanTel":"15100000001","createTime":null,"updateTime":null},{"id":10,"companyId":2222,"userId":1426,"linkmanName":"夏","linkmanTel":"18206669999","createTime":null,"updateTime":null},{"id":11,"companyId":2222,"userId":1427,"linkmanName":"中华","linkmanTel":"15612345678","createTime":null,"updateTime":null},{"id":12,"companyId":2222,"userId":1429,"linkmanName":"王二","linkmanTel":"13621171596","createTime":null,"updateTime":null},{"id":13,"companyId":2222,"userId":1430,"linkmanName":"收车业务员","linkmanTel":"13621181596","createTime":null,"updateTime":null},{"id":14,"companyId":2222,"userId":1432,"linkmanName":"多角色","linkmanTel":"15966668888","createTime":null,"updateTime":null},{"id":15,"companyId":2222,"userId":1435,"linkmanName":"花枝乱颤","linkmanTel":"13333333333","createTime":null,"updateTime":null},{"id":16,"companyId":2222,"userId":1436,"linkmanName":"huangfangjian","linkmanTel":"13584188391","createTime":null,"updateTime":null},{"id":17,"companyId":2222,"userId":1437,"linkmanName":"李四","linkmanTel":"13584188555","createTime":null,"updateTime":null},{"id":18,"companyId":2222,"userId":1438,"linkmanName":"赵六","linkmanTel":"13584188666","createTime":null,"updateTime":null},{"id":19,"companyId":2222,"userId":1439,"linkmanName":"薛才","linkmanTel":"17701546493","createTime":null,"updateTime":null},{"id":20,"companyId":2222,"userId":1440,"linkmanName":null,"linkmanTel":"18200000009","createTime":null,"updateTime":null},{"id":21,"companyId":2222,"userId":1441,"linkmanName":null,"linkmanTel":"18200000088","createTime":null,"updateTime":null},{"id":22,"companyId":2222,"userId":1442,"linkmanName":"小猪","linkmanTel":"18802052580","createTime":null,"updateTime":null},{"id":23,"companyId":2222,"userId":1443,"linkmanName":null,"linkmanTel":"18200000077","createTime":null,"updateTime":null},{"id":24,"companyId":2222,"userId":1444,"linkmanName":null,"linkmanTel":"18200000099","createTime":null,"updateTime":null},{"id":25,"companyId":2222,"userId":1445,"linkmanName":null,"linkmanTel":"12222222222","createTime":null,"updateTime":null},{"id":26,"companyId":2222,"userId":1412,"linkmanName":null,"linkmanTel":null,"createTime":null,"updateTime":null}]
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.LinkmanEntity.DataBean> data;
    
    public LinkmanEntity() {
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
    public final java.util.List<com.android.ctgapp.entity.LinkmanEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.LinkmanEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001c\u0010&\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR\u001a\u0010)\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\b\u00a8\u0006,"}, d2 = {"Lcom/android/ctgapp/entity/LinkmanEntity$DataBean;", "", "()V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "createTime", "getCreateTime", "()Ljava/lang/Object;", "setCreateTime", "(Ljava/lang/Object;)V", "editModel", "", "getEditModel", "()Z", "setEditModel", "(Z)V", "id", "getId", "setId", "imageUrl", "", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "linkmanName", "getLinkmanName", "setLinkmanName", "linkmanRemark", "getLinkmanRemark", "setLinkmanRemark", "linkmanTel", "getLinkmanTel", "setLinkmanTel", "updateTime", "getUpdateTime", "setUpdateTime", "userId", "getUserId", "setUserId", "app_hqpRelease"})
    public static final class DataBean {
        
        /**
         * id : 1
         * companyId : 2222
         * userId : 1413
         * linkmanName : 一号子客服
         * linkmanTel : 13621161596
         * createTime : null
         * updateTime : null
         */
        private int id = 0;
        private int companyId = 0;
        private int userId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String linkmanName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String linkmanTel;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String imageUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String linkmanRemark;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object updateTime;
        private boolean editModel = false;
        
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
        
        public final int getUserId() {
            return 0;
        }
        
        public final void setUserId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLinkmanName() {
            return null;
        }
        
        public final void setLinkmanName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLinkmanTel() {
            return null;
        }
        
        public final void setLinkmanTel(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageUrl() {
            return null;
        }
        
        public final void setImageUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLinkmanRemark() {
            return null;
        }
        
        public final void setLinkmanRemark(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCreateTime() {
            return null;
        }
        
        public final void setCreateTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getUpdateTime() {
            return null;
        }
        
        public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final boolean getEditModel() {
            return false;
        }
        
        public final void setEditModel(boolean p0) {
        }
    }
}