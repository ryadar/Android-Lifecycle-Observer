package com.example.ryadar.android_p_jetpacksexample

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG : String = MainActivity::class.java.simpleName

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
        this.lifecycle.addObserver(MyObserver())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")

    }

    fun checkStartStatus() {

        if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            // do action after activity started
        }
    }
}
