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
import retrofit2.http.Field
import java.util.HashMap

class VulnerablePartShopViewModel : BaseViewModel() {

    private val mGoodResult = MutableLiveData<String>()
    val goodResult: LiveData<String> get() = mGoodResult


    private val mAddTrolleyResult = MutableLiveData<String>()
    val addTrolleyResult: LiveData<String> get() = mAddTrolleyResult

    fun getGoods(vin: String, ctgnum: String, query: String, sortSales: String, sortPrice: String, pageNum: Int, pageSize: Int, brandIdList: List<Int>) {
        launch {
            val map = HashMap<String, Any>()
            map["vin"] = vin
            map["companyId"] = BaseApplication.companyId
            map["ctgnum"] = ctgnum
            map["query"] = query
            map["sortSales"] = sortSales
            map["sortPrice"] = sortPrice
            map["pageNum"] = pageNum
            map["pageSize"] = pageSize
            map["brandIdList"] = brandIdList
            map["searchType"] = BuildConfig.GOODS_SEARCH_TYPE
//            mGoodResult.value = ApiMethods.retrofit.getGoodsByVin(globalUserToken, vin, BaseApplication.companyId.toString(), fCode, query, sortSales, sortPrice, pageNum, pageSize).awaitSync()


            val obj = Gson().toJson(map)
            val body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),
                obj
            )


            if (BuildConfig.APPLICATION_ID=="com.ctgoe.app.wl"){
                mGoodResult.value = ApiMethods.retrofit.getGoodsByVinWL(
                    BaseApplication.userToken, body
                ).awaitSync()
            }else{
                mGoodResult.value = ApiMethods.retrofit.getGoodsByVin(
                    BaseApplication.userToken, body
                ).awaitSync()
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