package com.example.stageus_week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)



        initEvent()

    }
    fun initEvent(){
        var menulistbutton = findViewById<Button>(R.id.menulistbutton)
        var comformbutton = findViewById<Button>(R.id.okbutton)

        menulistbutton!!.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentarea,menulist_frangment()).commit()
        }
        comformbutton!!.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentarea,conform_fragment()).commit()
        }
    }
}