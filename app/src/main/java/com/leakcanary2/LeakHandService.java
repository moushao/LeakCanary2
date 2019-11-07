package com.leakcanary2;

import android.util.Log;

import org.jetbrains.annotations.NotNull;

import leakcanary.OnHeapAnalyzedListener;
import shark.HeapAnalysis;

class LeakHandService implements OnHeapAnalyzedListener {

    @Override
    public void onHeapAnalyzed(@NotNull HeapAnalysis heapAnalysis) {
        //做你想做，图我自在
        Log.e("TAG", heapAnalysis.toString());//打印heap分析后的信息
    }
}