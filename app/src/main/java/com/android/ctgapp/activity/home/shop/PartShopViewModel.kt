package com.android.ctgapp.activity.home.shop

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

class PartShopViewModel : BaseViewModel() {
    private val mGoodResult = MutableLiveData<String>()
    val goodResult: LiveData<String> get() = mGoodResult

    private val mAddTrolleyResult = MutableLiveData<String>()
    val addTrolleyResult: LiveData<String> get() = mAddTrolleyResult

    fun getGoods(body: RequestBody) {
        launch {
            if (BuildConfig.APPLICATION_ID == "com.ctgoe.app.wl") {
                mGoodResult.value = ApiMethods.retrofit.getGoodsWL(body).awaitSync()
            } else {
                mGoodResult.value = ApiMethods.retrofit.getGoods(body).awaitSync()
            }
        }
    }

    //分类点击后获取的其他分类
    private val mAttrResult = MutableLiveData<String>()
    val attrResult: LiveData<String> get() = mAttrResult
    fun findAttrAfterCategory(body: RequestBody) {
        launch {
            mAttrResult.value = ApiMethods.retrofit.findAttrAfterCategory(body).awaitSync()
        }
    }


    private val mGoodByBannerResult = MutableLiveData<String>()
    val goodByBannerResult: LiveData<String> get() = mGoodByBannerResult

    fun getGoodsByBanner(body: RequestBody) {
        launch {
            if (BuildConfig.APPLICATION_ID == "com.ctgoe.app.wl") {
                mGoodByBannerResult.value = ApiMethods.retrofit.getGoodsByBannerWL(body).awaitSync()

            } else {
                mGoodByBannerResult.value = ApiMethods.retrofit.getGoodsByBanner(body).awaitSync()

            }
        }
    }


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