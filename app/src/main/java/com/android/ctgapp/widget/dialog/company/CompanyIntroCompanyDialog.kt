package com.android.ctgapp.widget.dialog.company

import android.os.Bundle
import android.view.View
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.callback.CompanyCallback
import kotlinx.android.synthetic.main.item_company_intro.*

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述: 公司简介Dialog
 */
class CompanyIntroCompanyDialog(private val companyIntro: String, private val changeCallback: CompanyCallback) : BaseCompanyDialogFragment() {

    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
//        mCompanyIntroET.text = setEditText(companyIntro)
        mCompanyIntroET.text = companyIntro
        mDeleteIV.setOnClickListener {
            dismiss()
        }
//        mEditIV.setOnClickListener {
//            mCompanyIntroET.isEnabled = true
//            mCompanyIntroET.requestFocus()
//            it.visibility = View.GONE
//            mSaveBTN.visibility = View.VISIBLE
//        }
//        //保存按钮 提交数据 显示编辑按钮 EditText变为不可编辑
//        mSaveBTN.setOnClickListener {
//            mCompanyIntro = mCompanyIntroET.text.toString()
//            it.visibility = View.INVISIBLE
//            mEditIV.visibility = View.VISIBLE
//            mCompanyIntroET.isEnabled = false
//            changeCallback.saveIntro(mCompanyIntro)
//        }
    }

    override fun getLayout() = R.layout.item_company_intro
}