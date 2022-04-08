package com.android.ctgapp.activity.mine.client

import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.ResultEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.SuccessDialog
import kotlinx.android.synthetic.main.activity_auth_invite.*
import kotlinx.android.synthetic.main.common_confirm_layout.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 3/30/21
 *描述: 邀请码 添加供应商 页面
 */
class AuthInviteActivity : BaseActivity() {
    private val mViewModel by lazy { ViewModelProvider(this)[AuthInviteViewModel::class.java] }

    override fun event() {
        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            mResultTV.visibility = View.VISIBLE
            mResultTV.text = it
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            dismissLoading()
            MyLog.d("邀请码申请回调:$it")
            val result = getGson().fromJson(it, ResultEntity::class.java)
            if (result.status == 0) {
//                mAuthCodeET.textSet("")
//                SuccessDialog(this,"成功添加供应商").show()
                showToast("添加供应商成功")
                startActivity<ClientManagementActivity>()

            } else {
                mResultTV.visibility = View.VISIBLE
                mResultTV.text = result.msg.handlerNull()
            }
        })
    }

    override fun click() {
        //确认
        mConfirmIncludeBTN.setOnClickListener {
            val auth = mAuthCodeET.text.handlerNull()
            if (auth.isEmpty()) {
                showToast("请输入邀请码")
            } else {
                mResultTV.visibility = View.GONE
                showLoading()
                mViewModel.invite(auth)
            }
            MyLog.d("确认用邀请码邀请")
        }
    }

    override fun getLayout() = R.layout.activity_auth_invite
}