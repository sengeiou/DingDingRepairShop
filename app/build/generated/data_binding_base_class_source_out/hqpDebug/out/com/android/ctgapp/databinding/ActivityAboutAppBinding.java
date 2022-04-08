// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAboutAppBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mAppCodeTV;

  @NonNull
  public final LinearLayout mCopyrightInformationLL;

  @NonNull
  public final LinearLayout mNewFunctionLL;

  @NonNull
  public final LinearLayout mPrivacyAgreementLL;

  @NonNull
  public final LinearLayout mServiceAgreementLL;

  private ActivityAboutAppBinding(@NonNull LinearLayout rootView, @NonNull TextView mAppCodeTV,
      @NonNull LinearLayout mCopyrightInformationLL, @NonNull LinearLayout mNewFunctionLL,
      @NonNull LinearLayout mPrivacyAgreementLL, @NonNull LinearLayout mServiceAgreementLL) {
    this.rootView = rootView;
    this.mAppCodeTV = mAppCodeTV;
    this.mCopyrightInformationLL = mCopyrightInformationLL;
    this.mNewFunctionLL = mNewFunctionLL;
    this.mPrivacyAgreementLL = mPrivacyAgreementLL;
    this.mServiceAgreementLL = mServiceAgreementLL;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAboutAppBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAboutAppBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_about_app, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAboutAppBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAppCodeTV;
      TextView mAppCodeTV = rootView.findViewById(id);
      if (mAppCodeTV == null) {
        break missingId;
      }

      id = R.id.mCopyrightInformationLL;
      LinearLayout mCopyrightInformationLL = rootView.findViewById(id);
      if (mCopyrightInformationLL == null) {
        break missingId;
      }

      id = R.id.mNewFunctionLL;
      LinearLayout mNewFunctionLL = rootView.findViewById(id);
      if (mNewFunctionLL == null) {
        break missingId;
      }

      id = R.id.mPrivacyAgreementLL;
      LinearLayout mPrivacyAgreementLL = rootView.findViewById(id);
      if (mPrivacyAgreementLL == null) {
        break missingId;
      }

      id = R.id.mServiceAgreementLL;
      LinearLayout mServiceAgreementLL = rootView.findViewById(id);
      if (mServiceAgreementLL == null) {
        break missingId;
      }

      return new ActivityAboutAppBinding((LinearLayout) rootView, mAppCodeTV,
          mCopyrightInformationLL, mNewFunctionLL, mPrivacyAgreementLL, mServiceAgreementLL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
