package com.android.ctgapp.activity.login

import android.os.CountDownTimer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.util.handlerData
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.initData
import com.android.ctgapp.util.showToast
import kotlinx.android.synthetic.main.activity_forget_password.*
import kotlinx.android.synthetic.main.activity_forget_password.mAuthCodeCountDownTV
import kotlinx.android.synthetic.main.activity_forget_password.mPhoneNumberET
import org.jetbrains.anko.textColorResource
import kotlin.math.roundToInt

/**
 *作者:LiBW
 *创建日期: 2020/10/9
 *描述:忘记密码页面
 */
class ForgetPasswordActivity : BaseActivity() {
    private val mViewModel: ForgetPasswordViewModel by lazy { ViewModelProvider(this)[ForgetPasswordViewModel::class.java] }
    private val countTimer = object : CountDownTimer(61000, 1000) {
        override fun onFinish() {
            mAuthCodeCountDownTV.isEnabled = true
            mAuthCodeCountDownTV.text = "重新获取"
            mAuthCodeCountDownTV.textColorResource = R.color.colorAccent
        }

        override fun onTick(millisUntilFinished: Long) {
            val text = "${((millisUntilFinished.toDouble() / 1000).roundToInt() - 1)}秒"
            mAuthCodeCountDownTV.text = text
        }
    }

    override fun event() {
        mViewModel.error.observe(this, {
            loading.dismiss()
            showToast(it)
        })
        mViewModel.authCodeResult.observe(this, {
            loading.dismiss()
            val data = initData(it)
            showToast(data.msg)
        })
        mViewModel.confirmResult.observe(this, {
            loading.dismiss()
            handlerData(it){
                showToast("修改成功")
                finish()
            }


            val data = initData(it)

            if (data.status == 0) {
                finish()
            }
        })
    }

    override fun click() {
        mBackIV.setOnClickListener {
            finish()
        }
        //获取验证码
        mAuthCodeCountDownTV.setOnClickListener {
            val phone = mPhoneNumberET.text.handlerNull()
            when {
                !phone.startsWith("1") -> showToast("请输入正确的手机号码")
                phone.length < 11 -> showToast("请输入完整的手机号码")
                else -> {
                    mAuthCodeCountDownTV.isEnabled = false
                    mAuthCodeCountDownTV.textColorResource = R.color.gray_text
                    countTimer.start()
                    loading.show()
                    mViewModel.getAuthCode(phone)
                }
            }
        }
        //确认
        mConfirmBTN.setOnClickListener {
            val phone = mPhoneNumberET.text.handlerNull()
            val authCode = mAuthCodeET.text.handlerNull()
            val password = mPasswordET.text.handlerNull()
            val passwordAgain = mPasswordAgainET.text.handlerNull()
            when {
                !phone.startsWith("1") -> showToast("请输入正确的手机号码")
                phone.length < 11 -> showToast("请输入完整的手机号码")
                mAuthCodeCountDownTV.text == "获取验证码" -> showToast("请先获取验证码")
                authCode.isEmpty() -> showToast("请输入验证码")
                authCode.length < 4 -> showToast("请输入完整的验证码")
                password.isEmpty() -> showToast("请输入新密码")
                password != passwordAgain -> showToast("两次输入的密码不一致")
                else -> {
                    loading.show()
                    mViewModel.confirmNewPassword(phone, authCode, password)
                }
            }
        }
    }

    override fun getLayout() = R.layout.activity_forget_password

    override fun onDestroy() {
        super.onDestroy()
        countTimer.cancel()
    }
}