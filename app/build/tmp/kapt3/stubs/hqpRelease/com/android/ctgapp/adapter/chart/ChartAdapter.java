package com.android.ctgapp.adapter.chart;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 1/8/21
 * 描述: 聊天 适配器
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/android/ctgapp/adapter/chart/ChartAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/android/ctgapp/adapter/chart/ChartAdapter$MyViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "mList", "", "Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;", "listener", "Lcom/android/ctgapp/adapter/chart/ChartAdapter$MassageListClickListener;", "otherImage", "", "myImage", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;Lcom/android/ctgapp/adapter/chart/ChartAdapter$MassageListClickListener;Ljava/lang/String;Ljava/lang/String;)V", "headerLeft", "headerRight", "mImageFile", "Ljava/io/File;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOtherImage", "imageUrl", "MassageListClickListener", "MyViewHolder", "app_hqpRelease"})
public final class ChartAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.android.ctgapp.adapter.chart.ChartAdapter.MyViewHolder> {
    private final androidx.fragment.app.FragmentActivity context = null;
    private final java.util.List<com.android.ctgapp.entity.chart.ChartResult.MsgBean> mList = null;
    private final com.android.ctgapp.adapter.chart.ChartAdapter.MassageListClickListener listener = null;
    private final java.lang.String otherImage = null;
    private final java.lang.String myImage = null;
    private java.lang.String headerLeft;
    private final java.lang.String headerRight = null;
    private java.io.File mImageFile;
    
