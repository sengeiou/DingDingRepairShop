// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ItemCompanyIntroBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mCompanyIntroET;

  @NonNull
  public final ImageView mDeleteIV;

  @NonNull
  public final ImageView mEditIV;

  @NonNull
  public final Button mSaveBTN;

  private ItemCompanyIntroBinding(@NonNull LinearLayout rootView, @NonNull TextView mCompanyIntroET,
      @NonNull ImageView mDeleteIV, @NonNull ImageView mEditIV, @NonNull Button mSaveBTN) {
    this.rootView = rootView;
    this.mCompanyIntroET = mCompanyIntroET;
    this.mDeleteIV = mDeleteIV;
    this.mEditIV = mEditIV;
    this.mSaveBTN = mSaveBTN;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCompanyIntroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCompanyIntroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_company_intro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCompanyIntroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mCompanyIntroET;
      TextView mCompanyIntroET = rootView.findViewById(id);
      if (mCompanyIntroET == null) {
        break missingId;
      }

      id = R.id.mDeleteIV;
      ImageView mDeleteIV = rootView.findViewById(id);
      if (mDeleteIV == null) {
        break missingId;
      }

      id = R.id.mEditIV;
      ImageView mEditIV = rootView.findViewById(id);
      if (mEditIV == null) {
        break missingId;
      }

      id = R.id.mSaveBTN;
      Button mSaveBTN = rootView.findViewById(id);
      if (mSaveBTN == null) {
        break missingId;
      }

      return new ItemCompanyIntroBinding((LinearLayout) rootView, mCompanyIntroET, mDeleteIV,
          mEditIV, mSaveBTN);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
