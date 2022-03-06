package com.example.stageus_week3

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Login_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginlayout)

        var loginbutton = findViewById<Button>(R.id.login)

        var db = DataBase(this,"stageus.db",null,1) // 데이터베이스 클래스 객체
        var readabledb = db.readableDatabase // 데이터베이스 객체를 읽기 가능한 상황으로로
        var writeabledb = db.writableDatabase // 데이터베이스 객체를 쓰기 가능한 상황으로
        var datacontrol = DataBase_Control()

        var id = findViewById<EditText>(R.id.idedit).text.toString()
        var pw = findViewById<EditText>(R.id.pwedit).text.toString()

        var asdf = datacontrol.readaccount(readabledb,id,pw)

        if(asdf.size == 0){
            loginbutton.setOnClickListener() {
                Log.d("asdfasdfasdfasdfasdf","asdfasdfasdfadsfasdfadf")
            }

        }

        else {
            loginbutton.setOnClickListener() {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        var signupbutton = findViewById<Button>(R.id.resister)
        signupbutton.setOnClickListener(){
            datacontrol.createaccount(writeabledb,findViewById<EditText>(R.id.idedit).text.toString(),
                                        findViewById<EditText>(R.id.pwedit).text.toString())
        }
    }
}

