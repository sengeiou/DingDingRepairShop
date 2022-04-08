package com.android.ctgapp.entity.deal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/entity/deal/CanRefundEntity;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/deal/CanRefundEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpDebug"})
public final class CanRefundEntity {
    
    /**
     * status : 0
     * msg : null
     * data : [{"orderDetailId":"30c6c35244b04b9f87d4120abfadf5d1","orderNo":"DD20201121170954943OEW1003","goodsAmount":1,"goodsPrice":14,"goodsName":"1231313","goodsNo":"121211211333","partName":null,"partOe":"","spec":"","brand":null},{"orderDetailId":"7d3a6890459a46aba0285567ec6ba17a","orderNo":"DD20201121170954943OEW1003","goodsAmount":1,"goodsPrice":10,"goodsName":"fgj56urtyu","goodsNo":"dfsg563","partName":null,"partOe":"","spec":"","brand":null},{"orderDetailId":"fb408e32421a47fca1fce60f079c4c13","orderNo":"DD20201121170954943OEW1003","goodsAmount":1,"goodsPrice":10,"goodsName":"44444444","goodsNo":"33322111","partName":null,"partOe":"","spec":"","brand":null},{"orderDetailId":"fc7cb6549fa24b749aa3f85c1761f36b","orderNo":"DD20201121170954943OEW1003","goodsAmount":1,"goodsPrice":122,"goodsName":"12311313","goodsNo":"uue8qw23132d","partName":null,"partOe":"","spec":"","brand":null}]
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    private boolean isSuccess = false;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.deal.CanRefundEntity.DataBean> data;
    
    public CanRefundEntity() {
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
    public final java.util.List<com.android.ctgapp.entity.deal.CanRefundEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.deal.CanRefundEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0017\"\u0004\b(\u0010\u0019R\u001c\u0010)\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001c\u0010,\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u001c\u0010/\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001c\u00102\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019\u00a8\u00065"}, d2 = {"Lcom/android/ctgapp/entity/deal/CanRefundEntity$DataBean;", "", "()V", "afterSaleSelect", "", "getAfterSaleSelect", "()Z", "setAfterSaleSelect", "(Z)V", "brand", "getBrand", "()Ljava/lang/Object;", "setBrand", "(Ljava/lang/Object;)V", "goodsAmount", "", "getGoodsAmount", "()I", "setGoodsAmount", "(I)V", "goodsImg", "", "getGoodsImg", "()Ljava/lang/String;", "setGoodsImg", "(Ljava/lang/String;)V", "goodsName", "getGoodsName", "setGoodsName", "goodsNo", "getGoodsNo", "setGoodsNo", "goodsPrice", "", "getGoodsPrice", "()D", "setGoodsPrice", "(D)V", "orderDetailId", "getOrderDetailId", "setOrderDetailId", "orderNo", "getOrderNo", "setOrderNo", "partName", "getPartName", "setPartName", "partOe", "getPartOe", "setPartOe", "spec", "getSpec", "setSpec", "app_hqpDebug"})
    public static final class DataBean {
        
        /**
         * orderDetailId : 30c6c35244b04b9f87d4120abfadf5d1
         * orderNo : DD20201121170954943OEW1003
         * goodsAmount : 1
         * goodsPrice : 14.0
         * goodsName : 1231313
         * goodsNo : 121211211333
         * partName : null
         * partOe :
         * spec :
         * brand : null
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orderDetailId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orderNo;
        private int goodsAmount = 0;
        private double goodsPrice = 0.0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String goodsName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String goodsNo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object partName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String partOe;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String spec;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String goodsImg;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object brand;
        private boolean afterSaleSelect = false;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrderDetailId() {
            return null;
        }
        
        public final void setOrderDetailId(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrderNo() {
            return null;
        }
        
        public final void setOrderNo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getGoodsAmount() {
            return 0;
        }
        
        public final void setGoodsAmount(int p0) {
        }
        
        public final double getGoodsPrice() {
            return 0.0;
        }
        
        public final void setGoodsPrice(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGoodsName() {
            return null;
        }
        
        public final void setGoodsName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGoodsNo() {
            return null;
        }
        
        public final void setGoodsNo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPartName() {
            return null;
        }
        
        public final void setPartName(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPartOe() {
            return null;
        }
        
        public final void setPartOe(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.String getGoodsImg() {
            return null;
        }
        
        public final void setGoodsImg(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getBrand() {
            return null;
        }
        
        public final void setBrand(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final boolean getAfterSaleSelect() {
            return false;
        }
        
        public final void setAfterSaleSelect(boolean p0) {
        }
    }
}