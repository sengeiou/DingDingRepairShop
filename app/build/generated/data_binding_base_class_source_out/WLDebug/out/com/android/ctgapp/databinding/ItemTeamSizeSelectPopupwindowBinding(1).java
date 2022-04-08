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

public final class ItemTeamSizeSelectPopupwindowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mTeam1;

  @NonNull
  public final TextView mTeam2;

  @NonNull
  public final TextView mTeam3;

  @NonNull
  public final TextView mTeam4;

  private ItemTeamSizeSelectPopupwindowBinding(@NonNull LinearLayout rootView,
      @NonNull TextView mTeam1, @NonNull TextView mTeam2, @NonNull TextView mTeam3,
      @NonNull TextView mTeam4) {
    this.rootView = rootView;
    this.mTeam1 = mTeam1;
    this.mTeam2 = mTeam2;
    this.mTeam3 = mTeam3;
    this.mTeam4 = mTeam4;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTeamSizeSelectPopupwindowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTeamSizeSelectPopupwindowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_team_size_select_popupwindow, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTeamSizeSelectPopupwindowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mTeam1;
      TextView mTeam1 = rootView.findViewById(id);
      if (mTeam1 == null) {
        break missingId;
      }

      id = R.id.mTeam2;
      TextView mTeam2 = rootView.findViewById(id);
      if (mTeam2 == null) {
        break missingId;
      }

      id = R.id.mTeam3;
      TextView mTeam3 = rootView.findViewById(id);
      if (mTeam3 == null) {
        break missingId;
      }

      id = R.id.mTeam4;
      TextView mTeam4 = rootView.findViewById(id);
      if (mTeam4 == null) {
        break missingId;
      }

      return new ItemTeamSizeSelectPopupwindowBinding((LinearLayout) rootView, mTeam1, mTeam2,
          mTeam3, mTeam4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}