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

public final class ItemShouxinBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView mCanUseMoneyTV;

  @NonNull
  public final TextView mNameTV;

  @NonNull
  public final TextView mStatueTV;

  @NonNull
  public final TextView mTimeTV;

  private ItemShouxinBinding(@NonNull RelativeLayout rootView, @NonNull TextView mCanUseMoneyTV,
      @NonNull TextView mNameTV, @NonNull TextView mStatueTV, @NonNull TextView mTimeTV) {
    this.rootView = rootView;
    this.mCanUseMoneyTV = mCanUseMoneyTV;
    this.mNameTV = mNameTV;
    this.mStatueTV = mStatueTV;
    this.mTimeTV = mTimeTV;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemShouxinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemShouxinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_shouxin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemShouxinBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mCanUseMoneyTV;
      TextView mCanUseMoneyTV = rootView.findViewById(id);
      if (mCanUseMoneyTV == null) {
        break missingId;
      }

      id = R.id.mNameTV;
      TextView mNameTV = rootView.findViewById(id);
      if (mNameTV == null) {
        break missingId;
      }

      id = R.id.mStatueTV;
      TextView mStatueTV = rootView.findViewById(id);
      if (mStatueTV == null) {
        break missingId;
      }

      id = R.id.mTimeTV;
      TextView mTimeTV = rootView.findViewById(id);
      if (mTimeTV == null) {
        break missingId;
      }

      return new ItemShouxinBinding((RelativeLayout) rootView, mCanUseMoneyTV, mNameTV, mStatueTV,
          mTimeTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}