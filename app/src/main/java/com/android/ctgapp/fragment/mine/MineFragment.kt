package com.android.ctgapp.fragment.mine

import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.activity.mine.setting.SettingActivity
import com.android.ctgapp.activity.company.SwitchCompanyActivity
import com.android.ctgapp.activity.message.chart.card.CardShareRecentChartActivity
import com.android.ctgapp.activity.mine.*
import com.android.ctgapp.activity.mine.alliance.MyAllianceActivity
import com.android.ctgapp.activity.mine.balance.BalanceSelectActivity
import com.android.ctgapp.activity.mine.client.ClientManagementActivity
import com.android.ctgapp.activity.mine.company.CompanyDetailActivity
import com.android.ctgapp.activity.mine.friend.BusinessFriendActivity
import com.android.ctgapp.activity.mine.money.MyMoneyPackageActivity
import com.android.ctgapp.activity.mine.team.MyTeamActivity
import com.android.ctgapp.activity.mine.whitebar.WhiteBarV2Activity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseFragment
import com.android.ctgapp.entity.chart.CardShareBean
import com.android.ctgapp.entity.CompanyDetailEntity
import com.android.ctgapp.entity.UserInfoEntity
import com.android.ctgapp.event.MineFragmentRefresh
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.CardSharedToWhereDialog
import kotlinx.android.synthetic.main.fragment_mine.*
import org.greenrobot.eventbus.Subscribe
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/9/29
 *描述: 我的 Fragment
 */
class MineFragment : BaseFragment(true) {
    override fun getLayout() = R.layout.fragment_mine
    private val mViewModel: MineFragmentViewModel by lazy { ViewModelProvider(requireActivity())[MineFragmentViewModel::class.java] }
    var userName = ""
    var userImage = ""
    var userPhone = ""

    var userId=""
    var hasloaddata=false //是否加载过数据
    @Subscribe
    fun eventBus(type:MineFragmentRefresh){
        //获取本公司详细信息
        mViewModel.getUserInfo()
        mViewModel.getCompanyDetail()
    }



    override fun event() {
        //mMyDepositCardLL.visibility=View.GONE
        mCouponLL.handlerVisibility(MyConstants.NEED_COUPON)
        //获取本公司详细信息
        mViewModel.getUserInfo()
        mViewModel.getCompanyDetail()
        val mImage = sharedGet(MyConstants.MY_IMAGE_URL, "")
        userImage = mImage.handlerNull()
        if (mImage != "") {
            Glide.with(requireActivity()).load( mImage.handlerNull().ossUrlHandler()).
                placeholder(R.drawable.defaulthead)
                . error(R.drawable.defaulthead)
            .into(niceImageView)
        }
        //公司信息回调
        mViewModel.companyDetailResult.observe(this, {
            MyLog.d("公司信息回调:$it")
            requireContext().handlerHttpResult(it) {
                val str = it.replace("\\n", "")
                val entity = getGson().fromJson(str, CompanyDetailEntity::class.java).data
                entity?.let { result ->
                    BaseApplication.inviteCode=result.invitationCode.handlerNull()
//                    //公司名和地址使用请求的数据
                    mCompanyName.text = result.orgname.handlerNull()
                    val address = "${result.province.handlerNull()}${result.city.handlerNull()}${result.district.handlerNull()}${result.address.handlerNull()}"
                    mAddressTV.text = address
                }
            }
        })
        mViewModel.error.observe(this, {
            requireActivity().showToast(it)
        })
        mViewModel.userInfoResult.observe(this, {
            MyLog.d("用户信息回调:$it")
            hasloaddata=true
            requireActivity().handlerHttpResult(it) {
                val data = getGson().fromJson(it, UserInfoEntity::class.java).data
                data?.let {
                    //个人信息数据
                    mUserNameTV.text = data.realName.handlerNull()
                    userName = data.realName.handlerNull()
                    val externalPost=if (data.externalPost.handlerNull().isEmpty()) "暂无职位" else data.externalPost.handlerNull()
                    card_yellow_text.text = externalPost
                    mPhoneNumTV.text = data.telephone.handlerNull()
                    userPhone = data.telephone.handlerNull()
                    val url = ossHeader + data.imageUrl.handlerNull()
                    userImage = url
                    sharedSave {
                        MyLog.d("将头像进行缓存")
                        putString(MyConstants.MY_IMAGE_URL, data.imageUrl.handlerNull())
                    }
                    Glide.with(requireActivity()).load(url).
                        placeholder(R.drawable.defaulthead)
                        .error(R.drawable.defaulthead)
                    .into(niceImageView)
                    //status null “未认证” : 0 “已申请” 1 “认证成功”2 “认证失败”
                    when (data.identificationStatus) {
                        1 -> {
                            mAuthIcon.visibility = View.VISIBLE
                            mAuthIcon.imageResource = R.drawable.icon_auth_on
                        }
                        else -> {
                            mAuthIcon.visibility = View.VISIBLE
                            mAuthIcon.imageResource = R.drawable.icon_auth_off
                        }
                    }
                }
            }
        })
    }

