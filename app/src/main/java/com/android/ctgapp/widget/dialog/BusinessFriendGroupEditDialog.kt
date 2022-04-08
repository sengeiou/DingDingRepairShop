package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.View
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.setEditText
import com.android.ctgapp.util.showToast
import kotlinx.android.synthetic.main.item_business_friend_edit_dialog.*

/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述: 自定义商友分组 编辑和添加
 */
class BusinessFriendGroupEditDialog(private val callback: GroupCallback, private val groupId: Int? = -1, private val groupName: String? = "") : BaseDialogFragment() {
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        if (groupId == -1) {
            mTypeTV.text = "添加分组"
        } else {
            mTypeTV.text = "编辑分组"
            mGroupNameET.text = setEditText(groupName.handlerNull())
        }

        mCancelIV.setOnClickListener {
            dismiss()
        }
        //确认
        mConfirmBTN.setOnClickListener {
            val groupName = mGroupNameET.text.toString()
            if (groupName.isNotEmpty()) {
                if (groupId == -1) {
                    dismiss()
                    callback.addGroup(groupName)
                } else {
                    dismiss()
                    callback.editGroup(groupName, groupId!!)
                }
            } else {
                requireActivity().showToast("请输入分组名称")
            }

        }
        //取消
        mCancelBTN.setOnClickListener {
            dismiss()
        }
    }

    override fun getLayout() = R.layout.item_business_friend_edit_dialog

    interface GroupCallback {
        fun addGroup(groupName: String)
        fun editGroup(groupName: String, groupId: Int)
    }
}