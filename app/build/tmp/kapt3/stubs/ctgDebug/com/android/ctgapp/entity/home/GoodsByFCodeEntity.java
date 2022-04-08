package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_ctgDebug"})
public final class GoodsByFCodeEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"goodsList":{"records":[{"salesPrice":14,"unit":"付","id":"73","imgs":null,"detailImgs":["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"],"stock":"1","nname":"05款骊威倒车镜(5线)（左）","nno":"HC-NS-003","categoryName":"轮胎","companyId":12345,"companyUuid":null,"brandid":"361","fcode":"106-10","sales":0,"keyName":null,"images":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","brandName":"欧睿特","shopId":"SHOP_ID_0002","specStyle":null,"orgBrandName":null,"buyLimit":null,"showZero":null,"costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"tagCode":null,"mbid":"361","description":"","ownSa":0,"im":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","do_show_zero":null,"ctgcoding":""}],"total":1,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"searchCount":true,"pages":1},"brandList":[{"id":"361","brandName":"欧睿特","fcode":null,"num":null,"fname":null,"logo":null,"pinyin":null,"quanpin":null}]}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean data;
    private boolean isSuccess = false;
    
    public GoodsByFCodeEntity() {
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
    public final com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean;", "", "()V", "brandList", "", "Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$BrandListBean;", "getBrandList", "()Ljava/util/List;", "setBrandList", "(Ljava/util/List;)V", "categoryVos", "Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$CategoryVosBean;", "getCategoryVos", "setCategoryVos", "fcodeVos", "Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$FcodeVosBean;", "getFcodeVos", "setFcodeVos", "goodsList", "Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$GoodsListBean;", "getGoodsList", "()Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$GoodsListBean;", "setGoodsList", "(Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$GoodsListBean;)V", "BrandListBean", "CategoryVosBean", "FcodeVosBean", "GoodsListBean", "app_ctgDebug"})
    public static final class DataBean {
        
        /**
         * goodsList : {"records":[{"salesPrice":14,"unit":"付","id":"73","imgs":null,"detailImgs":["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"],"stock":"1","nname":"05款骊威倒车镜(5线)（左）","nno":"HC-NS-003","categoryName":"轮胎","companyId":12345,"companyUuid":null,"brandid":"361","fcode":"106-10","sales":0,"keyName":null,"images":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","brandName":"欧睿特","shopId":"SHOP_ID_0002","specStyle":null,"orgBrandName":null,"buyLimit":null,"showZero":null,"costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"tagCode":null,"mbid":"361","description":"","ownSa":0,"im":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","do_show_zero":null,"ctgcoding":""}],"total":1,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"searchCount":true,"pages":1}
         * brandList : [{"id":"361","brandName":"欧睿特","fcode":null,"num":null,"fname":null,"logo":null,"pinyin":null,"quanpin":null}]
         */
        @org.jetbrains.annotations.Nullable()
        private com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.GoodsListBean goodsList;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.BrandListBean> brandList;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.CategoryVosBean> categoryVos;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.FcodeVosBean> fcodeVos;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.GoodsListBean getGoodsList() {
            return null;
        }
        
        public final void setGoodsList(@org.jetbrains.annotations.Nullable()
        com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.GoodsListBean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.BrandListBean> getBrandList() {
            return null;
        }
        
        public final void setBrandList(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.BrandListBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.CategoryVosBean> getCategoryVos() {
            return null;
        }
        
        public final void setCategoryVos(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.CategoryVosBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.FcodeVosBean> getFcodeVos() {
            return null;
        }
        
        public final void setFcodeVos(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.FcodeVosBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$FcodeVosBean;", "", "()V", "fcode", "", "getFcode", "()Ljava/lang/String;", "setFcode", "(Ljava/lang/String;)V", "fname", "getFname", "setFname", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "app_ctgDebug"})
        public static final class FcodeVosBean {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String fcode;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String fname;
            private boolean select = false;
            
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
            
            public final boolean getSelect() {
                return false;
            }
            
            public final void setSelect(boolean p0) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001a\u0010\"\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b\u00a8\u0006%"}, d2 = {"Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$GoodsListBean;", "", "()V", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "isHitCount", "", "()Z", "setHitCount", "(Z)V", "isOptimizeCountSql", "setOptimizeCountSql", "isSearchCount", "setSearchCount", "orders", "", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "pages", "getPages", "setPages", "records", "Lcom/android/ctgapp/entity/home/GoodsItemEntity;", "getRecords", "setRecords", "size", "getSize", "setSize", "total", "getTotal", "setTotal", "app_ctgDebug"})
        public static final class GoodsListBean {
            
            /**
             * records : [{"salesPrice":14,"unit":"付","id":"73","imgs":null,"detailImgs":["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"],"stock":"1","nname":"05款骊威倒车镜(5线)（左）","nno":"HC-NS-003","categoryName":"轮胎","companyId":12345,"companyUuid":null,"brandid":"361","fcode":"106-10","sales":0,"keyName":null,"images":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","brandName":"欧睿特","shopId":"SHOP_ID_0002","specStyle":null,"orgBrandName":null,"buyLimit":null,"showZero":null,"costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"tagCode":null,"mbid":"361","description":"","ownSa":0,"im":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","do_show_zero":null,"ctgcoding":""}]
             * total : 1
             * size : 20
             * current : 1
             * orders : []
             * optimizeCountSql : true
             * hitCount : false
             * searchCount : true
             * pages : 1
             */
            private int total = 0;
            private int size = 0;
            private int current = 0;
            private boolean isOptimizeCountSql = false;
            private boolean isHitCount = false;
            private boolean isSearchCount = false;
            private int pages = 0;
            @org.jetbrains.annotations.Nullable()
            private java.util.List<com.android.ctgapp.entity.home.GoodsItemEntity> records;
            @org.jetbrains.annotations.Nullable()
            private java.util.List<?> orders;
            
            public GoodsListBean() {
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
            public final java.util.List<com.android.ctgapp.entity.home.GoodsItemEntity> getRecords() {
                return null;
            }
            
            public final void setRecords(@org.jetbrains.annotations.Nullable()
            java.util.List<com.android.ctgapp.entity.home.GoodsItemEntity> p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<?> getOrders() {
                return null;
            }
            
            public final void setOrders(@org.jetbrains.annotations.Nullable()
            java.util.List<?> p0) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006&"}, d2 = {"Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$BrandListBean;", "", "()V", "brandName", "", "getBrandName", "()Ljava/lang/String;", "setBrandName", "(Ljava/lang/String;)V", "fcode", "getFcode", "()Ljava/lang/Object;", "setFcode", "(Ljava/lang/Object;)V", "fname", "getFname", "setFname", "id", "getId", "setId", "logo", "getLogo", "setLogo", "num", "getNum", "setNum", "pinyin", "getPinyin", "setPinyin", "quanpin", "getQuanpin", "setQuanpin", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "app_ctgDebug"})
        public static final class BrandListBean {
            
            /**
             * id : 361
             * brandName : 欧睿特
             * fcode : null
             * num : null
             * fname : null
             * logo : null
             * pinyin : null
             * quanpin : null
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String id;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String brandName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object fcode;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object num;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object fname;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object logo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object pinyin;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object quanpin;
            private boolean select = false;
            
            public BrandListBean() {
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
            public final java.lang.String getBrandName() {
                return null;
            }
            
            public final void setBrandName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getFcode() {
                return null;
            }
            
            public final void setFcode(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getNum() {
                return null;
            }
            
            public final void setNum(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getFname() {
                return null;
            }
            
            public final void setFname(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getLogo() {
                return null;
            }
            
            public final void setLogo(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getPinyin() {
                return null;
            }
            
            public final void setPinyin(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getQuanpin() {
                return null;
            }
            
            public final void setQuanpin(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final boolean getSelect() {
                return false;
            }
            
            public final void setSelect(boolean p0) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$CategoryVosBean;", "", "()V", "ctgnum", "", "getCtgnum", "()Ljava/lang/String;", "setCtgnum", "(Ljava/lang/String;)V", "fname", "getFname", "setFname", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "app_ctgDebug"})
        public static final class CategoryVosBean {
            
            /**
             * ctgnum : 3707201
             * fname : 火花塞
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String ctgnum;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String fname;
            private boolean select = false;
            
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
            
            public final boolean getSelect() {
                return false;
            }
            
            public final void setSelect(boolean p0) {
            }
        }
    }
}