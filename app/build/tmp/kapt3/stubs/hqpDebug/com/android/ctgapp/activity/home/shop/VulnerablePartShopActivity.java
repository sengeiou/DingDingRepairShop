package com.android.ctgapp.activity.home.shop;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/4
 * 描述: VIN码商城 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020:H\u0016J\b\u0010>\u001a\u00020:H\u0016J\b\u0010?\u001a\u00020:H\u0002J\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020:H\u0002J\u0010\u0010C\u001a\u00020:2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020\rH\u0016J\u0018\u0010F\u001a\u00020:2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u0017H\u0016J\u0010\u0010I\u001a\u00020:2\u0006\u0010J\u001a\u00020\nH\u0016J\b\u0010K\u001a\u00020:H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00105\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\u0013\u001a\u0004\b6\u00107\u00a8\u0006L"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/VulnerablePartShopActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/GoodsMenuVinAdapter$MenuVinListener;", "Lcom/android/ctgapp/adapter/home/GoodsByVinAdapter$GoodsByVinListener;", "Lcom/android/ctgapp/widget/dialog/GoodsAddTrolleyDialog$AddTrolley;", "Lcom/android/ctgapp/adapter/home/BranderSelectAdapter$BranderSelectCallback;", "()V", "canRefresh", "", "ctgnum", "", "goodsList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/GoodsByVinEntity$DataBean$GoodsDetailVoPageBean$RecordsBean;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityVulnerablePartShopBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityVulnerablePartShopBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mBrandIdList", "Lcom/android/ctgapp/entity/home/GoodsByVinEntity$DataBean$BrandVOSListBean;", "mBrandSelectList", "", "mBranderSelectAdapter", "Lcom/android/ctgapp/adapter/home/BranderSelectAdapter;", "getMBranderSelectAdapter", "()Lcom/android/ctgapp/adapter/home/BranderSelectAdapter;", "mBranderSelectAdapter$delegate", "mGoodsAdapter", "Lcom/android/ctgapp/adapter/home/GoodsByVinAdapter;", "getMGoodsAdapter", "()Lcom/android/ctgapp/adapter/home/GoodsByVinAdapter;", "mGoodsAdapter$delegate", "mMenuAdapter", "Lcom/android/ctgapp/adapter/home/GoodsMenuVinAdapter;", "getMMenuAdapter", "()Lcom/android/ctgapp/adapter/home/GoodsMenuVinAdapter;", "mMenuAdapter$delegate", "mViewModel", "Lcom/android/ctgapp/activity/home/shop/VulnerablePartShopViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/shop/VulnerablePartShopViewModel;", "mViewModel$delegate", "menuList", "Lcom/android/ctgapp/entity/home/GoodsByVinEntity$DataBean$FcodeVOListBean;", "menuPopup", "Landroid/widget/PopupWindow;", "page", "query", "size", "sortPrice", "sortSales", "vin", "getVin", "()Ljava/lang/String;", "vin$delegate", "addGoodsToTrolley", "", "bean", "Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "click", "event", "getGoods", "getLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "initGoods", "itemSelect", "onAddTrolleyVinListener", "goods", "onBrandClick", "select", "position", "onPartSortSelect", "partId", "onResume", "app_hqpDebug"})
public final class VulnerablePartShopActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.GoodsMenuVinAdapter.MenuVinListener, com.android.ctgapp.adapter.home.GoodsByVinAdapter.GoodsByVinListener, com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog.AddTrolley, com.android.ctgapp.adapter.home.BranderSelectAdapter.BranderSelectCallback {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mBinding$delegate = null;
    private final kotlin.Lazy vin$delegate = null;
    private int page = 1;
    private int size = 20;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.GoodsByVinEntity.DataBean.GoodsDetailVoPageBean.RecordsBean> goodsList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.GoodsByVinEntity.DataBean.FcodeVOListBean> menuList = null;
    private final kotlin.Lazy mGoodsAdapter$delegate = null;
    private final kotlin.Lazy mMenuAdapter$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.GoodsByVinEntity.DataBean.BrandVOSListBean> mBrandIdList = null;
    private final java.util.ArrayList<java.lang.Integer> mBrandSelectList = null;
    private final kotlin.Lazy mBranderSelectAdapter$delegate = null;
    private java.lang.String ctgnum = "";
    private java.lang.String sortSales = "";
    private java.lang.String sortPrice = "";
    private android.widget.PopupWindow menuPopup;
    private java.lang.String query = "";
    private boolean canRefresh = true;
    private java.util.HashMap _$_findViewCache;
    
    public VulnerablePartShopActivity() {
        super();
    }
    
    private final com.android.ctgapp.activity.home.shop.VulnerablePartShopViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.databinding.ActivityVulnerablePartShopBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.LinearLayoutCompat getLayout() {
        return null;
    }
    
    private final java.lang.String getVin() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.GoodsByVinAdapter getMGoodsAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.GoodsMenuVinAdapter getMMenuAdapter() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.BranderSelectAdapter getMBranderSelectAdapter() {
        return null;
    }
    
    private final void getGoods() {
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
    
    private final void initGoods() {
    }
    
    @java.lang.Override()
    public void onAddTrolleyVinListener(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.GoodsByVinEntity.DataBean.GoodsDetailVoPageBean.RecordsBean goods) {
    }
    
    @java.lang.Override()
    public void addGoodsToTrolley(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.TrolleyAddGoodsBean bean) {
    }
    
    @java.lang.Override()
    public void onPartSortSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String partId) {
    }
    
    @java.lang.Override()
    public void onBrandClick(boolean select, int position) {
    }
    
    @java.lang.Override()
    public void itemSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String ctgnum) {
    }
}