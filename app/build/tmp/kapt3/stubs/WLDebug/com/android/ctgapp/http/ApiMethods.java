package com.android.ctgapp.http;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/8/15
 * 描述: Retrofit类
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/android/ctgapp/http/ApiMethods;", "", "()V", "Companion", "app_WLDebug"})
public class ApiMethods {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.http.ApiMethods.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.android.ctgapp.http.ApiService retrofit = null;
    
    public ApiMethods() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u0006\u0010\u000e\u001a\u00020\bJ\u001c\u0010\u000f\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0015\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0019\u001a\u00020\u0017J\u001c\u0010\u001a\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u001b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u001c\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u001d\u001a\u00020\u0017J\b\u0010\u001e\u001a\u00020\u0004H\u0002J\u001c\u0010\u001f\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0013\u001a\u00020\u0014J-\u0010 \u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\"J+\u0010#\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020\u0017\u00a2\u0006\u0002\u0010&J\u001c\u0010\'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010(\u001a\u00020\u0017J\u001c\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010(\u001a\u00020\u0017J\b\u0010*\u001a\u00020+H\u0002JL\u0010,\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0011J\u001c\u00103\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u00104\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u001c\u00105\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u00066"}, d2 = {"Lcom/android/ctgapp/http/ApiMethods$Companion;", "", "()V", "retrofit", "Lcom/android/ctgapp/http/ApiService;", "getRetrofit", "()Lcom/android/ctgapp/http/ApiService;", "apiSubscribe", "", "observable", "Lio/reactivex/Observable;", "Lokhttp3/ResponseBody;", "observer", "Lio/reactivex/Observer;", "changeUrl", "deleteSystemNotify", "messageId", "", "enquireAddWishOrder", "body", "Lokhttp3/RequestBody;", "enquireWishOrderList", "enquiryId", "", "enquireWishOrderListDetail", "wishListId", "epcGetLeftMenu", "epcGetRightMenu", "getAllAllianceCompany", "allianceId", "getApiService", "getEpcSecondList", "getQueryDetail", "displayMode", "(Lio/reactivex/Observer;ILjava/lang/Integer;)V", "getQueryList", "enquiryStatus", "page", "(Lio/reactivex/Observer;Ljava/lang/Integer;I)V", "getSystemNotifyList", "pageNum", "getSystemNotifyUnread", "initClient", "Lokhttp3/OkHttpClient;", "jiaoyiliushui", "companyId", "orgName", "pageSize", "payWay", "invoiceType", "actionType", "readSystemNotify", "readSystemNotifyAll", "shouxinqiye", "app_WLDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.ctgapp.http.ApiService getRetrofit() {
            return null;
        }
        
        public final void changeUrl() {
        }
        
        private final com.android.ctgapp.http.ApiService getApiService() {
            return null;
        }
        
        private final okhttp3.OkHttpClient initClient() {
            return null;
        }
        
        public final void apiSubscribe(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observable<okhttp3.ResponseBody> observable, @org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer) {
        }
        
        /**
         * 获取询价记录
         */
        public final void getQueryList(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, @org.jetbrains.annotations.Nullable()
        java.lang.Integer enquiryStatus, int page) {
        }
        
        public final void getQueryDetail(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, int enquiryId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer displayMode) {
        }
        
        /**
         * 新增询价意向单/更新询价意向单
         */
        public final void enquireAddWishOrder(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, @org.jetbrains.annotations.NotNull()
        okhttp3.RequestBody body) {
        }
        
        /**
         * 查询询价意向单列表
         */
        public final void enquireWishOrderList(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, int enquiryId) {
        }
        
        /**
         * / **查询询价意向单列表详情* /
         */
        public final void enquireWishOrderListDetail(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, int wishListId) {
        }
        
        /**
         * 获取系统通知列表
         */
        public final void getSystemNotifyList(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, int pageNum) {
        }
        
        /**
         * 获取系统通知列表(只含未读)
         */
        public final void getSystemNotifyUnread(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, int pageNum) {
        }
        
        /**
         * 系统消息已读
         */
        public final void readSystemNotify(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, @org.jetbrains.annotations.NotNull()
        java.lang.String messageId) {
        }
        
        /**
         * 系统消息已读(全部)
         */
        public final void readSystemNotifyAll(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer) {
        }
        
        /**
         * 删除系统消息
         */
        public final void deleteSystemNotify(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, @org.jetbrains.annotations.NotNull()
        java.lang.String messageId) {
        }
        
        /**
         * EPC左侧边栏
         */
        public final void epcGetLeftMenu(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, @org.jetbrains.annotations.NotNull()
        okhttp3.RequestBody body) {
        }
        
        /**
         * EPC右侧边栏
         */
        public final void epcGetRightMenu(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, @org.jetbrains.annotations.NotNull()
        okhttp3.RequestBody body) {
        }
        
        /**
         * EPC右侧边栏
         */
        public final void getEpcSecondList(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, @org.jetbrains.annotations.NotNull()
        okhttp3.RequestBody body) {
        }
        
        /**
         * 获取联盟下所有成员
         */
        public final void getAllAllianceCompany(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, int allianceId) {
        }
        
        public final void jiaoyiliushui(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, @org.jetbrains.annotations.NotNull()
        java.lang.String companyId, @org.jetbrains.annotations.NotNull()
        java.lang.String orgName, int pageNum, int pageSize, @org.jetbrains.annotations.NotNull()
        java.lang.String payWay, @org.jetbrains.annotations.NotNull()
        java.lang.String invoiceType, @org.jetbrains.annotations.NotNull()
        java.lang.String actionType) {
        }
        
        public final void shouxinqiye(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<okhttp3.ResponseBody> observer, @org.jetbrains.annotations.NotNull()
        okhttp3.RequestBody body) {
        }
    }
}