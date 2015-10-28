package com.apkfuns.xprogressdialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/**
 * Created by baidu on 15/8/31.
 */
public class XProgressDialog extends AlertDialog {

    // theme类型
    public static final int THEME_HORIZONTAL_SPOT = 1;
    public static final int THEME_CIRCLE_PROGRESS = 2;
    public static final int THEME_HEART_PROGRESS = 3;

    protected View progressBar;
    protected TextView message;
    protected String messageText = "正在加载中...";
    protected int theme = THEME_HORIZONTAL_SPOT;

    public XProgressDialog(Context context) {
        super(context);
    }

    public XProgressDialog(Context context, String message) {
        super(context);
        messageText = message;
    }

    public XProgressDialog(Context context, int theme) {
        super(context);
        this.theme = theme;
    }

    public XProgressDialog(Context context, String message, int theme) {
        super(context);
        messageText = message;
        this.theme = theme;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (theme) {
            case THEME_CIRCLE_PROGRESS:
                setContentView(R.layout.view_xprogressdialog_circle_progress);
                break;
            case THEME_HEART_PROGRESS:
                setContentView(R.layout.view_xprogressdialog_heart_progress);
                break;
            default:
                setContentView(R.layout.view_xprogressdialog_spot);
                break;
        }
        message = (TextView) findViewById(R.id.message);
        progressBar = findViewById(R.id.progress);
        if (message != null && !TextUtils.isEmpty(messageText)) {
            message.setText(messageText);
        }
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public void setMessage(String message) {
        this.message.setText(message);
    }

    /**
     * 获取显示文本控件
     *
     * @return
     */
    protected TextView getMessageView() {
        return message;
    }

    /**
     * 获取显示进度的控件
     *
     * @return
     */
    protected View getProgressView() {
        return progressBar;
    }

    @Override
    public void show() {
        super.show();
        if (progressBar instanceof HeartProgressView) {
            progressBar.post(new Runnable() {
                @Override
                public void run() {
                    ((HeartProgressView) progressBar).start();
                }
            });
        }
    }
}
