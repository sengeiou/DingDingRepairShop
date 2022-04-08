// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityComoanyInfoSettingBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText mAddressDetailET;

  @NonNull
  public final LinearLayout mAddressSelectLL;

  @NonNull
  public final TextView mAddressSelectTV;

  @NonNull
  public final TextView mCarSeries;

  @NonNull
  public final LinearLayout mCarSeriesLL;

  @NonNull
  public final EditText mCompanyEmailET;

  @NonNull
  public final TextView mCompanyIntroTV;

  @NonNull
  public final EditText mCompanyPhoneET;

  @NonNull
  public final TextView mCompanySizeTV;

  @NonNull
  public final EditText mCompanyUrlET;

  @NonNull
  public final Button mConfirmBTN;

  @NonNull
  public final LinearLayout mInsuranceLL;

  @NonNull
  public final TextView mInsuranceTV;

  @NonNull
  public final LinearLayout mIntroLL;

  @NonNull
  public final LinearLayout mLevelLL;

  @NonNull
  public final TextView mLevelTV;

  @NonNull
  public final ImageView mSizePoint;

  private ActivityComoanyInfoSettingBinding(@NonNull LinearLayout rootView,
      @NonNull EditText mAddressDetailET, @NonNull LinearLayout mAddressSelectLL,
      @NonNull TextView mAddressSelectTV, @NonNull TextView mCarSeries,
      @NonNull LinearLayout mCarSeriesLL, @NonNull EditText mCompanyEmailET,
      @NonNull TextView mCompanyIntroTV, @NonNull EditText mCompanyPhoneET,
      @NonNull TextView mCompanySizeTV, @NonNull EditText mCompanyUrlET,
      @NonNull Button mConfirmBTN, @NonNull LinearLayout mInsuranceLL,
      @NonNull TextView mInsuranceTV, @NonNull LinearLayout mIntroLL,
      @NonNull LinearLayout mLevelLL, @NonNull TextView mLevelTV, @NonNull ImageView mSizePoint) {
    this.rootView = rootView;
    this.mAddressDetailET = mAddressDetailET;
    this.mAddressSelectLL = mAddressSelectLL;
    this.mAddressSelectTV = mAddressSelectTV;
    this.mCarSeries = mCarSeries;
    this.mCarSeriesLL = mCarSeriesLL;
    this.mCompanyEmailET = mCompanyEmailET;
    this.mCompanyIntroTV = mCompanyIntroTV;
    this.mCompanyPhoneET = mCompanyPhoneET;
    this.mCompanySizeTV = mCompanySizeTV;
    this.mCompanyUrlET = mCompanyUrlET;
    this.mConfirmBTN = mConfirmBTN;
    this.mInsuranceLL = mInsuranceLL;
    this.mInsuranceTV = mInsuranceTV;
    this.mIntroLL = mIntroLL;
    this.mLevelLL = mLevelLL;
    this.mLevelTV = mLevelTV;
    this.mSizePoint = mSizePoint;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityComoanyInfoSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityComoanyInfoSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_comoany_info_setting, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityComoanyInfoSettingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAddressDetailET;
      EditText mAddressDetailET = rootView.findViewById(id);
      if (mAddressDetailET == null) {
        break missingId;
      }

      id = R.id.mAddressSelectLL;
      LinearLayout mAddressSelectLL = rootView.findViewById(id);
      if (mAddressSelectLL == null) {
        break missingId;
      }

      id = R.id.mAddressSelectTV;
      TextView mAddressSelectTV = rootView.findViewById(id);
      if (mAddressSelectTV == null) {
        break missingId;
      }

      id = R.id.mCarSeries;
      TextView mCarSeries = rootView.findViewById(id);
      if (mCarSeries == null) {
        break missingId;
      }

      id = R.id.mCarSeriesLL;
      LinearLayout mCarSeriesLL = rootView.findViewById(id);
      if (mCarSeriesLL == null) {
        break missingId;
      }

      id = R.id.mCompanyEmailET;
      EditText mCompanyEmailET = rootView.findViewById(id);
      if (mCompanyEmailET == null) {
        break missingId;
      }

      id = R.id.mCompanyIntroTV;
      TextView mCompanyIntroTV = rootView.findViewById(id);
      if (mCompanyIntroTV == null) {
        break missingId;
      }

      id = R.id.mCompanyPhoneET;
      EditText mCompanyPhoneET = rootView.findViewById(id);
      if (mCompanyPhoneET == null) {
        break missingId;
      }

      id = R.id.mCompanySizeTV;
      TextView mCompanySizeTV = rootView.findViewById(id);
      if (mCompanySizeTV == null) {
        break missingId;
      }

      id = R.id.mCompanyUrlET;
      EditText mCompanyUrlET = rootView.findViewById(id);
      if (mCompanyUrlET == null) {
        break missingId;
      }

      id = R.id.mConfirmBTN;
      Button mConfirmBTN = rootView.findViewById(id);
      if (mConfirmBTN == null) {
        break missingId;
      }

      id = R.id.mInsuranceLL;
      LinearLayout mInsuranceLL = rootView.findViewById(id);
      if (mInsuranceLL == null) {
        break missingId;
      }

      id = R.id.mInsuranceTV;
      TextView mInsuranceTV = rootView.findViewById(id);
      if (mInsuranceTV == null) {
        break missingId;
      }

      id = R.id.mIntroLL;
      LinearLayout mIntroLL = rootView.findViewById(id);
      if (mIntroLL == null) {
        break missingId;
      }

      id = R.id.mLevelLL;
      LinearLayout mLevelLL = rootView.findViewById(id);
      if (mLevelLL == null) {
        break missingId;
      }

      id = R.id.mLevelTV;
      TextView mLevelTV = rootView.findViewById(id);
      if (mLevelTV == null) {
        break missingId;
      }

      id = R.id.mSizePoint;
      ImageView mSizePoint = rootView.findViewById(id);
      if (mSizePoint == null) {
        break missingId;
      }

      return new ActivityComoanyInfoSettingBinding((LinearLayout) rootView, mAddressDetailET,
          mAddressSelectLL, mAddressSelectTV, mCarSeries, mCarSeriesLL, mCompanyEmailET,
          mCompanyIntroTV, mCompanyPhoneET, mCompanySizeTV, mCompanyUrlET, mConfirmBTN,
          mInsuranceLL, mInsuranceTV, mIntroLL, mLevelLL, mLevelTV, mSizePoint);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}