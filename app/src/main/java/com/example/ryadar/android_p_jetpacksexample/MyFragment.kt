package com.example.ryadar.android_p_jetpacksexample

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyFragment : Fragment() {

    val TAG = MyFragment::class.java.simpleName

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.i(TAG, "onAttach");
        lifecycle.addObserver(MyFragmentObserver())
    }

    override fun onStart() {
        Log.i(TAG, "onStart");
        super.onStart()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i(TAG, "onViewCreated");
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(TAG, "onCreateView");
        return inflater.inflate(R.layout.fragment_main, null, false)
    }

    override fun onPause() {
        Log.i(TAG, "onPause");
        super.onPause()
    }

    override fun onDestroyView() {
        Log.i(TAG, "onDestroyView");
        super.onDestroyView()
    }

    override fun onStop() {
        Log.i(TAG, "onStop");
        super.onStop()
    }

    override fun onDetach() {
        Log.i(TAG, "onDetach");
        super.onDetach()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy");
        super.onDestroy()
    }
}