package com.android.ctgapp.adapter.chart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.entity.chart.ChartFaceBean
import com.bumptech.glide.Glide

class FaceAdapter(private val context: Context, private val mList: Array<ChartFaceBean>) : RecyclerView.Adapter<FaceAdapter.MyViewHolder>() {
    private var listener: FaceItemCheck? = null

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mFaceIdIV: ImageView = view.findViewById(R.id.mFaceIdIV)
        val mPrentLL: LinearLayout = view.findViewById(R.id.mPrentLL)
    }

    fun setOnclickListener(listener: FaceItemCheck) {
        this.listener = listener
    }

    interface FaceItemCheck {
        fun onItemClickListener(resourceId: Int, imageName: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_chart_face_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList[position]
        Glide.with(context).load(data.imgResource).into(holder.mFaceIdIV)
        holder.mPrentLL.setOnClickListener {
            listener?.onItemClickListener(data.imgResource, data.imageName)
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

}