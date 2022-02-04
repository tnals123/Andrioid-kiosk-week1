package com.example.stageus_week3


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class menulist_frangment : Fragment() {
    override fun onCreateView(inflater:LayoutInflater,container:ViewGroup?,savedInstanceState:Bundle?):View{
        //규칙임
        return inflater.inflate(R.layout.menulist_fragment,container,false)
    }
}