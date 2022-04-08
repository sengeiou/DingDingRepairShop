package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.View
import android.widget.RelativeLayout
import com.android.ctgapp.BuildConfig.WX_APP_ID
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.card.CardShareRecentChartActivity
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.util.MyConstants
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import kotlinx.android.synthetic.main.dialog_card_shared_to_where.*
import org.jetbrains.anko.startActivity


/**
 *作者:LiBW
 *创建日期: 2/25/21
 *描述:选择将名片分享到微信还是联系人页面 Dialog 发名片 Dialog
 */
class CardSharedToWhereDialog(private val userId: Int, private val companyId: Int, private val AllianceId: Int, private val cardInfo: String) : BaseDialogFragment() {
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        val str="${resources.getString(R.string.app_name)}联系人"
        mContactTV.text=str

        //分享到微信
        mShareToWeChat.setOnClickListener {
            val api = WXAPIFactory.createWXAPI(requireContext(), WX_APP_ID)
            val req = WXLaunchMiniProgram.Req()
            req.userName = "gh_a9eb273c7c97"
            req.path = "pages/common/sharePage/sharePage?userId=${userId}&companyId=${companyId}&allianceId=${AllianceId}"

            //正式版
            req.miniprogramType = WXLaunchMiniProgram.Req.MINIPTOGRAM_TYPE_RELEASE
            api.sendReq(req)
        }
        //分享到联系人
        mShareToApp.setOnClickListener {
            requireActivity().startActivity<CardShareRecentChartActivity>(
                MyConstants.USER_ID to userId,
                MyConstants.CARD_INFO to cardInfo
            )
            dismiss()
        }
    }

    override fun getLayout() = R.layout.dialog_card_shared_to_where

    override fun onStart() {
        super.onStart()
        val display = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(display)
//        //设置宽高占比
        val params = dialog!!.window!!.attributes
//        //此处占满屏幕宽度
        params.width = display.widthPixels
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT
        params.gravity = Gravity.BOTTOM
        params.horizontalMargin = 100f
//        高度自己定义
        dialog!!.window!!.setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dialog?.window?.attributes?.windowAnimations = R.style.fromBottomAnimation
    }
}