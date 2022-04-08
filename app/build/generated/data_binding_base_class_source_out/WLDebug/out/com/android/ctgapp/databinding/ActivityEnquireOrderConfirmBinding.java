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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEnquireOrderConfirmBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final ImageView mAddLogoIV;

  @NonNull
  public final RelativeLayout mAddressRL;

  @NonNull
  public final TextView mAddressTV;

  @NonNull
  public final TextView mCompanyNameTV;

  @NonNull
  public final Button mConfirmBTN;

  @NonNull
  public final LinearLayout mCouponDetailLL;

  @NonNull
  public final TextView mCouponFootTV;

  @NonNull
  public final TextView mCouponHeadTV;

  @NonNull
  public final LinearLayout mNameLL;

  @NonNull
  public final TextView mNameTV;

  @NonNull
  public final RecyclerView mOrderRV;

  @NonNull
  public final EditText mRemarkET;

  @NonNull
  public final TextView mSupportCreditTV;

  @NonNull
  public final LinearLayout mTotalPriceLL;

  @NonNull
  public final TextView mTotalPriceTV;

  private ActivityEnquireOrderConfirmBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull ImageView mAddLogoIV, @NonNull RelativeLayout mAddressRL,
      @NonNull TextView mAddressTV, @NonNull TextView mCompanyNameTV, @NonNull Button mConfirmBTN,
      @NonNull LinearLayout mCouponDetailLL, @NonNull TextView mCouponFootTV,
      @NonNull TextView mCouponHeadTV, @NonNull LinearLayout mNameLL, @NonNull TextView mNameTV,
      @NonNull RecyclerView mOrderRV, @NonNull EditText mRemarkET,
      @NonNull TextView mSupportCreditTV, @NonNull LinearLayout mTotalPriceLL,
      @NonNull TextView mTotalPriceTV) {
    this.rootView = rootView;
    this.mAddLogoIV = mAddLogoIV;
    this.mAddressRL = mAddressRL;
    this.mAddressTV = mAddressTV;
    this.mCompanyNameTV = mCompanyNameTV;
    this.mConfirmBTN = mConfirmBTN;
    this.mCouponDetailLL = mCouponDetailLL;
    this.mCouponFootTV = mCouponFootTV;
    this.mCouponHeadTV = mCouponHeadTV;
    this.mNameLL = mNameLL;
    this.mNameTV = mNameTV;
    this.mOrderRV = mOrderRV;
    this.mRemarkET = mRemarkET;
    this.mSupportCreditTV = mSupportCreditTV;
    this.mTotalPriceLL = mTotalPriceLL;
    this.mTotalPriceTV = mTotalPriceTV;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEnquireOrderConfirmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEnquireOrderConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_enquire_order_confirm, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEnquireOrderConfirmBinding bind(@NonNull View rootView) {
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

      id = R.id.mCompanyNameTV;
      TextView mCompanyNameTV = rootView.findViewById(id);
      if (mCompanyNameTV == null) {
        break missingId;
      }

      id = R.id.mConfirmBTN;
      Button mConfirmBTN = rootView.findViewById(id);
      if (mConfirmBTN == null) {
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

      id = R.id.mOrderRV;
      RecyclerView mOrderRV = rootView.findViewById(id);
      if (mOrderRV == null) {
        break missingId;
      }

      id = R.id.mRemarkET;
      EditText mRemarkET = rootView.findViewById(id);
      if (mRemarkET == null) {
        break missingId;
      }

      id = R.id.mSupportCreditTV;
      TextView mSupportCreditTV = rootView.findViewById(id);
      if (mSupportCreditTV == null) {
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

      return new ActivityEnquireOrderConfirmBinding((LinearLayoutCompat) rootView, mAddLogoIV,
          mAddressRL, mAddressTV, mCompanyNameTV, mConfirmBTN, mCouponDetailLL, mCouponFootTV,
          mCouponHeadTV, mNameLL, mNameTV, mOrderRV, mRemarkET, mSupportCreditTV, mTotalPriceLL,
          mTotalPriceTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
