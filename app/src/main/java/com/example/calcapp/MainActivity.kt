package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar
import android. util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {

            Log.d("kotlintest", editText1.text.toString())
            Log.d("kotlintest", editText2.text.toString())

            val num1 = editText1.text.toString().toFloatOrNull()
            val num2 = editText2.text.toString().toFloatOrNull()

            if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
                Snackbar.make(it, "数字を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action") {
                        Log.d("UI~PARTS", "数字を入力してください")
                    }.show()
            } else {
                Log.d("kotlintest", (num1!! + num2!!).toString())
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE", (num1!! + num2!!).toString())
                startActivity(intent)
            }
        }


        button2.setOnClickListener {
            Log.d("kotlintest", editText1.text.toString())
            Log.d("kotlintest", editText2.text.toString())

            val num1 = editText1.text.toString().toFloatOrNull()
            val num2 = editText2.text.toString().toFloatOrNull()

            if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
                Snackbar.make(it, "数字を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action") {
                        Log.d("UI~PARTS", "数字を入力してください")
                    }.show()
            } else {
                Log.d("kotlintest", (num1!! + num2!!).toString())
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE", (num1!! - num2!!).toString())
                startActivity(intent)
            }
        }

        button3.setOnClickListener {
            Log.d("kotlintest", editText1.text.toString())
            Log.d("kotlintest", editText2.text.toString())

            val num1 = editText1.text.toString().toFloatOrNull()
            val num2 = editText2.text.toString().toFloatOrNull()

            if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
                Snackbar.make(it, "数字を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action") {
                        Log.d("UI~PARTS", "数字を入力してください")
                    }.show()
            } else {
                Log.d("kotlintest", (num1!! + num2!!).toString())
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE", (num1!! * num2!!).toString())
                startActivity(intent)
            }
        }

        button4.setOnClickListener {
            Log.d("kotlintest", editText1.text.toString())
            Log.d("kotlintest", editText2.text.toString())

            val num1 = editText1.text.toString().toFloatOrNull()
            val num2 = editText2.text.toString().toFloatOrNull()

            if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
                Snackbar.make(it, "数字を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action") {
                        Log.d("UI~PARTS", "数字を入力してください")
                    }.show()
            } else {
                Log.d("kotlintest", (num1!! + num2!!).toString())
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE", (num1!! / num2!!).toString())
                startActivity(intent)
            }
        }

    }
}

