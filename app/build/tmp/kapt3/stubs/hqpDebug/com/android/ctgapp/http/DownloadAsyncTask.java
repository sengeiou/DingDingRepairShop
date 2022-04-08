package com.android.ctgapp.http;

import java.lang.System;

/**
 * 创建时间:2019/1/10
 * 作者:LiBW
 * 描述:下载app更新包专用
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ!\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0013\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0017\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010\u001cJ%\u0010\u001d\u001a\u00020\u00192\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0013\"\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/android/ctgapp/http/DownloadAsyncTask;", "Landroid/os/AsyncTask;", "", "", "downloadListener", "Lcom/android/ctgapp/http/DownloadListener;", "downloadUrl", "context", "Landroid/content/Context;", "(Lcom/android/ctgapp/http/DownloadListener;Ljava/lang/String;Landroid/content/Context;)V", "directory", "file", "Ljava/io/File;", "filename", "lastProgress", "typeFailed", "typeSuccess", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Integer;", "fileLength", "", "url", "installApk", "", "onPostExecute", "result", "(Ljava/lang/Integer;)V", "onProgressUpdate", "values", "([Ljava/lang/Integer;)V", "app_hqpDebug"})
public final class DownloadAsyncTask extends android.os.AsyncTask<java.lang.String, java.lang.Integer, java.lang.Integer> {
    private final com.android.ctgapp.http.DownloadListener downloadListener = null;
    private final java.lang.String downloadUrl = null;
    private final android.content.Context context = null;
    private final int typeSuccess = 0;
    private final int typeFailed = 1;
    private int lastProgress = 0;
    private final java.lang.String filename = null;
    private final java.lang.String directory = null;
    private final java.io.File file = null;
    
    public DownloadAsyncTask(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.http.DownloadListener downloadListener, @org.jetbrains.annotations.NotNull()
    java.lang.String downloadUrl, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Integer doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.String... params) {
        return null;
    }
    
    @java.lang.Override()
    protected void onProgressUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.Integer... values) {
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    java.lang.Integer result) {
    }
    
    private final void installApk() {
    }
    
    private final long fileLength(java.lang.String url) {
        return 0L;
    }
}