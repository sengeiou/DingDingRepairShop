// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShouXinCompanyctivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final TextView mMoneyTV;

  @NonNull
  public final RecyclerView mRecyclerView;

  @NonNull
  public final Button mduizhanghuankuan;

  @NonNull
  public final ImageView mjiaoyiliushui;

  private ActivityShouXinCompanyctivityBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull TextView mMoneyTV, @NonNull RecyclerView mRecyclerView,
      @NonNull Button mduizhanghuankuan, @NonNull ImageView mjiaoyiliushui) {
    this.rootView = rootView;
    this.mMoneyTV = mMoneyTV;
    this.mRecyclerView = mRecyclerView;
    this.mduizhanghuankuan = mduizhanghuankuan;
    this.mjiaoyiliushui = mjiaoyiliushui;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShouXinCompanyctivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShouXinCompanyctivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_shou_xin_companyctivity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShouXinCompanyctivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mMoneyTV;
      TextView mMoneyTV = rootView.findViewById(id);
      if (mMoneyTV == null) {
        break missingId;
      }

      id = R.id.mRecyclerView;
      RecyclerView mRecyclerView = rootView.findViewById(id);
      if (mRecyclerView == null) {
        break missingId;
      }

      id = R.id.mduizhanghuankuan;
      Button mduizhanghuankuan = rootView.findViewById(id);
      if (mduizhanghuankuan == null) {
        break missingId;
      }

      id = R.id.mjiaoyiliushui;
      ImageView mjiaoyiliushui = rootView.findViewById(id);
      if (mjiaoyiliushui == null) {
        break missingId;
      }

      return new ActivityShouXinCompanyctivityBinding((LinearLayoutCompat) rootView, mMoneyTV,
          mRecyclerView, mduizhanghuankuan, mjiaoyiliushui);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}