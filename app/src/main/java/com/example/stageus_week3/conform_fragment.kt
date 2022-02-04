package com.example.stageus_week3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class conform_fragment : Fragment() {
    override fun onCreateView(inflater:LayoutInflater,container:ViewGroup?,savedInstanceState:Bundle?):View{
        //규칙임
        return inflater.inflate(R.layout.main_conform_fragment,container,false)
    }
}