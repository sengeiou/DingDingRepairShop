package com.android.ctgapp.widget.dialog.company

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.CarSeriesAdapter
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.entity.CarSeriesEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.item_car_series_dialog.*

/**
 *作者:LiBW
 *创建日期: 2/23/21
 *描述: 主修车系选择 Dialog
 */
class CarSeriesSelectDialog(private val mSet:MutableSet<CarSeriesEntity.DataBean>,private val listener: Callback) : BaseCompanyDialogFragment(), CarSeriesAdapter.CallBack {

    private val mViewModel: CarSeriesSelectViewModel by lazy { ViewModelProvider(this)[CarSeriesSelectViewModel::class.java] }

    private var mList = mutableSetOf<CarSeriesEntity.DataBean>()

    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        mSet.forEach {
            mList.add(it)
        }


        dialog?.setCanceledOnTouchOutside(false)
        mCloseIV.setOnClickListener {
            dialog?.dismiss()
        }
        //CAR_SERIES 是查所有车系  REPAIRSHOP_GRADE查汽修厂等级
        mViewModel.findSomeThing("CAR_SERIES")
        mViewModel.result.observe(this,  {
            MyLog.d("主营车系列表:$it")
            MyLog.d("主营车系列表haah:${getGson().toJson(mSet)}")
            requireActivity().handlerHttpResult(it) {
                val data = getGson().fromJson(it, CarSeriesEntity::class.java).data
                data?.let { list ->
                    list.forEach {dataBean ->
                        mSet.forEach {set->
                            if (set.id==dataBean.id){
                                dataBean.select=true
                                MyLog.d("主营车系列表选中了")
                            }
                        }
                    }
                    val mAdapter = CarSeriesAdapter(requireContext(), list, this)
                    mCarSeriesRV.adapter = mAdapter
                    mCarSeriesRV.layoutManager = LinearLayoutManager(requireContext())
                }
            }
        })
        mViewModel.error.observe(this,  {
            MyLog.d("错误:$it")
            requireActivity().showToast(it)
            dismiss()
        })

        mConfirmBTN.setOnClickListener {
            listener.chexiCallback(mList)
            dismiss()
        }
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }


    override fun getLayout() = R.layout.item_car_series_dialog

    interface Callback {
        fun chexiCallback(list: Set<CarSeriesEntity.DataBean>)
    }

    override fun selectCallBack(select: Boolean, data: CarSeriesEntity.DataBean) {
        if (select) {
            mList.add(data)
        } else {
            var removeBean=CarSeriesEntity.DataBean()
            mList.forEach {
                if (it.id==data.id){
                    removeBean=it
                }
            }
            mList.remove(removeBean)
        }
    }
}


