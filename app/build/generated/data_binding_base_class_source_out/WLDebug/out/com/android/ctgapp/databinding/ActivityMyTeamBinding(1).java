// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import com.android.ctgapp.common.CommonRecyclerView;
import com.android.ctgapp.widget.CustomTitleBar;
import com.android.ctgapp.widget.EditTextWithDeleteBtn;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMyTeamBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final TextView mAddMembersTV;

  @NonNull
  public final TextView mApplyNotificationTV;

  @NonNull
  public final LinearLayout mButtonLL;

  @NonNull
  public final SwipeRecyclerView mDepartmentRV;

  @NonNull
  public final Button mFinishBTN;

  @NonNull
  public final RelativeLayout mFinishRL;

  @NonNull
  public final ImageView mFrameworkIV;

  @NonNull
  public final DrawerLayout mGroupSettingDL;

  @NonNull
  public final Button mInviteEmployeesBTN;

  @NonNull
  public final TextView mItemSaveTV;

  @NonNull
  public final SwipeRecyclerView mLabelRV;

  @NonNull
  public final Button mManagementTeamBTN;

  @NonNull
  public final EditTextWithDeleteBtn mSearchET;

  @NonNull
  public final LinearLayout mSearchLL;

  @NonNull
  public final CommonRecyclerView mTeamRV;

  @NonNull
  public final CustomTitleBar mTitleBar;

  private ActivityMyTeamBinding(@NonNull DrawerLayout rootView, @NonNull TextView mAddMembersTV,
      @NonNull TextView mApplyNotificationTV, @NonNull LinearLayout mButtonLL,
      @NonNull SwipeRecyclerView mDepartmentRV, @NonNull Button mFinishBTN,
      @NonNull RelativeLayout mFinishRL, @NonNull ImageView mFrameworkIV,
      @NonNull DrawerLayout mGroupSettingDL, @NonNull Button mInviteEmployeesBTN,
      @NonNull TextView mItemSaveTV, @NonNull SwipeRecyclerView mLabelRV,
      @NonNull Button mManagementTeamBTN, @NonNull EditTextWithDeleteBtn mSearchET,
      @NonNull LinearLayout mSearchLL, @NonNull CommonRecyclerView mTeamRV,
      @NonNull CustomTitleBar mTitleBar) {
    this.rootView = rootView;
    this.mAddMembersTV = mAddMembersTV;
    this.mApplyNotificationTV = mApplyNotificationTV;
    this.mButtonLL = mButtonLL;
    this.mDepartmentRV = mDepartmentRV;
    this.mFinishBTN = mFinishBTN;
    this.mFinishRL = mFinishRL;
    this.mFrameworkIV = mFrameworkIV;
    this.mGroupSettingDL = mGroupSettingDL;
    this.mInviteEmployeesBTN = mInviteEmployeesBTN;
    this.mItemSaveTV = mItemSaveTV;
    this.mLabelRV = mLabelRV;
    this.mManagementTeamBTN = mManagementTeamBTN;
    this.mSearchET = mSearchET;
    this.mSearchLL = mSearchLL;
    this.mTeamRV = mTeamRV;
    this.mTitleBar = mTitleBar;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyTeamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_my_team, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyTeamBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mAddMembersTV;
      TextView mAddMembersTV = rootView.findViewById(id);
      if (mAddMembersTV == null) {
        break missingId;
      }

      id = R.id.mApplyNotificationTV;
      TextView mApplyNotificationTV = rootView.findViewById(id);
      if (mApplyNotificationTV == null) {
        break missingId;
      }

      id = R.id.mButtonLL;
      LinearLayout mButtonLL = rootView.findViewById(id);
      if (mButtonLL == null) {
        break missingId;
      }

      id = R.id.mDepartmentRV;
      SwipeRecyclerView mDepartmentRV = rootView.findViewById(id);
      if (mDepartmentRV == null) {
        break missingId;
      }

      id = R.id.mFinishBTN;
      Button mFinishBTN = rootView.findViewById(id);
      if (mFinishBTN == null) {
        break missingId;
      }

      id = R.id.mFinishRL;
      RelativeLayout mFinishRL = rootView.findViewById(id);
      if (mFinishRL == null) {
        break missingId;
      }

      id = R.id.mFrameworkIV;
      ImageView mFrameworkIV = rootView.findViewById(id);
      if (mFrameworkIV == null) {
        break missingId;
      }

      DrawerLayout mGroupSettingDL = (DrawerLayout) rootView;

      id = R.id.mInviteEmployeesBTN;
      Button mInviteEmployeesBTN = rootView.findViewById(id);
      if (mInviteEmployeesBTN == null) {
        break missingId;
      }

      id = R.id.mItemSaveTV;
      TextView mItemSaveTV = rootView.findViewById(id);
      if (mItemSaveTV == null) {
        break missingId;
      }

      id = R.id.mLabelRV;
      SwipeRecyclerView mLabelRV = rootView.findViewById(id);
      if (mLabelRV == null) {
        break missingId;
      }

      id = R.id.mManagementTeamBTN;
      Button mManagementTeamBTN = rootView.findViewById(id);
      if (mManagementTeamBTN == null) {
        break missingId;
      }

      id = R.id.mSearchET;
      EditTextWithDeleteBtn mSearchET = rootView.findViewById(id);
      if (mSearchET == null) {
        break missingId;
      }

      id = R.id.mSearchLL;
      LinearLayout mSearchLL = rootView.findViewById(id);
      if (mSearchLL == null) {
        break missingId;
      }

      id = R.id.mTeamRV;
      CommonRecyclerView mTeamRV = rootView.findViewById(id);
      if (mTeamRV == null) {
        break missingId;
      }

      id = R.id.mTitleBar;
      CustomTitleBar mTitleBar = rootView.findViewById(id);
      if (mTitleBar == null) {
        break missingId;
      }

      return new ActivityMyTeamBinding((DrawerLayout) rootView, mAddMembersTV, mApplyNotificationTV,
          mButtonLL, mDepartmentRV, mFinishBTN, mFinishRL, mFrameworkIV, mGroupSettingDL,
          mInviteEmployeesBTN, mItemSaveTV, mLabelRV, mManagementTeamBTN, mSearchET, mSearchLL,
          mTeamRV, mTitleBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
