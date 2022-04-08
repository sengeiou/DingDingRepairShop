package com.android.ctgapp.activity.deal.enquire

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.deal.enquire.EnquireQueryWishAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityEnquireWishListBinding
import com.android.ctgapp.entity.deal.enquire.EnquireWishEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import okhttp3.ResponseBody

/**
 *作者:LiBW
 *创建日期: 2021/8/3
 *描述:询价意向单 页面
 */
class EnquireWishListActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityEnquireWishListBinding.inflate(layoutInflater) }
    val enquiryId by lazy { intent.getIntExtra(MyConstants.ENQUIRY_ID, -1) }
    override fun getLayout() = mBinding.root

    override fun event() {
        val listener = object : ObserverListener {
            override fun onNext(t: ResponseBody) {
                loading.dismiss()
                val str = t.string().handlerNull()
                MyLog.d("询价意向单回调:$str")
                val data= getGson().fromJson(str, EnquireWishEntity::class.java).data
                data?.let {
                    mBinding.mOrderRV.adapter= EnquireQueryWishAdapter(this@EnquireWishListActivity,it)
                    mBinding.mOrderRV.layoutManager=LinearLayoutManager(this@EnquireWishListActivity)
                }
            }

            override fun onError(error: String) {
                loading.dismiss()
                showToast(error)
            }
        }
        loading.show()
        ApiMethods.enquireWishOrderList(MyObserver(listener), enquiryId)
    }

    override fun click() {

    }
}