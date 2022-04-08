package com.android.ctgapp.widget.dialog.company

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.entity.InvoiceEntityV2
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.item_invoic_info_dialog.*
import kotlinx.android.synthetic.main.item_invoic_info_dialog.mBankNameET
import kotlinx.android.synthetic.main.item_invoic_info_dialog.mCardNumberET
import kotlinx.android.synthetic.main.item_invoic_info_dialog.mDeleteIV
import kotlinx.android.synthetic.main.item_invoic_info_dialog.mEditIV
import kotlinx.android.synthetic.main.item_invoic_info_dialog.mSaveBTN
import okhttp3.MediaType
import okhttp3.RequestBody

/**
 *作者:LiBW
 *创建日期: 12/21/20
 *描述:开票信息 dialog
 */
class InvoiceInfoCompanyDialog(private val companyId: Int, private val canEdit: Boolean = true) : BaseCompanyDialogFragment() {
    private val mViewModel: InvoiceInfoCompanyViewModel by lazy { ViewModelProvider(this)[InvoiceInfoCompanyViewModel::class.java] }
    private var mId = -1
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
//        mEditIV.handlerViewByTheme(requireContext(), R.drawable.editp)
        changeStatue(false)
        mEditIV.visibility = if (canEdit) View.VISIBLE else View.GONE
        if (!canEdit) {
            mCompanyNameET.hint = "暂无"
            mCompanyAddressET.hint = "暂无"
            mNumberET.hint = "暂无"
            mPhoneNumberET.hint = "暂无"
            mBankNameET.hint = "暂无"
            mCardNumberET.hint = "暂无"
        }

        //编辑
        mEditIV.setOnClickListener {
            it.visibility = View.GONE
            mSaveBTN.visibility = View.VISIBLE
            changeStatue(true)
        }
        //关闭
        mDeleteIV.setOnClickListener {
            dismiss()
        }
        //保存
        mSaveBTN.setOnClickListener {
            val name = mCompanyNameET.text.handlerNull()
            val address = mCompanyAddressET.text.handlerNull()
            val number = mNumberET.text.handlerNull()
            val phoneNum = mPhoneNumberET.text.handlerNull()
            val bankName = mBankNameET.text.handlerNull()
            val cardNum = mCardNumberET.text.handlerNull()
            when {
                name.isEmpty() -> requireActivity().showToast("请填写公司名称")
                address.isEmpty() -> requireActivity().showToast("请填写公司地址")
                number.isEmpty() -> requireActivity().showToast("请填写纳税人识别号")
//                phoneNum.isEmpty() -> requireActivity().showToast("请填写税务局预留电话")
                bankName.isEmpty() -> requireActivity().showToast("请填写开户行")
                cardNum.isEmpty() -> requireActivity().showToast("请填写开户行账号")
                else -> {
                    val map = HashMap<String, Any>()
                    if (mId != -1) {
                        //修改 通过id来修改信息
                        map["id"] = mId
                    }
                    map["companyId"] = companyId
                    map["licenseName"] = name
                    map["licenseAddress"] = address
                    map["taxpayerNum"] = number
                    map["reservedTel"] = phoneNum
                    map["bankName"] = bankName
                    map["bankAccount"] = cardNum
                    val body = RequestBody.create(
                        MediaType.parse("application/json; charset=utf-8"),
                        getGson().toJson(map)
                    )
                    if (mId == -1) mViewModel.createInvoice(body) else mViewModel.updateInvoice(body)
                }
            }
        }

        mViewModel.error.observe(this, Observer {
            MyLog.d("错误:$it")
            requireActivity().showToast(it)
        })

        mViewModel.getInvoiceResult.observe(this, Observer {
            MyLog.d("获取发票:$it")
            requireActivity().handlerHttpResult(it) {
                val data = getGson().fromJson(it, InvoiceEntityV2::class.java).data
                data?.let { bean ->
                    if (bean.id != -1) {
                        mId = bean.id
                        mCompanyNameET.textSet(bean.licenseName)
                        mCompanyAddressET.textSet(bean.licenseAddress)
                        mNumberET.textSet(bean.taxpayerNum)
                        mPhoneNumberET.textSet(bean.reservedTel)
                        mBankNameET.textSet(bean.bankName)
                        mCardNumberET.textSet(bean.bankAccount)
                    }
                }
            }
        })
        mViewModel.getInvoiceInfo(companyId)

        mViewModel.createInvoiceResult.observe(this, Observer {
            MyLog.d("创建/修改发票:$it")
            val data = initData(it)
            if (data.status == 0) {
                requireActivity().showToast("操作成功")
                changeStatue(false)
                mEditIV.visibility = View.VISIBLE
                mSaveBTN.visibility = View.GONE
            } else {
                requireActivity().showToast(data.msg)
            }
        })
    }

    private fun changeStatue(boolean: Boolean) {
        mCompanyNameET.isEnabled = boolean
        mCompanyAddressET.isEnabled = boolean
        mNumberET.isEnabled = boolean
        mPhoneNumberET.isEnabled = boolean
        mBankNameET.isEnabled = boolean
        mCardNumberET.isEnabled = boolean
    }

    override fun getLayout() = R.layout.item_invoic_info_dialog
}