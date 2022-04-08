package com.android.ctgapp.base;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/1
 * 描述: application基类
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/android/ctgapp/base/BaseApplication;", "Landroid/app/Application;", "()V", "initRefresh", "", "initVinScan", "onCreate", "Companion", "app_ctgDebug"})
public class BaseApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.base.BaseApplication.Companion Companion = null;
    private static boolean isDownloadApk = false;
    private static android.app.Application context;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashSet<java.lang.String> currentCompanyIdSet = null;
    private static int orderPay = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String orderId = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String orderNum = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String payWay = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String price = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String orderTime = "";
    private static int currentTalkTo = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String userToken = "";
    private static int userId = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String inviteCode = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String companyName = "";
    private static int allianceId = 0;
    private static int companyId = 0;
    private static boolean isCompanyAdmin = false;
    private static boolean isCompanyCreator = false;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashSet<java.lang.String> mWhiteBarSelectOrderNO;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String mWhiteBarOrderNoSingle = "";
    @org.jetbrains.annotations.NotNull()
    private static java.math.BigDecimal mWhiteBarSelectMoney;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.android.ctgapp.entity.mine.WhiteBarMorePayBean.Data> mWhiteBarAllBean;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> enquireSelectPartsList;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashSet<java.lang.Integer> onLineFriendIds = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashSet<java.lang.Integer> allFriendIds = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String supplyCompanyId = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String clientCompanyId = "";
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Integer activityId;
    
    public BaseApplication() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initRefresh() {
    }
    
    private final void initVinScan() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010m\u001a\u00020nJ\u0006\u0010o\u001a\u00020pR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\rR\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0010\"\u0004\b+\u0010\u0012R \u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u0010\u0018R\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R\u001a\u0010=\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R \u0010?\u001a\b\u0012\u0004\u0012\u00020@0-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\u001a\u0010C\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0016\"\u0004\bE\u0010\u0018R\u001a\u0010F\u001a\u00020GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR \u0010L\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\r\"\u0004\bN\u0010OR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\rR\u001a\u0010R\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0016\"\u0004\bT\u0010\u0018R\u001a\u0010U\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0016\"\u0004\bW\u0010\u0018R\u001a\u0010X\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0010\"\u0004\bZ\u0010\u0012R\u001a\u0010[\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0016\"\u0004\b]\u0010\u0018R\u001a\u0010^\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0016\"\u0004\b`\u0010\u0018R\u001a\u0010a\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0016\"\u0004\bc\u0010\u0018R\u001a\u0010d\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0016\"\u0004\bf\u0010\u0018R\u001a\u0010g\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0010\"\u0004\bi\u0010\u0012R\u001a\u0010j\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0016\"\u0004\bl\u0010\u0018\u00a8\u0006q"}, d2 = {"Lcom/android/ctgapp/base/BaseApplication$Companion;", "", "()V", "activityId", "", "getActivityId", "()Ljava/lang/Integer;", "setActivityId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "allFriendIds", "Ljava/util/HashSet;", "getAllFriendIds", "()Ljava/util/HashSet;", "allianceId", "getAllianceId", "()I", "setAllianceId", "(I)V", "clientCompanyId", "", "getClientCompanyId", "()Ljava/lang/String;", "setClientCompanyId", "(Ljava/lang/String;)V", "companyId", "getCompanyId", "setCompanyId", "companyName", "getCompanyName", "setCompanyName", "context", "Landroid/app/Application;", "currentCompanyIdSet", "getCurrentCompanyIdSet", "currentPayFrom", "Lcom/android/ctgapp/enum/PayFromEnum;", "getCurrentPayFrom", "()Lcom/android/ctgapp/enum/PayFromEnum;", "setCurrentPayFrom", "(Lcom/android/ctgapp/enum/PayFromEnum;)V", "currentTalkTo", "getCurrentTalkTo", "setCurrentTalkTo", "enquireSelectPartsList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntityV2$DataBean$PartsGroupBean;", "getEnquireSelectPartsList", "()Ljava/util/ArrayList;", "setEnquireSelectPartsList", "(Ljava/util/ArrayList;)V", "inviteCode", "getInviteCode", "setInviteCode", "isCompanyAdmin", "", "()Z", "setCompanyAdmin", "(Z)V", "isCompanyCreator", "setCompanyCreator", "isDownloadApk", "setDownloadApk", "mWhiteBarAllBean", "Lcom/android/ctgapp/entity/mine/WhiteBarMorePayBean$Data;", "getMWhiteBarAllBean", "setMWhiteBarAllBean", "mWhiteBarOrderNoSingle", "getMWhiteBarOrderNoSingle", "setMWhiteBarOrderNoSingle", "mWhiteBarSelectMoney", "Ljava/math/BigDecimal;", "getMWhiteBarSelectMoney", "()Ljava/math/BigDecimal;", "setMWhiteBarSelectMoney", "(Ljava/math/BigDecimal;)V", "mWhiteBarSelectOrderNO", "getMWhiteBarSelectOrderNO", "setMWhiteBarSelectOrderNO", "(Ljava/util/HashSet;)V", "onLineFriendIds", "getOnLineFriendIds", "orderId", "getOrderId", "setOrderId", "orderNum", "getOrderNum", "setOrderNum", "orderPay", "getOrderPay", "setOrderPay", "orderTime", "getOrderTime", "setOrderTime", "payWay", "getPayWay", "setPayWay", "price", "getPrice", "setPrice", "supplyCompanyId", "getSupplyCompanyId", "setSupplyCompanyId", "userId", "getUserId", "setUserId", "userToken", "getUserToken", "setUserToken", "clearWhiteBarData", "", "getContext", "Landroid/content/Context;", "app_ctgDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isDownloadApk() {
            return false;
        }
        
        public final void setDownloadApk(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashSet<java.lang.String> getCurrentCompanyIdSet() {
            return null;
        }
        
        public final int getOrderPay() {
            return 0;
        }
        
        public final void setOrderPay(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrderId() {
            return null;
        }
        
        public final void setOrderId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrderNum() {
            return null;
        }
        
        public final void setOrderNum(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPayWay() {
            return null;
        }
        
        public final void setPayWay(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPrice() {
            return null;
        }
        
        public final void setPrice(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrderTime() {
            return null;
        }
        
        public final void setOrderTime(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getCurrentTalkTo() {
            return 0;
        }
        
        public final void setCurrentTalkTo(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserToken() {
            return null;
        }
        
        public final void setUserToken(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getUserId() {
            return 0;
        }
        
        public final void setUserId(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getInviteCode() {
            return null;
        }
        
        public final void setInviteCode(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCompanyName() {
            return null;
        }
        
        public final void setCompanyName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getAllianceId() {
            return 0;
        }
        
        public final void setAllianceId(int p0) {
        }
        
        public final int getCompanyId() {
            return 0;
        }
        
        public final void setCompanyId(int p0) {
        }
        
        public final boolean isCompanyAdmin() {
            return false;
        }
        
        public final void setCompanyAdmin(boolean p0) {
        }
        
        public final boolean isCompanyCreator() {
            return false;
        }
        
        public final void setCompanyCreator(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashSet<java.lang.String> getMWhiteBarSelectOrderNO() {
            return null;
        }
        
        public final void setMWhiteBarSelectOrderNO(@org.jetbrains.annotations.NotNull()
        java.util.HashSet<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMWhiteBarOrderNoSingle() {
            return null;
        }
        
        public final void setMWhiteBarOrderNoSingle(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getMWhiteBarSelectMoney() {
            return null;
        }
        
        public final void setMWhiteBarSelectMoney(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.android.ctgapp.entity.mine.WhiteBarMorePayBean.Data> getMWhiteBarAllBean() {
            return null;
        }
        
        public final void setMWhiteBarAllBean(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.android.ctgapp.entity.mine.WhiteBarMorePayBean.Data> p0) {
        }
        
        public final void clearWhiteBarData() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> getEnquireSelectPartsList() {
            return null;
        }
        
        public final void setEnquireSelectPartsList(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashSet<java.lang.Integer> getOnLineFriendIds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashSet<java.lang.Integer> getAllFriendIds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSupplyCompanyId() {
            return null;
        }
        
        public final void setSupplyCompanyId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getClientCompanyId() {
            return null;
        }
        
        public final void setClientCompanyId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getActivityId() {
            return null;
        }
        
        public final void setActivityId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
    }
}