// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemButtonSelectmBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final View mBottomLine;

  @NonNull
  public final Button mButton;

  private ItemButtonSelectmBinding(@NonNull LinearLayout rootView, @NonNull View mBottomLine,
      @NonNull Button mButton) {
    this.rootView = rootView;
    this.mBottomLine = mBottomLine;
    this.mButton = mButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemButtonSelectmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemButtonSelectmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_button_selectm, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemButtonSelectmBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBottomLine;
      View mBottomLine = rootView.findViewById(id);
      if (mBottomLine == null) {
        break missingId;
      }

      id = R.id.mButton;
      Button mButton = rootView.findViewById(id);
      if (mButton == null) {
        break missingId;
      }

      return new ItemButtonSelectmBinding((LinearLayout) rootView, mBottomLine, mButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
