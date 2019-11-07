package com.leakcanary2;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;

import leakcanary.LeakCanary;
import shark.ObjectInspector;
import shark.ReferenceMatcher;


public class ReleaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.Config config = new LeakCanary.Config(
                false,//禁止使用
                false, //是否debug中分析内存
                5,
                new ArrayList<ReferenceMatcher>(),
                new ArrayList<ObjectInspector>(),
                new LeakHandService(),
                false,//计算泄漏内存大小
                100,
                false, //是否需要读写权限
                false);
        LeakCanary.INSTANCE.setConfig(config);
        LeakCanary.INSTANCE.showLeakDisplayActivityLauncherIcon(false);
        Log.e("TAG", "ReleaseApplication");
    }
}
