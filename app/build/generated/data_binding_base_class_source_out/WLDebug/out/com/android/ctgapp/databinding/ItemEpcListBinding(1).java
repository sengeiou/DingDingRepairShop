// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemEpcListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView mImageView;

  @NonNull
  public final LinearLayout mParentLL;

  @NonNull
  public final TextView mTextView;

  private ItemEpcListBinding(@NonNull LinearLayout rootView, @NonNull ImageView mImageView,
      @NonNull LinearLayout mParentLL, @NonNull TextView mTextView) {
    this.rootView = rootView;
    this.mImageView = mImageView;
    this.mParentLL = mParentLL;
    this.mTextView = mTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemEpcListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemEpcListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_epc_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemEpcListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mImageView;
      ImageView mImageView = rootView.findViewById(id);
      if (mImageView == null) {
        break missingId;
      }

      LinearLayout mParentLL = (LinearLayout) rootView;

      id = R.id.mTextView;
      TextView mTextView = rootView.findViewById(id);
      if (mTextView == null) {
        break missingId;
      }

      return new ItemEpcListBinding((LinearLayout) rootView, mImageView, mParentLL, mTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
