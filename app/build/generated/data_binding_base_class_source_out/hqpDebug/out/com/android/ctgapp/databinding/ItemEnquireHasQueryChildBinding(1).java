// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemEnquireHasQueryChildBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mCodeTV;

  @NonNull
  public final TextView mMoneyTV;

  @NonNull
  public final TextView mNameTV;

  @NonNull
  public final TextView mReceiveTimeTV;

  @NonNull
  public final TextView mStatueTV;

  private ItemEnquireHasQueryChildBinding(@NonNull LinearLayout rootView, @NonNull TextView mCodeTV,
      @NonNull TextView mMoneyTV, @NonNull TextView mNameTV, @NonNull TextView mReceiveTimeTV,
      @NonNull TextView mStatueTV) {
    this.rootView = rootView;
    this.mCodeTV = mCodeTV;
    this.mMoneyTV = mMoneyTV;
    this.mNameTV = mNameTV;
    this.mReceiveTimeTV = mReceiveTimeTV;
    this.mStatueTV = mStatueTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemEnquireHasQueryChildBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemEnquireHasQueryChildBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_enquire_has_query_child, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemEnquireHasQueryChildBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mCodeTV;
      TextView mCodeTV = rootView.findViewById(id);
      if (mCodeTV == null) {
        break missingId;
      }

      id = R.id.mMoneyTV;
      TextView mMoneyTV = rootView.findViewById(id);
      if (mMoneyTV == null) {
        break missingId;
      }

      id = R.id.mNameTV;
      TextView mNameTV = rootView.findViewById(id);
      if (mNameTV == null) {
        break missingId;
      }

      id = R.id.mReceiveTimeTV;
      TextView mReceiveTimeTV = rootView.findViewById(id);
      if (mReceiveTimeTV == null) {
        break missingId;
      }

      id = R.id.mStatueTV;
      TextView mStatueTV = rootView.findViewById(id);
      if (mStatueTV == null) {
        break missingId;
      }

      return new ItemEnquireHasQueryChildBinding((LinearLayout) rootView, mCodeTV, mMoneyTV,
          mNameTV, mReceiveTimeTV, mStatueTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
