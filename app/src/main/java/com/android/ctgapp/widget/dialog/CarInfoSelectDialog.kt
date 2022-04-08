package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.enquiry.CarConfigSelectAdapter
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.entity.home.CarConfigSelectBean
import kotlinx.android.synthetic.main.item_car_info_select_dalog.*

/**
 *作者:LiBW
 *创建日期: 2021/8/3
 *描述:车型配置选择 Dialog
 */
class CarInfoSelectDialog(private val mList:ArrayList<CarConfigSelectBean>, private val listener:CarInfoSelectCallBack) : BaseDialogFragment(), CarConfigSelectAdapter.CarConfigSelectCallback {

    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        dialog?.setCanceledOnTouchOutside(false)
        dialog?.setCancelable(false)
        val adapter = CarConfigSelectAdapter(requireContext(), mList,this )
        mRecyclerView.adapter=adapter
        mRecyclerView.layoutManager=LinearLayoutManager(requireContext())

    }

    override fun getLayout() = R.layout.item_car_info_select_dalog



    interface CarInfoSelectCallBack{
        fun onCarIdSelect(carID:String)
    }

    override fun onItemClick(carId: String) {
        dismiss()
        listener.onCarIdSelect(carId)
    }

}