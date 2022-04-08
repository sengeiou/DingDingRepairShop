package com.android.ctgapp.fragment.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.entity.home.TrolleyAddGoodsBean
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.RequestBody
import java.util.HashMap

class HomeFragmentViewModel : BaseViewModel() {
    private val mBannerResult = MutableLiveData<String>()
    val bannerResult: LiveData<String> get() = mBannerResult

    private val mNoticeResult = MutableLiveData<String>()
    val noticeResult: LiveData<String> get() = mNoticeResult

    /**获取轮播图*/
    fun getBanner() {
        launch {
            mBannerResult.value = ApiMethods.retrofit.getBanner(BaseApplication.userToken, BaseApplication.allianceId, BaseApplication.companyId).awaitSync()
        }
    }

    /**获取通知*/
    fun getNotice() {
        launch {
            mNoticeResult.value = ApiMethods.retrofit.getNotice(BaseApplication.userToken, BaseApplication.allianceId, BaseApplication.companyId).awaitSync()
        }
    }

    private val mGoodByBannerResult = MutableLiveData<String>()
    val goodByBannerResult: LiveData<String> get() = mGoodByBannerResult

    /**获取轮播图中的商品信息*/
    fun getGoodsByBanner(body: RequestBody) {
        launch {
            if (BuildConfig.APPLICATION_ID == "com.ctgoe.app.wl") {
                mGoodByBannerResult.value = ApiMethods.retrofit.getGoodsByBannerWL(body).awaitSync()
            } else {
                mGoodByBannerResult.value = ApiMethods.retrofit.getGoodsByBanner(body).awaitSync()
            }
        }
    }

    private val mHotGoodsResult = MutableLiveData<String>()
    val hotGoodsResult: LiveData<String> get() = mHotGoodsResult

    /**获取热销商品*/
    fun getHotGoods() {
        launch {
            if (BuildConfig.APPLICATION_ID == "com.ctgoe.app.wl") {
                mHotGoodsResult.value = ApiMethods.retrofit.getHotGoodsWL(BaseApplication.userToken, BuildConfig.GOODS_SEARCH_TYPE, BuildConfig.CUSTOM_ALLIANCE_ID).awaitSync()
            } else {
                mHotGoodsResult.value = ApiMethods.retrofit.getHotGoods(BaseApplication.userToken, BuildConfig.GOODS_SEARCH_TYPE, BuildConfig.CUSTOM_ALLIANCE_ID).awaitSync()
            }
        }
    }


    private val mAddTrolleyResult = MutableLiveData<String>()
    val addTrolleyResult: LiveData<String> get() = mAddTrolleyResult
    fun goodsAddTrolley(bean: TrolleyAddGoodsBean) {
        launch {
            val map = HashMap<String, Any>()
            map["partId"] = bean.partId
            map["partName"] = bean.partName
            map["price"] = bean.price
            if (BaseApplication.allianceId != 0) {
                map["allianceId"] = BaseApplication.allianceId.handlerNull()
            }
            map["companyIndustry"] = bean.companyIndustry
            map["remark"] = bean.remark
            map["num"] = bean.num
            map["buyerCompanyId"] = BaseApplication.companyId
            map["sellWay"] = bean.sellWay
            map["createUser"] = BaseApplication.userId

            val obj = Gson().toJson(map)
            val body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),
                obj
            )
            mAddTrolleyResult.value = ApiMethods.retrofit.goodsAddTrolley(BaseApplication.userToken, body).awaitSync()
        }
    }


}