package com.android.ctgapp.fragment.deal

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.EnquireWaitDetailActivity
import com.android.ctgapp.activity.deal.QueryRecordActivity
import com.android.ctgapp.activity.deal.QueryRecordV2Activity
import com.android.ctgapp.adapter.deal.QueryRecordAdapter
import com.android.ctgapp.base.BaseFragment
import com.android.ctgapp.entity.home.EnquiryListEntity
import com.android.ctgapp.event.OrderRefresh
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.SelectButton
import kotlinx.android.synthetic.main.fragment_query_log_layout.*
import okhttp3.ResponseBody
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/11/13
 *描述: 询价记录 Fragment
 */
class QueryLogFragment : BaseFragment(true), QueryRecordAdapter.QueryRecordListClick {
    override fun getLayout() = R.layout.fragment_query_log_layout

    //0草稿单 1待报价 2已失效 3已报价 4已完成
    private var preSelect: Int? = null
    private var page = 1
    private val mList = ArrayList<EnquiryListEntity.DataBean.RecordsBean>()
    private val mAdapter by lazy { QueryRecordAdapter(requireActivity(), mList, this) }
    private fun getData() {
        loading.show()
        ApiMethods.getQueryList(listener, preSelect, page)
    }

    @Subscribe
    fun eventBus(type: OrderRefresh) {
        MyLog.d("刷新询价记录")
        if (type.type == 1) {
            page = 1
            getData()
        }
    }


    val listener = MyObserver(object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            val str = t.string().handlerNull()
            MyLog.d("询价成功$str")
            mRefresh.over()
            loading.dismiss()
            val data = getGson().fromJson(str, EnquiryListEntity::class.java).data
            data?.records?.let { list ->
                if (page == 1) mList.clear()
                mList.addAll(list)
                mAdapter.notifyDataSetChanged()
            }
        }

        override fun onError(error: String) {
            showToast(error)
            MyLog.d("询价失败$error")
            mRefresh.over()
            loading.dismiss()
        }
    })

    override fun event() {
        getData()
        mQueryRV.adapter = mAdapter
        mQueryRV.layoutManager = LinearLayoutManager(requireContext())

    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }

    override fun click() {
        mAllBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(null)
            }
        })
        mFinishBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(4)
            }
        })


        mWaitQueryBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                //0草稿单 1待报价 2已失效 3已报价 4已完成
                buttonClick(1)
            }
        })
        mQueriedBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(3)
            }
        })
        mExceedBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(2)
            }
        })
        mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
        mRefresh.setOnRefreshListener {
            page = 1
            getData()
        }
    }


    //询价被点击
    override fun onListItemClick(enquiryId: Int, statuesCode: Int) {
        //0草稿单 1待报价 2已失效 3已报价 4已完成
        when (statuesCode) {
            3 -> {
                //34已报价和已完成进入配件选择页面可以下单和查看意向单
                requireActivity().startActivity<QueryRecordV2Activity>(MyConstants.ENQUIRY_ID to enquiryId)
            }

            4 -> {
                //34已报价和已完成进入配件选择页面可以下单和查看意向单
                requireActivity().startActivity<QueryRecordV2Activity>(MyConstants.ENQUIRY_ID to enquiryId)
            }
            else -> {
                requireActivity().startActivity<EnquireWaitDetailActivity>(MyConstants.ENQUIRY_ID to enquiryId)

            }

        }
    }

    private fun buttonClick(type: Int?) {
        MyLog.d("点击的什么:$type")
        if (preSelect == type) {
            return
        }
        //恢复之前的按钮
        when (preSelect) {
            null -> mAllBTN.unSelect()
            1 -> mWaitQueryBTN.unSelect()
            3 -> {
                mQueriedBTN.unSelect()
            }
            2 -> {
                mExceedBTN.unSelect()
            }
            4 -> {
                mFinishBTN.unSelect()
            }
        }
        when (type) {
            null -> mAllBTN.select()
            1 -> mWaitQueryBTN.select()
            3 -> {
                mQueriedBTN.select()
            }
            2 -> {
                mExceedBTN.select()
            }
            4 -> {
                mFinishBTN.select()
            }
        }

        preSelect = type
        page = 1
        getData()
    }


}