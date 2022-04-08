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
import com.android.ctgapp.widget.EditTextWithDeleteBtn;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMessageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mAddTV;

  @NonNull
  public final ImageView mCard;

  @NonNull
  public final SwipeRecyclerView mChartListRV;

  @NonNull
  public final TextView mLinkmanTV;

  @NonNull
  public final TextView mMegCountTV;

  @NonNull
  public final TextView mNoticeContentTV;

  @NonNull
  public final LinearLayout mNoticeLL;

  @NonNull
  public final EditTextWithDeleteBtn mSearchET;

  private FragmentMessageBinding(@NonNull LinearLayout rootView, @NonNull TextView mAddTV,
      @NonNull ImageView mCard, @NonNull SwipeRecyclerView mChartListRV,
      @NonNull TextView mLinkmanTV, @NonNull TextView mMegCountTV,
      @NonNull TextView mNoticeContentTV, @NonNull LinearLayout mNoticeLL,
      @NonNull EditTextWithDeleteBtn mSearchET) {
    this.rootView = rootView;
    this.mAddTV = mAddTV;
    this.mCard = mCard;
    this.mChartListRV = mChartListRV;
    this.mLinkmanTV = mLinkmanTV;
    this.mMegCountTV = mMegCountTV;
    this.mNoticeContentTV = mNoticeContentTV;
    this.mNoticeLL = mNoticeLL;
    this.mSearchET = mSearchET;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_message, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMessageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAddTV;
      TextView mAddTV = rootView.findViewById(id);
      if (mAddTV == null) {
        break missingId;
      }

      id = R.id.mCard;
      ImageView mCard = rootView.findViewById(id);
      if (mCard == null) {
        break missingId;
      }

      id = R.id.mChartListRV;
      SwipeRecyclerView mChartListRV = rootView.findViewById(id);
      if (mChartListRV == null) {
        break missingId;
      }

      id = R.id.mLinkmanTV;
      TextView mLinkmanTV = rootView.findViewById(id);
      if (mLinkmanTV == null) {
        break missingId;
      }

      id = R.id.mMegCountTV;
      TextView mMegCountTV = rootView.findViewById(id);
      if (mMegCountTV == null) {
        break missingId;
      }

      id = R.id.mNoticeContentTV;
      TextView mNoticeContentTV = rootView.findViewById(id);
      if (mNoticeContentTV == null) {
        break missingId;
      }

      id = R.id.mNoticeLL;
      LinearLayout mNoticeLL = rootView.findViewById(id);
      if (mNoticeLL == null) {
        break missingId;
      }

      id = R.id.mSearchET;
      EditTextWithDeleteBtn mSearchET = rootView.findViewById(id);
      if (mSearchET == null) {
        break missingId;
      }

      return new FragmentMessageBinding((LinearLayout) rootView, mAddTV, mCard, mChartListRV,
          mLinkmanTV, mMegCountTV, mNoticeContentTV, mNoticeLL, mSearchET);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}