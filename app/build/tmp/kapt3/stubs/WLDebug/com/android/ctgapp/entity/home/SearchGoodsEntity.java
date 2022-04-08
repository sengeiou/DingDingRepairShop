package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/entity/home/SearchGoodsEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "success", "", "getSuccess", "()Z", "setSuccess", "(Z)V", "DataBean", "app_WLDebug"})
public final class SearchGoodsEntity {
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean data;
    private boolean success = false;
    
    public SearchGoodsEntity() {
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
    public final com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean p0) {
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean;", "", "()V", "brandList", "", "Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$BrandListBean;", "getBrandList", "()Ljava/util/List;", "setBrandList", "(Ljava/util/List;)V", "categoryVos", "Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$CategoryVosBean;", "getCategoryVos", "setCategoryVos", "fcodeVos", "Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$FcodeVosBean;", "getFcodeVos", "setFcodeVos", "goodsList", "Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$GoodsListBean;", "getGoodsList", "()Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$GoodsListBean;", "setGoodsList", "(Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$GoodsListBean;)V", "BrandListBean", "CategoryVosBean", "FcodeVosBean", "GoodsListBean", "app_WLDebug"})
    public static final class DataBean {
        @org.jetbrains.annotations.Nullable()
        private com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.GoodsListBean goodsList;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.BrandListBean> brandList;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.CategoryVosBean> categoryVos;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.FcodeVosBean> fcodeVos;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.GoodsListBean getGoodsList() {
            return null;
        }
        
        public final void setGoodsList(@org.jetbrains.annotations.Nullable()
        com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.GoodsListBean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.BrandListBean> getBrandList() {
            return null;
        }
        
        public final void setBrandList(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.BrandListBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.CategoryVosBean> getCategoryVos() {
            return null;
        }
        
        public final void setCategoryVos(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.CategoryVosBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.FcodeVosBean> getFcodeVos() {
            return null;
        }
        
        public final void setFcodeVos(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.FcodeVosBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\"\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001a\u0010\'\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013R\u001a\u0010*\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR\u001a\u0010-\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\r\u00a8\u00061"}, d2 = {"Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$GoodsListBean;", "", "()V", "countId", "getCountId", "()Ljava/lang/Object;", "setCountId", "(Ljava/lang/Object;)V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hitCount", "", "getHitCount", "()Z", "setHitCount", "(Z)V", "maxLimit", "getMaxLimit", "setMaxLimit", "optimizeCountSql", "getOptimizeCountSql", "setOptimizeCountSql", "orders", "", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "pages", "getPages", "setPages", "records", "Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$GoodsListBean$RecordsBean;", "getRecords", "setRecords", "searchCount", "getSearchCount", "setSearchCount", "size", "getSize", "setSize", "total", "getTotal", "setTotal", "RecordsBean", "app_WLDebug"})
        public static final class GoodsListBean {
            @org.jetbrains.annotations.Nullable()
            private java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.GoodsListBean.RecordsBean> records;
            private int total = 0;
            private int size = 0;
            private int current = 0;
            @org.jetbrains.annotations.Nullable()
            private java.util.List<?> orders;
            private boolean optimizeCountSql = false;
            private boolean hitCount = false;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object countId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object maxLimit;
            private boolean searchCount = false;
            private int pages = 0;
            
            public GoodsListBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.GoodsListBean.RecordsBean> getRecords() {
                return null;
            }
            
            public final void setRecords(@org.jetbrains.annotations.Nullable()
            java.util.List<com.android.ctgapp.entity.home.SearchGoodsEntity.DataBean.GoodsListBean.RecordsBean> p0) {
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
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<?> getOrders() {
                return null;
            }
            
            public final void setOrders(@org.jetbrains.annotations.Nullable()
            java.util.List<?> p0) {
            }
            
            public final boolean getOptimizeCountSql() {
                return false;
            }
            
            public final void setOptimizeCountSql(boolean p0) {
            }
            
            public final boolean getHitCount() {
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
            
            public final boolean getSearchCount() {
                return false;
            }
            
            public final void setSearchCount(boolean p0) {
            }
            
            public final int getPages() {
                return 0;
            }
            
            public final void setPages(int p0) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010 \n\u0003\b\u0098\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u001c\u0010,\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u001c\u0010/\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u001c\u00102\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R\u001c\u00105\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000b\"\u0004\b7\u0010\rR\u001c\u00108\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000b\"\u0004\b:\u0010\rR\u001c\u0010;\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000b\"\u0004\b=\u0010\rR\u001c\u0010>\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010#\"\u0004\b@\u0010%R\u001c\u0010A\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\rR\u001c\u0010D\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u000b\"\u0004\bF\u0010\rR \u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000b\"\u0004\bO\u0010\rR\u001c\u0010P\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\rR\u001c\u0010S\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u000b\"\u0004\bU\u0010\rR\u001c\u0010V\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u000b\"\u0004\bX\u0010\rR\u001c\u0010Y\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010#\"\u0004\b[\u0010%R\u001c\u0010\\\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u000b\"\u0004\b^\u0010\rR\u001c\u0010_\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010#\"\u0004\ba\u0010%R\u001c\u0010b\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010#\"\u0004\bd\u0010%R\u001a\u0010e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0006\"\u0004\bg\u0010\bR\u001c\u0010h\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u000b\"\u0004\bj\u0010\rR\u001c\u0010k\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010#\"\u0004\bm\u0010%R\u001c\u0010n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u000b\"\u0004\bp\u0010\rR\u001c\u0010q\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u000b\"\u0004\br\u0010\rR\u001c\u0010s\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u000b\"\u0004\bt\u0010\rR\u001a\u0010u\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u0006\"\u0004\bv\u0010\bR\u001c\u0010w\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u000b\"\u0004\by\u0010\rR\u001a\u0010z\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\u0006\"\u0004\b|\u0010\bR\u001c\u0010}\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u000b\"\u0004\b\u007f\u0010\rR\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010#\"\u0005\b\u0082\u0001\u0010%R\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010#\"\u0005\b\u0085\u0001\u0010%R\u001f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u000b\"\u0005\b\u0088\u0001\u0010\rR\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010#\"\u0005\b\u008b\u0001\u0010%R\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u000b\"\u0005\b\u008e\u0001\u0010\rR\u001f\u0010\u008f\u0001\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010#\"\u0005\b\u0091\u0001\u0010%R\u001f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010\u000b\"\u0005\b\u0094\u0001\u0010\rR\u001d\u0010\u0095\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010\u0006\"\u0005\b\u0097\u0001\u0010\bR\u001f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u000b\"\u0005\b\u009a\u0001\u0010\rR\u001f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010\u000b\"\u0005\b\u009d\u0001\u0010\rR\u001f\u0010\u009e\u0001\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010#\"\u0005\b\u00a0\u0001\u0010%R\u001f\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a2\u0001\u0010\u000b\"\u0005\b\u00a3\u0001\u0010\rR\u001f\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a5\u0001\u0010\u000b\"\u0005\b\u00a6\u0001\u0010\rR\u001f\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a8\u0001\u0010\u000b\"\u0005\b\u00a9\u0001\u0010\rR\u001f\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ab\u0001\u0010\u000b\"\u0005\b\u00ac\u0001\u0010\rR\u001d\u0010\u00ad\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ae\u0001\u0010\u0006\"\u0005\b\u00af\u0001\u0010\bR\u001d\u0010\u00b0\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b1\u0001\u0010\u0006\"\u0005\b\u00b2\u0001\u0010\bR\u001f\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b4\u0001\u0010\u000b\"\u0005\b\u00b5\u0001\u0010\rR\u001f\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b7\u0001\u0010\u000b\"\u0005\b\u00b8\u0001\u0010\rR\u001f\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ba\u0001\u0010\u000b\"\u0005\b\u00bb\u0001\u0010\rR\u001f\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bd\u0001\u0010\u000b\"\u0005\b\u00be\u0001\u0010\rR\u001f\u0010\u00bf\u0001\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c0\u0001\u0010#\"\u0005\b\u00c1\u0001\u0010%R\u001f\u0010\u00c2\u0001\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c3\u0001\u0010#\"\u0005\b\u00c4\u0001\u0010%R\u001d\u0010\u00c5\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c6\u0001\u0010\u0006\"\u0005\b\u00c7\u0001\u0010\bR\u001f\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c9\u0001\u0010\u000b\"\u0005\b\u00ca\u0001\u0010\rR\u001d\u0010\u00cb\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cc\u0001\u0010\u0006\"\u0005\b\u00cd\u0001\u0010\bR\u001f\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cf\u0001\u0010\u000b\"\u0005\b\u00d0\u0001\u0010\rR\u001f\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d2\u0001\u0010\u000b\"\u0005\b\u00d3\u0001\u0010\rR\u001f\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d5\u0001\u0010\u000b\"\u0005\b\u00d6\u0001\u0010\rR\u001f\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d8\u0001\u0010\u000b\"\u0005\b\u00d9\u0001\u0010\rR\u001f\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00db\u0001\u0010\u000b\"\u0005\b\u00dc\u0001\u0010\rR\u001f\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00de\u0001\u0010\u000b\"\u0005\b\u00df\u0001\u0010\r\u00a8\u0006\u00e0\u0001"}, d2 = {"Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$GoodsListBean$RecordsBean;", "", "()V", "agentGoodsId", "", "getAgentGoodsId", "()I", "setAgentGoodsId", "(I)V", "allocatePrice", "getAllocatePrice", "()Ljava/lang/Object;", "setAllocatePrice", "(Ljava/lang/Object;)V", "amount", "getAmount", "setAmount", "belongCompanyId", "getBelongCompanyId", "setBelongCompanyId", "belongCompanyName", "getBelongCompanyName", "setBelongCompanyName", "brandName", "getBrandName", "setBrandName", "brandid", "getBrandid", "setBrandid", "buyLimit", "getBuyLimit", "setBuyLimit", "categoryName", "", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "companyId", "getCompanyId", "setCompanyId", "companyUuid", "getCompanyUuid", "setCompanyUuid", "costPrice", "getCostPrice", "setCostPrice", "ctgcoding", "getCtgcoding", "setCtgcoding", "ctgnum", "getCtgnum", "setCtgnum", "defaultAutio", "getDefaultAutio", "setDefaultAutio", "defaultOperator", "getDefaultOperator", "setDefaultOperator", "defaultPrice", "getDefaultPrice", "setDefaultPrice", "description", "getDescription", "setDescription", "detUrl", "getDetUrl", "setDetUrl", "detailImgs", "getDetailImgs", "setDetailImgs", "detailVos", "", "getDetailVos", "()Ljava/util/List;", "setDetailVos", "(Ljava/util/List;)V", "do_show_zero", "getDo_show_zero", "setDo_show_zero", "erpGoodsId", "getErpGoodsId", "setErpGoodsId", "erpId", "getErpId", "setErpId", "factoryid", "getFactoryid", "setFactoryid", "fcode", "getFcode", "setFcode", "finalPrice", "getFinalPrice", "setFinalPrice", "fname", "getFname", "setFname", "goodsName", "getGoodsName", "setGoodsName", "id", "getId", "setId", "im", "getIm", "setIm", "images", "getImages", "setImages", "imgs", "getImgs", "setImgs", "isDeleted", "setDeleted", "isOnsale", "setOnsale", "isSet", "setSet", "keyName", "getKeyName", "setKeyName", "mbid", "getMbid", "setMbid", "minPrice", "getMinPrice", "setMinPrice", "nname", "getNname", "setNname", "nno", "getNno", "setNno", "noTaxPrice", "getNoTaxPrice", "setNoTaxPrice", "oe", "getOe", "setOe", "orgBrandName", "getOrgBrandName", "setOrgBrandName", "orgName", "getOrgName", "setOrgName", "ownPrice", "getOwnPrice", "setOwnPrice", "ownSa", "getOwnSa", "setOwnSa", "ownStock", "getOwnStock", "setOwnStock", "partGoodsId", "getPartGoodsId", "setPartGoodsId", "partModel", "getPartModel", "setPartModel", "quality", "getQuality", "setQuality", "rate", "getRate", "setRate", "remark", "getRemark", "setRemark", "retailPrice", "getRetailPrice", "setRetailPrice", "sales", "getSales", "setSales", "salesPrice", "getSalesPrice", "setSalesPrice", "setWay", "getSetWay", "setSetWay", "settingId", "getSettingId", "setSettingId", "shopId", "getShopId", "setShopId", "showZero", "getShowZero", "setShowZero", "spec", "getSpec", "setSpec", "specStyle", "getSpecStyle", "setSpecStyle", "stock", "getStock", "setStock", "subUrl", "getSubUrl", "setSubUrl", "suggestPrice", "getSuggestPrice", "setSuggestPrice", "tagCode", "getTagCode", "setTagCode", "unit", "getUnit", "setUnit", "userPrice", "getUserPrice", "setUserPrice", "warehouse", "getWarehouse", "setWarehouse", "wholesalePrice", "getWholesalePrice", "setWholesalePrice", "wsPrice", "getWsPrice", "setWsPrice", "app_WLDebug"})
            public static final class RecordsBean {
                private int salesPrice = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object unit;
                private int id = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object imgs;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object detailImgs;
                private int stock = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String nname;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String nno;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String categoryName;
                private int companyId = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object companyUuid;
                private int brandid = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String fcode;
                private int sales = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object keyName;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String images;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object brandName;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object shopId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String specStyle;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object orgBrandName;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object buyLimit;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object showZero;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object costPrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object noTaxPrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object retailPrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object wholesalePrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object allocatePrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object minPrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object defaultPrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object defaultOperator;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String orgName;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object defaultAutio;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object tagCode;
                private int mbid = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String description;
                private int ownSa = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object im;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object do_show_zero;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String ctgcoding;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object warehouse;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String oe;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String ctgnum;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String spec;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String fname;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object quality;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object remark;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object factoryid;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object ownStock;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object ownPrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object erpId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object isOnsale;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object isDeleted;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object partGoodsId;
                private int belongCompanyId = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String partModel;
                private int suggestPrice = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object subUrl;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object detUrl;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object belongCompanyName;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object setWay;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object rate;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object amount;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object finalPrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object userPrice;
                private int isSet = 0;
                private int agentGoodsId = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object erpGoodsId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object settingId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object wsPrice;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String goodsName;
                @org.jetbrains.annotations.Nullable()
                private java.util.List<?> detailVos;
                
                public RecordsBean() {
                    super();
                }
                
                public final int getSalesPrice() {
                    return 0;
                }
                
                public final void setSalesPrice(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getUnit() {
                    return null;
                }
                
                public final void setUnit(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final int getId() {
                    return 0;
                }
                
                public final void setId(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getImgs() {
                    return null;
                }
                
                public final void setImgs(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getDetailImgs() {
                    return null;
                }
                
                public final void setDetailImgs(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final int getStock() {
                    return 0;
                }
                
                public final void setStock(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getNname() {
                    return null;
                }
                
                public final void setNname(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getNno() {
                    return null;
                }
                
                public final void setNno(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getCategoryName() {
                    return null;
                }
                
                public final void setCategoryName(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public final int getCompanyId() {
                    return 0;
                }
                
                public final void setCompanyId(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getCompanyUuid() {
                    return null;
                }
                
                public final void setCompanyUuid(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final int getBrandid() {
                    return 0;
                }
                
                public final void setBrandid(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getFcode() {
                    return null;
                }
                
                public final void setFcode(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public final int getSales() {
                    return 0;
                }
                
                public final void setSales(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getKeyName() {
                    return null;
                }
                
                public final void setKeyName(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getImages() {
                    return null;
                }
                
                public final void setImages(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getBrandName() {
                    return null;
                }
                
                public final void setBrandName(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getShopId() {
                    return null;
                }
                
                public final void setShopId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getSpecStyle() {
                    return null;
                }
                
                public final void setSpecStyle(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getOrgBrandName() {
                    return null;
                }
                
                public final void setOrgBrandName(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getBuyLimit() {
                    return null;
                }
                
                public final void setBuyLimit(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getShowZero() {
                    return null;
                }
                
                public final void setShowZero(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getCostPrice() {
                    return null;
                }
                
                public final void setCostPrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getNoTaxPrice() {
                    return null;
                }
                
                public final void setNoTaxPrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getRetailPrice() {
                    return null;
                }
                
                public final void setRetailPrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getWholesalePrice() {
                    return null;
                }
                
                public final void setWholesalePrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getAllocatePrice() {
                    return null;
                }
                
                public final void setAllocatePrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getMinPrice() {
                    return null;
                }
                
                public final void setMinPrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getDefaultPrice() {
                    return null;
                }
                
                public final void setDefaultPrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getDefaultOperator() {
                    return null;
                }
                
                public final void setDefaultOperator(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getOrgName() {
                    return null;
                }
                
                public final void setOrgName(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getDefaultAutio() {
                    return null;
                }
                
                public final void setDefaultAutio(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getTagCode() {
                    return null;
                }
                
                public final void setTagCode(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final int getMbid() {
                    return 0;
                }
                
                public final void setMbid(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getDescription() {
                    return null;
                }
                
                public final void setDescription(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public final int getOwnSa() {
                    return 0;
                }
                
                public final void setOwnSa(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getIm() {
                    return null;
                }
                
                public final void setIm(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getDo_show_zero() {
                    return null;
                }
                
                public final void setDo_show_zero(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getCtgcoding() {
                    return null;
                }
                
                public final void setCtgcoding(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getWarehouse() {
                    return null;
                }
                
                public final void setWarehouse(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getOe() {
                    return null;
                }
                
                public final void setOe(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getCtgnum() {
                    return null;
                }
                
                public final void setCtgnum(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getSpec() {
                    return null;
                }
                
                public final void setSpec(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getFname() {
                    return null;
                }
                
                public final void setFname(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getQuality() {
                    return null;
                }
                
                public final void setQuality(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getRemark() {
                    return null;
                }
                
                public final void setRemark(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getFactoryid() {
                    return null;
                }
                
                public final void setFactoryid(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getOwnStock() {
                    return null;
                }
                
                public final void setOwnStock(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getOwnPrice() {
                    return null;
                }
                
                public final void setOwnPrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getErpId() {
                    return null;
                }
                
                public final void setErpId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object isOnsale() {
                    return null;
                }
                
                public final void setOnsale(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object isDeleted() {
                    return null;
                }
                
                public final void setDeleted(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getPartGoodsId() {
                    return null;
                }
                
                public final void setPartGoodsId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final int getBelongCompanyId() {
                    return 0;
                }
                
                public final void setBelongCompanyId(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getPartModel() {
                    return null;
                }
                
                public final void setPartModel(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public final int getSuggestPrice() {
                    return 0;
                }
                
                public final void setSuggestPrice(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getSubUrl() {
                    return null;
                }
                
                public final void setSubUrl(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getDetUrl() {
                    return null;
                }
                
                public final void setDetUrl(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getBelongCompanyName() {
                    return null;
                }
                
                public final void setBelongCompanyName(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getSetWay() {
                    return null;
                }
                
                public final void setSetWay(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getRate() {
                    return null;
                }
                
                public final void setRate(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getAmount() {
                    return null;
                }
                
                public final void setAmount(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getFinalPrice() {
                    return null;
                }
                
                public final void setFinalPrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getUserPrice() {
                    return null;
                }
                
                public final void setUserPrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final int isSet() {
                    return 0;
                }
                
                public final void setSet(int p0) {
                }
                
                public final int getAgentGoodsId() {
                    return 0;
                }
                
                public final void setAgentGoodsId(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getErpGoodsId() {
                    return null;
                }
                
                public final void setErpGoodsId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getSettingId() {
                    return null;
                }
                
                public final void setSettingId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getWsPrice() {
                    return null;
                }
                
                public final void setWsPrice(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getGoodsName() {
                    return null;
                }
                
                public final void setGoodsName(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.util.List<?> getDetailVos() {
                    return null;
                }
                
                public final void setDetailVos(@org.jetbrains.annotations.Nullable()
                java.util.List<?> p0) {
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$BrandListBean;", "", "()V", "brandName", "", "getBrandName", "()Ljava/lang/String;", "setBrandName", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "app_WLDebug"})
        public static final class BrandListBean {
            private int id = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String brandName;
            private boolean select = false;
            
            public BrandListBean() {
                super();
            }
            
            public final int getId() {
                return 0;
            }
            
            public final void setId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getBrandName() {
                return null;
            }
            
            public final void setBrandName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final boolean getSelect() {
                return false;
            }
            
            public final void setSelect(boolean p0) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$CategoryVosBean;", "", "()V", "ctgnum", "", "getCtgnum", "()Ljava/lang/String;", "setCtgnum", "(Ljava/lang/String;)V", "fname", "getFname", "setFname", "app_WLDebug"})
        public static final class CategoryVosBean {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String ctgnum;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String fname;
            
            public CategoryVosBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCtgnum() {
                return null;
            }
            
            public final void setCtgnum(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFname() {
                return null;
            }
            
            public final void setFname(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/android/ctgapp/entity/home/SearchGoodsEntity$DataBean$FcodeVosBean;", "", "()V", "fcode", "", "getFcode", "()Ljava/lang/String;", "setFcode", "(Ljava/lang/String;)V", "fname", "getFname", "setFname", "app_WLDebug"})
        public static final class FcodeVosBean {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String fcode;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String fname;
            
            public FcodeVosBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFcode() {
                return null;
            }
            
            public final void setFcode(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFname() {
                return null;
            }
            
            public final void setFname(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
    }
}