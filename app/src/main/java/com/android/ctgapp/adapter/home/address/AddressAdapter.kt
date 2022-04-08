package com.android.ctgapp.adapter.home.address

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.AddressEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.textColorResource

class AddressAdapter(private val context: Context, private val mList: List<AddressEntity.DataBean>, private val listener: ChangeAddress) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_address_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mNameTV.text = data.deliveryName.handlerNull()
            holder.mPhoneTV.text = data.deliveryPhone.handlerNull()
            if (data.isDefault) {
                holder.mCheckBoxTV.isEnabled = false
                holder.mCheckBox.isChecked = true
                holder.mCheckBoxTV.text = "已设为默认"
                holder.mCheckBoxTV.textColorResource = R.color.red_start
            } else {
                holder.mCheckBoxTV.isEnabled = true
                holder.mCheckBox.isChecked = false
                holder.mCheckBoxTV.text = "设为默认"
                holder.mCheckBoxTV.textColorResource = R.color.gray_text
            }
            val address = "${data.province.handlerNull()} ${data.city.handlerNull()} ${data.district.handlerNull()} ${data.detailAddress.handlerNull()}"
            holder.mAddressTV.text = address
            //编辑
            holder.mEditTextTV.setOnClickListener {
                listener.updateAddress(data)
            }
            //删除
            holder.mDeleteTV.setOnClickListener {
                listener.deleteAddress(data.id)
            }

            holder.mCheckBox.setOnClickListener {
                data.isDefault = true
                listener.setDefault(data)
            }
            holder.mCheckBoxTV.setOnClickListener {
                data.isDefault = true
                listener.setDefault(data)
            }
            //选中地址
            holder.mParentLL.setOnClickListener {
                listener.addressSelect(data)
            }

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mPhoneTV: TextView = view.findViewById(R.id.mCompanyTV)
        val mAddressTV: TextView = view.findViewById(R.id.mAddressTV)
        val mCheckBoxTV: TextView = view.findViewById(R.id.mCheckBoxTV)
        val mDeleteTV: TextView = view.findViewById(R.id.mDeleteTV)
        val mEditTextTV: TextView = view.findViewById(R.id.mEditTextTV)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    interface ChangeAddress {
        fun deleteAddress(addressId: Int)
        fun updateAddress(bean: AddressEntity.DataBean)
        fun setDefault(bean: AddressEntity.DataBean)
        fun addressSelect(bean: AddressEntity.DataBean)

    }
}