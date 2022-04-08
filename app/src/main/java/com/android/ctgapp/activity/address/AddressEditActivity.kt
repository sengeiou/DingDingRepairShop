package com.android.ctgapp.activity.address

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityAddressEditBinding
import com.android.ctgapp.entity.AddressEntity
import com.android.ctgapp.entity.CityEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.CitySelectDialog


/**
 *作者:LiBW
 *创建日期: 2020/11/10
 *描述:添加 修改 收货地址 页面
 */
class AddressEditActivity : BaseActivityV2(), CitySelectDialog.SelectOverListener {
    val mBinding by lazy { ActivityAddressEditBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mViewModel: AddressEditViewModel by lazy { ViewModelProvider(this)[AddressEditViewModel::class.java] }

    private var mProvince = ""
    private var mCity = ""
    private var mDistrict = ""
    private var addressId = ""
    private var isDefault = false
    private lateinit var cityEntity: CityEntity
    private val citySelectDialog: CitySelectDialog by lazy { CitySelectDialog(cityEntity, this) }

    override fun event() {
        cityEntity = getGson().fromJson(getParentMenuCode(), CityEntity::class.java)
        val addressJson = intent.getStringExtra(MyConstants.ENTITY)
        addressJson?.let {
            val data = getGson().fromJson(it, AddressEntity.DataBean::class.java)
            addressId = data.id.handlerNull()
            mProvince = data.province.handlerNull()
            mCity = data.city.handlerNull()
            mDistrict = data.district.handlerNull()
            mBinding.mNameTV.textSet(data.deliveryName)
            mBinding.mPhoneET.textSet(data.deliveryPhone)
            val address = "$mProvince $mCity $mDistrict"
            mBinding.mAddressSelectTV.text = address
            mBinding.mAddressDetailET.textSet(data.detailAddress)
            isDefault = data.isDefault
            if (isDefault) mBinding.mSetDefaultCB.isChecked=true
        }

        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            loading.dismiss()
            MyLog.d("通用回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("操作成功")
                finish()
            } else {
                showToast(data.msg)
            }
        })
    }

    override fun click() {
        //设为默认
        mBinding.mSetDefaultLL.setOnClickListener {
            mBinding.mSetDefaultCB.performClick()
        }



        //地址选择器
        mBinding.mAddressSelectTV.setOnClickListener {
            if (!citySelectDialog.isAdded) {
                citySelectDialog.show(supportFragmentManager, "")
            }
        }
        //保存
        mBinding.mSaveBTN.setOnClickListener {
            val name = mBinding.mNameTV.text.handlerNull()
            val phone = mBinding.mPhoneET.text.handlerNull()
            val detailAddress = mBinding.mAddressDetailET.text.handlerNull()
            when {
                name.isEmpty() -> showToast("请填写姓名")
                phone.isEmpty() -> showToast("请填写手机号码")
                phone.length < 11 -> showToast("请输入完整的手机号")
                !phoneNumCheck(phone) -> showToast("手机号码有误")
                mProvince.isEmpty() -> showToast("请选择省份")
                mCity.isEmpty() -> showToast("请选择城市")
                mDistrict.isEmpty() -> showToast("请选择地区")
                detailAddress.isEmpty() -> showToast("请填写详细地址")
                else -> {
                    val default=if (mBinding.mSetDefaultCB.isChecked) 1 else 0
                    MyLog.d("设置为默认了么:$default")
                    val body = handlerBody(
                        "province" to mProvince,
                        "city" to mCity,
                        "district" to mDistrict,
                        "detailAddress" to detailAddress,
                        "deliveryName" to name,
                        "deliveryPhone" to phone,
                        "isDefault" to default,
                    )
                    loading.show()
                    if (addressId.isEmpty()) {
                        mViewModel.createAddress(body)
                    } else {
                        mViewModel.updateAddress(addressId, body)
                    }
                }
            }
        }
    }


    override fun onSelectOver(province: String, city: String, district: String) {
        mProvince = province
        mCity = city
        mDistrict = district
        val select = "$province $city $district"
        mBinding.mAddressSelectTV.text = select
        citySelectDialog.dismiss()
    }

    override fun closeSelect() {
        mProvince = ""
        mCity = ""
        mDistrict = ""
        mBinding.mAddressSelectTV.text = "所在地区"
    }
}