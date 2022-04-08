package com.android.ctgapp.widget.dialog

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.friend.AddSelectGroupActivity
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.entity.BusinessFriendInfoEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.company.BusinessFriendEditViewModel
import kotlinx.android.synthetic.main.item_business_friend_edit_dialog2.*
import org.jetbrains.anko.startActivityForResult

/**
 *作者:LiBW
 *创建日期: 1/7/21
 *描述: 编辑商友 Dialog
 */
class BusinessFriendEditDialog(private val groupName: String,private val groupId: Int, private var name: String, private val remark: String, private val friendId: Int, private val entity: BusinessFriendInfoEntity?, private val listener: GroupEditCallback) : BaseDialogFragment() {
    private val mViewModel: BusinessFriendEditViewModel by lazy { ViewModelProvider(this)[BusinessFriendEditViewModel::class.java] }
    private var mGroupId = -1
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        mGroupId=groupId
        mNameTV.text = name
        if (groupName.isNotEmpty()) mGroupNameTV.text = groupName
        mRemarkET.textSet(remark)
        dialog?.setCanceledOnTouchOutside(false)
        entity?.data?.let {
            it.userinfo?.let { info ->
                mNameTV.text = info.realName.handlerNull()
            }
            mRemarkET.textSet(it.friendRemark)
            val groupName = it.groupName.handlerNull()
            mGroupNameTV.text = if (groupName.isEmpty()) "请选择分组" else groupName
        }

        //选择分组
        mGroupNameTV.setOnClickListener {
            requireActivity().startActivityForResult<AddSelectGroupActivity>(1000)
        }
        //确认
        mConfirmBTN.setOnClickListener {
            val remark = mRemarkET.text.handlerNull()
            when {
                else -> {
                    var groupId: Int? = null
                    if (mGroupId != -1) {
                        groupId = mGroupId
                    }
                    mViewModel.updateBusinessFriend(friendId, groupId, remark)
                }
            }
        }
        //取消
        mCancelIV.setOnClickListener {
            dismiss()
        }


        mViewModel.error.observe(this, Observer {
            MyLog.d("错误:$it")
            requireActivity().showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            MyLog.d("修改回调:$it")
            requireActivity().handlerData(it) {
                requireActivity().showToast("修改成功")
                listener.editFinish()
                dismiss()
            }
        })
    }

    override fun getLayout() = R.layout.item_business_friend_edit_dialog2

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1000) {
            data?.let {
                mGroupNameTV.text = data.getStringExtra(MyConstants.GROUP_NAME).handlerNull()
                mGroupId = data.getIntExtra(MyConstants.GROUP_ID, -1)
            }
        }
    }

    interface GroupEditCallback {
        fun editFinish()
    }
}