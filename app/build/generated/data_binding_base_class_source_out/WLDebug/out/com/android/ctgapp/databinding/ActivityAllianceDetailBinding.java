// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ActivityAllianceDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView mAllianceIV;

  @NonNull
  public final TextView mAllianceIntroTV;

  @NonNull
  public final RelativeLayout mAllianceNameRL;

  @NonNull
  public final TextView mAllianceNameTV;

  @NonNull
  public final TextView mAuthCodeTV;

  @NonNull
  public final ImageView mBackIv;

  @NonNull
  public final TextView mIndustryTV;

  @NonNull
  public final TextView mPhoneTV;

  private ActivityAllianceDetailBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView mAllianceIV, @NonNull TextView mAllianceIntroTV,
      @NonNull RelativeLayout mAllianceNameRL, @NonNull TextView mAllianceNameTV,
      @NonNull TextView mAuthCodeTV, @NonNull ImageView mBackIv, @NonNull TextView mIndustryTV,
      @NonNull TextView mPhoneTV) {
    this.rootView = rootView;
    this.mAllianceIV = mAllianceIV;
    this.mAllianceIntroTV = mAllianceIntroTV;
    this.mAllianceNameRL = mAllianceNameRL;
    this.mAllianceNameTV = mAllianceNameTV;
    this.mAuthCodeTV = mAuthCodeTV;
    this.mBackIv = mBackIv;
    this.mIndustryTV = mIndustryTV;
    this.mPhoneTV = mPhoneTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAllianceDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAllianceDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_alliance_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAllianceDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAllianceIV;
      ImageView mAllianceIV = rootView.findViewById(id);
      if (mAllianceIV == null) {
        break missingId;
      }

      id = R.id.mAllianceIntroTV;
      TextView mAllianceIntroTV = rootView.findViewById(id);
      if (mAllianceIntroTV == null) {
        break missingId;
      }

      id = R.id.mAllianceNameRL;
      RelativeLayout mAllianceNameRL = rootView.findViewById(id);
      if (mAllianceNameRL == null) {
        break missingId;
      }

      id = R.id.mAllianceNameTV;
      TextView mAllianceNameTV = rootView.findViewById(id);
      if (mAllianceNameTV == null) {
        break missingId;
      }

      id = R.id.mAuthCodeTV;
      TextView mAuthCodeTV = rootView.findViewById(id);
      if (mAuthCodeTV == null) {
        break missingId;
      }

      id = R.id.mBackIv;
      ImageView mBackIv = rootView.findViewById(id);
      if (mBackIv == null) {
        break missingId;
      }

      id = R.id.mIndustryTV;
      TextView mIndustryTV = rootView.findViewById(id);
      if (mIndustryTV == null) {
        break missingId;
      }

      id = R.id.mPhoneTV;
      TextView mPhoneTV = rootView.findViewById(id);
      if (mPhoneTV == null) {
        break missingId;
      }

      return new ActivityAllianceDetailBinding((LinearLayout) rootView, mAllianceIV,
          mAllianceIntroTV, mAllianceNameRL, mAllianceNameTV, mAuthCodeTV, mBackIv, mIndustryTV,
          mPhoneTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
