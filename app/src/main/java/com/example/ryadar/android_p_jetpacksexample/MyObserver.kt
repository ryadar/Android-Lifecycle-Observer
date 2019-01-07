package com.example.ryadar.android_p_jetpacksexample

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class MyObserver : LifecycleObserver {

    val TAG: String = MyObserver::class.java.simpleName

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun create() {
        Log.i(TAG, "create ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start() {
        Log.i(TAG, "start ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.i(TAG, "OnResume ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.i(TAG, "onPause ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.i(TAG, "onStop ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.i(TAG, "onDestroy ")
    }


}