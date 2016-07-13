package com.apkfuns.xprogressdialog.sample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.apkfuns.xprogressdialog.XProgressDialog;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XProgressDialog dialog = new XProgressDialog(this, "正在加载正在加载正在加载正在加载..", XProgressDialog.THEME_HEART_PROGRESS);
        dialog.setMessage("1232123213");
        dialog.show();
    }
}
