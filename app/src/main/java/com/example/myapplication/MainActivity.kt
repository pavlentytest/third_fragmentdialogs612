package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        fragmentManager = supportFragmentManager
    }
    override fun onClick(v: View) {
        if(v.id == R.id.button) {
            MyDialog().show(fragmentManager, MyDialog.TAG)
         //  replaceFragment(FirstFragment())
        } else {
            replaceFragment(SecondFragment())
        }
    }
    fun replaceFragment(f: Fragment) {
        val result: FragmentTransaction = fragmentManager.beginTransaction()
        result.replace(R.id.fragmentContainerView, f)
        result.addToBackStack(null)
        result.commit()
    }

}