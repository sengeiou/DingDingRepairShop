package com.android.ctgapp.activity.mine.friend

import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.company.MyCompanyViewModel
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.CompanyDetailEntity
import com.android.ctgapp.enum.getShowName
import com.android.ctgapp.util.*
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_friend_company.*

/**
 * 作者:LiBW
 * 创建日期: 2/20/21
 * 描述: 商友的企业 页面 (废弃)
 */
class FriendCompanyActivity : BaseActivity() {
    private val mViewModel: MyCompanyViewModel by lazy { ViewModelProvider(this)[MyCompanyViewModel::class.java] }
    private val companyId by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, -1) }


    override fun event() {
        if (companyId==-1){
            showToast("抱歉企业不存在")
            finish()
        }else{
            mViewModel.getCompanyDetail(companyId)
        }
        //公司详情回调
        mViewModel.companyDetailResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("公司详情:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, CompanyDetailEntity::class.java).data
                entity?.let { result ->
                    mCompanyNameTV.text = result.orgname.handlerNull()
                    val industry=getShowName(result.industry.handlerNull())
                    if (industry.isEmpty()){
                        mIndustryTV.visibility= View.GONE
                    }else{
                        mIndustryTV.visibility= View.VISIBLE
                        mIndustryTV.text = industry
                    }
                    mCompanyPhoneTV.text = result.phone.handlerNull()
                    mCompanyEmailTV.text = result.email.handlerNull()
                    mCompanyUrlTV.text = result.websiteUrl.handlerNull()
                    var scale = ""
                    when (result.employeeScale.handlerNull()) {
                        "1" -> scale = "0-20人"
                        "2" -> scale = "21-50人"
                        "3" -> scale = "51-100人"
                        "4" -> scale = "100人以上"
                    }
                    mCompanySizeTV.text = scale
                    val address = "${result.province.handlerNull()} ${result.city.handlerNull()} ${result.district.handlerNull()} ${result.address.handlerNull()}"

                    mCompanyAddressTV.text = address
                    val logo = ossHeader + result.logo.handlerNull()
                    Glide.with(this).load(logo).
                        placeholder(R.drawable.defaulthead)
                        .error(R.drawable.defaulthead)
                    .into(mCompanyIV)
                }
            } else {
                showToast(data.msg)
            }
        })
    }

    override fun click() {

    }

    override fun getLayout() = R.layout.activity_friend_company

}