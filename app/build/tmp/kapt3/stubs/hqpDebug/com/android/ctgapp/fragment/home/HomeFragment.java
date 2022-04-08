package com.android.ctgapp.fragment.home;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/29
 * 描述: 首页 Fragment
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tB\u0005\u00a2\u0006\u0002\u0010\nJ\u001a\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u00042\u0006\u00103\u001a\u00020\u000eH\u0016J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000201H\u0016J\b\u00108\u001a\u000201H\u0016J\u0010\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020;H\u0007J\b\u0010<\u001a\u000201H\u0002J\u001a\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u000201H\u0002J\b\u0010D\u001a\u000201H\u0002J\u0010\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020)H\u0002J\b\u0010F\u001a\u000201H\u0002J\u0012\u0010G\u001a\u0002012\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\"\u0010J\u001a\u0002012\u0006\u0010K\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010MH\u0016J\u0010\u0010N\u001a\u0002012\u0006\u0010O\u001a\u00020\u001eH\u0016J\u0010\u0010P\u001a\u0002012\u0006\u00103\u001a\u00020\u000eH\u0016J\b\u0010Q\u001a\u000201H\u0016J\u0012\u0010R\u001a\u0002012\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u0010\u0010U\u001a\u0002012\u0006\u0010V\u001a\u00020)H\u0016J-\u0010W\u001a\u0002012\u0006\u0010K\u001a\u00020\u000e2\u000e\u0010X\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0Y2\u0006\u0010Z\u001a\u00020[H\u0016\u00a2\u0006\u0002\u0010\\J\b\u0010]\u001a\u000201H\u0016J\u0012\u0010^\u001a\u0002012\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u001c\u0010^\u001a\u00020\u00132\b\u0010_\u001a\u0004\u0018\u00010>2\b\u00108\u001a\u0004\u0018\u00010TH\u0016J\u0006\u0010`\u001a\u000201J\b\u0010a\u001a\u000201H\u0016J\b\u0010b\u001a\u000201H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020%0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b,\u0010-R\u000e\u0010/\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006c"}, d2 = {"Lcom/android/ctgapp/fragment/home/HomeFragment;", "Lcom/android/ctgapp/base/BaseFragmentV2;", "Lme/bakumon/library/view/BulletinView$OnBulletinItemClickListener;", "Lcom/youth/banner/listener/OnBannerListener;", "Lcom/android/ctgapp/entity/home/BannerEntity$DataBean;", "Lcom/android/ctgapp/adapter/home/HotGoodsAdapter$HotGoodsListener;", "Lcom/android/ctgapp/widget/dialog/GoodsAddTrolleyDialog$AddTrolley;", "Lcom/android/ctgapp/activity/MainActivity$MyOnTouchListener;", "Landroid/view/View$OnTouchListener;", "Lcom/android/ctgapp/adapter/home/HomeBottomMenuAdapter$HomeBottomMenuAdapterListener;", "()V", "_binding", "Lcom/android/ctgapp/databinding/FragmentHomeBinding;", "bannerId", "", "bannerUrlList", "Ljava/util/ArrayList;", "cha", "foldStatue", "", "mAdapter", "Lcom/android/ctgapp/adapter/home/HotGoodsAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/HotGoodsAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mBinding", "getMBinding", "()Lcom/android/ctgapp/databinding/FragmentHomeBinding;", "mList", "Lcom/android/ctgapp/entity/home/GoodsItemEntity;", "mViewModel", "Lcom/android/ctgapp/fragment/home/HomeFragmentViewModel;", "getMViewModel", "()Lcom/android/ctgapp/fragment/home/HomeFragmentViewModel;", "mViewModel$delegate", "menuList", "Lcom/android/ctgapp/entity/home/BottomBrandMenuEntity$DataBean;", "menuListLess", "menuListMore", "shufflingList", "", "vinKeyboardUtil", "Lcom/android/ctgapp/util/VinKeyboardUtil;", "getVinKeyboardUtil", "()Lcom/android/ctgapp/util/VinKeyboardUtil;", "vinKeyboardUtil$delegate", "vinResultCode", "OnBannerClick", "", "data", "position", "addGoodsToTrolley", "bean", "Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "click", "event", "eventBus", "refresh", "Lcom/android/ctgapp/event/HomeFragmentRefresh;", "getBottomMenu", "getLayout", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getVIN", "initBanner", "it", "initShuffling", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onAddTrolleyFCodeListener", "goods", "onBulletinItemClick", "onDestroy", "onDispatch", "ev", "Landroid/view/MotionEvent;", "onPartSortSelect", "partId", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onTouch", "v", "refreshPage", "showLess", "showMore", "app_hqpDebug"})
public final class HomeFragment extends com.android.ctgapp.base.BaseFragmentV2 implements me.bakumon.library.view.BulletinView.OnBulletinItemClickListener, com.youth.banner.listener.OnBannerListener<com.android.ctgapp.entity.home.BannerEntity.DataBean>, com.android.ctgapp.adapter.home.HotGoodsAdapter.HotGoodsListener, com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog.AddTrolley, com.android.ctgapp.activity.MainActivity.MyOnTouchListener, android.view.View.OnTouchListener, com.android.ctgapp.adapter.home.HomeBottomMenuAdapter.HomeBottomMenuAdapterListener {
    private com.android.ctgapp.databinding.FragmentHomeBinding _binding;
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy vinKeyboardUtil$delegate = null;
    private final int vinResultCode = 101;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.BannerEntity.DataBean> bannerUrlList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.GoodsItemEntity> mList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private final java.util.ArrayList<java.lang.String> shufflingList = null;
    private int bannerId = -1;
    private int cha = 0;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.BottomBrandMenuEntity.DataBean> menuListLess = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.BottomBrandMenuEntity.DataBean> menuListMore = null;
    private java.util.ArrayList<com.android.ctgapp.entity.home.BottomBrandMenuEntity.DataBean> menuList;
    private boolean foldStatue = false;
    private java.util.HashMap _$_findViewCache;
    
    public HomeFragment() {
        super(false);
    }
    
    private final com.android.ctgapp.databinding.FragmentHomeBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getLayout(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    private final com.android.ctgapp.fragment.home.HomeFragmentViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.util.VinKeyboardUtil getVinKeyboardUtil() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.home.HotGoodsAdapter getMAdapter() {
        return null;
    }
    
    public final void refreshPage() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void initBanner(java.lang.String it) {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getVIN() {
    }
    
    private final void initBanner() {
    }
    
    private final void initShuffling() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onBulletinItemClick(int position) {
    }
    
    @java.lang.Override()
    public void OnBannerClick(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.home.BannerEntity.DataBean data, int position) {
    }
    
    @java.lang.Override()
    public void onAddTrolleyFCodeListener(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.GoodsItemEntity goods) {
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
    public boolean onTouch(@org.jetbrains.annotations.Nullable()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onTouch(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
    }
    
    @java.lang.Override()
    public void onDispatch(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void getBottomMenu() {
    }
    
    @java.lang.Override()
    public void showMore() {
    }
    
    @java.lang.Override()
    public void showLess() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void eventBus(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.HomeFragmentRefresh refresh) {
    }
}