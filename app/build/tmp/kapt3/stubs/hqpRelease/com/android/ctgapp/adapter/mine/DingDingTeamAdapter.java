package com.android.ctgapp.adapter.mine;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 3/3/21
 * 描述:钉钉联系人 同事 二级列表适配器
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001#B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0016J4\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\rH\u0016J,\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010 \u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\nH\u0016J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/android/ctgapp/adapter/mine/DingDingTeamAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "context", "Landroid/content/Context;", "entity", "", "Lcom/android/ctgapp/entity/chart/AllTeamEntity$DataBean;", "listener", "Lcom/android/ctgapp/adapter/mine/DingDingTeamAdapter$Callback;", "isLinkman", "", "(Landroid/content/Context;Ljava/util/List;Lcom/android/ctgapp/adapter/mine/DingDingTeamAdapter$Callback;Z)V", "preChild", "", "preParent", "getChild", "", "groupPosition", "childPosition", "getChildId", "", "getChildView", "Landroid/view/View;", "isLastChild", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "hasStableIds", "isChildSelectable", "Callback", "app_hqpRelease"})
public final class DingDingTeamAdapter extends android.widget.BaseExpandableListAdapter {
    private final android.content.Context context = null;
    private final java.util.List<com.android.ctgapp.entity.chart.AllTeamEntity.DataBean> entity = null;
    private final com.android.ctgapp.adapter.mine.DingDingTeamAdapter.Callback listener = null;
    private final boolean isLinkman = false;
    private int preParent = -1;
    private int preChild = -1;
    
    public DingDingTeamAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.chart.AllTeamEntity.DataBean> entity, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.mine.DingDingTeamAdapter.Callback listener, boolean isLinkman) {
        super();
    }
    
    @java.lang.Override()
    public int getGroupCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getChildrenCount(int groupPosition) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object getGroup(int groupPosition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object getChild(int groupPosition, int childPosition) {
        return null;
    }
    
    @java.lang.Override()
    public long getGroupId(int groupPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public long getChildId(int groupPosition, int childPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getGroupView(int groupPosition, boolean isExpanded, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J(\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lcom/android/ctgapp/adapter/mine/DingDingTeamAdapter$Callback;", "", "onItemClick", "", "data", "Lcom/android/ctgapp/entity/chart/AllTeamEntity$DataBean$UsersBean;", "parentPosition", "", "childPosition", "onItemClickForMore", "select", "", "app_hqpRelease"})
    public static abstract interface Callback {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.entity.chart.AllTeamEntity.DataBean.UsersBean data, int parentPosition, int childPosition);
        
        public abstract void onItemClickForMore(@org.jetbrains.annotations.NotNull()
        com.android.ctgapp.entity.chart.AllTeamEntity.DataBean.UsersBean data, boolean select, int parentPosition, int childPosition);
    }
}