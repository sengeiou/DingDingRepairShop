package com.android.ctgapp.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0004H&\u00a8\u0006\u0007"}, d2 = {"Lcom/android/ctgapp/http/HttpResult;", "", "error", "", "", "success", "str", "app_hqpDebug"})
public abstract interface HttpResult {
    
    public abstract void success(@org.jetbrains.annotations.NotNull()
    java.lang.String str);
    
    public abstract void error(@org.jetbrains.annotations.NotNull()
    java.lang.String error);
}