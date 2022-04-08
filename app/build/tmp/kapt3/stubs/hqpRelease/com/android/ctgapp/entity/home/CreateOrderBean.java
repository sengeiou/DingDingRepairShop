package com.android.ctgapp.entity.home;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/10
 * 描述: 下单 创建订单
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001:\u0001GB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\u001e\u0010\"\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001c\u00105\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001c\u0010;\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\u001e\u0010>\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u000eR\u001c\u0010A\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\u001c\u0010D\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010\b\u00a8\u0006H"}, d2 = {"Lcom/android/ctgapp/entity/home/CreateOrderBean;", "Ljava/io/Serializable;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "allianceId", "", "getAllianceId", "()Ljava/lang/Integer;", "setAllianceId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "buyerCompanyId", "getBuyerCompanyId", "setBuyerCompanyId", "buyerUserId", "getBuyerUserId", "setBuyerUserId", "city", "getCity", "setCity", "district", "getDistrict", "setDistrict", "indentFrom", "getIndentFrom", "setIndentFrom", "leftCash", "getLeftCash", "setLeftCash", "orderType", "getOrderType", "setOrderType", "orders", "", "Lcom/android/ctgapp/entity/home/CreateOrderBean$OrdersBean;", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "payWay", "getPayWay", "setPayWay", "postNum", "getPostNum", "setPostNum", "province", "getProvince", "setProvince", "receiverName", "getReceiverName", "setReceiverName", "remark", "getRemark", "setRemark", "telephone", "getTelephone", "setTelephone", "totalNumber", "getTotalNumber", "setTotalNumber", "totalPrice", "getTotalPrice", "setTotalPrice", "vin", "getVin", "setVin", "OrdersBean", "app_hqpRelease"})
public final class CreateOrderBean implements java.io.Serializable {
    
