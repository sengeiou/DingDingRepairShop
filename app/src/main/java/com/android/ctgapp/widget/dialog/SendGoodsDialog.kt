package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerData
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.showToast
import kotlinx.android.synthetic.main.item_send_goods_dialog.*

/**
 *作者:LiBW
 *创建日期: 3/18/21
 *描述:售后 发货dialog
 */
class SendGoodsDialog(private val orderID: String, private val listener: Callback) : BaseDialogFragment() {
    private val mViewModel by lazy { ViewModelProvider(this)[SendGoodsViewModel::class.java] }
    val loading: LoadingDialog by lazy { LoadingDialog(requireActivity()) }
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {

        mViewModel.error.observe(this, {
            MyLog.d("错误:$it")
            dismissDialog()
            requireActivity().showToast(it)
            dismiss()
        })

        mViewModel.result.observe(this,  {
            dismissDialog()
            MyLog.d("商品列表:$it")
            requireActivity().handlerData(it) {
                requireActivity().showToast("提交成功")
                listener.sendGoodsFinish()
                dismiss()
            }
        })
        mCancelIV.setOnClickListener {
            dismissDialog()
            dismiss()
        }
        //确认
        mConfirmBTN.setOnClickListener {
            val company = mLogisticsCompanyET.text.handlerNull()
            val number = mLogisticsNumberET.text.handlerNull()
            when {
                company.isEmpty() -> requireActivity().showToast("请填写物流公司")
                number.isEmpty() -> requireActivity().showToast("请填写物流单号")
                else -> {
                    loading.show()
                    mViewModel.sendGoods(orderID, company, number)
                }
            }
        }

        //跳过
        mCancelBTN.setOnClickListener {
            mViewModel.sendGoods(orderID, null, null)
        }
    }

    private fun dismissDialog() {
        if (loading.isShowing) loading.dismiss()
    }

    override fun getLayout() = R.layout.item_send_goods_dialog
    interface Callback {
        fun sendGoodsFinish()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        dismissDialog()
    }
}