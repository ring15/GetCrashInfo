package com.founq.sdk.getcrashinfo;

import android.app.Application;

/**
 * Created by ring on 2019/7/5.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化异常处理器
        CrashHandler.getInstance().init(this);
    }
}
