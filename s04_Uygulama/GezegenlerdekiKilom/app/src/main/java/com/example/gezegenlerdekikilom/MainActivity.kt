package com.example.gezegenlerdekikilom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.view.View.OnClickListener
import android.widget.CheckBox
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnClickListener {
    val KILO_TO_POUND = 2.20462262
    val POUND_TO_KILO = 0.45359237
    val MARS = 0.38
    val VENUS = 0.91
    val JUPITER = 2.34
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this).load(R.drawable.title).into(imageView)
        tvSonuc.text = savedInstanceState?.getString("sonuc")
        cbVenus.setOnClickListener(this)
        cbMars.setOnClickListener(this)
        cbJupiter.setOnClickListener(this)
        /*
        btnHesapla.setOnClickListener {
            try {

                val kullaniciAgirlikPound = kiloToPound(kulaniciKilo.toString().toDouble())
                val marstakiAgirlikPound = kullaniciAgirlikPound * MARS
                val marstakiAgirlikKilo = poundToKilo(marstakiAgirlikPound)
                tvSonuc.text = marstakiAgirlikKilo.formatla(2).toString()
            } catch (e: Exception) {
                tvSonuc.text = e.message
            }

        }
        */
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("sonuc", tvSonuc.text.toString())
    }

    fun kiloToPound(kilo: Double): Double {
        return kilo * KILO_TO_POUND
    }

    fun poundToKilo(pound: Double): Double {
        return pound * POUND_TO_KILO
    }

    fun Double.formatla(kacTaneRakam: Int) = java.lang.String.format("%.${kacTaneRakam}f", this)
    override fun onClick(v: View?) {
        v as CheckBox
        var isChecked: Boolean = v.isChecked
        tvSonuc.text = "0"

        if (!TextUtils.isEmpty(etKilo.text.toString())) {
            var kullaniciKilo = etKilo.text.toString().toDouble()
            var kullaniciPound = kiloToPound(kullaniciKilo)
            Glide.with(this).load(R.drawable.title).into(imageView)

            when (v.id) {
                R.id.cbMars -> {
                    if (isChecked) {
                        hesaplaAgirlik(kullaniciPound, v)
                        cbJupiter.isChecked = false
                        cbVenus.isChecked = false
                        Glide.with(this).load(R.drawable.mars).into(imageView)

                    }
                }
                R.id.cbJupiter -> {
                    if (isChecked) {
                        hesaplaAgirlik(kullaniciPound, v)
                        cbVenus.isChecked = false
                        cbMars.isChecked = false
                        Glide.with(this).load(R.drawable.jupiter).into(imageView)


                    }
                }
                R.id.cbVenus -> {
                    if (isChecked) {
                        hesaplaAgirlik(kullaniciPound, v)
                        cbJupiter.isChecked = false
                        cbMars.isChecked = false
                        Glide.with(this).load(R.drawable.venus).into(imageView)


                    }
                }
                else -> {


                }
            }
        }

    }

    fun hesaplaAgirlik(pound: Double, checkBox: CheckBox) {
        var sonuc: Double = 0.0
        sonuc = when (checkBox.id) {
            R.id.cbMars -> pound * MARS
            R.id.cbVenus -> pound * VENUS
            R.id.cbJupiter -> pound * JUPITER
            else -> pound
        }
        var sonucToKilo = poundToKilo(sonuc).formatla(2)
        tvSonuc.text = sonucToKilo.toString()
    }

}