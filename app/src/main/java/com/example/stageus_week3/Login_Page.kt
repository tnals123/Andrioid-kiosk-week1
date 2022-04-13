package com.example.stageus_week3

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Html
import android.util.Log
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import retrofit2.*
import android.webkit.WebViewClient




class Login_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginlayout)
        var webview = findViewById<WebView>(R.id.webview)
        webview.settings.javaScriptEnabled = true
        var weburl : String = "file:///android_asset/asdfasdf.html"
        webview.loadUrl(weburl)



    }
}

