package com.android.ctgapp.widget.dialog

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.friend.AddSelectGroupActivity
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.company.BusinessFriendEditViewModel
import kotlinx.android.synthetic.main.item_business_friend_edit_dialog2.*
import org.jetbrains.anko.startActivityForResult

/**
 *作者:LiBW
 *创建日期: 4/10/21
 *描述: 添加商友 Dialog
 */
class BusinessFriendAddDialog(private val friendId: Int, private val name: String,private val listener:AddCallback) : BaseDialogFragment() {
    private val mViewModel: BusinessFriendEditViewModel by lazy { ViewModelProvider(this)[BusinessFriendEditViewModel::class.java] }
    private var mGroupId = -1

    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        dialog?.setCanceledOnTouchOutside(false)
        mNameTV.text = name.handlerNull()

        //选择分组
        mGroupNameTV.setOnClickListener {
            requireActivity().startActivityForResult<AddSelectGroupActivity>(1000)
        }
        //确认
        mConfirmBTN.setOnClickListener {
            val remark = mRemarkET.text.handlerNull()
            var friendRemark: String? = null
            var groupId: Int? = null
            if (remark.isNotEmpty()) {
                friendRemark = remark
            }
            if (mGroupId != -1) {
                groupId = mGroupId
            }
            mViewModel.addFriend(friendId, groupId, friendRemark)

        }
        //取消
        mCancelIV.setOnClickListener {
            dismiss()
        }


        mViewModel.error.observe(this, Observer {
            MyLog.d("错误:$it")
            requireActivity().showToast(it)
        })

        mViewModel.addResult.observe(this, Observer {
            MyLog.d("添加商友回调:$it")
            requireActivity().handlerData(it) {
                listener.addFinish()
                requireActivity().showToast("添加成功")
                dismiss()
            }
        })
    }

    override fun getLayout() = R.layout.item_business_friend_add_dialog

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1000) {
            data?.let {
                mGroupNameTV.text = data.getStringExtra(MyConstants.GROUP_NAME).handlerNull()
                mGroupId = data.getIntExtra(MyConstants.GROUP_ID, -1)
            }
        }
    }

    interface AddCallback{
        fun addFinish()
    }

}