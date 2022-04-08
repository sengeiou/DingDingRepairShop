package com.android.ctgapp.activity.deal.enquire

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.deal.enquire.EnquireQueryWishDetailAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityEnquireWishDetailBinding
import com.android.ctgapp.entity.deal.enquire.EnquireWishDetailEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import okhttp3.ResponseBody

/**
 *作者:LiBW
 *创建日期: 2021/8/3
 *描述:
 */
class EnquireWishDetailActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityEnquireWishDetailBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    override fun event() {
        val listener = object : ObserverListener {
            override fun onNext(t: ResponseBody) {
                loading.dismiss()
                val str = t.string().handlerNull()
                MyLog.d("询价意向单详情回调:$str")
                val data = getGson().fromJson(str, EnquireWishDetailEntity::class.java).data
                data?.let {
                    when (data.wishListStatus) {
                        1 -> {
                            mBinding.mStatueTV.text = "待处理"
                        }
                        2 -> {
                            mBinding.mStatueTV.text = "已完成"
                        }
                    }
                    mBinding.mTimeTV.text = data.createTime.handlerNull()
                    data.details?.let {
                        mBinding.mRecyclerView.adapter = EnquireQueryWishDetailAdapter(this@EnquireWishDetailActivity, it)
                        mBinding.mRecyclerView.layoutManager = LinearLayoutManager(this@EnquireWishDetailActivity)
                    }
                }
            }

            override fun onError(error: String) {
                loading.dismiss()
                showToast(error)
            }
        }
        ApiMethods.enquireWishOrderListDetail(MyObserver(listener), intent.getIntExtra(MyConstants.FLAG, -1))
    }

    override fun click() {

    }
}