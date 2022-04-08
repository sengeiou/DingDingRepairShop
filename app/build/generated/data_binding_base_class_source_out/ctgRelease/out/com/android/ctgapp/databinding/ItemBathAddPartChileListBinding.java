// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemBathAddPartChileListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout mParentLL;

  @NonNull
  public final RelativeLayout mParentRL;

  @NonNull
  public final ImageView mPartIV;

  @NonNull
  public final TextView mPartNameTV;

  @NonNull
  public final ImageView mSelectedTV;

  private ItemBathAddPartChileListBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout mParentLL, @NonNull RelativeLayout mParentRL,
      @NonNull ImageView mPartIV, @NonNull TextView mPartNameTV, @NonNull ImageView mSelectedTV) {
    this.rootView = rootView;
    this.mParentLL = mParentLL;
    this.mParentRL = mParentRL;
    this.mPartIV = mPartIV;
    this.mPartNameTV = mPartNameTV;
    this.mSelectedTV = mSelectedTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBathAddPartChileListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBathAddPartChileListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_bath_add_part_chile_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBathAddPartChileListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout mParentLL = (LinearLayout) rootView;

      id = R.id.mParentRL;
      RelativeLayout mParentRL = rootView.findViewById(id);
      if (mParentRL == null) {
        break missingId;
      }

      id = R.id.mPartIV;
      ImageView mPartIV = rootView.findViewById(id);
      if (mPartIV == null) {
        break missingId;
      }

      id = R.id.mPartNameTV;
      TextView mPartNameTV = rootView.findViewById(id);
      if (mPartNameTV == null) {
        break missingId;
      }

      id = R.id.mSelectedTV;
      ImageView mSelectedTV = rootView.findViewById(id);
      if (mSelectedTV == null) {
        break missingId;
      }

      return new ItemBathAddPartChileListBinding((LinearLayout) rootView, mParentLL, mParentRL,
          mPartIV, mPartNameTV, mSelectedTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
