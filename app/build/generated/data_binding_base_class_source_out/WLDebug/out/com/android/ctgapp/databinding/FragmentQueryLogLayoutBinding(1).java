// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.android.ctgapp.widget.SelectButton;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentQueryLogLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final SelectButton mAllBTN;

  @NonNull
  public final SelectButton mExceedBTN;

  @NonNull
  public final SelectButton mFinishBTN;

  @NonNull
  public final SelectButton mQueriedBTN;

  @NonNull
  public final RecyclerView mQueryRV;

  @NonNull
  public final SmartRefreshLayout mRefresh;

  @NonNull
  public final SelectButton mWaitQueryBTN;

  private FragmentQueryLogLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull SelectButton mAllBTN, @NonNull SelectButton mExceedBTN,
      @NonNull SelectButton mFinishBTN, @NonNull SelectButton mQueriedBTN,
      @NonNull RecyclerView mQueryRV, @NonNull SmartRefreshLayout mRefresh,
      @NonNull SelectButton mWaitQueryBTN) {
    this.rootView = rootView;
    this.mAllBTN = mAllBTN;
    this.mExceedBTN = mExceedBTN;
    this.mFinishBTN = mFinishBTN;
    this.mQueriedBTN = mQueriedBTN;
    this.mQueryRV = mQueryRV;
    this.mRefresh = mRefresh;
    this.mWaitQueryBTN = mWaitQueryBTN;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQueryLogLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQueryLogLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_query_log_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQueryLogLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAllBTN;
      SelectButton mAllBTN = rootView.findViewById(id);
      if (mAllBTN == null) {
        break missingId;
      }

      id = R.id.mExceedBTN;
      SelectButton mExceedBTN = rootView.findViewById(id);
      if (mExceedBTN == null) {
        break missingId;
      }

      id = R.id.mFinishBTN;
      SelectButton mFinishBTN = rootView.findViewById(id);
      if (mFinishBTN == null) {
        break missingId;
      }

      id = R.id.mQueriedBTN;
      SelectButton mQueriedBTN = rootView.findViewById(id);
      if (mQueriedBTN == null) {
        break missingId;
      }

      id = R.id.mQueryRV;
      RecyclerView mQueryRV = rootView.findViewById(id);
      if (mQueryRV == null) {
        break missingId;
      }

      id = R.id.mRefresh;
      SmartRefreshLayout mRefresh = rootView.findViewById(id);
      if (mRefresh == null) {
        break missingId;
      }

      id = R.id.mWaitQueryBTN;
      SelectButton mWaitQueryBTN = rootView.findViewById(id);
      if (mWaitQueryBTN == null) {
        break missingId;
      }

      return new FragmentQueryLogLayoutBinding((LinearLayout) rootView, mAllBTN, mExceedBTN,
          mFinishBTN, mQueriedBTN, mQueryRV, mRefresh, mWaitQueryBTN);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
