package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.PersonInfoActivity
import com.android.ctgapp.activity.message.chart.card.DingDingContactShareActivity
import com.android.ctgapp.activity.mine.PersonInfoChangeActivity
import com.android.ctgapp.base.BaseApplication
import com.bumptech.glide.Glide
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.BusinessFriendEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import de.hdodenhof.circleimageview.CircleImageView
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource


/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述:商友list适配器 用于聊天名片选择
 */
class BusinessFriendSelectAdapter(private val context: Context, private val mList: ArrayList<BusinessFriendEntity.DataBean>, private val callback: Callback, private val isLinkman: Boolean) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_business_friend_select_list, null, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val mActivity = context as DingDingContactShareActivity
            //展示是否在线
            if (data.isOnline){
                holder.mOnLineIV.backgroundResource=R.drawable.bg_solid_green_circle
            }else{
                holder.mOnLineIV.backgroundResource=R.drawable.bg_solid_gray_circle_unline

            }


            if (!mActivity.returnToChart) {
                if (data.uid in mActivity.mSelectList) {
                    MyLog.d("有点意思")
                    holder.mCheckBox.isChecked = true
                } else {
                    holder.mCheckBox.isChecked = false
                }
            } else {
                MyLog.d("单选模式")
//                holder.mCheckBox.isChecked = data.selected
                holder.mCheckBox.isChecked = mActivity.preSelectId == data.uid
            }

            val showName = when {
                data.realName.handlerNull().isNotEmpty() -> data.realName.handlerNull()
                data.friendRemark.handlerNull().isNotEmpty() -> data.friendRemark.handlerNull()
                else -> ""
            }
            holder.mUserNameTV.text = showName
            holder.mCompanyNameTV.text = data.orgname.handlerNull()

            //联系人模式下不展示选择器
            holder.mCheckBox.visibility = if (isLinkman) View.GONE else View.VISIBLE
            when{
                //聊天返回名片模式下 无法发送 聊天对方的名片
                mActivity.returnToChart && mActivity.otherID == data.uid->{
                    holder.mCheckBox.isEnabled = false
                    holder.mItemRL.isEnabled = false
                }
                //群发不能发送自己的名片
                !mActivity.returnToChart&&data.uid== BaseApplication.userId->{
                    holder.mCheckBox.isEnabled = false
                    holder.mItemRL.isEnabled = false
                }
                else->{
                    holder.mCheckBox.isEnabled = true
                    holder.mItemRL.isEnabled = true
                }
            }

            //整体点击事件
            holder.mItemRL.setOnClickListener {
                if (isLinkman) {
                    //不可以查看自己的详情
                    if (data.uid != BaseApplication.userId) {
                        //联系人模式下进入详情
                        PersonInfoActivity.jumpHere(context, data.uid, data.imageUrl.handlerNull(), data.companyId)
                    }
                } else {
                    holder.mCheckBox.performClick()
                }
            }
            //选择器选择按钮
            holder.mCheckBox.setOnClickListener {
                if (!mActivity.returnToChart) {
                    //多选模式数据处理
                    val check = holder.mCheckBox.isChecked
                    callback.onItemClickForMore(mList[position], check)
                    mList[position].selected = check
                    notifyDataSetChanged()
                } else {
                    //单选模式
                    handlerSelect(position)
                }
            }
            val picture = ossHeader + data.imageUrl.handlerNull()
            Glide.with(context).load(picture).
                placeholder(R.drawable.defaulthead)
                .error(R.drawable.defaulthead)
            .into(holder.mHeaderIV)
        }
    }

    private fun handlerSelect(position: Int) {
        MyLog.d("点击了位置:$position")
        val activity = context as DingDingContactShareActivity
        //改变当前按钮状态
        mList[position].selected = !mList[position].selected
        //如果是取消选中则不管
        if (!mList[position].selected) {
            MyLog.d("取消了刚刚选择的")
            activity.preSelect = -1
            activity.preSelectId = -1
            activity.currentSelect = ""
        } else {
            //告诉activity选择的内容
            callback.onItemClick(mList[position], position)
            //单选模式需要恢复上一个
            if (activity.returnToChart && activity.preSelect != -1) {
                mList[activity.preSelect].selected = false
            }
            activity.preSelect = position
            activity.preSelectId = mList[position].uid
        }
        notifyDataSetChanged()
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mHeaderIV: CircleImageView = view.findViewById(R.id.mHeaderIV)
        val mOnLineIV: TextView = view.findViewById(R.id.mOnLineIV)
        val mUserNameTV: TextView = view.findViewById(R.id.mUserNameTV)
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mItemRL: RelativeLayout = view.findViewById(R.id.mItemRL)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
    }

    interface Callback {
        fun onItemClick(data: BusinessFriendEntity.DataBean, position: Int)
        fun onItemClickForMore(data: BusinessFriendEntity.DataBean, select: Boolean)
    }
}