package com.android.ctgapp.activity.mine.team

import android.app.AlertDialog
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.adapter.mine.DepartmentAdapter
import com.android.ctgapp.adapter.mine.DepartmentHorizontalAdapter
import com.android.ctgapp.entity.DepartmentHorizontalEntity
import com.android.ctgapp.entity.DepartmentListEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.DepartmentAddDialog
import com.yanzhenjie.recyclerview.SwipeMenuCreator
import com.yanzhenjie.recyclerview.SwipeMenuItem
import kotlinx.android.synthetic.main.activity_department_select.*

/**
 *作者:LiBW
 *创建日期: 2020/10/19
 *描述: 部门选择 页面
 */
class DepartmentSelectActivity : BaseActivity(), DepartmentAddDialog.DepartmentAddListener, DepartmentHorizontalAdapter.HorizontalListener {
    //最外层是0
    private var currentDepartmentId = 0
    private val mViewModel: DepartmentSelectViewModel by lazy { ViewModelProvider(this)[DepartmentSelectViewModel::class.java] }
    val mList = ArrayList<DepartmentListEntity.DataBean>()
    private var mAdapter: DepartmentAdapter? = null
    private val mHorizontalList = ArrayList<DepartmentHorizontalEntity>()
    private val mHorizontalAdapter: DepartmentHorizontalAdapter by lazy { DepartmentHorizontalAdapter(this, mHorizontalList, this) }
    private var currentSelectName = ""
    private var currentSelectId = -1

    var preSelectId=-1
    //是否包含回调 默认包含回调
//    private val hasResult: Boolean by lazy { intent.getBooleanExtra(MyConstants.HAS_RESULT, true) }


