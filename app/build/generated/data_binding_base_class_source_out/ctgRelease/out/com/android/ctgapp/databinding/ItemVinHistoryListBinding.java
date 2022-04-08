// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemVinHistoryListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView mCarInfoTV;

  @NonNull
  public final ImageView mImageView;

  @NonNull
  public final RelativeLayout mParentRL;

  @NonNull
  public final TextView mTimeTV;

  @NonNull
  public final TextView mVinCodeTV;

  private ItemVinHistoryListBinding(@NonNull RelativeLayout rootView, @NonNull TextView mCarInfoTV,
      @NonNull ImageView mImageView, @NonNull RelativeLayout mParentRL, @NonNull TextView mTimeTV,
      @NonNull TextView mVinCodeTV) {
    this.rootView = rootView;
    this.mCarInfoTV = mCarInfoTV;
    this.mImageView = mImageView;
    this.mParentRL = mParentRL;
    this.mTimeTV = mTimeTV;
    this.mVinCodeTV = mVinCodeTV;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemVinHistoryListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemVinHistoryListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_vin_history_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemVinHistoryListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mCarInfoTV;
      TextView mCarInfoTV = rootView.findViewById(id);
      if (mCarInfoTV == null) {
        break missingId;
      }

      id = R.id.mImageView;
      ImageView mImageView = rootView.findViewById(id);
      if (mImageView == null) {
        break missingId;
      }

      RelativeLayout mParentRL = (RelativeLayout) rootView;

      id = R.id.mTimeTV;
      TextView mTimeTV = rootView.findViewById(id);
      if (mTimeTV == null) {
        break missingId;
      }

      id = R.id.mVinCodeTV;
      TextView mVinCodeTV = rootView.findViewById(id);
      if (mVinCodeTV == null) {
        break missingId;
      }

      return new ItemVinHistoryListBinding((RelativeLayout) rootView, mCarInfoTV, mImageView,
          mParentRL, mTimeTV, mVinCodeTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
