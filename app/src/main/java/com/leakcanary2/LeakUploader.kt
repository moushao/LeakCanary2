package com.leakcanary2

import android.os.Looper
import android.util.Log
import leakcanary.DefaultOnHeapAnalyzedListener
import leakcanary.OnHeapAnalyzedListener
import shark.HeapAnalysis

class LeakUploader : OnHeapAnalyzedListener {

    val defaultListener = DefaultOnHeapAnalyzedListener.create()

    override fun onHeapAnalyzed(heapAnalysis: HeapAnalysis) {
        Log.e("TAGKT", heapAnalysis.toString())
        var boolean = Looper.getMainLooper().thread == Thread.currentThread()
        Log.e("TAGKT", boolean.toString())
        TODO("Upload heap analysis to server")
        // Delegate to default behavior (notification and saving result)
        defaultListener.onHeapAnalyzed(heapAnalysis)
    }
}