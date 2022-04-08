package com.android.ctgapp.adapter.home

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.PartShopActivity
import com.android.ctgapp.databinding.ItemHomeBottomMenuListBinding
import com.android.ctgapp.entity.home.BottomBrandMenuEntity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import org.jetbrains.anko.startActivity

/***品牌适配器*/
class HomeBottomMenuAdapter(private val context: Context, private val mList: List<BottomBrandMenuEntity.DataBean>, private val listener: HomeBottomMenuAdapterListener) : RecyclerView.Adapter<HomeBottomMenuAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ItemHomeBottomMenuListBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList[position]
        holder.mTextView.text=data.brandName.handlerNull()
        holder.mNameTV.text = data.seriesName.handlerNull()
        Glide.with(context).load(data.logo)
            .placeholder(R.drawable.logo_app_gray)
            .error(R.drawable.logo_app_gray)
            .listener(object:RequestListener<Drawable>{
                override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
                    MyLog.d("首页品牌图片加载失败")
                    holder.mImageView.visibility= View.GONE
                    holder.mTextView.visibility= View.VISIBLE
                    return false
                }

                override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                    holder.mImageView.visibility= View.VISIBLE
                    holder.mTextView.visibility= View.GONE
                    return false
                }
            })
            .into(holder.mImageView)




        holder.mParentLL.setOnClickListener {
            when (data.fname) {
                "展开更多" -> listener.showMore()
                "收起" -> listener.showLess()
                else -> {
                    context.startActivity<PartShopActivity>(
                        MyConstants.BRAND_ID to data.brandId,
//                        MyConstants.CTG_NUM to data.ctgnum,
                        MyConstants.SERIES_NAME to data.seriesName,
                        MyConstants.NO_BANNER to true

                    )
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    interface HomeBottomMenuAdapterListener {
        fun showMore()
        fun showLess()
    }

    inner class MyViewHolder(view: ItemHomeBottomMenuListBinding) : RecyclerView.ViewHolder(view.root) {
        val mParentLL = view.mParentLL
        val mImageView = view.mImageView
        val mNameTV = view.mNameTV
        val mTextView = view.mTextView
    }
}