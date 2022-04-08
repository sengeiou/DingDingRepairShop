package com.android.ctgapp.activity.mine.company

import android.os.Handler
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.company.SwitchCompanyViewModel
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.LoginEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_join_company_by_code.*
import org.jetbrains.anko.startActivity
import org.json.JSONObject

/**
 *作者:LiBW
 *创建日期: 12/22/20
 *描述: 邀请码加入公司 页面
 */
class JoinCompanyByCodeActivity : BaseActivity() {
    private val mViewModel: JoinCompanyByCodeViewModel by lazy { ViewModelProvider(this)[JoinCompanyByCodeViewModel::class.java] }
    private val mChangeCompanyViewModel: SwitchCompanyViewModel by lazy { ViewModelProvider(this)[SwitchCompanyViewModel::class.java] }

    private val handler = Handler()
    override fun event() {
        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            dismissLoading()
            MyLog.d("邀请码加入公司回调:$it")
            val json = JSONObject(it)
            val code = json.getInt("status")
            if (code == 0) {
                mJoinFailTV.visibility = View.GONE
                mJoinSuccessIV.visibility = View.VISIBLE
                //如果用户当前没有公司则自动切换为当前公司
                if (BaseApplication.companyId == 0) {
                    val companyId = json.getInt("data")
                    MyLog.d("我要去切换公司了公司ID:$companyId")
                    // 获取到之后 切换公司
                    mChangeCompanyViewModel.changeCompany(companyId)
                }
            } else {
                mJoinFailTV.text=json.getString("msg")
                mJoinFailTV.visibility = View.VISIBLE
                mJoinSuccessIV.visibility = View.GONE
            }
            //三秒后隐藏邀请码
            handler.postDelayed({
                mJoinSuccessIV.visibility = View.GONE
            }, 3000)
        })

        mChangeCompanyViewModel.companyChangeResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("公司切换回调:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, LoginEntity::class.java)
                entity?.data?.let { loginEntity ->
                    //配置只有修理厂可以登录app
                    if (loginEntity.industryCode.handlerNull() == "REPAIRSHOP" || loginEntity.industry.handlerNull() == "修理厂") {
                        DataUtil.handlerLoginData(it)
//                        showToast("切换成功")
//                        startActivity<MainActivity>(MyConstants.FROM_LOGIN to true)
//                        finish()
                    } else {
                        showToast("抱歉你加入的公司不是修理厂,无法选定为当前公司")
                    }
                }
            }
        })

    }

    override fun click() {
        //提交
        mApplyBTN.setOnClickListener {
            val code = mCodeET.text.toString()
            if (code.isEmpty()) {
                showToast("请输入邀请码")
            } else {
                showLoading()
                mViewModel.joinCompany(code)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }

    override fun getLayout() = R.layout.activity_join_company_by_code


}