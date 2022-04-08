package com.android.ctgapp.activity.message.chart.card;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000208H\u0016J\u0010\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;H\u0007J\u0018\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0016J\u0010\u0010?\u001a\u0002082\u0006\u0010@\u001a\u000206H\u0016J\u0018\u0010A\u001a\u0002082\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0016J\b\u0010B\u001a\u000206H\u0016J\b\u0010C\u001a\u000208H\u0002J\u0018\u0010D\u001a\u0002082\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u000206H\u0016J\u0018\u0010G\u001a\u0002082\u0006\u0010E\u001a\u00020,2\u0006\u0010H\u001a\u00020\u0005H\u0016J\b\u0010I\u001a\u000208H\u0016J\u0006\u0010J\u001a\u000208J\u000e\u0010K\u001a\u0002082\u0006\u0010L\u001a\u00020\tR\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010\'R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b2\u00103R\u000e\u00105\u001a\u000206X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"}, d2 = {"Lcom/android/ctgapp/activity/message/chart/card/ChartFriendFragment;", "Lcom/android/ctgapp/base/BaseFragment;", "Lcom/android/ctgapp/adapter/mine/BusinessFriendHorizontalGroupAdapter$SelectCallback;", "Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter$Callback;", "isLineman", "", "(Z)V", "allIsFine", "currentSelect", "", "mActivity", "Lcom/android/ctgapp/activity/message/chart/card/DingDingContactShareActivity;", "getMActivity", "()Lcom/android/ctgapp/activity/message/chart/card/DingDingContactShareActivity;", "mActivity$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter;", "getMAdapter", "()Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter;", "setMAdapter", "(Lcom/android/ctgapp/adapter/mine/BusinessFriendSelectAdapter;)V", "mCustomGroupAdapter", "Lcom/android/ctgapp/adapter/mine/CustomGroupSelectAdapterEmpty;", "getMCustomGroupAdapter", "()Lcom/android/ctgapp/adapter/mine/CustomGroupSelectAdapterEmpty;", "mCustomGroupAdapter$delegate", "mCustomGroupList", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/BusinessFriendGroupEntity$DataBean;", "mFixGroupAdapter", "getMFixGroupAdapter", "mFixGroupAdapter$delegate", "mFixGroupList", "mHorizontalAdapter", "Lcom/android/ctgapp/adapter/mine/BusinessFriendHorizontalGroupAdapter;", "mHorizontalLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getMHorizontalLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "mHorizontalLayoutManager$delegate", "mHorizontalList", "Lcom/android/ctgapp/entity/BusinessFriendHorizontalItemEntity;", "mList", "Lcom/android/ctgapp/entity/BusinessFriendEntity$DataBean;", "getMList", "()Ljava/util/ArrayList;", "mSearchList", "mViewModel", "Lcom/android/ctgapp/activity/mine/friend/BusinessFriendViewModel;", "getMViewModel", "()Lcom/android/ctgapp/activity/mine/friend/BusinessFriendViewModel;", "mViewModel$delegate", "preSearch", "", "click", "", "event", "o", "Lcom/android/ctgapp/event/OnLineRefresh;", "findAll", "industry", "industryName", "findByCustomId", "id", "findByFixIndustry", "getLayout", "handlerHorizontalGroup", "onItemClick", "data", "position", "onItemClickForMore", "select", "onResume", "refresh", "search", "str", "app_WLDebug"})
public final class ChartFriendFragment extends com.android.ctgapp.base.BaseFragment implements com.android.ctgapp.adapter.mine.BusinessFriendHorizontalGroupAdapter.SelectCallback, com.android.ctgapp.adapter.mine.BusinessFriendSelectAdapter.Callback {
    private boolean isLineman;
    private final kotlin.Lazy mActivity$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.adapter.mine.BusinessFriendSelectAdapter mAdapter;
    private final java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendHorizontalItemEntity> mHorizontalList = null;
    private com.android.ctgapp.adapter.mine.BusinessFriendHorizontalGroupAdapter mHorizontalAdapter;
    private final kotlin.Lazy mViewModel$delegate = null;
    private java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendGroupEntity.DataBean> mFixGroupList;
    private final kotlin.Lazy mFixGroupAdapter$delegate = null;
    private final kotlin.Lazy mHorizontalLayoutManager$delegate = null;
    private java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendGroupEntity.DataBean> mCustomGroupList;
    private final kotlin.Lazy mCustomGroupAdapter$delegate = null;
    private java.lang.String currentSelect = "ALL";
    private boolean allIsFine = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> mList = null;
    private final java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> mSearchList = null;
    private int preSearch = 0;
    private java.util.HashMap _$_findViewCache;
    
    public ChartFriendFragment(boolean isLineman) {
        super(false);
    }
    
    private final com.android.ctgapp.activity.message.chart.card.DingDingContactShareActivity getMActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.adapter.mine.BusinessFriendSelectAdapter getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.adapter.mine.BusinessFriendSelectAdapter p0) {
    }
    
    private final com.android.ctgapp.activity.mine.friend.BusinessFriendViewModel getMViewModel() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.CustomGroupSelectAdapterEmpty getMFixGroupAdapter() {
        return null;
    }
    
    private final androidx.recyclerview.widget.LinearLayoutManager getMHorizontalLayoutManager() {
        return null;
    }
    
    private final com.android.ctgapp.adapter.mine.CustomGroupSelectAdapterEmpty getMCustomGroupAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.ctgapp.entity.BusinessFriendEntity.DataBean> getMList() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void event(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.event.OnLineRefresh o) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void refresh() {
    }
    
    @java.lang.Override()
    public void event() {
    }
    
    private final void handlerHorizontalGroup() {
    }
    
    @java.lang.Override()
    public void click() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.BusinessFriendEntity.DataBean data, int position) {
    }
    
    @java.lang.Override()
    public void onItemClickForMore(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.BusinessFriendEntity.DataBean data, boolean select) {
    }
    
    @java.lang.Override()
    public void findByFixIndustry(@org.jetbrains.annotations.NotNull()
    java.lang.String industry, @org.jetbrains.annotations.NotNull()
    java.lang.String industryName) {
    }
    
    @java.lang.Override()
    public void findByCustomId(int id) {
    }
    
    @java.lang.Override()
    public void findAll(@org.jetbrains.annotations.NotNull()
    java.lang.String industry, @org.jetbrains.annotations.NotNull()
    java.lang.String industryName) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
}