package com.android.ctgapp.activity.login

import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.util.MyConstants
import kotlinx.android.synthetic.main.activity_user_agreement.*
import org.jetbrains.anko.imageResource

/**
 *作者:LiBW
 *创建日期: 4/15/21
 *描述:用户协议/隐私政策 页面
 */
class UserAgreementActivity : BaseActivity() {
    //是否展示隐私协议
    private val privacy by lazy { intent.getBooleanExtra(MyConstants.PRIVACY, false) }
    override fun getLayout() = R.layout.activity_user_agreement

    override fun event() {
        if (privacy){
            mTitleBar.setTitle("隐私政策")
        }else{
            mTitleBar.setTitle("服务协议")
        }

        val resource = if (privacy) R.drawable.yinsi else R.drawable.fuwu
//        Glide.with(this).load(resource).into(mImageView)
        mImageView.imageResource = resource
    }

    override fun click() {

    }
}