package com.android.ctgapp.activity.mine.team

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityInviteUserToTeamBinding
import com.android.ctgapp.util.copyTextToPhone
import com.android.ctgapp.util.showToast

/**
 *作者:LiBW
 *创建日期: 2021/12/8
 *描述:邀请员工
 */
class InviteUserToTeamActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityInviteUserToTeamBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    override fun event() {
        mBinding.mCode.text = BaseApplication.inviteCode
    }

    override fun click() {
        mBinding.mConfirmBTN.setOnClickListener {
            copyTextToPhone(this,BaseApplication.inviteCode)
            showToast("已复制${BaseApplication.inviteCode}")
        }
    }
}