package com.example.stageus_week3

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Html
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import retrofit2.*

class Login_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginlayout)

        var loginbutton = findViewById<Button>(R.id.login)
        var signupbutton = findViewById<Button>(R.id.resister)



        loginbutton.setOnClickListener() {

            var id = findViewById<EditText>(R.id.idedit).text.toString()
            var pw = findViewById<EditText>(R.id.pwedit).text.toString()

            loginbutton.text = Html.fromHtml("<h2>Title</h2><br><p>"+pw+"</p>", Html.FROM_HTML_MODE_COMPACT)
            Log.d("Asdfasdfasdfasdf",loginbutton.text.toString())
            //retrofit 실습 내용
            loginbutton.setOnClickListener() {}
            var retrofit = RetrofitClient.initRetrofit()

            //api 와 통신!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            //enqueue 는 callback 함수임 비동기를 처리해주는 함수
            var requestloginapi = retrofit.create(RetrofitClient.loginApi::class.java)
            requestloginapi.getLogin(id, pw).enqueue(object : Callback<RetrofitClient.logindata> {
                override fun onFailure(call: Call<RetrofitClient.logindata>, t: Throwable) {
                }

                override fun onResponse(
                    call: Call<RetrofitClient.logindata>,
                    response: Response<RetrofitClient.logindata>
                ) {
                    Log.d("result", response.body()!!.message)
                    Log.d("result", response.body()!!.success.toString())
                    var intent = Intent(this@Login_Page,MainActivity :: class.java)
                    startActivity(intent)

                }

            })
        }

    }
}

