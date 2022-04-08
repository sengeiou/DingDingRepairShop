package com.android.ctgapp.http

import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseApplication
import io.reactivex.Observable
import okhttp3.MultipartBody
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*
import java.util.*

/**
 *作者:LiBW
 *创建日期: 2020/8/15
 *描述: Retrofit接口接口
 */
interface ApiService {
    /***图片上传通用接口*/
    @Multipart
    @POST("/urm_v3/system/upload")
    fun uploadImage(@Header("token") token: String, @Part img: MultipartBody.Part): Call<ResponseBody>

    /***上传文件回带原文件名*/
    @Multipart
    @POST("/urm_v3/system/upload")
    fun uploadFileReturnOldFileName(@Header("token") token: String, @Part img: ArrayList<MultipartBody.Part>): Call<ResponseBody>

    //获取验证码
    @POST("/urm_v3/system/codeSms/{telephone}/{type}")
    fun getAuth(@Path("telephone") telephone: String, @Path("type") type: String): Call<ResponseBody>

    //短信登录
    @POST("/urm_v3/user/{loginType}/login")
    fun loginAuth(@Path("loginType") loginType: String, @Body body: RequestBody): Call<ResponseBody>

    //密码登录
    @POST("/urm_v3/user/{loginType}/login")
    fun loginPass(@Path("loginType") loginType: String, @Body body: RequestBody): Call<ResponseBody>

    //忘记密码
    @FormUrlEncoded
    @PUT("/urm_v3/user/resetPassword")
    fun forgetPassword(@Field("telephone") telephone: String, @Field("code") code: String, @Field("password") password: String): Call<ResponseBody>

    /***注册*/
    @POST("/urm_v3/user/register")
    fun register(@Body body: RequestBody): Call<ResponseBody>

    /***获取公司详细信息*/
    @GET("/urm_v3/company/{companyId}")
    fun getCompanyDetail(@Header("token") token: String, @Path("companyId") companyId: Int): Call<ResponseBody>

    /***获取公司详细信息*/
    @GET("/urm_v3/company/{companyId}")
    fun getCompanyInfo(@Path("companyId") companyId: Int, @Header("token") token: String = BaseApplication.userToken): Observable<ResponseBody>

    /***查询自己的公司*/
    @GET("/urm_v3/company/")
    fun getMyCompany(@Header("token") token: String): Call<ResponseBody>

    /***获取用户信息(我的页面头像昵称手机号)*/
    @GET("/urm_v3/userinfo/")
    fun getUserInfo(@Header("token") token: String): Call<ResponseBody>

    /***获取用户信息*/
    @GET("/urm_v3/userinfo/{userId}")
    fun getUserInfo(@Header("token") token: String, @Path("userId") userId: Int): Call<ResponseBody>

