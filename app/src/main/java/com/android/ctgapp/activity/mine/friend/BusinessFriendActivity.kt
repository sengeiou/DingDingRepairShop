package com.android.ctgapp.activity.mine.friend

import android.Manifest
import android.content.Intent
import androidx.core.view.GravityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.PersonInfoActivity
import com.android.ctgapp.adapter.mine.BusinessFriendAdapter
import com.android.ctgapp.adapter.mine.BusinessFriendHorizontalGroupAdapter
import com.android.ctgapp.adapter.mine.CustomGroupSelectAdapterEmpty
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.BusinessFriendEntity
import com.android.ctgapp.entity.BusinessFriendGroupEntity
import com.android.ctgapp.entity.BusinessFriendHorizontalItemEntity
import com.android.ctgapp.entity.FriendGroupEntity
import com.android.ctgapp.enum.IndustryEnum
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_business_friend.*
import org.jetbrains.anko.startActivity
import java.util.*

/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述: 商友 页面
 */
class BusinessFriendActivity : BaseActivity(), BusinessFriendHorizontalGroupAdapter.SelectCallback, BusinessFriendAdapter.Callback {
    override fun getLayout() = R.layout.activity_business_friend
    private val mList = ArrayList<BusinessFriendEntity.DataBean>()
    private val mCopyList = ArrayList<BusinessFriendEntity.DataBean>()
    private val mAdapter: BusinessFriendAdapter by lazy { BusinessFriendAdapter(this, mList, this) }

    //固定分组列表选中项
    private var mFixGroupList = ArrayList<BusinessFriendGroupEntity.DataBean>()
    private val mFixGroupAdapter: CustomGroupSelectAdapterEmpty by lazy { CustomGroupSelectAdapterEmpty(true, this, mFixGroupList) }

    //自定义分组列表选中项(抽屉)
    private var mCustomGroupList = ArrayList<BusinessFriendGroupEntity.DataBean>()
    private val mCustomGroupAdapter: CustomGroupSelectAdapterEmpty by lazy { CustomGroupSelectAdapterEmpty(false, this, mCustomGroupList) }

    //横向分组中的选项
    private val mHorizontalList = ArrayList<BusinessFriendHorizontalItemEntity>()
    private var mHorizontalAdapter: BusinessFriendHorizontalGroupAdapter? = null
    private val mViewModel: BusinessFriendViewModel by lazy { ViewModelProvider(this)[BusinessFriendViewModel::class.java] }

    //读取通讯录的权限
    private val permissions = arrayOf(Manifest.permission.READ_CONTACTS)

    private var currentSelect = "ALL"

    //是否来自聊天页面 如果是聊天页面就不进入详情而是返回数据
    private val returnToChart: Boolean by lazy { intent.getBooleanExtra(MyConstants.FROM_CHART, false) }

    //0 搜全部 1 固定列表(String) 2自定义分组(Int)
    private var preSearch = 0

    //用于判断是否隐藏了当前的横向选项卡
    private var allIsFine = false
    private val mHorizontalLayoutManager by lazy { LinearLayoutManager(this, RecyclerView.HORIZONTAL, false) }

