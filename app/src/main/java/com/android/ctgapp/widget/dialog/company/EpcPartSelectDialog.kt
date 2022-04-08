package com.android.ctgapp.widget.dialog.company

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.enquiry.EpcSelectedAdapter
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.entity.home.BatchAddPartChildEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.entity.home.EpcMenuEntity
import kotlinx.android.synthetic.main.item_epc_part_select_dialog.*


/**
 *作者:LiBW
 *创建日期: 2021/8/2
 *描述:EPC选中 菜单 Dialog
 */
class EpcPartSelectDialog(private val list:ArrayList<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>,private val listener:EpcPartSelectCallback) : BaseCompanyDialogFragment(), EpcSelectedAdapter.EpcSelectCallback {
//    private val mList = ArrayList<BatchAddPartChildEntity.DataBean>()
    private val mAdapter by lazy { EpcSelectedAdapter(requireContext().applicationContext, list, this) }
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
//        mList.addAll(list)
//        mAdapter.notifyDataSetChanged()
        dialog?.setCanceledOnTouchOutside(true)
//        repeat(12) {
//            val b = EpcMenuEntity()
//            b.name = "啥"
//            b.select = false
//            mList.add(b)
//        }
        mSelectedRV.adapter = mAdapter
        mSelectedRV.layoutManager = LinearLayoutManager(requireContext().applicationContext)
    }

    override fun getLayout() = R.layout.item_epc_part_select_dialog

    override fun epcPartDelete(position: Int) {
        list.removeAt(position)
        mAdapter.notifyDataSetChanged()
        listener.onItemRemove(position)
    }
    interface EpcPartSelectCallback{
        fun onItemRemove(position: Int)
    }
}