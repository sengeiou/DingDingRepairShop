package com.android.ctgapp.entity.deal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/deal/AfterSaleListEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgRelease"})
public final class AfterSaleListEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"id":"3486b2e32b4a4b928f0f6321c6e57abc","returnNo":"TH20201202092349683IBC8000","orderNo":"DD20201123133602620YXHV003","buyerCompanyId":65551,"sellerCompanyId":12345,"returnOrderGoods":[{"goodsName":"12311313","returnNum":1}],"applyTime":"2020-12-02 09:23:50","returnCash":0.01,"returnStatus":1},{"id":"b5a7c9add3874290b79d3b7db394eac8","returnNo":"TH202011261736017619X8O002","orderNo":"DD20201121170954943OEW1003","buyerCompanyId":888897040,"sellerCompanyId":12345,"returnOrderGoods":[{"goodsName":"fgj56urtyu","returnNum":1}],"applyTime":"2020-11-26 10:24:18","returnCash":10,"returnStatus":3},{"id":"68cd5e7eec7f4cc29eb46314f86fb6b7","returnNo":"TH20201111165050789014","orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":"发送到","returnNum":2}],"applyTime":"2020-11-11 16:50:51","returnCash":null,"returnStatus":6},{"id":"0ada9e6a3d874d10b4899d7b2505052c","returnNo":"TH20201111164947845013","orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":null,"returnNum":1}],"applyTime":"2020-11-11 16:49:48","returnCash":null,"returnStatus":6},{"id":"68cd5e7eec7f4cc29eb46314f86fb6b8","returnNo":null,"orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":"发送到","returnNum":1},{"goodsName":null,"returnNum":8}],"applyTime":null,"returnCash":null,"returnStatus":null}],"total":5,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean data;
    private boolean isSuccess = false;
    
    public AfterSaleListEntity() {
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
    public final com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R \u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\"\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001a\u0010\'\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\u001a\u0010*\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\r\u00a8\u0006."}, d2 = {"Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean;", "", "()V", "countId", "getCountId", "()Ljava/lang/Object;", "setCountId", "(Ljava/lang/Object;)V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "isHitCount", "", "()Z", "setHitCount", "(Z)V", "isOptimizeCountSql", "setOptimizeCountSql", "isSearchCount", "setSearchCount", "maxLimit", "getMaxLimit", "setMaxLimit", "orders", "", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "pages", "getPages", "setPages", "records", "Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean$RecordsBean;", "getRecords", "setRecords", "size", "getSize", "setSize", "total", "getTotal", "setTotal", "RecordsBean", "app_ctgRelease"})
    public static final class DataBean {
        
        /**
         * records : [{"id":"3486b2e32b4a4b928f0f6321c6e57abc","returnNo":"TH20201202092349683IBC8000","orderNo":"DD20201123133602620YXHV003","buyerCompanyId":65551,"sellerCompanyId":12345,"returnOrderGoods":[{"goodsName":"12311313","returnNum":1}],"applyTime":"2020-12-02 09:23:50","returnCash":0.01,"returnStatus":1},{"id":"b5a7c9add3874290b79d3b7db394eac8","returnNo":"TH202011261736017619X8O002","orderNo":"DD20201121170954943OEW1003","buyerCompanyId":888897040,"sellerCompanyId":12345,"returnOrderGoods":[{"goodsName":"fgj56urtyu","returnNum":1}],"applyTime":"2020-11-26 10:24:18","returnCash":10,"returnStatus":3},{"id":"68cd5e7eec7f4cc29eb46314f86fb6b7","returnNo":"TH20201111165050789014","orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":"发送到","returnNum":2}],"applyTime":"2020-11-11 16:50:51","returnCash":null,"returnStatus":6},{"id":"0ada9e6a3d874d10b4899d7b2505052c","returnNo":"TH20201111164947845013","orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":null,"returnNum":1}],"applyTime":"2020-11-11 16:49:48","returnCash":null,"returnStatus":6},{"id":"68cd5e7eec7f4cc29eb46314f86fb6b8","returnNo":null,"orderNo":null,"buyerCompanyId":null,"sellerCompanyId":null,"returnOrderGoods":[{"goodsName":"发送到","returnNum":1},{"goodsName":null,"returnNum":8}],"applyTime":null,"returnCash":null,"returnStatus":null}]
         * total : 5
         * size : 20
         * current : 1
         * orders : []
         * optimizeCountSql : true
         * hitCount : false
         * countId : null
         * maxLimit : null
         * searchCount : true
         * pages : 1
         */
        private int total = 0;
        private int size = 0;
        private int current = 0;
        private boolean isOptimizeCountSql = false;
        private boolean isHitCount = false;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object countId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object maxLimit;
        private boolean isSearchCount = false;
        private int pages = 0;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean.RecordsBean> records;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<?> orders;
        
        public DataBean() {
            super();
        }
        
        public final int getTotal() {
            return 0;
        }
        
        public final void setTotal(int p0) {
        }
        
        public final int getSize() {
            return 0;
        }
        
        public final void setSize(int p0) {
        }
        
        public final int getCurrent() {
            return 0;
        }
        
        public final void setCurrent(int p0) {
        }
        
        public final boolean isOptimizeCountSql() {
            return false;
        }
        
        public final void setOptimizeCountSql(boolean p0) {
        }
        
        public final boolean isHitCount() {
            return false;
        }
        
        public final void setHitCount(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCountId() {
            return null;
        }
        
        public final void setCountId(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getMaxLimit() {
            return null;
        }
        
        public final void setMaxLimit(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final boolean isSearchCount() {
            return false;
        }
        
        public final void setSearchCount(boolean p0) {
        }
        
        public final int getPages() {
            return 0;
        }
        
        public final void setPages(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean.RecordsBean> getRecords() {
            return null;
        }
        
        public final void setRecords(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean.RecordsBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<?> getOrders() {
            return null;
        }
        
        public final void setOrders(@org.jetbrains.annotations.Nullable()
        java.util.List<?> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\"\u0010\'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R\u001a\u00101\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u0011R\u001c\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\b\u00a8\u00068"}, d2 = {"Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean$RecordsBean;", "", "()V", "allianceName", "", "getAllianceName", "()Ljava/lang/String;", "setAllianceName", "(Ljava/lang/String;)V", "applyTime", "getApplyTime", "setApplyTime", "buyerCompanyId", "", "getBuyerCompanyId", "()I", "setBuyerCompanyId", "(I)V", "buyerCompanyName", "getBuyerCompanyName", "setBuyerCompanyName", "flow", "getFlow", "setFlow", "id", "getId", "setId", "orderNo", "getOrderNo", "setOrderNo", "returnCash", "", "getReturnCash", "()D", "setReturnCash", "(D)V", "returnNo", "getReturnNo", "setReturnNo", "returnOrderGoods", "", "Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean$RecordsBean$ReturnOrderGoodsBean;", "getReturnOrderGoods", "()Ljava/util/List;", "setReturnOrderGoods", "(Ljava/util/List;)V", "returnStatus", "getReturnStatus", "setReturnStatus", "sellerCompanyId", "getSellerCompanyId", "setSellerCompanyId", "sellerCompanyName", "getSellerCompanyName", "setSellerCompanyName", "ReturnOrderGoodsBean", "app_ctgRelease"})
        public static final class RecordsBean {
            
            /**
             * id : 3486b2e32b4a4b928f0f6321c6e57abc
             * returnNo : TH20201202092349683IBC8000
             * orderNo : DD20201123133602620YXHV003
             * buyerCompanyId : 65551
             * sellerCompanyId : 12345
             * returnOrderGoods : [{"goodsName":"12311313","returnNum":1}]
             * applyTime : 2020-12-02 09:23:50
             * returnCash : 0.01
             * returnStatus : 1
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String id;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String returnNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orderNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String buyerCompanyName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String sellerCompanyName;
            private int buyerCompanyId = 0;
            private int flow = 0;
            private int sellerCompanyId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String applyTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String allianceName;
            private double returnCash = 0.0;
            private int returnStatus = 0;
            @org.jetbrains.annotations.Nullable()
            private java.util.List<com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean.RecordsBean.ReturnOrderGoodsBean> returnOrderGoods;
            
            public RecordsBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getId() {
                return null;
            }
            
            public final void setId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getReturnNo() {
                return null;
            }
            
            public final void setReturnNo(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOrderNo() {
                return null;
            }
            
            public final void setOrderNo(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getBuyerCompanyName() {
                return null;
            }
            
            public final void setBuyerCompanyName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getSellerCompanyName() {
                return null;
            }
            
            public final void setSellerCompanyName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final int getBuyerCompanyId() {
                return 0;
            }
            
            public final void setBuyerCompanyId(int p0) {
            }
            
            public final int getFlow() {
                return 0;
            }
            
            public final void setFlow(int p0) {
            }
            
            public final int getSellerCompanyId() {
                return 0;
            }
            
            public final void setSellerCompanyId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getApplyTime() {
                return null;
            }
            
            public final void setApplyTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAllianceName() {
                return null;
            }
            
            public final void setAllianceName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final double getReturnCash() {
                return 0.0;
            }
            
            public final void setReturnCash(double p0) {
            }
            
            public final int getReturnStatus() {
                return 0;
            }
            
            public final void setReturnStatus(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean.RecordsBean.ReturnOrderGoodsBean> getReturnOrderGoods() {
                return null;
            }
            
            public final void setReturnOrderGoods(@org.jetbrains.annotations.Nullable()
            java.util.List<com.android.ctgapp.entity.deal.AfterSaleListEntity.DataBean.RecordsBean.ReturnOrderGoodsBean> p0) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/android/ctgapp/entity/deal/AfterSaleListEntity$DataBean$RecordsBean$ReturnOrderGoodsBean;", "", "()V", "goodsName", "", "getGoodsName", "()Ljava/lang/String;", "setGoodsName", "(Ljava/lang/String;)V", "returnNum", "", "getReturnNum", "()I", "setReturnNum", "(I)V", "app_ctgRelease"})
            public static final class ReturnOrderGoodsBean {
                
                /**
                 * goodsName : 12311313
                 * returnNum : 1
                 */
                @org.jetbrains.annotations.Nullable()
                private java.lang.String goodsName;
                private int returnNum = 0;
                
                public ReturnOrderGoodsBean() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getGoodsName() {
                    return null;
                }
                
                public final void setGoodsName(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public final int getReturnNum() {
                    return 0;
                }
                
                public final void setReturnNum(int p0) {
                }
            }
        }
    }
}