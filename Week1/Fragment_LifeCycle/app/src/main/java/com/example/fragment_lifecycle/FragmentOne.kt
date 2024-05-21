package com.example.fragment_lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentOne : Fragment(){
    val TAG = "FragmentOne"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"onAttach method called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate method called")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater!!.inflate(R.layout.fragment_one, container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,"onActivityCreated method called")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"onstart method called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"onResume method called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause method called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"onStop method called")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG,"onDestroyView method called")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy method called")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG,"onDetach method called")
        super.onDetach()
    }

}