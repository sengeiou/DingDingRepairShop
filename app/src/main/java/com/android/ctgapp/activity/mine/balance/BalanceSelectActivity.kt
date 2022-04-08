package com.android.ctgapp.activity.mine.balance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import kotlinx.android.synthetic.main.activity_balance_select.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 12/28/20
 *描述:账户余额 页面 选择
 */
class BalanceSelectActivity : BaseActivity() {

    override fun event() {

    }

    override fun click() {
        //联盟账户
        mAllianceAccountLL.setOnClickListener {
            startActivity<CompanyBalanceActivity>()
        }
        //企业账户
        mCompanyAccountLL.setOnClickListener {
            startActivity<CompanyBalanceActivity>()
        }
    }

    override fun getLayout() = R.layout.activity_balance_select


}