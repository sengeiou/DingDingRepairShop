package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/entity/MyContacts;", "", "()V", "existing", "", "getExisting", "()Z", "setExisting", "(Z)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "phone", "getPhone", "setPhone", "phoneList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/MyContacts$PhoneBean;", "Lkotlin/collections/ArrayList;", "getPhoneList", "()Ljava/util/ArrayList;", "setPhoneList", "(Ljava/util/ArrayList;)V", "PhoneBean", "app_hqpDebug"})
public final class MyContacts {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phone = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.android.ctgapp.entity.MyContacts.PhoneBean> phoneList;
    private boolean existing = false;
    
    public MyContacts() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.MyContacts.PhoneBean> getPhoneList() {
        return null;
    }
    
    public final void setPhoneList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.ctgapp.entity.MyContacts.PhoneBean> p0) {
    }
    
    public final boolean getExisting() {
        return false;
    }
    
    public final void setExisting(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/android/ctgapp/entity/MyContacts$PhoneBean;", "", "()V", "existing", "", "getExisting", "()Z", "setExisting", "(Z)V", "phoneNum", "", "getPhoneNum", "()Ljava/lang/String;", "setPhoneNum", "(Ljava/lang/String;)V", "app_hqpDebug"})
    public static final class PhoneBean {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String phoneNum = "";
        private boolean existing = false;
        
        public PhoneBean() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhoneNum() {
            return null;
        }
        
        public final void setPhoneNum(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final boolean getExisting() {
            return false;
        }
        
        public final void setExisting(boolean p0) {
        }
    }
}