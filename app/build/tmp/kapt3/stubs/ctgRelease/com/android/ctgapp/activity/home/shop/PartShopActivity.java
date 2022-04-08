package com.android.ctgapp.activity.home.shop;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/11/2
 * 描述: 易损件商城 页面
 */
@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000bB\u0005\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u0098\u0001\u001a\u00030\u0095\u0001H\u0002J$\u0010\u0099\u0001\u001a\u00030\u0095\u00012\u0006\u0010}\u001a\u00020\u00112\u0007\u0010\u009a\u0001\u001a\u00020\u00112\u0007\u0010\u009b\u0001\u001a\u00020\u000eH\u0016J\n\u0010\u009c\u0001\u001a\u00030\u0095\u0001H\u0002J\n\u0010\u009d\u0001\u001a\u00030\u0095\u0001H\u0002J\n\u0010\u009e\u0001\u001a\u00030\u0095\u0001H\u0002J\n\u0010\u009f\u0001\u001a\u00030\u0095\u0001H\u0016J\n\u0010\u00a0\u0001\u001a\u00030\u0095\u0001H\u0016J\u001c\u0010\u00a1\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u009a\u0001\u001a\u00020\u0011H\u0016J\n\u0010\u00a2\u0001\u001a\u00030\u0095\u0001H\u0002J\n\u0010\u00a3\u0001\u001a\u00030\u00a4\u0001H\u0016J\n\u0010\u00a5\u0001\u001a\u00030\u0095\u0001H\u0002J\u0013\u0010\u00a6\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u00a7\u0001\u001a\u00020)H\u0002J\n\u0010\u00a8\u0001\u001a\u00030\u0095\u0001H\u0002J\n\u0010\u00a9\u0001\u001a\u00030\u0095\u0001H\u0002J\n\u0010\u00aa\u0001\u001a\u00030\u0095\u0001H\u0002J\u0013\u0010\u00ab\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u00ac\u0001\u001a\u00020)H\u0016J\u001c\u0010\u00ad\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u009a\u0001\u001a\u00020\u0011H\u0016J(\u0010\u00ae\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u00af\u0001\u001a\u00020\u00112\u0007\u0010\u00b0\u0001\u001a\u00020\u00112\n\u0010\u00b1\u0001\u001a\u0005\u0018\u00010\u00b2\u0001H\u0014J\u0013\u0010\u00b3\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u00b4\u0001\u001a\u00020DH\u0016J\u0013\u0010\u00b5\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0011H\u0016J\u001c\u0010\u00b6\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u009a\u0001\u001a\u00020\u0011H\u0016J\u0013\u0010\u00b7\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u00b8\u0001\u001a\u00020)H\u0016J5\u0010\u00b9\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u00af\u0001\u001a\u00020\u00112\u0010\u0010\u00ba\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020)0\u00bb\u00012\b\u0010\u00bc\u0001\u001a\u00030\u00bd\u0001H\u0016\u00a2\u0006\u0003\u0010\u00be\u0001J\n\u0010\u00bf\u0001\u001a\u00030\u0095\u0001H\u0014J\u001c\u0010\u00c0\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u009a\u0001\u001a\u00020\u0011H\u0016J\u001c\u0010\u00c1\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u009a\u0001\u001a\u00020\u0011H\u0016J\n\u0010\u00c2\u0001\u001a\u00030\u0095\u0001H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\u0017\u001a\u0004\b0\u00101R\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00105\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010%\"\u0004\b7\u0010\'R\u001a\u00108\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-R\u001d\u0010;\u001a\u0004\u0018\u00010)8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\u0017\u001a\u0004\b<\u0010+R\u001b\u0010>\u001a\u00020?8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u0010\u0017\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010E\u001a\u00020F8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bI\u0010\u0017\u001a\u0004\bG\u0010HR\u001b\u0010J\u001a\u00020K8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bN\u0010\u0017\u001a\u0004\bL\u0010MR \u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010!\"\u0004\bR\u0010SR\u001b\u0010T\u001a\u00020U8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bX\u0010\u0017\u001a\u0004\bV\u0010WR\u001b\u0010Y\u001a\u00020Z8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b]\u0010\u0017\u001a\u0004\b[\u0010\\R\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010a\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010%\"\u0004\bc\u0010\'R\u001a\u0010d\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010f\u001a\u00020g8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bj\u0010\u0017\u001a\u0004\bh\u0010iR\u001a\u0010k\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010+\"\u0004\bm\u0010-R\u001a\u0010n\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010+\"\u0004\bp\u0010-R\u001b\u0010q\u001a\u00020r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bu\u0010\u0017\u001a\u0004\bs\u0010tR\u001a\u0010v\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0015\"\u0004\bx\u0010yR\u001a\u0010z\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\u0015\"\u0004\b|\u0010yR\u000e\u0010}\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010~\u001a\u00020\u007f8FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u0082\u0001\u0010\u0017\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001d\u0010\u0083\u0001\u001a\u00020)X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010+\"\u0005\b\u0085\u0001\u0010-R\u001d\u0010\u0086\u0001\u001a\u00020)X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010+\"\u0005\b\u0088\u0001\u0010-R\u001d\u0010\u0089\u0001\u001a\u00020)X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010+\"\u0005\b\u008b\u0001\u0010-R\u001d\u0010\u008c\u0001\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u0015\"\u0005\b\u008e\u0001\u0010yR\u000f\u0010\u008f\u0001\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0090\u0001\u001a\u00020)X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010+\"\u0005\b\u0092\u0001\u0010-R\u000f\u0010\u0093\u0001\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00c3\u0001"}, d2 = {"Lcom/android/ctgapp/activity/home/shop/PartShopActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/GoodsMenuFCodeAdapter$MenuListener;", "Lcom/android/ctgapp/adapter/home/GoodsByFCodeAdapter$GoodsByFCodeListener;", "Lcom/android/ctgapp/widget/dialog/GoodsAddTrolleyDialog$AddTrolley;", "Lcom/android/ctgapp/adapter/pupupwindow/ShopBrandAdapter$BranderListener;", "Lcom/android/ctgapp/adapter/home/ShopCategoryAdapter$LinShiAdapterListener;", "Lcom/android/ctgapp/adapter/home/AttrHorizontalAdapter$AttrHorizontalListener;", "Lcom/android/ctgapp/adapter/pupupwindow/OtherAttrChildAdapter$OtherAttrChildListener;", "Lcom/android/ctgapp/adapter/home/FenLeiAdapter$FenLeiListener;", "Lcom/android/ctgapp/adapter/pupupwindow/PinPaiAdapter$PinPaiListener;", "Lcom/android/ctgapp/adapter/home/AttrDrawAdapter$AttrDrawListener;", "()V", "actionConfirmFlag", "", "attrChildSelect", "attrChildSelectPosition", "", "attrChildSelectPositionPre", "bannerId", "getBannerId", "()I", "bannerId$delegate", "Lkotlin/Lazy;", "brandAdapter", "Lcom/android/ctgapp/adapter/pupupwindow/ShopBrandAdapter;", "getBrandAdapter", "()Lcom/android/ctgapp/adapter/pupupwindow/ShopBrandAdapter;", "brandAdapter$delegate", "brandList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$BrandListBean;", "getBrandList", "()Ljava/util/ArrayList;", "brandPopup", "Landroid/widget/PopupWindow;", "getBrandPopup", "()Landroid/widget/PopupWindow;", "setBrandPopup", "(Landroid/widget/PopupWindow;)V", "brandSelect", "", "getBrandSelect", "()Ljava/lang/String;", "setBrandSelect", "(Ljava/lang/String;)V", "categoryAdapter", "Lcom/android/ctgapp/adapter/home/ShopCategoryAdapter;", "getCategoryAdapter", "()Lcom/android/ctgapp/adapter/home/ShopCategoryAdapter;", "categoryAdapter$delegate", "categoryList", "Lcom/android/ctgapp/entity/home/GoodsByFCodeEntity$DataBean$CategoryVosBean;", "categoryPopup", "getCategoryPopup", "setCategoryPopup", "categorySelect", "getCategorySelect", "setCategorySelect", "fCode", "getFCode", "fCode$delegate", "fenleiDrawAdapter", "Lcom/android/ctgapp/adapter/home/FenLeiAdapter;", "getFenleiDrawAdapter", "()Lcom/android/ctgapp/adapter/home/FenLeiAdapter;", "fenleiDrawAdapter$delegate", "goodsList", "Lcom/android/ctgapp/entity/home/GoodsItemEntity;", "mAdapter", "Lcom/android/ctgapp/adapter/home/GoodsByFCodeAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/GoodsByFCodeAdapter;", "mAdapter$delegate", "mAttrChildAdapter", "Lcom/android/ctgapp/adapter/pupupwindow/OtherAttrChildAdapter;", "getMAttrChildAdapter", "()Lcom/android/ctgapp/adapter/pupupwindow/OtherAttrChildAdapter;", "mAttrChildAdapter$delegate", "mAttrChildList", "Lcom/android/ctgapp/entity/home/OtherAttrEntity$DataBean$SelectBean;", "getMAttrChildList", "setMAttrChildList", "(Ljava/util/ArrayList;)V", "mAttrDrawAdapter", "Lcom/android/ctgapp/adapter/home/AttrDrawAdapter;", "getMAttrDrawAdapter", "()Lcom/android/ctgapp/adapter/home/AttrDrawAdapter;", "mAttrDrawAdapter$delegate", "mAttrHorizontalAdapter", "Lcom/android/ctgapp/adapter/home/AttrHorizontalAdapter;", "getMAttrHorizontalAdapter", "()Lcom/android/ctgapp/adapter/home/AttrHorizontalAdapter;", "mAttrHorizontalAdapter$delegate", "mAttrList", "Lcom/android/ctgapp/entity/home/OtherAttrEntity$DataBean;", "mAttrListDrw", "mAttrPopup", "getMAttrPopup", "setMAttrPopup", "mAttrSelectMap", "Ljava/util/HashMap;", "mBinding", "Lcom/android/ctgapp/databinding/ActivityPartShopBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityPartShopBinding;", "mBinding$delegate", "mCurrentAttrKey", "getMCurrentAttrKey", "setMCurrentAttrKey", "mSeriesName", "getMSeriesName", "setMSeriesName", "mViewModel", "Lcom/android/ctgapp/activity/home/shop/PartShopViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/home/shop/PartShopViewModel;", "mViewModel$delegate", "maxSize", "getMaxSize", "setMaxSize", "(I)V", "page", "getPage", "setPage", "parentPosition", "pinpaiDrawAdapter", "Lcom/android/ctgapp/adapter/pupupwindow/PinPaiAdapter;", "getPinpaiDrawAdapter", "()Lcom/android/ctgapp/adapter/pupupwindow/PinPaiAdapter;", "pinpaiDrawAdapter$delegate", "preBrandSelect", "getPreBrandSelect", "setPreBrandSelect", "preCategorySelect", "getPreCategorySelect", "setPreCategorySelect", "query", "getQuery", "setQuery", "size", "getSize", "setSize", "sortPrice", "sortSales", "getSortSales", "setSortSales", "vinResultCode", "addGoodsToTrolley", "", "bean", "Lcom/android/ctgapp/entity/home/TrolleyAddGoodsBean;", "afterCategorySelect", "attrDrawItemCallBack", "position", "select", "attrPopupInit", "brandPopupInit", "categoryPopupInit", "click", "event", "fenleiClick", "getGoods", "getLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getVIN", "handlerAttrHorizontalAfterHttp", "str", "handlerOtherAttrHorizontalMenu", "initDraw", "initGoods", "itemSelect", "brandId", "linshiClick", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAddTrolleyFCodeListener", "goods", "onAttrHorizontalItemClick", "onBranderClick", "onPartSortSelect", "partId", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "otherAttrChildClick", "pinlaiClick", "popupDismissHandler", "app_ctgRelease"})
public final class PartShopActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.GoodsMenuFCodeAdapter.MenuListener, com.android.ctgapp.adapter.home.GoodsByFCodeAdapter.GoodsByFCodeListener, com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog.AddTrolley, com.android.ctgapp.adapter.pupupwindow.ShopBrandAdapter.BranderListener, com.android.ctgapp.adapter.home.ShopCategoryAdapter.LinShiAdapterListener, com.android.ctgapp.adapter.home.AttrHorizontalAdapter.AttrHorizontalListener, com.android.ctgapp.adapter.pupupwindow.OtherAttrChildAdapter.OtherAttrChildListener, com.android.ctgapp.adapter.home.FenLeiAdapter.FenLeiListener, com.android.ctgapp.adapter.pupupwindow.PinPaiAdapter.PinPaiListener, com.android.ctgapp.adapter.home.AttrDrawAdapter.AttrDrawListener {
    private final kotlin.Lazy mBinding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.Lazy fCode$delegate = null;
    private final kotlin.Lazy bannerId$delegate = null;
    private int page = 1;
    private int size = 20;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.GoodsItemEntity> goodsList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sortSales = "";
    private java.lang.String sortPrice = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String query = "";
    private final int vinResultCode = 101;
    @org.jetbrains.annotations.Nullable()
    private android.widget.PopupWindow brandPopup;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String preBrandSelect = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String brandSelect = "";
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.BrandListBean> brandList = null;
    private final kotlin.Lazy brandAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy pinpaiDrawAdapter$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.PopupWindow categoryPopup;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String categorySelect = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String preCategorySelect = "";
    private final java.util.ArrayList<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.CategoryVosBean> categoryList = null;
    private final kotlin.Lazy categoryAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy fenleiDrawAdapter$delegate = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.OtherAttrEntity.DataBean> mAttrList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.home.OtherAttrEntity.DataBean> mAttrListDrw = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mAttrHorizontalAdapter$delegate = null;
    private final java.util.HashMap<java.lang.String, java.lang.String> mAttrSelectMap = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.PopupWindow mAttrPopup;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.android.ctgapp.entity.home.OtherAttrEntity.DataBean.SelectBean> mAttrChildList;
    private final kotlin.Lazy mAttrChildAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mAttrDrawAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mCurrentAttrKey = "";
    private int maxSize = 3;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mSeriesName = "";
    private int parentPosition = -1;
    private int attrChildSelectPositionPre = -1;
    private int attrChildSelectPosition = -1;
    private boolean attrChildSelect = true;
    private boolean actionConfirmFlag = false;
    private java.util.HashMap _$_findViewCache;
    
    public PartShopActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityPartShopBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.drawerlayout.widget.DrawerLayout getLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.activity.home.shop.PartShopViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFCode() {
        return null;
    }
    
    private final int getBannerId() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    public final int getSize() {
        return 0;
    }
    
    public final void setSize(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.adapter.home.GoodsByFCodeAdapter getMAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSortSales() {
        return null;
    }
    
    public final void setSortSales(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.PopupWindow getBrandPopup() {
        return null;
    }
    
    public final void setBrandPopup(@org.jetbrains.annotations.Nullable()
    android.widget.PopupWindow p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPreBrandSelect() {
        return null;
    }
    
    public final void setPreBrandSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBrandSelect() {
        return null;
    }
    
    public final void setBrandSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.home.GoodsByFCodeEntity.DataBean.BrandListBean> getBrandList() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.pupupwindow.ShopBrandAdapter getBrandAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.adapter.pupupwindow.PinPaiAdapter getPinpaiDrawAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.PopupWindow getCategoryPopup() {
        return null;
    }
    
    public final void setCategoryPopup(@org.jetbrains.annotations.Nullable()
    android.widget.PopupWindow p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategorySelect() {
        return null;
    }
    
    public final void setCategorySelect(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPreCategorySelect() {
        return null;
    }
    
    public final void setPreCategorySelect(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final com.android.ctgapp.adapter.home.ShopCategoryAdapter getCategoryAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.adapter.home.FenLeiAdapter getFenleiDrawAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.adapter.home.AttrHorizontalAdapter getMAttrHorizontalAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.PopupWindow getMAttrPopup() {
        return null;
    }
    
    public final void setMAttrPopup(@org.jetbrains.annotations.Nullable()
    android.widget.PopupWindow p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.home.OtherAttrEntity.DataBean.SelectBean> getMAttrChildList() {
        return null;
    }
    
    public final void setMAttrChildList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.home.OtherAttrEntity.DataBean.SelectBean> p0) {
    }
    
    private final com.android.ctgapp.adapter.pupupwindow.OtherAttrChildAdapter getMAttrChildAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.adapter.home.AttrDrawAdapter getMAttrDrawAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMCurrentAttrKey() {
        return null;
    }
    
    public final void setMCurrentAttrKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getMaxSize() {
        return 0;
    }
    
    public final void setMaxSize(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMSeriesName() {
        return null;
    }
    
    public final void setMSeriesName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void categoryPopupInit() {
    }
    
    private final void handlerOtherAttrHorizontalMenu() {
    }
    
    private final void handlerAttrHorizontalAfterHttp(java.lang.String str) {
    }
    
    private final void afterCategorySelect() {
    }
    
    private final void popupDismissHandler() {
    }
    
    private final void brandPopupInit() {
    }
    
    private final void attrPopupInit() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void getGoods() {
    }
    
    private final void initGoods() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void getVIN() {
    }
    
    @java.lang.Override()
    public void itemSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String brandId) {
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
    public void linshiClick(boolean select, int position) {
    }
    
    @java.lang.Override()
    public void onBranderClick(boolean select, int position) {
    }
    
    @java.lang.Override()
    public void onAttrHorizontalItemClick(int position) {
    }
    
    @java.lang.Override()
    public void otherAttrChildClick(boolean select, int position) {
    }
    
    @java.lang.Override()
    public void fenleiClick(boolean select, int position) {
    }
    
    @java.lang.Override()
    public void pinlaiClick(boolean select, int position) {
    }
    
    @java.lang.Override()
    public void attrDrawItemCallBack(int parentPosition, int position, boolean select) {
    }
    
    private final void initDraw() {
    }
}