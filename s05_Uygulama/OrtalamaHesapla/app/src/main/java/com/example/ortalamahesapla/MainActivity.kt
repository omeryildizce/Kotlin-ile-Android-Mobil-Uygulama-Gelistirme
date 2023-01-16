package com.example.ortalamahesapla

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Spinner
import androidx.core.view.indices
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.yeni_ders_layout.*
import kotlinx.android.synthetic.main.yeni_ders_layout.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDersEkle.setOnClickListener {
            var inflater = LayoutInflater.from(this)
//            var inflater2 = layoutInflater
//            var inflater3 = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var yeniDersView = inflater.inflate(R.layout.yeni_ders_layout, null)
            // statik alandan kullanicinin girdiği değerleri alalim.
            var dersAdi = etDersAd.text.toString()
            var dersKredi = spnDersKredi.selectedItem.toString()
            var dersHarf = spnDersNot.selectedItem.toString()

            yeniDersView.etYeniDersAd.setText(dersAdi)
            yeniDersView.spnYeniDersKredi.setSelection( spinnerDegerininIndeksiniBul( spnDersKredi, dersKredi )  )
            yeniDersView.spnYeniDersNot.setSelection(spinnerDegerininIndeksiniBul(spnDersNot,dersHarf))

            yeniDersView.btnDersSil.setOnClickListener {
                root_layout.removeView(yeniDersView)
            }
            root_layout.addView(yeniDersView)

        }
    }

    fun ortalamaHesapla(view: View) {

    }

    fun spinnerDegerininIndeksiniBul(spinner: Spinner, aranacakDeger: String): Int {
        for (i in 0..spinner.count) {
            if (spinner.getItemAtPosition(i).toString().equals(aranacakDeger))
                return i
        }
        return 0
    }

}