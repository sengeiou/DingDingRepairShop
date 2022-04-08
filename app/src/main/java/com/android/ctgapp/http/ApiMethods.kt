package com.android.ctgapp.http


import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.util.launch
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import java.util.concurrent.TimeUnit

/**
 *作者:LiBW
 *创建日期: 2020/8/15
 *描述: Retrofit类
 */
open class ApiMethods {
    companion object {
        val retrofit = getApiService()
        fun changeUrl(){

        }
        private fun getApiService(): ApiService {
            val retrofit = Retrofit.Builder().baseUrl(BuildConfig.SERVER_URL)//设置网络请求的URL地址
                .addConverterFactory(GsonConverterFactory.create())//设置数据解析器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//支持RxJava
                .client(initClient())//拦截器
                .build()
            return retrofit.create(ApiService::class.java)
        }


        //拦截器
        private fun initClient(): OkHttpClient {
            //日志拦截器
            val interceptor = HttpLoggingInterceptor()
            //拦截返回的BODY
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            //header配置拦截器
            val headerInterceptor = Interceptor {
                val request = it.request().newBuilder()
                    .addHeader("Content-Type", "application/json")
                    .addHeader("charset", "utf-8")
                    .build()
                it.proceed(request)
            }

            return OkHttpClient.Builder()
                //拦截器设置
                .addInterceptor(headerInterceptor)
                .addInterceptor(interceptor)
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .build()
        }

         fun apiSubscribe(observable: Observable<ResponseBody>, observer: Observer<ResponseBody>) {
            observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer)
        }

        /**获取询价记录*/
        fun getQueryList(observer: Observer<ResponseBody>, enquiryStatus: Int?, page: Int) {
            apiSubscribe(retrofit.getQueryList(enquiryStatus, page), observer)
        }

        fun getQueryDetail(observer: Observer<ResponseBody>, enquiryId: Int, displayMode: Int? = null) {
            apiSubscribe(retrofit.getQueryDetail(enquiryId, displayMode), observer)
        }

        /**新增询价意向单/更新询价意向单*/
        fun enquireAddWishOrder(observer: Observer<ResponseBody>, body: RequestBody) {
            apiSubscribe(retrofit.enquireAddWishOrder(body), observer)
        }

        /**查询询价意向单列表*/
        fun enquireWishOrderList(observer: Observer<ResponseBody>, enquiryId: Int) {
            apiSubscribe(retrofit.enquireWishOrderList(enquiryId), observer)
        }

        /** /**查询询价意向单列表详情*/*/
        fun enquireWishOrderListDetail(observer: Observer<ResponseBody>, wishListId: Int) {
            apiSubscribe(retrofit.enquireWishOrderListDetail(wishListId), observer)
        }

        /**获取系统通知列表*/
        fun getSystemNotifyList(observer: Observer<ResponseBody>, pageNum: Int) {
            apiSubscribe(retrofit.getSystemNotifyList(pageNum), observer)
        }

        /**获取系统通知列表(只含未读)*/
        fun getSystemNotifyUnread(observer: Observer<ResponseBody>, pageNum: Int) {
            apiSubscribe(retrofit.getSystemNotifyUnread(pageNum), observer)
        }


        /**系统消息已读*/
        fun readSystemNotify(observer: Observer<ResponseBody>, messageId: String) {
            apiSubscribe(retrofit.readSystemNotify(messageId), observer)
        }

        /**系统消息已读(全部)*/
        fun readSystemNotifyAll(observer: Observer<ResponseBody>) {
            apiSubscribe(retrofit.readSystemNotifyAll(), observer)
        }

        /**删除系统消息*/
        fun deleteSystemNotify(observer: Observer<ResponseBody>, messageId: String) {
            apiSubscribe(retrofit.deleteSystemNotify(messageId), observer)
        }


        /**EPC左侧边栏*/
        fun epcGetLeftMenu(observer: Observer<ResponseBody>, body: RequestBody) {
            apiSubscribe(retrofit.epcGetLeftMenu(body), observer)
        }

        /**EPC右侧边栏*/
        fun epcGetRightMenu(observer: Observer<ResponseBody>, body: RequestBody) {
            apiSubscribe(retrofit.epcGetRightMenu(body), observer)
        }

        /**EPC右侧边栏*/
        fun getEpcSecondList(observer: Observer<ResponseBody>, body: RequestBody) {
            apiSubscribe(retrofit.getEpcSecondList(body), observer)
        }

        /**获取联盟下所有成员*/
        fun getAllAllianceCompany(observer: Observer<ResponseBody>, allianceId:Int){
            apiSubscribe(retrofit.getAllAllianceCompany(allianceId), observer)
        }
        fun  jiaoyiliushui(observer: Observer<ResponseBody>,companyId: String,orgName: String,pageNum: Int,pageSize: Int,payWay: String,invoiceType: String,actionType: String,){
            apiSubscribe(retrofit.JiaoyiLiuShui(companyId, orgName, pageNum, pageSize, payWay, invoiceType, actionType), observer)
        }
        fun shouxinqiye(observer: Observer<ResponseBody>, body: RequestBody){
            apiSubscribe(retrofit.shouxinqiye(body), observer)

        }
        /**生成流水单*/
//        fun MakeRechargeSerial(observer: Observer<ResponseBody>,body: RequestBody){
//            apiSubscribe(retrofit.MakeRechargeSerial(body), observer)
//        }
    }
}