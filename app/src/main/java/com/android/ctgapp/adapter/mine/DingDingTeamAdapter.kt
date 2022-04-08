package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.PersonInfoActivity
import com.android.ctgapp.activity.message.chart.card.DingDingContactShareActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.chart.CardShareBean
import com.android.ctgapp.entity.chart.AllTeamEntity
import com.android.ctgapp.util.*
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.item_ding_ding_tem_child.view.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 3/3/21
 *描述:钉钉联系人 同事 二级列表适配器
 */
class DingDingTeamAdapter(private val context: Context, private val entity: List<AllTeamEntity.DataBean>, private val listener: Callback, private val isLinkman: Boolean) : BaseExpandableListAdapter() {
    private var preParent = -1
    private var preChild = -1


    override fun getGroupCount(): Int {
        return entity.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return entity[groupPosition].users!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return entity[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return entity[groupPosition].users!![childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        var newConvertView = convertView
        val viewHolder: GroupViewHolder
        if (convertView == null) {
            viewHolder = GroupViewHolder()
            newConvertView = LayoutInflater.from(context).inflate(R.layout.item_ding_ding_team_parent, parent, false)
            viewHolder.mCompanyImageIV = newConvertView.findViewById(R.id.mCompanyImageIV)
            viewHolder.mCompanyNameTV = newConvertView.findViewById(R.id.mCompanyNameTV)
            newConvertView.tag = viewHolder
        } else {
            viewHolder = newConvertView!!.tag as GroupViewHolder
        }
        val parentData = entity[groupPosition]
        viewHolder.mCompanyNameTV?.text = parentData.orgname.handlerNull()

        viewHolder.mCompanyImageIV?.let {
            Glide.with(context).load(parentData.logo.ossUrlHandler())
                .placeholder(R.drawable.logo_app_gray)
                .error(R.drawable.logo_app_gray)
                .into(it)
        }
        return newConvertView!!
    }

    //二级列表
    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        val mActivity = context as DingDingContactShareActivity
        val view: View
        val holder: ChildViewHolder
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_ding_ding_tem_child, parent, false)
            holder = ChildViewHolder()
            holder.mCheckBox = view.mCheckBox
            holder.mUserNameTV = view.mUserNameTV
            holder.mOnlineTV = view.mOnLineIV
            holder.mUserImageIV = view.mUserImageIV
            holder.mParentLL = view.mParentLL
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as ChildViewHolder
        }
        val childData = entity[groupPosition].users!![childPosition]

        //展示是否在线
        if (childData.onLine){
            holder.mOnlineTV?.backgroundResource=R.drawable.bg_solid_green_circle
        }else{
            holder.mOnlineTV?.backgroundResource=R.drawable.bg_solid_gray_circle_unline
        }

        when{
            //如果是群发不允许点击自己
            !mActivity.returnToChart && childData.id == BaseApplication.userId->{
                holder.mCheckBox?.isEnabled = false
                holder.mParentLL?.isEnabled = false
            }
            //如果是聊天 不能发送对方名片给对方
            mActivity.returnToChart && childData.id == mActivity.otherID->{
                holder.mCheckBox?.isEnabled = false
                holder.mParentLL?.isEnabled = false
            }
            else->{
                holder.mCheckBox?.isEnabled = true
                holder.mParentLL?.isEnabled = true
            }
        }

//        holder.mUserNameTV?.text = entity[groupPosition].users!!.handlerNull()
        holder.mUserNameTV?.text = childData.realName.handlerNull()

        holder.mUserImageIV?.let {
            Glide.with(context).load(ossHeader + childData.imageUrl).
                placeholder(R.drawable.defaulthead)
                .error(R.drawable.defaulthead)
            .into(it)
        }
        //整体点击事件
        holder.mParentLL?.setOnClickListener {
            if (isLinkman) {
                //联系人模式下进入详情
                PersonInfoActivity.jumpHere(context, childData.id, childData.imageUrl.handlerNull(), childData.companyId)
            } else {
                holder.mCheckBox?.performClick()
            }
        }
        if (mActivity.returnToChart) {
            holder.mCheckBox?.isChecked = mActivity.preSelectId == childData.id
        } else {
            holder.mCheckBox?.isChecked = childData.id in mActivity.mSelectList
        }

        //联系人模式下不展示选择器
        holder.mCheckBox?.visibility = if (isLinkman) View.GONE else View.VISIBLE



        holder.mCheckBox?.setOnClickListener {
            val check = holder.mCheckBox?.isChecked
            MyLog.d("checkbox呗点击了")
            //判断选中状态
            if (mActivity.returnToChart) {
                MyLog.d("单选模式")
                //单选
                check?.let {
                    if (check) {
                        entity[groupPosition].users?.get(childPosition)?.selected = true
                        notifyDataSetChanged()
                        val card = CardShareBean(
                            childData.realName.handlerNull(),
                            childData.id,
                            childData.telephone.handlerNull(),
                            childData.orgname.handlerNull(),
                            childData.companyId,
                            childData.imageUrl.handlerNull()
                        )
                        mActivity.currentSelect = getGson().toJson(card)
                        mActivity.preSelectId = childData.id
                        //恢复上次的选项
                        if (preChild != -1 && preParent != -1) {
//                        entity[preParent].users[preChild].selected=false
                            entity[preParent].users?.get(preChild)?.selected = false
                        }
                        preParent = groupPosition
                        preChild = childPosition
                        listener.onItemClick(childData, groupPosition, childPosition)
                    } else {
                        mActivity.preSelect = -1
                        mActivity.currentSelect = ""
                        mActivity.preSelectId = -1
                        preChild = -1
                        preParent = -1
                    }
                }
//                notifyDataSetChanged()
            } else {
                MyLog.d("多选模式")
                //多选
                check?.let {
                    if (it) {
                        entity[groupPosition].users?.get(childPosition)?.selected = it
                    }
                    listener.onItemClickForMore(childData, it, groupPosition, childPosition)
                }
            }
            notifyDataSetChanged()
        }
        return view
    }


    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return false
    }

    interface Callback {
        //TODO 此处根据实际后端返回的JSON返回
        fun onItemClick(data: AllTeamEntity.DataBean.UsersBean, parentPosition: Int, childPosition: Int)
        fun onItemClickForMore(data: AllTeamEntity.DataBean.UsersBean, select: Boolean, parentPosition: Int, childPosition: Int)
    }
}


class GroupViewHolder {
    var mCompanyImageIV: ImageView? = null
    var mCompanyNameTV: TextView? = null
}

class ChildViewHolder {
    var mCheckBox: CheckBox? = null
    var mUserNameTV: TextView? = null
    var mOnlineTV: TextView? = null
    var mUserImageIV: CircleImageView? = null
    var mParentLL: LinearLayout? = null
}