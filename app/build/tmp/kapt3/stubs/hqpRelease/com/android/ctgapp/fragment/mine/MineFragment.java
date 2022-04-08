package com.android.ctgapp.fragment.mine;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/9/29
 * 描述: 我的 Fragment
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/android/ctgapp/fragment/mine/MineFragment;", "Lcom/android/ctgapp/base/BaseFragment;", "()V", "mViewModel", "Lcom/android/ctgapp/fragment/mine/MineFragmentViewModel;", "getMViewModel", "()Lcom/android/ctgapp/fragment/mine/MineFragmentViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userImage", "getUserImage", "setUserImage", "userName", "getUserName", "setUserName", "userPhone", "getUserPhone", "setUserPhone", "click", "", "event", "eventBus", "type", "Lcom/android/ctgapp/event/MineFragmentRefresh;", "getLayout", "", "app_hqpRelease"})
public final class MineFragment extends com.android.ctgapp.base.BaseFragment {
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userImage = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userPhone = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userId = "";
    private java.util.HashMap _$_findViewCache;
    
    public MineFragment() {
        super(false);
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    private final com.android.ctgapp.fragment.mine.MineFragmentViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserImage() {
        return null;
    }
    
    public final void setUserImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPhone() {
        return null;
    }
    
    public final void setUserPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void eventBus(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.MineFragmentRefresh type) {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
}