package com.example.homework3_2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentB : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("LifecycleCallbacks", "FragmentB: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LifecycleCallbacks", "FragmentB: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("LifecycleCallbacks", "FragmentB: onCreateView")
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("LifecycleCallbacks", "FragmentB: onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifecycleCallbacks", "FragmentB: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifecycleCallbacks", "FragmentB: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifecycleCallbacks", "FragmentB: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifecycleCallbacks", "FragmentB: onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("LifecycleCallbacks", "FragmentB: onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("LifecycleCallbacks", "FragmentB: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifecycleCallbacks", "FragmentB: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("LifecycleCallbacks", "FragmentB: onDetach")
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentA()
    }
}