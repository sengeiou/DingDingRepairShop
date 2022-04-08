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
import com.android.ctgapp.common.CommonRecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCompanyBalanceBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CommonRecyclerView mBalanceRV;

  @NonNull
  public final TextView mBalanceValueTV;

  @NonNull
  public final View mLine;

  @NonNull
  public final SmartRefreshLayout mRefresh;

  @NonNull
  public final TextView mTopUpTV;

  private ActivityCompanyBalanceBinding(@NonNull LinearLayout rootView,
      @NonNull CommonRecyclerView mBalanceRV, @NonNull TextView mBalanceValueTV,
      @NonNull View mLine, @NonNull SmartRefreshLayout mRefresh, @NonNull TextView mTopUpTV) {
    this.rootView = rootView;
    this.mBalanceRV = mBalanceRV;
    this.mBalanceValueTV = mBalanceValueTV;
    this.mLine = mLine;
    this.mRefresh = mRefresh;
    this.mTopUpTV = mTopUpTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCompanyBalanceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCompanyBalanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_company_balance, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCompanyBalanceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBalanceRV;
      CommonRecyclerView mBalanceRV = rootView.findViewById(id);
      if (mBalanceRV == null) {
        break missingId;
      }

      id = R.id.mBalanceValueTV;
      TextView mBalanceValueTV = rootView.findViewById(id);
      if (mBalanceValueTV == null) {
        break missingId;
      }

      id = R.id.mLine;
      View mLine = rootView.findViewById(id);
      if (mLine == null) {
        break missingId;
      }

      id = R.id.mRefresh;
      SmartRefreshLayout mRefresh = rootView.findViewById(id);
      if (mRefresh == null) {
        break missingId;
      }

      id = R.id.mTopUpTV;
      TextView mTopUpTV = rootView.findViewById(id);
      if (mTopUpTV == null) {
        break missingId;
      }

      return new ActivityCompanyBalanceBinding((LinearLayout) rootView, mBalanceRV, mBalanceValueTV,
          mLine, mRefresh, mTopUpTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
