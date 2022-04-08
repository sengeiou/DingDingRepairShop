package com.android.ctgapp.base

import android.app.Application
import android.content.Context
import com.android.ctgapp.BuildConfig.WX_APP_ID
import com.android.ctgapp.entity.home.BatchAddPartChildEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.entity.mine.WhiteBarMorePayBean
import com.android.ctgapp.enum.PayFromEnum
import com.android.ctgapp.util.*
import com.ocrgroup.utils.StreamUtil
import com.ocrgroup.utils.VinConfig
import com.ocrgroup.vin.VINAPI
import com.scwang.smartrefresh.layout.footer.ClassicsFooter
import com.scwang.smartrefresh.layout.header.ClassicsHeader
import com.squareup.leakcanary.LeakCanary
import com.tencent.bugly.crashreport.CrashReport
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import java.math.BigDecimal

/**
 *作者:LiBW
 *创建日期: 2020/9/1
 *描述: application基类
 */
open class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //通过清单文件配置
        //bugly测试阶段填true 发布时改为false
        CrashReport.initCrashReport(applicationContext)
        //内存泄漏检测
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
        context = this
        //初始化下拉刷新框架smartRefreshLayout显示的文字
        initRefresh()
        initVinScan()
        userToken = sharedGet(MyConstants.TOKEN, "") as String
        companyName = sharedGet(MyConstants.COMPANY_NAME, "") as String
        allianceId = sharedGet(MyConstants.ALLIANCE_ID, 0) as Int
        userId = sharedGet(MyConstants.USER_ID, 0) as Int
        companyId = sharedGet(MyConstants.COMPANY_ID, 0) as Int
        isCompanyAdmin = sharedGet(MyConstants.IS_MANAGER, false) as Boolean
        isCompanyCreator = sharedGet(MyConstants.IS_CREATOR, false) as Boolean
        currentCompanyIdSet.add(companyId.handlerNull())
        val api = WXAPIFactory.createWXAPI(this, WX_APP_ID, true)
        api.registerApp(WX_APP_ID)
        //初始化极光推送
    }

    companion object {
        //是否正在下载更新
        var isDownloadApk = false
        private var context: Application? = null

        fun getContext(): Context {
            return context!!
        }
        //极光推送标签Set
        val currentCompanyIdSet = HashSet<String>()
        //支付相关//
        //支付订单状态
        var orderPay = 0
        var orderId = ""
        var orderNum = ""
        var payWay = ""
        var price = ""
        var orderTime = ""
        var currentPayFrom: PayFromEnum? = null
        //聊天//
        var currentTalkTo = 0
        //其他全局//
        var userToken = ""
        var userId = 0
        //邀请码
        var inviteCode = ""
        var companyName = ""
        var allianceId = 0
        var companyId = 0
        //是否为公司管理员  创建者
        var isCompanyAdmin = false
        var isCompanyCreator = false
        //白条选中的所有订单
        var mWhiteBarSelectOrderNO = HashSet<String>()
        var mWhiteBarOrderNoSingle = ""
        //白条选中的总金额
        var mWhiteBarSelectMoney = BigDecimal("0")
        //选中的所有实体类 用于支付传给后台(疑似所有未选中的)
        var mWhiteBarAllBean = ArrayList<WhiteBarMorePayBean.Data>()
        //清除白条相关数据
        fun clearWhiteBarData() {
            mWhiteBarSelectOrderNO.clear()
            mWhiteBarSelectMoney = BigDecimal("0")
            mWhiteBarOrderNoSingle = ""
        }
        //询报价EPC页面选中的数据
        var enquireSelectPartsList = ArrayList<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>()
        //在线的好友
        val onLineFriendIds=HashSet<Int>()
        val allFriendIds=HashSet<Int>()
        //  储值卡
        var supplyCompanyId=""
        var clientCompanyId=""
        var activityId:Int ?=null
        //当前选中优惠券

    }

    private fun initRefresh() {
        //"下拉可以刷新"
        ClassicsHeader.REFRESH_HEADER_PULLING = "下拉可以刷新"
        //"正在刷新..."
        ClassicsHeader.REFRESH_HEADER_REFRESHING = "正在刷新"
        //"正在加载..."
        ClassicsHeader.REFRESH_HEADER_LOADING = "正在加载"
        //"释放立即刷新"
        ClassicsHeader.REFRESH_HEADER_RELEASE = "释放立即刷新"
        //"刷新完成"
        ClassicsHeader.REFRESH_HEADER_FINISH = "刷新完成"
        //"刷新失败"
        ClassicsHeader.REFRESH_HEADER_FAILED = "刷新失败"
        //"上次更新 M-d HH:mm"
        ClassicsHeader.REFRESH_HEADER_UPDATE = "上次更新 M-d HH:mm"
        //"释放进入二楼
        ClassicsHeader.REFRESH_HEADER_SECONDARY = "释放进入二楼"
        //"上拉加载更多"
        ClassicsFooter.REFRESH_FOOTER_PULLING = "上拉加载更多"
        //"释放立即加载"
        ClassicsFooter.REFRESH_FOOTER_RELEASE = "释放立即加载"
        //"正在刷新..."
        ClassicsFooter.REFRESH_FOOTER_LOADING = "正在刷新"
        //"正在加载..."
        ClassicsFooter.REFRESH_FOOTER_REFRESHING = "正在加载"
        //"加载完成"
        ClassicsFooter.REFRESH_FOOTER_FINISH = "加载完成"
        //"加载失败"
        ClassicsFooter.REFRESH_FOOTER_FAILED = "加载失败"
        //"全部加载完成"
        ClassicsFooter.REFRESH_FOOTER_NOTHING = "全部加载完成"
    }

    //扫描Vin码初始化
    private fun initVinScan() {
        /** 进入识别页面前必须加上，否则识别核心激活失败，返回错误码21，无法识别  */
        StreamUtil.initLicenseFile(this, VinConfig.licenseId)
        StreamUtil.initLicenseFile(this, VinConfig.nc_bin)
        StreamUtil.initLicenseFile(this, VinConfig.nc_dic)
        StreamUtil.initLicenseFile(this, VinConfig.nc_param)
        StreamUtil.initLicenseFile(this, VinConfig.nc_detect_bin)
        StreamUtil.initLicenseFile(this, VinConfig.nc_detect_param)
        val vinApi = VINAPI.getVinInstance()
        // 初始化核心
        val initKernalCode = vinApi.initVinKernal(this)
        if (initKernalCode == 0) {
            vinApi.VinSetRecogParam(0)
        } else {
            // 激活失败 错误码：解决方案详见开发文档
            showToast("VIN识别出错,请稍后再使用VIN码扫描功能")
        }
    }
}