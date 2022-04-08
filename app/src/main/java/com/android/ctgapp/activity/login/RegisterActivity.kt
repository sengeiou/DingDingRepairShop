package com.android.ctgapp.activity.login

import android.os.CountDownTimer
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.LoginEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.mAuthCodeCountDownTV
import kotlinx.android.synthetic.main.activity_register.mAuthCodeET
import kotlinx.android.synthetic.main.activity_register.mBackIV
import kotlinx.android.synthetic.main.activity_register.mConfirmBTN
import kotlinx.android.synthetic.main.activity_register.mPasswordAgainET
import kotlinx.android.synthetic.main.activity_register.mPasswordET
import kotlinx.android.synthetic.main.activity_register.mPhoneNumberET
import kotlinx.android.synthetic.main.activity_register.mUserAgreementLL
import okhttp3.MediaType
import okhttp3.RequestBody
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource
import kotlin.math.roundToInt

/**
 *作者:LiBW
 *创建日期: 12/22/20
 *描述: 注册 页面
 */
class RegisterActivity : BaseActivity() {
    private val mViewModel: RegisterViewModel by lazy { ViewModelProvider(this)[RegisterViewModel::class.java] }
    private var mName = ""
    private var mPhone = ""
    private var mPassword = ""


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
            if (data.status == 0) {
                //验证码没问题则开始倒计时
                mAuthCodeCountDownTV.isEnabled = false
                mAuthCodeCountDownTV.textColorResource = R.color.gray_text
                countTimer.start()
            }
            showToast(data.msg)
        })
        mViewModel.confirmResult.observe(this, {
            loading.dismiss()
            MyLog.d("注册回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                //注册成功后调用 登录接口获取token等相关信息
                mViewModel.loginByPassword(mPhone, mPassword)
            } else {
                showToast(data.msg)
            }
        })

        mViewModel.loginResult.observe(this, Observer { result ->
            loading.dismiss()
            MyLog.d("注册成功后的登录回调:$result")
            val data = initData(result)
            if (data.status == 0) {
                val entity = getGson().fromJson(result, LoginEntity::class.java)
                entity?.data?.let { loginEntity ->
                    //判断用户是否有公司
                    if (entity.data?.companyId == null || entity.data?.companyId == 0) {
                        startActivity<CreateOrJoinCompanyActivity>(
                            MyConstants.NAME to mName,
                            MyConstants.PHONE to mPhone
                        )
                        BaseApplication.userToken = loginEntity.token.handlerNull()
                        finish()
                        return@Observer
                    }

                    //配置只有修理厂可以登录app
                    if (loginEntity.industry.handlerNull() == "REPAIRSHOP" || loginEntity.industryCode.handlerNull() == "修理厂") {
                        DataUtil.handlerLoginData(result)
                        startActivity<MainActivity>()
                        finish()
                    } else {
                        showToast("目前仅支持修理厂登录")
                    }
                }
            } else {
                showToast(data.msg)
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
                    loading.show()
                    mViewModel.getAuthCode(phone)
                }
            }
        }
        //用户协议
        mUserAgreementLL.setOnClickListener {
            startActivity<UserAgreementActivity>()
        }


        //确认
        mConfirmBTN.setOnClickListener {
            val userName = mUserNameTV.text.handlerNull()
            val phone = mPhoneNumberET.text.handlerNull()
            val authCode = mAuthCodeET.text.handlerNull()
            val password = mPasswordET.text.handlerNull()
            val passwordAgain = mPasswordAgainET.text.handlerNull()
            when {
                !mReadCB.isChecked -> showToast("请同意用户协议")
                userName.isEmpty() -> showToast("请输入姓名")
                !phoneNumCheck(phone) -> showToast("请输入正确的手机号码")
                phone.length < 11 -> showToast("请输入完整的手机号码")
                mAuthCodeCountDownTV.text == "获取验证码" -> showToast("请先获取验证码")
                authCode.isEmpty() -> showToast("请输入验证码")
                authCode.length < 4 -> showToast("请输入完整的验证码")
                password.isEmpty() -> showToast("请输入新密码")
                password != passwordAgain -> showToast("两次输入的密码不一致")
                else -> {
                    mName = userName
                    mPhone = phone
                    mPassword = password
                    val map = HashMap<String, Any>()
                    map["realName"] = userName
                    map["telephone"] = phone
                    map["password"] = handlerPassword(password)
                    map["code"] = authCode
                    map["industry"] = "REPAIRSHOP"
                    val body = RequestBody.create(
                        MediaType.parse("application/json; charset=utf-8"),
                        getGson().toJson(map)
                    )
                    showLoading()
                    mViewModel.userRegister(body)
                }
            }
        }
    }

    override fun getLayout() = R.layout.activity_register

    override fun onDestroy() {
        super.onDestroy()
        countTimer.cancel()
    }
}