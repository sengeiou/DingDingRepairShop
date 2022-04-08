package com.android.ctgapp.activity.mine.team

import android.view.inputmethod.EditorInfo
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.MyTeamAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.MyTeamEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_management_team.*
import org.jetbrains.anko.startActivity

/**
 * 作者:LiBW
 * 创建日期: 2/18/21
 * 描述:员工管理页面
 */
class ManagementTeamActivity : BaseActivity(), MyTeamAdapter.Listener {
    private val mViewModel: MyTeamViewModel by lazy { ViewModelProvider(this)[MyTeamViewModel::class.java] }
    private val mList = ArrayList<MyTeamEntity.DataBean>()
    private var mAdapter: MyTeamAdapter? = null
    private var mSearchText = ""

    override fun onResume() {
        super.onResume()
        getData()
    }

    private fun getData() {
        mList.clear()
        loading.show()
        mViewModel.getTeamList(mSearchText, null, null, -1)
    }

    override fun event() {
        mViewModel.result.observe(this, Observer { result ->
            loading.dismiss()
            MyLog.d("部门成员列表:$result")
            val data = initData(result)
            if (data.status == 0) {
                val entity = getGson().fromJson(result, MyTeamEntity::class.java).data
                entity?.let {
                    mList.clear()
                    mList.addAll(it)
                    mAdapter = MyTeamAdapter(this, mList, this, true)
                    mTeamRV.adapter = mAdapter
                    mTeamRV.layoutManager = LinearLayoutManager(this)
                }
            } else {
                showToast(data.msg)
            }
        })
    }

    override fun click() {
        mFinishBTN.setOnClickListener {
            finish()
        }
        //搜索框
        mSearchET.handlerText {
            mSearchText = it
            if (it.isEmpty()) {
                getData()
            }
        }
        //搜索框的搜索按钮
        mSearchET.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                //收起键盘
                hideEditTextView()
                getData()
            }
            false
        }
    }

    override fun getLayout() = R.layout.activity_management_team

    override fun onEditSelectListener(data: MyTeamEntity.DataBean) {
        startActivity<AddOrEditMemberActivity>(MyConstants.ITEM_ENTITY to getGson().toJson(data))
    }

    override fun onItemSelectListener(data: MyTeamEntity.DataBean) {

    }

//    override fun onGoToChart(data: MyTeamEntity.DataBean) {
//
//    }

}