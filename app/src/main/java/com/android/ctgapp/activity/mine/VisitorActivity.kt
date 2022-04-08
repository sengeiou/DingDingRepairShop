package com.android.ctgapp.activity.mine

import android.graphics.Color
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.VisitorAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.mine.DescribeLineBean
import com.android.ctgapp.entity.mine.VisitorLineEntity
import com.android.ctgapp.entity.mine.VisitorListEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.ChartDetailDescribe
import com.ethanhua.skeleton.Skeleton
import com.ethanhua.skeleton.SkeletonScreen
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.ValueFormatter
import kotlinx.android.synthetic.main.activity_visitor.*


/**
 *作者:LiBW
 *创建日期: 1/3/21
 *描述: 访客 页面
 */
class VisitorActivity : BaseActivity() {
    private val mViewModel: VisitorViewModel by lazy { ViewModelProvider(this)[VisitorViewModel::class.java] }

    private val mList = ArrayList<VisitorListEntity.DataBean>()
    private val mAdapter by lazy { VisitorAdapter(this, mList) }


    private val profitPoint = ArrayList<Entry>()
    private val lineList = ArrayList<VisitorLineEntity.DataBean.VisitorsBean>()
    //骨架屏不能直接用在折线图上
    private var skeleton: SkeletonScreen? = null
    private var skeletonCard: SkeletonScreen? = null
    override fun event() {
        mVisitorRV.adapter = mAdapter
        mVisitorRV.layoutManager = LinearLayoutManager(this)
        skeleton = Skeleton.bind(mVisitorRV).adapter(mAdapter).load(R.layout.sk_visitor_list)
            .shimmer(true)//是否开启动画
            .angle(30)//shimmer的倾斜角度
            .frozen(true)//true则表示显示骨架屏时，RecyclerView不可滑动，否则可以滑动
            .duration(1000)//动画时间，以毫秒为单位
            .count(6)//显示骨架屏时item的个数
            .color(R.color.white_color)
            .show()



        mViewModel.getLine()
        mViewModel.getList()

        mViewModel.listResult.observe(this, Observer {
            MyLog.d("访客列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, VisitorListEntity::class.java).data
                data?.let { list ->
                    mList.clear()
                    mList.addAll(list)
                    skeleton?.hide()
                }
            }
        })
        mViewModel.lineResult.observe(this, Observer {
            MyLog.d("访客折线图:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, VisitorLineEntity::class.java).data
                val count = data?.visitTotalNum
                //总访问量
                mAllCountTV.text = "${count ?: "未知"}"
                data?.visitors?.let { list ->
                    lineList.clear()
                    lineList.addAll(list)
                    for (i in list.indices) {
                        profitPoint.add(Entry(i.toFloat(), list[i].visitNum.toFloat()))
                    }
                    initProfitChart()
                }
            }
        })

        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })
    }

    override fun click() {

    }

    //初始化利润趋势图图表
    private fun initProfitChart() {
        //设置点和图例
        val profitDataSet = LineDataSet(profitPoint, "")
        //设置线条颜色
        profitDataSet.color = ContextCompat.getColor(this, R.color.colorAccent)
        //圆点颜色
        profitDataSet.setCircleColor(ContextCompat.getColor(this, R.color.colorAccent))
        //圆点大小
        profitDataSet.circleRadius = 1f
        //不画圆
        profitDataSet.setDrawCircles(true)
        //线条宽度
        profitDataSet.lineWidth = 2f
        //曲线和直线
        profitDataSet.mode = LineDataSet.Mode.LINEAR
        //文字大小
        profitDataSet.valueTextSize = 10f
        //填充颜色
        profitDataSet.setDrawFilled(false)
        //将线添加进ListData
        val profitData = LineData(profitDataSet)
        //显示圆点文字
        profitData.setDrawValues(false)
        //设置利润趋势图
        mVisitorLineChart.data = profitData
        //设置样式右边的y轴禁用 禁左侧则axisLeft
        val profitRightAxis = mVisitorLineChart.axisRight
        profitRightAxis.isEnabled = false
        //设置x轴
        val profitXAxis = mVisitorLineChart.xAxis
        profitXAxis.textColor = Color.parseColor("#333333")
        profitXAxis.textSize = 8f
        profitXAxis.axisMinimum = 0f
        profitXAxis.setDrawAxisLine(true)//是否绘制X轴线
        profitXAxis.setDrawGridLines(false)//设置x轴上每个点对应的竖线线
        profitXAxis.setDrawLabels(true)//绘制标签  指x轴上的对应数值
        profitXAxis.position = XAxis.XAxisPosition.BOTTOM//设置x轴的显示位置
        //X轴文字间距 让X轴文字全显示
//        profitXAxis.setLabelCount(profitPoint.size / 2, false)


//        //单独设置X轴数值
//        val xList = ArrayList<String>()
////        for (i in 1..31) {
////            xList.add(i.toString())
////        }
//        xList.clear()
//        lineList.forEach {
//            xList.add("有点意思"+it.visitDate.handlerNull())
//        }

        //X轴数值
        profitXAxis.valueFormatter = object : ValueFormatter() {
            override fun getFormattedValue(value: Float): String {
//                return "${value.toInt() + 1}"
                return "${lineList[value.toInt()].dayOfMonth.handlerNull()}日"
            }
        }
        //透明化图例
        val legend = mVisitorLineChart.legend
        legend.form = Legend.LegendForm.NONE
        legend.textColor = Color.TRANSPARENT
        //隐藏x轴描述
        val description = Description()
        description.isEnabled = false
        mVisitorLineChart.description = description
        //禁止缩放
        mVisitorLineChart.isScaleXEnabled = false
        mVisitorLineChart.isScaleYEnabled = false
        //X轴缩放比例
//        mVisitorLineChart.viewPortHandler.matrixTouch.postScale(2f, 1f)
        val profitDataList = ArrayList<DescribeLineBean>()
        lineList.forEach {
            profitDataList.add(DescribeLineBean("${it.visitNum.handlerNull()}人访问", it.visitDate.handlerNull()))
        }
        //详细描述
        val detailDescribe = ChartDetailDescribe(this, R.layout.item_detial_line_chart, profitDataList)//点击边缘自动调整布局
        detailDescribe.chartView = mVisitorLineChart
        mVisitorLineChart.marker = detailDescribe
        //刷新
        mVisitorLineChart.invalidate()
        //隐藏骨架
        skeletonCard?.hide()
    }

    override fun getLayout() = R.layout.activity_visitor
}