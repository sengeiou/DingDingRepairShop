package com.android.ctgapp.activity.mine.team

import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import kotlinx.android.synthetic.main.activity_management_team_menu.*
import org.jetbrains.anko.startActivity

class ManagementTeamMenuActivity : BaseActivity() {
    override fun event() {

    }

    override fun click() {
        //员工管理
        mStaffManagementLL.setOnClickListener {
            startActivity<ManagementTeamActivity>()
        }
        //职位管理
        mPositionManagementLL.setOnClickListener {
            startActivity<SelectPositionActivity>()
        }
        //部门管理
        mDepartmentManagementLL.setOnClickListener {
            startActivity<DepartmentSelectActivity>()
        }

    }

    override fun getLayout() = R.layout.activity_management_team_menu

}