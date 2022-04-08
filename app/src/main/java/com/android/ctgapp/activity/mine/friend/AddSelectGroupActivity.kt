package com.android.ctgapp.activity.mine.friend

import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.AddBFSelectGroupAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.FriendGroupEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_add_select_group.*

/**
 *作者:LiBW
 *创建日期: 2020/10/13
 *描述:选择分组 页面 (添加商友选择自定义分组)
 */
class AddSelectGroupActivity : BaseActivity() {

    var currentSelectId = -1
    var currentSelectName = ""
    private val mViewModel: AddSelectGroupViewModel by lazy { ViewModelProvider(this)[AddSelectGroupViewModel::class.java] }

    override fun event() {
        loading.show()
        //获取列表
        mViewModel.getGroup()
        mViewModel.groupResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("自定义分组:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, FriendGroupEntity::class.java).data
                entity?.let { list ->
                    val mAdapter = AddBFSelectGroupAdapter(this, list)
                    mGroupRV.adapter = mAdapter
                    mGroupRV.layoutManager = LinearLayoutManager(this)
                }
            } else {
                showToast(data.msg)
            }

        })
        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
    }

    override fun click() {
        //保存
        mSaveBTN.setOnClickListener {
            when {
                currentSelectId == -1 -> showToast("请选择分组")
                currentSelectName.isEmpty() -> showToast("请选择分组")
                else -> {
                    val intent = Intent()
                    intent.putExtra(MyConstants.GROUP_NAME, currentSelectName)
                    intent.putExtra(MyConstants.GROUP_ID, currentSelectId)
                    setResult(1000, intent)
                    finish()
                }
            }
        }
    }

    override fun getLayout() = R.layout.activity_add_select_group


}