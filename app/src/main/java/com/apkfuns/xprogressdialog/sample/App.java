package com.apkfuns.xprogressdialog.sample;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by pengwei on 16/8/18.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
