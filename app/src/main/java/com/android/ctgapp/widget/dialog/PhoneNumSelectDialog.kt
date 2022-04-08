package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.PhoneNumSelectAdapter
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.callback.PhoneNumSelectCallback
import com.android.ctgapp.entity.ContactModel

/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述: 商友 多电话号码选择
 */
class PhoneNumSelectDialog(private val contact: ContactModel, private val callback: PhoneNumSelectCallback) : BaseDialogFragment() {

    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        val mPhoneListRV: RecyclerView = view.findViewById(R.id.mPhoneListRV)
       view.findViewById<ImageView>(R.id.mCloseIV).setOnClickListener {
           dismiss()
       }
        mPhoneListRV.adapter = PhoneNumSelectAdapter(requireContext(), contact, callback)
        mPhoneListRV.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun getLayout() = R.layout.item_phone_num_select_dialog
}