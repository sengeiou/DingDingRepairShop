package com.android.ctgapp.adapter.mine

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.MyTeamEntity
import com.android.ctgapp.util.*
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import de.hdodenhof.circleimageview.CircleImageView

class MyTeamAdapter(private val context: Context, private val mList: List<MyTeamEntity.DataBean>, private val listener: Listener, private val isEdit: Boolean) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_my_team_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        if (holder is MyViewHolder) {
            if (isEdit) {
//                holder.mChartIV.visibility = View.GONE
                holder.mEditTV.visibility = View.VISIBLE
            } else {
//                holder.mChartIV.visibility = View.VISIBLE
                holder.mEditTV.visibility = View.GONE
            }
            val data = mList[position]
            holder.mUserNameTV.text = data.realName.handlerNull()
            holder.mPhoneNumTV.text = data.telephone.handlerNull()
            val first = data.departmentName.handlerNull()
            if (first.isNotEmpty()) {
                holder.mUserNameFirstTV.text = first.handlerNull()
            } else {
                holder.mUserNameFirstTV.visibility = View.GONE
            }
            //是否为管理员
            //是否为管理员
            when{
                data.isCompanyCreator->{
                    holder.mAdminTV.visibility =View.VISIBLE
                    holder.mAdminTV.text="创建者"
                }
                data.isCompanyAdmin->{
                    holder.mAdminTV.visibility =View.VISIBLE
                    holder.mAdminTV.text="管理员"
                }
                else->{
                    holder.mAdminTV.visibility =View.GONE
                }
            }


            //判断是否有职位标签
            val label = data.labelName.handlerNull()
            if (label.isNotEmpty()) {
                holder.mUserNameSecondTV.visibility = View.VISIBLE
                holder.mUserNameSecondTV.text = label
            } else {
                holder.mUserNameSecondTV.visibility = View.GONE
            }

            holder.mUserImageTextIV.visibility = View.VISIBLE
            holder.mUserImageIV.visibility = View.GONE

            if (data.realName.handlerNull().isNotEmpty()) {
                //将用户姓氏 做成头像 如果真实头像无法加载就展示姓氏
                val text = data.realName.handlerNull().substring(0, 1)
                holder.mUserImageTextIV.text = text
            }

            val imageUrl = ossHeader + data.imageUrl
            Glide.with(context).load(imageUrl)
                .placeholder(R.drawable.defaulthead)
                .error(R.drawable.defaulthead)
                .listener(object : RequestListener<Drawable> {
                    override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
                        //头像加载失败的时候隐藏图片展示姓氏
                        holder.mUserImageTextIV.visibility = View.VISIBLE
                        holder.mUserImageIV.visibility = View.GONE
                        return false
                    }

                    override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                        holder.mUserImageTextIV.visibility = View.GONE
                        holder.mUserImageIV.visibility = View.VISIBLE
                        return false
                    }
                })
                .into(holder.mUserImageIV)


            //编辑按钮
            holder.mEditTV.setOnClickListener {
                listener.onEditSelectListener(data)
            }
//            //聊天
//            holder.mChartIV.setOnClickListener {
//                listener.onGoToChart(data)
//            }
            holder.mCardParentLL.setOnClickListener {
                listener.onItemSelectListener(data)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mUserImageIV: CircleImageView = view.findViewById(R.id.mUserImageIV)
        val mUserImageTextIV: TextView = view.findViewById(R.id.mUserImageTextIV)
        val mUserNameTV: TextView = view.findViewById(R.id.mUserNameTV)
        val mUserNameFirstTV: TextView = view.findViewById(R.id.mUserNameFirstTV)
        val mUserNameSecondTV: TextView = view.findViewById(R.id.mUserNameSecondTV)
        val mPhoneNumTV: TextView = view.findViewById(R.id.mPhoneNumTV)

        //        val mChartIV: ImageView = view.findViewById(R.id.mChartIV)
        val mEditTV: ImageView = view.findViewById(R.id.mEditTV)
        val mAdminTV: TextView = view.findViewById(R.id.mAdminTV)
        val mCardParentLL: LinearLayout = view.findViewById(R.id.mCardParentLL)
    }

    interface Listener {
        fun onEditSelectListener(data: MyTeamEntity.DataBean)
        fun onItemSelectListener(data: MyTeamEntity.DataBean)
//        fun onGoToChart(data: MyTeamEntity.DataBean)
    }
}