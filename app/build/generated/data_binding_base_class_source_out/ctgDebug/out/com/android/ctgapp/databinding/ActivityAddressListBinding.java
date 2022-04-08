// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddressListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button mAddAddressBTN;

  @NonNull
  public final RecyclerView mAddressRV;

  private ActivityAddressListBinding(@NonNull LinearLayout rootView, @NonNull Button mAddAddressBTN,
      @NonNull RecyclerView mAddressRV) {
    this.rootView = rootView;
    this.mAddAddressBTN = mAddAddressBTN;
    this.mAddressRV = mAddressRV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddressListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddressListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_address_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddressListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAddAddressBTN;
      Button mAddAddressBTN = rootView.findViewById(id);
      if (mAddAddressBTN == null) {
        break missingId;
      }

      id = R.id.mAddressRV;
      RecyclerView mAddressRV = rootView.findViewById(id);
      if (mAddressRV == null) {
        break missingId;
      }

      return new ActivityAddressListBinding((LinearLayout) rootView, mAddAddressBTN, mAddressRV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}