package com.android.ctgapp.widget.dialog.company

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.entity.AccountInfoEntityV2
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.item_account_info.*
import okhttp3.MediaType
import okhttp3.RequestBody

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述:账户信息Dialog
 */
class AccountInfoCompanyDialog(private val companyId: Int, private val canEdit: Boolean = true) : BaseCompanyDialogFragment() {
    private var isNew = true
    private var mId = -1
    private val mViewModel: AccountInfoCompanyViewModel by lazy { ViewModelProvider(this)[AccountInfoCompanyViewModel::class.java] }
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
//        mEditIV.handlerViewByTheme(requireContext(),R.drawable.editp)

        mViewModel.getAccountInfo(companyId)
        changeStatue(false)
        mEditIV.visibility = if (canEdit) View.VISIBLE else View.GONE
        if (!canEdit) {
            mAliPayET.hint = "暂无"
            mWeChatET.hint = "暂无"
            mBankNameET.hint = "暂无"
            mCardNumberET.hint = "暂无"
        }

        //编辑
        mEditIV.setOnClickListener {
            mEditIV.visibility = View.GONE
            mSaveBTN.visibility = View.VISIBLE
            changeStatue(true)
        }
        //关闭
        mDeleteIV.setOnClickListener {
            dismiss()
        }
        //保存
        mSaveBTN.setOnClickListener {
            val aliPay = mAliPayET.text.handlerNull()
            val weChatPay = mWeChatET.text.handlerNull()
            val bankName = mBankNameET.text.handlerNull()
            val cardNum = mCardNumberET.text.handlerNull()
            val map = HashMap<String, Any>()

            if (mId != -1) {
                map["id"] = mId
                MyLog.d("给你Id:${mId}")
            }
            map["alipay"] = aliPay
            map["weixin"] = weChatPay
            map["bankName"] = bankName
            map["bankAccount"] = cardNum
            map["companyId"] = companyId
            val body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),
                getGson().toJson(map)
            )
            MyLog.d("当前模式是新建么:$isNew")
            if (isNew) mViewModel.createAccountInfo(body) else mViewModel.updateAccountInfo(body)

            mEditIV.visibility = View.VISIBLE
            mSaveBTN.visibility = View.GONE
            changeStatue(false)
        }

        mViewModel.getResult.observe(this, Observer {
            MyLog.d("获取账户信息:$it")
            val data = getGson().fromJson(it, AccountInfoEntityV2::class.java).data
            if (data == null) {
                isNew = true
            } else {
                //没有ID表示需要新建数据
                if (data.id == -1) {
                    isNew = true
                } else {
                    MyLog.d("这个是修改模式${data.id.handlerNull()}")
                    isNew = false
                    mId = data.id
                    mAliPayET.textSet(data.alipay)
                    mWeChatET.textSet(data.weixin)
                    mBankNameET.textSet(data.bankName)
                    mCardNumberET.textSet(data.bankAccount)
                }
            }
        })

        mViewModel.error.observe(this, Observer {
            MyLog.d("错误")
            requireActivity().showToast(it)
        })
        mViewModel.result.observe(this, Observer {
            MyLog.d("修改创建回调:$it")
            requireActivity().handlerData(it) {
                requireActivity().showToast("操作成功")
                mViewModel.getAccountInfo(companyId)
            }
        })
    }

    private fun changeStatue(boolean: Boolean) {
        mAliPayET.isEnabled = boolean
        mWeChatET.isEnabled = boolean
        mBankNameET.isEnabled = boolean
        mCardNumberET.isEnabled = boolean
    }

    override fun getLayout() = R.layout.item_account_info
}