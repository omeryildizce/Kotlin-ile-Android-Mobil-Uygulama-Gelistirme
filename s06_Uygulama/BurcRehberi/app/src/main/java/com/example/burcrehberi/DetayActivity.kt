package com.example.burcrehberi

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.palette.graphics.Palette
import androidx.palette.graphics.Palette.PaletteAsyncListener
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        var position = intent.extras?.get("tiklanilanOgePosition") as Int
        var tumBurcBilgileri = intent.extras?.get("tumBurcBilgileri") as ArrayList<Burc>
        tvBurcOzellikleri.setText(tumBurcBilgileri.get(position).burcGenelOzellikler)
        header.setImageResource(tumBurcBilgileri.get(position).buyukBurcResim)
        setSupportActionBar(anim_toolbar)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        collapsing_toolbar.title = tumBurcBilgileri.get(position).burcAdi

        var bitmap =
            BitmapFactory.decodeResource(resources, tumBurcBilgileri.get(position).buyukBurcResim)
        Palette.from(bitmap).generate(object : PaletteAsyncListener {
            @SuppressLint("ResourceAsColor")
            override fun onGenerated(palette: Palette?) {
                var color = palette?.getVibrantColor(R.color.purple_500)
                if (color != null) {
                    collapsing_toolbar.setContentScrimColor(color)
                    window.statusBarColor = color
                }
                collapsing_toolbar.setStatusBarScrimColor(R.color.purple_500);
            }

        })


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}