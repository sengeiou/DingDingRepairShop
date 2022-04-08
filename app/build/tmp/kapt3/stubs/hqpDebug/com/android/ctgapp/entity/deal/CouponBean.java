package com.android.ctgapp.entity.deal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\bK\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u001a\u0010,\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010R\u001c\u0010/\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0005\"\u0004\b0\u0010\u0007R\u001a\u00101\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R\u001c\u00103\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\u001c\u00106\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0005\"\u0004\b8\u0010\u0007R\u001a\u00109\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R\u001a\u0010<\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010\u0010R\u001c\u0010?\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0005\"\u0004\bA\u0010\u0007R\u001c\u0010B\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0005\"\u0004\bD\u0010\u0007R\u001c\u0010E\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0005\"\u0004\bG\u0010\u0007R\u001c\u0010H\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0005\"\u0004\bJ\u0010\u0007R\u001a\u0010K\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010&\"\u0004\bM\u0010(R\u001c\u0010N\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0005\"\u0004\bP\u0010\u0007R\u001c\u0010Q\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0005\"\u0004\bS\u0010\u0007R\u001c\u0010T\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0005\"\u0004\bV\u0010\u0007R\u001c\u0010W\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u001a\"\u0004\bY\u0010\u001cR\u001c\u0010Z\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u001a\"\u0004\b\\\u0010\u001cR\u001c\u0010]\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0005\"\u0004\b_\u0010\u0007R\u001c\u0010`\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0005\"\u0004\bb\u0010\u0007R\u001c\u0010c\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0005\"\u0004\be\u0010\u0007R\u001c\u0010f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0005\"\u0004\bh\u0010\u0007R\u001a\u0010i\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u000e\"\u0004\bk\u0010\u0010R\u001c\u0010l\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u001a\"\u0004\bn\u0010\u001c\u00a8\u0006o"}, d2 = {"Lcom/android/ctgapp/entity/deal/CouponBean;", "", "()V", "applyWay", "getApplyWay", "()Ljava/lang/Object;", "setApplyWay", "(Ljava/lang/Object;)V", "companyAddress", "getCompanyAddress", "setCompanyAddress", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "companyIndustry", "getCompanyIndustry", "setCompanyIndustry", "companyName", "getCompanyName", "setCompanyName", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "createUserId", "getCreateUserId", "setCreateUserId", "createUserName", "getCreateUserName", "setCreateUserName", "deduction", "", "getDeduction", "()D", "setDeduction", "(D)V", "endDate", "getEndDate", "setEndDate", "id", "getId", "setId", "isTraded", "setTraded", "isUsed", "setUsed", "notAvailableReason", "getNotAvailableReason", "setNotAvailableReason", "orderId", "getOrderId", "setOrderId", "pageNum", "getPageNum", "setPageNum", "pageSize", "getPageSize", "setPageSize", "payPrice", "getPayPrice", "setPayPrice", "sellerCompanyId", "getSellerCompanyId", "setSellerCompanyId", "sellerCompanyName", "getSellerCompanyName", "setSellerCompanyName", "startDate", "getStartDate", "setStartDate", "threshold", "getThreshold", "setThreshold", "totalPrice", "getTotalPrice", "setTotalPrice", "updateTime", "getUpdateTime", "setUpdateTime", "usedTime", "getUsedTime", "setUsedTime", "validPeriodEnd", "getValidPeriodEnd", "setValidPeriodEnd", "validPeriodStart", "getValidPeriodStart", "setValidPeriodStart", "voucherBrandList", "getVoucherBrandList", "setVoucherBrandList", "voucherBrandString", "getVoucherBrandString", "setVoucherBrandString", "voucherCategoryList", "getVoucherCategoryList", "setVoucherCategoryList", "voucherCategoryString", "getVoucherCategoryString", "setVoucherCategoryString", "voucherId", "getVoucherId", "setVoucherId", "voucherName", "getVoucherName", "setVoucherName", "app_hqpDebug"})
public final class CouponBean {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object startDate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object endDate;
    private int pageNum = 0;
    private int pageSize = 0;
    private int id = 0;
    private int voucherId = 0;
    private int companyId = 0;
    private int isUsed = 0;
    private int createUserId = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String createTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object updateTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object usedTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object orderId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object applyWay;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String voucherName;
    private double threshold = 0.0;
    private double deduction = 0.0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object createUserName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object companyName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object companyAddress;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object companyIndustry;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object sellerCompanyId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object sellerCompanyName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String validPeriodStart;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String validPeriodEnd;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object totalPrice;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object payPrice;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object isTraded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object voucherCategoryList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object voucherCategoryString;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object voucherBrandList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object voucherBrandString;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String notAvailableReason;
    
    public CouponBean() {
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
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getVoucherId() {
        return 0;
    }
    
    public final void setVoucherId(int p0) {
    }
    
    public final int getCompanyId() {
        return 0;
    }
    
    public final void setCompanyId(int p0) {
    }
    
    public final int isUsed() {
        return 0;
    }
    
    public final void setUsed(int p0) {
    }
    
    public final int getCreateUserId() {
        return 0;
    }
    
    public final void setCreateUserId(int p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUsedTime() {
        return null;
    }
    
    public final void setUsedTime(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getApplyWay() {
        return null;
    }
    
    public final void setApplyWay(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVoucherName() {
        return null;
    }
    
    public final void setVoucherName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getThreshold() {
        return 0.0;
    }
    
    public final void setThreshold(double p0) {
    }
    
    public final double getDeduction() {
        return 0.0;
    }
    
    public final void setDeduction(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCreateUserName() {
        return null;
    }
    
    public final void setCreateUserName(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Object getCompanyAddress() {
        return null;
    }
    
    public final void setCompanyAddress(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCompanyIndustry() {
        return null;
    }
    
    public final void setCompanyIndustry(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSellerCompanyId() {
        return null;
    }
    
    public final void setSellerCompanyId(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getValidPeriodStart() {
        return null;
    }
    
    public final void setValidPeriodStart(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getValidPeriodEnd() {
        return null;
    }
    
    public final void setValidPeriodEnd(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTotalPrice() {
        return null;
    }
    
    public final void setTotalPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPayPrice() {
        return null;
    }
    
    public final void setPayPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isTraded() {
        return null;
    }
    
    public final void setTraded(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVoucherCategoryList() {
        return null;
    }
    
    public final void setVoucherCategoryList(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVoucherCategoryString() {
        return null;
    }
    
    public final void setVoucherCategoryString(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVoucherBrandList() {
        return null;
    }
    
    public final void setVoucherBrandList(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVoucherBrandString() {
        return null;
    }
    
    public final void setVoucherBrandString(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNotAvailableReason() {
        return null;
    }
    
    public final void setNotAvailableReason(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}