    override fun event() {
        currentSelectId = intent.getIntExtra(MyConstants.DEPARTMENT_ID, -1)
        currentSelectName = intent.getStringExtra(MyConstants.DEPARTMENT).handlerNull()
        //没有选择的时候隐藏下部标签
        if (currentSelectName.isEmpty()) {
            mDeleteIV.visibility = View.INVISIBLE
            mLabelCreateET.visibility = View.INVISIBLE
        } else {
            mLabelCreateET.text = currentSelectName
        }

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
        mDepartmentRV.setOnItemMenuClickListener { menuBridge, adapterPosition ->
            menuBridge.closeMenu()
            val data = mList[adapterPosition]
            //菜单位置 0为编辑 1为删除
            when (menuBridge.position) {
                0 -> {
                    DepartmentAddDialog(this, data.id).show(supportFragmentManager, "")
                }
                1 -> {
                    MyLog.d("删除的分组ID:${data.id}")
                    AlertDialog.Builder(this).setTitle("确认删除该分组么")
                        .setPositiveButton("确认") { _, _ ->
                            loading.show()
                            mViewModel.deleteDepartment(data.id)
                        }.setNegativeButton("返回") { _, _ ->
                        }.show()
                }
            }
        }
        //打开侧滑功能
        mDepartmentRV.isItemViewSwipeEnabled = false
        //设置侧滑菜单
        mDepartmentRV.setSwipeMenuCreator(mSwipeMenuCreator)
        mDepartmentRV.layoutManager = LinearLayoutManager(this)
        mDepartmentRV.adapter = mAdapter
        val footView = LayoutInflater.from(this).inflate(R.layout.item_rv_tip, null, false)
        val param = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        footView.layoutParams = param
        footView.alpha = 0.5f
        mDepartmentRV.addFooterView(footView)
        //横向列表
        mDepartmentHorizontalRV.adapter = mHorizontalAdapter
        mDepartmentHorizontalRV.layoutManager = GridLayoutManager(this, 1, LinearLayoutManager.HORIZONTAL, false)
        loading.show()
        mViewModel.getDepartment(currentDepartmentId)
        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        //部门列表
        mViewModel.departmentListResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("列表:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, DepartmentListEntity::class.java).data
                entity?.let { list ->
                    mList.clear()
                    mList.addAll(list)
                    repeat(mList.size) { position ->
                        val d = mList[position]
                        if (d.id == currentSelectId) {
                            mList[position].isSelect = true
                        }
                    }
                    mAdapter = DepartmentAdapter(this, mList)
                    mDepartmentRV.layoutManager = LinearLayoutManager(this)
                    mDepartmentRV.adapter = mAdapter
                }
            } else {
                showToast(data.msg)
            }
        })

        //添加部门
        mViewModel.addDepartmentResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("添加部门回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("添加成功")
                loading.show()
                mViewModel.getDepartment(currentDepartmentId)
            } else {
                showToast(data.msg)
            }
        })
        //通用回调
        mViewModel.result.observe(this, Observer {
            loading.dismiss()
            MyLog.d("通用回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("操作成功")
                loading.show()
                mViewModel.getDepartment(currentDepartmentId)
            } else {
                showToast(data.msg)
            }
        })
    }

    override fun click() {
        //首页
        mHomeTV.setOnClickListener {
            currentDepartmentId = 0
            loading.show()
            mViewModel.getDepartment(currentDepartmentId)
            mHorizontalList.clear()
            mHorizontalAdapter.notifyDataSetChanged()
        }
        //添加部门
        mAddDepartmentTV.setOnClickListener {
            DepartmentAddDialog(this).show(supportFragmentManager, "")
        }
        mAddDepartmentLL.setOnClickListener {
            mAddDepartmentTV.performClick()
        }

        //删除当前所选标签
        mDeleteIV.setOnClickListener {
            mDeleteIV.visibility = View.INVISIBLE
            mLabelCreateET.visibility = View.INVISIBLE
            currentSelectId = -1
            currentSelectName = ""
            preSelectId=-1
            mList.forEach { item ->
                if (item.isSelect) item.isSelect = false
            }
            mAdapter?.notifyDataSetChanged()
        }

        //确认
        mConfirmBTN.setOnClickListener {
            if (currentSelectName.isEmpty()) {
                showToast("请选择一个部门")
            } else {
                val intent = Intent()
                intent.putExtra(MyConstants.DEPARTMENT, currentSelectName)
                intent.putExtra(MyConstants.DEPARTMENT_ID, currentSelectId)
                setResult(1001, intent)
                finish()
            }
        }
    }


    fun verticalItem(departmentId: Int, departmentName: String) {
        currentDepartmentId = departmentId
        mHorizontalList.add(DepartmentHorizontalEntity(departmentName, departmentId))
        mHorizontalAdapter.notifyDataSetChanged()
        loading.show()
        mViewModel.getDepartment(departmentId)
    }

    fun itemSelectResult(departmentId: Int, departmentName: String) {
        currentSelectId = departmentId
        currentSelectName = departmentName
        mLabelCreateET.text = departmentName
        if (departmentId != -1 && departmentName.isNotEmpty()) {
            mLabelCreateET.visibility = View.VISIBLE
            mDeleteIV.visibility = View.VISIBLE
        } else {
            mLabelCreateET.visibility = View.INVISIBLE
            mDeleteIV.visibility = View.INVISIBLE
        }
    }

    //添加部门
    override fun addDepartment(departmentName: String) {
        if (currentDepartmentId == -1) {
            loading.show()
            mViewModel.addDepartment(departmentName)
        } else {
            MyLog.d("添加的父ID:$currentDepartmentId")
            loading.show()
            mViewModel.addDepartment(departmentName, currentDepartmentId)
        }
    }

    override fun editDepartment(departmentName: String, departmentId: Int) {
        MyLog.d("修改的id:$departmentId")
        loading.show()
        mViewModel.editDepartment(departmentName, departmentId)
    }

    override fun getLayout() = R.layout.activity_department_select

    //横向监听
    override fun onItemClickListener(index: Int, departmentId: Int) {
        val list = ArrayList<DepartmentHorizontalEntity>()
        repeat(index + 1) {
            list.add(mHorizontalList[it])
        }
        mHorizontalList.clear()
        mHorizontalList.addAll(list)
        mHorizontalAdapter.notifyDataSetChanged()
        loading.show()
        mViewModel.getDepartment(departmentId)
    }
}