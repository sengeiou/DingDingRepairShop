package com.android.ctgapp.activity.login

import android.os.CountDownTimer
import android.text.Editable
import android.text.method.HideReturnsTransformationMethod
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.TranslateAnimation
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.base.AppManager
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityLoginBinding
import com.android.ctgapp.entity.LoginEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.CustomToast
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource
import kotlin.math.roundToInt


/**
 *作者:LiBW
 *创建日期: 2020/9/30
 *描述: 登录 页面
 * 仅仅判断登录是否过期
 * 如果登录没有过期则进入主页
 */
class LoginActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    //默认验证码登录
    private var authCodeType = true
    private val mViewModel: LoginViewModel by lazy { ViewModelProvider(this)[LoginViewModel::class.java] }
    //密码框光标位置
    private var indexPosition=0
    //获取验证码倒计时
    private val countTimer = object : CountDownTimer(61000, 1000) {
        override fun onFinish() {
            mBinding.mAuthCodeCountDownTV.isEnabled = true
            mBinding.mAuthCodeCountDownTV.text = "重新获取"
            mBinding.mAuthCodeCountDownTV.textColorResource = R.color.colorAccent
        }

        override fun onTick(millisUntilFinished: Long) {
            val text = "${((millisUntilFinished.toDouble() / 1000).roundToInt() - 1)}秒"
            mBinding.mAuthCodeCountDownTV.text = text
        }
    }

    //验证码登录和密码登录切换的效果
    private val toLeft = TranslateAnimation(0f, -800f, 0f, 0f)
    private val toRight = TranslateAnimation(0f, 800f, 0f, 0f)
    private val fromRight = TranslateAnimation(800f, 0f, 0f, 0f)
    private val fromLeft = TranslateAnimation(-800f, 0f, 0f, 0f)
    private val toMiss = AlphaAnimation(1f, 0f)
    private val toShow = AlphaAnimation(0f, 1f)
    private var showPassword = false


    override fun event() {
        val time = 100L
        toLeft.duration = time
        fromRight.duration = time
        toRight.duration = time
        fromLeft.duration = time
        toMiss.duration = time
        toShow.duration = time
        //TODO 填写手机号码
        var phone = "18312345678"
         phone = "13921191334"
        val password = "123456"
        if (BoWenUtils.isDEBUG()) {
            mBinding.mPhoneNumberET.text = Editable.Factory.getInstance().newEditable(phone)
            mBinding.mPasswordET.text = Editable.Factory.getInstance().newEditable(password)
        }
        //处理登录类型(验证码/账号密码)
        handlerLoginType()
        mViewModel.error.observe(this, {
            loading.dismiss()
            showToast(it)
        })
        mViewModel.authCodeResult.observe(this, {
            loading.dismiss()
            MyLog.d("验证码回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                //验证码发送后开始倒计时
                mBinding.mAuthCodeCountDownTV.isEnabled = false
                mBinding.mAuthCodeCountDownTV.textColorResource = R.color.gray_text
                countTimer.start()
                showToast("验证码发送成功")
            } else {
                showToast(data.msg)
            }
        })
        mViewModel.loginResult.observe(this, Observer { result ->
            loading.dismiss()
            MyLog.d("登录回调:$result")
            val data = initData(result)
            if (data.status == 0) {
                val entity = getGson().fromJson(result, LoginEntity::class.java)
                entity?.data?.let { loginEntity ->
                    //判断用户是否有公司 没有公司进入创建企业页面
                    if (entity.data?.companyId == null || entity.data?.companyId == 0) {
                        startActivity<CreateOrJoinCompanyActivity>(
                            MyConstants.NAME to entity.data?.realName.handlerNull(),
                            MyConstants.PHONE to entity.data?.telephone.handlerNull()
                        )
                        BaseApplication.userToken = loginEntity.token.handlerNull()
                        finish()
                        return@Observer
                    }
                    MyLog.d(5)
                    //配置只有修理厂可以登录app
                    if (loginEntity.industryCode.handlerNull() == "REPAIRSHOP" || loginEntity.industry.handlerNull() == "修理厂") {
                        DataUtil.handlerLoginData(result)
                        startActivity<MainActivity>(MyConstants.FROM_LOGIN to true)
                        finish()
                    } else {
                        BaseApplication.userToken = loginEntity.token.handlerNull()
                        //非修理厂用户 进入创建和加入企业页面
                        showToast("目前仅支持修理厂登录")
                        startActivity<CreateOrJoinCompanyActivity>(
                            MyConstants.NAME to entity.data?.realName.handlerNull(),
                            MyConstants.PHONE to entity.data?.telephone.handlerNull()
                        )
                    }
                }
            } else {
                showToast(data.msg)
            }
        })
    }


    //切换短信登录和验证码登录
    private fun handlerLoginType() {

        if (authCodeType) {
//            mBinding.mAuthCodeLL.startAnimation(toShow)
            mBinding.mAuthCodeLL.visibility = View.VISIBLE
//            mBinding.mPasswordET.startAnimation(toMiss)
            mBinding.mPasswordRL.visibility = View.GONE
            mBinding.mChangeLoginTypeTV.text = "账号密码登录"
            mBinding.mLoginByPasswordTV.startAnimation(toLeft)
            mBinding.mLoginByPasswordTV.visibility = View.GONE
            mBinding.mLoginByCodeTV.startAnimation(fromRight)
            mBinding.mLoginByCodeTV.visibility = View.VISIBLE
            mBinding.mForgetPasswordTV.visibility = View.GONE
        } else {
//            mBinding.mAuthCodeLL.startAnimation(toMiss)
            mBinding.mAuthCodeLL.visibility = View.GONE
//            mBinding.mPasswordET.startAnimation(toShow)
            mBinding.mPasswordRL.visibility = View.VISIBLE
            mBinding.mChangeLoginTypeTV.text = "验证码登录"
            mBinding.mLoginByCodeTV.startAnimation(toRight)
            mBinding.mLoginByCodeTV.visibility = View.GONE
            mBinding.mLoginByPasswordTV.startAnimation(fromLeft)
            mBinding.mLoginByPasswordTV.visibility = View.VISIBLE
            mBinding.mForgetPasswordTV.visibility = View.VISIBLE
        }
    }

    override fun click() {
        //切换登录方式
        mBinding.mChangeLoginTypeTV.setOnClickListener {
            authCodeType = !authCodeType
            handlerLoginType()
        }
        //获取验证码
        mBinding.mAuthCodeCountDownTV.setOnClickListener {
            val phone = mBinding.mPhoneNumberET.text.handlerNull()
            when {
                !phone.startsWith("1") -> showToast("请输入正确的手机号码")
                phone.length < 11 -> showToast("请输入完整的手机号码")
                else -> {
                    loading.show()
                    mViewModel.getAuthCode(phone)
                }
            }
        }
        //忘记密码
        mBinding.mForgetPasswordTV.setOnClickListener {
            startActivity<ForgetPasswordActivity>()
        }

        //登录按钮
        mBinding.mLoginBTN.setOnClickListener {
            val phone = mBinding.mPhoneNumberET.text.handlerNull()
            val authCode = mBinding.mAuthCodeET.text.handlerNull()
            val password = mBinding.mPasswordET.text.handlerNull()
            if (authCodeType) {
                when {
                    !mBinding.mCheckBox.isChecked -> {
                        showToast("请确认阅读后勾选用户协议")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mUserAgreementLL)
                    }
                    !phone.startsWith("1") -> {
                        showToast("请输入正确的手机号码")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mPhoneNumberET)
                    }
                    phone.length < 11 -> {
                        showToast("请输入完整的手机号码")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mPhoneNumberET)
                    }
                    mBinding.mAuthCodeCountDownTV.text == "获取验证码" -> {
                        showToast("请先获取验证码")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mAuthCodeCountDownTV)
                    }
                    authCode.isEmpty() -> {
                        showToast("请输入验证码")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mAuthCodeET)
                    }
                    authCode.length < 4 -> {
                        showToast("请输入完整的验证码")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mAuthCodeET)
                    }
                    else -> {
                        loading.show()
                        mViewModel.loginByAuthCode(phone, authCode)
                    }
                }
            } else {
                when {
                    !mBinding.mCheckBox.isChecked -> {
                        showToast("请确认阅读后勾选用户协议")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mUserAgreementLL)
                    }
                    !phone.startsWith("1") -> {
                        showToast("请输入正确的手机号码")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mPhoneNumberET)
                    }
                    phone.length < 11 -> {
                        showToast("请输入完整的手机号码")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mPhoneNumberET)
                    }
                    password.isEmpty() -> {
                        showToast("请输入密码")
                        YoYo.with(Techniques.Shake).duration(300)
                            .repeat(0).playOn(mBinding.mPasswordET)
                    }
                    else -> {
                        loading.show()
                        mViewModel.loginByPassword(phone, password)
                    }
                }
            }
        }

        //用户协议
        mBinding.mUserAgreementTV.setOnClickListener {
            startActivity<UserAgreementActivity>()
        }
        //点击整体 默认操作为点击CheckBox
        mBinding.mUserAgreementLL.setOnClickListener {
            mBinding.mCheckBox.performClick()
        }

        mBinding.mXia.setOnClickListener {
            mViewModel.loginByPassword("18206198888", "000")
        }
        //注册功能
        mBinding.mRegisterTV.setOnClickListener {
            startActivity<RegisterActivity>()
        }
        //明文展示密码框
        mBinding.mPasswordShowET.transformationMethod= HideReturnsTransformationMethod.getInstance()
        //展示密码
        mBinding.mShowPasswordIV.setOnClickListener {
            showPassword = !showPassword
            if (showPassword) {
                mBinding.mPasswordET.visibility = View.GONE
                YoYo.with(Techniques.RotateIn).duration(300)
                    .repeat(0).playOn(mBinding.mShowPasswordIV)
                mBinding.mPasswordShowET.visibility = View.VISIBLE
                mBinding.mShowPasswordIV.imageResource = R.drawable.icon_eye_open
                mBinding.mPasswordShowET.requestFocus()
                mBinding.mPasswordShowET.setSelection(indexPosition)
            } else {
                mBinding.mPasswordShowET.visibility = View.GONE
                YoYo.with(Techniques.RotateIn).duration(300)
                    .repeat(0).playOn(mBinding.mShowPasswordIV)
                mBinding.mPasswordET.visibility = View.VISIBLE
                mBinding.mShowPasswordIV.imageResource = R.drawable.icon_eye_close
                mBinding.mPasswordET.requestFocus()
                mBinding.mPasswordET.setSelection(indexPosition)
            }
            MyLog.d("位置:$indexPosition")
        }
        mBinding.mPasswordShowET.handlerText {
            if (showPassword) {
                mBinding.mPasswordET.textSet(it)
                indexPosition=mBinding.mPasswordShowET.selectionStart
                MyLog.d("位置:${mBinding.mPasswordShowET.selectionStart}")
            }
        }
        mBinding.mPasswordET.handlerText {
            if (!showPassword) {
                mBinding.mPasswordShowET.textSet(it)
                indexPosition=mBinding.mPasswordET.selectionStart
                MyLog.d("位置:${mBinding.mPasswordET.selectionStart}")
            }
        }
    }

    override fun onDestroy() {
        countTimer.cancel()
        super.onDestroy()
    }

    override fun onBackPressed() {
        exitApp()
    }

    private fun exitApp() {
        val currentTime = System.currentTimeMillis()
        //两次点击间隔小于2秒可以退出
        if (currentTime - nowTime < 2000) {
            AppManager.instance.exitApp(this)
        } else {
            CustomToast.showToast(this, "再次点击退出")
        }
        nowTime = currentTime
    }
}