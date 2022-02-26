package com.example.stageus_week3

import android.app.Service
import android.content.Intent
import android.os.IBinder
import java.security.Provider
import android.media.MediaPlayer

class Music_Service : Service() {

    lateinit var backgroundmusic : MediaPlayer

    override fun onBind(Intent : Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        backgroundmusic = MediaPlayer.create(this, R.raw.bgm)

    }
    //서비스가 실행될 때 실해오디는 함수
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        // 내가 서비스를 통해서 하고 싶은 것 넣기
        backgroundmusic.start()

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        backgroundmusic.stop()
    }

}