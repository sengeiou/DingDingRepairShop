// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.android.ctgapp.widget.CommonHorizontalLayout;
import com.android.ctgapp.widget.CustomTitleBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityQueryRecordDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout mBottomRL;

  @NonNull
  public final CommonHorizontalLayout mOrderNumTV;

  @NonNull
  public final CustomTitleBar mTitleBar;

  private ActivityQueryRecordDetailBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout mBottomRL, @NonNull CommonHorizontalLayout mOrderNumTV,
      @NonNull CustomTitleBar mTitleBar) {
    this.rootView = rootView;
    this.mBottomRL = mBottomRL;
    this.mOrderNumTV = mOrderNumTV;
    this.mTitleBar = mTitleBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityQueryRecordDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityQueryRecordDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_query_record_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityQueryRecordDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBottomRL;
      RelativeLayout mBottomRL = rootView.findViewById(id);
      if (mBottomRL == null) {
        break missingId;
      }

      id = R.id.mOrderNumTV;
      CommonHorizontalLayout mOrderNumTV = rootView.findViewById(id);
      if (mOrderNumTV == null) {
        break missingId;
      }

      id = R.id.mTitleBar;
      CustomTitleBar mTitleBar = rootView.findViewById(id);
      if (mTitleBar == null) {
        break missingId;
      }

      return new ActivityQueryRecordDetailBinding((RelativeLayout) rootView, mBottomRL, mOrderNumTV,
          mTitleBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}