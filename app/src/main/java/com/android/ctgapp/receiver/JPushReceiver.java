package com.android.ctgapp.receiver;

import android.content.Context;
import android.util.Log;

import com.android.ctgapp.base.BaseApplication;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.api.JPushMessage;
import cn.jpush.android.service.JPushMessageReceiver;

public class JPushReceiver extends JPushMessageReceiver {
    @Override
    public void onTagOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onTagOperatorResult(context, jPushMessage);
        Log.d("日志绑定Tag回调", jPushMessage.toString());

    }
    int sequence=100;
    @Override
    public void onAliasOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onAliasOperatorResult(context, jPushMessage);
        if (jPushMessage.getErrorCode()==6002&&sequence<120){
            JPushInterface.setAlias(context, sequence++, jPushMessage.getAlias());
        }

        Log.d("日志绑定Alias回调", jPushMessage.toString());
    }
}
