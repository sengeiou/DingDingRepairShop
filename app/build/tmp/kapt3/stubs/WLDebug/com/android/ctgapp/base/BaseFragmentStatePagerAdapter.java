package com.android.ctgapp.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/android/ctgapp/base/BaseFragmentStatePagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "pageTitle", "", "", "mList", "", "Landroidx/fragment/app/Fragment;", "fm", "Landroidx/fragment/app/FragmentManager;", "behavior", "", "([Ljava/lang/String;Ljava/util/List;Landroidx/fragment/app/FragmentManager;I)V", "[Ljava/lang/String;", "getCount", "getItem", "position", "getPageTitle", "", "app_WLDebug"})
public final class BaseFragmentStatePagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
    private final java.lang.String[] pageTitle = null;
    private final java.util.List<androidx.fragment.app.Fragment> mList = null;
    
    public BaseFragmentStatePagerAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.String[] pageTitle, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends androidx.fragment.app.Fragment> mList, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, int behavior) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
}