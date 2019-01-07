package com.example.ryadar.android_p_jetpacksexample

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner

class MyLifeCyclerOwner :LifecycleOwner {
    override fun getLifecycle(): Lifecycle {
        return MyLifeCycle()
    }
}