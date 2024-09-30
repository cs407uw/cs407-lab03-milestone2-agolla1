package com.cs407.lab3.milestone2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

        findViewById<Button>(R.id.firstFragmentButton).setOnClickListener {
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, FirstFragment::class.java, null)
                .setReorderingAllowed(true)
                .addToBackStack("showing First")
                .commit()
        }

        findViewById<Button>(R.id.secondFragmentButton).setOnClickListener {
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, SecondFragment::class.java, null)
                .setReorderingAllowed(true)
                .addToBackStack("showing Second")
                .commit()
        }
    }
}