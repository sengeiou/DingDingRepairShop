// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.android.ctgapp.widget.EditTextWithDeleteBtn;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPartShopBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final TextView mAllSoftBTN;

  @NonNull
  public final ImageView mArrowIV;

  @NonNull
  public final RecyclerView mAttrHorizontalRV;

  @NonNull
  public final ImageView mBackIV;

  @NonNull
  public final LinearLayoutCompat mBottomButtonLL;

  @NonNull
  public final TextView mBrandBTN;

  @NonNull
  public final TextView mCategoryBTN;

  @NonNull
  public final Button mConfirmBTN;

  @NonNull
  public final DrawerLayout mDrawer;

  @NonNull
  public final RecyclerView mFenLeiRV;

  @NonNull
  public final TextView mFenLeiTV;

  @NonNull
  public final RecyclerView mGoodsRV;

  @NonNull
  public final LinearLayout mLinshi;

  @NonNull
  public final RecyclerView mMenuRV;

  @NonNull
  public final RecyclerView mOtherAttrDrawRV;

  @NonNull
  public final RecyclerView mPinPaiRV;

  @NonNull
  public final ImageView mPriceIV;

  @NonNull
  public final RelativeLayout mPriceRL;

  @NonNull
  public final SmartRefreshLayout mRefresh;

  @NonNull
  public final Button mResetBTN;

  @NonNull
  public final ImageView mSaleIV;

  @NonNull
  public final ImageView mScanIV;

  @NonNull
  public final TextView mScreenTV;

  @NonNull
  public final EditTextWithDeleteBtn mSearchET;

  @NonNull
  public final RelativeLayout mShai;

  @NonNull
  public final TextView mSortPriceTV;

  @NonNull
  public final RelativeLayout mSortSalesRL;

  @NonNull
  public final TextView mSortSalesTV;

  @NonNull
  public final ImageView mTrolleyIV;

  private ActivityPartShopBinding(@NonNull DrawerLayout rootView, @NonNull TextView mAllSoftBTN,
      @NonNull ImageView mArrowIV, @NonNull RecyclerView mAttrHorizontalRV,
      @NonNull ImageView mBackIV, @NonNull LinearLayoutCompat mBottomButtonLL,
      @NonNull TextView mBrandBTN, @NonNull TextView mCategoryBTN, @NonNull Button mConfirmBTN,
      @NonNull DrawerLayout mDrawer, @NonNull RecyclerView mFenLeiRV, @NonNull TextView mFenLeiTV,
      @NonNull RecyclerView mGoodsRV, @NonNull LinearLayout mLinshi, @NonNull RecyclerView mMenuRV,
      @NonNull RecyclerView mOtherAttrDrawRV, @NonNull RecyclerView mPinPaiRV,
      @NonNull ImageView mPriceIV, @NonNull RelativeLayout mPriceRL,
      @NonNull SmartRefreshLayout mRefresh, @NonNull Button mResetBTN, @NonNull ImageView mSaleIV,
      @NonNull ImageView mScanIV, @NonNull TextView mScreenTV,
      @NonNull EditTextWithDeleteBtn mSearchET, @NonNull RelativeLayout mShai,
      @NonNull TextView mSortPriceTV, @NonNull RelativeLayout mSortSalesRL,
      @NonNull TextView mSortSalesTV, @NonNull ImageView mTrolleyIV) {
    this.rootView = rootView;
    this.mAllSoftBTN = mAllSoftBTN;
    this.mArrowIV = mArrowIV;
    this.mAttrHorizontalRV = mAttrHorizontalRV;
    this.mBackIV = mBackIV;
    this.mBottomButtonLL = mBottomButtonLL;
    this.mBrandBTN = mBrandBTN;
    this.mCategoryBTN = mCategoryBTN;
    this.mConfirmBTN = mConfirmBTN;
    this.mDrawer = mDrawer;
    this.mFenLeiRV = mFenLeiRV;
    this.mFenLeiTV = mFenLeiTV;
    this.mGoodsRV = mGoodsRV;
    this.mLinshi = mLinshi;
    this.mMenuRV = mMenuRV;
    this.mOtherAttrDrawRV = mOtherAttrDrawRV;
    this.mPinPaiRV = mPinPaiRV;
    this.mPriceIV = mPriceIV;
    this.mPriceRL = mPriceRL;
    this.mRefresh = mRefresh;
    this.mResetBTN = mResetBTN;
    this.mSaleIV = mSaleIV;
    this.mScanIV = mScanIV;
    this.mScreenTV = mScreenTV;
    this.mSearchET = mSearchET;
    this.mShai = mShai;
    this.mSortPriceTV = mSortPriceTV;
    this.mSortSalesRL = mSortSalesRL;
    this.mSortSalesTV = mSortSalesTV;
    this.mTrolleyIV = mTrolleyIV;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPartShopBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPartShopBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_part_shop, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPartShopBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAllSoftBTN;
      TextView mAllSoftBTN = rootView.findViewById(id);
      if (mAllSoftBTN == null) {
        break missingId;
      }

      id = R.id.mArrowIV;
      ImageView mArrowIV = rootView.findViewById(id);
      if (mArrowIV == null) {
        break missingId;
      }

      id = R.id.mAttrHorizontalRV;
      RecyclerView mAttrHorizontalRV = rootView.findViewById(id);
      if (mAttrHorizontalRV == null) {
        break missingId;
      }

      id = R.id.mBackIV;
      ImageView mBackIV = rootView.findViewById(id);
      if (mBackIV == null) {
        break missingId;
      }

      id = R.id.mBottomButtonLL;
      LinearLayoutCompat mBottomButtonLL = rootView.findViewById(id);
      if (mBottomButtonLL == null) {
        break missingId;
      }

      id = R.id.mBrandBTN;
      TextView mBrandBTN = rootView.findViewById(id);
      if (mBrandBTN == null) {
        break missingId;
      }

      id = R.id.mCategoryBTN;
      TextView mCategoryBTN = rootView.findViewById(id);
      if (mCategoryBTN == null) {
        break missingId;
      }

      id = R.id.mConfirmBTN;
      Button mConfirmBTN = rootView.findViewById(id);
      if (mConfirmBTN == null) {
        break missingId;
      }

      DrawerLayout mDrawer = (DrawerLayout) rootView;

      id = R.id.mFenLeiRV;
      RecyclerView mFenLeiRV = rootView.findViewById(id);
      if (mFenLeiRV == null) {
        break missingId;
      }

      id = R.id.mFenLeiTV;
      TextView mFenLeiTV = rootView.findViewById(id);
      if (mFenLeiTV == null) {
        break missingId;
      }

      id = R.id.mGoodsRV;
      RecyclerView mGoodsRV = rootView.findViewById(id);
      if (mGoodsRV == null) {
        break missingId;
      }

      id = R.id.mLinshi;
      LinearLayout mLinshi = rootView.findViewById(id);
      if (mLinshi == null) {
        break missingId;
      }

      id = R.id.mMenuRV;
      RecyclerView mMenuRV = rootView.findViewById(id);
      if (mMenuRV == null) {
        break missingId;
      }

      id = R.id.mOtherAttrDrawRV;
      RecyclerView mOtherAttrDrawRV = rootView.findViewById(id);
      if (mOtherAttrDrawRV == null) {
        break missingId;
      }

      id = R.id.mPinPaiRV;
      RecyclerView mPinPaiRV = rootView.findViewById(id);
      if (mPinPaiRV == null) {
        break missingId;
      }

      id = R.id.mPriceIV;
      ImageView mPriceIV = rootView.findViewById(id);
      if (mPriceIV == null) {
        break missingId;
      }

      id = R.id.mPriceRL;
      RelativeLayout mPriceRL = rootView.findViewById(id);
      if (mPriceRL == null) {
        break missingId;
      }

      id = R.id.mRefresh;
      SmartRefreshLayout mRefresh = rootView.findViewById(id);
      if (mRefresh == null) {
        break missingId;
      }

      id = R.id.mResetBTN;
      Button mResetBTN = rootView.findViewById(id);
      if (mResetBTN == null) {
        break missingId;
      }

      id = R.id.mSaleIV;
      ImageView mSaleIV = rootView.findViewById(id);
      if (mSaleIV == null) {
        break missingId;
      }

      id = R.id.mScanIV;
      ImageView mScanIV = rootView.findViewById(id);
      if (mScanIV == null) {
        break missingId;
      }

      id = R.id.mScreenTV;
      TextView mScreenTV = rootView.findViewById(id);
      if (mScreenTV == null) {
        break missingId;
      }

      id = R.id.mSearchET;
      EditTextWithDeleteBtn mSearchET = rootView.findViewById(id);
      if (mSearchET == null) {
        break missingId;
      }

      id = R.id.mShai;
      RelativeLayout mShai = rootView.findViewById(id);
      if (mShai == null) {
        break missingId;
      }

      id = R.id.mSortPriceTV;
      TextView mSortPriceTV = rootView.findViewById(id);
      if (mSortPriceTV == null) {
        break missingId;
      }

      id = R.id.mSortSalesRL;
      RelativeLayout mSortSalesRL = rootView.findViewById(id);
      if (mSortSalesRL == null) {
        break missingId;
      }

      id = R.id.mSortSalesTV;
      TextView mSortSalesTV = rootView.findViewById(id);
      if (mSortSalesTV == null) {
        break missingId;
      }

      id = R.id.mTrolleyIV;
      ImageView mTrolleyIV = rootView.findViewById(id);
      if (mTrolleyIV == null) {
        break missingId;
      }

      return new ActivityPartShopBinding((DrawerLayout) rootView, mAllSoftBTN, mArrowIV,
          mAttrHorizontalRV, mBackIV, mBottomButtonLL, mBrandBTN, mCategoryBTN, mConfirmBTN,
          mDrawer, mFenLeiRV, mFenLeiTV, mGoodsRV, mLinshi, mMenuRV, mOtherAttrDrawRV, mPinPaiRV,
          mPriceIV, mPriceRL, mRefresh, mResetBTN, mSaleIV, mScanIV, mScreenTV, mSearchET, mShai,
          mSortPriceTV, mSortSalesRL, mSortSalesTV, mTrolleyIV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
