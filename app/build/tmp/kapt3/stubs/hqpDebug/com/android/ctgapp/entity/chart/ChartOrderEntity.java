package com.android.ctgapp.entity.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartOrderEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpDebug"})
public final class ChartOrderEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"44253087d93a4430a781233913d91189","orderNo":"DD20210429135146711PKYO068","refundNo":null,"cashChangeNo":null,"totalNumber":100,"totalPrice":16600,"originalTotalNumber":100,"originalTotalPrice":16600,"sellerCompanyId":888898022,"buyerCompanyId":888898018,"allianceId":0,"state":7,"orderBatchNo":"PC20210429135146670DYKP067","province":"福建","city":"莆田","district":"仙游县","address":"西西小可","postNum":null,"receiverName":"杰克汤姆","telephone":"16675650561","createTime":"2021-04-29 13:51:47","updateTime":"2021-04-29 14:06:46","confirmTime":null,"remark":"","buyerUserId":1586,"closingDate":null,"payee":null,"quotationId":null,"refuseReason":null,"sellAffirm":false,"buyAffirm":false,"outBill":false,"indentFrom":1,"erpOrderId":null,"orderStatus":null,"invoiceType":0,"orderType":2,"orderWay":0,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":"乌拉拉","sellerCompanyName":"青岛通达汽配经销商","sellerCompanyAddress":null,"allianceName":null,"orderDetailS":[{"orderDetailId":"398c81c728f540b1ab9b0201b603066e","orderId":"44253087d93a4430a781233913d91189","goodsAmount":100,"originalGoodsAmount":100,"goodsPrice":166,"originalGoodsPrice":166,"wsPrice":null,"goodsImg":"http://ctgoe.oss-cn-qingdao.aliyuncs.com//product/part/main/fcaf2c8d7ad4484e81eddc70ad72dd23.png","goodsName":"轿车轮胎","goodsNo":"3PH01956014E000001","partName":"轿车轮胎","partOe":"","factoryid":null,"spec":"195/60R14","brandId":1,"brand":"米其林","remark":null,"categoryCode":"106-10-01-01","ctgnum":"3106001","quality":null,"goodsId":17,"erpGoodsId":null,"partId":212,"sourceFrom":null,"totalPrice":16600,"warehouseId":null,"deductedStock":null,"createTime":"2021-04-29 13:51:47","updateTime":"2021-04-29 13:51:46","shoppingCartId":null,"couponPrice":null,"unRefundGoodsAmount":100}],"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":"微信","searchString":null,"returnOrderId":null,"returnStatus":null,"returnReason":null,"returnDesc":null,"returnPics":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgVoucher":null,"ctgOrderPay":{"orderPayId":"fcae0b1e1bb84a64a25f2c59aecd5df0","orderId":"44253087d93a4430a781233913d91189","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":16600,"alipayCash":null,"payWay":2,"thirdPartyPay":16600,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2021-04-29 13:51:47","updateTime":"2021-04-29 13:51:46"},"discountPrice":0,"actuallyPrice":16600,"modifiedOrder":null,"originalCtgOrderPay":null,"orderIds":null,"orderNos":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"expirationTime":0,"industry":null,"enquiryId":null,"auditState":null,"ownCustomer":null,"vin":null,"goodsNames":null,"orderInfo":null}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.chart.ChartOrderEntity.DataBean data;
    private boolean isSuccess = false;
    
    public ChartOrderEntity() {
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
    public final com.android.ctgapp.entity.chart.ChartOrderEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.chart.ChartOrderEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b\u008b\u0001\u0018\u00002\u00020\u0001:\u0004\u009e\u0002\u009f\u0002B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001c\u0010&\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\f\"\u0004\b(\u0010\u000eR\u001a\u0010)\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R\u001c\u0010,\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R\u001c\u0010/\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001c\u00102\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R\u001c\u00105\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR\u001c\u00108\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010\u0019R\u001c\u0010;\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u0010\u0019R\u001c\u0010>\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u0019R\u001c\u0010A\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0017\"\u0004\bC\u0010\u0019R\u001c\u0010D\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000eR\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0017\"\u0004\bO\u0010\u0019R\u001c\u0010P\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0017\"\u0004\bR\u0010\u0019R\u001a\u0010S\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0012\"\u0004\bU\u0010\u0014R\u001c\u0010V\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010\u000eR\u001c\u0010Y\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0017\"\u0004\b[\u0010\u0019R\u001c\u0010\\\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0017\"\u0004\b^\u0010\u0019R\u001c\u0010_\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0017\"\u0004\ba\u0010\u0019R\u001a\u0010b\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0012\"\u0004\bd\u0010\u0014R\u001c\u0010e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0017\"\u0004\bg\u0010\u0019R\u001c\u0010h\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0017\"\u0004\bj\u0010\u0019R\u001a\u0010k\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0012\"\u0004\bm\u0010\u0014R\u001c\u0010n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0017\"\u0004\bp\u0010\u0019R\u001c\u0010q\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u0017\"\u0004\bs\u0010\u0019R\u001a\u0010t\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u0012\"\u0004\bv\u0010\u0014R\u001a\u0010w\u001a\u00020xX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010y\"\u0004\bz\u0010{R\u001c\u0010|\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0017\"\u0004\b}\u0010\u0019R\u001c\u0010~\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u0017\"\u0004\b\u007f\u0010\u0019R\u001d\u0010\u0080\u0001\u001a\u00020xX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010y\"\u0005\b\u0081\u0001\u0010{R\u001d\u0010\u0082\u0001\u001a\u00020xX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010y\"\u0005\b\u0083\u0001\u0010{R\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0017\"\u0005\b\u0086\u0001\u0010\u0019R\u001f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0017\"\u0005\b\u0089\u0001\u0010\u0019R\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0017\"\u0005\b\u008c\u0001\u0010\u0019R\u001f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\f\"\u0005\b\u008f\u0001\u0010\u000eR\u001f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0017\"\u0005\b\u0092\u0001\u0010\u0019R)\u0010\u0093\u0001\u001a\f\u0012\u0005\u0012\u00030\u0095\u0001\u0018\u00010\u0094\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010\f\"\u0005\b\u009c\u0001\u0010\u000eR\u001f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u0017\"\u0005\b\u009f\u0001\u0010\u0019R\u001f\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010\u0017\"\u0005\b\u00a2\u0001\u0010\u0019R\u001f\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a4\u0001\u0010\u0017\"\u0005\b\u00a5\u0001\u0010\u0019R\u001f\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a7\u0001\u0010\f\"\u0005\b\u00a8\u0001\u0010\u000eR\u001f\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0001\u0010\u0017\"\u0005\b\u00ab\u0001\u0010\u0019R\u001f\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010\u0017\"\u0005\b\u00ae\u0001\u0010\u0019R\u001d\u0010\u00af\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b0\u0001\u0010\u0012\"\u0005\b\u00b1\u0001\u0010\u0014R\u001d\u0010\u00b2\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b3\u0001\u0010\u0012\"\u0005\b\u00b4\u0001\u0010\u0014R\u001f\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b6\u0001\u0010\u0017\"\u0005\b\u00b7\u0001\u0010\u0019R\u001d\u0010\u00b8\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b9\u0001\u0010\u0012\"\u0005\b\u00ba\u0001\u0010\u0014R\u001d\u0010\u00bb\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bc\u0001\u0010\u0006\"\u0005\b\u00bd\u0001\u0010\bR\u001f\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bf\u0001\u0010\u0017\"\u0005\b\u00c0\u0001\u0010\u0019R\u001d\u0010\u00c1\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c2\u0001\u0010\u0012\"\u0005\b\u00c3\u0001\u0010\u0014R\u001d\u0010\u00c4\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c5\u0001\u0010\u0012\"\u0005\b\u00c6\u0001\u0010\u0014R\u001f\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c8\u0001\u0010\u0017\"\u0005\b\u00c9\u0001\u0010\u0019R\u001f\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cb\u0001\u0010\f\"\u0005\b\u00cc\u0001\u0010\u000eR\u001f\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ce\u0001\u0010\u0017\"\u0005\b\u00cf\u0001\u0010\u0019R\u001f\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d1\u0001\u0010\u0017\"\u0005\b\u00d2\u0001\u0010\u0019R\u001f\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d4\u0001\u0010\f\"\u0005\b\u00d5\u0001\u0010\u000eR\u001f\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d7\u0001\u0010\u0017\"\u0005\b\u00d8\u0001\u0010\u0019R\u001f\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00da\u0001\u0010\f\"\u0005\b\u00db\u0001\u0010\u000eR\u001f\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00dd\u0001\u0010\u0017\"\u0005\b\u00de\u0001\u0010\u0019R\u001f\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e0\u0001\u0010\u0017\"\u0005\b\u00e1\u0001\u0010\u0019R\u001f\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e3\u0001\u0010\f\"\u0005\b\u00e4\u0001\u0010\u000eR\u001f\u0010\u00e5\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e6\u0001\u0010\u0017\"\u0005\b\u00e7\u0001\u0010\u0019R\u001f\u0010\u00e8\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e9\u0001\u0010\u0017\"\u0005\b\u00ea\u0001\u0010\u0019R\u001f\u0010\u00eb\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ec\u0001\u0010\u0017\"\u0005\b\u00ed\u0001\u0010\u0019R\u001f\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ef\u0001\u0010\u0017\"\u0005\b\u00f0\u0001\u0010\u0019R\u001f\u0010\u00f1\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f2\u0001\u0010\u0017\"\u0005\b\u00f3\u0001\u0010\u0019R\u001f\u0010\u00f4\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f5\u0001\u0010\u0017\"\u0005\b\u00f6\u0001\u0010\u0019R\u001f\u0010\u00f7\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f8\u0001\u0010\u0017\"\u0005\b\u00f9\u0001\u0010\u0019R\u001d\u0010\u00fa\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00fb\u0001\u0010\u0012\"\u0005\b\u00fc\u0001\u0010\u0014R\u001f\u0010\u00fd\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00fe\u0001\u0010\u0017\"\u0005\b\u00ff\u0001\u0010\u0019R\u001f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0002\u0010\f\"\u0005\b\u0082\u0002\u0010\u000eR\u001f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0002\u0010\u0017\"\u0005\b\u0085\u0002\u0010\u0019R\u001d\u0010\u0086\u0002\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0002\u0010\u0012\"\u0005\b\u0088\u0002\u0010\u0014R\u001f\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0002\u0010\u0017\"\u0005\b\u008b\u0002\u0010\u0019R\u001f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0002\u0010\u0017\"\u0005\b\u008e\u0002\u0010\u0019R\u001f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0002\u0010\f\"\u0005\b\u0091\u0002\u0010\u000eR\u001d\u0010\u0092\u0002\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0002\u0010\u0012\"\u0005\b\u0094\u0002\u0010\u0014R\u001d\u0010\u0095\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0002\u0010\u0006\"\u0005\b\u0097\u0002\u0010\bR\u001f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0002\u0010\f\"\u0005\b\u009a\u0002\u0010\u000eR\u001f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0002\u0010\u0017\"\u0005\b\u009d\u0002\u0010\u0019\u00a8\u0006\u00a0\u0002"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean;", "", "()V", "actuallyPrice", "", "getActuallyPrice", "()D", "setActuallyPrice", "(D)V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "allianceId", "", "getAllianceId", "()I", "setAllianceId", "(I)V", "allianceName", "getAllianceName", "()Ljava/lang/Object;", "setAllianceName", "(Ljava/lang/Object;)V", "auditState", "getAuditState", "setAuditState", "bank", "getBank", "setBank", "buyerCompanyId", "getBuyerCompanyId", "setBuyerCompanyId", "buyerCompanyIds", "getBuyerCompanyIds", "setBuyerCompanyIds", "buyerCompanyName", "getBuyerCompanyName", "setBuyerCompanyName", "buyerUserId", "getBuyerUserId", "setBuyerUserId", "buyerUserName", "getBuyerUserName", "setBuyerUserName", "cashChangeNo", "getCashChangeNo", "setCashChangeNo", "cashReplaceId", "getCashReplaceId", "setCashReplaceId", "city", "getCity", "setCity", "closingDate", "getClosingDate", "setClosingDate", "companyAddress", "getCompanyAddress", "setCompanyAddress", "companyPhone", "getCompanyPhone", "setCompanyPhone", "confirmTime", "getConfirmTime", "setConfirmTime", "createTime", "getCreateTime", "setCreateTime", "ctgOrderPay", "Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean$CtgOrderPayBean;", "getCtgOrderPay", "()Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean$CtgOrderPayBean;", "setCtgOrderPay", "(Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean$CtgOrderPayBean;)V", "ctgVoucher", "getCtgVoucher", "setCtgVoucher", "days", "getDays", "setDays", "discountPrice", "getDiscountPrice", "setDiscountPrice", "district", "getDistrict", "setDistrict", "endDate", "getEndDate", "setEndDate", "enquiryId", "getEnquiryId", "setEnquiryId", "erpOrderId", "getErpOrderId", "setErpOrderId", "expirationTime", "getExpirationTime", "setExpirationTime", "goodsNames", "getGoodsNames", "setGoodsNames", "head", "getHead", "setHead", "indentFrom", "getIndentFrom", "setIndentFrom", "indentFroms", "getIndentFroms", "setIndentFroms", "industry", "getIndustry", "setIndustry", "invoiceType", "getInvoiceType", "setInvoiceType", "isBuyAffirm", "", "()Z", "setBuyAffirm", "(Z)V", "isNeedChangeReceiverInfo", "setNeedChangeReceiverInfo", "isNeedChangeRemark", "setNeedChangeRemark", "isOutBill", "setOutBill", "isSellAffirm", "setSellAffirm", "leftCash", "getLeftCash", "setLeftCash", "limitNum", "getLimitNum", "setLimitNum", "modifiedOrder", "getModifiedOrder", "setModifiedOrder", "orderBatchNo", "getOrderBatchNo", "setOrderBatchNo", "orderByDescs", "getOrderByDescs", "setOrderByDescs", "orderDetailS", "", "Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean$OrderDetailSBean;", "getOrderDetailS", "()Ljava/util/List;", "setOrderDetailS", "(Ljava/util/List;)V", "orderId", "getOrderId", "setOrderId", "orderIds", "getOrderIds", "setOrderIds", "orderInfo", "getOrderInfo", "setOrderInfo", "orderInvoice", "getOrderInvoice", "setOrderInvoice", "orderNo", "getOrderNo", "setOrderNo", "orderNos", "getOrderNos", "setOrderNos", "orderStatus", "getOrderStatus", "setOrderStatus", "orderType", "getOrderType", "setOrderType", "orderWay", "getOrderWay", "setOrderWay", "originalCtgOrderPay", "getOriginalCtgOrderPay", "setOriginalCtgOrderPay", "originalTotalNumber", "getOriginalTotalNumber", "setOriginalTotalNumber", "originalTotalPrice", "getOriginalTotalPrice", "setOriginalTotalPrice", "ownCustomer", "getOwnCustomer", "setOwnCustomer", "pageNum", "getPageNum", "setPageNum", "pageSize", "getPageSize", "setPageSize", "payWay", "getPayWay", "setPayWay", "payWayString", "getPayWayString", "setPayWayString", "payee", "getPayee", "setPayee", "postNum", "getPostNum", "setPostNum", "province", "getProvince", "setProvince", "quotationId", "getQuotationId", "setQuotationId", "receiverName", "getReceiverName", "setReceiverName", "refundNo", "getRefundNo", "setRefundNo", "refuseReason", "getRefuseReason", "setRefuseReason", "remark", "getRemark", "setRemark", "returnDesc", "getReturnDesc", "setReturnDesc", "returnOrderId", "getReturnOrderId", "setReturnOrderId", "returnPics", "getReturnPics", "setReturnPics", "returnReason", "getReturnReason", "setReturnReason", "returnStatus", "getReturnStatus", "setReturnStatus", "searchString", "getSearchString", "setSearchString", "sellerCompanyAddress", "getSellerCompanyAddress", "setSellerCompanyAddress", "sellerCompanyId", "getSellerCompanyId", "setSellerCompanyId", "sellerCompanyIds", "getSellerCompanyIds", "setSellerCompanyIds", "sellerCompanyName", "getSellerCompanyName", "setSellerCompanyName", "startDate", "getStartDate", "setStartDate", "state", "getState", "setState", "states", "getStates", "setStates", "taxNo", "getTaxNo", "setTaxNo", "telephone", "getTelephone", "setTelephone", "totalNumber", "getTotalNumber", "setTotalNumber", "totalPrice", "getTotalPrice", "setTotalPrice", "updateTime", "getUpdateTime", "setUpdateTime", "vin", "getVin", "setVin", "CtgOrderPayBean", "OrderDetailSBean", "app_hqpDebug"})
    public static final class DataBean {
        
        /**
         * startDate : null
         * endDate : null
         * pageNum : 1
         * pageSize : 20
         * orderId : 44253087d93a4430a781233913d91189
         * orderNo : DD20210429135146711PKYO068
         * refundNo : null
         * cashChangeNo : null
         * totalNumber : 100
         * totalPrice : 16600.0
         * originalTotalNumber : 100
         * originalTotalPrice : 16600.0
         * sellerCompanyId : 888898022
         * buyerCompanyId : 888898018
         * allianceId : 0
         * state : 7
         * orderBatchNo : PC20210429135146670DYKP067
         * province : 福建
         * city : 莆田
         * district : 仙游县
         * address : 西西小可
         * postNum : null
         * receiverName : 杰克汤姆
         * telephone : 16675650561
         * createTime : 2021-04-29 13:51:47
         * updateTime : 2021-04-29 14:06:46
         * confirmTime : null
         * remark :
         * buyerUserId : 1586
         * closingDate : null
         * payee : null
         * quotationId : null
         * refuseReason : null
         * sellAffirm : false
         * buyAffirm : false
         * outBill : false
         * indentFrom : 1
         * erpOrderId : null
         * orderStatus : null
         * invoiceType : 0
         * orderType : 2
         * orderWay : 0
         * head : null
         * taxNo : null
         * companyAddress : null
         * companyPhone : null
         * bank : null
         * buyerUserName : null
         * buyerCompanyName : 乌拉拉
         * sellerCompanyName : 青岛通达汽配经销商
         * sellerCompanyAddress : null
         * allianceName : null
         * orderDetailS : [{"orderDetailId":"398c81c728f540b1ab9b0201b603066e","orderId":"44253087d93a4430a781233913d91189","goodsAmount":100,"originalGoodsAmount":100,"goodsPrice":166,"originalGoodsPrice":166,"wsPrice":null,"goodsImg":"http://ctgoe.oss-cn-qingdao.aliyuncs.com//product/part/main/fcaf2c8d7ad4484e81eddc70ad72dd23.png","goodsName":"轿车轮胎","goodsNo":"3PH01956014E000001","partName":"轿车轮胎","partOe":"","factoryid":null,"spec":"195/60R14","brandId":1,"brand":"米其林","remark":null,"categoryCode":"106-10-01-01","ctgnum":"3106001","quality":null,"goodsId":17,"erpGoodsId":null,"partId":212,"sourceFrom":null,"totalPrice":16600,"warehouseId":null,"deductedStock":null,"createTime":"2021-04-29 13:51:47","updateTime":"2021-04-29 13:51:46","shoppingCartId":null,"couponPrice":null,"unRefundGoodsAmount":100}]
         * cashReplaceId : null
         * payWay : null
         * leftCash : null
         * payWayString : 微信
         * searchString : null
         * returnOrderId : null
         * returnStatus : null
         * returnReason : null
         * returnDesc : null
         * returnPics : null
         * isNeedChangeReceiverInfo : null
         * isNeedChangeRemark : null
         * orderInvoice : null
         * ctgVoucher : null
         * ctgOrderPay : {"orderPayId":"fcae0b1e1bb84a64a25f2c59aecd5df0","orderId":"44253087d93a4430a781233913d91189","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":16600,"alipayCash":null,"payWay":2,"thirdPartyPay":16600,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2021-04-29 13:51:47","updateTime":"2021-04-29 13:51:46"}
         * discountPrice : 0
         * actuallyPrice : 16600.0
         * modifiedOrder : null
         * originalCtgOrderPay : null
         * orderIds : null
         * orderNos : null
         * buyerCompanyIds : null
         * sellerCompanyIds : null
         * states : null
         * indentFroms : null
         * orderByDescs : null
         * limitNum : null
         * days : null
         * expirationTime : 0
         * industry : null
         * enquiryId : null
         * auditState : null
         * ownCustomer : null
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
        private java.lang.Object refundNo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object cashChangeNo;
        private int totalNumber = 0;
        private double totalPrice = 0.0;
        private int originalTotalNumber = 0;
        private double originalTotalPrice = 0.0;
        private int sellerCompanyId = 0;
        private int buyerCompanyId = 0;
        private int allianceId = 0;
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
        private java.lang.String createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String updateTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object confirmTime;
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
        private boolean isSellAffirm = false;
        private boolean isBuyAffirm = false;
        private boolean isOutBill = false;
        private int indentFrom = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object erpOrderId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object orderStatus;
        private int invoiceType = 0;
        private int orderType = 0;
        private int orderWay = 0;
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
        private java.lang.Object sellerCompanyAddress;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object allianceName;
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
        private java.lang.Object returnOrderId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object returnStatus;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object returnReason;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object returnDesc;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object returnPics;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object isNeedChangeReceiverInfo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object isNeedChangeRemark;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object orderInvoice;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object ctgVoucher;
        @org.jetbrains.annotations.Nullable()
        private com.android.ctgapp.entity.chart.ChartOrderEntity.DataBean.CtgOrderPayBean ctgOrderPay;
        private int discountPrice = 0;
        private double actuallyPrice = 0.0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object modifiedOrder;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object originalCtgOrderPay;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object orderIds;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object orderNos;
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
        private int expirationTime = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object industry;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object enquiryId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object auditState;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object ownCustomer;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object vin;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object goodsNames;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object orderInfo;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.chart.ChartOrderEntity.DataBean.OrderDetailSBean> orderDetailS;
        
        public DataBean() {
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
        public final java.lang.Object getRefundNo() {
            return null;
        }
        
        public final void setRefundNo(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
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
        
        public final int getAllianceId() {
            return 0;
        }
        
        public final void setAllianceId(int p0) {
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
        public final java.lang.Object getConfirmTime() {
            return null;
        }
        
        public final void setConfirmTime(@org.jetbrains.annotations.Nullable()
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
        
        public final boolean isSellAffirm() {
            return false;
        }
        
        public final void setSellAffirm(boolean p0) {
        }
        
        public final boolean isBuyAffirm() {
            return false;
        }
        
        public final void setBuyAffirm(boolean p0) {
        }
        
        public final boolean isOutBill() {
            return false;
        }
        
        public final void setOutBill(boolean p0) {
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
        
        public final int getOrderType() {
            return 0;
        }
        
        public final void setOrderType(int p0) {
        }
        
        public final int getOrderWay() {
            return 0;
        }
        
        public final void setOrderWay(int p0) {
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
        public final java.lang.Object getSellerCompanyAddress() {
            return null;
        }
        
        public final void setSellerCompanyAddress(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAllianceName() {
            return null;
        }
        
        public final void setAllianceName(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.Object getReturnOrderId() {
            return null;
        }
        
        public final void setReturnOrderId(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getReturnStatus() {
            return null;
        }
        
        public final void setReturnStatus(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getReturnReason() {
            return null;
        }
        
        public final void setReturnReason(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getReturnDesc() {
            return null;
        }
        
        public final void setReturnDesc(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getReturnPics() {
            return null;
        }
        
        public final void setReturnPics(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.Object getCtgVoucher() {
            return null;
        }
        
        public final void setCtgVoucher(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.android.ctgapp.entity.chart.ChartOrderEntity.DataBean.CtgOrderPayBean getCtgOrderPay() {
            return null;
        }
        
        public final void setCtgOrderPay(@org.jetbrains.annotations.Nullable()
        com.android.ctgapp.entity.chart.ChartOrderEntity.DataBean.CtgOrderPayBean p0) {
        }
        
        public final int getDiscountPrice() {
            return 0;
        }
        
        public final void setDiscountPrice(int p0) {
        }
        
        public final double getActuallyPrice() {
            return 0.0;
        }
        
        public final void setActuallyPrice(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getModifiedOrder() {
            return null;
        }
        
        public final void setModifiedOrder(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getOriginalCtgOrderPay() {
            return null;
        }
        
        public final void setOriginalCtgOrderPay(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getOrderIds() {
            return null;
        }
        
        public final void setOrderIds(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getOrderNos() {
            return null;
        }
        
        public final void setOrderNos(@org.jetbrains.annotations.Nullable()
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
        
        public final int getExpirationTime() {
            return 0;
        }
        
        public final void setExpirationTime(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getIndustry() {
            return null;
        }
        
        public final void setIndustry(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getEnquiryId() {
            return null;
        }
        
        public final void setEnquiryId(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAuditState() {
            return null;
        }
        
        public final void setAuditState(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getOwnCustomer() {
            return null;
        }
        
        public final void setOwnCustomer(@org.jetbrains.annotations.Nullable()
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
        public final java.util.List<com.android.ctgapp.entity.chart.ChartOrderEntity.DataBean.OrderDetailSBean> getOrderDetailS() {
            return null;
        }
        
        public final void setOrderDetailS(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.chart.ChartOrderEntity.DataBean.OrderDetailSBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u001c\u0010/\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R\u001a\u00102\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+\u00a8\u00065"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean$CtgOrderPayBean;", "", "()V", "alipayCash", "getAlipayCash", "()Ljava/lang/Object;", "setAlipayCash", "(Ljava/lang/Object;)V", "cashReplaceId", "getCashReplaceId", "setCashReplaceId", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "leftCash", "getLeftCash", "setLeftCash", "orderId", "getOrderId", "setOrderId", "orderPayId", "getOrderPayId", "setOrderPayId", "payWay", "", "getPayWay", "()I", "setPayWay", "(I)V", "repalceCash", "getRepalceCash", "setRepalceCash", "thirdOrderNo", "getThirdOrderNo", "setThirdOrderNo", "thirdPartyPay", "", "getThirdPartyPay", "()D", "setThirdPartyPay", "(D)V", "totalReturnCash", "getTotalReturnCash", "setTotalReturnCash", "updateTime", "getUpdateTime", "setUpdateTime", "wxPayCash", "getWxPayCash", "setWxPayCash", "app_hqpDebug"})
        public static final class CtgOrderPayBean {
            
            /**
             * orderPayId : fcae0b1e1bb84a64a25f2c59aecd5df0
             * orderId : 44253087d93a4430a781233913d91189
             * cashReplaceId : null
             * repalceCash : null
             * leftCash : null
             * wxPayCash : 16600.0
             * alipayCash : null
             * payWay : 2
             * thirdPartyPay : 16600.0
             * thirdOrderNo : null
             * totalReturnCash : 0.0
             * createTime : 2021-04-29 13:51:47
             * updateTime : 2021-04-29 13:51:46
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
            private double wxPayCash = 0.0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object alipayCash;
            private int payWay = 0;
            private double thirdPartyPay = 0.0;
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
            
            public final double getWxPayCash() {
                return 0.0;
            }
            
            public final void setWxPayCash(double p0) {
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
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u0006\n\u0002\b8\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001a\u0010&\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\f\"\u0004\b(\u0010\u000eR\u001a\u0010)\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001a\u00105\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\u001c\u0010>\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR\u001a\u0010D\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\u001a\u0010G\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\f\"\u0004\bI\u0010\u000eR\u001c\u0010J\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\bR\u001c\u0010M\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0006\"\u0004\bO\u0010\bR\u001c\u0010P\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0014\"\u0004\bR\u0010\u0016R\u001c\u0010S\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0014\"\u0004\bU\u0010\u0016R\u001c\u0010V\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0014\"\u0004\bX\u0010\u0016R\u001c\u0010Y\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0014\"\u0004\b[\u0010\u0016R\u001c\u0010\\\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0006\"\u0004\b^\u0010\bR\u001a\u0010_\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u00108\"\u0004\ba\u0010:R\u001a\u0010b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\f\"\u0004\bd\u0010\u000eR\u001c\u0010e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0006\"\u0004\bg\u0010\bR\u001c\u0010h\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0014\"\u0004\bj\u0010\u0016R\u001c\u0010k\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0014\"\u0004\bm\u0010\u0016\u00a8\u0006n"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartOrderEntity$DataBean$OrderDetailSBean;", "", "()V", "brand", "", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "brandId", "", "getBrandId", "()I", "setBrandId", "(I)V", "categoryCode", "getCategoryCode", "setCategoryCode", "couponPrice", "getCouponPrice", "()Ljava/lang/Object;", "setCouponPrice", "(Ljava/lang/Object;)V", "createTime", "getCreateTime", "setCreateTime", "ctgnum", "getCtgnum", "setCtgnum", "deductedStock", "getDeductedStock", "setDeductedStock", "erpGoodsId", "getErpGoodsId", "setErpGoodsId", "factoryid", "getFactoryid", "setFactoryid", "goodsAmount", "getGoodsAmount", "setGoodsAmount", "goodsId", "getGoodsId", "setGoodsId", "goodsImg", "getGoodsImg", "setGoodsImg", "goodsName", "getGoodsName", "setGoodsName", "goodsNo", "getGoodsNo", "setGoodsNo", "goodsPrice", "", "getGoodsPrice", "()D", "setGoodsPrice", "(D)V", "orderDetailId", "getOrderDetailId", "setOrderDetailId", "orderId", "getOrderId", "setOrderId", "originalGoodsAmount", "getOriginalGoodsAmount", "setOriginalGoodsAmount", "originalGoodsPrice", "getOriginalGoodsPrice", "setOriginalGoodsPrice", "partId", "getPartId", "setPartId", "partName", "getPartName", "setPartName", "partOe", "getPartOe", "setPartOe", "quality", "getQuality", "setQuality", "remark", "getRemark", "setRemark", "shoppingCartId", "getShoppingCartId", "setShoppingCartId", "sourceFrom", "getSourceFrom", "setSourceFrom", "spec", "getSpec", "setSpec", "totalPrice", "getTotalPrice", "setTotalPrice", "unRefundGoodsAmount", "getUnRefundGoodsAmount", "setUnRefundGoodsAmount", "updateTime", "getUpdateTime", "setUpdateTime", "warehouseId", "getWarehouseId", "setWarehouseId", "wsPrice", "getWsPrice", "setWsPrice", "app_hqpDebug"})
        public static final class OrderDetailSBean {
            
            /**
             * orderDetailId : 398c81c728f540b1ab9b0201b603066e
             * orderId : 44253087d93a4430a781233913d91189
             * goodsAmount : 100
             * originalGoodsAmount : 100
             * goodsPrice : 166.0
             * originalGoodsPrice : 166.0
             * wsPrice : null
             * goodsImg : http://ctgoe.oss-cn-qingdao.aliyuncs.com//product/part/main/fcaf2c8d7ad4484e81eddc70ad72dd23.png
             * goodsName : 轿车轮胎
             * goodsNo : 3PH01956014E000001
             * partName : 轿车轮胎
             * partOe :
             * factoryid : null
             * spec : 195/60R14
             * brandId : 1
             * brand : 米其林
             * remark : null
             * categoryCode : 106-10-01-01
             * ctgnum : 3106001
             * quality : null
             * goodsId : 17
             * erpGoodsId : null
             * partId : 212
             * sourceFrom : null
             * totalPrice : 16600.0
             * warehouseId : null
             * deductedStock : null
             * createTime : 2021-04-29 13:51:47
             * updateTime : 2021-04-29 13:51:46
             * shoppingCartId : null
             * couponPrice : null
             * unRefundGoodsAmount : 100
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orderDetailId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orderId;
            private int goodsAmount = 0;
            private int originalGoodsAmount = 0;
            private double goodsPrice = 0.0;
            private double originalGoodsPrice = 0.0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object wsPrice;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsImg;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String partName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String partOe;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object factoryid;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String spec;
            private int brandId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String brand;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object remark;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String categoryCode;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String ctgnum;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object quality;
            private int goodsId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object erpGoodsId;
            private int partId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object sourceFrom;
            private double totalPrice = 0.0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object warehouseId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object deductedStock;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String createTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String updateTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object shoppingCartId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object couponPrice;
            private int unRefundGoodsAmount = 0;
            
            public OrderDetailSBean() {
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
            public final java.lang.Object getWsPrice() {
                return null;
            }
            
            public final void setWsPrice(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getGoodsImg() {
                return null;
            }
            
            public final void setGoodsImg(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getGoodsNo() {
                return null;
            }
            
            public final void setGoodsNo(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Object getFactoryid() {
                return null;
            }
            
            public final void setFactoryid(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getSpec() {
                return null;
            }
            
            public final void setSpec(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final int getBrandId() {
                return 0;
            }
            
            public final void setBrandId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getBrand() {
                return null;
            }
            
            public final void setBrand(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getRemark() {
                return null;
            }
            
            public final void setRemark(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getCtgnum() {
                return null;
            }
            
            public final void setCtgnum(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
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
            public final java.lang.Object getErpGoodsId() {
                return null;
            }
            
            public final void setErpGoodsId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getPartId() {
                return 0;
            }
            
            public final void setPartId(int p0) {
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
            public final java.lang.Object getDeductedStock() {
                return null;
            }
            
            public final void setDeductedStock(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getUpdateTime() {
                return null;
            }
            
            public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getShoppingCartId() {
                return null;
            }
            
            public final void setShoppingCartId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCouponPrice() {
                return null;
            }
            
            public final void setCouponPrice(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public final int getUnRefundGoodsAmount() {
                return 0;
            }
            
            public final void setUnRefundGoodsAmount(int p0) {
            }
        }
    }
}