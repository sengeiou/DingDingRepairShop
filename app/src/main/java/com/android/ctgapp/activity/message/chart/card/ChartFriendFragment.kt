package com.android.ctgapp.activity.message.chart.card

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.friend.BusinessFriendViewModel
import com.android.ctgapp.adapter.mine.BusinessFriendHorizontalGroupAdapter
import com.android.ctgapp.adapter.mine.BusinessFriendSelectAdapter
import com.android.ctgapp.adapter.mine.CustomGroupSelectAdapterEmpty
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseFragment
import com.android.ctgapp.entity.*
import com.android.ctgapp.entity.chart.CardShareBean
import com.android.ctgapp.enum.IndustryEnum
import com.android.ctgapp.event.OnLineRefresh
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.fragment_chart_friend.*
import org.greenrobot.eventbus.Subscribe
import java.util.ArrayList

class ChartFriendFragment(private var isLineman: Boolean) : BaseFragment(true), BusinessFriendHorizontalGroupAdapter.SelectCallback, BusinessFriendSelectAdapter.Callback {
    private val mActivity by lazy { requireActivity() as DingDingContactShareActivity }

    //主体适配器
    var mAdapter: BusinessFriendSelectAdapter? = null

    private val mHorizontalList = ArrayList<BusinessFriendHorizontalItemEntity>()
    private var mHorizontalAdapter: BusinessFriendHorizontalGroupAdapter? = null
    private val mViewModel: BusinessFriendViewModel by lazy { ViewModelProvider(this)[BusinessFriendViewModel::class.java] }