    public ChartAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.ctgapp.entity.chart.ChartResult.MsgBean> mList, @org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.chart.ChartAdapter.MassageListClickListener listener, @org.jetbrains.annotations.NotNull()
    java.lang.String otherImage, @org.jetbrains.annotations.NotNull()
    java.lang.String myImage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.ctgapp.adapter.chart.ChartAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.adapter.chart.ChartAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void setOtherImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u0011\u0010\"\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014R\u001c\u0010$\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u0011\u0010*\u001a\u00020+\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0014R\u0011\u00100\u001a\u00020+\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0011\u00102\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0014R\u0011\u00104\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001aR\u001c\u00106\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u0010\u001cR\u001c\u0010B\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\n\"\u0004\bD\u0010\fR\u001c\u0010E\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001a\"\u0004\bG\u0010\u001cR\u001c\u0010H\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001a\"\u0004\bJ\u0010\u001cR\u001c\u0010K\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001a\"\u0004\bM\u0010\u001cR\u001c\u0010N\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001a\"\u0004\bP\u0010\u001cR\u001c\u0010Q\u001a\u0004\u0018\u00010RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001c\u0010W\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u001a\"\u0004\bY\u0010\u001cR\u001c\u0010Z\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u001a\"\u0004\b\\\u0010\u001cR\u001c\u0010]\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0014\"\u0004\b_\u0010\u0016R\u001c\u0010`\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0010\"\u0004\bb\u0010cR\u001c\u0010d\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0014\"\u0004\bf\u0010\u0016R\u001c\u0010g\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0014\"\u0004\bi\u0010\u0016R\u001c\u0010j\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u001a\"\u0004\bl\u0010\u001c\u00a8\u0006m"}, d2 = {"Lcom/android/ctgapp/adapter/chart/ChartAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "type", "", "(Lcom/android/ctgapp/adapter/chart/ChartAdapter;Landroid/view/View;I)V", "mCardParentRl", "Landroid/widget/RelativeLayout;", "getMCardParentRl", "()Landroid/widget/RelativeLayout;", "setMCardParentRl", "(Landroid/widget/RelativeLayout;)V", "mChartContentLL", "Landroid/widget/LinearLayout;", "getMChartContentLL", "()Landroid/widget/LinearLayout;", "mChartImage", "Landroid/widget/ImageView;", "getMChartImage", "()Landroid/widget/ImageView;", "setMChartImage", "(Landroid/widget/ImageView;)V", "mChartTextTV", "Landroid/widget/TextView;", "getMChartTextTV", "()Landroid/widget/TextView;", "setMChartTextTV", "(Landroid/widget/TextView;)V", "mChartTimeTV", "getMChartTimeTV", "mCompanyNameTV", "getMCompanyNameTV", "setMCompanyNameTV", "mErrorIV", "getMErrorIV", "mGoodsInfoTV", "getMGoodsInfoTV", "setMGoodsInfoTV", "mGoodsNameTV", "getMGoodsNameTV", "setMGoodsNameTV", "mHeaderLeftCV", "Landroidx/cardview/widget/CardView;", "getMHeaderLeftCV", "()Landroidx/cardview/widget/CardView;", "mHeaderLeftIV", "getMHeaderLeftIV", "mHeaderRightCV", "getMHeaderRightCV", "mHeaderRightIV", "getMHeaderRightIV", "mIsRedTV", "getMIsRedTV", "mOrderBuyerTV", "getMOrderBuyerTV", "setMOrderBuyerTV", "mOrderDetailRv", "Landroidx/recyclerview/widget/RecyclerView;", "getMOrderDetailRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setMOrderDetailRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mOrderNumberTV", "getMOrderNumberTV", "setMOrderNumberTV", "mOrderParentRL", "getMOrderParentRL", "setMOrderParentRL", "mOrderStatusTV", "getMOrderStatusTV", "setMOrderStatusTV", "mOrderText", "getMOrderText", "setMOrderText", "mOrderTimeTV", "getMOrderTimeTV", "setMOrderTimeTV", "mPhoneTV", "getMPhoneTV", "setMPhoneTV", "mUserHeaderIV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getMUserHeaderIV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setMUserHeaderIV", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "mUserNameTV", "getMUserNameTV", "setMUserNameTV", "mVideoTimeTV", "getMVideoTimeTV", "setMVideoTimeTV", "mVideoVV", "getMVideoVV", "setMVideoVV", "mVoiceLL", "getMVoiceLL", "setMVoiceLL", "(Landroid/widget/LinearLayout;)V", "mVoiceLeftIV", "getMVoiceLeftIV", "setMVoiceLeftIV", "mVoiceRightIV", "getMVoiceRightIV", "setMVoiceRightIV", "mVoiceTimeTV", "getMVoiceTimeTV", "setMVoiceTimeTV", "app_hqpRelease"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout mChartContentLL = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mHeaderLeftIV = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView mHeaderLeftCV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mHeaderRightIV = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView mHeaderRightCV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mErrorIV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mChartTimeTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mIsRedTV = null;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mChartTextTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView mChartImage;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView mVideoVV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mVideoTimeTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout mVoiceLL;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView mVoiceLeftIV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView mVoiceRightIV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mVoiceTimeTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mOrderNumberTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mOrderTimeTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mGoodsNameTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mGoodsInfoTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.RelativeLayout mOrderParentRL;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mOrderBuyerTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mOrderStatusTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mOrderText;
        @org.jetbrains.annotations.Nullable()
        private androidx.recyclerview.widget.RecyclerView mOrderDetailRv;
        @org.jetbrains.annotations.Nullable()
        private de.hdodenhof.circleimageview.CircleImageView mUserHeaderIV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mUserNameTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mPhoneTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView mCompanyNameTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.RelativeLayout mCardParentRl;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, int type) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getMChartContentLL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMHeaderLeftIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getMHeaderLeftCV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMHeaderRightIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getMHeaderRightCV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMErrorIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMChartTimeTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMIsRedTV() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMChartTextTV() {
            return null;
        }
        
        public final void setMChartTextTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getMChartImage() {
            return null;
        }
        
        public final void setMChartImage(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getMVideoVV() {
            return null;
        }
        
        public final void setMVideoVV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMVideoTimeTV() {
            return null;
        }
        
        public final void setMVideoTimeTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getMVoiceLL() {
            return null;
        }
        
        public final void setMVoiceLL(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getMVoiceLeftIV() {
            return null;
        }
        
        public final void setMVoiceLeftIV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getMVoiceRightIV() {
            return null;
        }
        
        public final void setMVoiceRightIV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMVoiceTimeTV() {
            return null;
        }
        
        public final void setMVoiceTimeTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMOrderNumberTV() {
            return null;
        }
        
        public final void setMOrderNumberTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMOrderTimeTV() {
            return null;
        }
        
        public final void setMOrderTimeTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMGoodsNameTV() {
            return null;
        }
        
        public final void setMGoodsNameTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMGoodsInfoTV() {
            return null;
        }
        
        public final void setMGoodsInfoTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.RelativeLayout getMOrderParentRL() {
            return null;
        }
        
        public final void setMOrderParentRL(@org.jetbrains.annotations.Nullable()
        android.widget.RelativeLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMOrderBuyerTV() {
            return null;
        }
        
        public final void setMOrderBuyerTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMOrderStatusTV() {
            return null;
        }
        
        public final void setMOrderStatusTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMOrderText() {
            return null;
        }
        
        public final void setMOrderText(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.recyclerview.widget.RecyclerView getMOrderDetailRv() {
            return null;
        }
        
        public final void setMOrderDetailRv(@org.jetbrains.annotations.Nullable()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final de.hdodenhof.circleimageview.CircleImageView getMUserHeaderIV() {
            return null;
        }
        
        public final void setMUserHeaderIV(@org.jetbrains.annotations.Nullable()
        de.hdodenhof.circleimageview.CircleImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMUserNameTV() {
            return null;
        }
        
        public final void setMUserNameTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMPhoneTV() {
            return null;
        }
        
        public final void setMPhoneTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMCompanyNameTV() {
            return null;
        }
        
        public final void setMCompanyNameTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.RelativeLayout getMCardParentRl() {
            return null;
        }
        
        public final void setMCardParentRl(@org.jetbrains.annotations.Nullable()
        android.widget.RelativeLayout p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\"\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\bH&\u00a8\u0006\u0010"}, d2 = {"Lcom/android/ctgapp/adapter/chart/ChartAdapter$MassageListClickListener;", "", "messageResend", "", "msgId", "", "msg", "msgType", "", "onOtherHeadClick", "onVideoClick", "url", "onVoiceClick", "imageView", "Landroid/widget/ImageView;", "position", "app_hqpRelease"})
    public static abstract interface MassageListClickListener {
        
        public abstract void messageResend(@org.jetbrains.annotations.NotNull()
        java.lang.String msgId, @org.jetbrains.annotations.NotNull()
        java.lang.String msg, int msgType);
        
        public abstract void onVideoClick(@org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        public abstract void onVoiceClick(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        android.widget.ImageView imageView, int position);
        
        public abstract void onOtherHeadClick();
    }
}