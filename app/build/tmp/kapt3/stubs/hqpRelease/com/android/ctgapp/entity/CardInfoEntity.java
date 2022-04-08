package com.android.ctgapp.entity;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 3/31/21
 * 描述: 名片详情 商友和团队成员页面通用
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/CardInfoEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/CardInfoEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/CardInfoEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/CardInfoEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpRelease"})
public final class CardInfoEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"userName":"项一磊","userId":56,"avatarUrl":"03a7047f-fc33-47eb-814f-31043c78d478.png","companyName":"hfj的联盟啊","companyId":88889571,"industry":"制造商","position":null,"telephone":"13306195736","companyAddress":"上海市市辖区徐汇区创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里","relation":"同事","groupName":null,"groupId":null,"remark":null,"labelName":null,"departmentName":null}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.CardInfoEntity.DataBean data;
    
    public CardInfoEntity() {
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
    public final com.android.ctgapp.entity.CardInfoEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.CardInfoEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b#\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001c\u0010,\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R\u001c\u00105\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001a\u00108\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R\u001c\u0010;\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\b\u00a8\u0006>"}, d2 = {"Lcom/android/ctgapp/entity/CardInfoEntity$DataBean;", "", "()V", "avatarUrl", "", "getAvatarUrl", "()Ljava/lang/String;", "setAvatarUrl", "(Ljava/lang/String;)V", "companyAddress", "getCompanyAddress", "setCompanyAddress", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "companyName", "getCompanyName", "setCompanyName", "departmentName", "getDepartmentName", "()Ljava/lang/Object;", "setDepartmentName", "(Ljava/lang/Object;)V", "doCertified", "", "getDoCertified", "()Z", "setDoCertified", "(Z)V", "groupId", "getGroupId", "setGroupId", "groupName", "getGroupName", "setGroupName", "industry", "getIndustry", "setIndustry", "labelName", "getLabelName", "setLabelName", "position", "getPosition", "setPosition", "relation", "getRelation", "setRelation", "remark", "getRemark", "setRemark", "telephone", "getTelephone", "setTelephone", "userId", "getUserId", "setUserId", "userName", "getUserName", "setUserName", "app_hqpRelease"})
    public static final class DataBean {
        
        /**
         * userName : 项一磊
         * userId : 56
         * avatarUrl : 03a7047f-fc33-47eb-814f-31043c78d478.png
         * companyName : hfj的联盟啊
         * companyId : 88889571
         * industry : 制造商
         * position : null
         * telephone : 13306195736
         * companyAddress : 上海市市辖区徐汇区创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里
         * relation : 同事
         * groupName : null
         * groupId : null
         * remark : null
         * labelName : null
         * departmentName : null
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String userName;
        private int userId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String avatarUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String companyName;
        private int companyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String industry;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object position;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String telephone;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String companyAddress;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String relation;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object groupName;
        private int groupId = -1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object remark;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object labelName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object departmentName;
        private boolean doCertified = false;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUserName() {
            return null;
        }
        
        public final void setUserName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getUserId() {
            return 0;
        }
        
        public final void setUserId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAvatarUrl() {
            return null;
        }
        
        public final void setAvatarUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCompanyName() {
            return null;
        }
        
        public final void setCompanyName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getCompanyId() {
            return 0;
        }
        
        public final void setCompanyId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIndustry() {
            return null;
        }
        
        public final void setIndustry(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPosition() {
            return null;
        }
        
        public final void setPosition(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.String getCompanyAddress() {
            return null;
        }
        
        public final void setCompanyAddress(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRelation() {
            return null;
        }
        
        public final void setRelation(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getGroupName() {
            return null;
        }
        
        public final void setGroupName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getGroupId() {
            return 0;
        }
        
        public final void setGroupId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getRemark() {
            return null;
        }
        
        public final void setRemark(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLabelName() {
            return null;
        }
        
        public final void setLabelName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getDepartmentName() {
            return null;
        }
        
        public final void setDepartmentName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final boolean getDoCertified() {
            return false;
        }
        
        public final void setDoCertified(boolean p0) {
        }
    }
}