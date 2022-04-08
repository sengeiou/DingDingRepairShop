// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.android.ctgapp.widget.VinKeyboardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVinSearchBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView mCarImage;

  @NonNull
  public final TextView mCarInfoTV;

  @NonNull
  public final TextView mCarTitleTV;

  @NonNull
  public final LinearLayout mEpcPhotoLL;

  @NonNull
  public final ImageView mLogoIV;

  @NonNull
  public final LinearLayout mOfferConsultingLL;

  @NonNull
  public final TextView mPartPhotoTV;

  @NonNull
  public final ImageView mScanVIN;

  @NonNull
  public final EditText mSearchET;

  @NonNull
  public final LinearLayout mSpotLL;

  @NonNull
  public final VinKeyboardView mVinKeyboardView;

  @NonNull
  public final LinearLayout mVulnerablePartLL;

  private ActivityVinSearchBinding(@NonNull RelativeLayout rootView, @NonNull ImageView mCarImage,
      @NonNull TextView mCarInfoTV, @NonNull TextView mCarTitleTV,
      @NonNull LinearLayout mEpcPhotoLL, @NonNull ImageView mLogoIV,
      @NonNull LinearLayout mOfferConsultingLL, @NonNull TextView mPartPhotoTV,
      @NonNull ImageView mScanVIN, @NonNull EditText mSearchET, @NonNull LinearLayout mSpotLL,
      @NonNull VinKeyboardView mVinKeyboardView, @NonNull LinearLayout mVulnerablePartLL) {
    this.rootView = rootView;
    this.mCarImage = mCarImage;
    this.mCarInfoTV = mCarInfoTV;
    this.mCarTitleTV = mCarTitleTV;
    this.mEpcPhotoLL = mEpcPhotoLL;
    this.mLogoIV = mLogoIV;
    this.mOfferConsultingLL = mOfferConsultingLL;
    this.mPartPhotoTV = mPartPhotoTV;
    this.mScanVIN = mScanVIN;
    this.mSearchET = mSearchET;
    this.mSpotLL = mSpotLL;
    this.mVinKeyboardView = mVinKeyboardView;
    this.mVulnerablePartLL = mVulnerablePartLL;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVinSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVinSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_vin_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVinSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mCarImage;
      ImageView mCarImage = rootView.findViewById(id);
      if (mCarImage == null) {
        break missingId;
      }

      id = R.id.mCarInfoTV;
      TextView mCarInfoTV = rootView.findViewById(id);
      if (mCarInfoTV == null) {
        break missingId;
      }

      id = R.id.mCarTitleTV;
      TextView mCarTitleTV = rootView.findViewById(id);
      if (mCarTitleTV == null) {
        break missingId;
      }

      id = R.id.mEpcPhotoLL;
      LinearLayout mEpcPhotoLL = rootView.findViewById(id);
      if (mEpcPhotoLL == null) {
        break missingId;
      }

      id = R.id.mLogoIV;
      ImageView mLogoIV = rootView.findViewById(id);
      if (mLogoIV == null) {
        break missingId;
      }

      id = R.id.mOfferConsultingLL;
      LinearLayout mOfferConsultingLL = rootView.findViewById(id);
      if (mOfferConsultingLL == null) {
        break missingId;
      }

      id = R.id.mPartPhotoTV;
      TextView mPartPhotoTV = rootView.findViewById(id);
      if (mPartPhotoTV == null) {
        break missingId;
      }

      id = R.id.mScanVIN;
      ImageView mScanVIN = rootView.findViewById(id);
      if (mScanVIN == null) {
        break missingId;
      }

      id = R.id.mSearchET;
      EditText mSearchET = rootView.findViewById(id);
      if (mSearchET == null) {
        break missingId;
      }

      id = R.id.mSpotLL;
      LinearLayout mSpotLL = rootView.findViewById(id);
      if (mSpotLL == null) {
        break missingId;
      }

      id = R.id.mVinKeyboardView;
      VinKeyboardView mVinKeyboardView = rootView.findViewById(id);
      if (mVinKeyboardView == null) {
        break missingId;
      }

      id = R.id.mVulnerablePartLL;
      LinearLayout mVulnerablePartLL = rootView.findViewById(id);
      if (mVulnerablePartLL == null) {
        break missingId;
      }

      return new ActivityVinSearchBinding((RelativeLayout) rootView, mCarImage, mCarInfoTV,
          mCarTitleTV, mEpcPhotoLL, mLogoIV, mOfferConsultingLL, mPartPhotoTV, mScanVIN, mSearchET,
          mSpotLL, mVinKeyboardView, mVulnerablePartLL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}