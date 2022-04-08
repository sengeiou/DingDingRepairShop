package com.ocrgroup.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.ocrgroup.vinlibrary.R;


public class OcrProgressDialog extends ProgressDialog {

    private TextView textView;

    public OcrProgressDialog(Context context) {
        super(context);
        setCanceledOnTouchOutside(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.width = WindowManager.LayoutParams.WRAP_CONTENT;
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;
        getWindow().setAttributes(params);
        setContentView(R.layout.progress_loading);//loading的xml文件
        textView = (TextView) findViewById(R.id.tv_load_dialog);
    }

    public void setTextMessage(String message) {
        textView.setText(message);
    }
}
