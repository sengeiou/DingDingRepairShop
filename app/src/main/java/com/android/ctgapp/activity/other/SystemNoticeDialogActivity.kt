package com.android.ctgapp.activity.other

import com.android.ctgapp.activity.message.SystemNoticeActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivitySystemNoticeDialogBinding
import com.android.ctgapp.util.MyConstants
import org.jetbrains.anko.startActivity

class SystemNoticeDialogActivity : BaseActivityV2() {

    private val mBinding by lazy { ActivitySystemNoticeDialogBinding.inflate(layoutInflater) }

    override fun getLayout() = mBinding.root

    override fun event() {
        val title = intent.getStringExtra(MyConstants.TITLE)
        val content = intent.getStringExtra(MyConstants.CONTENT)
        mBinding.mTitleTV.text = title
        mBinding.mContantTV.text = content
    }

    override fun click() {
        mBinding.mCancelBTN.setOnClickListener {
            finish()
        }
        mBinding.mCheckBTN.setOnClickListener {
//            startActivity<MainActivity>(MyConstants.GO_JUMP to 1)
            startActivity<SystemNoticeActivity>()
            finish()
        }
        mBinding.mOutSide.setOnClickListener {
            finish()
        }
    }
}