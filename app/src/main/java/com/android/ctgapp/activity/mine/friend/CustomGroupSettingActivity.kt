package com.android.ctgapp.activity.mine.friend

import android.app.AlertDialog
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.CustomGroupAdapterEmpty
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.FriendGroupEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.BusinessFriendGroupEditDialog
import com.yanzhenjie.recyclerview.*
import kotlinx.android.synthetic.main.activity_custom_group_setting.*

/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述:自定义分组 分组 页面
 */
class CustomGroupSettingActivity : BaseActivity(), BusinessFriendGroupEditDialog.GroupCallback {
    private val mViewModel: CustomGroupSettingViewModel by lazy { ViewModelProvider(this)[CustomGroupSettingViewModel::class.java] }

    //总体数据列表
    private val mList = ArrayList<FriendGroupEntity.DataBean>()
    private val mAdapter: CustomGroupAdapterEmpty by lazy { CustomGroupAdapterEmpty(this, mList) }




    override fun event() {
        val view = LayoutInflater.from(this).inflate(R.layout.item_rv_tip, null, false)
        val param = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        view.layoutParams = param
        view.alpha = 0.5f

        //为list添加侧滑菜单
        val mSwipeMenuCreator = SwipeMenuCreator { _, rightMenu, _ ->
            val editItem = SwipeMenuItem(this)
            editItem.text = "编辑"
            editItem.setTextColorResource(R.color.white)
            editItem.setBackgroundColorResource(R.color.blue_common)
            editItem.height = LinearLayout.LayoutParams.MATCH_PARENT
            editItem.width = 80f.toPx(this)
            rightMenu.addMenuItem(editItem)
            val deleteItem = SwipeMenuItem(this)
            deleteItem.text = "删除"
            deleteItem.setTextColorResource(R.color.white)
            deleteItem.setBackgroundColorResource(R.color.red_start)
            deleteItem.height = LinearLayout.LayoutParams.MATCH_PARENT
            deleteItem.width = 80f.toPx(this)
            rightMenu.addMenuItem(deleteItem)
        }
        //侧滑按钮监听
        mGroupRV.setOnItemMenuClickListener { menuBridge, adapterPosition ->
            menuBridge.closeMenu()
            val data = mList[adapterPosition]
            //菜单位置 0为编辑 1为删除
            when (menuBridge.position) {
                0 -> {
                    BusinessFriendGroupEditDialog(this, data.id, data.groupName).show(supportFragmentManager, "")
                }
                1 -> {
                    AlertDialog.Builder(this).setTitle("确认删除该商友分组么")
                        .setPositiveButton("确认") { _, _ ->
                            loading.show()
                            mViewModel.deleteGroup(mList[adapterPosition].id)
                        }.setNegativeButton("返回") { _, _ ->

                        }.show()
                }
            }
        }
        //打开侧滑功能
        mGroupRV.isItemViewSwipeEnabled = false
        //设置侧滑菜单
        mGroupRV.setSwipeMenuCreator(mSwipeMenuCreator)
        mGroupRV.layoutManager = LinearLayoutManager(this)
        mGroupRV.adapter = mAdapter

        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        loading.show()
        //获取自定义商友
        mViewModel.findCustomIndustry()
        mViewModel.customFriendGroup.observe(this, Observer {
            loading.dismiss()
            MyLog.d("自定义商友:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, FriendGroupEntity::class.java).data
                entity?.let { list ->
                    mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                    if (list.isEmpty()) {
                        mGroupRV.removeFooterView(view)

                    } else {
                        mGroupRV.removeFooterView(view)
                        mGroupRV.addFooterView(view)
                    }
                }
            } else {
                showToast(data.msg)
            }
        })
        //删除回调
        mViewModel.commonGroup.observe(this, Observer {
            loading.dismiss()
            MyLog.d("通用回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("操作成功")
                //刷新列表
                loading.show()
                //获取自定义商友
                mViewModel.findCustomIndustry()

            } else {
                showToast(it)
            }

        })
    }

    override fun click() {
        //添加分组
        mAddGroupTV.setOnClickListener {
            BusinessFriendGroupEditDialog(this).show(supportFragmentManager, "")
        }
    }

    override fun getLayout() = R.layout.activity_custom_group_setting

    //添加分组
    override fun addGroup(groupName: String) {
        loading.show()
        mViewModel.addGroup(groupName)
    }

    //编辑分组
    override fun editGroup(groupName: String, groupId: Int) {
        loading.show()
        mViewModel.editGroup(groupId, groupName)
    }

}