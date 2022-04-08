package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/entity/OrderEntity;", "Ljava/io/Serializable;", "()V", "data", "Lcom/android/ctgapp/entity/OrderEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/OrderEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/OrderEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_WLDebug"})
public final class OrderEntity implements java.io.Serializable {
    
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"2c875556c8608114ff45ef6b9a196b77","orderNo":"DD20201024111640638HNLS017","cashChangeNo":null,"totalNumber":2,"totalPrice":59,"originalTotalNumber":null,"originalTotalPrice":null,"sellerCompanyId":888897040,"buyerCompanyId":12345,"allianceId":null,"state":2,"orderBatchNo":null,"province":null,"city":null,"district":null,"address":null,"postNum":null,"receiverName":"zyf1","telephone":"13112312321","createTime":"2020-10-24 11:16:41","updateTime":null,"remark":null,"buyerUserId":1,"closingDate":null,"payee":null,"quotationId":17,"refuseReason":null,"sellAffirm":null,"buyAffirm":null,"outBill":null,"indentFrom":null,"erpOrderId":null,"orderStatus":null,"invoiceType":null,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":"猪小健","sellerCompanyName":"西天取经","orderDetailS":null,"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":"挂账","searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"57838af4eeb566e95a11c2632192ea46","orderId":"2c875556c8608114ff45ef6b9a196b77","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":null,"payWay":1,"thirdPartyPay":null,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-10-24 11:16:41","updateTime":"2020-10-24 11:16:40"},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":"LVHRE1833B5012137"}],"total":1,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.OrderEntity.DataBean data;
    private boolean isSuccess = false;
    
    public OrderEntity() {
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
    public final com.android.ctgapp.entity.OrderEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.OrderEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001e\"\u0004\b\'\u0010 R\u001a\u0010(\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u001a\u0010+\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000e\u00a8\u0006/"}, d2 = {"Lcom/android/ctgapp/entity/OrderEntity$DataBean;", "Ljava/io/Serializable;", "()V", "countId", "", "getCountId", "()Ljava/lang/Object;", "setCountId", "(Ljava/lang/Object;)V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "isHitCount", "", "()Z", "setHitCount", "(Z)V", "isOptimizeCountSql", "setOptimizeCountSql", "isSearchCount", "setSearchCount", "maxLimit", "getMaxLimit", "setMaxLimit", "orders", "", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "pages", "getPages", "setPages", "records", "Lcom/android/ctgapp/entity/OrderEntity$DataBean$RecordsBean;", "getRecords", "setRecords", "size", "getSize", "setSize", "total", "getTotal", "setTotal", "RecordsBean", "app_WLDebug"})
    public static final class DataBean implements java.io.Serializable {
        
        /**
         * records : [{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"2c875556c8608114ff45ef6b9a196b77","orderNo":"DD20201024111640638HNLS017","cashChangeNo":null,"totalNumber":2,"totalPrice":59,"originalTotalNumber":null,"originalTotalPrice":null,"sellerCompanyId":888897040,"buyerCompanyId":12345,"allianceId":null,"state":2,"orderBatchNo":null,"province":null,"city":null,"district":null,"address":null,"postNum":null,"receiverName":"zyf1","telephone":"13112312321","createTime":"2020-10-24 11:16:41","updateTime":null,"remark":null,"buyerUserId":1,"closingDate":null,"payee":null,"quotationId":17,"refuseReason":null,"sellAffirm":null,"buyAffirm":null,"outBill":null,"indentFrom":null,"erpOrderId":null,"orderStatus":null,"invoiceType":null,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":"猪小健","sellerCompanyName":"西天取经","orderDetailS":null,"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":"挂账","searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"57838af4eeb566e95a11c2632192ea46","orderId":"2c875556c8608114ff45ef6b9a196b77","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":null,"payWay":1,"thirdPartyPay":null,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-10-24 11:16:41","updateTime":"2020-10-24 11:16:40"},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":"LVHRE1833B5012137"}]
         * total : 1
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
        private java.util.List<com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean> records;
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
        public final java.util.List<com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean> getRecords() {
            return null;
        }
        
        public final void setRecords(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<?> getOrders() {
            return null;
        }
        
        public final void setOrders(@org.jetbrains.annotations.Nullable()
        java.util.List<?> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0003\b\u0098\u0001\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u00e4\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001c\u0010K\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001c\u0010N\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u0014\u0010Q\u001a\u00020\u0016X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0018R\u001a\u0010S\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010!\"\u0004\bU\u0010#R\u001c\u0010V\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\bR\u001c\u0010Y\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0006\"\u0004\b[\u0010\bR\u001c\u0010\\\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0006\"\u0004\b^\u0010\bR\u001c\u0010_\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0006\"\u0004\ba\u0010\bR\u001c\u0010b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0006\"\u0004\bd\u0010\bR\u001c\u0010e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0006\"\u0004\bf\u0010\bR\u001c\u0010g\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001c\u0010i\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001c\u0010l\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001c\u0010o\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001c\u0010r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001c\u0010u\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR\u001c\u0010x\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010!\"\u0004\bz\u0010#R\u001c\u0010{\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0006\"\u0004\b}\u0010\bR\u001d\u0010~\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010!\"\u0005\b\u0080\u0001\u0010#R\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\bR\u001f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0006\"\u0005\b\u008c\u0001\u0010\bR\u001f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0006\"\u0005\b\u008f\u0001\u0010\bR\u001d\u0010\u0090\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0018\"\u0005\b\u0092\u0001\u0010\u001aR\u001d\u0010\u0093\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u0018\"\u0005\b\u0095\u0001\u0010\u001aR\u001f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u0006\"\u0005\b\u0098\u0001\u0010\bR\u001f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010!\"\u0005\b\u009b\u0001\u0010#R\u001f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0006\"\u0005\b\u009e\u0001\u0010\bR\u001f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010\u0006\"\u0005\b\u00a1\u0001\u0010\bR\u001f\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0001\u0010\u0006\"\u0005\b\u00a4\u0001\u0010\bR\u001d\u0010\u00a5\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0001\u0010\u0018\"\u0005\b\u00a7\u0001\u0010\u001aR\u001f\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a9\u0001\u0010!\"\u0005\b\u00aa\u0001\u0010#R\u001f\u0010\u00ab\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ac\u0001\u0010\u0006\"\u0005\b\u00ad\u0001\u0010\bR\u001f\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00af\u0001\u0010\u0006\"\u0005\b\u00b0\u0001\u0010\bR\u001d\u0010\u00b1\u0001\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b2\u0001\u0010!\"\u0005\b\u00b3\u0001\u0010#R\u001d\u0010\u00b4\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0001\u0010\u0018\"\u0005\b\u00b6\u0001\u0010\u001aR\u001f\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b8\u0001\u0010\u0006\"\u0005\b\u00b9\u0001\u0010\bR\u001f\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bb\u0001\u0010\u0006\"\u0005\b\u00bc\u0001\u0010\bR\u001d\u0010\u00bd\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00be\u0001\u0010\u0018\"\u0005\b\u00bf\u0001\u0010\u001aR\u001f\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c1\u0001\u0010\u0006\"\u0005\b\u00c2\u0001\u0010\bR\u001f\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c4\u0001\u0010!\"\u0005\b\u00c5\u0001\u0010#R\u001f\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c7\u0001\u0010\u0006\"\u0005\b\u00c8\u0001\u0010\bR\u001d\u0010\u00c9\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ca\u0001\u0010\u0018\"\u0005\b\u00cb\u0001\u0010\u001aR\u001f\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cd\u0001\u0010\u0006\"\u0005\b\u00ce\u0001\u0010\bR\u001f\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d0\u0001\u0010\u0006\"\u0005\b\u00d1\u0001\u0010\bR\u001f\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d3\u0001\u0010!\"\u0005\b\u00d4\u0001\u0010#R\u001d\u0010\u00d5\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d6\u0001\u0010\u0018\"\u0005\b\u00d7\u0001\u0010\u001aR \u0010\u00d8\u0001\u001a\u00030\u00d9\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00da\u0001\u0010\u00db\u0001\"\u0006\b\u00dc\u0001\u0010\u00dd\u0001R\u001f\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00df\u0001\u0010\u0006\"\u0005\b\u00e0\u0001\u0010\bR\u001f\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e2\u0001\u0010!\"\u0005\b\u00e3\u0001\u0010#\u00a8\u0006\u00e5\u0001"}, d2 = {"Lcom/android/ctgapp/entity/OrderEntity$DataBean$RecordsBean;", "Ljava/io/Serializable;", "()V", "address", "", "getAddress", "()Ljava/lang/Object;", "setAddress", "(Ljava/lang/Object;)V", "allianceId", "getAllianceId", "setAllianceId", "allianceName", "getAllianceName", "setAllianceName", "bank", "getBank", "setBank", "buyAffirm", "getBuyAffirm", "setBuyAffirm", "buyerCompanyId", "", "getBuyerCompanyId", "()I", "setBuyerCompanyId", "(I)V", "buyerCompanyIds", "getBuyerCompanyIds", "setBuyerCompanyIds", "buyerCompanyName", "", "getBuyerCompanyName", "()Ljava/lang/String;", "setBuyerCompanyName", "(Ljava/lang/String;)V", "buyerUserId", "getBuyerUserId", "setBuyerUserId", "buyerUserName", "getBuyerUserName", "setBuyerUserName", "cashChangeNo", "getCashChangeNo", "setCashChangeNo", "cashReplaceId", "getCashReplaceId", "setCashReplaceId", "city", "getCity", "setCity", "closingDate", "getClosingDate", "setClosingDate", "companyAddress", "getCompanyAddress", "setCompanyAddress", "companyPhone", "getCompanyPhone", "setCompanyPhone", "createTime", "getCreateTime", "setCreateTime", "ctgOrderPay", "Lcom/android/ctgapp/entity/OrderEntity$DataBean$RecordsBean$CtgOrderPayBean;", "getCtgOrderPay", "()Lcom/android/ctgapp/entity/OrderEntity$DataBean$RecordsBean$CtgOrderPayBean;", "setCtgOrderPay", "(Lcom/android/ctgapp/entity/OrderEntity$DataBean$RecordsBean$CtgOrderPayBean;)V", "days", "getDays", "setDays", "district", "getDistrict", "setDistrict", "endDate", "getEndDate", "setEndDate", "erpOrderId", "getErpOrderId", "setErpOrderId", "flow", "getFlow", "goodsNames", "getGoodsNames", "setGoodsNames", "head", "getHead", "setHead", "indentFrom", "getIndentFrom", "setIndentFrom", "indentFroms", "getIndentFroms", "setIndentFroms", "industry", "getIndustry", "setIndustry", "invoiceType", "getInvoiceType", "setInvoiceType", "isNeedChangeReceiverInfo", "setNeedChangeReceiverInfo", "isNeedChangeRemark", "setNeedChangeRemark", "leftCash", "getLeftCash", "setLeftCash", "limitNum", "getLimitNum", "setLimitNum", "orderBatchNo", "getOrderBatchNo", "setOrderBatchNo", "orderByDescs", "getOrderByDescs", "setOrderByDescs", "orderDetailS", "getOrderDetailS", "setOrderDetailS", "orderId", "getOrderId", "setOrderId", "orderInvoice", "getOrderInvoice", "setOrderInvoice", "orderNo", "getOrderNo", "setOrderNo", "orderStatus", "getOrderStatus", "setOrderStatus", "originalCtgOrderPay", "getOriginalCtgOrderPay", "setOriginalCtgOrderPay", "originalTotalNumber", "getOriginalTotalNumber", "setOriginalTotalNumber", "originalTotalPrice", "getOriginalTotalPrice", "setOriginalTotalPrice", "outBill", "getOutBill", "setOutBill", "pageNum", "getPageNum", "setPageNum", "pageSize", "getPageSize", "setPageSize", "payWay", "getPayWay", "setPayWay", "payWayString", "getPayWayString", "setPayWayString", "payee", "getPayee", "setPayee", "postNum", "getPostNum", "setPostNum", "province", "getProvince", "setProvince", "quotationId", "getQuotationId", "setQuotationId", "receiverName", "getReceiverName", "setReceiverName", "refuseReason", "getRefuseReason", "setRefuseReason", "remark", "getRemark", "setRemark", "returnOrderId", "getReturnOrderId", "setReturnOrderId", "returnStatus", "getReturnStatus", "setReturnStatus", "searchString", "getSearchString", "setSearchString", "sellAffirm", "getSellAffirm", "setSellAffirm", "sellerCompanyId", "getSellerCompanyId", "setSellerCompanyId", "sellerCompanyIds", "getSellerCompanyIds", "setSellerCompanyIds", "sellerCompanyName", "getSellerCompanyName", "setSellerCompanyName", "startDate", "getStartDate", "setStartDate", "state", "getState", "setState", "states", "getStates", "setStates", "taxNo", "getTaxNo", "setTaxNo", "telephone", "getTelephone", "setTelephone", "totalNumber", "getTotalNumber", "setTotalNumber", "totalPrice", "", "getTotalPrice", "()D", "setTotalPrice", "(D)V", "updateTime", "getUpdateTime", "setUpdateTime", "vin", "getVin", "setVin", "CtgOrderPayBean", "app_WLDebug"})
        public static final class RecordsBean implements java.io.Serializable {
            
            /**
             * startDate : null
             * endDate : null
             * pageNum : 1
             * pageSize : 20
             * orderId : 2c875556c8608114ff45ef6b9a196b77
             * orderNo : DD20201024111640638HNLS017
             * cashChangeNo : null
             * totalNumber : 2
             * totalPrice : 59
             * originalTotalNumber : null
             * originalTotalPrice : null
             * sellerCompanyId : 888897040
             * buyerCompanyId : 12345
             * allianceId : null
             * state : 2
             * orderBatchNo : null
             * province : null
             * city : null
             * district : null
             * address : null
             * postNum : null
             * receiverName : zyf1
             * telephone : 13112312321
             * createTime : 2020-10-24 11:16:41
             * updateTime : null
             * remark : null
             * buyerUserId : 1
             * closingDate : null
             * payee : null
             * quotationId : 17
             * refuseReason : null
             * sellAffirm : null
             * buyAffirm : null
             * outBill : null
             * indentFrom : null
             * erpOrderId : null
             * orderStatus : null
             * invoiceType : null
             * head : null
             * taxNo : null
             * companyAddress : null
             * companyPhone : null
             * bank : null
             * buyerUserName : null
             * buyerCompanyName : 猪小健
             * sellerCompanyName : 西天取经
             * orderDetailS : null
             * cashReplaceId : null
             * payWay : null
             * leftCash : null
             * payWayString : 挂账
             * searchString : null
             * isNeedChangeReceiverInfo : null
             * isNeedChangeRemark : null
             * orderInvoice : null
             * ctgOrderPay : {"orderPayId":"57838af4eeb566e95a11c2632192ea46","orderId":"2c875556c8608114ff45ef6b9a196b77","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":null,"payWay":1,"thirdPartyPay":null,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-10-24 11:16:41","updateTime":"2020-10-24 11:16:40"}
             * originalCtgOrderPay : null
             * buyerCompanyIds : null
             * sellerCompanyIds : null
             * states : null
             * indentFroms : null
             * orderByDescs : null
             * limitNum : null
             * days : null
             * industry : null
             * vin : LVHRE1833B5012137
             */
            private final int flow = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object startDate;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object endDate;
            private int pageNum = 0;
            private int pageSize = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orderId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orderNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object cashChangeNo;
            private int totalNumber = 0;
            private double totalPrice = 0.0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object originalTotalNumber;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object originalTotalPrice;
            private int sellerCompanyId = 0;
            private int buyerCompanyId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object allianceId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object allianceName;
            private int state = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object orderBatchNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object province;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object city;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object district;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object address;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object postNum;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String receiverName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String telephone;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String createTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object updateTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object remark;
            private int buyerUserId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object closingDate;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object payee;
            private int quotationId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object refuseReason;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object sellAffirm;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object buyAffirm;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object outBill;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object indentFrom;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object erpOrderId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object orderStatus;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object invoiceType;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object head;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object taxNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object companyAddress;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object companyPhone;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object bank;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object buyerUserName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String buyerCompanyName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String sellerCompanyName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object orderDetailS;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object cashReplaceId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object payWay;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object leftCash;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String payWayString;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object searchString;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object isNeedChangeReceiverInfo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object isNeedChangeRemark;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object orderInvoice;
            @org.jetbrains.annotations.Nullable()
            private com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean.CtgOrderPayBean ctgOrderPay;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object originalCtgOrderPay;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object buyerCompanyIds;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object sellerCompanyIds;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object states;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object indentFroms;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object orderByDescs;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object limitNum;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object days;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object industry;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String vin;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String goodsNames = "";
            private int returnStatus = -1;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String returnOrderId = "";
            
            public RecordsBean() {
                super();
            }
            
            public final int getFlow() {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getStartDate() {
                return null;
            }
            
            public final void setStartDate(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getEndDate() {
                return null;
            }
            
            public final void setEndDate(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getPageNum() {
                return 0;
            }
            
            public final void setPageNum(int p0) {
            }
            
            public final int getPageSize() {
                return 0;
            }
            
            public final void setPageSize(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOrderId() {
                return null;
            }
            
            public final void setOrderId(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Object getCashChangeNo() {
                return null;
            }
            
            public final void setCashChangeNo(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getTotalNumber() {
                return 0;
            }
            
            public final void setTotalNumber(int p0) {
            }
            
            public final double getTotalPrice() {
                return 0.0;
            }
            
            public final void setTotalPrice(double p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOriginalTotalNumber() {
                return null;
            }
            
            public final void setOriginalTotalNumber(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOriginalTotalPrice() {
                return null;
            }
            
            public final void setOriginalTotalPrice(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getSellerCompanyId() {
                return 0;
            }
            
            public final void setSellerCompanyId(int p0) {
            }
            
            public final int getBuyerCompanyId() {
                return 0;
            }
            
            public final void setBuyerCompanyId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAllianceId() {
                return null;
            }
            
            public final void setAllianceId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAllianceName() {
                return null;
            }
            
            public final void setAllianceName(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getState() {
                return 0;
            }
            
            public final void setState(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOrderBatchNo() {
                return null;
            }
            
            public final void setOrderBatchNo(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getProvince() {
                return null;
            }
            
            public final void setProvince(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCity() {
                return null;
            }
            
            public final void setCity(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getDistrict() {
                return null;
            }
            
            public final void setDistrict(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAddress() {
                return null;
            }
            
            public final void setAddress(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getPostNum() {
                return null;
            }
            
            public final void setPostNum(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getReceiverName() {
                return null;
            }
            
            public final void setReceiverName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTelephone() {
                return null;
            }
            
            public final void setTelephone(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Object getUpdateTime() {
                return null;
            }
            
            public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getRemark() {
                return null;
            }
            
            public final void setRemark(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getBuyerUserId() {
                return 0;
            }
            
            public final void setBuyerUserId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getClosingDate() {
                return null;
            }
            
            public final void setClosingDate(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getPayee() {
                return null;
            }
            
            public final void setPayee(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getQuotationId() {
                return 0;
            }
            
            public final void setQuotationId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getRefuseReason() {
                return null;
            }
            
            public final void setRefuseReason(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSellAffirm() {
                return null;
            }
            
            public final void setSellAffirm(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getBuyAffirm() {
                return null;
            }
            
            public final void setBuyAffirm(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOutBill() {
                return null;
            }
            
            public final void setOutBill(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getIndentFrom() {
                return null;
            }
            
            public final void setIndentFrom(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getErpOrderId() {
                return null;
            }
            
            public final void setErpOrderId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOrderStatus() {
                return null;
            }
            
            public final void setOrderStatus(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getInvoiceType() {
                return null;
            }
            
            public final void setInvoiceType(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getHead() {
                return null;
            }
            
            public final void setHead(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getTaxNo() {
                return null;
            }
            
            public final void setTaxNo(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCompanyAddress() {
                return null;
            }
            
            public final void setCompanyAddress(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCompanyPhone() {
                return null;
            }
            
            public final void setCompanyPhone(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getBank() {
                return null;
            }
            
            public final void setBank(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getBuyerUserName() {
                return null;
            }
            
            public final void setBuyerUserName(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
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
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOrderDetailS() {
                return null;
            }
            
            public final void setOrderDetailS(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCashReplaceId() {
                return null;
            }
            
            public final void setCashReplaceId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getPayWay() {
                return null;
            }
            
            public final void setPayWay(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getLeftCash() {
                return null;
            }
            
            public final void setLeftCash(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPayWayString() {
                return null;
            }
            
            public final void setPayWayString(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSearchString() {
                return null;
            }
            
            public final void setSearchString(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object isNeedChangeReceiverInfo() {
                return null;
            }
            
            public final void setNeedChangeReceiverInfo(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object isNeedChangeRemark() {
                return null;
            }
            
            public final void setNeedChangeRemark(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOrderInvoice() {
                return null;
            }
            
            public final void setOrderInvoice(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean.CtgOrderPayBean getCtgOrderPay() {
                return null;
            }
            
            public final void setCtgOrderPay(@org.jetbrains.annotations.Nullable()
            com.android.ctgapp.entity.OrderEntity.DataBean.RecordsBean.CtgOrderPayBean p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOriginalCtgOrderPay() {
                return null;
            }
            
            public final void setOriginalCtgOrderPay(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getBuyerCompanyIds() {
                return null;
            }
            
            public final void setBuyerCompanyIds(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSellerCompanyIds() {
                return null;
            }
            
            public final void setSellerCompanyIds(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getStates() {
                return null;
            }
            
            public final void setStates(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getIndentFroms() {
                return null;
            }
            
            public final void setIndentFroms(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOrderByDescs() {
                return null;
            }
            
            public final void setOrderByDescs(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getLimitNum() {
                return null;
            }
            
            public final void setLimitNum(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getDays() {
                return null;
            }
            
            public final void setDays(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getIndustry() {
                return null;
            }
            
            public final void setIndustry(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getVin() {
                return null;
            }
            
            public final void setVin(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getGoodsNames() {
                return null;
            }
            
            public final void setGoodsNames(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int getReturnStatus() {
                return 0;
            }
            
            public final void setReturnStatus(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getReturnOrderId() {
                return null;
            }
            
            public final void setReturnOrderId(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\b\u00a8\u00066"}, d2 = {"Lcom/android/ctgapp/entity/OrderEntity$DataBean$RecordsBean$CtgOrderPayBean;", "Ljava/io/Serializable;", "()V", "alipayCash", "", "getAlipayCash", "()Ljava/lang/Object;", "setAlipayCash", "(Ljava/lang/Object;)V", "cashReplaceId", "getCashReplaceId", "setCashReplaceId", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "leftCash", "getLeftCash", "setLeftCash", "orderId", "getOrderId", "setOrderId", "orderPayId", "getOrderPayId", "setOrderPayId", "payWay", "", "getPayWay", "()I", "setPayWay", "(I)V", "repalceCash", "getRepalceCash", "setRepalceCash", "thirdOrderNo", "getThirdOrderNo", "setThirdOrderNo", "thirdPartyPay", "getThirdPartyPay", "setThirdPartyPay", "totalReturnCash", "", "getTotalReturnCash", "()D", "setTotalReturnCash", "(D)V", "updateTime", "getUpdateTime", "setUpdateTime", "wxPayCash", "getWxPayCash", "setWxPayCash", "app_WLDebug"})
            public static final class CtgOrderPayBean implements java.io.Serializable {
                
                /**
                 * orderPayId : 57838af4eeb566e95a11c2632192ea46
                 * orderId : 2c875556c8608114ff45ef6b9a196b77
                 * cashReplaceId : null
                 * repalceCash : null
                 * leftCash : null
                 * wxPayCash : null
                 * alipayCash : null
                 * payWay : 1
                 * thirdPartyPay : null
                 * thirdOrderNo : null
                 * totalReturnCash : 0
                 * createTime : 2020-10-24 11:16:41
                 * updateTime : 2020-10-24 11:16:40
                 */
                @org.jetbrains.annotations.Nullable()
                private java.lang.String orderPayId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String orderId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object cashReplaceId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object repalceCash;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object leftCash;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object wxPayCash;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object alipayCash;
                private int payWay = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object thirdPartyPay;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object thirdOrderNo;
                private double totalReturnCash = 0.0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String createTime;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String updateTime;
                
                public CtgOrderPayBean() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getOrderPayId() {
                    return null;
                }
                
                public final void setOrderPayId(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getOrderId() {
                    return null;
                }
                
                public final void setOrderId(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getCashReplaceId() {
                    return null;
                }
                
                public final void setCashReplaceId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getRepalceCash() {
                    return null;
                }
                
                public final void setRepalceCash(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getLeftCash() {
                    return null;
                }
                
                public final void setLeftCash(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getWxPayCash() {
                    return null;
                }
                
                public final void setWxPayCash(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getAlipayCash() {
                    return null;
                }
                
                public final void setAlipayCash(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final int getPayWay() {
                    return 0;
                }
                
                public final void setPayWay(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getThirdPartyPay() {
                    return null;
                }
                
                public final void setThirdPartyPay(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getThirdOrderNo() {
                    return null;
                }
                
                public final void setThirdOrderNo(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final double getTotalReturnCash() {
                    return 0.0;
                }
                
                public final void setTotalReturnCash(double p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getCreateTime() {
                    return null;
                }
                
                public final void setCreateTime(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getUpdateTime() {
                    return null;
                }
                
                public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
            }
        }
    }
}