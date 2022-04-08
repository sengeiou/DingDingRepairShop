package com.android.ctgapp.activity.mine.setting

import com.android.ctgapp.R
import com.android.ctgapp.activity.address.AddressListActivity
import com.android.ctgapp.activity.login.LoginActivity
import com.android.ctgapp.base.AppManager
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_setting.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述:设置 页面
 */
class SettingActivity : BaseActivity() {
    override fun event() {
        val about="关于${resources.getString(R.string.app_name)}"
        mAboutNameTV.text=about
    }

    override fun click() {
        //修改密码
        mChangePasswordRL.setOnClickListener {
            startActivity<ChangePasswordActivity>()
        }
        //收货地址
        mShoppingAddressRL.setOnClickListener {
            startActivity<AddressListActivity>(MyConstants.CAN_EXIT to false)
        }
        //帮助与反馈
        mHelpFeedbackRL.setOnClickListener {

        }
        //关于车同轨
        mAboutCtgRL.setOnClickListener {
            startActivity<AboutAppActivity>()
        }
        //切换账号
        mAccountChangeTV.setOnClickListener {
            DataUtil.deleteAllData()
            initLogin()
            AppManager.instance.finishAllActivity()
            startActivity<LoginActivity>()
        }
    }

    override fun getLayout() = R.layout.activity_setting

}