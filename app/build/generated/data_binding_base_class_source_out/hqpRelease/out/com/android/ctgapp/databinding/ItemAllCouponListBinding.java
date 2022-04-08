// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemAllCouponListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RelativeLayout mButtonRL;

  @NonNull
  public final TextView mButtonTV;

  @NonNull
  public final RecyclerView mChildCouponRV;

  @NonNull
  public final TextView mCouponBrandTV;

  @NonNull
  public final TextView mCouponNameHeadTV;

  @NonNull
  public final TextView mCouponNameTV;

  @NonNull
  public final TextView mCouponWayTV;

  @NonNull
  public final LinearLayout mDetails;

  @NonNull
  public final LinearLayout mHeadLL;

  @NonNull
  public final TextView mLeftAmountTV;

  @NonNull
  public final TextView mMoneyUsedTV;

  @NonNull
  public final LinearLayout mParentLL;

  @NonNull
  public final TextView mRuleTV;

  @NonNull
  public final TextView mUseTimeTV;

  private ItemAllCouponListBinding(@NonNull LinearLayout rootView,
      @NonNull RelativeLayout mButtonRL, @NonNull TextView mButtonTV,
      @NonNull RecyclerView mChildCouponRV, @NonNull TextView mCouponBrandTV,
      @NonNull TextView mCouponNameHeadTV, @NonNull TextView mCouponNameTV,
      @NonNull TextView mCouponWayTV, @NonNull LinearLayout mDetails, @NonNull LinearLayout mHeadLL,
      @NonNull TextView mLeftAmountTV, @NonNull TextView mMoneyUsedTV,
      @NonNull LinearLayout mParentLL, @NonNull TextView mRuleTV, @NonNull TextView mUseTimeTV) {
    this.rootView = rootView;
    this.mButtonRL = mButtonRL;
    this.mButtonTV = mButtonTV;
    this.mChildCouponRV = mChildCouponRV;
    this.mCouponBrandTV = mCouponBrandTV;
    this.mCouponNameHeadTV = mCouponNameHeadTV;
    this.mCouponNameTV = mCouponNameTV;
    this.mCouponWayTV = mCouponWayTV;
    this.mDetails = mDetails;
    this.mHeadLL = mHeadLL;
    this.mLeftAmountTV = mLeftAmountTV;
    this.mMoneyUsedTV = mMoneyUsedTV;
    this.mParentLL = mParentLL;
    this.mRuleTV = mRuleTV;
    this.mUseTimeTV = mUseTimeTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAllCouponListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAllCouponListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_all_coupon_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAllCouponListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mButtonRL;
      RelativeLayout mButtonRL = rootView.findViewById(id);
      if (mButtonRL == null) {
        break missingId;
      }

      id = R.id.mButtonTV;
      TextView mButtonTV = rootView.findViewById(id);
      if (mButtonTV == null) {
        break missingId;
      }

      id = R.id.mChildCouponRV;
      RecyclerView mChildCouponRV = rootView.findViewById(id);
      if (mChildCouponRV == null) {
        break missingId;
      }

      id = R.id.mCouponBrandTV;
      TextView mCouponBrandTV = rootView.findViewById(id);
      if (mCouponBrandTV == null) {
        break missingId;
      }

      id = R.id.mCouponNameHeadTV;
      TextView mCouponNameHeadTV = rootView.findViewById(id);
      if (mCouponNameHeadTV == null) {
        break missingId;
      }

      id = R.id.mCouponNameTV;
      TextView mCouponNameTV = rootView.findViewById(id);
      if (mCouponNameTV == null) {
        break missingId;
      }

      id = R.id.mCouponWayTV;
      TextView mCouponWayTV = rootView.findViewById(id);
      if (mCouponWayTV == null) {
        break missingId;
      }

      id = R.id.mDetails;
      LinearLayout mDetails = rootView.findViewById(id);
      if (mDetails == null) {
        break missingId;
      }

      id = R.id.mHeadLL;
      LinearLayout mHeadLL = rootView.findViewById(id);
      if (mHeadLL == null) {
        break missingId;
      }

      id = R.id.mLeftAmountTV;
      TextView mLeftAmountTV = rootView.findViewById(id);
      if (mLeftAmountTV == null) {
        break missingId;
      }

      id = R.id.mMoneyUsedTV;
      TextView mMoneyUsedTV = rootView.findViewById(id);
      if (mMoneyUsedTV == null) {
        break missingId;
      }

      id = R.id.mParentLL;
      LinearLayout mParentLL = rootView.findViewById(id);
      if (mParentLL == null) {
        break missingId;
      }

      id = R.id.mRuleTV;
      TextView mRuleTV = rootView.findViewById(id);
      if (mRuleTV == null) {
        break missingId;
      }

      id = R.id.mUseTimeTV;
      TextView mUseTimeTV = rootView.findViewById(id);
      if (mUseTimeTV == null) {
        break missingId;
      }

      return new ItemAllCouponListBinding((LinearLayout) rootView, mButtonRL, mButtonTV,
          mChildCouponRV, mCouponBrandTV, mCouponNameHeadTV, mCouponNameTV, mCouponWayTV, mDetails,
          mHeadLL, mLeftAmountTV, mMoneyUsedTV, mParentLL, mRuleTV, mUseTimeTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
