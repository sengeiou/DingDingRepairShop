package com.android.ctgapp.activity.home.enquiry;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 4/21/21
 * 描述:询价 页面 询报价 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010X\u001a\u00020YH\u0016J\u001a\u0010Z\u001a\u00020Y2\u0010\b\u0002\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\\H\u0002J\u0010\u0010]\u001a\u00020Y2\u0006\u0010^\u001a\u00020\nH\u0016J\b\u0010_\u001a\u00020YH\u0016J\b\u0010`\u001a\u00020aH\u0016J\b\u0010b\u001a\u00020YH\u0002J\b\u0010c\u001a\u00020YH\u0002J\"\u0010d\u001a\u00020Y2\u0006\u0010e\u001a\u00020\n2\u0006\u0010f\u001a\u00020\n2\b\u0010g\u001a\u0004\u0018\u00010hH\u0014J\u0010\u0010i\u001a\u00020Y2\u0006\u0010j\u001a\u00020\nH\u0016J\b\u0010k\u001a\u00020YH\u0014J\u0010\u0010l\u001a\u00020Y2\u0006\u0010^\u001a\u00020\nH\u0016J\b\u0010m\u001a\u00020YH\u0014J\b\u0010n\u001a\u00020YH\u0014J\u0018\u0010o\u001a\u00020Y2\u0006\u0010p\u001a\u00020\n2\u0006\u0010^\u001a\u00020\nH\u0016J\u0010\u0010q\u001a\u00020Y2\u0006\u0010r\u001a\u00020sH\u0002J\u0018\u0010t\u001a\u00020Y2\u0006\u0010u\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\rR\u001b\u0010\u0016\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0017\u0010\rR#\u0010\u0019\u001a\n \u001a*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\rR\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\"\u001a\n \u001a*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b#\u0010\rR\u001b\u0010%\u001a\u00020&8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b\'\u0010(R\u001e\u0010*\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u0010\u000f\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\u000f\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020<0+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010=\u001a\u00020>8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\u000f\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020C0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020C0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010E\u001a\u00020F8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bI\u0010\u000f\u001a\u0004\bG\u0010HR\u001b\u0010J\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bL\u0010\u000f\u001a\u0004\bK\u0010\rR\u000e\u0010M\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010R\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u000e\u0010W\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006v"}, d2 = {"Lcom/android/ctgapp/activity/home/enquiry/EnquiryActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/BatchAddPartAdapter$AddPartCallback;", "Lcom/android/ctgapp/adapter/home/PurchaseAdapter$PurchaseCallback;", "Lcom/android/ctgapp/adapter/home/enquiry/EnquiryQueryCompanyAdapterAdapter$EnquiryQueryCompanyAdapterCallback;", "()V", "addPartsData", "", "addressDetail", "arrivalTimeCode", "", "carBrand", "getCarBrand", "()Ljava/lang/String;", "carBrand$delegate", "Lkotlin/Lazy;", "carFactory", "getCarFactory", "carFactory$delegate", "carId", "getCarId", "carId$delegate", "carIntro", "getCarIntro", "carIntro$delegate", "carRange", "kotlin.jvm.PlatformType", "getCarRange", "carRange$delegate", "city", "cityEntity", "Lcom/android/ctgapp/entity/CityEntity;", "currentAddressId", "district", "epc", "getEpc", "epc$delegate", "goEPC", "", "getGoEPC", "()Z", "goEPC$delegate", "imageFiles", "Ljava/util/ArrayList;", "Ljava/io/File;", "Lkotlin/collections/ArrayList;", "imageShowList", "mAdapter", "Lcom/android/ctgapp/adapter/home/PurchaseAdapter;", "mAddressViewModel", "Lcom/android/ctgapp/activity/home/shop/OrderConfirmViewModel;", "getMAddressViewModel", "()Lcom/android/ctgapp/activity/home/shop/OrderConfirmViewModel;", "mAddressViewModel$delegate", "mBinding", "Lcom/android/ctgapp/databinding/ActivityEnquiryBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityEnquiryBinding;", "mBinding$delegate", "mList", "Lcom/android/ctgapp/entity/home/BatchAddPartChildEntityV2$DataBean$PartsGroupBean;", "mQueryCompanyAdapter", "Lcom/android/ctgapp/adapter/home/enquiry/EnquiryQueryCompanyAdapterAdapter;", "getMQueryCompanyAdapter", "()Lcom/android/ctgapp/adapter/home/enquiry/EnquiryQueryCompanyAdapterAdapter;", "mQueryCompanyAdapter$delegate", "mQueryCompanyList", "Lcom/android/ctgapp/entity/home/EnquiryQueryCompanyEntityChild;", "mQueryCompanyListCopy", "mViewModel", "Lcom/android/ctgapp/activity/home/shop/EnquiryViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/shop/EnquiryViewModel;", "mViewModel$delegate", "mVin", "getMVin", "mVin$delegate", "name", "needInvoiceCode", "phone", "province", "qualityCode", "receiveTimeID", "getReceiveTimeID", "()I", "setReceiveTimeID", "(I)V", "requestCodePicker", "click", "", "confirmOrder", "list", "", "deleteItem", "position", "event", "getLayout", "Landroid/widget/LinearLayout;", "handlerAddress", "initImagePicker", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAddPartClick", "id", "onDestroy", "onItemDelete", "onPause", "onResume", "refreshCount", "number", "setData", "entity", "Lcom/android/ctgapp/entity/AddressEntity$DataBean;", "unKnowOeEdit", "oe", "app_ctgDebug"})
public final class EnquiryActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.BatchAddPartAdapter.AddPartCallback, com.android.ctgapp.adapter.home.PurchaseAdapter.PurchaseCallback, com.android.ctgapp.adapter.home.enquiry.EnquiryQueryCompanyAdapterAdapter.EnquiryQueryCompanyAdapterCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy mAddressViewModel$delegate = null;
    private final int qualityCode = 1001;
    private final int arrivalTimeCode = 1002;
    private final int needInvoiceCode = 1003;
    private final int requestCodePicker = 1004;
    private java.util.ArrayList<com.android.ctgapp.entity.home.BatchAddPartChildEntityV2.DataBean.PartsGroupBean> mList;
    private com.android.ctgapp.adapter.home.PurchaseAdapter mAdapter;
    private final java.util.ArrayList<java.lang.String> imageShowList = null;
    private final java.util.ArrayList<java.io.File> imageFiles = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.lang.String addPartsData = "";
    private final kotlin.Lazy carId$delegate = null;
    private final kotlin.Lazy epc$delegate = null;
    private final kotlin.Lazy carRange$delegate = null;
    private final kotlin.Lazy mVin$delegate = null;
    private final kotlin.Lazy carBrand$delegate = null;
    private final kotlin.Lazy carFactory$delegate = null;
    private final kotlin.Lazy carIntro$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.EnquiryQueryCompanyEntityChild> mQueryCompanyList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.EnquiryQueryCompanyEntityChild> mQueryCompanyListCopy = null;
    private final kotlin.Lazy mQueryCompanyAdapter$delegate = null;
    private java.lang.String province = "";
    private java.lang.String city = "";
    private java.lang.String district = "";
    private java.lang.String addressDetail = "";
    private java.lang.String name = "";
    private java.lang.String phone = "";
    private int currentAddressId = 0;
    private com.android.ctgapp.entity.CityEntity cityEntity;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy goEPC$delegate = null;
    private int receiveTimeID = 0;
    private java.util.HashMap _$_findViewCache;
    
    public EnquiryActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityEnquiryBinding getMBinding() {
        return null;
    }
    
    private final com.android.ctgapp.activity.home.shop.OrderConfirmViewModel getMAddressViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final com.android.ctgapp.activity.home.shop.EnquiryViewModel getMViewModel() {
        return null;
    }
    
    private final java.lang.String getCarId() {
        return null;
    }
    
    private final java.lang.String getEpc() {
        return null;
    }
    
    private final java.lang.String getCarRange() {
        return null;
    }
    
    private final java.lang.String getMVin() {
        return null;
    }
    
    private final java.lang.String getCarBrand() {
        return null;
    }
    
    private final java.lang.String getCarFactory() {
        return null;
    }
    
    private final java.lang.String getCarIntro() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.enquiry.EnquiryQueryCompanyAdapterAdapter getMQueryCompanyAdapter() {
        return null;
    }
    
    private final void handlerAddress() {
    }
    
    public final boolean getGoEPC() {
        return false;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public final int getReceiveTimeID() {
        return 0;
    }
    
    public final void setReceiveTimeID(int p0) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void setData(com.android.ctgapp.entity.AddressEntity.DataBean entity) {
    }
    
    private final void initImagePicker() {
    }
    
    private final void confirmOrder(java.util.List<java.lang.String> list) {
    }
    
    @java.lang.Override()
    public void onAddPartClick(int id) {
    }
    
    @java.lang.Override()
    public void refreshCount(int number, int position) {
    }
    
    @java.lang.Override()
    public void deleteItem(int position) {
    }
    
    @java.lang.Override()
    public void unKnowOeEdit(@org.jetbrains.annotations.NotNull()
    java.lang.String oe, int position) {
    }
    
    @java.lang.Override()
    public void onItemDelete(int position) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}