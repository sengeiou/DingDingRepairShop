// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemOrderCanChartBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView mContactsRV;

  @NonNull
  public final ImageView mDeleteIV;

  private ItemOrderCanChartBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView mContactsRV, @NonNull ImageView mDeleteIV) {
    this.rootView = rootView;
    this.mContactsRV = mContactsRV;
    this.mDeleteIV = mDeleteIV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemOrderCanChartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemOrderCanChartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_order_can_chart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemOrderCanChartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mContactsRV;
      RecyclerView mContactsRV = rootView.findViewById(id);
      if (mContactsRV == null) {
        break missingId;
      }

      id = R.id.mDeleteIV;
      ImageView mDeleteIV = rootView.findViewById(id);
      if (mDeleteIV == null) {
        break missingId;
      }

      return new ItemOrderCanChartBinding((LinearLayout) rootView, mContactsRV, mDeleteIV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
