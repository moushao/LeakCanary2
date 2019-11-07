package com.leakcanary2

import android.app.Application
import leakcanary.LeakCanary

class KTApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        LeakCanary.config = LeakCanary.config.copy(onHeapAnalyzedListener = LeakHandService())
        LeakCanary.showLeakDisplayActivityLauncherIcon(false)

    }
}