// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOrderConfirmSingleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView mAddLogoIV;

  @NonNull
  public final RelativeLayout mAddressRL;

  @NonNull
  public final TextView mAddressTV;

  @NonNull
  public final Button mConfirmBTN;

  @NonNull
  public final TextView mContentTV;

  @NonNull
  public final LinearLayout mCouponDetailLL;

  @NonNull
  public final TextView mCouponFootTV;

  @NonNull
  public final TextView mCouponHeadTV;

  @NonNull
  public final LinearLayout mCouponSelectLL;

  @NonNull
  public final ImageView mItemImageIV;

  @NonNull
  public final LinearLayout mNameLL;

  @NonNull
  public final TextView mNameTV;

  @NonNull
  public final LinearLayout mParentLL;

  @NonNull
  public final TextView mPartCodeTV;

  @NonNull
  public final TextView mPartNamesTV;

  @NonNull
  public final TextView mPartPriceTV;

  @NonNull
  public final EditText mRemarkET;

  @NonNull
  public final TextView mRemissionPriceTV;

  @NonNull
  public final TextView mSupportCreditTV;

  @NonNull
  public final TextView mTitleTV;

  @NonNull
  public final LinearLayout mTotalPriceLL;

  @NonNull
  public final TextView mTotalPriceTV;

  @NonNull
  public final TextView mTotalRemissionPriceTV;

  private ActivityOrderConfirmSingleBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView mAddLogoIV, @NonNull RelativeLayout mAddressRL,
      @NonNull TextView mAddressTV, @NonNull Button mConfirmBTN, @NonNull TextView mContentTV,
      @NonNull LinearLayout mCouponDetailLL, @NonNull TextView mCouponFootTV,
      @NonNull TextView mCouponHeadTV, @NonNull LinearLayout mCouponSelectLL,
      @NonNull ImageView mItemImageIV, @NonNull LinearLayout mNameLL, @NonNull TextView mNameTV,
      @NonNull LinearLayout mParentLL, @NonNull TextView mPartCodeTV,
      @NonNull TextView mPartNamesTV, @NonNull TextView mPartPriceTV, @NonNull EditText mRemarkET,
      @NonNull TextView mRemissionPriceTV, @NonNull TextView mSupportCreditTV,
      @NonNull TextView mTitleTV, @NonNull LinearLayout mTotalPriceLL,
      @NonNull TextView mTotalPriceTV, @NonNull TextView mTotalRemissionPriceTV) {
    this.rootView = rootView;
    this.mAddLogoIV = mAddLogoIV;
    this.mAddressRL = mAddressRL;
    this.mAddressTV = mAddressTV;
    this.mConfirmBTN = mConfirmBTN;
    this.mContentTV = mContentTV;
    this.mCouponDetailLL = mCouponDetailLL;
    this.mCouponFootTV = mCouponFootTV;
    this.mCouponHeadTV = mCouponHeadTV;
    this.mCouponSelectLL = mCouponSelectLL;
    this.mItemImageIV = mItemImageIV;
    this.mNameLL = mNameLL;
    this.mNameTV = mNameTV;
    this.mParentLL = mParentLL;
    this.mPartCodeTV = mPartCodeTV;
    this.mPartNamesTV = mPartNamesTV;
    this.mPartPriceTV = mPartPriceTV;
    this.mRemarkET = mRemarkET;
    this.mRemissionPriceTV = mRemissionPriceTV;
    this.mSupportCreditTV = mSupportCreditTV;
    this.mTitleTV = mTitleTV;
    this.mTotalPriceLL = mTotalPriceLL;
    this.mTotalPriceTV = mTotalPriceTV;
    this.mTotalRemissionPriceTV = mTotalRemissionPriceTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrderConfirmSingleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrderConfirmSingleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_order_confirm_single, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrderConfirmSingleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAddLogoIV;
      ImageView mAddLogoIV = rootView.findViewById(id);
      if (mAddLogoIV == null) {
        break missingId;
      }

      id = R.id.mAddressRL;
      RelativeLayout mAddressRL = rootView.findViewById(id);
      if (mAddressRL == null) {
        break missingId;
      }

      id = R.id.mAddressTV;
      TextView mAddressTV = rootView.findViewById(id);
      if (mAddressTV == null) {
        break missingId;
      }

      id = R.id.mConfirmBTN;
      Button mConfirmBTN = rootView.findViewById(id);
      if (mConfirmBTN == null) {
        break missingId;
      }

      id = R.id.mContentTV;
      TextView mContentTV = rootView.findViewById(id);
      if (mContentTV == null) {
        break missingId;
      }

      id = R.id.mCouponDetailLL;
      LinearLayout mCouponDetailLL = rootView.findViewById(id);
      if (mCouponDetailLL == null) {
        break missingId;
      }

      id = R.id.mCouponFootTV;
      TextView mCouponFootTV = rootView.findViewById(id);
      if (mCouponFootTV == null) {
        break missingId;
      }

      id = R.id.mCouponHeadTV;
      TextView mCouponHeadTV = rootView.findViewById(id);
      if (mCouponHeadTV == null) {
        break missingId;
      }

      id = R.id.mCouponSelectLL;
      LinearLayout mCouponSelectLL = rootView.findViewById(id);
      if (mCouponSelectLL == null) {
        break missingId;
      }

      id = R.id.mItemImageIV;
      ImageView mItemImageIV = rootView.findViewById(id);
      if (mItemImageIV == null) {
        break missingId;
      }

      id = R.id.mNameLL;
      LinearLayout mNameLL = rootView.findViewById(id);
      if (mNameLL == null) {
        break missingId;
      }

      id = R.id.mNameTV;
      TextView mNameTV = rootView.findViewById(id);
      if (mNameTV == null) {
        break missingId;
      }

      id = R.id.mParentLL;
      LinearLayout mParentLL = rootView.findViewById(id);
      if (mParentLL == null) {
        break missingId;
      }

      id = R.id.mPartCodeTV;
      TextView mPartCodeTV = rootView.findViewById(id);
      if (mPartCodeTV == null) {
        break missingId;
      }

      id = R.id.mPartNamesTV;
      TextView mPartNamesTV = rootView.findViewById(id);
      if (mPartNamesTV == null) {
        break missingId;
      }

      id = R.id.mPartPriceTV;
      TextView mPartPriceTV = rootView.findViewById(id);
      if (mPartPriceTV == null) {
        break missingId;
      }

      id = R.id.mRemarkET;
      EditText mRemarkET = rootView.findViewById(id);
      if (mRemarkET == null) {
        break missingId;
      }

      id = R.id.mRemissionPriceTV;
      TextView mRemissionPriceTV = rootView.findViewById(id);
      if (mRemissionPriceTV == null) {
        break missingId;
      }

      id = R.id.mSupportCreditTV;
      TextView mSupportCreditTV = rootView.findViewById(id);
      if (mSupportCreditTV == null) {
        break missingId;
      }

      id = R.id.mTitleTV;
      TextView mTitleTV = rootView.findViewById(id);
      if (mTitleTV == null) {
        break missingId;
      }

      id = R.id.mTotalPriceLL;
      LinearLayout mTotalPriceLL = rootView.findViewById(id);
      if (mTotalPriceLL == null) {
        break missingId;
      }

      id = R.id.mTotalPriceTV;
      TextView mTotalPriceTV = rootView.findViewById(id);
      if (mTotalPriceTV == null) {
        break missingId;
      }

      id = R.id.mTotalRemissionPriceTV;
      TextView mTotalRemissionPriceTV = rootView.findViewById(id);
      if (mTotalRemissionPriceTV == null) {
        break missingId;
      }

      return new ActivityOrderConfirmSingleBinding((LinearLayout) rootView, mAddLogoIV, mAddressRL,
          mAddressTV, mConfirmBTN, mContentTV, mCouponDetailLL, mCouponFootTV, mCouponHeadTV,
          mCouponSelectLL, mItemImageIV, mNameLL, mNameTV, mParentLL, mPartCodeTV, mPartNamesTV,
          mPartPriceTV, mRemarkET, mRemissionPriceTV, mSupportCreditTV, mTitleTV, mTotalPriceLL,
          mTotalPriceTV, mTotalRemissionPriceTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
