package com.example.stageus_week3

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBase(context: Context? ,  name : String , factory : SQLiteDatabase.CursorFactory? , version : Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(database: SQLiteDatabase?) {
        val sql : String = "CREATE TABLE IF NOT EXISTS account(seq INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT , pw TEXT)"
        database!!.execSQL(sql)
    }

    override fun onUpgrade(database: SQLiteDatabase?, oldversion: Int, newversion: Int) {

        //DROP TABLE 많이 함
    }
}