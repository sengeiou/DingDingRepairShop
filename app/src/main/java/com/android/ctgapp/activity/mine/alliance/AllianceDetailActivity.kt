package com.android.ctgapp.activity.mine.alliance

import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import kotlinx.android.synthetic.main.activity_alliance_detail.*

/**
 *作者:LiBW
 *创建日期: 4/20/21
 *描述: 联盟详情 页面
 */
class AllianceDetailActivity : BaseActivity() {


    override fun getLayout() = R.layout.activity_alliance_detail

    override fun event() {
        //联盟名称
        mAllianceNameTV

        mAllianceIV
        //属性
        mIndustryTV
        //联盟简介
        mAllianceIntroTV
        //联盟联系方式
        val phone = "联盟电话:"
        mPhoneTV.text = phone
        //联盟邀请码
        val code = "联盟邀请码:"
        mAuthCodeTV.text = code


    }

    override fun click() {

    }
}