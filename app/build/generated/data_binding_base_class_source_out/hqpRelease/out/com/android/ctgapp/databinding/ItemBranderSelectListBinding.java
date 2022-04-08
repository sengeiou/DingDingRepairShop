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

public final class ItemBranderSelectListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mGroupNameTV;

  @NonNull
  public final LinearLayout mParentLL;

  @NonNull
  public final ImageView mSelectIV;

  private ItemBranderSelectListBinding(@NonNull LinearLayout rootView,
      @NonNull TextView mGroupNameTV, @NonNull LinearLayout mParentLL,
      @NonNull ImageView mSelectIV) {
    this.rootView = rootView;
    this.mGroupNameTV = mGroupNameTV;
    this.mParentLL = mParentLL;
    this.mSelectIV = mSelectIV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBranderSelectListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBranderSelectListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_brander_select_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBranderSelectListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mGroupNameTV;
      TextView mGroupNameTV = rootView.findViewById(id);
      if (mGroupNameTV == null) {
        break missingId;
      }

      LinearLayout mParentLL = (LinearLayout) rootView;

      id = R.id.mSelectIV;
      ImageView mSelectIV = rootView.findViewById(id);
      if (mSelectIV == null) {
        break missingId;
      }

      return new ItemBranderSelectListBinding((LinearLayout) rootView, mGroupNameTV, mParentLL,
          mSelectIV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