    override fun click() {
        //切换企业
        mCompanyNameLL.setOnClickListener {
            requireContext().startActivity<SwitchCompanyActivity>()
        }
        //修改个人信息
        mChangeUserInfoRL.setOnClickListener {
            requireContext().startActivity<PersonInfoChangeActivity>()
        }
        //商友
        mBusinessFriendTV.setOnClickListener {
            requireContext().startActivity<BusinessFriendActivity>()
        }
        //设置
        mSettingLL.setOnClickListener {
            requireContext().startActivity<SettingActivity>()
        }
        //关注记录
        mAttentionNotesRL.setOnClickListener {
//            requireContext().startActivity<AttentionNotesActivity>()
        }
        //分享
        mShareLL.setOnClickListener {
            requireContext().startActivity<ShareAppActivity>()
        }
        //我的企业
        mMineCompanyLL.setOnClickListener {
            requireContext().startActivity<CompanyDetailActivity>(

            )
        }
        //我的团队
        mMyTeamLL.setOnClickListener {
            requireContext().startActivity<MyTeamActivity>()
        }
        //客户管理
        mCustomerManagementLL.setOnClickListener {
            requireContext().startActivity<ClientManagementActivity>()
        }
        //我的联盟
        mMyAllianceLL.setOnClickListener {
            requireContext().startActivity<MyAllianceActivity>()
        }
        //账户余额
        mAccountBalanceLL.setOnClickListener {
            requireActivity().startActivity<BalanceSelectActivity>()
        }
        //我的白条 挂账
        mMyWhiteBarLL.setOnClickListener {
//            if (BoWenUtils.isDEBUG()){
            requireActivity().startActivity<WhiteBarV2Activity>()
//            }else{
//                requireActivity().startActivity<WhiteBarActivity>()
//            }
        }
        //优惠券
        mCouponLL.setOnClickListener {
            requireActivity().startActivity<ALLCouponsActivity>()
        }
        //我的储值卡
        mMyDepositCardLL.setOnClickListener {
            requireActivity().startActivity<MyMoneyPackageActivity>(
                MyConstants.COMPANY_ID to userId
            )
        }
        //发名片 按钮
        mSendCardTV.setOnClickListener {
            val cardBean = CardShareBean(
                userName,
                BaseApplication.userId,
                userPhone,
                BaseApplication.companyName,
                BaseApplication.companyId,
                userImage
            )
            MyLog.d("名片1:${getGson().toJson(cardBean)}")
            requireActivity().startActivity<CardShareRecentChartActivity>(
                MyConstants.USER_ID to BaseApplication.userId,
                MyConstants.CARD_INFO to getGson().toJson(cardBean)
            )
//            CardSharedToWhereDialog(BaseApplication.userId, BaseApplication.companyId, BaseApplication.allianceId, getGson().toJson(cardBean)).show(requireActivity().supportFragmentManager, "")
        }
        //访客
        mVisitorTV.setOnClickListener {
            requireActivity().startActivity<VisitorActivity>()
        }
        //跳转到公众号
        mJumpToGZH.setOnClickListener {
            requireActivity().startActivity<JumpToGzhDialogActivity>()
        }
        //只有钉钉可以关注公众号
        mJumpToGZH.visibility = if (BuildConfig.APPLICATION_ID == "com.ctgoe.app.hqp") View.VISIBLE else View.GONE

    }
}