package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00b3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0019J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u000fH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010B\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\u00d8\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010P\u001a\u00020\u000fH\u00d6\u0001J\t\u0010Q\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u0017\u0010\u001d\"\u0004\b(\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010,R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001b\u00a8\u0006R"}, d2 = {"Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "", "stock", "", "images", "categoryName", "nno", "partId", "partName", "price", "allianceId", "remark", "num", "buyerCompanyId", "createUser", "", "specStyle", "goodsName", "sellWay", "companyIndustry", "otherSortList", "", "Lcom/android/ctgapp/entity/home/GoodsDetailBean;", "isSet", "buyLimit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAllianceId", "()Ljava/lang/String;", "getBuyLimit", "()Ljava/lang/Integer;", "setBuyLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBuyerCompanyId", "getCategoryName", "getCompanyIndustry", "getCreateUser", "()I", "getGoodsName", "getImages", "setSet", "getNno", "getNum", "setNum", "(Ljava/lang/String;)V", "getOtherSortList", "()Ljava/util/List;", "setOtherSortList", "(Ljava/util/List;)V", "getPartId", "getPartName", "getPrice", "getRemark", "getSellWay", "getSpecStyle", "getStock", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "equals", "", "other", "hashCode", "toString", "app_hqpRelease"})
public final class TrolleyAddGoodsBean {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String stock = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String images = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String categoryName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nno = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String partId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String partName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String allianceId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String remark = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String num;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String buyerCompanyId = null;
    private final int createUser = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String specStyle = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String goodsName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sellWay = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String companyIndustry = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> otherSortList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer isSet;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer buyLimit;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.entity.home.TrolleyAddGoodsBean copy(@org.jetbrains.annotations.NotNull()
    java.lang.String stock, @org.jetbrains.annotations.NotNull()
    java.lang.String images, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull()
    java.lang.String nno, @org.jetbrains.annotations.NotNull()
    java.lang.String partId, @org.jetbrains.annotations.NotNull()
    java.lang.String partName, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String allianceId, @org.jetbrains.annotations.NotNull()
    java.lang.String remark, @org.jetbrains.annotations.NotNull()
    java.lang.String num, @org.jetbrains.annotations.NotNull()
    java.lang.String buyerCompanyId, int createUser, @org.jetbrains.annotations.NotNull()
    java.lang.String specStyle, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsName, @org.jetbrains.annotations.NotNull()
    java.lang.String sellWay, @org.jetbrains.annotations.NotNull()
    java.lang.String companyIndustry, @org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> otherSortList, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isSet, @org.jetbrains.annotations.Nullable()
    java.lang.Integer buyLimit) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public TrolleyAddGoodsBean(@org.jetbrains.annotations.NotNull()
    java.lang.String stock, @org.jetbrains.annotations.NotNull()
    java.lang.String images, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull()
    java.lang.String nno, @org.jetbrains.annotations.NotNull()
    java.lang.String partId, @org.jetbrains.annotations.NotNull()
    java.lang.String partName, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String allianceId, @org.jetbrains.annotations.NotNull()
    java.lang.String remark, @org.jetbrains.annotations.NotNull()
    java.lang.String num, @org.jetbrains.annotations.NotNull()
    java.lang.String buyerCompanyId, int createUser, @org.jetbrains.annotations.NotNull()
    java.lang.String specStyle, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsName, @org.jetbrains.annotations.NotNull()
    java.lang.String sellWay, @org.jetbrains.annotations.NotNull()
    java.lang.String companyIndustry, @org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> otherSortList, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isSet, @org.jetbrains.annotations.Nullable()
    java.lang.Integer buyLimit) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategoryName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNno() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPartId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPartName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllianceId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNum() {
        return null;
    }
    
    public final void setNum(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBuyerCompanyId() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getCreateUser() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpecStyle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoodsName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSellWay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompanyIndustry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> getOtherSortList() {
        return null;
    }
    
    public final void setOtherSortList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer isSet() {
        return null;
    }
    
    public final void setSet(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBuyLimit() {
        return null;
    }
    
    public final void setBuyLimit(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}