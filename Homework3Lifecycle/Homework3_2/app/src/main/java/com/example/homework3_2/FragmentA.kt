package com.example.homework3_2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentA : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("LifecycleCallbacks", "FragmentA: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LifecycleCallbacks", "FragmentA: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("LifecycleCallbacks", "FragmentA: onCreateView")
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("LifecycleCallbacks", "FragmentA: onViewCreated")
        view.findViewById<Button>(R.id.add).setOnClickListener {
            parentFragmentManager.beginTransaction().add(R.id.fragment_container, FragmentB()).commit()
        }
        view.findViewById<Button>(R.id.replace).setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container, FragmentB()).commit()
        }
        view.findViewById<Button>(R.id.addstack).setOnClickListener {
            parentFragmentManager.beginTransaction().add(R.id.fragment_container, FragmentB()).addToBackStack(null).commit()
        }
        view.findViewById<Button>(R.id.replacestack).setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container, FragmentB()).addToBackStack(null).commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifecycleCallbacks", "FragmentA: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifecycleCallbacks", "FragmentA: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifecycleCallbacks", "FragmentA: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifecycleCallbacks", "FragmentA: onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("LifecycleCallbacks", "FragmentA: onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("LifecycleCallbacks", "FragmentA: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifecycleCallbacks", "FragmentA: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("LifecycleCallbacks", "FragmentA: onDetach")
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentA()
    }
}