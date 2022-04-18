package com.example.homework5animation

import android.os.Bundle
import android.transition.*
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class AnimationFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.scene_1, container, false).also {
            it.findViewById<Button>(R.id.button).setOnClickListener {
                expand()
            }
        }
    }

    private fun expand(){
        val scene = Scene.getSceneForLayout(requireView() as ViewGroup, R.layout.scene_2, requireContext())
        TransitionManager.go(scene, TransitionSet().apply {
            addTransition(ChangeBounds().setDuration(400L))
        })
    }
}