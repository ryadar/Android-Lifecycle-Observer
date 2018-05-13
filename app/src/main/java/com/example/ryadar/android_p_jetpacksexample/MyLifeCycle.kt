package com.example.ryadar.android_p_jetpacksexample

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver

class MyLifeCycle : Lifecycle() {
    override fun addObserver(observer: LifecycleObserver) {
    }

    override fun removeObserver(observer: LifecycleObserver) {
    }

    override fun getCurrentState(): State {
        return State.STARTED
    }
}