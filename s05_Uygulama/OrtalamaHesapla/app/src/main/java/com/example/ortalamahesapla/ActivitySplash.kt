package com.example.ortalamahesapla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_splash.*

class ActivitySplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var assagidanGelenButton = AnimationUtils.loadAnimation(this, R.anim.assagidan_gelen_button)
        btnOrtalamaHesaplaAnim.animation = assagidanGelenButton
        var yukaridanGelen = AnimationUtils.loadAnimation(this, R.anim.yukaridan_gelen)
        imageView.animation = yukaridanGelen

        btnOrtalamaHesaplaAnim.setOnClickListener {
            btnOrtalamaHesaplaAnim.startAnimation(
                AnimationUtils.loadAnimation(
                    this,
                    R.anim.assagi_giden_button
                )
            )
            imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.yukari_giden))
            object : CountDownTimer(1000, 1000) {
                override fun onTick(millisUntilFinished: Long) {


                }

                override fun onFinish() {
                    var intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                }

            }.start()

        }
    }
}