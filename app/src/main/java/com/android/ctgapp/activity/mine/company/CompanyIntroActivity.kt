package com.android.ctgapp.activity.mine.company

import android.content.Intent
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.textSet
import kotlinx.android.synthetic.main.activity_company_intro.*

/**
 * 作者:LiBW
 * 创建日期: 3/5/21
 * 描述:企业简介 页面 (修改)
 */
class CompanyIntroActivity : BaseActivity() {


    override fun event() {
        mIntroET.textSet(intent.getStringExtra(MyConstants.COMPANY_INTRO))


    }

    override fun click() {
        //保存企业简介
        mConfirmBTN.setOnClickListener {
            val intent = Intent()
            intent.putExtra(MyConstants.COMPANY_INTRO, mIntroET.text.handlerNull())
            setResult(1000, intent)
            finish()
        }

    }

    override fun getLayout() = R.layout.activity_company_intro


}