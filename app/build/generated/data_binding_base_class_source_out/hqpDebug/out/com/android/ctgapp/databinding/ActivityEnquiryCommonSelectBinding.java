// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.android.ctgapp.common.CommonRecyclerView;
import com.android.ctgapp.widget.CustomTitleBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEnquiryCommonSelectBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CustomTitleBar mAppBar;

  @NonNull
  public final Button mConfirmBTN;

  @NonNull
  public final CommonRecyclerView mRecyclerView;

  private ActivityEnquiryCommonSelectBinding(@NonNull LinearLayout rootView,
      @NonNull CustomTitleBar mAppBar, @NonNull Button mConfirmBTN,
      @NonNull CommonRecyclerView mRecyclerView) {
    this.rootView = rootView;
    this.mAppBar = mAppBar;
    this.mConfirmBTN = mConfirmBTN;
    this.mRecyclerView = mRecyclerView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEnquiryCommonSelectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEnquiryCommonSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_enquiry_common_select, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEnquiryCommonSelectBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAppBar;
      CustomTitleBar mAppBar = rootView.findViewById(id);
      if (mAppBar == null) {
        break missingId;
      }

      id = R.id.mConfirmBTN;
      Button mConfirmBTN = rootView.findViewById(id);
      if (mConfirmBTN == null) {
        break missingId;
      }

      id = R.id.mRecyclerView;
      CommonRecyclerView mRecyclerView = rootView.findViewById(id);
      if (mRecyclerView == null) {
        break missingId;
      }

      return new ActivityEnquiryCommonSelectBinding((LinearLayout) rootView, mAppBar, mConfirmBTN,
          mRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
