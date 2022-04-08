package com.android.ctgapp.activity.login

import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.company.CreateCompanyActivity
import com.android.ctgapp.activity.company.CreateCompanyViewModel
import com.android.ctgapp.activity.company.JoinCompanyActivity
import com.android.ctgapp.activity.company.SwitchCompanyViewModel
import com.android.ctgapp.activity.mine.company.JoinCompanyByCodeViewModel
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityCreateCompanyAfterRegisterBinding
import com.android.ctgapp.entity.LoginEntity
import com.android.ctgapp.entity.UserInfoEntity
import com.android.ctgapp.util.*
import com.bumptech.glide.Glide
import okhttp3.MediaType
import okhttp3.RequestBody
import org.jetbrains.anko.startActivity
import org.json.JSONObject

/**
 *作者:LiBW
 *创建日期: 12/22/20
 *描述: 注册和创建选择页面 只有当前没有企业会进入
 */
class CreateOrJoinCompanyActivity : BaseActivityV2() {

    private val mBinding by lazy { ActivityCreateCompanyAfterRegisterBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    private val mViewModel: JoinCompanyByCodeViewModel by lazy { ViewModelProvider(this)[JoinCompanyByCodeViewModel::class.java] }
    private val mChangeCompanyViewModel: SwitchCompanyViewModel by lazy { ViewModelProvider(this)[SwitchCompanyViewModel::class.java] }
    private val mDriverViewModel: CreateCompanyViewModel by lazy { ViewModelProvider(this)[CreateCompanyViewModel::class.java] }
    private var name =""
    private var phone =""

    override fun onResume() {
        super.onResume()
        if (BaseApplication.companyId != 0) {
            startActivity<MainActivity>()
            finish()
        }
    }

    override fun event() {
        //只有汽修钉钉允许车主端登录
        mBinding.mDriverCV.visibility=if (BuildConfig.APPLICATION_ID=="com.ctgoe.app.hqp") View.VISIBLE else View.GONE


        name=intent.getStringExtra(MyConstants.NAME).handlerNull()
        phone=intent.getStringExtra(MyConstants.PHONE).handlerNull()
        //传过来的用户姓名和电话号码
        mBinding.mUserNameTV.text = name
        mBinding.mPhoneNumTV.text = phone

        if (name.handlerNull().isEmpty()) {
            //如果没有携带信息过来则自己去获取
            mViewModel.getUserInfo()
        }
        mViewModel.userInfoResult.observe(this, {
            MyLog.d("获取用户信息回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, UserInfoEntity::class.java).data
                data?.let {
                    //个人信息数据
                   name = data.realName.handlerNull()
                    val mImage = data.imageUrl.handlerNull()
                    phone = data.telephone.handlerNull()
                    mBinding.mUserNameTV.text = name
                    mBinding.mPhoneNumTV.text = phone
                    Glide.with(this).load(ossHeader + mImage)
                        .error(R.drawable.defaulthead)
                        .placeholder(R.drawable.defaulthead)
                        .into(mBinding.niceImageView)
                }
            }
        })

        mViewModel.result.observe(this, {
            dismissLoading()
            MyLog.d("邀请码加入公司回调:$it")
            val json = JSONObject(it)
            val code = json.getInt("status")
            if (code == 0) {
                val companyId = json.getInt("data")
                // 获取到之后 切换公司
                mChangeCompanyViewModel.changeCompany(companyId)
            } else {
                val msg = json.getString("msg")
                showToast(msg)
            }
        })

        mChangeCompanyViewModel.companyChangeResult.observe(this, {
            dismissLoading()
            MyLog.d("公司切换回调:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, LoginEntity::class.java)
                entity?.data?.let { loginEntity ->
                    //配置只有修理厂可以登录app
                    if (loginEntity.industryCode.handlerNull() == "REPAIRSHOP" || loginEntity.industry.handlerNull() == "修理厂") {
                        DataUtil.handlerLoginData(it)
                        showToast("操作成功")
                        startActivity<MainActivity>(MyConstants.FROM_LOGIN to true)
                        finish()
                    } else {
                        showToast("目前仅支持修理厂登录")
                    }
                }
            }
        })

        //我是车主回调
        mDriverViewModel.result.observe(this,  {
            dismissLoading()
            MyLog.d("创建公司回调:$it")
            val data = JSONObject(it)
            if (data.getInt("status") == 0) {
                MyLog.d("当前公司ID:$BaseApplication.companyId")
                MyLog.d("新公司ID:${data.getInt("data")}")
                if (BaseApplication.companyId == 0) {
                    //当前没有公司则切换公司后关闭
                    mChangeCompanyViewModel.changeCompany(data.getInt("data"))
                } else {
                    showToast("创建成功")
                    finish()
                }
            } else {
                showToast(data.getString("msg"))
            }
        })
    }

    override fun click() {
        //创建企业
        mBinding.mCreateCompanyLL.setOnClickListener {
            startActivity<CreateCompanyActivity>()
        }
        //加入企业
        mBinding.mJoinCompanyLL.setOnClickListener {
            startActivity<JoinCompanyActivity>()
        }
        //我是车主
        mBinding.mImDriverLL.setOnClickListener {
            val companyName =  phone+name
//            val address = binding.mAddressDetailTV.text.handlerNull()
//            val email = binding.mEmailET.text.handlerNull()
//            val url = binding.mUrlET.text.handlerNull()
//            val intro = binding.mIntroET.text.handlerNull()

            when {
//                phone.isNotEmpty() && !phoneNumCheck(phone) -> showToast("请输入正确的电话号码")
//                companyName.isEmpty() -> showToast("请输入企业名称")
//                address.isEmpty() -> showToast("请输入详细地址")
//                mProvince.isEmpty() || mCity.isEmpty() || mDistrict.isEmpty() -> showToast("请选择地址")
                else -> {
                    //行业属性固定值 REPAIRSHOP 修理厂
                    val map = HashMap<String, Any>()
                    map["orgname"] = companyName
                    //固定值 修理厂
                    map["industry"] = "REPAIRSHOP"
//                   map["phone"] = phone
                    val body = RequestBody.create(
                        MediaType.parse("application/json; charset=utf-8"),
                        getGson().toJson(map)
                    )
                    showLoading()
                    mDriverViewModel.createCompany(body)
                }
            }

        }
    }

    override fun onBackPressed() {
        startActivity<LoginActivity>()
        finish()
    }
}