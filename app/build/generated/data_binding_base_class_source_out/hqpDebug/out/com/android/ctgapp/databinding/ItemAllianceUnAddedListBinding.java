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

public final class ItemAllianceUnAddedListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mButtonTV;

  @NonNull
  public final TextView mCompanyTV;

  @NonNull
  public final ImageView mLoGoIV;

  @NonNull
  public final TextView mNameTV;

  @NonNull
  public final TextView mTypeTV;

  private ItemAllianceUnAddedListBinding(@NonNull LinearLayout rootView,
      @NonNull TextView mButtonTV, @NonNull TextView mCompanyTV, @NonNull ImageView mLoGoIV,
      @NonNull TextView mNameTV, @NonNull TextView mTypeTV) {
    this.rootView = rootView;
    this.mButtonTV = mButtonTV;
    this.mCompanyTV = mCompanyTV;
    this.mLoGoIV = mLoGoIV;
    this.mNameTV = mNameTV;
    this.mTypeTV = mTypeTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAllianceUnAddedListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAllianceUnAddedListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_alliance_un_added_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAllianceUnAddedListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mButtonTV;
      TextView mButtonTV = rootView.findViewById(id);
      if (mButtonTV == null) {
        break missingId;
      }

      id = R.id.mCompanyTV;
      TextView mCompanyTV = rootView.findViewById(id);
      if (mCompanyTV == null) {
        break missingId;
      }

      id = R.id.mLoGoIV;
      ImageView mLoGoIV = rootView.findViewById(id);
      if (mLoGoIV == null) {
        break missingId;
      }

      id = R.id.mNameTV;
      TextView mNameTV = rootView.findViewById(id);
      if (mNameTV == null) {
        break missingId;
      }

      id = R.id.mTypeTV;
      TextView mTypeTV = rootView.findViewById(id);
      if (mTypeTV == null) {
        break missingId;
      }

      return new ItemAllianceUnAddedListBinding((LinearLayout) rootView, mButtonTV, mCompanyTV,
          mLoGoIV, mNameTV, mTypeTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}