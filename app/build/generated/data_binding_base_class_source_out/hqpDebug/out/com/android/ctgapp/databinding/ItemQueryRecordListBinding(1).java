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

public final class ItemQueryRecordListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mCarNameTV;

  @NonNull
  public final TextView mCompanyNumberTV;

  @NonNull
  public final TextView mOrderTV;

  @NonNull
  public final LinearLayout mParentLL;

  @NonNull
  public final TextView mPersonTV;

  @NonNull
  public final TextView mStatusTV;

  @NonNull
  public final TextView mTimeTV;

  private ItemQueryRecordListBinding(@NonNull LinearLayout rootView, @NonNull TextView mCarNameTV,
      @NonNull TextView mCompanyNumberTV, @NonNull TextView mOrderTV,
      @NonNull LinearLayout mParentLL, @NonNull TextView mPersonTV, @NonNull TextView mStatusTV,
      @NonNull TextView mTimeTV) {
    this.rootView = rootView;
    this.mCarNameTV = mCarNameTV;
    this.mCompanyNumberTV = mCompanyNumberTV;
    this.mOrderTV = mOrderTV;
    this.mParentLL = mParentLL;
    this.mPersonTV = mPersonTV;
    this.mStatusTV = mStatusTV;
    this.mTimeTV = mTimeTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemQueryRecordListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemQueryRecordListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_query_record_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemQueryRecordListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mCarNameTV;
      TextView mCarNameTV = rootView.findViewById(id);
      if (mCarNameTV == null) {
        break missingId;
      }

      id = R.id.mCompanyNumberTV;
      TextView mCompanyNumberTV = rootView.findViewById(id);
      if (mCompanyNumberTV == null) {
        break missingId;
      }

      id = R.id.mOrderTV;
      TextView mOrderTV = rootView.findViewById(id);
      if (mOrderTV == null) {
        break missingId;
      }

      LinearLayout mParentLL = (LinearLayout) rootView;

      id = R.id.mPersonTV;
      TextView mPersonTV = rootView.findViewById(id);
      if (mPersonTV == null) {
        break missingId;
      }

      id = R.id.mStatusTV;
      TextView mStatusTV = rootView.findViewById(id);
      if (mStatusTV == null) {
        break missingId;
      }

      id = R.id.mTimeTV;
      TextView mTimeTV = rootView.findViewById(id);
      if (mTimeTV == null) {
        break missingId;
      }

      return new ItemQueryRecordListBinding((LinearLayout) rootView, mCarNameTV, mCompanyNumberTV,
          mOrderTV, mParentLL, mPersonTV, mStatusTV, mTimeTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}