package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/entity/home/TrolleyEntity;", "Ljava/io/Serializable;", "()V", "data", "", "Lcom/android/ctgapp/entity/home/TrolleyEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpRelease"})
public final class TrolleyEntity implements java.io.Serializable {
    
    /**
     * status : 0
     * msg : null
     * data : [{"companyName":"无锡畅通汽配公司","companyId":12345,"companyUuid":null,"details":[{"nno":null,"companyName":null,"companyId":null,"factoryid":"uue8qw23132d","num":"uue8qw23132d","goodId":"42","stock":"233","imgName":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/2b9abbf3-0e99-4339-899d-3eba452cc7ac.jpg","oe":"","price":10,"nname":"12311313","id":"","imgNames":null,"fcode":"106-10","categoryName":null,"shopId":null,"specStyle":"","costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"buyLimit":null,"sales":null,"ctgcoding":null,"brandId":null,"detailImgs":null,"description":null,"brandName":"","isDeleted":0,"isOnsale":1,"shoppingId":14,"sellWay":0,"mbid":null}]}]
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    private boolean isSuccess = false;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.TrolleyEntity.DataBean> data;
    
    public TrolleyEntity() {
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
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.home.TrolleyEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.TrolleyEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006)"}, d2 = {"Lcom/android/ctgapp/entity/home/TrolleyEntity$DataBean;", "Ljava/io/Serializable;", "()V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "companyName", "", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "companyUuid", "", "getCompanyUuid", "()Ljava/lang/Object;", "setCompanyUuid", "(Ljava/lang/Object;)V", "details", "", "Lcom/android/ctgapp/entity/home/TrolleyEntity$DataBean$DetailsBean;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "supportWithCredit", "", "getSupportWithCredit", "()Ljava/lang/Boolean;", "setSupportWithCredit", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "titleSelect", "getTitleSelect", "()Z", "setTitleSelect", "(Z)V", "DetailsBean", "app_hqpRelease"})
    public static final class DataBean implements java.io.Serializable {
        
        /**
         * companyName : 无锡畅通汽配公司
         * companyId : 12345
         * companyUuid : null
         * details : [{"nno":null,"companyName":null,"companyId":null,"factoryid":"uue8qw23132d","num":"uue8qw23132d","goodId":"42","stock":"233","imgName":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/2b9abbf3-0e99-4339-899d-3eba452cc7ac.jpg","oe":"","price":10,"nname":"12311313","id":"","imgNames":null,"fcode":"106-10","categoryName":null,"shopId":null,"specStyle":"","costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"buyLimit":null,"sales":null,"ctgcoding":null,"brandId":null,"detailImgs":null,"description":null,"brandName":"","isDeleted":0,"isOnsale":1,"shoppingId":14,"sellWay":0,"mbid":null}]
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String companyName;
        private int companyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object companyUuid;
        private boolean titleSelect = false;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean supportWithCredit;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.TrolleyEntity.DataBean.DetailsBean> details;
        
        public DataBean() {
            super();
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
        public final java.lang.Object getCompanyUuid() {
            return null;
        }
        
        public final void setCompanyUuid(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final boolean getTitleSelect() {
            return false;
        }
        
        public final void setTitleSelect(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getSupportWithCredit() {
            return null;
        }
        
        public final void setSupportWithCredit(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.TrolleyEntity.DataBean.DetailsBean> getDetails() {
            return null;
        }
        
        public final void setDetails(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.TrolleyEntity.DataBean.DetailsBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\bW\n\u0002\u0010\u0006\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001c\u00104\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010\u0015R\u001c\u00107\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015R\u001c\u0010:\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010\u0015R\u001a\u0010=\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010\u0015R\u001c\u0010@\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010\u0015R\u001c\u0010C\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0013\"\u0004\bE\u0010\u0015R\u001c\u0010F\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\bR\u001a\u0010I\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010J\"\u0004\bN\u0010LR\u001a\u0010O\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR\u001a\u0010Q\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010LR\u001c\u0010S\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR\u001c\u0010V\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0013\"\u0004\bX\u0010\u0015R\u001c\u0010Y\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0006\"\u0004\b[\u0010\bR\u001c\u0010\\\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0006\"\u0004\b^\u0010\bR\u001a\u0010_\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010J\"\u0004\ba\u0010LR\u001c\u0010b\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0013\"\u0004\bd\u0010\u0015R\u001c\u0010e\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0013\"\u0004\bg\u0010\u0015R\u001a\u0010h\u001a\u00020iX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001c\u0010n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0006\"\u0004\bp\u0010\bR\u001c\u0010q\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u0013\"\u0004\bs\u0010\u0015R\u001a\u0010t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010J\"\u0004\bv\u0010LR\u001c\u0010w\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u0006\"\u0004\by\u0010\bR\u001a\u0010z\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010J\"\u0004\b|\u0010LR\u001c\u0010}\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u0013\"\u0004\b\u007f\u0010\u0015R\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u0013\"\u0005\b\u0082\u0001\u0010\u0015R\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\u0006\"\u0005\b\u0085\u0001\u0010\b\u00a8\u0006\u0086\u0001"}, d2 = {"Lcom/android/ctgapp/entity/home/TrolleyEntity$DataBean$DetailsBean;", "Ljava/io/Serializable;", "()V", "allocatePrice", "", "getAllocatePrice", "()Ljava/lang/Object;", "setAllocatePrice", "(Ljava/lang/Object;)V", "brandId", "", "getBrandId", "()Ljava/lang/Integer;", "setBrandId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "brandName", "", "getBrandName", "()Ljava/lang/String;", "setBrandName", "(Ljava/lang/String;)V", "buyLimit", "getBuyLimit", "setBuyLimit", "categoryName", "getCategoryName", "setCategoryName", "companyId", "getCompanyId", "setCompanyId", "companyName", "getCompanyName", "setCompanyName", "costPrice", "getCostPrice", "setCostPrice", "ctgnum", "getCtgnum", "setCtgnum", "defaultAutio", "getDefaultAutio", "setDefaultAutio", "defaultOperator", "getDefaultOperator", "setDefaultOperator", "defaultPrice", "getDefaultPrice", "setDefaultPrice", "description", "getDescription", "setDescription", "factoryid", "getFactoryid", "setFactoryid", "fcode", "getFcode", "setFcode", "goodId", "getGoodId", "setGoodId", "goodsName", "getGoodsName", "setGoodsName", "id", "getId", "setId", "imgName", "getImgName", "setImgName", "imgNames", "getImgNames", "setImgNames", "isDeleted", "()I", "setDeleted", "(I)V", "isOnsale", "setOnsale", "isSelected", "setSelected", "isSet", "setSet", "minPrice", "getMinPrice", "setMinPrice", "nname", "getNname", "setNname", "nno", "getNno", "setNno", "noTaxPrice", "getNoTaxPrice", "setNoTaxPrice", "num", "getNum", "setNum", "oe", "getOe", "setOe", "orgName", "getOrgName", "setOrgName", "price", "", "getPrice", "()D", "setPrice", "(D)V", "retailPrice", "getRetailPrice", "setRetailPrice", "sales", "getSales", "setSales", "sellWay", "getSellWay", "setSellWay", "shopId", "getShopId", "setShopId", "shoppingId", "getShoppingId", "setShoppingId", "specStyle", "getSpecStyle", "setSpecStyle", "stock", "getStock", "setStock", "wholesalePrice", "getWholesalePrice", "setWholesalePrice", "app_hqpRelease"})
        public static final class DetailsBean implements java.io.Serializable {
            
            /**
             * nno : null
             * companyName : null
             * companyId : null
             * factoryid : uue8qw23132d
             * num : uue8qw23132d
             * goodId : 42
             * stock : 233
             * imgName : http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/2b9abbf3-0e99-4339-899d-3eba452cc7ac.jpg
             * oe :
             * price : 10.0
             * nname : 12311313
             * id :
             * imgNames : null
             * fcode : 106-10
             * categoryName : null
             * shopId : null
             * specStyle :
             * costPrice : null
             * noTaxPrice : null
             * retailPrice : null
             * wholesalePrice : null
             * allocatePrice : null
             * minPrice : null
             * defaultPrice : null
             * defaultOperator : null
             * orgName : null
             * defaultAutio : null
             * buyLimit : null
             * sales : null
             * ctgcoding : null
             * brandId : null
             * detailImgs : null
             * description : null
             * brandName :
             * isDeleted : 0
             * isOnsale : 1
             * shoppingId : 14
             * sellWay : 0
             * mbid : null
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object nno;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object ctgnum;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object companyName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String companyId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String factoryid;
            private int num = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String stock;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String imgName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String oe;
            private double price = 0.0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String nname;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String id;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object imgNames;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String fcode;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object categoryName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object shopId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String specStyle;
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
            private java.lang.Integer buyLimit;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String sales;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer brandId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object description;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String brandName;
            private int isDeleted = 0;
            private int isOnsale = 0;
            private int shoppingId = 0;
            private int sellWay = 0;
            private int isSet = 0;
            private int isSelected = 0;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String goodsName = "";
            
            public DetailsBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getNno() {
                return null;
            }
            
            public final void setNno(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCtgnum() {
                return null;
            }
            
            public final void setCtgnum(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCompanyName() {
                return null;
            }
            
            public final void setCompanyName(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCompanyId() {
                return null;
            }
            
            public final void setCompanyId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFactoryid() {
                return null;
            }
            
            public final void setFactoryid(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final int getNum() {
                return 0;
            }
            
            public final void setNum(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getGoodId() {
                return null;
            }
            
            public final void setGoodId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStock() {
                return null;
            }
            
            public final void setStock(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getImgName() {
                return null;
            }
            
            public final void setImgName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOe() {
                return null;
            }
            
            public final void setOe(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final double getPrice() {
                return 0.0;
            }
            
            public final void setPrice(double p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getNname() {
                return null;
            }
            
            public final void setNname(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getId() {
                return null;
            }
            
            public final void setId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getImgNames() {
                return null;
            }
            
            public final void setImgNames(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFcode() {
                return null;
            }
            
            public final void setFcode(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCategoryName() {
                return null;
            }
            
            public final void setCategoryName(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Integer getBuyLimit() {
                return null;
            }
            
            public final void setBuyLimit(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getSales() {
                return null;
            }
            
            public final void setSales(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getBrandId() {
                return null;
            }
            
            public final void setBrandId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getDescription() {
                return null;
            }
            
            public final void setDescription(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getBrandName() {
                return null;
            }
            
            public final void setBrandName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final int isDeleted() {
                return 0;
            }
            
            public final void setDeleted(int p0) {
            }
            
            public final int isOnsale() {
                return 0;
            }
            
            public final void setOnsale(int p0) {
            }
            
            public final int getShoppingId() {
                return 0;
            }
            
            public final void setShoppingId(int p0) {
            }
            
            public final int getSellWay() {
                return 0;
            }
            
            public final void setSellWay(int p0) {
            }
            
            public final int isSet() {
                return 0;
            }
            
            public final void setSet(int p0) {
            }
            
            public final int isSelected() {
                return 0;
            }
            
            public final void setSelected(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getGoodsName() {
                return null;
            }
            
            public final void setGoodsName(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
        }
    }
}