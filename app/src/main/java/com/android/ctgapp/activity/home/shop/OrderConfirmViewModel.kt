package com.android.ctgapp.activity.home.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.entity.home.ShoppingSupportWithCreditBean
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.MediaType
import okhttp3.RequestBody

class OrderConfirmViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    private val mGoodsResult = MutableLiveData<String>()
    val goodsResult: LiveData<String> get() = mGoodsResult
    private val mAddressResult = MutableLiveData<String>()
    val addressResult: LiveData<String> get() = mAddressResult


    //查询购买的商户是否支持挂账
    fun queryShoppingSupportWithCredit(shoppingSupportWithCreditBean: ShoppingSupportWithCreditBean) {
        launch {
            val body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),
                getGson().toJson(shoppingSupportWithCreditBean)
            )
            mResult.value = ApiMethods.retrofit.shoppingSupportWithCredit(BaseApplication.userToken, body).awaitSync()
        }
    }

    //获取商品详情
    fun getGoodsDetail(goodsId: String) {
        launch {
            mGoodsResult.value = ApiMethods.retrofit.getGoodsDetail(BaseApplication.userToken, goodsId, BaseApplication.companyId.toString(),BuildConfig.GOODS_SEARCH_TYPE).awaitSync()
        }
    }

    //获取收货地址
    fun getAddress() {
        launch {
            mAddressResult.value = ApiMethods.retrofit.getAddress(BaseApplication.userToken).awaitSync()
        }
    }

}