package com.example.ryadar.android_p_jetpacksexample

import android.util.Log

class MyListner {

    constructor(){


    }

    fun add(){

        Log.i("Raja","add listner")

        var owner =MyLifeCyclerOwner()
        owner.lifecycle.addObserver(MyObserver())
    }
}