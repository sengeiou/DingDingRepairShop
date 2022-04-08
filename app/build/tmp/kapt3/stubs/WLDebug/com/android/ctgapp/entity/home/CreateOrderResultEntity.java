package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/home/CreateOrderResultEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_WLDebug"})
public final class CreateOrderResultEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"orderBatchId":"5adc32e7de22acbb4feaa6c3a3e17f83","orderBatchNo":"PC20201116141822161UZ1D002","vin":null,"createTime":null,"updateTime":null,"totalNumber":1,"totalPrice":0.01,"buyerCompanyId":65551,"allianceId":null,"province":"江苏省","city":"无锡市","district":"锡山区","address":"有点意思你这个骚东西","postNum":null,"receiverName":"阿兴","telephone":"1333333333","buyerUserId":1309,"indentFrom":1,"remark":"阿兴 你皮肤呢","orders":[{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","orderNo":"DD20201116141822176T0VG003","cashChangeNo":null,"totalNumber":1,"totalPrice":0.01,"originalTotalNumber":1,"originalTotalPrice":0.01,"sellerCompanyId":12345,"buyerCompanyId":65551,"allianceId":null,"state":1,"orderBatchNo":"PC20201116141822161UZ1D002","province":"江苏省","city":"无锡市","district":"锡山区","address":"有点意思你这个骚东西","postNum":null,"receiverName":"阿兴","telephone":"1333333333","createTime":null,"updateTime":null,"remark":"是的","buyerUserId":1309,"closingDate":null,"payee":null,"quotationId":null,"refuseReason":null,"sellAffirm":null,"buyAffirm":null,"outBill":null,"indentFrom":1,"erpOrderId":null,"orderStatus":null,"invoiceType":0,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":null,"sellerCompanyName":null,"orderDetailS":[{"orderDetailId":null,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"12311313","goodsNo":"uue8qw23132d","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":42,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":null,"updateTime":null,"categoryCode":"106-10","brandId":null,"shoppingCartId":null}],"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":null,"searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"97e9c91be702e900e86355c299b01a1b","orderId":"b829c4f2bf16a2daac607ba4c9a030d1","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":null,"createTime":"2020-11-16 14:18:22","updateTime":null},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":null,"goodsNames":null,"orderInfo":null}],"orderType":2,"payWay":3,"leftCash":null,"wxPayCash":null,"alipayCash":null,"orderInfo":"alipay_sdk=alipay-sdk-java-dynamicVersionNo&app_auth_token=202010BB3d72b65a56414bb4b855a3045c1afB13&app_id=2021001198692705&biz_content=%7B%22body%22%3A%2212345%22%2C%22out_trade_no%22%3A%22DD20201116141822176T0VG003%22%2C%22passback_params%22%3A%22callback+params%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22subject%22%3A%22App%E6%94%AF%E4%BB%98%E6%B5%8B%E8%AF%95-By+Javen%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A%220.01%22%7D&charset=UTF-8&format=json&method=alipay.trade.app.pay&notify_url=http%3A%2F%2Fsell.natapp4.cc%2ForderService_v2%2FaliPay%2FpayNotify&sign=WOQj0O8AEYssqhJkdBTu2%2BmFPPwrfWNlcZBA5pImKLVCWGfW8pHLq6LeizdXxoeZzrE5blCaZ97dGr9kvOF1PAYGgBjdY8iZiEIc6CQPzkjw8oj2E5eeMdZbwmyhjn9FUYvCNRZEg8M1yV%2BAbA3qBaX5ZYKnfIXzbLDJ8cXmKazXGMM6J6DDWLyPSy%2BXiz3Ni4Czqn5DVKHRl9pCAMCqeArODmNOfdOKWz5vS8IZSwhjeboUC7eCS5NvR0%2B4iDsr%2BKPnHDmvU7%2F3%2B5b%2B9ZgsFEPZWlrnTn90MW9e%2BxxSAEhv8xbyU1b7yIYSefeJXUghsV5Zq13oHv972gSQBtWzsQ%3D%3D&sign_type=RSA2&timestamp=2020-11-16+14%3A18%3A22&version=1.0"}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean data;
    private boolean isSuccess = false;
    
    public CreateOrderResultEntity() {
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
    public final com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001gB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001c\u0010&\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\"\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u0010\u0016R\u001c\u0010?\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000b\"\u0004\bA\u0010\rR\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001e\u0010K\u001a\u0004\u0018\u00010LX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010R\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0006\"\u0004\bT\u0010\bR\u001a\u0010U\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0014\"\u0004\bW\u0010\u0016R\u001a\u0010X\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001c\u0010^\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u000b\"\u0004\b`\u0010\rR\u001c\u0010a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u000b\"\u0004\bc\u0010\rR\u001c\u0010d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u000b\"\u0004\bf\u0010\r\u00a8\u0006h"}, d2 = {"Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "alipayCash", "getAlipayCash", "()Ljava/lang/Object;", "setAlipayCash", "(Ljava/lang/Object;)V", "allianceId", "getAllianceId", "setAllianceId", "buyerCompanyId", "", "getBuyerCompanyId", "()I", "setBuyerCompanyId", "(I)V", "buyerUserId", "getBuyerUserId", "setBuyerUserId", "city", "getCity", "setCity", "createTime", "getCreateTime", "setCreateTime", "district", "getDistrict", "setDistrict", "indentFrom", "getIndentFrom", "setIndentFrom", "leftCash", "getLeftCash", "setLeftCash", "orderBatchId", "getOrderBatchId", "setOrderBatchId", "orderBatchNo", "getOrderBatchNo", "setOrderBatchNo", "orderInfo", "getOrderInfo", "setOrderInfo", "orderType", "getOrderType", "setOrderType", "orders", "", "Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean$OrdersBean;", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "payWay", "getPayWay", "setPayWay", "postNum", "getPostNum", "setPostNum", "province", "getProvince", "setProvince", "receiverName", "getReceiverName", "setReceiverName", "remark", "getRemark", "setRemark", "submit", "", "getSubmit", "()Ljava/lang/Boolean;", "setSubmit", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "telephone", "getTelephone", "setTelephone", "totalNumber", "getTotalNumber", "setTotalNumber", "totalPrice", "", "getTotalPrice", "()D", "setTotalPrice", "(D)V", "updateTime", "getUpdateTime", "setUpdateTime", "vin", "getVin", "setVin", "wxPayCash", "getWxPayCash", "setWxPayCash", "OrdersBean", "app_WLDebug"})
    public static final class DataBean {
        
        /**
         * orderBatchId : 5adc32e7de22acbb4feaa6c3a3e17f83
         * orderBatchNo : PC20201116141822161UZ1D002
         * vin : null
         * createTime : null
         * updateTime : null
         * totalNumber : 1
         * totalPrice : 0.01
         * buyerCompanyId : 65551
         * allianceId : null
         * province : 江苏省
         * city : 无锡市
         * district : 锡山区
         * address : 有点意思你这个骚东西
         * postNum : null
         * receiverName : 阿兴
         * telephone : 1333333333
         * buyerUserId : 1309
         * indentFrom : 1
         * remark : 阿兴 你皮肤呢
         * orders : [{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","orderNo":"DD20201116141822176T0VG003","cashChangeNo":null,"totalNumber":1,"totalPrice":0.01,"originalTotalNumber":1,"originalTotalPrice":0.01,"sellerCompanyId":12345,"buyerCompanyId":65551,"allianceId":null,"state":1,"orderBatchNo":"PC20201116141822161UZ1D002","province":"江苏省","city":"无锡市","district":"锡山区","address":"有点意思你这个骚东西","postNum":null,"receiverName":"阿兴","telephone":"1333333333","createTime":null,"updateTime":null,"remark":"是的","buyerUserId":1309,"closingDate":null,"payee":null,"quotationId":null,"refuseReason":null,"sellAffirm":null,"buyAffirm":null,"outBill":null,"indentFrom":1,"erpOrderId":null,"orderStatus":null,"invoiceType":0,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":null,"sellerCompanyName":null,"orderDetailS":[{"orderDetailId":null,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"12311313","goodsNo":"uue8qw23132d","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":42,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":null,"updateTime":null,"categoryCode":"106-10","brandId":null,"shoppingCartId":null}],"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":null,"searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"97e9c91be702e900e86355c299b01a1b","orderId":"b829c4f2bf16a2daac607ba4c9a030d1","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":null,"createTime":"2020-11-16 14:18:22","updateTime":null},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":null,"goodsNames":null,"orderInfo":null}]
         * orderType : 2
         * payWay : 3
         * leftCash : null
         * wxPayCash : null
         * alipayCash : null
         * orderInfo : alipay_sdk=alipay-sdk-java-dynamicVersionNo&app_auth_token=202010BB3d72b65a56414bb4b855a3045c1afB13&app_id=2021001198692705&biz_content=%7B%22body%22%3A%2212345%22%2C%22out_trade_no%22%3A%22DD20201116141822176T0VG003%22%2C%22passback_params%22%3A%22callback+params%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22subject%22%3A%22App%E6%94%AF%E4%BB%98%E6%B5%8B%E8%AF%95-By+Javen%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A%220.01%22%7D&charset=UTF-8&format=json&method=alipay.trade.app.pay&notify_url=http%3A%2F%2Fsell.natapp4.cc%2ForderService_v2%2FaliPay%2FpayNotify&sign=WOQj0O8AEYssqhJkdBTu2%2BmFPPwrfWNlcZBA5pImKLVCWGfW8pHLq6LeizdXxoeZzrE5blCaZ97dGr9kvOF1PAYGgBjdY8iZiEIc6CQPzkjw8oj2E5eeMdZbwmyhjn9FUYvCNRZEg8M1yV%2BAbA3qBaX5ZYKnfIXzbLDJ8cXmKazXGMM6J6DDWLyPSy%2BXiz3Ni4Czqn5DVKHRl9pCAMCqeArODmNOfdOKWz5vS8IZSwhjeboUC7eCS5NvR0%2B4iDsr%2BKPnHDmvU7%2F3%2B5b%2B9ZgsFEPZWlrnTn90MW9e%2BxxSAEhv8xbyU1b7yIYSefeJXUghsV5Zq13oHv972gSQBtWzsQ%3D%3D&sign_type=RSA2&timestamp=2020-11-16+14%3A18%3A22&version=1.0
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orderBatchId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orderBatchNo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object vin;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object updateTime;
        private int totalNumber = 0;
        private double totalPrice = 0.0;
        private int buyerCompanyId = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object allianceId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String province;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String city;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String district;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String address;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object postNum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String receiverName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String telephone;
        private int buyerUserId = 0;
        private int indentFrom = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String remark;
        private int orderType = 0;
        private int payWay = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object leftCash;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object wxPayCash;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object alipayCash;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orderInfo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean submit;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean.OrdersBean> orders;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrderBatchId() {
            return null;
        }
        
        public final void setOrderBatchId(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrderBatchNo() {
            return null;
        }
        
        public final void setOrderBatchNo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getVin() {
            return null;
        }
        
        public final void setVin(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
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
        
        public final int getBuyerUserId() {
            return 0;
        }
        
        public final void setBuyerUserId(int p0) {
        }
        
        public final int getIndentFrom() {
            return 0;
        }
        
        public final void setIndentFrom(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRemark() {
            return null;
        }
        
        public final void setRemark(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getOrderType() {
            return 0;
        }
        
        public final void setOrderType(int p0) {
        }
        
        public final int getPayWay() {
            return 0;
        }
        
        public final void setPayWay(int p0) {
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrderInfo() {
            return null;
        }
        
        public final void setOrderInfo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getSubmit() {
            return null;
        }
        
        public final void setSubmit(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean.OrdersBean> getOrders() {
            return null;
        }
        
        public final void setOrders(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean.OrdersBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0006\n\u0002\bU\u0018\u00002\u00020\u0001:\u0004\u00df\u0001\u00e0\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001c\u0010&\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR\u001c\u0010)\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR\u001c\u00102\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR\u001c\u00105\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000b\"\u0004\b7\u0010\rR\u001c\u00108\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000b\"\u0004\b:\u0010\rR\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\rR\u001c\u0010D\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010\bR\u001c\u0010G\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000b\"\u0004\bI\u0010\rR\u001c\u0010J\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u000b\"\u0004\bL\u0010\rR\u001c\u0010M\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000b\"\u0004\bO\u0010\rR\u001c\u0010P\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\rR\u001a\u0010S\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0017\"\u0004\bU\u0010\u0019R\u001c\u0010V\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u000b\"\u0004\bX\u0010\rR\u001c\u0010Y\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u000b\"\u0004\b[\u0010\rR\u001a\u0010\\\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0017\"\u0004\b^\u0010\u0019R\u001c\u0010_\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u000b\"\u0004\b`\u0010\rR\u001c\u0010a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u000b\"\u0004\bb\u0010\rR\u001c\u0010c\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u000b\"\u0004\be\u0010\rR\u001c\u0010f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u000b\"\u0004\bh\u0010\rR\u001c\u0010i\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001c\u0010l\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u000b\"\u0004\bn\u0010\rR\"\u0010o\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010pX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001c\u0010v\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0006\"\u0004\bx\u0010\bR\u001c\u0010y\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u000b\"\u0004\b{\u0010\rR\u001c\u0010|\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u000b\"\u0004\b~\u0010\rR\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0006\"\u0005\b\u0081\u0001\u0010\bR\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u000b\"\u0005\b\u0084\u0001\u0010\rR\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u000b\"\u0005\b\u0087\u0001\u0010\rR\u001d\u0010\u0088\u0001\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u0017\"\u0005\b\u008a\u0001\u0010\u0019R \u0010\u008b\u0001\u001a\u00030\u008c\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u000b\"\u0005\b\u0093\u0001\u0010\rR\u001d\u0010\u0094\u0001\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010\u0017\"\u0005\b\u0096\u0001\u0010\u0019R\u001d\u0010\u0097\u0001\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010\u0017\"\u0005\b\u0099\u0001\u0010\u0019R\u001f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010\u000b\"\u0005\b\u009c\u0001\u0010\rR\u001f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u000b\"\u0005\b\u009f\u0001\u0010\rR\u001f\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010\u000b\"\u0005\b\u00a2\u0001\u0010\rR\u001f\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a4\u0001\u0010\u000b\"\u0005\b\u00a5\u0001\u0010\rR\u001f\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a7\u0001\u0010\u0006\"\u0005\b\u00a8\u0001\u0010\bR\u001f\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0001\u0010\u000b\"\u0005\b\u00ab\u0001\u0010\rR\u001f\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010\u0006\"\u0005\b\u00ae\u0001\u0010\bR\u001f\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b0\u0001\u0010\u000b\"\u0005\b\u00b1\u0001\u0010\rR\u001f\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b3\u0001\u0010\u0006\"\u0005\b\u00b4\u0001\u0010\bR\u001f\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b6\u0001\u0010\u000b\"\u0005\b\u00b7\u0001\u0010\rR\u001f\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b9\u0001\u0010\u000b\"\u0005\b\u00ba\u0001\u0010\rR\u001d\u0010\u00bb\u0001\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bc\u0001\u0010\u0017\"\u0005\b\u00bd\u0001\u0010\u0019R\u001f\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bf\u0001\u0010\u000b\"\u0005\b\u00c0\u0001\u0010\rR\u001f\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c2\u0001\u0010\u000b\"\u0005\b\u00c3\u0001\u0010\rR\u001f\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c5\u0001\u0010\u000b\"\u0005\b\u00c6\u0001\u0010\rR\u001d\u0010\u00c7\u0001\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c8\u0001\u0010\u0017\"\u0005\b\u00c9\u0001\u0010\u0019R\u001f\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cb\u0001\u0010\u000b\"\u0005\b\u00cc\u0001\u0010\rR\u001f\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ce\u0001\u0010\u000b\"\u0005\b\u00cf\u0001\u0010\rR\u001f\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d1\u0001\u0010\u0006\"\u0005\b\u00d2\u0001\u0010\bR\u001d\u0010\u00d3\u0001\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d4\u0001\u0010\u0017\"\u0005\b\u00d5\u0001\u0010\u0019R \u0010\u00d6\u0001\u001a\u00030\u008c\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d7\u0001\u0010\u008e\u0001\"\u0006\b\u00d8\u0001\u0010\u0090\u0001R\u001f\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00da\u0001\u0010\u000b\"\u0005\b\u00db\u0001\u0010\rR\u001f\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00dd\u0001\u0010\u000b\"\u0005\b\u00de\u0001\u0010\r\u00a8\u0006\u00e1\u0001"}, d2 = {"Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean$OrdersBean;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "allianceId", "getAllianceId", "()Ljava/lang/Object;", "setAllianceId", "(Ljava/lang/Object;)V", "bank", "getBank", "setBank", "buyAffirm", "getBuyAffirm", "setBuyAffirm", "buyerCompanyId", "", "getBuyerCompanyId", "()I", "setBuyerCompanyId", "(I)V", "buyerCompanyIds", "getBuyerCompanyIds", "setBuyerCompanyIds", "buyerCompanyName", "getBuyerCompanyName", "setBuyerCompanyName", "buyerUserId", "getBuyerUserId", "setBuyerUserId", "buyerUserName", "getBuyerUserName", "setBuyerUserName", "cashChangeNo", "getCashChangeNo", "setCashChangeNo", "cashReplaceId", "getCashReplaceId", "setCashReplaceId", "city", "getCity", "setCity", "closingDate", "getClosingDate", "setClosingDate", "companyAddress", "getCompanyAddress", "setCompanyAddress", "companyPhone", "getCompanyPhone", "setCompanyPhone", "createTime", "getCreateTime", "setCreateTime", "ctgOrderPay", "Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean$OrdersBean$CtgOrderPayBean;", "getCtgOrderPay", "()Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean$OrdersBean$CtgOrderPayBean;", "setCtgOrderPay", "(Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean$OrdersBean$CtgOrderPayBean;)V", "days", "getDays", "setDays", "district", "getDistrict", "setDistrict", "endDate", "getEndDate", "setEndDate", "erpOrderId", "getErpOrderId", "setErpOrderId", "goodsNames", "getGoodsNames", "setGoodsNames", "head", "getHead", "setHead", "indentFrom", "getIndentFrom", "setIndentFrom", "indentFroms", "getIndentFroms", "setIndentFroms", "industry", "getIndustry", "setIndustry", "invoiceType", "getInvoiceType", "setInvoiceType", "isNeedChangeReceiverInfo", "setNeedChangeReceiverInfo", "isNeedChangeRemark", "setNeedChangeRemark", "leftCash", "getLeftCash", "setLeftCash", "limitNum", "getLimitNum", "setLimitNum", "orderBatchNo", "getOrderBatchNo", "setOrderBatchNo", "orderByDescs", "getOrderByDescs", "setOrderByDescs", "orderDetailS", "", "Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean$OrdersBean$OrderDetailSBean;", "getOrderDetailS", "()Ljava/util/List;", "setOrderDetailS", "(Ljava/util/List;)V", "orderId", "getOrderId", "setOrderId", "orderInfo", "getOrderInfo", "setOrderInfo", "orderInvoice", "getOrderInvoice", "setOrderInvoice", "orderNo", "getOrderNo", "setOrderNo", "orderStatus", "getOrderStatus", "setOrderStatus", "originalCtgOrderPay", "getOriginalCtgOrderPay", "setOriginalCtgOrderPay", "originalTotalNumber", "getOriginalTotalNumber", "setOriginalTotalNumber", "originalTotalPrice", "", "getOriginalTotalPrice", "()D", "setOriginalTotalPrice", "(D)V", "outBill", "getOutBill", "setOutBill", "pageNum", "getPageNum", "setPageNum", "pageSize", "getPageSize", "setPageSize", "payWay", "getPayWay", "setPayWay", "payWayString", "getPayWayString", "setPayWayString", "payee", "getPayee", "setPayee", "postNum", "getPostNum", "setPostNum", "province", "getProvince", "setProvince", "quotationId", "getQuotationId", "setQuotationId", "receiverName", "getReceiverName", "setReceiverName", "refuseReason", "getRefuseReason", "setRefuseReason", "remark", "getRemark", "setRemark", "searchString", "getSearchString", "setSearchString", "sellAffirm", "getSellAffirm", "setSellAffirm", "sellerCompanyId", "getSellerCompanyId", "setSellerCompanyId", "sellerCompanyIds", "getSellerCompanyIds", "setSellerCompanyIds", "sellerCompanyName", "getSellerCompanyName", "setSellerCompanyName", "startDate", "getStartDate", "setStartDate", "state", "getState", "setState", "states", "getStates", "setStates", "taxNo", "getTaxNo", "setTaxNo", "telephone", "getTelephone", "setTelephone", "totalNumber", "getTotalNumber", "setTotalNumber", "totalPrice", "getTotalPrice", "setTotalPrice", "updateTime", "getUpdateTime", "setUpdateTime", "vin", "getVin", "setVin", "CtgOrderPayBean", "OrderDetailSBean", "app_WLDebug"})
        public static final class OrdersBean {
            
            /**
             * startDate : null
             * endDate : null
             * pageNum : 1
             * pageSize : 20
             * orderId : b829c4f2bf16a2daac607ba4c9a030d1
             * orderNo : DD20201116141822176T0VG003
             * cashChangeNo : null
             * totalNumber : 1
             * totalPrice : 0.01
             * originalTotalNumber : 1
             * originalTotalPrice : 0.01
             * sellerCompanyId : 12345
             * buyerCompanyId : 65551
             * allianceId : null
             * state : 1
             * orderBatchNo : PC20201116141822161UZ1D002
             * province : 江苏省
             * city : 无锡市
             * district : 锡山区
             * address : 有点意思你这个骚东西
             * postNum : null
             * receiverName : 阿兴
             * telephone : 1333333333
             * createTime : null
             * updateTime : null
             * remark : 是的
             * buyerUserId : 1309
             * closingDate : null
             * payee : null
             * quotationId : null
             * refuseReason : null
             * sellAffirm : null
             * buyAffirm : null
             * outBill : null
             * indentFrom : 1
             * erpOrderId : null
             * orderStatus : null
             * invoiceType : 0
             * head : null
             * taxNo : null
             * companyAddress : null
             * companyPhone : null
             * bank : null
             * buyerUserName : null
             * buyerCompanyName : null
             * sellerCompanyName : null
             * orderDetailS : [{"orderDetailId":null,"orderId":"b829c4f2bf16a2daac607ba4c9a030d1","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"12311313","goodsNo":"uue8qw23132d","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":42,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":null,"updateTime":null,"categoryCode":"106-10","brandId":null,"shoppingCartId":null}]
             * cashReplaceId : null
             * payWay : null
             * leftCash : null
             * payWayString : null
             * searchString : null
             * isNeedChangeReceiverInfo : null
             * isNeedChangeRemark : null
             * orderInvoice : null
             * ctgOrderPay : {"orderPayId":"97e9c91be702e900e86355c299b01a1b","orderId":"b829c4f2bf16a2daac607ba4c9a030d1","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":null,"createTime":"2020-11-16 14:18:22","updateTime":null}
             * originalCtgOrderPay : null
             * buyerCompanyIds : null
             * sellerCompanyIds : null
             * states : null
             * indentFroms : null
             * orderByDescs : null
             * limitNum : null
             * days : null
             * industry : null
             * vin : null
             * goodsNames : null
             * orderInfo : null
             */
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
            private int originalTotalNumber = 0;
            private double originalTotalPrice = 0.0;
            private int sellerCompanyId = 0;
            private int buyerCompanyId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object allianceId;
            private int state = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orderBatchNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String province;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String city;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String district;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String address;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object postNum;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String receiverName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String telephone;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object createTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object updateTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String remark;
            private int buyerUserId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object closingDate;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object payee;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object quotationId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object refuseReason;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object sellAffirm;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object buyAffirm;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object outBill;
            private int indentFrom = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object erpOrderId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object orderStatus;
            private int invoiceType = 0;
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
            private java.lang.Object buyerCompanyName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object sellerCompanyName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object cashReplaceId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object payWay;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object leftCash;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object payWayString;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object searchString;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object isNeedChangeReceiverInfo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object isNeedChangeRemark;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object orderInvoice;
            @org.jetbrains.annotations.Nullable()
            private com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean.OrdersBean.CtgOrderPayBean ctgOrderPay;
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
            private java.lang.Object vin;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object goodsNames;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object orderInfo;
            @org.jetbrains.annotations.Nullable()
            private java.util.List<com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean.OrdersBean.OrderDetailSBean> orderDetailS;
            
            public OrdersBean() {
                super();
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
            
            public final int getOriginalTotalNumber() {
                return 0;
            }
            
            public final void setOriginalTotalNumber(int p0) {
            }
            
            public final double getOriginalTotalPrice() {
                return 0.0;
            }
            
            public final void setOriginalTotalPrice(double p0) {
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
            
            public final int getState() {
                return 0;
            }
            
            public final void setState(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOrderBatchNo() {
                return null;
            }
            
            public final void setOrderBatchNo(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
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
            public final java.lang.String getRemark() {
                return null;
            }
            
            public final void setRemark(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
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
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getQuotationId() {
                return null;
            }
            
            public final void setQuotationId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
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
            
            public final int getIndentFrom() {
                return 0;
            }
            
            public final void setIndentFrom(int p0) {
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
            
            public final int getInvoiceType() {
                return 0;
            }
            
            public final void setInvoiceType(int p0) {
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
            public final java.lang.Object getBuyerCompanyName() {
                return null;
            }
            
            public final void setBuyerCompanyName(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSellerCompanyName() {
                return null;
            }
            
            public final void setSellerCompanyName(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Object getPayWayString() {
                return null;
            }
            
            public final void setPayWayString(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
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
            public final com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean.OrdersBean.CtgOrderPayBean getCtgOrderPay() {
                return null;
            }
            
            public final void setCtgOrderPay(@org.jetbrains.annotations.Nullable()
            com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean.OrdersBean.CtgOrderPayBean p0) {
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
            public final java.lang.Object getVin() {
                return null;
            }
            
            public final void setVin(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getGoodsNames() {
                return null;
            }
            
            public final void setGoodsNames(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOrderInfo() {
                return null;
            }
            
            public final void setOrderInfo(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean.OrdersBean.OrderDetailSBean> getOrderDetailS() {
                return null;
            }
            
            public final void setOrderDetailS(@org.jetbrains.annotations.Nullable()
            java.util.List<com.android.ctgapp.entity.home.CreateOrderResultEntity.DataBean.OrdersBean.OrderDetailSBean> p0) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001c\u0010&\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR\u001a\u0010)\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u001c\u0010/\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR\u001c\u00102\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\r\u00a8\u00065"}, d2 = {"Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean$OrdersBean$CtgOrderPayBean;", "", "()V", "alipayCash", "", "getAlipayCash", "()D", "setAlipayCash", "(D)V", "cashReplaceId", "getCashReplaceId", "()Ljava/lang/Object;", "setCashReplaceId", "(Ljava/lang/Object;)V", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "leftCash", "getLeftCash", "setLeftCash", "orderId", "getOrderId", "setOrderId", "orderPayId", "getOrderPayId", "setOrderPayId", "payWay", "", "getPayWay", "()I", "setPayWay", "(I)V", "repalceCash", "getRepalceCash", "setRepalceCash", "thirdOrderNo", "getThirdOrderNo", "setThirdOrderNo", "thirdPartyPay", "getThirdPartyPay", "setThirdPartyPay", "totalReturnCash", "getTotalReturnCash", "setTotalReturnCash", "updateTime", "getUpdateTime", "setUpdateTime", "wxPayCash", "getWxPayCash", "setWxPayCash", "app_WLDebug"})
            public static final class CtgOrderPayBean {
                
                /**
                 * orderPayId : 97e9c91be702e900e86355c299b01a1b
                 * orderId : b829c4f2bf16a2daac607ba4c9a030d1
                 * cashReplaceId : null
                 * repalceCash : null
                 * leftCash : null
                 * wxPayCash : null
                 * alipayCash : 0.01
                 * payWay : 3
                 * thirdPartyPay : 0.01
                 * thirdOrderNo : null
                 * totalReturnCash : null
                 * createTime : 2020-11-16 14:18:22
                 * updateTime : null
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
                private double alipayCash = 0.0;
                private int payWay = 0;
                private double thirdPartyPay = 0.0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object thirdOrderNo;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object totalReturnCash;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String createTime;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object updateTime;
                
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
                
                public final double getAlipayCash() {
                    return 0.0;
                }
                
                public final void setAlipayCash(double p0) {
                }
                
                public final int getPayWay() {
                    return 0;
                }
                
                public final void setPayWay(int p0) {
                }
                
                public final double getThirdPartyPay() {
                    return 0.0;
                }
                
                public final void setThirdPartyPay(double p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getThirdOrderNo() {
                    return null;
                }
                
                public final void setThirdOrderNo(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getTotalReturnCash() {
                    return null;
                }
                
                public final void setTotalReturnCash(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
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
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b/\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001c\u0010#\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u001c\u0010/\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R\u001a\u00102\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001a\u00105\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\u001c\u00108\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0005\"\u0004\b:\u0010\u0007R\u001c\u0010;\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0005\"\u0004\b=\u0010\u0007R\u001c\u0010>\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0005\"\u0004\b@\u0010\u0007R\u001c\u0010A\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0005\"\u0004\bC\u0010\u0007R\u001c\u0010D\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0005\"\u0004\bF\u0010\u0007R\u001c\u0010G\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0005\"\u0004\bI\u0010\u0007R\u001c\u0010J\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0005\"\u0004\bL\u0010\u0007R\u001a\u0010M\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R\u001c\u0010P\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0005\"\u0004\bR\u0010\u0007R\u001c\u0010S\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0005\"\u0004\bU\u0010\u0007\u00a8\u0006V"}, d2 = {"Lcom/android/ctgapp/entity/home/CreateOrderResultEntity$DataBean$OrdersBean$OrderDetailSBean;", "", "()V", "brand", "getBrand", "()Ljava/lang/Object;", "setBrand", "(Ljava/lang/Object;)V", "brandId", "getBrandId", "setBrandId", "categoryCode", "", "getCategoryCode", "()Ljava/lang/String;", "setCategoryCode", "(Ljava/lang/String;)V", "createTime", "getCreateTime", "setCreateTime", "ctgnum", "getCtgnum", "setCtgnum", "goodsAmount", "", "getGoodsAmount", "()I", "setGoodsAmount", "(I)V", "goodsId", "getGoodsId", "setGoodsId", "goodsName", "getGoodsName", "setGoodsName", "goodsNo", "getGoodsNo", "setGoodsNo", "goodsPrice", "", "getGoodsPrice", "()D", "setGoodsPrice", "(D)V", "orderDetailId", "getOrderDetailId", "setOrderDetailId", "orderId", "getOrderId", "setOrderId", "originalGoodsAmount", "getOriginalGoodsAmount", "setOriginalGoodsAmount", "originalGoodsPrice", "getOriginalGoodsPrice", "setOriginalGoodsPrice", "partName", "getPartName", "setPartName", "partOe", "getPartOe", "setPartOe", "quality", "getQuality", "setQuality", "remark", "getRemark", "setRemark", "shoppingCartId", "getShoppingCartId", "setShoppingCartId", "sourceFrom", "getSourceFrom", "setSourceFrom", "spec", "getSpec", "setSpec", "totalPrice", "getTotalPrice", "setTotalPrice", "updateTime", "getUpdateTime", "setUpdateTime", "warehouseId", "getWarehouseId", "setWarehouseId", "app_WLDebug"})
            public static final class OrderDetailSBean {
                
                /**
                 * orderDetailId : null
                 * orderId : b829c4f2bf16a2daac607ba4c9a030d1
                 * goodsAmount : 1
                 * originalGoodsAmount : 1
                 * goodsPrice : 0.01
                 * originalGoodsPrice : 0.01
                 * goodsName : 12311313
                 * goodsNo : uue8qw23132d
                 * partName : null
                 * partOe : null
                 * spec : null
                 * brand : null
                 * remark : null
                 * ctgnum : null
                 * quality : null
                 * goodsId : 42
                 * sourceFrom : null
                 * totalPrice : 0.01
                 * warehouseId : null
                 * createTime : null
                 * updateTime : null
                 * categoryCode : 106-10
                 * brandId : null
                 * shoppingCartId : null
                 */
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object orderDetailId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String orderId;
                private int goodsAmount = 0;
                private int originalGoodsAmount = 0;
                private double goodsPrice = 0.0;
                private double originalGoodsPrice = 0.0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String goodsName;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String goodsNo;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object partName;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object partOe;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object spec;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object brand;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object remark;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object ctgnum;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object quality;
                private int goodsId = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object sourceFrom;
                private double totalPrice = 0.0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object warehouseId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object createTime;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object updateTime;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String categoryCode;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object brandId;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object shoppingCartId;
                
                public OrderDetailSBean() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getOrderDetailId() {
                    return null;
                }
                
                public final void setOrderDetailId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getOrderId() {
                    return null;
                }
                
                public final void setOrderId(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public final int getGoodsAmount() {
                    return 0;
                }
                
                public final void setGoodsAmount(int p0) {
                }
                
                public final int getOriginalGoodsAmount() {
                    return 0;
                }
                
                public final void setOriginalGoodsAmount(int p0) {
                }
                
                public final double getGoodsPrice() {
                    return 0.0;
                }
                
                public final void setGoodsPrice(double p0) {
                }
                
                public final double getOriginalGoodsPrice() {
                    return 0.0;
                }
                
                public final void setOriginalGoodsPrice(double p0) {
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
                public final java.lang.Object getPartOe() {
                    return null;
                }
                
                public final void setPartOe(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getSpec() {
                    return null;
                }
                
                public final void setSpec(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getBrand() {
                    return null;
                }
                
                public final void setBrand(@org.jetbrains.annotations.Nullable()
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
                public final java.lang.Object getCtgnum() {
                    return null;
                }
                
                public final void setCtgnum(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getQuality() {
                    return null;
                }
                
                public final void setQuality(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final int getGoodsId() {
                    return 0;
                }
                
                public final void setGoodsId(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getSourceFrom() {
                    return null;
                }
                
                public final void setSourceFrom(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final double getTotalPrice() {
                    return 0.0;
                }
                
                public final void setTotalPrice(double p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getWarehouseId() {
                    return null;
                }
                
                public final void setWarehouseId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
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
                public final java.lang.String getCategoryCode() {
                    return null;
                }
                
                public final void setCategoryCode(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getBrandId() {
                    return null;
                }
                
                public final void setBrandId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getShoppingCartId() {
                    return null;
                }
                
                public final void setShoppingCartId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
            }
        }
    }
}