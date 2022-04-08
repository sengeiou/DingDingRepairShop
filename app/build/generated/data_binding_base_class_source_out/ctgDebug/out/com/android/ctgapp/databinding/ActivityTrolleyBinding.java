// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTrolleyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CheckBox mAllSelectCB;

  @NonNull
  public final Button mConfirmBTN;

  @NonNull
  public final Button mDeleteBTN;

  @NonNull
  public final TextView mManagerTV;

  @NonNull
  public final TextView mQuickCleanTV;

  @NonNull
  public final LinearLayout mTotalPriceLL;

  @NonNull
  public final TextView mTotalPriceTV;

  @NonNull
  public final SwipeRecyclerView mTrolleyRV;

  private ActivityTrolleyBinding(@NonNull LinearLayout rootView, @NonNull CheckBox mAllSelectCB,
      @NonNull Button mConfirmBTN, @NonNull Button mDeleteBTN, @NonNull TextView mManagerTV,
      @NonNull TextView mQuickCleanTV, @NonNull LinearLayout mTotalPriceLL,
      @NonNull TextView mTotalPriceTV, @NonNull SwipeRecyclerView mTrolleyRV) {
    this.rootView = rootView;
    this.mAllSelectCB = mAllSelectCB;
    this.mConfirmBTN = mConfirmBTN;
    this.mDeleteBTN = mDeleteBTN;
    this.mManagerTV = mManagerTV;
    this.mQuickCleanTV = mQuickCleanTV;
    this.mTotalPriceLL = mTotalPriceLL;
    this.mTotalPriceTV = mTotalPriceTV;
    this.mTrolleyRV = mTrolleyRV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTrolleyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTrolleyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_trolley, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTrolleyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAllSelectCB;
      CheckBox mAllSelectCB = rootView.findViewById(id);
      if (mAllSelectCB == null) {
        break missingId;
      }

      id = R.id.mConfirmBTN;
      Button mConfirmBTN = rootView.findViewById(id);
      if (mConfirmBTN == null) {
        break missingId;
      }

      id = R.id.mDeleteBTN;
      Button mDeleteBTN = rootView.findViewById(id);
      if (mDeleteBTN == null) {
        break missingId;
      }

      id = R.id.mManagerTV;
      TextView mManagerTV = rootView.findViewById(id);
      if (mManagerTV == null) {
        break missingId;
      }

      id = R.id.mQuickCleanTV;
      TextView mQuickCleanTV = rootView.findViewById(id);
      if (mQuickCleanTV == null) {
        break missingId;
      }

      id = R.id.mTotalPriceLL;
      LinearLayout mTotalPriceLL = rootView.findViewById(id);
      if (mTotalPriceLL == null) {
        break missingId;
      }

      id = R.id.mTotalPriceTV;
      TextView mTotalPriceTV = rootView.findViewById(id);
      if (mTotalPriceTV == null) {
        break missingId;
      }

      id = R.id.mTrolleyRV;
      SwipeRecyclerView mTrolleyRV = rootView.findViewById(id);
      if (mTrolleyRV == null) {
        break missingId;
      }

      return new ActivityTrolleyBinding((LinearLayout) rootView, mAllSelectCB, mConfirmBTN,
          mDeleteBTN, mManagerTV, mQuickCleanTV, mTotalPriceLL, mTotalPriceTV, mTrolleyRV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
