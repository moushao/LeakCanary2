package com.leakcanary2;

import android.app.Application;

import java.util.ArrayList;

import leakcanary.LeakCanary;
import shark.ObjectInspector;
import shark.ReferenceMatcher;


public class DebugApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.Config config = new LeakCanary.Config(true, true, 5,
                new ArrayList<ReferenceMatcher>(),
                new ArrayList<ObjectInspector>(),
                new LeakHandService(),
                false,
                100,
                false, true);
        LeakCanary.INSTANCE.showLeakDisplayActivityLauncherIcon(true);
        LeakCanary.INSTANCE.setConfig(config);
    }
}
