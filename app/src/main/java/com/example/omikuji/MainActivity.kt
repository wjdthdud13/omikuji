package com.example.omikuji

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val omikuji = findViewById<View>(R.id.text_view) as TextView
        val button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener {
            val rnd = Random() //랜덤클래스로부터 랜덤 값 받아오는 변수 작성.
            Log.e("@@@@@@", "hello")
            val num = rnd.nextInt(6)
            when (num) {
                0 -> {
                    omikuji.text = "大吉"
                    omikuji.setTextColor(Color.BLACK)
                }
                1 -> {
                    omikuji.text = "吉"
                    omikuji.setTextColor(Color.BLACK)
                }
                2 -> {
                    omikuji.text = "中吉"
                    omikuji.setTextColor(Color.BLACK)
                }
                3 -> {
                    omikuji.text = "小吉"
                    omikuji.setTextColor(Color.BLACK)
                }
                4 -> {
                    omikuji.text = "末吉"
                    omikuji.setTextColor(Color.BLACK)
                }
                5 -> {
                    omikuji.text = "凶"
                    omikuji.setTextColor(Color.RED)
                }
            }
        }
    }
}