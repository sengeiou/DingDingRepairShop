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

class GoodsDetailViewModel : BaseViewModel() {
    private val mGoodsResult = MutableLiveData<String>()
    val goodsResult: LiveData<String> get() = mGoodsResult

    private val mAddTrolleyResult = MutableLiveData<String>()
    val addTrolleyResult: LiveData<String> get() = mAddTrolleyResult

    fun getGoodsDetail(goodsId: String) {
        launch {
            mGoodsResult.value = ApiMethods.retrofit.getGoodsDetail(BaseApplication.userToken, goodsId, BaseApplication.companyId.toString(),BuildConfig.GOODS_SEARCH_TYPE).awaitSync()
        }
    }

    //加入购物车
    fun goodsAddTrolley(bean: TrolleyAddGoodsBean) {
        launch {
            val map = HashMap<String, Any>()
            map["partId"] = bean.partId
            map["partName"] = bean.partName
            map["price"] = bean.price
            if (BaseApplication.allianceId!=0){
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