package com.android.ctgapp.entity.mine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpDebug"})
public final class PrepaymentChildEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"count":4,"allMoney":40.64,"page":{"records":[{"id":712,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":20,"returnAmount":0,"orderId":"DD20210603223933651OZTR072","settleWay":null,"isSettled":0,"createTime":"2021-06-03 22:39:34","updateTime":"2021-06-03 22:39:33","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":797,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163455458ZIBC184","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:42:57","updateTime":"2021-06-04 16:42:57","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":798,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163447982GVOT182","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:49:14","updateTime":"2021-06-04 16:49:13","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":849,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":20,"returnAmount":0,"orderId":"DD20210605150510194XTXY129","settleWay":null,"isSettled":0,"createTime":"2021-06-05 15:05:10","updateTime":"2021-06-05 15:05:10","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null}],"total":4,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean data;
    
    public PrepaymentChildEntity() {
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
    public final com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean;", "", "()V", "allMoney", "", "getAllMoney", "()D", "setAllMoney", "(D)V", "count", "", "getCount", "()I", "setCount", "(I)V", "page", "Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean$PageBean;", "getPage", "()Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean$PageBean;", "setPage", "(Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean$PageBean;)V", "PageBean", "app_hqpDebug"})
    public static final class DataBean {
        
        /**
         * count : 4
         * allMoney : 40.64
         * page : {"records":[{"id":712,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":20,"returnAmount":0,"orderId":"DD20210603223933651OZTR072","settleWay":null,"isSettled":0,"createTime":"2021-06-03 22:39:34","updateTime":"2021-06-03 22:39:33","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":797,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163455458ZIBC184","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:42:57","updateTime":"2021-06-04 16:42:57","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":798,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163447982GVOT182","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:49:14","updateTime":"2021-06-04 16:49:13","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":849,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":20,"returnAmount":0,"orderId":"DD20210605150510194XTXY129","settleWay":null,"isSettled":0,"createTime":"2021-06-05 15:05:10","updateTime":"2021-06-05 15:05:10","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null}],"total":4,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
         */
        private int count = 0;
        private double allMoney = 0.0;
        @org.jetbrains.annotations.Nullable()
        private com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean.PageBean page;
        
        public DataBean() {
            super();
        }
        
        public final int getCount() {
            return 0;
        }
        
        public final void setCount(int p0) {
        }
        
        public final double getAllMoney() {
            return 0.0;
        }
        
        public final void setAllMoney(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean.PageBean getPage() {
            return null;
        }
        
        public final void setPage(@org.jetbrains.annotations.Nullable()
        com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean.PageBean p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R \u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\"\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001a\u0010\'\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\u001a\u0010*\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\r\u00a8\u0006."}, d2 = {"Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean$PageBean;", "", "()V", "countId", "getCountId", "()Ljava/lang/Object;", "setCountId", "(Ljava/lang/Object;)V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "isHitCount", "", "()Z", "setHitCount", "(Z)V", "isOptimizeCountSql", "setOptimizeCountSql", "isSearchCount", "setSearchCount", "maxLimit", "getMaxLimit", "setMaxLimit", "orders", "", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "pages", "getPages", "setPages", "records", "Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean$PageBean$RecordsBean;", "getRecords", "setRecords", "size", "getSize", "setSize", "total", "getTotal", "setTotal", "RecordsBean", "app_hqpDebug"})
        public static final class PageBean {
            
            /**
             * records : [{"id":712,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":20,"returnAmount":0,"orderId":"DD20210603223933651OZTR072","settleWay":null,"isSettled":0,"createTime":"2021-06-03 22:39:34","updateTime":"2021-06-03 22:39:33","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":797,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163455458ZIBC184","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:42:57","updateTime":"2021-06-04 16:42:57","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":798,"companyId":65551,"clientCompanyId":12345,"billCycleNum":"ZD20210604203914970LADH010","amount":0.32,"returnAmount":0,"orderId":"DD20210604163447982GVOT182","settleWay":null,"isSettled":0,"createTime":"2021-06-04 16:49:14","updateTime":"2021-06-04 16:49:13","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null},{"id":849,"companyId":65551,"clientCompanyId":12345,"billCycleNum":null,"amount":20,"returnAmount":0,"orderId":"DD20210605150510194XTXY129","settleWay":null,"isSettled":0,"createTime":"2021-06-05 15:05:10","updateTime":"2021-06-05 15:05:10","companyName":null,"linkMan":null,"thisMoney":null,"allMoney":null,"noPayMoney":null,"count":null,"isAllow":null,"orderList":null}]
             * total : 4
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
            private java.util.List<com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean.PageBean.RecordsBean> records;
            @org.jetbrains.annotations.Nullable()
            private java.util.List<?> orders;
            
            public PageBean() {
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
            public final java.util.List<com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean.PageBean.RecordsBean> getRecords() {
                return null;
            }
            
            public final void setRecords(@org.jetbrains.annotations.Nullable()
            java.util.List<com.android.ctgapp.entity.mine.PrepaymentChildEntity.DataBean.PageBean.RecordsBean> p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<?> getOrders() {
                return null;
            }
            
            public final void setOrders(@org.jetbrains.annotations.Nullable()
            java.util.List<?> p0) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007R\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010&\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0017\"\u0004\b(\u0010\u0019R\u001c\u0010)\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0005\"\u0004\b*\u0010\u0007R\u001a\u0010+\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u001c\u0010-\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0005\"\u0004\b/\u0010\u0007R\u001c\u00100\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0005\"\u0004\b2\u0010\u0007R\u001c\u00103\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0011\"\u0004\b5\u0010\u0013R\u001c\u00106\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0005\"\u0004\b8\u0010\u0007R\u001a\u00109\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000b\"\u0004\b;\u0010\rR\u001a\u0010<\u001a\u00020=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0005\"\u0004\bD\u0010\u0007R\u001c\u0010E\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0005\"\u0004\bG\u0010\u0007R\u001c\u0010H\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0011\"\u0004\bJ\u0010\u0013\u00a8\u0006K"}, d2 = {"Lcom/android/ctgapp/entity/mine/PrepaymentChildEntity$DataBean$PageBean$RecordsBean;", "", "()V", "allMoney", "getAllMoney", "()Ljava/lang/Object;", "setAllMoney", "(Ljava/lang/Object;)V", "amount", "", "getAmount", "()D", "setAmount", "(D)V", "billCycleNum", "", "getBillCycleNum", "()Ljava/lang/String;", "setBillCycleNum", "(Ljava/lang/String;)V", "clientCompanyId", "", "getClientCompanyId", "()I", "setClientCompanyId", "(I)V", "companyId", "getCompanyId", "setCompanyId", "companyName", "getCompanyName", "setCompanyName", "count", "getCount", "setCount", "createTime", "getCreateTime", "setCreateTime", "id", "getId", "setId", "isAllow", "setAllow", "isSettled", "setSettled", "linkMan", "getLinkMan", "setLinkMan", "noPayMoney", "getNoPayMoney", "setNoPayMoney", "orderId", "getOrderId", "setOrderId", "orderList", "getOrderList", "setOrderList", "returnAmount", "getReturnAmount", "setReturnAmount", "selected", "", "getSelected", "()Z", "setSelected", "(Z)V", "settleWay", "getSettleWay", "setSettleWay", "thisMoney", "getThisMoney", "setThisMoney", "updateTime", "getUpdateTime", "setUpdateTime", "app_hqpDebug"})
            public static final class RecordsBean {
                
                /**
                 * id : 712
                 * companyId : 65551
                 * clientCompanyId : 12345
                 * billCycleNum : ZD20210604203914970LADH010
                 * amount : 20.0
                 * returnAmount : 0.0
                 * orderId : DD20210603223933651OZTR072
                 * settleWay : null
                 * isSettled : 0
                 * createTime : 2021-06-03 22:39:34
                 * updateTime : 2021-06-03 22:39:33
                 * companyName : null
                 * linkMan : null
                 * thisMoney : null
                 * allMoney : null
                 * noPayMoney : null
                 * count : null
                 * isAllow : null
                 * orderList : null
                 */
                private int id = 0;
                private int companyId = 0;
                private int clientCompanyId = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String billCycleNum;
                private double amount = 0.0;
                private double returnAmount = 0.0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String orderId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object settleWay;
                private int isSettled = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String createTime;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String updateTime;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object companyName;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object linkMan;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object thisMoney;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object allMoney;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object noPayMoney;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object count;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object isAllow;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object orderList;
                private boolean selected = false;
                
                public RecordsBean() {
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
                
                public final int getClientCompanyId() {
                    return 0;
                }
                
                public final void setClientCompanyId(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getBillCycleNum() {
                    return null;
                }
                
                public final void setBillCycleNum(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public final double getAmount() {
                    return 0.0;
                }
                
                public final void setAmount(double p0) {
                }
                
                public final double getReturnAmount() {
                    return 0.0;
                }
                
                public final void setReturnAmount(double p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getOrderId() {
                    return null;
                }
                
                public final void setOrderId(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
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
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getCompanyName() {
                    return null;
                }
                
                public final void setCompanyName(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getLinkMan() {
                    return null;
                }
                
                public final void setLinkMan(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getThisMoney() {
                    return null;
                }
                
                public final void setThisMoney(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getAllMoney() {
                    return null;
                }
                
                public final void setAllMoney(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getNoPayMoney() {
                    return null;
                }
                
                public final void setNoPayMoney(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getCount() {
                    return null;
                }
                
                public final void setCount(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object isAllow() {
                    return null;
                }
                
                public final void setAllow(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getOrderList() {
                    return null;
                }
                
                public final void setOrderList(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final boolean getSelected() {
                    return false;
                }
                
                public final void setSelected(boolean p0) {
                }
            }
        }
    }
}