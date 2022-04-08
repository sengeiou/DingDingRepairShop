// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySwicthCompanyBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView mBackIv;

  @NonNull
  public final LinearLayout mBottomLL;

  @NonNull
  public final SwipeRecyclerView mCompanyRV;

  @NonNull
  public final Button mCreateCompanyBTN;

  @NonNull
  public final Button mJoinCompanyBTN;

  @NonNull
  public final RelativeLayout mTitleBar;

  private ActivitySwicthCompanyBinding(@NonNull RelativeLayout rootView, @NonNull ImageView mBackIv,
      @NonNull LinearLayout mBottomLL, @NonNull SwipeRecyclerView mCompanyRV,
      @NonNull Button mCreateCompanyBTN, @NonNull Button mJoinCompanyBTN,
      @NonNull RelativeLayout mTitleBar) {
    this.rootView = rootView;
    this.mBackIv = mBackIv;
    this.mBottomLL = mBottomLL;
    this.mCompanyRV = mCompanyRV;
    this.mCreateCompanyBTN = mCreateCompanyBTN;
    this.mJoinCompanyBTN = mJoinCompanyBTN;
    this.mTitleBar = mTitleBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySwicthCompanyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySwicthCompanyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_swicth_company, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySwicthCompanyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBackIv;
      ImageView mBackIv = rootView.findViewById(id);
      if (mBackIv == null) {
        break missingId;
      }

      id = R.id.mBottomLL;
      LinearLayout mBottomLL = rootView.findViewById(id);
      if (mBottomLL == null) {
        break missingId;
      }

      id = R.id.mCompanyRV;
      SwipeRecyclerView mCompanyRV = rootView.findViewById(id);
      if (mCompanyRV == null) {
        break missingId;
      }

      id = R.id.mCreateCompanyBTN;
      Button mCreateCompanyBTN = rootView.findViewById(id);
      if (mCreateCompanyBTN == null) {
        break missingId;
      }

      id = R.id.mJoinCompanyBTN;
      Button mJoinCompanyBTN = rootView.findViewById(id);
      if (mJoinCompanyBTN == null) {
        break missingId;
      }

      id = R.id.mTitleBar;
      RelativeLayout mTitleBar = rootView.findViewById(id);
      if (mTitleBar == null) {
        break missingId;
      }

      return new ActivitySwicthCompanyBinding((RelativeLayout) rootView, mBackIv, mBottomLL,
          mCompanyRV, mCreateCompanyBTN, mJoinCompanyBTN, mTitleBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}