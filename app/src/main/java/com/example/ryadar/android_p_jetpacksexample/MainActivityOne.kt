package com.example.ryadar.android_p_jetpacksexample

import android.arch.lifecycle.LifecycleOwner
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.util.Log

class MainActivityOne : AppCompatActivity() {
    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_one)
        if (savedInstanceState == null) {
            var manager: FragmentManager = supportFragmentManager
            var transaction: FragmentTransaction = manager.beginTransaction()
            transaction.add(R.id.frame_layout, MyFragment(), MyFragment::class.java.simpleName).commit()
        }

    }

}
