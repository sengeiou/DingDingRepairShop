package com.android.ctgapp.widget.dialog.company

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.WeiXiuDengJiAdapter
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.entity.CarSeriesEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.item_trolley_list.*
import kotlinx.android.synthetic.main.item_xlcdj_dialog.*

/**
 *作者:LiBW
 *创建日期: 2/23/21
 *描述: 维修等级
 */
class WeiXiuDengJiDialog(private val selectId: Int?, private val listener: WXDJCallback) : BaseCompanyDialogFragment(), WeiXiuDengJiAdapter.CallBack {

    private val mViewModel: CarSeriesSelectViewModel by lazy { ViewModelProvider(this)[CarSeriesSelectViewModel::class.java] }
    private var mData: CarSeriesEntity.DataBean? = null
    private val mList = ArrayList<CarSeriesEntity.DataBean>()
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        dialog?.setCanceledOnTouchOutside(false)
        mCloseIV.setOnClickListener {
            dialog?.dismiss()
        }
        //CAR_SERIES 是查所有车系   REPAIRSHOP_GRADE查汽修厂等级
        mViewModel.findSomeThing("REPAIRSHOP_GRADE")

        mViewModel.result.observe(this, Observer {
            MyLog.d("维修厂等级:$it")
            requireActivity().handlerHttpResult(it) {
                val data = getGson().fromJson(it, CarSeriesEntity::class.java).data
                data?.let { list ->
                    list.forEach { bean ->
                        if (bean.id == selectId) {
                            bean.select = true
                        }
                    }
                    mList.addAll(list)
                    val mAdapter = WeiXiuDengJiAdapter(requireContext(), mList, this)
                    mCarSeriesRV.adapter = mAdapter
                    mCarSeriesRV.layoutManager = LinearLayoutManager(requireContext())
                }
            }
        })

        mViewModel.error.observe(this, Observer {
            MyLog.d("错误:$it")
            requireActivity().showToast(it)
            dismiss()
        })

        mConfirmBTN.setOnClickListener {
            var bean:CarSeriesEntity.DataBean?=null

            mList.forEach {
                if (it.select) {
                    bean = it
                }
            }
            listener.wxdjCallback(bean)
            dismiss()
        }
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

    }

    override fun getLayout() = R.layout.item_xlcdj_dialog

    interface WXDJCallback {
        fun wxdjCallback(data: CarSeriesEntity.DataBean?)
    }

    override fun selectCallBack(select: Boolean, data: CarSeriesEntity.DataBean) {
        mData = if (select) data else null
    }
}


