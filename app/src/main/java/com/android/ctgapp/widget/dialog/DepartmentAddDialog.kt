package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.View
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.util.showToast
import kotlinx.android.synthetic.main.item_department_add_dialog.*

/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述: 商友 多电话号码选择
 */
class DepartmentAddDialog(private val callback: DepartmentAddListener, private val departmentId: Int = -1) : BaseDialogFragment() {

    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        if (departmentId == -1) {
            mTypeTV.text = "添加部门"
        } else {
            mTypeTV.text = "编辑部门"
        }

        mCancelIV.setOnClickListener {
            dismiss()
        }
        //确认
        mConfirmBTN.setOnClickListener {
            val departmentName = mDepartmentNameET.text.toString()
            if (departmentName.isNotEmpty()) {
                if (departmentId == -1) {
                    callback.addDepartment(departmentName)
                } else {
                    callback.editDepartment(departmentName, departmentId)
                }
                dismiss()
            } else {
                requireActivity().showToast("请输入部门名称")
            }

        }
        //取消
        mCancelBTN.setOnClickListener {
            dismiss()
        }
    }

    override fun getLayout() = R.layout.item_department_add_dialog

    interface DepartmentAddListener {
        fun addDepartment(departmentName: String)
        fun editDepartment(departmentName: String, departmentId: Int)
    }
}