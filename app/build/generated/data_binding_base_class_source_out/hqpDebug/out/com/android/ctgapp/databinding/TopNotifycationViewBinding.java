// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TopNotifycationViewBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView mBTN;

  @NonNull
  public final TextView mContentTV;

  @NonNull
  public final TextView mTitleTV;

  private TopNotifycationViewBinding(@NonNull RelativeLayout rootView, @NonNull TextView mBTN,
      @NonNull TextView mContentTV, @NonNull TextView mTitleTV) {
    this.rootView = rootView;
    this.mBTN = mBTN;
    this.mContentTV = mContentTV;
    this.mTitleTV = mTitleTV;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TopNotifycationViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TopNotifycationViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.top_notifycation_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TopNotifycationViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBTN;
      TextView mBTN = rootView.findViewById(id);
      if (mBTN == null) {
        break missingId;
      }

      id = R.id.mContentTV;
      TextView mContentTV = rootView.findViewById(id);
      if (mContentTV == null) {
        break missingId;
      }

      id = R.id.mTitleTV;
      TextView mTitleTV = rootView.findViewById(id);
      if (mTitleTV == null) {
        break missingId;
      }

      return new TopNotifycationViewBinding((RelativeLayout) rootView, mBTN, mContentTV, mTitleTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
