package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001c\u00102\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017R\u001a\u00105\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001c\u0010;\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010\u0017R\u001c\u0010>\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0015\"\u0004\b@\u0010\u0017R\"\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.R\u001a\u0010D\u001a\u00020EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bI\u0010\f\"\u0004\bJ\u0010\u000eR\u001c\u0010K\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0015\"\u0004\bM\u0010\u0017R\u001c\u0010N\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001c\u0010T\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001c\u0010W\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0015\"\u0004\bY\u0010\u0017R\u001a\u0010Z\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u001a\"\u0004\b\\\u0010\u001cR\u001a\u0010]\u001a\u00020^X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001c\u0010c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001c\u0010f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001c\u0010i\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001e\u0010l\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bm\u0010\f\"\u0004\bn\u0010\u000eR\u001c\u0010o\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001c\u0010r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001c\u0010u\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\b\u00a8\u0006x"}, d2 = {"Lcom/android/ctgapp/entity/home/GoodsDetailBean;", "", "()V", "brandName", "", "getBrandName", "()Ljava/lang/String;", "setBrandName", "(Ljava/lang/String;)V", "brandid", "", "getBrandid", "()Ljava/lang/Integer;", "setBrandid", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "buyLimit", "getBuyLimit", "setBuyLimit", "categoryName", "getCategoryName", "()Ljava/lang/Object;", "setCategoryName", "(Ljava/lang/Object;)V", "companyId", "getCompanyId", "()I", "setCompanyId", "(I)V", "companyUuid", "getCompanyUuid", "setCompanyUuid", "ctgcoding", "getCtgcoding", "setCtgcoding", "ctgnum", "getCtgnum", "setCtgnum", "description", "getDescription", "setDescription", "detailImgs", "", "getDetailImgs", "()Ljava/util/List;", "setDetailImgs", "(Ljava/util/List;)V", "detailVos", "getDetailVos", "setDetailVos", "fcode", "getFcode", "setFcode", "goodsName", "getGoodsName", "setGoodsName", "id", "getId", "setId", "im", "getIm", "setIm", "images", "getImages", "setImages", "imgs", "getImgs", "setImgs", "isSelect", "", "()Z", "setSelect", "(Z)V", "isSet", "setSet", "keyName", "getKeyName", "setKeyName", "mbid", "getMbid", "setMbid", "nname", "getNname", "setNname", "nno", "getNno", "setNno", "orgName", "getOrgName", "setOrgName", "sales", "getSales", "setSales", "salesPrice", "", "getSalesPrice", "()D", "setSalesPrice", "(D)V", "shopId", "getShopId", "setShopId", "spec", "getSpec", "setSpec", "specStyle", "getSpecStyle", "setSpecStyle", "stock", "getStock", "setStock", "unit", "getUnit", "setUnit", "warehouse", "getWarehouse", "setWarehouse", "warehouseName", "getWarehouseName", "setWarehouseName", "app_hqpRelease"})
public final class GoodsDetailBean {
    
    /**
     * salesPrice : 14.0
     * unit : 付
     * id : 73
     * imgs : ["http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png"]
     * detailImgs : ["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"]
     * stock : 1
     * nname : 05款骊威倒车镜(5线)（左）
     * nno : HC-NS-003
     * categoryName : null
     * companyId : 12345
     * companyUuid : null
     * brandid : 361
     * fcode : null
     * sales : 0
     * keyName : null
     * images : null
     * brandName : 欧睿特
     * shopId : SHOP_ID_0002
     * orgName : null
     * mbid : 361
     * description :
     * im : null
     * ctgcoding : null
     */
    private double salesPrice = 0.0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String unit;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ctgnum;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer stock;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nname;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object categoryName;
    private int companyId = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object companyUuid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer brandid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object fcode;
    private int sales = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object keyName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object images;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String brandName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shopId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String specStyle;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String spec;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object orgName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mbid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object im;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object ctgcoding;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String warehouse;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String warehouseName;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> imgs;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> detailImgs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String goodsName = "";
    private boolean isSelect = false;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> detailVos;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer isSet;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer buyLimit;
    
    public GoodsDetailBean() {
        super();
    }
    
    public final double getSalesPrice() {
        return 0.0;
    }
    
    public final void setSalesPrice(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUnit() {
        return null;
    }
    
    public final void setUnit(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStock() {
        return null;
    }
    
    public final void setStock(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
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
    public final java.lang.Object getCategoryName() {
        return null;
    }
    
    public final void setCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBrandid() {
        return null;
    }
    
    public final void setBrandid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFcode() {
        return null;
    }
    
    public final void setFcode(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
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
    public final java.lang.Object getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrandName() {
        return null;
    }
    
    public final void setBrandName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShopId() {
        return null;
    }
    
    public final void setShopId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpecStyle() {
        return null;
    }
    
    public final void setSpecStyle(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Object getOrgName() {
        return null;
    }
    
    public final void setOrgName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMbid() {
        return null;
    }
    
    public final void setMbid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getIm() {
        return null;
    }
    
    public final void setIm(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCtgcoding() {
        return null;
    }
    
    public final void setCtgcoding(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWarehouse() {
        return null;
    }
    
    public final void setWarehouse(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWarehouseName() {
        return null;
    }
    
    public final void setWarehouseName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getImgs() {
        return null;
    }
    
    public final void setImgs(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getDetailImgs() {
        return null;
    }
    
    public final void setDetailImgs(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoodsName() {
        return null;
    }
    
    public final void setGoodsName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isSelect() {
        return false;
    }
    
    public final void setSelect(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> getDetailVos() {
        return null;
    }
    
    public final void setDetailVos(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer isSet() {
        return null;
    }
    
    public final void setSet(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBuyLimit() {
        return null;
    }
    
    public final void setBuyLimit(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}