package com.android.ctgapp.activity.mine.friend;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2020/10/14
 * 描述:手机联系人 页面
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0005j\b\u0012\u0004\u0012\u00020\u0016`\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/activity/mine/friend/PhoneContactActivity;", "Lcom/android/ctgapp/base/BaseActivity;", "Lcom/android/ctgapp/callback/PhoneNumSelectCallback;", "()V", "copyList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/ContactModel;", "mAdapter", "Lcom/android/ctgapp/adapter/mine/ContactsAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/ContactsAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mContactList", "phoneNumbers", "", "click", "", "contactBack", "contact", "event", "getContacts", "Lcom/android/ctgapp/entity/MyContacts;", "Lkotlin/collections/ArrayList;", "getLayout", "", "showList", "app_hqpRelease"})
public final class PhoneContactActivity extends com.android.ctgapp.base.BaseActivity implements com.android.ctgapp.callback.PhoneNumSelectCallback {
    private final java.util.ArrayList<com.android.ctgapp.entity.ContactModel> mContactList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.ContactModel> copyList = null;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.ArrayList<java.lang.String> phoneNumbers;
    private java.util.HashMap _$_findViewCache;
    
    public PhoneContactActivity() {
        super();
    }
    
    private final com.android.ctgapp.adapter.mine.ContactsAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    private final java.util.ArrayList<com.android.ctgapp.entity.MyContacts> getContacts() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void showList(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.ContactModel contact) {
    }
    
    @java.lang.Override()
    public void contactBack(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.ContactModel contact) {
    }
}