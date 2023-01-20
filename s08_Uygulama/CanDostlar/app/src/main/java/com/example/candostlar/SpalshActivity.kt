package com.example.candostlar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SpalshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)
    }

    override fun onResume() {
        super.onResume()
        object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                var intent = Intent(this@SpalshActivity, MainActivity::class.java)
                startActivity(intent)
            }

        }.start()
    }
}