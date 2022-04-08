package com.android.ctgapp.activity.mine

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.activity.mine.whitebar.CheckFlowActivity
import com.android.ctgapp.adapter.mine.ShouXinCompanyAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityShouXinCompanyctivityBinding
import com.android.ctgapp.entity.QiYeShouXinEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import okhttp3.ResponseBody
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2021/8/14
 *描述:授信企业 页面 我的白条 页面
 */
class ShouXinCompanyctivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityShouXinCompanyctivityBinding.inflate(layoutInflater) }
    private val mList= ArrayList<QiYeShouXinEntity.DataBean>()
    private val mAdapter by lazy { ShouXinCompanyAdapter(this,mList) }
    
    override fun getLayout() = mBinding.root

    override fun event() {
        mBinding.mRecyclerView.adapter=mAdapter
        mBinding.mRecyclerView.layoutManager=LinearLayoutManager(this)
        mBinding.mMoneyTV.text = intent.getStringExtra(MyConstants.TOTAL_MONEY).handlerNull()
//        val map=HashMap<String,Any>()
//        map["companyId"]=BaseApplication.companyId
//        HttpUtil.postWithBodyHandlerError(this,"financeServiceV2/ctgBill/getIsAllow", map){
//            MyLog.d("守信企业回调:$it")
//
//        }

        val Listener = object : ObserverListener {
            override fun onNext(t: ResponseBody) {
                loading.dismiss()
                val str = t.string().handlerNull()
                MyLog.d("回调:$str")
                handlerHttpResult(str){
                    val data= getGson().fromJson(str, QiYeShouXinEntity::class.java).data
                    data?.let {list->
                        mList.addAll(list)
                        mAdapter.notifyDataSetChanged()
                    }
                }
            }

            override fun onError(error: String) {
                loading.dismiss()
                showToast(error)
            }
        }
        ApiMethods.shouxinqiye(MyObserver(Listener), handlerBody(
            "companyId" to BaseApplication.companyId
        ))
    }

    override fun click() {
        mBinding.mduizhanghuankuan.setOnClickListener {
            finish()
        }
        mBinding.mjiaoyiliushui.setOnClickListener { 
            startActivity<CheckFlowActivity>()
        }


    }
}