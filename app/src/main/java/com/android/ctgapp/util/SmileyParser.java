package com.android.ctgapp.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

import com.android.ctgapp.entity.chart.ChartFaceBean;
import com.android.ctgapp.widget.chart.CenteredImageSpan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileyParser {

    private Context mContext;

    private Pattern mPattern;

    public SmileyParser(Context context) {
        mContext = context;
        mPattern = buildPattern();
    }
    // 构建正则表达式
    private Pattern buildPattern() {
        StringBuilder patternString = new StringBuilder();
        patternString.append('(');

        for (ChartFaceBean s : ChartUtil.INSTANCE.getFaceList()) {

            patternString.append(Pattern.quote(s.getImageName()));
            patternString.append('|');
        }
        patternString.replace(patternString.length() - 1, patternString.length(), ")");

        return Pattern.compile(patternString.toString());
    }
    private Integer toPX(Context context,float size){
            float scale = context.getResources().getDisplayMetrics().density;
            return (int)(size * scale + 0.5f);

    }
    // 根据文本替换成图片
    public CharSequence replace(Context context,CharSequence text) {
        SpannableStringBuilder builder = new SpannableStringBuilder(text);
        Matcher matcher = mPattern.matcher(text);
        while (matcher.find()) {
            int resId = ChartUtil.INSTANCE.getChartMap().get(matcher.group());
            Bitmap bitmap= BitmapFactory.decodeResource(context.getResources(), resId);
            CenteredImageSpan imageSpan =new CenteredImageSpan(context, ChartUtil.INSTANCE.imageScale(bitmap,toPX(context,18f) ,toPX(context,18f)));
            builder.setSpan(imageSpan,matcher.start(), matcher.end(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        return builder;
    }
}