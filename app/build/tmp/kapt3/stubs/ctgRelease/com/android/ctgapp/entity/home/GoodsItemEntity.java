package com.android.ctgapp.entity.home;

import java.lang.System;

/**
 * 商品实体类
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0006\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\rR\u001a\u0010\u001b\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007R\u001c\u0010&\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR\u001c\u0010)\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u001c\u0010,\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u001c\u0010/\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u001c\u00102\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR\"\u00105\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\n\u0012\u0004\u0012\u00020<\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\u001c\u0010?\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0005\"\u0004\bA\u0010\u0007R\u001c\u0010B\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000b\"\u0004\bD\u0010\rR\u001a\u0010E\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010\rR\u001c\u0010H\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u000b\"\u0004\bJ\u0010\rR\u001c\u0010K\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u000b\"\u0004\bM\u0010\rR\u001c\u0010N\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u000b\"\u0004\bP\u0010\rR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0005\"\u0004\bS\u0010\u0007R\u001e\u0010T\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\bT\u0010\u0014\"\u0004\bU\u0010\u0016R\u001c\u0010V\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0005\"\u0004\bX\u0010\u0007R\u001c\u0010Y\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u000b\"\u0004\b[\u0010\rR\u001c\u0010\\\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0005\"\u0004\b^\u0010\u0007R\u001c\u0010_\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u000b\"\u0004\ba\u0010\rR\u001c\u0010b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u000b\"\u0004\bd\u0010\rR\u001c\u0010e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0005\"\u0004\bg\u0010\u0007R\u001c\u0010h\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0005\"\u0004\bj\u0010\u0007R\u001c\u0010k\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0005\"\u0004\bm\u0010\u0007R\u001a\u0010n\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u001d\"\u0004\bp\u0010\u001fR\u001c\u0010q\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u0005\"\u0004\bs\u0010\u0007R\u001a\u0010t\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u001d\"\u0004\bv\u0010\u001fR\u001a\u0010w\u001a\u00020xX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001c\u0010}\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u000b\"\u0004\b\u007f\u0010\rR\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u0005\"\u0005\b\u0082\u0001\u0010\u0007R\u001d\u0010\u0083\u0001\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\u000b\"\u0005\b\u0085\u0001\u0010\rR\u001f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u0005\"\u0005\b\u0088\u0001\u0010\u0007R\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u000b\"\u0005\b\u008b\u0001\u0010\rR\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u0005\"\u0005\b\u008e\u0001\u0010\u0007R\u001f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u000b\"\u0005\b\u0091\u0001\u0010\rR\u001f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010\u0005\"\u0005\b\u0094\u0001\u0010\u0007\u00a8\u0006\u0095\u0001"}, d2 = {"Lcom/android/ctgapp/entity/home/GoodsItemEntity;", "", "()V", "allocatePrice", "getAllocatePrice", "()Ljava/lang/Object;", "setAllocatePrice", "(Ljava/lang/Object;)V", "brandName", "", "getBrandName", "()Ljava/lang/String;", "setBrandName", "(Ljava/lang/String;)V", "brandid", "getBrandid", "setBrandid", "buyLimit", "", "getBuyLimit", "()Ljava/lang/Integer;", "setBuyLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "categoryName", "getCategoryName", "setCategoryName", "companyId", "getCompanyId", "()I", "setCompanyId", "(I)V", "companyUuid", "getCompanyUuid", "setCompanyUuid", "costPrice", "getCostPrice", "setCostPrice", "ctgcoding", "getCtgcoding", "setCtgcoding", "defaultAutio", "getDefaultAutio", "setDefaultAutio", "defaultOperator", "getDefaultOperator", "setDefaultOperator", "defaultPrice", "getDefaultPrice", "setDefaultPrice", "description", "getDescription", "setDescription", "detailImgs", "", "getDetailImgs", "()Ljava/util/List;", "setDetailImgs", "(Ljava/util/List;)V", "detailVos", "Lcom/android/ctgapp/entity/home/GoodsDetailBean;", "getDetailVos", "setDetailVos", "do_show_zero", "getDo_show_zero", "setDo_show_zero", "fcode", "getFcode", "setFcode", "goodsName", "getGoodsName", "setGoodsName", "id", "getId", "setId", "im", "getIm", "setIm", "images", "getImages", "setImages", "imgs", "getImgs", "setImgs", "isSet", "setSet", "keyName", "getKeyName", "setKeyName", "mbid", "getMbid", "setMbid", "minPrice", "getMinPrice", "setMinPrice", "nname", "getNname", "setNname", "nno", "getNno", "setNno", "noTaxPrice", "getNoTaxPrice", "setNoTaxPrice", "orgBrandName", "getOrgBrandName", "setOrgBrandName", "orgName", "getOrgName", "setOrgName", "ownSa", "getOwnSa", "setOwnSa", "retailPrice", "getRetailPrice", "setRetailPrice", "sales", "getSales", "setSales", "salesPrice", "", "getSalesPrice", "()D", "setSalesPrice", "(D)V", "shopId", "getShopId", "setShopId", "showZero", "getShowZero", "setShowZero", "spec", "getSpec", "setSpec", "specStyle", "getSpecStyle", "setSpecStyle", "stock", "getStock", "setStock", "tagCode", "getTagCode", "setTagCode", "unit", "getUnit", "setUnit", "wholesalePrice", "getWholesalePrice", "setWholesalePrice", "app_ctgRelease"})
public final class GoodsItemEntity {
    
    /**
     * salesPrice : 14.0
     * unit : 付
     * id : 73
     * imgs : null
     * detailImgs : ["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"]
     * stock : 1
     * nname : 05款骊威倒车镜(5线)（左）
     * nno : HC-NS-003
     * categoryName : 轮胎
     * companyId : 12345
     * companyUuid : null
     * brandid : 361
     * fcode : 106-10
     * sales : 0
     * keyName : null
     * images : http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png
     * brandName : 欧睿特
     * shopId : SHOP_ID_0002
     * specStyle : null
     * orgBrandName : null
     * buyLimit : null
     * showZero : null
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
     * tagCode : null
     * mbid : 361
     * description :
     * ownSa : 0
     * im : http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png
     * do_show_zero : null
     * ctgcoding :
     */
    private double salesPrice = 0.0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String unit;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object imgs;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String stock;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nname;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nno;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String categoryName;
    private int companyId = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object companyUuid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String brandid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fcode;
    private int sales = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object keyName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String images;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String brandName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shopId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object specStyle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String spec = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object orgBrandName;
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
    private java.lang.Object orgName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object defaultAutio;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object tagCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mbid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    private int ownSa = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String im;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object do_show_zero;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ctgcoding;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> detailImgs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String goodsName = "";
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.GoodsDetailBean> detailVos;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer isSet;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer buyLimit;
    
    public GoodsItemEntity() {
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
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImgs() {
        return null;
    }
    
    public final void setImgs(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStock() {
        return null;
    }
    
    public final void setStock(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrandid() {
        return null;
    }
    
    public final void setBrandid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public final java.lang.Object getSpecStyle() {
        return null;
    }
    
    public final void setSpecStyle(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpec() {
        return null;
    }
    
    public final void setSpec(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.Object getOrgName() {
        return null;
    }
    
    public final void setOrgName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
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
    
    public final int getOwnSa() {
        return 0;
    }
    
    public final void setOwnSa(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIm() {
        return null;
    }
    
    public final void setIm(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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