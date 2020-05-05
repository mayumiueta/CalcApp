package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Log.d("kotlintest", editText1.text.toString())
            Log.d("kotlintest", editText2.text.toString())

            val num1 = editText1.text.toString().toFloatOrNull()
            val num2 = editText2.text.toString().toFloatOrNull()

            Log.d("kotlintest", (num1!! + num2!!).toString() )
        }
    }
    }


/*
2つのEditTextから文字列を取得
1で取得した2つの文字列を小数に変換
2で変換した数値を計算
計算した値を SecondActivityに渡して画面遷移
*/