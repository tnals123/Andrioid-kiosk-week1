package com.example.stageus_week3


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class menulist_frangment : Fragment() {
    override fun onCreateView(inflater:LayoutInflater,container:ViewGroup?,savedInstanceState:Bundle?):View{
        //규칙임
        lateinit var mydata : datainterface
        mydata = context as datainterface
        var asdf =  inflater.inflate(R.layout.menulist_fragment,container,false)

        var toconform = asdf.findViewById<Button>(R.id.to_comform_button)
        var requestvalue  = arguments?.getString("title")

        Log.d("adsfa",requestvalue!!)

        toconform!!.setOnClickListener(){
            mydata.dataPass("컨펌 페이지로 이동 요청")
        }

        return asdf
    }

    override fun onAttach(context : Context){
        super.onAttach(context)
    }
}