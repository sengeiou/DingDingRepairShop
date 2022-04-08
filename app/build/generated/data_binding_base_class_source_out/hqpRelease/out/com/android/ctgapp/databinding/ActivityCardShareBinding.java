// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.android.ctgapp.R;
import com.android.ctgapp.widget.CustomTitleBar;
import com.android.ctgapp.widget.EditTextWithDeleteBtn;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCardShareBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button mConfirmBTN;

  @NonNull
  public final TabLayout mContactTL;

  @NonNull
  public final ViewPager mContactViewPager;

  @NonNull
  public final Button mMoreConfirmBTN;

  @NonNull
  public final RelativeLayout mMoreRL;

  @NonNull
  public final EditTextWithDeleteBtn mSearchET;

  @NonNull
  public final TextView mSelectCountTV;

  @NonNull
  public final LinearLayout mSingleLL;

  @NonNull
  public final CustomTitleBar mTitleBar;

  @NonNull
  public final TextView selectedTV;

  private ActivityCardShareBinding(@NonNull LinearLayout rootView, @NonNull Button mConfirmBTN,
      @NonNull TabLayout mContactTL, @NonNull ViewPager mContactViewPager,
      @NonNull Button mMoreConfirmBTN, @NonNull RelativeLayout mMoreRL,
      @NonNull EditTextWithDeleteBtn mSearchET, @NonNull TextView mSelectCountTV,
      @NonNull LinearLayout mSingleLL, @NonNull CustomTitleBar mTitleBar,
      @NonNull TextView selectedTV) {
    this.rootView = rootView;
    this.mConfirmBTN = mConfirmBTN;
    this.mContactTL = mContactTL;
    this.mContactViewPager = mContactViewPager;
    this.mMoreConfirmBTN = mMoreConfirmBTN;
    this.mMoreRL = mMoreRL;
    this.mSearchET = mSearchET;
    this.mSelectCountTV = mSelectCountTV;
    this.mSingleLL = mSingleLL;
    this.mTitleBar = mTitleBar;
    this.selectedTV = selectedTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCardShareBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCardShareBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_card_share, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCardShareBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mConfirmBTN;
      Button mConfirmBTN = rootView.findViewById(id);
      if (mConfirmBTN == null) {
        break missingId;
      }

      id = R.id.mContactTL;
      TabLayout mContactTL = rootView.findViewById(id);
      if (mContactTL == null) {
        break missingId;
      }

      id = R.id.mContactViewPager;
      ViewPager mContactViewPager = rootView.findViewById(id);
      if (mContactViewPager == null) {
        break missingId;
      }

      id = R.id.mMoreConfirmBTN;
      Button mMoreConfirmBTN = rootView.findViewById(id);
      if (mMoreConfirmBTN == null) {
        break missingId;
      }

      id = R.id.mMoreRL;
      RelativeLayout mMoreRL = rootView.findViewById(id);
      if (mMoreRL == null) {
        break missingId;
      }

      id = R.id.mSearchET;
      EditTextWithDeleteBtn mSearchET = rootView.findViewById(id);
      if (mSearchET == null) {
        break missingId;
      }

      id = R.id.mSelectCountTV;
      TextView mSelectCountTV = rootView.findViewById(id);
      if (mSelectCountTV == null) {
        break missingId;
      }

      id = R.id.mSingleLL;
      LinearLayout mSingleLL = rootView.findViewById(id);
      if (mSingleLL == null) {
        break missingId;
      }

      id = R.id.mTitleBar;
      CustomTitleBar mTitleBar = rootView.findViewById(id);
      if (mTitleBar == null) {
        break missingId;
      }

      id = R.id.selectedTV;
      TextView selectedTV = rootView.findViewById(id);
      if (selectedTV == null) {
        break missingId;
      }

      return new ActivityCardShareBinding((LinearLayout) rootView, mConfirmBTN, mContactTL,
          mContactViewPager, mMoreConfirmBTN, mMoreRL, mSearchET, mSelectCountTV, mSingleLL,
          mTitleBar, selectedTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}