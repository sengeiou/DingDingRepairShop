package com.android.ctgapp.entity.deal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/deal/OrderDetailEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpRelease"})
public final class OrderDetailEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"orderId":"91fb73ba97944b2e07a33f3e58138063","orderNo":"DD20201116143138280MJAF007","cashChangeNo":null,"totalNumber":1,"totalPrice":0.01,"originalTotalNumber":1,"originalTotalPrice":0.01,"sellerCompanyId":12345,"buyerCompanyId":65551,"allianceId":null,"state":7,"orderBatchNo":"PC20201116143138255PFWH006","province":"江苏省","city":"无锡市","district":"锡山区","address":"有点意思你这个骚东西","postNum":null,"receiverName":"阿兴","telephone":"1333333333","createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:46:38","remark":"有点意思","buyerUserId":1309,"closingDate":null,"payee":null,"quotationId":null,"refuseReason":null,"sellAffirm":false,"buyAffirm":false,"outBill":false,"indentFrom":1,"erpOrderId":null,"orderStatus":null,"invoiceType":0,"head":null,"taxNo":null,"companyAddress":null,"companyPhone":null,"bank":null,"buyerUserName":null,"buyerCompanyName":"小黄维修","sellerCompanyName":"无锡畅通汽配公司","orderDetailS":[{"orderDetailId":"974563c4ea95f49abf772983614050e6","orderId":"91fb73ba97944b2e07a33f3e58138063","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"44444444","goodsNo":"33322111","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":51,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:31:38","categoryCode":null,"brandId":null,"shoppingCartId":null}],"cashReplaceId":null,"payWay":null,"leftCash":null,"payWayString":"支付宝","searchString":null,"isNeedChangeReceiverInfo":null,"isNeedChangeRemark":null,"orderInvoice":null,"ctgOrderPay":{"orderPayId":"c3143049fe147ae31cc7602cc7e25594","orderId":"91fb73ba97944b2e07a33f3e58138063","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:31:38"},"originalCtgOrderPay":null,"buyerCompanyIds":null,"sellerCompanyIds":null,"states":null,"indentFroms":null,"orderByDescs":null,"limitNum":null,"days":null,"industry":null,"vin":null,"goodsNames":null,"orderInfo":null}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean data;
    private boolean isSuccess = false;
    
    public OrderDetailEntity() {
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
    public final com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\bE\n\u0002\u0010\u0006\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0004\u00f4\u0001\u00f5\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001c\u0010*\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001c\u00107\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010\u0017R\u001c\u0010:\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0015\"\u0004\b<\u0010\u0017R\u001c\u0010=\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0015\"\u0004\b?\u0010\u0017R\u001c\u0010@\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010I\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR\u001c\u0010L\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR\u001c\u0010O\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0006\"\u0004\bQ\u0010\bR\u001c\u0010R\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0015\"\u0004\bT\u0010\u0017R\u001c\u0010U\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0015\"\u0004\bW\u0010\u0017R\u001e\u0010X\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u0010\u0011R\u001c\u0010[\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0015\"\u0004\b]\u0010\u0017R\u001c\u0010^\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0015\"\u0004\b`\u0010\u0017R\u001e\u0010a\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bb\u0010\u000f\"\u0004\bc\u0010\u0011R\u001c\u0010d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0015\"\u0004\bf\u0010\u0017R\u001c\u0010g\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0015\"\u0004\bi\u0010\u0017R\u001e\u0010j\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bk\u0010\u000f\"\u0004\bl\u0010\u0011R\u001a\u0010m\u001a\u00020nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010o\"\u0004\bp\u0010qR\u001c\u0010r\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u0015\"\u0004\bs\u0010\u0017R\u001c\u0010t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0015\"\u0004\bu\u0010\u0017R\u001a\u0010v\u001a\u00020nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010o\"\u0004\bw\u0010qR\u001a\u0010x\u001a\u00020nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010o\"\u0004\by\u0010qR\u001e\u0010z\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bz\u0010\u000f\"\u0004\b{\u0010\u0011R\u001c\u0010|\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0015\"\u0004\b~\u0010\u0017R\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0015\"\u0005\b\u0081\u0001\u0010\u0017R\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0006\"\u0005\b\u0084\u0001\u0010\bR\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0015\"\u0005\b\u0087\u0001\u0010\u0017R&\u0010\u0088\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u00010.X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u00101\"\u0005\b\u008b\u0001\u00103R\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u0006\"\u0005\b\u008e\u0001\u0010\bR\u001f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u0015\"\u0005\b\u0091\u0001\u0010\u0017R\u001f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010\u0015\"\u0005\b\u0094\u0001\u0010\u0017R\u001f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010\u0006\"\u0005\b\u0097\u0001\u0010\bR\u001f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u0015\"\u0005\b\u009a\u0001\u0010\u0017R\u001f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010\u0015\"\u0005\b\u009d\u0001\u0010\u0017R!\u0010\u009e\u0001\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0012\u001a\u0005\b\u009f\u0001\u0010\u000f\"\u0005\b\u00a0\u0001\u0010\u0011R%\u0010\u00a1\u0001\u001a\u0005\u0018\u00010\u00a2\u0001X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00a7\u0001\u001a\u0006\b\u00a3\u0001\u0010\u00a4\u0001\"\u0006\b\u00a5\u0001\u0010\u00a6\u0001R!\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0012\u001a\u0005\b\u00a9\u0001\u0010\u000f\"\u0005\b\u00aa\u0001\u0010\u0011R!\u0010\u00ab\u0001\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0012\u001a\u0005\b\u00ac\u0001\u0010\u000f\"\u0005\b\u00ad\u0001\u0010\u0011R!\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0012\u001a\u0005\b\u00af\u0001\u0010\u000f\"\u0005\b\u00b0\u0001\u0010\u0011R\u001f\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b2\u0001\u0010\u0006\"\u0005\b\u00b3\u0001\u0010\bR\u001f\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0001\u0010\u0015\"\u0005\b\u00b6\u0001\u0010\u0017R\u001f\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b8\u0001\u0010\u0015\"\u0005\b\u00b9\u0001\u0010\u0017R\u001f\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bb\u0001\u0010\u0006\"\u0005\b\u00bc\u0001\u0010\bR\u001f\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00be\u0001\u0010\u0015\"\u0005\b\u00bf\u0001\u0010\u0017R\u001f\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c1\u0001\u0010\u0006\"\u0005\b\u00c2\u0001\u0010\bR\u001f\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c4\u0001\u0010\u0015\"\u0005\b\u00c5\u0001\u0010\u0017R\u001f\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c7\u0001\u0010\u0006\"\u0005\b\u00c8\u0001\u0010\bR\u001f\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ca\u0001\u0010\u0015\"\u0005\b\u00cb\u0001\u0010\u0017R!\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0012\u001a\u0005\b\u00cd\u0001\u0010\u000f\"\u0005\b\u00ce\u0001\u0010\u0011R\u001f\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d0\u0001\u0010\u0015\"\u0005\b\u00d1\u0001\u0010\u0017R\u001f\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d3\u0001\u0010\u0006\"\u0005\b\u00d4\u0001\u0010\bR\u001f\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d6\u0001\u0010\u0015\"\u0005\b\u00d7\u0001\u0010\u0017R\u001f\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d9\u0001\u0010\u0006\"\u0005\b\u00da\u0001\u0010\bR\u001f\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00dc\u0001\u0010\u0015\"\u0005\b\u00dd\u0001\u0010\u0017R\u001f\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00df\u0001\u0010\u0015\"\u0005\b\u00e0\u0001\u0010\u0017R\u001f\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e2\u0001\u0010\u0006\"\u0005\b\u00e3\u0001\u0010\bR\u001f\u0010\u00e4\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e5\u0001\u0010\u0006\"\u0005\b\u00e6\u0001\u0010\bR%\u0010\u00e7\u0001\u001a\u0005\u0018\u00010\u00e8\u0001X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00ed\u0001\u001a\u0006\b\u00e9\u0001\u0010\u00ea\u0001\"\u0006\b\u00eb\u0001\u0010\u00ec\u0001R\u001f\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ef\u0001\u0010\u0006\"\u0005\b\u00f0\u0001\u0010\bR\u001f\u0010\u00f1\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f2\u0001\u0010\u0015\"\u0005\b\u00f3\u0001\u0010\u0017\u00a8\u0006\u00f6\u0001"}, d2 = {"Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean;", "", "()V", "actuallyPrice", "", "getActuallyPrice", "()Ljava/lang/String;", "setActuallyPrice", "(Ljava/lang/String;)V", "address", "getAddress", "setAddress", "allianceId", "", "getAllianceId", "()Ljava/lang/Integer;", "setAllianceId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bank", "getBank", "()Ljava/lang/Object;", "setBank", "(Ljava/lang/Object;)V", "buyerCompanyId", "getBuyerCompanyId", "setBuyerCompanyId", "buyerCompanyIds", "getBuyerCompanyIds", "setBuyerCompanyIds", "buyerCompanyName", "getBuyerCompanyName", "setBuyerCompanyName", "buyerUserId", "getBuyerUserId", "setBuyerUserId", "buyerUserName", "getBuyerUserName", "setBuyerUserName", "cashChangeNo", "getCashChangeNo", "setCashChangeNo", "cashReplaceId", "getCashReplaceId", "setCashReplaceId", "chaters", "", "Lcom/android/ctgapp/entity/deal/ChatersBean;", "getChaters", "()Ljava/util/List;", "setChaters", "(Ljava/util/List;)V", "city", "getCity", "setCity", "closingDate", "getClosingDate", "setClosingDate", "companyAddress", "getCompanyAddress", "setCompanyAddress", "companyPhone", "getCompanyPhone", "setCompanyPhone", "createTime", "getCreateTime", "setCreateTime", "ctgOrderPay", "Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean$CtgOrderPayBean;", "getCtgOrderPay", "()Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean$CtgOrderPayBean;", "setCtgOrderPay", "(Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean$CtgOrderPayBean;)V", "days", "getDays", "setDays", "discountPrice", "getDiscountPrice", "setDiscountPrice", "district", "getDistrict", "setDistrict", "endDate", "getEndDate", "setEndDate", "erpOrderId", "getErpOrderId", "setErpOrderId", "expirationTime", "getExpirationTime", "setExpirationTime", "goodsNames", "getGoodsNames", "setGoodsNames", "head", "getHead", "setHead", "indentFrom", "getIndentFrom", "setIndentFrom", "indentFroms", "getIndentFroms", "setIndentFroms", "industry", "getIndustry", "setIndustry", "invoiceType", "getInvoiceType", "setInvoiceType", "isBuyAffirm", "", "()Z", "setBuyAffirm", "(Z)V", "isNeedChangeReceiverInfo", "setNeedChangeReceiverInfo", "isNeedChangeRemark", "setNeedChangeRemark", "isOutBill", "setOutBill", "isSellAffirm", "setSellAffirm", "isSettled", "setSettled", "leftCash", "getLeftCash", "setLeftCash", "limitNum", "getLimitNum", "setLimitNum", "orderBatchNo", "getOrderBatchNo", "setOrderBatchNo", "orderByDescs", "getOrderByDescs", "setOrderByDescs", "orderDetailS", "Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean$OrderDetailSBean;", "getOrderDetailS", "setOrderDetailS", "orderId", "getOrderId", "setOrderId", "orderInfo", "getOrderInfo", "setOrderInfo", "orderInvoice", "getOrderInvoice", "setOrderInvoice", "orderNo", "getOrderNo", "setOrderNo", "orderStatus", "getOrderStatus", "setOrderStatus", "originalCtgOrderPay", "getOriginalCtgOrderPay", "setOriginalCtgOrderPay", "originalTotalNumber", "getOriginalTotalNumber", "setOriginalTotalNumber", "originalTotalPrice", "", "getOriginalTotalPrice", "()Ljava/lang/Float;", "setOriginalTotalPrice", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "pageNum", "getPageNum", "setPageNum", "pageSize", "getPageSize", "setPageSize", "payWay", "getPayWay", "setPayWay", "payWayString", "getPayWayString", "setPayWayString", "payee", "getPayee", "setPayee", "postNum", "getPostNum", "setPostNum", "province", "getProvince", "setProvince", "quotationId", "getQuotationId", "setQuotationId", "receiverName", "getReceiverName", "setReceiverName", "refuseReason", "getRefuseReason", "setRefuseReason", "remark", "getRemark", "setRemark", "searchString", "getSearchString", "setSearchString", "sellerCompanyId", "getSellerCompanyId", "setSellerCompanyId", "sellerCompanyIds", "getSellerCompanyIds", "setSellerCompanyIds", "sellerCompanyName", "getSellerCompanyName", "setSellerCompanyName", "startDate", "getStartDate", "setStartDate", "state", "getState", "setState", "states", "getStates", "setStates", "taxNo", "getTaxNo", "setTaxNo", "telephone", "getTelephone", "setTelephone", "totalNumber", "getTotalNumber", "setTotalNumber", "totalPrice", "", "getTotalPrice", "()Ljava/lang/Double;", "setTotalPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "updateTime", "getUpdateTime", "setUpdateTime", "vin", "getVin", "setVin", "CtgOrderPayBean", "OrderDetailSBean", "app_hqpRelease"})
    public static final class DataBean {
        
        /**
         * startDate : null
         * endDate : null
         * pageNum : 1
         * pageSize : 20
         * orderId : 91fb73ba97944b2e07a33f3e58138063
         * orderNo : DD20201116143138280MJAF007
         * cashChangeNo : null
         * totalNumber : 1
         * totalPrice : 0.01
         * originalTotalNumber : 1
         * originalTotalPrice : 0.01
         * sellerCompanyId : 12345
         * buyerCompanyId : 65551
         * allianceId : null
         * state : 7
         * orderBatchNo : PC20201116143138255PFWH006
         * province : 江苏省
         * city : 无锡市
         * district : 锡山区
         * address : 有点意思你这个骚东西
         * postNum : null
         * receiverName : 阿兴
         * telephone : 1333333333
         * createTime : 2020-11-16 14:31:38
         * updateTime : 2020-11-16 14:46:38
         * remark : 有点意思
         * buyerUserId : 1309
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
         * head : null
         * taxNo : null
         * companyAddress : null
         * companyPhone : null
         * bank : null
         * buyerUserName : null
         * buyerCompanyName : 小黄维修
         * sellerCompanyName : 无锡畅通汽配公司
         * orderDetailS : [{"orderDetailId":"974563c4ea95f49abf772983614050e6","orderId":"91fb73ba97944b2e07a33f3e58138063","goodsAmount":1,"originalGoodsAmount":1,"goodsPrice":0.01,"originalGoodsPrice":0.01,"goodsName":"44444444","goodsNo":"33322111","partName":null,"partOe":null,"spec":null,"brand":null,"remark":null,"ctgnum":null,"quality":null,"goodsId":51,"sourceFrom":null,"totalPrice":0.01,"warehouseId":null,"createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:31:38","categoryCode":null,"brandId":null,"shoppingCartId":null}]
         * cashReplaceId : null
         * payWay : null
         * leftCash : null
         * payWayString : 支付宝
         * searchString : null
         * isNeedChangeReceiverInfo : null
         * isNeedChangeRemark : null
         * orderInvoice : null
         * ctgOrderPay : {"orderPayId":"c3143049fe147ae31cc7602cc7e25594","orderId":"91fb73ba97944b2e07a33f3e58138063","cashReplaceId":null,"repalceCash":null,"leftCash":null,"wxPayCash":null,"alipayCash":0.01,"payWay":3,"thirdPartyPay":0.01,"thirdOrderNo":null,"totalReturnCash":0,"createTime":"2020-11-16 14:31:38","updateTime":"2020-11-16 14:31:38"}
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
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer pageNum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer pageSize;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orderId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orderNo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object cashChangeNo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String totalNumber;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double totalPrice;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer originalTotalNumber;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Float originalTotalPrice;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer sellerCompanyId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer buyerCompanyId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer allianceId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String state;
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
        private java.lang.String remark;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer buyerUserId;
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
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer indentFrom;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object erpOrderId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object orderStatus;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer invoiceType;
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
        private java.lang.String buyerUserName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String buyerCompanyName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String sellerCompanyName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object cashReplaceId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer payWay;
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
        private com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean.CtgOrderPayBean ctgOrderPay;
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
        private java.lang.String days;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String actuallyPrice;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String discountPrice;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer expirationTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object industry;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object vin;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object goodsNames;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object orderInfo;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean.OrderDetailSBean> orderDetailS;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer isSettled;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.deal.ChatersBean> chaters;
        
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPageNum() {
            return null;
        }
        
        public final void setPageNum(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPageSize() {
            return null;
        }
        
        public final void setPageSize(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTotalNumber() {
            return null;
        }
        
        public final void setTotalNumber(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getTotalPrice() {
            return null;
        }
        
        public final void setTotalPrice(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getOriginalTotalNumber() {
            return null;
        }
        
        public final void setOriginalTotalNumber(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Float getOriginalTotalPrice() {
            return null;
        }
        
        public final void setOriginalTotalPrice(@org.jetbrains.annotations.Nullable()
        java.lang.Float p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSellerCompanyId() {
            return null;
        }
        
        public final void setSellerCompanyId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getBuyerCompanyId() {
            return null;
        }
        
        public final void setBuyerCompanyId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAllianceId() {
            return null;
        }
        
        public final void setAllianceId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getState() {
            return null;
        }
        
        public final void setState(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.String getRemark() {
            return null;
        }
        
        public final void setRemark(@org.jetbrains.annotations.Nullable()
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getIndentFrom() {
            return null;
        }
        
        public final void setIndentFrom(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
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
        public final java.lang.String getBuyerUserName() {
            return null;
        }
        
        public final void setBuyerUserName(@org.jetbrains.annotations.Nullable()
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCashReplaceId() {
            return null;
        }
        
        public final void setCashReplaceId(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPayWay() {
            return null;
        }
        
        public final void setPayWay(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
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
        public final com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean.CtgOrderPayBean getCtgOrderPay() {
            return null;
        }
        
        public final void setCtgOrderPay(@org.jetbrains.annotations.Nullable()
        com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean.CtgOrderPayBean p0) {
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
        public final java.lang.String getDays() {
            return null;
        }
        
        public final void setDays(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getActuallyPrice() {
            return null;
        }
        
        public final void setActuallyPrice(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDiscountPrice() {
            return null;
        }
        
        public final void setDiscountPrice(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getExpirationTime() {
            return null;
        }
        
        public final void setExpirationTime(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
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
        public final java.util.List<com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean.OrderDetailSBean> getOrderDetailS() {
            return null;
        }
        
        public final void setOrderDetailS(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.deal.OrderDetailEntity.DataBean.OrderDetailSBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer isSettled() {
            return null;
        }
        
        public final void setSettled(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.deal.ChatersBean> getChaters() {
            return null;
        }
        
        public final void setChaters(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.deal.ChatersBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u001e\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\rR\u001e\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00105\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001e\u0010;\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b<\u0010\'\"\u0004\b=\u0010)R\u001e\u0010>\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010\u001fR\u001c\u0010A\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\r\u00a8\u0006D"}, d2 = {"Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean$CtgOrderPayBean;", "", "()V", "alipayCash", "", "getAlipayCash", "()Ljava/lang/String;", "setAlipayCash", "(Ljava/lang/String;)V", "cashReplaceId", "getCashReplaceId", "()Ljava/lang/Object;", "setCashReplaceId", "(Ljava/lang/Object;)V", "createTime", "getCreateTime", "setCreateTime", "leftCash", "getLeftCash", "setLeftCash", "orderId", "getOrderId", "setOrderId", "orderPayId", "getOrderPayId", "setOrderPayId", "payWay", "", "getPayWay", "()Ljava/lang/Integer;", "setPayWay", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "repalceCash", "getRepalceCash", "setRepalceCash", "storeCash", "", "getStoreCash", "()Ljava/lang/Double;", "setStoreCash", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "thirdOrderNo", "getThirdOrderNo", "setThirdOrderNo", "thirdPartyPay", "", "getThirdPartyPay", "()Ljava/lang/Float;", "setThirdPartyPay", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "totalReturnCash", "getTotalReturnCash", "setTotalReturnCash", "updateTime", "getUpdateTime", "setUpdateTime", "voucherCash", "getVoucherCash", "setVoucherCash", "voucherId", "getVoucherId", "setVoucherId", "wxPayCash", "getWxPayCash", "setWxPayCash", "app_hqpRelease"})
        public static final class CtgOrderPayBean {
            
            /**
             * orderPayId : c3143049fe147ae31cc7602cc7e25594
             * orderId : 91fb73ba97944b2e07a33f3e58138063
             * cashReplaceId : null
             * repalceCash : null
             * leftCash : null
             * wxPayCash : null
             * alipayCash : 0.01
             * payWay : 3
             * thirdPartyPay : 0.01
             * thirdOrderNo : null
             * totalReturnCash : 0.0
             * createTime : 2020-11-16 14:31:38
             * updateTime : 2020-11-16 14:31:38
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
            private java.lang.String alipayCash;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer payWay;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Float thirdPartyPay;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object thirdOrderNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Float totalReturnCash;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String createTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String updateTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer voucherId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Double storeCash;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Double voucherCash;
            
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
            public final java.lang.String getAlipayCash() {
                return null;
            }
            
            public final void setAlipayCash(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Float getThirdPartyPay() {
                return null;
            }
            
            public final void setThirdPartyPay(@org.jetbrains.annotations.Nullable()
            java.lang.Float p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getThirdOrderNo() {
                return null;
            }
            
            public final void setThirdOrderNo(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Float getTotalReturnCash() {
                return null;
            }
            
            public final void setTotalReturnCash(@org.jetbrains.annotations.Nullable()
            java.lang.Float p0) {
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
            public final java.lang.Integer getVoucherId() {
                return null;
            }
            
            public final void setVoucherId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getStoreCash() {
                return null;
            }
            
            public final void setStoreCash(@org.jetbrains.annotations.Nullable()
            java.lang.Double p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getVoucherCash() {
                return null;
            }
            
            public final void setVoucherCash(@org.jetbrains.annotations.Nullable()
            java.lang.Double p0) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b6\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\'\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u001c\u0010-\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u001c\u00100\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019R\u001e\u00103\u001a\u0004\u0018\u000104X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00109\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010:\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u0010\u0019R\u001c\u0010=\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0017\"\u0004\b?\u0010\u0019R\u001e\u0010@\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bA\u0010#\"\u0004\bB\u0010%R\u001e\u0010C\u001a\u0004\u0018\u000104X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00109\u001a\u0004\bD\u00106\"\u0004\bE\u00108R\u001c\u0010F\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u000b\"\u0004\bH\u0010\rR\u001c\u0010I\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0017\"\u0004\bK\u0010\u0019R\u001c\u0010L\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u000b\"\u0004\bN\u0010\rR\u001e\u0010O\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bP\u0010#\"\u0004\bQ\u0010%R\u001c\u0010R\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u000b\"\u0004\bT\u0010\rR\u001c\u0010U\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u000b\"\u0004\bW\u0010\rR\u001c\u0010X\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u000b\"\u0004\bZ\u0010\rR\u001c\u0010[\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u000b\"\u0004\b]\u0010\rR\u001e\u0010^\u001a\u0004\u0018\u000104X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00109\u001a\u0004\b_\u00106\"\u0004\b`\u00108R\u001e\u0010a\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bb\u0010#\"\u0004\bc\u0010%R\u001c\u0010d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0017\"\u0004\bf\u0010\u0019R\u001c\u0010g\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u000b\"\u0004\bi\u0010\r\u00a8\u0006j"}, d2 = {"Lcom/android/ctgapp/entity/deal/OrderDetailEntity$DataBean$OrderDetailSBean;", "", "()V", "afterSaleSelect", "", "getAfterSaleSelect", "()Z", "setAfterSaleSelect", "(Z)V", "brand", "getBrand", "()Ljava/lang/Object;", "setBrand", "(Ljava/lang/Object;)V", "brandId", "getBrandId", "setBrandId", "categoryCode", "getCategoryCode", "setCategoryCode", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "ctgnum", "getCtgnum", "setCtgnum", "factoryid", "getFactoryid", "setFactoryid", "goodsAmount", "", "getGoodsAmount", "()Ljava/lang/Integer;", "setGoodsAmount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "goodsId", "getGoodsId", "setGoodsId", "goodsImg", "getGoodsImg", "setGoodsImg", "goodsName", "getGoodsName", "setGoodsName", "goodsNo", "getGoodsNo", "setGoodsNo", "goodsPrice", "", "getGoodsPrice", "()Ljava/lang/Float;", "setGoodsPrice", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "orderDetailId", "getOrderDetailId", "setOrderDetailId", "orderId", "getOrderId", "setOrderId", "originalGoodsAmount", "getOriginalGoodsAmount", "setOriginalGoodsAmount", "originalGoodsPrice", "getOriginalGoodsPrice", "setOriginalGoodsPrice", "partName", "getPartName", "setPartName", "partOe", "getPartOe", "setPartOe", "quality", "getQuality", "setQuality", "refundGoodsAmount", "getRefundGoodsAmount", "setRefundGoodsAmount", "remark", "getRemark", "setRemark", "shoppingCartId", "getShoppingCartId", "setShoppingCartId", "sourceFrom", "getSourceFrom", "setSourceFrom", "spec", "getSpec", "setSpec", "totalPrice", "getTotalPrice", "setTotalPrice", "unRefundGoodsAmount", "getUnRefundGoodsAmount", "setUnRefundGoodsAmount", "updateTime", "getUpdateTime", "setUpdateTime", "warehouseId", "getWarehouseId", "setWarehouseId", "app_hqpRelease"})
        public static final class OrderDetailSBean {
            
            /**
             * orderDetailId : 974563c4ea95f49abf772983614050e6
             * orderId : 91fb73ba97944b2e07a33f3e58138063
             * goodsAmount : 1
             * originalGoodsAmount : 1
             * goodsPrice : 0.01
             * originalGoodsPrice : 0.01
             * goodsName : 44444444
             * goodsNo : 33322111
             * partName : null
             * partOe : null
             * spec : null
             * brand : null
             * remark : null
             * ctgnum : null
             * quality : null
             * goodsId : 51
             * sourceFrom : null
             * totalPrice : 0.01
             * warehouseId : null
             * createTime : 2020-11-16 14:31:38
             * updateTime : 2020-11-16 14:31:38
             * categoryCode : null
             * brandId : null
             * shoppingCartId : null
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orderDetailId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsImg;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String orderId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer goodsAmount;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer originalGoodsAmount;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Float goodsPrice;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Float originalGoodsPrice;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String goodsNo;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object partName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String partOe;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String factoryid;
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
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer goodsId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object sourceFrom;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Float totalPrice;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object warehouseId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String createTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String updateTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object categoryCode;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object brandId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object shoppingCartId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer unRefundGoodsAmount;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer refundGoodsAmount;
            private boolean afterSaleSelect = false;
            
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
            public final java.lang.String getGoodsImg() {
                return null;
            }
            
            public final void setGoodsImg(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Integer getGoodsAmount() {
                return null;
            }
            
            public final void setGoodsAmount(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getOriginalGoodsAmount() {
                return null;
            }
            
            public final void setOriginalGoodsAmount(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Float getGoodsPrice() {
                return null;
            }
            
            public final void setGoodsPrice(@org.jetbrains.annotations.Nullable()
            java.lang.Float p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Float getOriginalGoodsPrice() {
                return null;
            }
            
            public final void setOriginalGoodsPrice(@org.jetbrains.annotations.Nullable()
            java.lang.Float p0) {
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
            public final java.lang.String getFactoryid() {
                return null;
            }
            
            public final void setFactoryid(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
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
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getGoodsId() {
                return null;
            }
            
            public final void setGoodsId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSourceFrom() {
                return null;
            }
            
            public final void setSourceFrom(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Float getTotalPrice() {
                return null;
            }
            
            public final void setTotalPrice(@org.jetbrains.annotations.Nullable()
            java.lang.Float p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getWarehouseId() {
                return null;
            }
            
            public final void setWarehouseId(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.Object getCategoryCode() {
                return null;
            }
            
            public final void setCategoryCode(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
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
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getUnRefundGoodsAmount() {
                return null;
            }
            
            public final void setUnRefundGoodsAmount(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getRefundGoodsAmount() {
                return null;
            }
            
            public final void setRefundGoodsAmount(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            public final boolean getAfterSaleSelect() {
                return false;
            }
            
            public final void setAfterSaleSelect(boolean p0) {
            }
        }
    }
}