    /**
     * vin : LVHRE1833B5012145
     * totalNumber : 4
     * totalPrice : 110.00
     * buyerCompanyId : 12345
     * allianceId : 88889570
     * province : 天津市
     * city : 天津城区
     * district : 区
     * address : 2222222
     * postNum :
     * receiverName : zyf1
     * telephone : 13112312321
     * buyerUserId : 1
     * indentFrom : 4
     * remark : 我要什么玩意
     * payWay : 1
     * orderType : 1
     * leftCash : 22
     * voucherId :代金券id
     * voucherCash代金券金额
     * storeCash 存值卡金额
     * orders : [{"sellerCompanyId":888897040,"quotationId":261,"cashReplaceId":2,"invoiceType":0,"head":null,"taxNo":null,"remark":"曹尼玛","companyAddress":null,"companyPhone":null,"bank":null,"orderDetailS":[{"goodsAmount":1,"goodsPrice":22,"goodsNo":"BJD89023","goodsName":"左前大灯","partName":"左前大灯","partOe":"9J080333","spec":"11111","brand":"合生元","ctgnum":"1234","quality":"原厂件","remark":"商品备注","goodsId":"商品id","categoryCode":"105-10","shoppingCartId":530,"warehouseId":"2828383939390"},{"goodsAmount":1,"goodsPrice":11,"goodsName":"左前门","partNo":"","partName":"左前门","brand":null,"ctgnum":null,"quality":"","remark":"去哦草i","goodsId":null,"shoppingCartId":529},{"goodsAmount":1,"goodsPrice":33,"goodsName":"左前门限位器","goodsNo":"编码SDWWEDF","partName":"左前门限位器","partNo":"89J7890223","brand":null,"ctgnum":null,"quality":"","remark":"","goodsId":null,"shoppingCartId":531},{"goodsAmount":1,"goodsPrice":44,"goodsName":"左前门锁机","partNo":"4444333","partName":"左前门锁机","brand":null,"ctgnum":null,"quality":"","remark":"","goodsId":null,"shoppingCartId":532}]}]
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String vin;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer totalNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String totalPrice;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String buyerCompanyId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer allianceId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String province;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String city;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String district;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String postNum;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String receiverName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String telephone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer buyerUserId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer indentFrom;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String remark;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer payWay;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer orderType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer leftCash;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.CreateOrderBean.OrdersBean> orders;
    
    public CreateOrderBean() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVin() {
        return null;
    }
    
    public final void setVin(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalNumber() {
        return null;
    }
    
    public final void setTotalNumber(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalPrice() {
        return null;
    }
    
    public final void setTotalPrice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBuyerCompanyId() {
        return null;
    }
    
    public final void setBuyerCompanyId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAllianceId() {
        return null;
    }
    
    public final void setAllianceId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProvince() {
        return null;
    }
    
    public final void setProvince(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDistrict() {
        return null;
    }
    
    public final void setDistrict(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPostNum() {
        return null;
    }
    
    public final void setPostNum(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public final java.lang.Integer getBuyerUserId() {
        return null;
    }
    
    public final void setBuyerUserId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIndentFrom() {
        return null;
    }
    
    public final void setIndentFrom(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemark() {
        return null;
    }
    
    public final void setRemark(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPayWay() {
        return null;
    }
    
    public final void setPayWay(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOrderType() {
        return null;
    }
    
    public final void setOrderType(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLeftCash() {
        return null;
    }
    
    public final void setLeftCash(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.home.CreateOrderBean.OrdersBean> getOrders() {
        return null;
    }
    
    public final void setOrders(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.CreateOrderBean.OrdersBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u001c\u0010/\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001c\u00105\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\u001e\u00108\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000e\u00a8\u0006<"}, d2 = {"Lcom/android/ctgapp/entity/home/CreateOrderBean$OrdersBean;", "Ljava/io/Serializable;", "()V", "bank", "", "getBank", "()Ljava/lang/Object;", "setBank", "(Ljava/lang/Object;)V", "cashReplaceId", "", "getCashReplaceId", "()Ljava/lang/Integer;", "setCashReplaceId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "companyAddress", "getCompanyAddress", "setCompanyAddress", "companyPhone", "getCompanyPhone", "setCompanyPhone", "head", "getHead", "setHead", "invoiceType", "getInvoiceType", "setInvoiceType", "orderDetailS", "", "Lcom/android/ctgapp/entity/home/CreateOrderBean$OrdersBean$OrderDetailSBean;", "getOrderDetailS", "()Ljava/util/List;", "setOrderDetailS", "(Ljava/util/List;)V", "quotationId", "getQuotationId", "setQuotationId", "remark", "", "getRemark", "()Ljava/lang/String;", "setRemark", "(Ljava/lang/String;)V", "sellerCompanyId", "getSellerCompanyId", "setSellerCompanyId", "storeCash", "getStoreCash", "setStoreCash", "taxNo", "getTaxNo", "setTaxNo", "voucherCash", "getVoucherCash", "setVoucherCash", "voucherId", "getVoucherId", "setVoucherId", "OrderDetailSBean", "app_hqpRelease"})
    public static final class OrdersBean implements java.io.Serializable {
        
        /**
         * sellerCompanyId : 888897040
         * quotationId : 261
         * cashReplaceId : 2
         * invoiceType : 0
         * head : null
         * taxNo : null
         * remark : 曹尼玛
         * companyAddress : null
         * companyPhone : null
         * bank : null
         * orderDetailS : [{"goodsAmount":1,"goodsPrice":22,"goodsNo":"BJD89023","goodsName":"左前大灯","partName":"左前大灯","partOe":"9J080333","spec":"11111","brand":"合生元","ctgnum":"1234","quality":"原厂件","remark":"商品备注","goodsId":"商品id","categoryCode":"105-10","shoppingCartId":530,"warehouseId":"2828383939390"},{"goodsAmount":1,"goodsPrice":11,"goodsName":"左前门","partNo":"","partName":"左前门","brand":null,"ctgnum":null,"quality":"","remark":"去哦草i","goodsId":null,"shoppingCartId":529},{"goodsAmount":1,"goodsPrice":33,"goodsName":"左前门限位器","goodsNo":"编码SDWWEDF","partName":"左前门限位器","partNo":"89J7890223","brand":null,"ctgnum":null,"quality":"","remark":"","goodsId":null,"shoppingCartId":531},{"goodsAmount":1,"goodsPrice":44,"goodsName":"左前门锁机","partNo":"4444333","partName":"左前门锁机","brand":null,"ctgnum":null,"quality":"","remark":"","goodsId":null,"shoppingCartId":532}]
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer sellerCompanyId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer quotationId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer cashReplaceId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer invoiceType;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object head;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object taxNo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String remark;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object companyAddress;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object companyPhone;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object bank;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.CreateOrderBean.OrdersBean.OrderDetailSBean> orderDetailS;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer voucherId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String voucherCash;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String storeCash;
        
        public OrdersBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSellerCompanyId() {
            return null;
        }
        
        public final void setSellerCompanyId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getQuotationId() {
            return null;
        }
        
        public final void setQuotationId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCashReplaceId() {
            return null;
        }
        
        public final void setCashReplaceId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getInvoiceType() {
            return null;
        }
        
        public final void setInvoiceType(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
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
        public final java.lang.String getRemark() {
            return null;
        }
        
        public final void setRemark(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
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
        public final java.util.List<com.android.ctgapp.entity.home.CreateOrderBean.OrdersBean.OrderDetailSBean> getOrderDetailS() {
            return null;
        }
        
        public final void setOrderDetailS(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.CreateOrderBean.OrdersBean.OrderDetailSBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getVoucherId() {
            return null;
        }
        
        public final void setVoucherId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getVoucherCash() {
            return null;
        }
        
        public final void setVoucherCash(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStoreCash() {
            return null;
        }
        
        public final void setStoreCash(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0006\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001e\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001c\u00105\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001e\u0010;\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR\u001c\u0010>\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u001c\u0010A\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\b\u00a8\u0006D"}, d2 = {"Lcom/android/ctgapp/entity/home/CreateOrderBean$OrdersBean$OrderDetailSBean;", "Ljava/io/Serializable;", "()V", "brand", "", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "brandId", "", "getBrandId", "()Ljava/lang/Integer;", "setBrandId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "categoryCode", "getCategoryCode", "setCategoryCode", "ctgnum", "getCtgnum", "setCtgnum", "goodsAmount", "getGoodsAmount", "setGoodsAmount", "goodsId", "getGoodsId", "setGoodsId", "goodsImg", "getGoodsImg", "setGoodsImg", "goodsName", "getGoodsName", "setGoodsName", "goodsNo", "getGoodsNo", "setGoodsNo", "goodsPrice", "", "getGoodsPrice", "()Ljava/lang/Double;", "setGoodsPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "partName", "getPartName", "setPartName", "partNo", "getPartNo", "setPartNo", "partOe", "getPartOe", "setPartOe", "quality", "getQuality", "setQuality", "remark", "getRemark", "setRemark", "shoppingCartId", "getShoppingCartId", "setShoppingCartId", "spec", "getSpec", "setSpec", "warehouseId", "getWarehouseId", "setWarehouseId", "app_hqpRelease"})
        public static final class OrderDetailSBean implements java.io.Serializable {
            
            /**
             * goodsAmount : 1
             * goodsPrice : 22
             * goodsNo : BJD89023
             * goodsName : 左前大灯
             * partName : 左前大灯
             * partOe : 9J080333
             * spec : 11111
             * brand : 合生元
             * ctgnum : 1234
             * quality : 原厂件
             * remark : 商品备注
             * goodsId : 商品id
             * categoryCode : 105-10
             * shoppingCartId : 530
             * warehouseId : 2828383939390
             * partNo :
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer goodsAmount;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Double goodsPrice;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String partName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String partOe;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String spec;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String brand;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String ctgnum;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String quality;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String remark;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String categoryCode;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer shoppingCartId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String warehouseId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String partNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsImg;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer brandId;
            
            public OrderDetailSBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getGoodsAmount() {
                return null;
            }
            
            public final void setGoodsAmount(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getGoodsPrice() {
                return null;
            }
            
            public final void setGoodsPrice(@org.jetbrains.annotations.Nullable()
            java.lang.Double p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getGoodsNo() {
                return null;
            }
            
            public final void setGoodsNo(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getGoodsName() {
                return null;
            }
            
            public final void setGoodsName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPartName() {
                return null;
            }
            
            public final void setPartName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
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
            public final java.lang.String getBrand() {
                return null;
            }
            
            public final void setBrand(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getQuality() {
                return null;
            }
            
            public final void setQuality(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getRemark() {
                return null;
            }
            
            public final void setRemark(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getGoodsId() {
                return null;
            }
            
            public final void setGoodsId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCategoryCode() {
                return null;
            }
            
            public final void setCategoryCode(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getShoppingCartId() {
                return null;
            }
            
            public final void setShoppingCartId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getWarehouseId() {
                return null;
            }
            
            public final void setWarehouseId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPartNo() {
                return null;
            }
            
            public final void setPartNo(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Integer getBrandId() {
                return null;
            }
            
            public final void setBrandId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
        }
    }
}