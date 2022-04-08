package com.android.ctgapp.activity.mine.setting

import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.initData
import com.android.ctgapp.util.showToast
import kotlinx.android.synthetic.main.activity_change_password.*
import org.jetbrains.anko.imageResource

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述:修改密码 页面
 */
class ChangePasswordActivity : BaseActivity() {
    private var showOldPassword = true
    private var showNewPassword = true
    private var showConfirmPassword = true

    private val mViewModel: ChangePasswordViewModel by lazy { ViewModelProvider(this)[ChangePasswordViewModel::class.java] }

    override fun event() {
        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mViewModel.changeResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("修改密码:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("修改成功")
                finish()
            } else {
                showToast(data.msg)
            }
        })
    }

    override fun click() {
        //旧密码眼睛
        mOldPasswordIV.setOnClickListener {
            showOldPassword = !showOldPassword
            mOldPasswordIV.imageResource = if (showOldPassword) R.drawable.icon_eye_blue else R.drawable.icon_eye_gray
            mOldPasswordET.transformationMethod= if (showOldPassword) PasswordTransformationMethod.getInstance() else HideReturnsTransformationMethod.getInstance()
        }
        //新密码眼睛
        mNewPasswordIV.setOnClickListener {
            showNewPassword = !showNewPassword
            mNewPasswordIV.imageResource = if (showNewPassword) R.drawable.icon_eye_blue else R.drawable.icon_eye_gray
            mNewPasswordET.transformationMethod= if (showNewPassword) PasswordTransformationMethod.getInstance() else HideReturnsTransformationMethod.getInstance()
        }
        //确认密码眼睛
        mConfirmPasswordIV.setOnClickListener {
            showConfirmPassword = !showConfirmPassword
            mConfirmPasswordIV.imageResource = if (showConfirmPassword) R.drawable.icon_eye_blue else R.drawable.icon_eye_gray
            mConfirmPasswordET.transformationMethod= if (showConfirmPassword) PasswordTransformationMethod.getInstance() else HideReturnsTransformationMethod.getInstance()
        }

        //确认修改
        mConfirmBTN.setOnClickListener {
            val old = mOldPasswordET.text.toString()
            val new = mNewPasswordET.text.toString()
            val newConfirm = mConfirmPasswordET.text.toString()
            when {
                old.isEmpty() -> showToast("请输入旧密码")
                new.isEmpty() -> showToast("请输入新密码")
                newConfirm.isEmpty() -> showToast("请再次输入新密码")
                new != newConfirm -> showToast("输入的两次新密码不一致")
                else -> {
                    loading.show()
                    mViewModel.updatePassword(old, new)
                }
            }
        }
    }

    override fun getLayout() = R.layout.activity_change_password

}