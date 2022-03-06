package com.example.stageus_week3

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import kotlin.io.path.createTempDirectory

class DataBase_Control {

    fun readaccount(database : SQLiteDatabase, id : String, pw : String) : ArrayList<ArrayList<String>> {
        var array = ArrayList<ArrayList<String>>()

        var sql = "SELECT * FROM account WHERE id = '$id' and pw = '$pw'"
        var result : Cursor = database.rawQuery(sql,null)

        while(result.moveToNext()) {
            val seq = result.getInt(0).toString()
            val id =  result.getString(1)
            val pw =  result.getString(2)
            result.moveToNext() // 다음 raw 로 넘어감, 리턴으로 받아오기
            val temarray = arrayListOf(seq,id,pw)
            array.add(temarray)
        }

        result.close() // 커서를 닫아주지 않으면 다음 작업이 실행되지 않음!!!!!!

        return array
    }

    fun createaccount(database : SQLiteDatabase, id : String, pw : String){
        var sql = "INSERT INTO account('id','pw') VALUES('${id}','${pw}')"
        database.execSQL(sql)
    }

    fun updateaccount(database : SQLiteDatabase,seq : String , coluom : String, value : String){
        var sql = "UPDATE account SET ${coluom} = '${value}' WHERE seq = ${seq}"
        database.execSQL(sql)
    }

    fun deleteaccount(database : SQLiteDatabase, seq : String){
        var sql = "DELETE FROM account WHERE seq = ${seq}"
        database.execSQL(sql)

    }

}