package com.android.ctgapp.widget.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0004J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\u0004X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0012\u0010\f\u001a\u00020\u0004X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/widget/dialog/BaseTopDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "height", "", "getHeight", "()I", "isTranslucentDecor", "", "()Z", "layoutId", "getLayoutId", "topYPosition", "getTopYPosition", "initEventAndData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_hqpRelease"})
public abstract class BaseTopDialogFragment extends androidx.fragment.app.DialogFragment {
    private java.util.HashMap _$_findViewCache;
    
    public BaseTopDialogFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    protected final void initEventAndData() {
    }
    
    protected abstract int getLayoutId();
    
    protected abstract int getTopYPosition();
    
    protected abstract boolean isTranslucentDecor();
    
    protected final int getHeight() {
        return 0;
    }
}