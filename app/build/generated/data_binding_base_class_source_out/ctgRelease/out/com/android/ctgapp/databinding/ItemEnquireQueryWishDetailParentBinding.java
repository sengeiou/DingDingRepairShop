// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemEnquireQueryWishDetailParentBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final TextView mAllMoneyTV;

  @NonNull
  public final TextView mBrandNameTV;

  @NonNull
  public final TextView mCountTV;

  @NonNull
  public final TextView mPartNameTV;

  private ItemEnquireQueryWishDetailParentBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull TextView mAllMoneyTV, @NonNull TextView mBrandNameTV, @NonNull TextView mCountTV,
      @NonNull TextView mPartNameTV) {
    this.rootView = rootView;
    this.mAllMoneyTV = mAllMoneyTV;
    this.mBrandNameTV = mBrandNameTV;
    this.mCountTV = mCountTV;
    this.mPartNameTV = mPartNameTV;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemEnquireQueryWishDetailParentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemEnquireQueryWishDetailParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_enquire_query_wish_detail_parent, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemEnquireQueryWishDetailParentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAllMoneyTV;
      TextView mAllMoneyTV = rootView.findViewById(id);
      if (mAllMoneyTV == null) {
        break missingId;
      }

      id = R.id.mBrandNameTV;
      TextView mBrandNameTV = rootView.findViewById(id);
      if (mBrandNameTV == null) {
        break missingId;
      }

      id = R.id.mCountTV;
      TextView mCountTV = rootView.findViewById(id);
      if (mCountTV == null) {
        break missingId;
      }

      id = R.id.mPartNameTV;
      TextView mPartNameTV = rootView.findViewById(id);
      if (mPartNameTV == null) {
        break missingId;
      }

      return new ItemEnquireQueryWishDetailParentBinding((LinearLayoutCompat) rootView, mAllMoneyTV,
          mBrandNameTV, mCountTV, mPartNameTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
