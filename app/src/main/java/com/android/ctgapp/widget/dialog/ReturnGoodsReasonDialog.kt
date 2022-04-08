package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.View
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseDialogFromBottomFragment
import com.android.ctgapp.util.showToast
import kotlinx.android.synthetic.main.item_return_reason.*

/**
 *作者:LiBW
 *创建日期: 12/9/20
 *描述: 退货原因Dialog
 */
class ReturnGoodsReasonDialog(private val selectReason: String, private val callback: Callback) : BaseDialogFromBottomFragment() {
    private var selectStr = selectReason
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {

        dialog?.setCanceledOnTouchOutside(true)
        when (selectReason) {
            "发错货" -> mRB1.performClick()
            "质量问题" -> mRB2.performClick()
            "下错订单" -> mRB3.performClick()
            "其他" -> mRB4.performClick()
        }


        mGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.mRB1 -> selectStr = "发错货"
                R.id.mRB2 -> selectStr = "质量问题"
                R.id.mRB3 -> selectStr = "下错订单"
                R.id.mRB4 -> selectStr = "其他"
            }
        }

        mConfirmBTN.setOnClickListener {
            if (selectStr.isEmpty()) {
                requireActivity().showToast("请至少选择一个原因")
            } else {
                callback.onItemSelect(selectStr)
                dialog?.dismiss()
            }
        }
    }

    override fun getLayout() = R.layout.item_return_reason
    interface Callback {
        fun onItemSelect(select: String)
    }
}