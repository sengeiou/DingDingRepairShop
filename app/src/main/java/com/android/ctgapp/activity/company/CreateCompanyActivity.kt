package com.android.ctgapp.activity.company

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityCreateCompanyBinding
import com.android.ctgapp.entity.CityEntity
import com.android.ctgapp.entity.LoginEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.CitySelectDialog
import kotlinx.android.synthetic.main.activity_create_company.*
import kotlinx.android.synthetic.main.activity_create_company.mAddressSelectLL
import kotlinx.android.synthetic.main.activity_create_company.mCompanySizeTV
import kotlinx.android.synthetic.main.activity_create_company.mConfirmBTN
import kotlinx.android.synthetic.main.activity_create_company.mSizePoint
import kotlinx.android.synthetic.main.item_team_size_select_popupwindow.view.*
import okhttp3.MediaType
import okhttp3.RequestBody
import org.jetbrains.anko.startActivity
import org.json.JSONObject

/**
 *作者:LiBW
 *创建日期: 2020/9/30
 *描述: 创建公司 创建企业 页面
 */
class CreateCompanyActivity : BaseActivityV2(), CitySelectDialog.SelectOverListener {
    val binding by lazy { ActivityCreateCompanyBinding.inflate(layoutInflater) }
    override fun getLayout() = binding.root
    private val mViewModel: CreateCompanyViewModel by lazy { ViewModelProvider(this)[CreateCompanyViewModel::class.java] }
    private val mSwitchCompanyViewModel: SwitchCompanyViewModel by lazy { ViewModelProvider(this)[SwitchCompanyViewModel::class.java] }

    //省市区
    private var mProvince = ""
    private var mCity = ""
    private var mDistrict = ""
    private lateinit var cityEntity: CityEntity
    private var citySelectDialog: CitySelectDialog? = null

    //人数选择
    private var menuPopup: PopupWindow? = null

    //规模
    private var mSize = 0

    override fun event() {
        cityEntity = getGson().fromJson(getParentMenuCode(), CityEntity::class.java)
        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mSwitchCompanyViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            dismissLoading()
            MyLog.d("创建公司回调:$it")
            val data = JSONObject(it)
            if (data.getInt("status") == 0) {
                MyLog.d("当前公司ID:$BaseApplication.companyId")
                MyLog.d("新公司ID:${data.getInt("data")}")
                if (BaseApplication.companyId == 0) {
                    //当前没有公司则切换公司后关闭
                    mSwitchCompanyViewModel.changeCompany(data.getInt("data"))
                } else {
                    showToast("创建成功")
                    finish()
                }
            } else {
                showToast(data.getString("msg"))
            }
        })
        mSwitchCompanyViewModel.companyChangeResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("公司切换回调:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, LoginEntity::class.java)
                entity?.data?.let { loginEntity ->
                    //配置只有修理厂可以登录app
                    if (loginEntity.industryCode.handlerNull() == "REPAIRSHOP" || loginEntity.industry.handlerNull() == "修理厂") {
                        DataUtil.handlerLoginData(it)
                        showToast("切换成功")
                        startActivity<MainActivity>()
                        finish()
                    } else {
                        showToast("目前仅支持修理厂登录")
                    }
                }
            }
        })
    }


    @SuppressLint("InflateParams")
    override fun click() {
        //地址选择器
        binding.mAddressSelectLL.setOnClickListener {
            if (citySelectDialog == null) {
                citySelectDialog = CitySelectDialog(cityEntity, this)
            }
            if (!citySelectDialog!!.isAdded) {
                citySelectDialog!!.show(supportFragmentManager, "")
            }
        }

        //确定提交
        binding.mConfirmBTN.setOnClickListener {
            val companyName = binding.mCompanyNameTV.text.handlerNull()
            val address = binding.mAddressDetailTV.text.handlerNull()
            val email = binding.mEmailET.text.handlerNull()
            val url = binding.mUrlET.text.handlerNull()
            val phone = binding.mPhoneET.text.handlerNull()
            val intro = binding.mIntroET.text.handlerNull()
            //激活码
            val activationCode = mActivationCodeET.text.handlerNull()

            when {
                phone.isNotEmpty() && !phoneNumCheck(phone) -> showToast("请输入正确的电话号码")
                companyName.isEmpty() -> showToast("请输入企业名称")
                address.isEmpty() -> showToast("请输入详细地址")
                mProvince.isEmpty() || mCity.isEmpty() || mDistrict.isEmpty() -> showToast("请选择地址")
                else -> {
                    //行业属性固定值 REPAIRSHOP 修理厂
                    val map = HashMap<String, Any>()
                    map["orgname"] = companyName
                    //固定值 修理厂
                    map["industry"] = "REPAIRSHOP"
                    map["province"] = mProvince
                    map["city"] = mCity
                    map["district"] = mDistrict
                    map["address"] = address
                    map["employeeScale"] = mSize
                    map["spreadCode"] = activationCode

                    if (email.isNotEmpty()) map["email"] = email
                    if (url.isNotEmpty()) map["websiteUrl"] = url
                    if (phone.isNotEmpty()) map["phone"] = phone
                    if (intro.isNotEmpty()) map["remark"] = intro
                    val body = RequestBody.create(
                        MediaType.parse("application/json; charset=utf-8"),
                        getGson().toJson(map)
                    )
                    showLoading()
                    mViewModel.createCompany(body)
                }
            }
        }

        //选择规模
        binding.mCompanySizeTV.setOnClickListener {
            val menuView = LayoutInflater.from(this).inflate(R.layout.item_team_size_select_popupwindow, null, false)
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.marginEnd = 30f.toPx(this)
            menuView.layoutParams = params
            menuPopup = PopupWindow(menuView, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, true)
            //设置背景透
            menuPopup?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            menuPopup?.showAsDropDown(mSizePoint)
            menuView.mTeam1.setOnClickListener {
                mSize = 1
                mCompanySizeTV.text = menuView.mTeam1.text.toString()
                menuPopup?.dismiss()
            }
            menuView.mTeam2.setOnClickListener {
                mSize = 2
                mCompanySizeTV.text = menuView.mTeam2.text.toString()
                menuPopup?.dismiss()
            }
            menuView.mTeam3.setOnClickListener {
                mSize = 3
                mCompanySizeTV.text = menuView.mTeam3.text.toString()
                menuPopup?.dismiss()
            }
            menuView.mTeam4.setOnClickListener {
                mSize = 4
                mCompanySizeTV.text = menuView.mTeam4.text.toString()
                menuPopup?.dismiss()
            }
        }
    }


    override fun onSelectOver(province: String, city: String, district: String) {
        mProvince = province
        mCity = city
        mDistrict = district
        val select = "$province $city $district"
        binding.mAddressTV.text = select
    }

    override fun closeSelect() {
        MyLog.d("关闭了")
        mProvince = ""
        mCity = ""
        mDistrict = ""
        binding.mAddressTV.text = "所在地区"
    }

    override fun onDestroy() {
        super.onDestroy()
        menuPopup = null
        citySelectDialog = null
    }
}