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
import com.github.mikephil.charting.charts.LineChart;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVisitorBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mAllCountTV;

  @NonNull
  public final LineChart mVisitorLineChart;

  @NonNull
  public final CommonRecyclerView mVisitorRV;

  private ActivityVisitorBinding(@NonNull LinearLayout rootView, @NonNull TextView mAllCountTV,
      @NonNull LineChart mVisitorLineChart, @NonNull CommonRecyclerView mVisitorRV) {
    this.rootView = rootView;
    this.mAllCountTV = mAllCountTV;
    this.mVisitorLineChart = mVisitorLineChart;
    this.mVisitorRV = mVisitorRV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVisitorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVisitorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_visitor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVisitorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAllCountTV;
      TextView mAllCountTV = rootView.findViewById(id);
      if (mAllCountTV == null) {
        break missingId;
      }

      id = R.id.mVisitorLineChart;
      LineChart mVisitorLineChart = rootView.findViewById(id);
      if (mVisitorLineChart == null) {
        break missingId;
      }

      id = R.id.mVisitorRV;
      CommonRecyclerView mVisitorRV = rootView.findViewById(id);
      if (mVisitorRV == null) {
        break missingId;
      }

      return new ActivityVisitorBinding((LinearLayout) rootView, mAllCountTV, mVisitorLineChart,
          mVisitorRV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