    override fun onResume() {
        super.onResume()
        allIsFine = false
        //刷新横向列表
        handlerHorizontalGroup()
        //刷新当前商友
        when (preSearch) {
            0 -> mViewModel.findAll()
            1 -> mViewModel.findByIndustry(currentSelect)
            2 -> mViewModel.findByIndustry(currentSelect.toInt())
        }
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
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.AGENCY.industryText, IndustryEnum.AGENCY.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.REPAIRSHOP.industryText, IndustryEnum.REPAIRSHOP.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.AUTO4S.industryText, IndustryEnum.AUTO4S.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.MANUFACTURER.industryText, IndustryEnum.MANUFACTURER.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.INSURANCE.industryText, IndustryEnum.INSURANCE.name))
            mFixGroupList.add(BusinessFriendGroupEntity.DataBean(IndustryEnum.LOGISTICS.industryText, IndustryEnum.LOGISTICS.name))
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

    override fun event() {
        mHorizontalAdapter = BusinessFriendHorizontalGroupAdapter(this, mHorizontalList, this)
        //第一次进入获取所有商友
        loading.show()
        mViewModel.findAll()
        //横向Group列表
        mGroupRV.adapter = mHorizontalAdapter
        mGroupRV.layoutManager = mHorizontalLayoutManager
        //展示抽屉内的固定分组
        mFixGroupRV.adapter = mFixGroupAdapter
        mFixGroupRV.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        //展示抽屉内的自定义分组
        mCustomGroupRV.adapter = mCustomGroupAdapter
        mCustomGroupRV.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        //展示列表
        mFriendRV.adapter = mAdapter
        mFriendRV.layoutManager = GridLayoutManager(this, 1)

        //获取自定义分组回调
        mViewModel.customFriendGroup.observe(this, Observer {
            MyLog.d("自定义商友Group:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, FriendGroupEntity::class.java).data
                if (entity == null) {
                    mCustomGroupList.clear()
                    mCustomGroupAdapter.notifyDataSetChanged()
                } else {
                    //先清除抽屉内的自定义分组列表
                    mCustomGroupList.clear()
                    entity.forEach { item ->
                        var currentPosition = -1
                        mCustomGroupList.add(BusinessFriendGroupEntity.DataBean(item.groupName.handlerNull(), item.id, item.isDisplay))
                        //                        mCustomGroupAdapter.notifyDataSetChanged()
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
                    mCustomGroupAdapter.notifyDataSetChanged()
                }
                if (!allIsFine) {
                    currentSelect = "ALL"
                    mHorizontalList.clear()
                    mHorizontalAdapter = BusinessFriendHorizontalGroupAdapter(this, mHorizontalList, this)
                    mGroupRV.adapter = mHorizontalAdapter
                    mGroupRV.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
                    handlerHorizontalGroup()
                    mList.clear()
                    mViewModel.findAll()
                }
            } else {
                showToast(data.msg)
            }
        })

        mViewModel.allResult.observe(this,  {
            loading.dismiss()
            MyLog.d("获取的商友:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, BusinessFriendEntity::class.java).data
                mList.clear()
                mCopyList.clear()
                entity?.let { list ->
                    mList.addAll(list)
                    mCopyList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            } else {
                showToast(data.msg)
            }
        })
        mViewModel.error.observe(this,  {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        //保存按钮回调(抽屉)
        mViewModel.saveGroupResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("保存回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                //关闭抽屉
                mGroupSettingDL.closeDrawer(GravityCompat.END)
                //刷新横向列表
                handlerHorizontalGroup()

                showToast("操作成功")
            } else {
                showToast(data.msg)
            }
        })
        mGroupSettingDL.bottomCannotClick()
    }

    override fun click() {
        //添加商友
        mAddFriendTV.setOnClickListener {
            startActivity<AddBusinessFriendActivity>()
        }
        //选择分组 打开抽屉
        mSearchGroupIV.setOnClickListener {
            mGroupSettingDL.openDrawer(GravityCompat.END)
        }
        //保存(抽屉)
        mItemSaveTV.setOnClickListener {
            allIsFine = false
            //保存固定列表的选项
            val friendGroupEntity = BusinessFriendGroupEntity(mFixGroupList)
            val json = getGson().toJson(friendGroupEntity)
            //将列表转为json后保存为sp
            json.sharedSave(MyConstants.FIX_GROUP_LIST)
            //将修改后的状态上传到服务器
            mViewModel.bulkEditGroup(mCustomGroupList)
        }
        mSearchET.handlerText {
            if (it.isEmpty()) {
                mList.clear()
                mList.addAll(mCopyList)
                mAdapter.notifyDataSetChanged()
            } else {
                mList.clear()
                mCopyList.forEach { entity ->
                    //搜索匹配三个字段 真名 昵称 备注名称
                    if (it in entity.realName.handlerNull() || it in entity.orgname.handlerNull() || it in entity.friendRemark.handlerNull()) {
                        mList.add(entity)
                    }
                }
                mAdapter.notifyDataSetChanged()
            }
        }
    }


    //刷新固定列表保存的数据
    fun setFixGroup(list: ArrayList<BusinessFriendGroupEntity.DataBean>) {
        mFixGroupList.clear()
        mFixGroupList.addAll(list)
        mFixGroupAdapter.notifyDataSetChanged()
    }

    //刷新自定义列表保存的数据
    fun setCustomGroup(list: ArrayList<BusinessFriendGroupEntity.DataBean>) {
        mCustomGroupList.clear()
        mCustomGroupList.addAll(list)
        mCustomGroupAdapter.notifyDataSetChanged()
    }

    //编辑自定义分组
    fun settingCustomGroup() {
        startActivity<CustomGroupSettingActivity>()
    }

    //横向列表中固定列表被选中
    override fun findByFixIndustry(industry: String, industryName: String) {
        preSearch = 1
        currentSelect = industry
        MyLog.d("当前是啥:::::::::::${industryName}")
        loading.show()
        mViewModel.findByIndustry(industry)
    }

    //横向自定义列表被选中
    override fun findByCustomId(id: Int) {
        preSearch = 2
        currentSelect = id.toString()
        MyLog.d("当前是啥:::::::::::${id}")
        loading.show()
        mViewModel.findByIndustry(id)
    }

    //查询所有
    override fun findAll(industry: String, industryName: String) {
        preSearch = 0
        currentSelect = industryName
        loading.show()
        mViewModel.findAll()
    }


    private var mData: BusinessFriendEntity.DataBean? = null

    //item点击事件
    override fun onItemClick(data: BusinessFriendEntity.DataBean) {
        //如果是来自聊天页面则吧数据返回
        if (returnToChart) {
            val intent = Intent()
            intent.putExtra(MyConstants.BUSINESS_FRIEND, getGson().toJson(data))
            setResult(MyConstants.BUSINESS_FRIEND_CODE, intent)
            finish()
        } else {
            mData = data
            check()
        }
    }

    private fun check() {
        startActivity<PersonInfoActivity>(
            MyConstants.FRIEND_USER_ID to mData?.uid,
            MyConstants.COMPANY_ID to mData?.companyId,
            MyConstants.MY_IMAGE_URL to mData?.imageUrl
        )
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_APPLY_CODE) {
            check()
        }
    }


}