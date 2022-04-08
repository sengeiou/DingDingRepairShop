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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCitySelectDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView mCityRV;

  @NonNull
  public final TextView mCityTV;

  @NonNull
  public final ImageView mDeleteIV;

  @NonNull
  public final TextView mDistrictTV;

  @NonNull
  public final TextView mProvinceTV;

  private ItemCitySelectDialogBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView mCityRV,
      @NonNull TextView mCityTV, @NonNull ImageView mDeleteIV, @NonNull TextView mDistrictTV,
      @NonNull TextView mProvinceTV) {
    this.rootView = rootView;
    this.mCityRV = mCityRV;
    this.mCityTV = mCityTV;
    this.mDeleteIV = mDeleteIV;
    this.mDistrictTV = mDistrictTV;
    this.mProvinceTV = mProvinceTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCitySelectDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCitySelectDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_city_select_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCitySelectDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mCityRV;
      RecyclerView mCityRV = rootView.findViewById(id);
      if (mCityRV == null) {
        break missingId;
      }

      id = R.id.mCityTV;
      TextView mCityTV = rootView.findViewById(id);
      if (mCityTV == null) {
        break missingId;
      }

      id = R.id.mDeleteIV;
      ImageView mDeleteIV = rootView.findViewById(id);
      if (mDeleteIV == null) {
        break missingId;
      }

      id = R.id.mDistrictTV;
      TextView mDistrictTV = rootView.findViewById(id);
      if (mDistrictTV == null) {
        break missingId;
      }

      id = R.id.mProvinceTV;
      TextView mProvinceTV = rootView.findViewById(id);
      if (mProvinceTV == null) {
        break missingId;
      }

      return new ItemCitySelectDialogBinding((LinearLayout) rootView, mCityRV, mCityTV, mDeleteIV,
          mDistrictTV, mProvinceTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
