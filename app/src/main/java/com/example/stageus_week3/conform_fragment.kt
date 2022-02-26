package com.example.stageus_week3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class conform_fragment : Fragment() {

    override fun onCreateView(inflater:LayoutInflater,container:ViewGroup?,savedInstanceState:Bundle?):View{
        //규칙임
        var requestvalue  = arguments?.getString("asdf")
        var main = activity as MainActivity
        var myview =  inflater.inflate(R.layout.main_conform_fragment,container,false)

        var button = myview.findViewById<Button>(R.id.Service_button)
        var button2 = myview.findViewById<Button>(R.id.stop_button)

        button!!.setOnClickListener(){
            main.music_Start()
        }
        button2!!.setOnClickListener(){
            main.music_Stop()
        }

        return myview
}


}