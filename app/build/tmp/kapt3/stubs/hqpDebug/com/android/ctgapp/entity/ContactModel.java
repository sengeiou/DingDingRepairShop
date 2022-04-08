package com.android.ctgapp.entity;

import java.lang.System;

/**
 * 联系人model实体类
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u00c6\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006!"}, d2 = {"Lcom/android/ctgapp/entity/ContactModel;", "", "name", "", "phone", "existing", "", "phoneList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/MyContacts$PhoneBean;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;)V", "getExisting", "()Z", "index", "getIndex", "()Ljava/lang/String;", "getName", "getPhone", "getPhoneList", "()Ljava/util/ArrayList;", "setPhoneList", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_hqpDebug"})
public final class ContactModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String phone = null;
    private final boolean existing = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.android.ctgapp.entity.MyContacts.PhoneBean> phoneList;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String index = null;
    
    /**
     * 联系人model实体类
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.entity.ContactModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, boolean existing, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.MyContacts.PhoneBean> phoneList) {
        return null;
    }
    
    /**
     * 联系人model实体类
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * 联系人model实体类
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * 联系人model实体类
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ContactModel(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, boolean existing, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.MyContacts.PhoneBean> phoneList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getExisting() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.MyContacts.PhoneBean> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.MyContacts.PhoneBean> getPhoneList() {
        return null;
    }
    
    public final void setPhoneList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.MyContacts.PhoneBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIndex() {
        return null;
    }
}