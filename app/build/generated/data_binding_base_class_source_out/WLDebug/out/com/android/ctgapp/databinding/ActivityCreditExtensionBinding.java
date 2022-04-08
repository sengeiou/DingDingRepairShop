// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.android.ctgapp.widget.CustomTitleBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreditExtensionBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final ImageView mDealFlowIV;

  @NonNull
  public final CustomTitleBar mTitleTV;

  @NonNull
  public final TextView mTopTV;

  @NonNull
  public final TextView mWaitPayTV;

  private ActivityCreditExtensionBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull ImageView mDealFlowIV, @NonNull CustomTitleBar mTitleTV, @NonNull TextView mTopTV,
      @NonNull TextView mWaitPayTV) {
    this.rootView = rootView;
    this.mDealFlowIV = mDealFlowIV;
    this.mTitleTV = mTitleTV;
    this.mTopTV = mTopTV;
    this.mWaitPayTV = mWaitPayTV;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreditExtensionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreditExtensionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_credit_extension, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreditExtensionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mDealFlowIV;
      ImageView mDealFlowIV = rootView.findViewById(id);
      if (mDealFlowIV == null) {
        break missingId;
      }

      id = R.id.mTitleTV;
      CustomTitleBar mTitleTV = rootView.findViewById(id);
      if (mTitleTV == null) {
        break missingId;
      }

      id = R.id.mTopTV;
      TextView mTopTV = rootView.findViewById(id);
      if (mTopTV == null) {
        break missingId;
      }

      id = R.id.mWaitPayTV;
      TextView mWaitPayTV = rootView.findViewById(id);
      if (mWaitPayTV == null) {
        break missingId;
      }

      return new ActivityCreditExtensionBinding((LinearLayoutCompat) rootView, mDealFlowIV,
          mTitleTV, mTopTV, mWaitPayTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
