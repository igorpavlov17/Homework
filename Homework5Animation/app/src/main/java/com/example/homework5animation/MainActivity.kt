package com.example.homework5animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.OnBackPressedCallback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                supportFragmentManager.popBackStack()
            }
        })

        findViewById<Button>(R.id.homework).setOnClickListener {
            supportFragmentManager.beginTransaction().addToBackStack(null).replace(R.id.fl, AnimationFragment()).commit()
        }
    }
}