    //固定分组列表选中项
    private var mFixGroupList = ArrayList<BusinessFriendGroupEntity.DataBean>()
    private val mFixGroupAdapter: CustomGroupSelectAdapterEmpty by lazy { CustomGroupSelectAdapterEmpty(true, requireContext(), mFixGroupList) }
    private val mHorizontalLayoutManager by lazy { LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false) }

    //自定义分组列表选中项
    private var mCustomGroupList = ArrayList<BusinessFriendGroupEntity.DataBean>()
    private val mCustomGroupAdapter: CustomGroupSelectAdapterEmpty by lazy { CustomGroupSelectAdapterEmpty(false, requireContext(), mCustomGroupList) }
    private var currentSelect = "ALL"

    //用于判断是否隐藏了当前的横向选项卡
    private var allIsFine = false
    val mList = ArrayList<BusinessFriendEntity.DataBean>()
    private val mSearchList = ArrayList<BusinessFriendEntity.DataBean>()

    //0 搜全部 1 固定列表 2自定义分组
    private var preSearch = 0

    override fun onResume() {
        super.onResume()
        mActivity.mSelectList.forEach { item ->
            mList.forEach { child ->
                child.selected = item == child.uid
            }
            mSearchList.forEach { child ->
                child.selected = item == child.uid
            }
        }
        mAdapter?.notifyDataSetChanged()
    }

    @Subscribe
    fun event(o: OnLineRefresh) {
        mList.forEach {
                it.isOnline = it.uid in BaseApplication.onLineFriendIds
            }
        mAdapter?.notifyDataSetChanged()
    }


    fun search(str: String) {
        MyLog.d("索索的啥:$str")
        mSearchList.clear()
        mList.forEach {
            if (str in it.realName.handlerNull() || str in it.orgname.handlerNull()) {
                mSearchList.add(it)
            }
        }
        mAdapter = BusinessFriendSelectAdapter(requireContext(), mSearchList, this, isLineman)
        mFriendRV.adapter = mAdapter
        mAdapter?.notifyDataSetChanged()
    }

    fun refresh() {
        mAdapter = BusinessFriendSelectAdapter(requireContext(), mList, this, isLineman)
        mFriendRV.adapter = mAdapter
        mAdapter?.notifyDataSetChanged()
    }

    override fun event() {
        mAdapter = BusinessFriendSelectAdapter(requireContext(), mList, this, isLineman)
        mHorizontalAdapter = BusinessFriendHorizontalGroupAdapter(requireContext(), mHorizontalList, this)
        mViewModel.findAll()
        handlerHorizontalGroup()
        //横向Group列表
        mGroupRV.adapter = mHorizontalAdapter
        mGroupRV.layoutManager = mHorizontalLayoutManager

        //展示列表
        mFriendRV.adapter = mAdapter
        mFriendRV.layoutManager = GridLayoutManager(requireContext(), 1)

        mViewModel.allResult.observe(this, {
            loading.dismiss()
            MyLog.d("获取的商友:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, BusinessFriendEntity::class.java).data
                mList.clear()
                entity?.let { list ->
                    list.forEach {
                        //将所有商友加入到需要获取在线的列表里
                        BaseApplication.allFriendIds.add(it.uid)
                    }

                    mActivity.preSelect = -1
                    mActivity.currentSelect = ""
                    list.forEach {
                        it.isOnline = it.uid in BaseApplication.onLineFriendIds
                    }
                    mList.addAll(list)
                    mAdapter?.notifyDataSetChanged()
                }
            } else {
                requireActivity().showToast(data.msg)
            }
        })
        //获取自定义分组回调
        mViewModel.customFriendGroup.observe(this, {
            MyLog.d("自定义商友Group:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, FriendGroupEntity::class.java).data
                entity?.let { list ->
                    mCustomGroupList.clear()
                    list.forEach { item ->
                        var currentPosition = -1
                        mCustomGroupList.add(BusinessFriendGroupEntity.DataBean(item.groupName.handlerNull(), item.id, item.isDisplay))
                        mCustomGroupAdapter.notifyDataSetChanged()
                        //将展示状态的按钮加入横向列表
                        if (item.isDisplay) {
                            if (currentSelect == item.id.toString()) {
                                allIsFine = true
                                currentPosition = mHorizontalList.size
                                mHorizontalList.add(BusinessFriendHorizontalItemEntity(item.groupName.handlerNull(), item.id, "", true))
                                mViewModel.findByIndustry(item.id)

                            } else {
                                mHorizontalList.add(BusinessFriendHorizontalItemEntity(item.groupName.handlerNull(), item.id))
                            }
                            mHorizontalAdapter?.notifyDataSetChanged()
                            if (currentPosition != -1) {
                                //滑动到当前标签位置
                                mGroupRV.scrollToPosition(currentPosition)
                            }
                        }
                    }
                }
                if (!allIsFine) {
                    currentSelect = "ALL"
                    mHorizontalList.clear()
                    mHorizontalAdapter = BusinessFriendHorizontalGroupAdapter(requireContext(), mHorizontalList, this)
                    mGroupRV.adapter = mHorizontalAdapter
                    mGroupRV.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
                    handlerHorizontalGroup()
                    mList.clear()
                    mViewModel.findAll()
                }
            } else {
                requireActivity().showToast(data.msg)
            }
        })


    }

    //刷新横向列表
    private fun handlerHorizontalGroup() {
        MyLog.d("当前是啥:$currentSelect")
        //用于判断是否删除了当前展示的横向列表按钮
        mFixGroupList.clear()
        mHorizontalList.clear()
        //为第一个添加所有选项
        if (currentSelect == "ALL") {
            allIsFine = true
            mHorizontalList.add(BusinessFriendHorizontalItemEntity("所有", industry = "ALL", isSelect = true))
        } else {
            mHorizontalList.add(BusinessFriendHorizontalItemEntity("所有", industry = "ALL"))
        }
        //获取SP缓存的固定分组的选择状态
        val fixGroupJson = sharedGet(MyConstants.FIX_GROUP_LIST, "") as String
        //如果没有缓存则展示所有固定列表
        if (fixGroupJson.isEmpty()) {
            //配置抽屉内的固定分组
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.LOGISTICS.industryText, IndustryEnum.LOGISTICS.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.AGENCY.industryText, IndustryEnum.AGENCY.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.MANUFACTURER.industryText, IndustryEnum.MANUFACTURER.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.AUTO4S.industryText, IndustryEnum.AUTO4S.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.REPAIRSHOP.industryText, IndustryEnum.REPAIRSHOP.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.INSURANCE.industryText, IndustryEnum.INSURANCE.name))
            mFixGroupAdapter.notifyDataSetChanged()
            //添加横向列表
            mFixGroupList.forEach {
                if (currentSelect == it.id.handlerNull()) {
                    allIsFine = true
                    mHorizontalList.add(BusinessFriendHorizontalItemEntity(it.groupName, -1, it.id.handlerNull(), true))
                    mViewModel.findByIndustry(it.id.handlerNull())
                } else {
                    mHorizontalList.add(BusinessFriendHorizontalItemEntity(it.groupName, -1, it.id.handlerNull()))
                }
            }
            mHorizontalAdapter?.notifyDataSetChanged()
        } else {
            //获取缓存
            MyLog.d("缓存的分组:$fixGroupJson")
            val json = getGson().fromJson(fixGroupJson, BusinessFriendGroupEntity::class.java).mList
            json?.let {
                if (it.isNotEmpty()) {
                    mFixGroupList.addAll(it)
                    mFixGroupAdapter.notifyDataSetChanged()
                    mFixGroupList.forEach { list ->
                        if (list.isDisplay) {
                            //固定列表的ID固定传-1
                            if (currentSelect == list.id.handlerNull()) {
                                allIsFine = true
                                mHorizontalList.add(BusinessFriendHorizontalItemEntity(list.groupName, -1, list.id.handlerNull(), true))
                                mViewModel.findByIndustry(list.id.handlerNull())
                            } else {
                                mHorizontalList.add(BusinessFriendHorizontalItemEntity(list.groupName, -1, list.id.handlerNull()))
                            }
                        }
                    }
                }
                mHorizontalAdapter?.notifyDataSetChanged()
            }
        }
        mViewModel.getCustomGroup()
    }

    override fun click() {

    }


    //item点击事件
    override fun onItemClick(data: BusinessFriendEntity.DataBean, position: Int) {
        //聊天为单选
        if (mActivity.returnToChart) {
            val bean = CardShareBean(
                data.realName.handlerNull(),
                data.uid,
                data.telephone.handlerNull(),
                data.orgname.handlerNull(),
                data.companyId,
                data.imageUrl.handlerNull()
            )
            mActivity.currentSelect = getGson().toJson(bean)

            //单选模式下回复同事那边的选中项
            mActivity.teamFragment.mList.forEach { parent ->
                parent.users?.forEach { child ->
                    child.selected = false
                }
            }
            if (mList.isNotEmpty()) {
                mActivity.teamFragment.mAdapter?.notifyDataSetChanged()
            }
        }
//        else {
//            //分享为多选
//
//
//        }
    }

    override fun onItemClickForMore(data: BusinessFriendEntity.DataBean, select: Boolean) {
        if (select) {
            mActivity.mSelectList.add(data.uid)
        } else {
            mActivity.mSelectList.remove(data.uid)
        }
        mActivity.refreshSelectCount()
    }

    //横向列表中固定列表被选中
    override fun findByFixIndustry(industry: String, industryName: String) {
        preSearch = 1
        currentSelect = industry
        MyLog.d("当前是啥:::::::::::${industryName}")
        loading.show()
        mViewModel.findByIndustry(industry)
    }

    override fun findByCustomId(id: Int) {
        preSearch = 2
        currentSelect = id.toString()
        MyLog.d("当前是啥:::::::::::${id}")
        loading.show()
        mViewModel.findByIndustry(id)
    }


    override fun findAll(industry: String, industryName: String) {
        preSearch = 0
        currentSelect = industryName
        loading.show()
        mViewModel.findAll()
    }

    override fun getLayout() = R.layout.fragment_chart_friend
}