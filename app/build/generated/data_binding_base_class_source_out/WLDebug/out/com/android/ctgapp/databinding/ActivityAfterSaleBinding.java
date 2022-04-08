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

public final class ActivityAfterSaleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView mAfterSaleRV;

  @NonNull
  public final SelectButton mAllBTN;

  @NonNull
  public final SelectButton mFinishBTN;

  @NonNull
  public final SelectButton mInspectionBTN;

  @NonNull
  public final SmartRefreshLayout mRefresh;

  @NonNull
  public final SelectButton mRefundBTN;

  @NonNull
  public final SelectButton mReviewingBTN;

  @NonNull
  public final SelectButton mSendGoodsBTN;

  private ActivityAfterSaleBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView mAfterSaleRV, @NonNull SelectButton mAllBTN,
      @NonNull SelectButton mFinishBTN, @NonNull SelectButton mInspectionBTN,
      @NonNull SmartRefreshLayout mRefresh, @NonNull SelectButton mRefundBTN,
      @NonNull SelectButton mReviewingBTN, @NonNull SelectButton mSendGoodsBTN) {
    this.rootView = rootView;
    this.mAfterSaleRV = mAfterSaleRV;
    this.mAllBTN = mAllBTN;
    this.mFinishBTN = mFinishBTN;
    this.mInspectionBTN = mInspectionBTN;
    this.mRefresh = mRefresh;
    this.mRefundBTN = mRefundBTN;
    this.mReviewingBTN = mReviewingBTN;
    this.mSendGoodsBTN = mSendGoodsBTN;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAfterSaleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAfterSaleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_after_sale, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAfterSaleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAfterSaleRV;
      RecyclerView mAfterSaleRV = rootView.findViewById(id);
      if (mAfterSaleRV == null) {
        break missingId;
      }

      id = R.id.mAllBTN;
      SelectButton mAllBTN = rootView.findViewById(id);
      if (mAllBTN == null) {
        break missingId;
      }

      id = R.id.mFinishBTN;
      SelectButton mFinishBTN = rootView.findViewById(id);
      if (mFinishBTN == null) {
        break missingId;
      }

      id = R.id.mInspectionBTN;
      SelectButton mInspectionBTN = rootView.findViewById(id);
      if (mInspectionBTN == null) {
        break missingId;
      }

      id = R.id.mRefresh;
      SmartRefreshLayout mRefresh = rootView.findViewById(id);
      if (mRefresh == null) {
        break missingId;
      }

      id = R.id.mRefundBTN;
      SelectButton mRefundBTN = rootView.findViewById(id);
      if (mRefundBTN == null) {
        break missingId;
      }

      id = R.id.mReviewingBTN;
      SelectButton mReviewingBTN = rootView.findViewById(id);
      if (mReviewingBTN == null) {
        break missingId;
      }

      id = R.id.mSendGoodsBTN;
      SelectButton mSendGoodsBTN = rootView.findViewById(id);
      if (mSendGoodsBTN == null) {
        break missingId;
      }

      return new ActivityAfterSaleBinding((LinearLayout) rootView, mAfterSaleRV, mAllBTN,
          mFinishBTN, mInspectionBTN, mRefresh, mRefundBTN, mReviewingBTN, mSendGoodsBTN);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
