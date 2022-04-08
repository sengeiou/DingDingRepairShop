package com.android.ctgapp.widget.dialog.company;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/11/23
 * 描述:订单页面可以进行聊天的人
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/android/ctgapp/widget/dialog/company/OrderDetailCanChartDialog;", "Lcom/android/ctgapp/base/BaseDialogFragment;", "Lcom/android/ctgapp/adapter/mine/OrderCanChartAdapter$OrderCanChartAdapterListener;", "list", "", "Lcom/android/ctgapp/entity/deal/ChatersBean;", "companyName", "", "(Ljava/util/List;Ljava/lang/String;)V", "getLayout", "", "goTalk", "", "position", "onStart", "viewIsCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_hqpDebug"})
public final class OrderDetailCanChartDialog extends com.android.ctgapp.base.BaseDialogFragment implements com.android.ctgapp.adapter.mine.OrderCanChartAdapter.OrderCanChartAdapterListener {
    private final java.util.List<com.android.ctgapp.entity.deal.ChatersBean> list = null;
    private final java.lang.String companyName = null;
    private java.util.HashMap _$_findViewCache;
    
    public OrderDetailCanChartDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.deal.ChatersBean> list, @org.jetbrains.annotations.NotNull()
    java.lang.String companyName) {
        super();
    }
    
    @java.lang.Override()
    public void viewIsCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void goTalk(int position) {
    }
}