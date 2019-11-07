package com.leakcanary2;

import android.content.Context;

public class LeakInstance {
    private Context context;
    public static LeakInstance instance = new LeakInstance();

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
