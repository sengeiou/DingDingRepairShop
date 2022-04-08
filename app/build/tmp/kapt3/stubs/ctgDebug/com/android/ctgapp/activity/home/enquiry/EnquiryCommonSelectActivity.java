package com.android.ctgapp.activity.home.enquiry;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u0017H\u0016J\u0018\u0010/\u001a\u00020+2\u0006\u00101\u001a\u00020&2\u0006\u0010!\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b\'\u0010(\u00a8\u00062"}, d2 = {"Lcom/android/ctgapp/activity/home/enquiry/EnquiryCommonSelectActivity;", "Lcom/android/ctgapp/base/BaseActivityV2;", "Lcom/android/ctgapp/adapter/home/EnquirySelectAdapter$EnquirySelectCallback;", "()V", "arrivalTimeCode", "", "currentSelectId", "currentSelectName", "", "mAdapter", "Lcom/android/ctgapp/adapter/home/EnquirySelectAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/home/EnquirySelectAdapter;", "setMAdapter", "(Lcom/android/ctgapp/adapter/home/EnquirySelectAdapter;)V", "mBinding", "Lcom/android/ctgapp/databinding/ActivityEnquiryCommonSelectBinding;", "getMBinding", "()Lcom/android/ctgapp/databinding/ActivityEnquiryCommonSelectBinding;", "mBinding$delegate", "Lkotlin/Lazy;", "mList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/home/EnquirySelectBean;", "getMList", "()Ljava/util/ArrayList;", "needInvoiceCode", "qualityCode", "resultCode", "getResultCode", "()I", "resultCode$delegate", "selectList", "selectName", "getSelectName", "()Ljava/lang/String;", "selectName$delegate", "singleModel", "", "getSingleModel", "()Z", "singleModel$delegate", "click", "", "event", "getLayout", "Landroid/widget/LinearLayout;", "onItemSelect", "data", "select", "app_ctgDebug"})
public final class EnquiryCommonSelectActivity extends com.android.ctgapp.base.BaseActivityV2 implements com.android.ctgapp.adapter.home.EnquirySelectAdapter.EnquirySelectCallback {
    private final kotlin.Lazy mBinding$delegate = null;
    private final int qualityCode = 1001;
    private final int arrivalTimeCode = 1002;
    private final int needInvoiceCode = 1003;
    private final kotlin.Lazy singleModel$delegate = null;
    private final kotlin.Lazy selectName$delegate = null;
    private final kotlin.Lazy resultCode$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.android.ctgapp.entity.home.EnquirySelectBean> mList = null;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.adapter.home.EnquirySelectAdapter mAdapter;
    private int currentSelectId = -1;
    private java.lang.String currentSelectName = "";
    private java.util.ArrayList<java.lang.String> selectList;
    private java.util.HashMap _$_findViewCache;
    
    public EnquiryCommonSelectActivity() {
        super();
    }
    
    private final com.android.ctgapp.databinding.ActivityEnquiryCommonSelectBinding getMBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout getLayout() {
        return null;
    }
    
    private final boolean getSingleModel() {
        return false;
    }
    
    private final java.lang.String getSelectName() {
        return null;
    }
    
    private final int getResultCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.home.EnquirySelectBean> getMList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.adapter.home.EnquirySelectAdapter getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.adapter.home.EnquirySelectAdapter p0) {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onItemSelect(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.home.EnquirySelectBean data) {
    }
    
    @java.lang.Override()
    public void onItemSelect(boolean select, @org.jetbrains.annotations.NotNull()
    java.lang.String selectName) {
    }
}