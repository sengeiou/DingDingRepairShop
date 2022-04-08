package com.android.ctgapp.adapter.home

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.BatchAddPartChildEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.textSet

/**
 * 作者:LiBW
 * 创建日期: 4/27/21
 * 描述: 采购单 adapter
 */
class PurchaseAdapter(private val context: Context, private val mList: List<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>, private val listener: PurchaseCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_purchase_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mNameTV.text = data.ctgname.handlerNull()
            if (data.price == null) {
                holder.m4SLL.visibility = View.GONE
            } else {
                holder.m4SLL.visibility = View.VISIBLE
                val price = MyConstants.RMB + data.price.handlerNull()
                holder.mPriceTV.text = price
            }
            if (data.unKnowPart) {
                holder.mOENumberET.visibility = View.VISIBLE
                holder.mOENumberTV.visibility = View.GONE
            } else {
                holder.mOENumberET.visibility = View.GONE
                holder.mOENumberTV.visibility = View.VISIBLE
                holder.mOENumberTV.text = data.oe.handlerNull()
            }

            holder.mOENumberET.textSet(data.oe)
            val watcher = object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                }

                override fun afterTextChanged(s: Editable?) {
                    if (holder.mOENumberET.hasFocus()) {
                        //判断当前EditText是否有焦点在
                        listener.unKnowOeEdit(s.toString(), position)
                    }
                }
            }

            holder.mOENumberET.setOnFocusChangeListener { _, hasFocus ->
                if (hasFocus) {
                    MyLog.d("焦点来了:${data.ctgname}")
                    holder.mOENumberET.addTextChangedListener(watcher)

                } else {
                    MyLog.d("焦点没了:${data.ctgname}")
                    holder.mOENumberET.removeTextChangedListener(watcher)
                }
            }
            holder.mGoodsCountTV.text = data.buyCount.handlerNull()
            //减少
            holder.mMinusBTN.setOnClickListener {
                if (data.buyCount > 1) {
                    data.buyCount -= 1
                }
                listener.refreshCount(data.buyCount, position)
            }
            //增加
            holder.mAddBTN.setOnClickListener {
                data.buyCount++
                listener.refreshCount(data.buyCount, position)
            }
            holder.mDeleteIV.setOnClickListener {
                listener.deleteItem(position)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mDeleteIV: ImageView = view.findViewById(R.id.mDeleteIV)
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mPriceTV: TextView = view.findViewById(R.id.mPriceTV)
        val mOENumberTV: TextView = view.findViewById(R.id.mOENumberTV)
        val mGoodsCountTV: TextView = view.findViewById(R.id.mGoodsCountTV)
        val mMinusBTN: FrameLayout = view.findViewById(R.id.mMinusBTN)
        val mAddBTN: FrameLayout = view.findViewById(R.id.mAddBTN)
        val m4SLL: LinearLayout = view.findViewById(R.id.m4SLL)
        val mOENumberET: EditText = view.findViewById(R.id.mOENumberET)
    }

    interface PurchaseCallback {
        fun refreshCount(number: Int, position: Int)
        fun deleteItem(position: Int)
        fun unKnowOeEdit(oe: String, position: Int)
    }
}