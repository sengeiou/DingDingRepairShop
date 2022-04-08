package com.android.ctgapp.widget.dialog.company

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.View
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.jumpToChart
import com.android.ctgapp.adapter.mine.OrderCanChartAdapter
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.entity.LinkmanEntity
import com.android.ctgapp.entity.deal.ChatersBean
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.util.showToast
import com.android.ctgapp.util.toPx
import kotlinx.android.synthetic.main.item_order_can_chart.*
import java.util.ArrayList

/**
 *作者:LiBW
 *创建日期: 2021/11/23
 *描述:订单页面可以进行聊天的人
 */
class OrderDetailCanChartDialog(private val  list:List<ChatersBean>, private val companyName:String) : BaseDialogFragment(), OrderCanChartAdapter.OrderCanChartAdapterListener {
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        mContactsRV.adapter = OrderCanChartAdapter(requireActivity(), list, this)
        mContactsRV.layoutManager = LinearLayoutManager(requireContext())


        //关闭
        mDeleteIV.setOnClickListener {
            dismiss()
        }
    }
    override fun getLayout() = R.layout.item_order_can_chart

    override fun onStart() {
        super.onStart()

        val display= DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(display)
        //设置宽高占比
        val params = dialog!!.window!!.attributes
        //此处占满屏幕宽度
//        params.width = display.widthPixels
        params.height = RelativeLayout.LayoutParams.MATCH_PARENT
        params.gravity = Gravity.CENTER
        //高度自己定义
        val width=display.widthPixels*85/100
        if (list.size<5){
            val h=48f.toPx(requireContext())
            val height=h*(list.size+1)
            dialog!!.window!!.setLayout(width,height )
        }else{
            dialog!!.window!!.setLayout(width, display.heightPixels/2)
        }
    }

    override fun goTalk(position: Int) {
        val data=list[position]
        if (data.id==BaseApplication.userId){
            showToast("抱歉无法和自己聊天")
        }else{
            requireActivity().jumpToChart(data.id,data.name,"",companyName)
            dismiss()

        }
    }
}