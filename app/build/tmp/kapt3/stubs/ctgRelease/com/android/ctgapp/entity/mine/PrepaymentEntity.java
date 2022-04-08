package com.android.ctgapp.entity.mine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/mine/PrepaymentEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/mine/PrepaymentEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/mine/PrepaymentEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/mine/PrepaymentEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class PrepaymentEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"allMoney":40.64,"list":[{"id":null,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":null,"returnAmount":0,"orderId":null,"settleWay":null,"isSettled":0,"createTime":null,"updateTime":null,"companyName":"无锡畅通汽配公司","linkMan":"猪小健","thisMoney":null,"allMoney":40.64,"noPayMoney":40.64,"count":4,"isAllow":null,"orderList":[{"orderNo":"DD20210603223933651OZTR072","noPayMoney":20},{"orderNo":"DD20210604163455458ZIBC184","noPayMoney":20.32},{"orderNo":"DD20210604163447982GVOT182","noPayMoney":20.64},{"orderNo":"DD20210605150510194XTXY129","noPayMoney":40.64}]}]}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.mine.PrepaymentEntity.DataBean data;
    
    public PrepaymentEntity() {
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
    public final com.android.ctgapp.entity.mine.PrepaymentEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.mine.PrepaymentEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/android/ctgapp/entity/mine/PrepaymentEntity$DataBean;", "", "()V", "allMoney", "", "getAllMoney", "()D", "setAllMoney", "(D)V", "list", "", "Lcom/android/ctgapp/entity/mine/PrepaymentEntity$DataBean$ListBean;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "ListBean", "app_ctgRelease"})
    public static final class DataBean {
        
        /**
         * allMoney : 40.64
         * list : [{"id":null,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":null,"returnAmount":0,"orderId":null,"settleWay":null,"isSettled":0,"createTime":null,"updateTime":null,"companyName":"无锡畅通汽配公司","linkMan":"猪小健","thisMoney":null,"allMoney":40.64,"noPayMoney":40.64,"count":4,"isAllow":null,"orderList":[{"orderNo":"DD20210603223933651OZTR072","noPayMoney":20},{"orderNo":"DD20210604163455458ZIBC184","noPayMoney":20.32},{"orderNo":"DD20210604163447982GVOT182","noPayMoney":20.64},{"orderNo":"DD20210605150510194XTXY129","noPayMoney":40.64}]}]
         */
        private double allMoney = 0.0;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.mine.PrepaymentEntity.DataBean.ListBean> list;
        
        public DataBean() {
            super();
        }
        
        public final double getAllMoney() {
            return 0.0;
        }
        
        public final void setAllMoney(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.mine.PrepaymentEntity.DataBean.ListBean> getList() {
            return null;
        }
        
        public final void setList(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.mine.PrepaymentEntity.DataBean.ListBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001c\u0010&\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR\u001c\u0010)\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010\rR\u001a\u0010+\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001c\u0010-\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR\"\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0014\"\u0004\b?\u0010\u0016R\u001a\u0010@\u001a\u00020AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010F\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u000b\"\u0004\bH\u0010\rR\u001c\u0010I\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u000b\"\u0004\bK\u0010\rR\u001c\u0010L\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u000b\"\u0004\bN\u0010\r\u00a8\u0006O"}, d2 = {"Lcom/android/ctgapp/entity/mine/PrepaymentEntity$DataBean$ListBean;", "", "()V", "allMoney", "", "getAllMoney", "()D", "setAllMoney", "(D)V", "amount", "getAmount", "()Ljava/lang/Object;", "setAmount", "(Ljava/lang/Object;)V", "billCycleNum", "getBillCycleNum", "setBillCycleNum", "clientCompanyId", "", "getClientCompanyId", "()I", "setClientCompanyId", "(I)V", "companyId", "getCompanyId", "setCompanyId", "companyName", "", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "count", "getCount", "setCount", "createTime", "getCreateTime", "setCreateTime", "id", "getId", "setId", "isAllow", "setAllow", "isSettled", "setSettled", "linkMan", "getLinkMan", "setLinkMan", "noPayMoney", "getNoPayMoney", "setNoPayMoney", "orderId", "getOrderId", "setOrderId", "orderList", "", "Lcom/android/ctgapp/entity/ListChildBean;", "getOrderList", "()Ljava/util/List;", "setOrderList", "(Ljava/util/List;)V", "returnAmount", "getReturnAmount", "setReturnAmount", "selected", "", "getSelected", "()Z", "setSelected", "(Z)V", "settleWay", "getSettleWay", "setSettleWay", "thisMoney", "getThisMoney", "setThisMoney", "updateTime", "getUpdateTime", "setUpdateTime", "app_ctgRelease"})
        public static final class ListBean {
            
            /**
             * id : null
             * companyId : 65551
             * clientCompanyId : 12345
             * billCycleNum : null
             * amount : null
             * returnAmount : 0
             * orderId : null
             * settleWay : null
             * isSettled : 0
             * createTime : null
             * updateTime : null
             * companyName : 无锡畅通汽配公司
             * linkMan : 猪小健
             * thisMoney : null
             * allMoney : 40.64
             * noPayMoney : 40.64
             * count : 4
             * isAllow : null
             * orderList : [{"orderNo":"DD20210603223933651OZTR072","noPayMoney":20},{"orderNo":"DD20210604163455458ZIBC184","noPayMoney":20.32},{"orderNo":"DD20210604163447982GVOT182","noPayMoney":20.64},{"orderNo":"DD20210605150510194XTXY129","noPayMoney":40.64}]
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object id;
            private int companyId = 0;
            private int clientCompanyId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object billCycleNum;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object amount;
            private int returnAmount = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object orderId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object settleWay;
            private int isSettled = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object createTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object updateTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String companyName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String linkMan;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object thisMoney;
            private double allMoney = 0.0;
            private double noPayMoney = 0.0;
            private int count = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object isAllow;
            private boolean selected = false;
            @org.jetbrains.annotations.Nullable()
            private java.util.List<com.android.ctgapp.entity.ListChildBean> orderList;
            
            public ListBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getId() {
                return null;
            }
            
            public final void setId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getCompanyId() {
                return 0;
            }
            
            public final void setCompanyId(int p0) {
            }
            
            public final int getClientCompanyId() {
                return 0;
            }
            
            public final void setClientCompanyId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getBillCycleNum() {
                return null;
            }
            
            public final void setBillCycleNum(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAmount() {
                return null;
            }
            
            public final void setAmount(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getReturnAmount() {
                return 0;
            }
            
            public final void setReturnAmount(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOrderId() {
                return null;
            }
            
            public final void setOrderId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSettleWay() {
                return null;
            }
            
            public final void setSettleWay(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int isSettled() {
                return 0;
            }
            
            public final void setSettled(int p0) {
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
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCompanyName() {
                return null;
            }
            
            public final void setCompanyName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLinkMan() {
                return null;
            }
            
            public final void setLinkMan(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getThisMoney() {
                return null;
            }
            
            public final void setThisMoney(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final double getAllMoney() {
                return 0.0;
            }
            
            public final void setAllMoney(double p0) {
            }
            
            public final double getNoPayMoney() {
                return 0.0;
            }
            
            public final void setNoPayMoney(double p0) {
            }
            
            public final int getCount() {
                return 0;
            }
            
            public final void setCount(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object isAllow() {
                return null;
            }
            
            public final void setAllow(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final boolean getSelected() {
                return false;
            }
            
            public final void setSelected(boolean p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.android.ctgapp.entity.ListChildBean> getOrderList() {
                return null;
            }
            
            public final void setOrderList(@org.jetbrains.annotations.Nullable()
            java.util.List<com.android.ctgapp.entity.ListChildBean> p0) {
            }
        }
    }
}