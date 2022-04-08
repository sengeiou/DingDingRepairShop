// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMoneyPackageRechargeBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final TextView mALLCoupons;

  @NonNull
  public final RelativeLayout mBackground;

  @NonNull
  public final TextView mCompanyName;

  @NonNull
  public final TextView mHistory;

  @NonNull
  public final TextView mMoney;

  @NonNull
  public final LinearLayoutCompat mParentLL;

  @NonNull
  public final RecyclerView mRecyclerView;

  @NonNull
  public final ImageView mTitleBarBackIv;

  @NonNull
  public final TextView mTransactionDetail;

  private ActivityMoneyPackageRechargeBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull TextView mALLCoupons, @NonNull RelativeLayout mBackground,
      @NonNull TextView mCompanyName, @NonNull TextView mHistory, @NonNull TextView mMoney,
      @NonNull LinearLayoutCompat mParentLL, @NonNull RecyclerView mRecyclerView,
      @NonNull ImageView mTitleBarBackIv, @NonNull TextView mTransactionDetail) {
    this.rootView = rootView;
    this.mALLCoupons = mALLCoupons;
    this.mBackground = mBackground;
    this.mCompanyName = mCompanyName;
    this.mHistory = mHistory;
    this.mMoney = mMoney;
    this.mParentLL = mParentLL;
    this.mRecyclerView = mRecyclerView;
    this.mTitleBarBackIv = mTitleBarBackIv;
    this.mTransactionDetail = mTransactionDetail;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMoneyPackageRechargeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMoneyPackageRechargeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_money_package_recharge, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMoneyPackageRechargeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mALLCoupons;
      TextView mALLCoupons = rootView.findViewById(id);
      if (mALLCoupons == null) {
        break missingId;
      }

      id = R.id.mBackground;
      RelativeLayout mBackground = rootView.findViewById(id);
      if (mBackground == null) {
        break missingId;
      }

      id = R.id.mCompanyName;
      TextView mCompanyName = rootView.findViewById(id);
      if (mCompanyName == null) {
        break missingId;
      }

      id = R.id.mHistory;
      TextView mHistory = rootView.findViewById(id);
      if (mHistory == null) {
        break missingId;
      }

      id = R.id.mMoney;
      TextView mMoney = rootView.findViewById(id);
      if (mMoney == null) {
        break missingId;
      }

      id = R.id.mParentLL;
      LinearLayoutCompat mParentLL = rootView.findViewById(id);
      if (mParentLL == null) {
        break missingId;
      }

      id = R.id.mRecyclerView;
      RecyclerView mRecyclerView = rootView.findViewById(id);
      if (mRecyclerView == null) {
        break missingId;
      }

      id = R.id.mTitleBarBackIv;
      ImageView mTitleBarBackIv = rootView.findViewById(id);
      if (mTitleBarBackIv == null) {
        break missingId;
      }

      id = R.id.mTransactionDetail;
      TextView mTransactionDetail = rootView.findViewById(id);
      if (mTransactionDetail == null) {
        break missingId;
      }

      return new ActivityMoneyPackageRechargeBinding((LinearLayoutCompat) rootView, mALLCoupons,
          mBackground, mCompanyName, mHistory, mMoney, mParentLL, mRecyclerView, mTitleBarBackIv,
          mTransactionDetail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
