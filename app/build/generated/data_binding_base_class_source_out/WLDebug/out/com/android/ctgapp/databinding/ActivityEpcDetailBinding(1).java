// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.android.ctgapp.widget.CustomTitleBar;
import com.youth.banner.Banner;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEpcDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final TextView SelectTV;

  @NonNull
  public final Button mBackBTN;

  @NonNull
  public final Banner mBanner;

  @NonNull
  public final TextView mBannerCountTV;

  @NonNull
  public final TextView mCarInfoTV;

  @NonNull
  public final RecyclerView mEpcDetailRV;

  @NonNull
  public final Button mGoEnquireBTN;

  @NonNull
  public final ImageFilterView mIV;

  @NonNull
  public final TextView mSelectCountTV;

  @NonNull
  public final LinearLayoutCompat mSelectedLL;

  @NonNull
  public final CustomTitleBar mTitleBar;

  private ActivityEpcDetailBinding(@NonNull LinearLayoutCompat rootView, @NonNull TextView SelectTV,
      @NonNull Button mBackBTN, @NonNull Banner mBanner, @NonNull TextView mBannerCountTV,
      @NonNull TextView mCarInfoTV, @NonNull RecyclerView mEpcDetailRV,
      @NonNull Button mGoEnquireBTN, @NonNull ImageFilterView mIV, @NonNull TextView mSelectCountTV,
      @NonNull LinearLayoutCompat mSelectedLL, @NonNull CustomTitleBar mTitleBar) {
    this.rootView = rootView;
    this.SelectTV = SelectTV;
    this.mBackBTN = mBackBTN;
    this.mBanner = mBanner;
    this.mBannerCountTV = mBannerCountTV;
    this.mCarInfoTV = mCarInfoTV;
    this.mEpcDetailRV = mEpcDetailRV;
    this.mGoEnquireBTN = mGoEnquireBTN;
    this.mIV = mIV;
    this.mSelectCountTV = mSelectCountTV;
    this.mSelectedLL = mSelectedLL;
    this.mTitleBar = mTitleBar;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEpcDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEpcDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_epc_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEpcDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SelectTV;
      TextView SelectTV = rootView.findViewById(id);
      if (SelectTV == null) {
        break missingId;
      }

      id = R.id.mBackBTN;
      Button mBackBTN = rootView.findViewById(id);
      if (mBackBTN == null) {
        break missingId;
      }

      id = R.id.mBanner;
      Banner mBanner = rootView.findViewById(id);
      if (mBanner == null) {
        break missingId;
      }

      id = R.id.mBannerCountTV;
      TextView mBannerCountTV = rootView.findViewById(id);
      if (mBannerCountTV == null) {
        break missingId;
      }

      id = R.id.mCarInfoTV;
      TextView mCarInfoTV = rootView.findViewById(id);
      if (mCarInfoTV == null) {
        break missingId;
      }

      id = R.id.mEpcDetailRV;
      RecyclerView mEpcDetailRV = rootView.findViewById(id);
      if (mEpcDetailRV == null) {
        break missingId;
      }

      id = R.id.mGoEnquireBTN;
      Button mGoEnquireBTN = rootView.findViewById(id);
      if (mGoEnquireBTN == null) {
        break missingId;
      }

      id = R.id.mIV;
      ImageFilterView mIV = rootView.findViewById(id);
      if (mIV == null) {
        break missingId;
      }

      id = R.id.mSelectCountTV;
      TextView mSelectCountTV = rootView.findViewById(id);
      if (mSelectCountTV == null) {
        break missingId;
      }

      id = R.id.mSelectedLL;
      LinearLayoutCompat mSelectedLL = rootView.findViewById(id);
      if (mSelectedLL == null) {
        break missingId;
      }

      id = R.id.mTitleBar;
      CustomTitleBar mTitleBar = rootView.findViewById(id);
      if (mTitleBar == null) {
        break missingId;
      }

      return new ActivityEpcDetailBinding((LinearLayoutCompat) rootView, SelectTV, mBackBTN,
          mBanner, mBannerCountTV, mCarInfoTV, mEpcDetailRV, mGoEnquireBTN, mIV, mSelectCountTV,
          mSelectedLL, mTitleBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}