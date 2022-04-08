// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.android.ctgapp.common.CommonRecyclerView;
import com.android.ctgapp.widget.EditTextWithDeleteBtn;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCompanyContactSelectBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final SmartRefreshLayout mRefresh;

  @NonNull
  public final EditTextWithDeleteBtn mSearchET;

  @NonNull
  public final CommonRecyclerView mTeamRV;

  private ActivityCompanyContactSelectBinding(@NonNull LinearLayout rootView,
      @NonNull SmartRefreshLayout mRefresh, @NonNull EditTextWithDeleteBtn mSearchET,
      @NonNull CommonRecyclerView mTeamRV) {
    this.rootView = rootView;
    this.mRefresh = mRefresh;
    this.mSearchET = mSearchET;
    this.mTeamRV = mTeamRV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCompanyContactSelectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCompanyContactSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_company_contact_select, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCompanyContactSelectBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mRefresh;
      SmartRefreshLayout mRefresh = rootView.findViewById(id);
      if (mRefresh == null) {
        break missingId;
      }

      id = R.id.mSearchET;
      EditTextWithDeleteBtn mSearchET = rootView.findViewById(id);
      if (mSearchET == null) {
        break missingId;
      }

      id = R.id.mTeamRV;
      CommonRecyclerView mTeamRV = rootView.findViewById(id);
      if (mTeamRV == null) {
        break missingId;
      }

      return new ActivityCompanyContactSelectBinding((LinearLayout) rootView, mRefresh, mSearchET,
          mTeamRV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}