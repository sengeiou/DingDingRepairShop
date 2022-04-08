package com.android.ctgapp.entity.mine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/mine/RechargeActivityEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/mine/RechargeActivityEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/mine/RechargeActivityEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/mine/RechargeActivityEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_WLDebug"})
public final class RechargeActivityEntity {
    
    /**
     * status : 0
     * msg : null
     * "data":[{"platformClientName":null,"platformClientId":366,"amount":99.00,"rechargeAmount":0.00,"total":99.00,"voucherNum":1,"voucherList":null},{"platformClientName":null,"platformClientId":651,"amount":200.00,"rechargeAmount":10.00,"total":210.00,"voucherNum":0,"voucherList":null}]
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.mine.RechargeActivityEntity.DataBean data;
    
    public RechargeActivityEntity() {
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
    public final com.android.ctgapp.entity.mine.RechargeActivityEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.mine.RechargeActivityEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001d\u00a8\u0006("}, d2 = {"Lcom/android/ctgapp/entity/mine/RechargeActivityEntity$DataBean;", "", "()V", "activityList", "", "Lcom/android/ctgapp/entity/mine/RechargeActivityEntity$DataBean$activityListBean;", "getActivityList", "()Ljava/util/List;", "setActivityList", "(Ljava/util/List;)V", "amount", "getAmount", "()Ljava/lang/Object;", "setAmount", "(Ljava/lang/Object;)V", "fromCompanyId", "", "getFromCompanyId", "()Ljava/lang/String;", "setFromCompanyId", "(Ljava/lang/String;)V", "fromCompanyName", "getFromCompanyName", "setFromCompanyName", "platformClientId", "", "getPlatformClientId", "()I", "setPlatformClientId", "(I)V", "rechargeAmount", "getRechargeAmount", "setRechargeAmount", "total", "getTotal", "setTotal", "voucherNum", "getVoucherNum", "setVoucherNum", "activityListBean", "app_WLDebug"})
    public static final class DataBean {
        
        /**
         * "platformClientName":null,
         * "platformClientId":366,
         * "amount":99,
         * "rechargeAmount":0,
         * "total":99,
         * "voucherNum":1,
         * "voucherList":null
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String fromCompanyId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object fromCompanyName;
        private int platformClientId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object amount;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object rechargeAmount;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String total;
        private int voucherNum = 0;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.mine.RechargeActivityEntity.DataBean.activityListBean> activityList;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFromCompanyId() {
            return null;
        }
        
        public final void setFromCompanyId(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getFromCompanyName() {
            return null;
        }
        
        public final void setFromCompanyName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getPlatformClientId() {
            return 0;
        }
        
        public final void setPlatformClientId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAmount() {
            return null;
        }
        
        public final void setAmount(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getRechargeAmount() {
            return null;
        }
        
        public final void setRechargeAmount(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTotal() {
            return null;
        }
        
        public final void setTotal(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getVoucherNum() {
            return 0;
        }
        
        public final void setVoucherNum(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.mine.RechargeActivityEntity.DataBean.activityListBean> getActivityList() {
            return null;
        }
        
        public final void setActivityList(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.mine.RechargeActivityEntity.DataBean.activityListBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b+\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\b\u00a8\u00065"}, d2 = {"Lcom/android/ctgapp/entity/mine/RechargeActivityEntity$DataBean$activityListBean;", "", "()V", "activityName", "", "getActivityName", "()Ljava/lang/String;", "setActivityName", "(Ljava/lang/String;)V", "activityStatus", "", "getActivityStatus", "()I", "setActivityStatus", "(I)V", "amount", "getAmount", "setAmount", "bonusAmount", "getBonusAmount", "setBonusAmount", "companyId", "getCompanyId", "setCompanyId", "createTime", "getCreateTime", "setCreateTime", "createUserId", "getCreateUserId", "setCreateUserId", "endDate", "getEndDate", "setEndDate", "id", "getId", "setId", "isDeleted", "setDeleted", "remark", "getRemark", "setRemark", "startDate", "getStartDate", "setStartDate", "updateTime", "getUpdateTime", "setUpdateTime", "updateUserId", "getUpdateUserId", "setUpdateUserId", "voucherId", "getVoucherId", "setVoucherId", "app_WLDebug"})
        public static final class activityListBean {
            private int id = 0;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String companyId = "";
            @org.jetbrains.annotations.NotNull()
            private java.lang.String activityName = "";
            @org.jetbrains.annotations.Nullable()
            private java.lang.String amount;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String bonusAmount;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String voucherId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String startDate;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String endDate;
            private int activityStatus = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String remark;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String createTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String createUserId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String updateTime;
            private int updateUserId = 0;
            private int isDeleted = 0;
            
            public activityListBean() {
                super();
            }
            
            public final int getId() {
                return 0;
            }
            
            public final void setId(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCompanyId() {
                return null;
            }
            
            public final void setCompanyId(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getActivityName() {
                return null;
            }
            
            public final void setActivityName(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAmount() {
                return null;
            }
            
            public final void setAmount(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getBonusAmount() {
                return null;
            }
            
            public final void setBonusAmount(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getVoucherId() {
                return null;
            }
            
            public final void setVoucherId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStartDate() {
                return null;
            }
            
            public final void setStartDate(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getEndDate() {
                return null;
            }
            
            public final void setEndDate(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final int getActivityStatus() {
                return 0;
            }
            
            public final void setActivityStatus(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getRemark() {
                return null;
            }
            
            public final void setRemark(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCreateTime() {
                return null;
            }
            
            public final void setCreateTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCreateUserId() {
                return null;
            }
            
            public final void setCreateUserId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getUpdateTime() {
                return null;
            }
            
            public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final int getUpdateUserId() {
                return 0;
            }
            
            public final void setUpdateUserId(int p0) {
            }
            
            public final int isDeleted() {
                return 0;
            }
            
            public final void setDeleted(int p0) {
            }
        }
    }
}