    /***修改用户信息(我的页面头像昵称手机号)*/
    @PUT("/urm_v3/userinfo/")
    fun updateUserInfo(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***修改企业信息*/
    @PUT("/urm_v3/company/")
    fun updateCompanyDetail(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***修改企业信息*/
    @PUT("/urm_v3/company/updateDetailInfo")
    fun updateCompanyDetailV2(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**解散或退出企业*/
    @POST("/urm_v3/company/quitOrDissolve/{companyId}")
    fun leaveOrDissolveCompany(@Header("token") token: String, @Path("companyId") companyId: Int): Call<ResponseBody>

    /**设置默认企业*/
    @FormUrlEncoded
    @PUT("/urm_v3/user/setDefaultCompanyId")
    fun setDefaultCompany(@Header("token") token: String, @Field("userId") userId: Int, @Field("defaultCompanyId") defaultCompanyId: Int): Call<ResponseBody>

    /***修改密码*/
    @FormUrlEncoded
    @PUT("/urm_v3/user/updatePassword")
    fun changePassword(@Header("token") token: String, @Field("oldPassword") oldPassword: String, @Field("newPassword") newPassword: String): Call<ResponseBody>

    /***获取自定义商友分组*/
    @GET("/urm_v3/userFriend/group")
    fun getCustomFriendGroup(@Header("token") token: String): Call<ResponseBody>

    /***删除自定义商友分组*/
    @DELETE("/urm_v3/userFriend/group/{groupId}")
    fun deleteGroup(@Header("token") token: String, @Path("groupId") groupId: Int): Call<ResponseBody>

    /***编辑商友*/
    @FormUrlEncoded
    @PUT("/urm_v3/userFriend/{friendUserId}")
    fun updateBusinessFriend(
        @Header("token") token: String, @Path("friendUserId") friendUserId: Int, @Field("groupId") groupId: Int?, @Field("friendRemark") friendRemark: String
    ): Call<ResponseBody>

    /***添加自定义商友分组*/
    @POST("/urm_v3/userFriend/group/{groupName}")
    fun addGroup(@Header("token") token: String, @Path("groupName") groupName: String): Call<ResponseBody>

    /***修改自定义商友分组*/
    @PUT("/urm_v3/userFriend/group/{groupId}/{groupName}")
    fun updateGroup(@Header("token") token: String, @Path("groupId") groupId: Int, @Path("groupName") groupName: String): Call<ResponseBody>

    /***批量修改自定义商友分组(修改选中状态)*/
    @PUT("/urm_v3/userFriend/group")
    fun bulkUpdateGroup(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***获取所有商友列表*/
    @GET("/urm_v3/userFriend/")
    fun getFriendALL(@Header("token") token: String): Call<ResponseBody>

    /***获取所有商友列表*/
    @GET("/urm_v3/userFriend/")
    fun getAllFriendId(@Header("token") token: String = BaseApplication.userToken): Observable<ResponseBody>


    /***获取商友列表(固定分组 修理厂等)*/
    @GET("/urm_v3/userFriend/{industry}")
    fun getFriendByIndustry(@Header("token") token: String, @Path("industry") industry: String): Call<ResponseBody>

    /***获取商友列表(自定义吩咐 id)*/
    @GET("/urm_v3/userFriend/{groupId}")
    fun getFriendById(@Header("token") token: String, @Path("groupId") groupId: Int): Call<ResponseBody>

    /***获取当前所有商友手机号*/
    @GET("/urm_v3/userFriend/telephones")
    fun getFriendsPhoneNum(@Header("token") token: String): Call<ResponseBody>

    /***添加商友*/
    @FormUrlEncoded
    @POST("/urm_v3/userFriend/{friendUserId}")
    fun addBusinessFriend(
        @Header("token") token: String,
        @Path("friendUserId") friendUserId: Int,
        @Field("groupId") groupId: Int?,
        @Field("friendRemark") friendRemark: String?

    ): Call<ResponseBody>

    /**访客列表*/
    @GET("/urm_v3/visitor/")
    fun getVisitorList(@Header("token") token: String, @Query("userId") userId: Int, @Query("day") day: Int): Call<ResponseBody>

    /**访客折线图*/
    @GET("/urm_v3/visitor/statistics/{userId}/{day}")
    fun getVisitorLine(@Header("token") token: String, @Path("userId") userId: Int, @Path("day") day: Int): Call<ResponseBody>


    /***商友邀请*/
    @POST("/urm_v3/userFriend/invication/{telephone}")
    fun inviteUser(@Header("token") token: String, @Path("telephone") telephone: String): Call<ResponseBody>


    /***获取商友详细信息*/
//    @GET("/urm_v3/userFriend/user/{friendUserId}")
//    fun getFriendInfo(@Header("token") token: String, @Path("friendUserId") friendUserId: Int): Call<ResponseBody>

    /**获取名片详细信息 融合接口 可以查询商友和团队成员*/
    @GET("/urm_v3/card/userinfo")
    fun getUserInfoV2(@Header("token") token: String, @Query("cardUserId") cardUserId: Int, @Query("visitorId") visitorId: Int): Call<ResponseBody>

    /***获取商友详细信息*/
    @GET("/urm_v3/userFriend/friend/{userId}")
    fun getChartFriendInfo(@Header("token") token: String, @Path("userId") friendUserId: Int): Call<ResponseBody>

    /***删除商友*/
    @DELETE("/urm_v3/userFriend/{friendUserId}")
    fun businessFriendDelete(@Header("token") token: String, @Path("friendUserId") friendUserId: Int): Call<ResponseBody>

    /***获取部门成员*/
    @GET("/urm_v3/department/{departmentId}/user")
    fun getDepartments(@Header("token") token: String, @Path("departmentId") departmentId: Int, @Query("condition") condition: String? = null, @Query("isResponseman") isResponseman: Boolean? = null, @Query("positionLabelId") positionLabelId: Int?): Call<ResponseBody>

    @GET("/urm_v3/department/user")
    fun getDepartments(@Header("token") token: String, @Query("condition") condition: String? = null, @Query("isResponseman") isResponseman: Boolean? = null, @Query("positionLabelId") positionLabelId: Int?): Call<ResponseBody>

    /***获取职位标签*/
    @GET("/urm_v3/groupLabel/{groupType}")
    fun getLabels(@Header("token") token: String, @Path("groupType") groupType: String, @Query("companyId") companyId: Int): Call<ResponseBody>

    /***添加职位标签*/
    @POST("/urm_v3/groupLabel/{groupType}/{label}")
    fun addLabel(@Header("token") token: String, @Path("groupType") groupType: String, @Path("label") label: String): Call<ResponseBody>


    /***查询企业未添加为对外联系人*/
    @GET("/urm_v3/company/notadded/linkman")
    fun getCompanyContactUnAdd(@Header("token") token: String, @Query("realName") realName: String?, @Query("pageNum") pageNum: Int, @Query("pageSize") pageSize: Int): Call<ResponseBody>

    /***查询部门*/
    @GET("/urm_v3/department/{parentDepartmentId}")
    fun getDepartmentMenu(@Header("token") token: String, @Path("parentDepartmentId") parentDepartmentId: Int): Call<ResponseBody>

    /***查询所有部门*/
    @GET("/urm_v3/department/")
    fun getDepartmentMenu(@Header("token") token: String): Call<ResponseBody>

    /***添加部门*/
    @POST("/urm_v3/department/{parentDepartmentId}/{name}")
    fun addDepartment(@Header("token") token: String, @Path("parentDepartmentId") parentDepartmentId: Int, @Path("name") name: String): Call<ResponseBody>

    /***添加部门*/
    @POST("/urm_v3/department/{name}")
    fun addDepartment(@Header("token") token: String, @Path("name") name: String): Call<ResponseBody>

    /***删除部门*/
    @DELETE("/urm_v3/department/{departmentId}")
    fun deleteDepartment(@Header("token") token: String, @Path("departmentId") departmentId: Int): Call<ResponseBody>

    /***编辑部门名称*/
    @PUT("/urm_v3/department/{departmentId}/{name}")
    fun updateDepartment(@Header("token") token: String, @Path("departmentId") departmentId: Int, @Path("name") name: String): Call<ResponseBody>

    /***添加部门成员*/
    @POST("/urm_v3/department/user/")
    fun addMember(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**查询所有公司下的所有成员*/
    @GET("/urm_v3/userCompany/allCompanyUsers")
    fun getAllCorporator(@Header("token") token: String, @Query("name") name: String? = null): Call<ResponseBody>

    /**查询所有公司下的所有成员*/
    @GET("/urm_v3/userCompany/allCompanyUsers")
    fun getAllComponyUser(@Header("token") token: String = BaseApplication.userToken): Observable<ResponseBody>

    /***修改部门成员*/
    @PUT("/urm_v3/department/user/{userId}")
    fun editMember(@Header("token") token: String, @Path("userId") userId: Int, @Body body: RequestBody): Call<ResponseBody>

    /**移除部门成员  */
    @DELETE("/urm_v3/department/user/{userId}")
    fun removeMember(@Header("token") token: String, @Path("userId") userId: Int): Call<ResponseBody>

    /***获取客户列表*/
    @GET("/urm_v3/supplierClient/{clientType}/{searchType}")
    fun getClientList(@Header("token") token: String, @Path("clientType") clientType: String, @Path("searchType") searchType: String, @Query("condition") condition: String, @Query("pageNum") pageNum: Int, @Query("pageSize") pageSize: Int): Call<ResponseBody>

    /**移除客户关系*/
    @DELETE("/urm_v3/supplierClient/{clientType}/{clientId}")
    fun removeClient(
        @Path("clientType") clientType: String,
        @Path("clientId") clientId: String,
        @Header("token") token: String = BaseApplication.userToken
    ): Call<ResponseBody>

    /***获取客户列表(添加和未添加)*/
    @GET("/urm_v3/supplierClient/{clientType}/company/{searchType}")
    fun getClientForAdd(
        @Header("token") token: String, @Path("clientType") clientType: String, @Path("searchType") searchType: String, @Query("pageNum") pageNum: Int, @Query("pageSize") pageSize: Int, @Query("orgname") orgname: String?, @Query("industry") industry: String?
    ): Call<ResponseBody>

    /***添加客户*/
    @POST("/urm_v3/supplierClient/{clientType}/{clientId}")
    fun addClient(@Header("token") token: String, @Path("clientType") clientType: String, @Path("clientId") clientId: Int): Call<ResponseBody>

    /**添加客户(供应商) 邀请码*/
    @FormUrlEncoded
    @POST("/urm_v3/supplierClient/{clientType}/invitationCode")
    fun addClientWithAuth(@Header("token") token: String, @Path("clientType") clientType: String, @Field("code") code: String): Call<ResponseBody>

    /***经营范围(企业)*/
    @GET("/urm_v3/company/range")
    fun getCompanyRange(@Header("token") token: String): Call<ResponseBody>

//    /***经营品牌(企业)*/
//    @GET("/urm_v3/company/range/brand")
//    fun getCompanyBrand(@Header("token") token: String): Call<ResponseBody>
//
//    /***经营厂牌(企业)*/
//    @GET("/urm_v3/company/range/factory")
//    fun getCompanyFactory(@Header("token") token: String): Call<ResponseBody>

    /***获取对外联系人(企业)*/
    @GET("/urm_v3/company/{companyId}/linkman")
    fun getLinkman(@Header("token") token: String, @Path("companyId") companyId: Int): Call<ResponseBody>

    @GET("/urm_v3/company/{companyId}/linkman")
    fun getLinkman(@Path("companyId") companyId: Int,@Header("token") token: String=BaseApplication.userToken):  Observable<ResponseBody>

    /***修改企业对外联系人(企业)*/
    @PUT("/urm_v3/company/updateCompanyLinkman")
    fun updateLinkman(@Header("token") token: String, @Query("id") id: Int, @Query("linkmanRemark") linkmanRemark: String): Call<ResponseBody>

    /***删除企业对外联系人*/
    @DELETE("/urm_v3/company/removeCompanyLinkman")
    fun deleteLinkman(
        @Header("token") token: String, @Query("id") id: Int
    ): Call<ResponseBody>

    /***添加企业对外联系人(企业)*/
    @FormUrlEncoded
    @POST("/urm_v3/company/linkman/{linkmanId}")
    fun addLinkman(@Header("token") token: String, @Path("linkmanId") linkmanId: Int, @Field("linkmanRemark") linkmanRemark: String): Call<ResponseBody>

    /***获取开票信息(企业)*/
    @GET("/urm_v3/companyInfo/invoiceInfo/{companyId}")
    fun getInvoiceInfo(@Header("token") token: String, @Path("companyId") companyId: Int): Call<ResponseBody>

    /***创建开票信息(企业)*/
    @POST("/urm_v3/companyInfo/invoiceInfo")
    fun createInvoiceInfo(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***修改开票信息(企业)*/
    @PUT("/urm_v3/companyInfo/invoiceInfo")
    fun updateInvoiceInfo(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***获取轮播图*/
    @GET("/urm_v3/banner/getAppBanner")//联盟ID 和修理厂ID
    fun getBanner(
        @Header("token") token: String,
        @Query("allianceId") allianceId: Int? = null,
        @Query("repairCompanyId") repairCompanyId: Int
    ): Call<ResponseBody>

    /***获取通知*/
    @GET("/urm_v3/notice/getAppNotice")
    fun getNotice(
        @Header("token") token: String,
        @Query("allianceId") allianceId: Int?,
        @Query("repairCompanyId") repairCompanyId: Int
    ): Call<ResponseBody>



    /***商品列表 包含侧边栏列表*/
    @POST("/goodsService/ctgGoods/getGoodsListByCategoryNameOrQueryCtgApp")
    fun getGoods(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken,
    ): Call<ResponseBody>

    /***商品列表 包含侧边栏列表*/
    @POST("/goodsService/ctgGoods/getGoodsListByCategoryNameOrQueryCtgApp/V2")
    fun getGoodsWL(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken,
    ): Call<ResponseBody>


    /***商品列表 包含侧边栏列表*/
    @POST("/goodsService/ctgGoods/getGoodsListByCategoryNameOrQueryCtgApp/V3")
    fun getGoodsForSearch(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken,
    ):Observable<ResponseBody>

    /**易损件商城 点击分类后获取商品其他属性*/
    @POST("/goodsService/ctgGoods/getGoodsListValue")
    fun findAttrAfterCategory(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken,
    ): Call<ResponseBody>


    /**经销商制造商 操作审核等*/
    @FormUrlEncoded
    @PUT("/orderService_v2/ctgReturnOrder/check/{returnOrderId}/{returnStatus}")
    fun returnOrderCommon(
        @Header("token") token: String, @Path("returnOrderId") returnOrderId: String?, @Path("returnStatus") returnStatus: String,
        @Field("logisticsName") logisticsName: String?,
        @Field("logisticsNo") logisticsNo: String?
    ): Call<ResponseBody>


    /**Banner 点击查询商品*/
    @POST("/goodsService/ctgGoods/getBannerGoodsList")
    fun getGoodsByBanner(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken,
    ): Call<ResponseBody>

    /**Banner 点击查询商品*/
    @POST("/goodsService/ctgGoods/getBannerGoodsList/V2")
    fun getGoodsByBannerWL(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken,
    ): Call<ResponseBody>


    /**VIN码商场获取列表数据*/
    @POST("/goodsService/ctgGoods/getGoodsListByVinCtgApp")
    fun getGoodsByVin(
        @Header("token") token: String,
        @Body body: RequestBody
    ): Call<ResponseBody>

    /**VIN码商城获取列表数据*/
    @POST("/goodsService/ctgGoods/getGoodsListByVinCtgApp/V2")
    fun getGoodsByVinWL(
        @Header("token") token: String,
        @Body body: RequestBody
    ): Call<ResponseBody>

    /**获取热销商品*/
    @GET("/goodsService/ctgGoods/getHotGoodsList")
    fun getHotGoods(@Header("token") token: String, @Query("searchType") searchType: Int, @Query("allianceId") allianceId: Int): Call<ResponseBody>

    /**获取热销商品*/
    @GET("/goodsService/ctgGoods/getHotGoodsList/V2")
    fun getHotGoodsWL(@Header("token") token: String, @Query("searchType") searchType: Int, @Query("allianceId") allianceId: Int): Call<ResponseBody>


    /***获取商品详情*/
    @FormUrlEncoded
    @POST("/goodsService/ctgGoods/getGoodsInfoByGoodIdCtgApp")
    fun getGoodsDetail(@Header("token") token: String, @Field("goodId") goodId: String, @Field("companyID") companyID: String, @Field("searchType") searchType: Int): Call<ResponseBody>

    /***新增购物车*/
    @POST("/orderService_v2/ctgShoppingCart/")
    fun goodsAddTrolley(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***查看购物车*/
    @FormUrlEncoded
    @POST("/goodsService/ctgGoods/getShoppingCartInfoByCompanyId")
    fun getTrolley(
        @Header("token") token: String, @Field("companyId") companyID: Int,
        @Field("searchType") searchType: Int = BuildConfig.GOODS_SEARCH_TYPE
    ): Call<ResponseBody>

    /***修改购物车*/
    @PUT("/orderService_v2/ctgShoppingCart/")
    fun trolleyChangeCount(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***删除购物车*/
    @HTTP(method = "DELETE", path = "/orderService_v2/ctgShoppingCart/", hasBody = true)
    fun trolleyDelete(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***获取订单 state:1待付款  2待发货 3待收货 4待评价  7已取消 9退款中*/
    @GET("/orderService_v2/ctgOrder/")
    fun getOrder(
        @Header("token") token: String, @Query("page") page: Int, @Query("buyerCompanyId") buyerCompanyId: Int, @Query("sellerCompanyId") sellerCompanyId: Int, @Query("state") state: Int?
    ): Call<ResponseBody>

    /***获取订单*/
    @GET("/orderService_v2/ctgOrder/page")
    fun getOrder2(
        @Header("token") token: String,
        @Query("buyerCompanyId") buyerCompanyId: Int,
        @Query("pageNum") pageNum: Int,
        @Query("pageSize") pageSize: Int,
        @Query("state") state: Int?
    ): Call<ResponseBody>

    /***批量修改选中状态(购物车)*/
    @PUT("/orderService_v2/ctgShoppingCart/batch")
    fun changesSelect(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>


    /***公司查询以及设置过是否允许挂账记录*/
    @POST("/financeServiceV2/ctgOnCredit/getRecordToGoods")
    fun shoppingSupportWithCredit(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

//    /**验证订单是否可以挂账*/
//    @GET("/orderService_v2/ctgOrder/verifyCredit/{orderId}")
//    fun findOrderSupportWithCredit(@Header("token") token: String, @Path("orderId") orderId: String): Call<ResponseBody>

    //十分支持白条支付 阿兴去掉的阿亮的接口
    @GET("/orderService_v2/ctgOrder/verifyCreditNew/{orderId}")
    fun findOrderSupportWithCreditV2(@Header("token") token: String, @Path("orderId") orderId: String): Call<ResponseBody>

    /***查询收货地址*/
    @GET("/urm_v3/deliveryAddress/")
    fun getAddress(@Header("token") token: String): Call<ResponseBody>

    /***添加收货地址*/
    @POST("/urm_v3/deliveryAddress/")
    fun createAddress(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***修改收货地址*/
    @PUT("/urm_v3/deliveryAddress/{id}")
    fun updateAddress(@Header("token") token: String, @Path("id") id: String, @Body body: RequestBody): Call<ResponseBody>

    /***删除收货地址*/
    @DELETE("/urm_v3/deliveryAddress/{id}")
    fun deleteAddress(@Header("token") token: String, @Path("id") id: String): Call<ResponseBody>

    /***提交订单*/
    @POST("/orderService_v2/ctgOrder/confirmOrder")
    fun createOrder(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>


    /***获取订单详情*/
    @GET("/orderService_v2/ctgOrder/get/{orderId}")
    fun getOrderDetail(@Header("token") token: String, @Path("orderId") orderId: String, @Query("isNeedOrderDetail") isNeedOrderDetail: Int = 1): Call<ResponseBody>
    /***获取订单详情2*/
    @GET("/orderService_v2/ctgOrder/get/")
    fun getOrderDetail(@Header("token") token: String, @Query("isNeedOrderDetail") isNeedOrderDetail: Int = 1, @Query("orderNo") orderNo: String): Call<ResponseBody>
    /***获取订单详情*/
    @GET("/orderService_v2/ctgOrder/get/")
    fun getOrderDetailWhitBar(@Header("token") token: String, @Query("orderNo") orderNo: String, @Query("isNeedOrderDetail") isNeedOrderDetail: Int = 1): Call<ResponseBody>


    /***付成功后立即调用，确认订单确实完成*/
    @FormUrlEncoded
    @POST("/orderService_v2/ctgOrder/orderConfirm")
    fun afterPay(@Header("token") token: String, @Field("orderId") orderId: String, @Field("payWay") payWay: Int): Call<ResponseBody>

    /**批量还款后立即调用确认订单完成*/
    @FormUrlEncoded
    @POST("/orderService_v2/ctgOrder/repayOrderBatchConfirm")
    fun returnMoreSuccessCheck(@Header("token") token: String, @Field("orderId") orderId: String): Call<ResponseBody>

//    /**单独还款后立即调用确认还款完成*/
//    @FormUrlEncoded
//    @POST("/orderService_v2/ctgOrder/repayOrderBatchConfirm")
//    fun returnSingleSuccessCheck(@Header("token") token: String, @Field("orderId") orderId: String): Call<ResponseBody>

    /***继续支付*/
    @POST("/orderService_v2/ctgOrder/confirmOrderPay")
    fun continueToPay(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**提前还款详情*/
    @GET("/financeServiceV2/ctgOnCreditRecord/getNobillAppList")
    fun prepaymentDetail(@Header("token") token: String, @Query("clientId") clientId: Int, @Query("pageNum") pageNum: Int, @Query("pageSize") pageSize: Int): Call<ResponseBody>


    /**挂账订单单个还款*/
    @POST("/orderService_v2/ctgOrder/repay")
    @FormUrlEncoded
    fun whiteBarReturnSingle(@Header("token") token: String, @Field("orderId") orderId: String, @Field("repayWay") repayWay: Int): Call<ResponseBody>

    /**挂账订单多个还款*/
    @POST("/orderService_v2/ctgOrder/repayBatch")
    fun whiteBarReturnMore(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***取消订单*/
    @PUT("/orderService_v2/ctgOrder/cancel/{orderId}")
    fun cancelOrder(@Header("token") token: String, @Path("orderId") orderId: String): Call<ResponseBody>

    /**挂账还款成功后立即调用，确认订单确实完成*/
    @FormUrlEncoded
    @POST("/orderService_v2/ctgOrder/repayOrderConfirm")
    fun whiteBarPayFinish(@Header("token") token: String, @Field("orderId") orderId: String): Call<ResponseBody>

//    /***获取可以使用的代金券*/
//    @POST("/orderService_v2/ctgVoucherCompany/accessAvailable")
//    fun getCouponCanUse(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>
    /***获取可以使用的代金券*/
    @POST("/marketingService/voucher/getVoucherAvailable")
    fun getCouponCanUse(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>
    /***查看可退货列表*/
    @GET("/orderService_v2/ctgOrder/unRefund/{orderId}")
    fun getCanRefund(@Header("token") token: String, @Path("orderId") orderId: String): Call<ResponseBody>

    /***确认收货*/
    @PUT("/orderService_v2/ctgOrder/receive/{orderId}")
    fun confirmGetGoods(@Header("token") token: String, @Path("orderId") orderId: String): Call<ResponseBody>

    /***申请退货*/
    @Multipart
    @POST("/orderService_v2/ctgReturnOrder/{orderId}")
    fun applyForRefund(@Header("token") token: String, @Path("orderId") orderId: String, @Part file: ArrayList<MultipartBody.Part>): Call<ResponseBody>

    /***查询退货列表*///退货状态（1-已申请 2-同意退货 3-拒绝退货 4-  验货不通过 5-已收货 6-退款完成 7-已取消 8-退款中
    @GET("/orderService_v2/ctgReturnOrder/")
    fun getSalesReturn(
        @Header("token") token: String,
        @Query("buyerCompanyId") buyerCompanyId: String,
        @Query("pageNum") pageNum: Int,
        @Query("pageSize") pageSize: Int,
        @Query("returnStatus") returnStatus: Int? = null,
        @Query("isFinished") isFinished: Boolean?,
        @Query("checkStatus") checkStatus: Int? = null
    ): Call<ResponseBody>


    /***查询退货单*///退货详情
    @GET("/orderService_v2/ctgReturnOrder/{returnOrderId}")
    fun getReturnGoodsDetail(@Header("token") token: String, @Path("returnOrderId") orderId: String): Call<ResponseBody>
    /***查询退货单*///退货详情
    @GET("/orderService_v2/ctgReturnOrder/getReturnOrder")
    fun getReturnGoodsDetailV2(@Header("token") token: String, @Query("returnNo") returnNo: String): Call<ResponseBody>
    /***撤销撤销退货单*/
    @DELETE("/orderService_v2/ctgReturnOrder/{returnOrderId}")
    fun cancelReturnGoodsOrder(@Header("token") token: String, @Path("returnOrderId") returnOrderId: String): Call<ResponseBody>

    /***修改退货*/
    @Multipart
    @PUT("orderService_v2/ctgReturnOrder/{returnOrderId}")
    fun changeForRefund(@Header("token") token: String, @Path("returnOrderId") returnOrderId: String, @Part file: ArrayList<MultipartBody.Part>): Call<ResponseBody>

    /***获取认证结果*/
    @GET("/urm_v3/userinfo/identification")
    fun getCertificationResult(@Header("token") token: String): Call<ResponseBody>

    /***创建认证*/
    @POST("/urm_v3/userinfo/identification")
    fun createCertification(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**主修车系查询*///传  CAR_SERIES 是查所有车系   REPAIRSHOP_GRADE查汽修厂等级
    @GET("/urm_v3/dict/{dcode}")
    fun getDict(@Header("token") token: String, @Path("dcode") dcode: String): Call<ResponseBody>


    /**查询公司通用接口*/
    @GET("/urm_v3/company/common/{searchType}")
    fun getCompany(@Header("token") token: String, @Path("searchType") searchType: String, @Query("industry") industry: String): Call<ResponseBody>

    /***修改认证*/
    @PUT("/urm_v3/userinfo/identification")
    fun updateCertification(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***查询可切换公司列表*/
    @GET("/urm_v3/userCompany/company/list")
    fun getCompanyListCanChange(@Header("token") token: String, @Query("industry") industry: String): Call<ResponseBody>

    /***切换公司*/
    @POST("/urm_v3/user/{loginType}/switchCompany/{companyId}")
    fun changeCompany(@Header("token") token: String, @Path("loginType") loginType: String, @Path("companyId") companyId: Int, @Body body: RequestBody): Call<ResponseBody>

    /***创建公司*/
    @POST("/urm_v3/company/")
    fun createCompany(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***查询加入企业列表*///like 传模糊搜索的key 此处为orgname
    @GET("/urm_v3/company/{industry}/unjoin/")
    fun getCompanyCanJoin(
        @Header("token") token: String, @Path("industry") industry: String, @Query("orgname") orgname: String?, @Query("pageNum") pageNum: Int, @Query("pageSize") pageSize: Int
    ): Call<ResponseBody>

    /**获取公司认证信息*/
    @GET("/urm_v3/company/identification")
    fun getCompanyAuditInfo(@Header("token") token: String, @Query("companyId") companyId: Int): Call<ResponseBody>

    /**创建企业认证*/
    @POST("/urm_v3/company/identification")
    fun createCompanyAudit(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**修改企业认证*/
    @PUT("/urm_v3/company/identification")
    fun updateCompanyAudit(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***列表申请加入公司*/
    @POST("/urm_v3/userCompany/audit/{companyId}")
    fun applyJoinCompany(@Header("token") token: String, @Path("companyId") companyId: Int): Call<ResponseBody>

    /***邀请码加入公司*/
    @POST("/urm_v3/user/joinCompany")
    fun joinCompanyByCode(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***账户信息查询(企业)*/
    @GET("/urm_v3/company/account/info/{companyId}")
    fun getAccountInfo(@Header("token") token: String, @Path("companyId") companyId: Int): Call<ResponseBody>

    /***账户信息新增/修改(企业)*/
    @POST("/urm_v3/company/account/info")
    fun createAccountInfo(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**账户信息修改(企业)*/
    @PUT("/urm_v3/company/account/info")
    fun updateAccountInfo(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***获取余额*/ //1 个人，type 2 联盟 ，type 3 企业
    @POST("financeServiceV2/ctgApp/getBalance")
    fun getCompanyBalance(@Header("token") token: String, @Query("type") type: Int, @Body body: RequestBody): Call<ResponseBody>

    /***余额提现充值记录*///1 个人，type 2 联盟 ，type 3 企业
    @GET("/financeServiceV2/ctgApp/queryCashDetial")
    fun getCompanyBalanceDetail(@Header("token") token: String, @Query("allianceId") allianceId: Int, @Query("companyId") companyId: Int, @Query("type") type: Int, @Query("pageSize") pageSize: Int, @Query("pageNum") pageNum: Int): Call<ResponseBody>

    /***余额充值*/
    @POST("/financeServiceV2/ctgApp/recharge")
    fun topUpBalance(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***获取联盟(获取已/未添加的联盟 isAdded)*/
    @GET("/urm_v3/alliance/")
    fun getAlliance(@Header("token") token: String, @Query("isAdded") isAdded: Boolean?, @Query("orgname") orgname: String?): Call<ResponseBody>


    /***离开联盟*/
    @DELETE("/urm_v3/alliance/{allianceId}/quit")
    fun quiteAlliance(@Header("token") token: String, @Path("allianceId") allianceId: Int): Call<ResponseBody>

    /***申请加入联盟*/
    @POST("/urm_v3/company/audit/{companyAuditType}")
    fun applyJoinAlliance(@Header("token") token: String, @Path("companyAuditType") companyAuditType: String, @Body body: RequestBody): Call<ResponseBody>

//    /***查询优惠券*/
//    @GET("/orderService_v2/ctgVoucherCompany/")
//    fun getCoupons(
//        @Header("token") token: String, @Query("companyId") companyId: Int, @Query("isOverdue") isOverdue: Int?//是否已使用。0：未使用。 1：已使用。
//        , @Query("isUsed") isUsed: Int? //是否已使用。0：未使用。 1：已使用。
//        , @Query("pageNum") pageNum: Int, @Query("pageSize") pageSize: Int
//    ): Call<ResponseBody>
    /***查询优惠券*/
    @GET("/marketingService/voucher/getVoucherByStatus")
    fun getCoupons(
        @Header("token") token: String, @Query("companyId") companyId: String
        , @Query("clientId") clientId: String
        , @Query("status") status: Int
    ): Call<ResponseBody>
    /***查询用户 */
    @GET("/urm_v3/userinfo/common/{serachType}")
    fun findUser(@Header("token") token: String, @Path("serachType") serachType: String, @Query("telephone") telephone: String): Call<ResponseBody>

    /***查询白条*/
    @GET("/financeServiceV2/ctgWhite/whiteList")
    fun findWhiteBar(@Header("token") token: String, @Query("companyId") companyId: Int): Call<ResponseBody>

    /**未出账账单*/
    @GET("/financeServiceV2/ctgOnCreditRecord/getNobillApp")
    fun getNoBillList(@Header("token") token: String, @Query("clientId") clientId: Int): Call<ResponseBody>

    @GET("/financeServiceV2/ctgOnCreditRecord/getDteListApp")
    fun findWhiteBarV2(@Header("token") token: String, @Query("pageNum") pageNum: Int, @Query("pageSize") pageSize: Int): Call<ResponseBody>


    /**查询挂账账单总页面*/
    @POST("/financeServiceV2/ctgBill/getCtgBill")
    fun getWhiteBar(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**挂账账单详情*/
    @POST("/financeServiceV2/ctgBill/getCtgBillList")
    fun getWhiteBarDetail(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**挂账账单详情子页面*/
    @POST("/financeServiceV2/ctgBill/getCtgBillDetailList")
    fun getWhiteBarDetailChild(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**挂账交易详情 4级*/
    @POST("/financeServiceV2/ctgBill/getDetail")
    fun getWhiteBarDetail4(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**确认对账*/
    @FormUrlEncoded
    @POST("/financeServiceV2/ctgBillCycle/confirm")
    fun whiteConfirm(
        @Header("token") token: String,
        @Field("billNum") billNum: String,
        @Field("type") type: Int,////1 确认对账   . 0 取消对账
        @Field("flag") flag: Int,////0 修理厂  1 经销商            对联盟来说 0 是修理厂   1 是联盟
    ): Call<ResponseBody>

    /***企业的用户申请*/
    @GET("/urm_v3/userCompany/audit")
    fun getCompanyApply(@Header("token") token: String, @Query("pageSize") pageSize: Int, @Query("pageNum") pageNum: Int): Call<ResponseBody>

    /***企业处理用户的申请*/
    @PUT("/urm_v3/userCompany/audit/{auditId}/{isPass}")
    fun handlerUserApply(@Header("token") token: String, @Path("auditId") auditId: Int, @Path("isPass") isPass: Boolean): Call<ResponseBody>

    /***app更新检测*/
    @POST("/urm_v3/appVersionInfo/checkForUpdate")
    fun updateAppCheck(@Body body: RequestBody): Call<ResponseBody>

    /***充值校验*///type 1 个人，type 2 联盟 ，type 3 企业//cashChangeNo 充值订单号
    @GET("financeServiceV2/ctgApp/chongConfirm")
    fun topUpCheck(
        @Header("token") token: String, @Query("cashChangeNo") cashChangeNo: String, @Query("companyId") companyId: Int, @Query("type") type: Int
    ): Call<ResponseBody>

    /********************询报价***********************/
    /**获取询报价匹配到的供应商*/
    @GET("/urm_v3/supplierClient/client/{clientId}/supplier/{supplierType}/carRange/{carRange}")
    fun queryGetCompany(
        @Path("carRange") carRange: String,
        @Path("supplierType") supplierType: String = "all",
        @Path("clientId") clientId: Int = BaseApplication.companyId,
        @Header("token") token: String = BaseApplication.userToken
    ): Call<ResponseBody>

    /**发布询价单*/
    @POST("/orderService_v2/ctgEnquiry/save")
    fun submitEnquiryOrder(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken
    ): Call<ResponseBody>

    /**多图上传*/
    @Multipart
    @POST("orderService_v2/img/upload")
    fun enquiryUploadImage(
        @Part img: ArrayList<MultipartBody.Part>,
        @Header("token") token: String = BaseApplication.userToken
    ): Call<ResponseBody>

    /**获取询价记录*/
    @GET("/orderService_v2/ctgEnquiry/page")
    fun getQueryList(
        @Query("enquiryStatus") enquiryStatus: Int?,//询价单状态 0草稿单 1待报价 2已失效 3已报价 4已完成
        @Query("pageNum") pageNum: Int,
//        @Query("allianceId") allianceId: Int = BaseApplication.allianceId,//为了后期区分汽修联盟(针对集采中心)
        @Query("createCompanyId") createCompanyId: Int = BaseApplication.companyId,
        @Query("pageSize") pageSize: Int = 20,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**查询询价单详情*/
    @GET("/orderService_v2/ctgEnquiry/{enquiryId}")
    fun getQueryDetail(
        @Path("enquiryId") enquiryId: Int,
        @Query("displayMode") displayMode: Int? = null,//显示模式1按照公司2按照零件
        @Query("isNeedEnquiryDetail") isNeedEnquiryDetail: Int = 1,
        @Query("isNeedEnquiryAllTarget") isNeedEnquiryAllTarget: Int = 1,
        @Query("isNeedQuotationDetail") isNeedQuotationDetail: Int = 1,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**新增询价意向单/更新询价意向单*/
    @POST("/orderService_v2/enquiryWishList/saveOrupdate")
    fun enquireAddWishOrder(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**查询询价意向单列表*/
    @GET("/orderService_v2/enquiryWishList/select/")
    fun enquireWishOrderList(
        @Query("enquiryId") enquiryId: Int,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**查询询价意向单列表详情*/
    @GET("/orderService_v2/enquiryWishList/get")
    fun enquireWishOrderListDetail(
        @Query("wishListId") wishListId: Int,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>




    /********************联盟***********************/
    /**获取联盟下所有成员*/
    @GET("/urm_v3/alliance/{allianceId}/{companyNature}/{searchType}")
    fun getAllAllianceCompany(
        @Path("allianceId") allianceId: Int,
        @Path("companyNature") companyNature: String = "company",
        @Path("searchType") searchType: String = "list",
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>


    /********************消息***********************/
    /**查询系统消息*/
    @GET("/msg-service/message/notification")
    fun getSystemNotifyList(
        @Query("pageNum") pageNum: Int,
        @Query("pageSize") pageSize: Int = 20,
        @Query("companyId") companyId: Int = BaseApplication.companyId,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**查询系统消息未读数量*/
    @GET("/msg-service/message/notification")
    fun getSystemNotifyUnread(
        @Query("pageNum") pageNum: Int,
        @Query("pageSize") pageSize: Int = 20,
        @Query("isRead") isRead: Int = 0,
        @Query("companyId") companyId: Int = BaseApplication.companyId,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**系统消息已读*/
    @PUT("/msg-service/message/setMsgRead")
    fun readSystemNotify(
        @Query("messageId") messageId: String,
        @Query("type") type: String = "OPTION",
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**系统消息已读(全部已读)*/
    @PUT("/msg-service/message/setMsgRead")
    fun readSystemNotifyAll(
        @Query("type") type: String = "ALL",
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**删除系统消息*/
    @DELETE("/msg-service/message/info")
    fun deleteSystemNotify(
        @Query("messageId") messageId: String,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    //交易流水
    @FormUrlEncoded
    @POST("financeServiceV2/ctgBusinessRunningRecord/getorderList")
    fun JiaoyiLiuShui(
        @Field("companyId") companyId: String,
        @Field("orgName") orgName: String,
        @Field("pageNum") pageNum: Int,
        @Field("pageSize") pageSize: Int,
        @Field("payWay") payWay: String,
        @Field("invoiceType") invoiceType: String,
        @Field("actionType") actionType: String,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    //守信企业
    @POST("financeServiceV2/ctgBill/getIsAllow")
    fun shouxinqiye(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>


    /********************首页***********************/
    /**品牌分类*/
    @GET("/goodsService/ctgGoods/getHotGoodsBrand")
    fun homeBrandMenu(
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**询报价检测匹配供应商*/
    @GET("urm_v3/repairAlliance/belong")
    fun enquireCheckCompany(
        @Query("vin") vin: String,
        @Query("carBrand") carBrand: String,
        @Query("carFactory") carFactory: String,
        @Query("companyId") companyId: Int = BaseApplication.companyId,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**获取公司所有用户*/
    @GET("/urm_v3/userCompany/user/{searchType}")
    fun getCompanyAllUser(
        @Path("searchType") searchType: String = "baseInfo",
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    @PUT("/urm_v3/supplierClient/updateSupplierClientExtraInfo")
    fun saveTagManagerShare(
        @Query("clientId") clientId: Int,
        @Query("responsiblePersonFlag") responsiblePersonFlag: Boolean = false,
        @Query("labelFlag") labelFlag: Boolean = false,
        @Query("toUserIdFlag") toUserIdFlag: Boolean = false,
        @Query("responsiblePersonId") responsiblePersonId: String? = null,
        @Query("labelIds") labelIds: String? = null,
        @Query("toUserIds") toUserIds: String? = null,
        @Query("supplierId") supplierId: Int = BaseApplication.companyId,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /*************数据部接口******************/
    /**Vin码获取车辆详细信息*/
//    @POST("goodsService/api/parseVin/v3.
    @POST("/goodsService/epc/parseVin/v3.1")
    fun getCarByVIN(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /***VIN码获取车辆详情信息WL专用*/
    @POST("/goodsService/epc/parseVininfo/v3.1")
    fun getCarByVINWL(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>


    /**获取车同轨精简分类(仿汽修宝)*/
//    @POST("goodsService/epc/getCtgSimpleGroup/v3.1")
    @POST("goodsService/api/getCtgSimpleGroup/v3.0")
    fun batchAddParts(@Header("token") token: String): Call<ResponseBody>



    /**获取适用BOM数据*/
    @POST("/goodsService/epc/getBomData/v3.1")
    fun searchBathAddParts(@Header("token") token: String, @Body body: RequestBody): Call<ResponseBody>

    /**EPC左侧边栏*/
    @POST("goodsService/epc/getEpcMainGroup/v3.1")
    fun epcGetLeftMenu(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**EPC右侧菜单*/
    @POST("/goodsService/epc/getEpcSubGroup/v3.1")
    fun epcGetRightMenu(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>

    /**EPC右侧菜单点进二级页面*/
    @POST("/goodsService/epc/getBomData/v3.1")
    fun getEpcSecondList(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken
    ): Observable<ResponseBody>



    /**app查询储值卡/代金券*/
    @GET("/marketingService/voucher/appInfo")
    fun rechargeDetail(@Header("token") token: String,@Query("companyId") clientId: Int): Call<ResponseBody>
    /**app查询充值活动*/
    @GET("/marketingService/voucher/appRecharge")
    fun rechargeActvity(@Header("token") token: String,@Query("companyId") companyId: String,@Query("clientId") clientId: String): Call<ResponseBody>
    /**app查询储值卡余额*/
    @GET("/marketingService/storedCard/getStoredCardAmount")
    fun getStoredCardAmount(@Header("token") token: String,@Query("companyId") companyId: String,@Query("clientId") clientId: String): Call<ResponseBody>
    /**app查询充值记录*/
//    @GET("/marketingService/rechargeRecord/rechargeRecord")
//    fun getRechargeRecord(@Header("token") token: String,@Query("companyId") companyId: String,@Query("clientId") clientId: String,@Query("search") search: String ): Call<ResponseBody>
    @GET("/marketingService/storedCard/grant/records")
    fun getRechargeRecord(@Header("token") token: String,@Query("companyId") companyId: String,@Query("erpClientId") clientId: String,@Query("search") search: String ,@Query("pageNum") pageNum: Int, @Query("pageSize") pageSize: Int): Call<ResponseBody>

    /**app预充值 生成流水号*/
    @POST("/marketingService/rechargeSerial/add")
    fun MakeRechargeSerial(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken
    ):Call<ResponseBody>
            //Observable<ResponseBody>
    /**充值....等通用接口*/
    @POST("/orderService_v2/ctgOrder/recharge")
    fun Recharge(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken
    ):Call<ResponseBody>

    /**充值.....等付成功后立即调用，确认确实完成*/
    @POST("/orderService_v2/ctgOrder/rechargeConfirm")
    fun RechargeConfirm(
        @Body body: RequestBody,
        @Header("token") token: String = BaseApplication.userToken
    ):Call<ResponseBody>
}
