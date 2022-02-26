package com.example.stageus_week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity(), datainterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("adsfasdfasd","onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)

        var fragment = menulist_frangment()
        var mybundle = Bundle()
        mybundle.putString("title", "메뉴 리스트로 이동!!!!!!!!!")
        fragment.arguments = mybundle
        supportFragmentManager.beginTransaction().replace(R.id.fragmentarea, fragment).commit()

        initEvent()
    }

    fun initEvent(){
        var menulistbutton = findViewById<Button>(R.id.menulistbutton)
        var comformbutton = findViewById<Button>(R.id.okbutton)

        var fragment = menulist_frangment()
        var mybundle = Bundle()
        mybundle.putString("title", "메뉴 리스트로 이동!!!!!!!!!")
        fragment.arguments = mybundle

        var fragment2 = conform_fragment()
        var mybundle2 = Bundle()
        mybundle2.putString("title", "메뉴 리스트로 이동!!!!!!!!!")
        fragment2.arguments = mybundle2

        menulistbutton!!.setOnClickListener{
            var fragment = menulist_frangment()
            var mybundle = Bundle()
            mybundle.putString("title", "메뉴 리스트로 이동!!!!!!!!!")
            fragment.arguments = mybundle
            supportFragmentManager.beginTransaction().replace(R.id.fragmentarea,fragment).commit()
        }
        comformbutton!!.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentarea,fragment2).commit()
        }
    }
    override fun dataPass(data: String){
        Log.d("asdfasdf",data)
    }

    fun music_Start(){
        var intent = Intent(this , Music_Service :: class.java)
        startService(intent)
    }
    fun music_Stop(){
        var intent = Intent(this , Music_Service :: class.java)
        stopService(intent)
    }

//    override fun onStart() {
//        super.onStart()
//        Log.d("adsfasdfasd","onStart")
//    }
//    override fun onResume() {
//        super.onResume()
//        Log.d("adsfasdfasd","onResume")
//    }
//    override fun onPause() {
//        super.onPause()
//        Log.d("adsfasdfasd","onPause")
//    }
//    override fun onStop() {
//        super.onStop()
//        Log.d("adsfasdfasd","onStop")
//    }
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d("adsfasdfasd","onDestroy")
//    }
}