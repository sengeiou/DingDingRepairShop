package com.android.ctgapp.http;

import java.lang.System;

/**
 * 创建时间:2019/1/10
 * 作者:LiBW
 * 描述:下载监听接口
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/android/ctgapp/http/DownloadListener;", "", "onFailed", "", "onProgress", "progress", "", "onSuccess", "app_WLDebug"})
public abstract interface DownloadListener {
    
    public abstract void onSuccess();
    
    public abstract void onFailed();
    
    public abstract void onProgress(int progress);
}