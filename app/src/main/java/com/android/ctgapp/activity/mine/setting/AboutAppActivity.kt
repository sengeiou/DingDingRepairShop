package com.android.ctgapp.activity.mine.setting

import android.content.pm.PackageManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.login.UserAgreementActivity
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.util.MyConstants
import kotlinx.android.synthetic.main.activity_about_app.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2021/5/14
 *描述:关于 页面
 */
class AboutAppActivity : BaseActivity() {
    override fun getLayout() = R.layout.activity_about_app

    override fun event() {
        //版本号
        mAppCodeTV.text = packageManager.getPackageInfo(packageName, PackageManager.GET_CONFIGURATIONS).versionName

    }

    override fun click() {
        //新功能介绍
        mNewFunctionLL.setOnClickListener {

        }
        //服务协议
        mServiceAgreementLL.setOnClickListener {
            startActivity<UserAgreementActivity>()
        }
        //隐私政策
        mPrivacyAgreementLL.setOnClickListener {
            startActivity<UserAgreementActivity>(MyConstants.PRIVACY to true)
        }
        //版权信息
        mCopyrightInformationLL.setOnClickListener {

        }
    }

}