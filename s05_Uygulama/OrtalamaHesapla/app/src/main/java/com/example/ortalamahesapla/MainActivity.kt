package com.example.ortalamahesapla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.yeni_ders_layout.*
import kotlinx.android.synthetic.main.yeni_ders_layout.view.*

class MainActivity : AppCompatActivity() {
    private val DERSLER =
        arrayOf("Matematik", "Türkçe", "Fizik", "Edebiyat", "Allgoritma", "Tarih")
    private var tumDerslerinBilgileri : ArrayList<Dersler> = ArrayList(5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,DERSLER)
        etDersAd.setAdapter(adapter)
        if (root_layout.childCount == 0) {
            btnOrtalamaHesapla.visibility = View.INVISIBLE

        } else {
            btnOrtalamaHesapla.visibility = View.VISIBLE
        }
        btnDersEkle.setOnClickListener {
            if (!etDersAd.text.isNullOrEmpty()) {
                var inflater = LayoutInflater.from(this)
//            var inflater2 = layoutInflater
//            var inflater3 = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                var yeniDersView = inflater.inflate(R.layout.yeni_ders_layout, null)
                // statik alandan kullanicinin girdiği değerleri alalim.
                yeniDersView.etYeniDersAd.setAdapter(adapter)
                var dersAdi = etDersAd.text.toString()
                var dersKredi = spnDersKredi.selectedItem.toString()
                var dersHarf = spnDersNot.selectedItem.toString()

                yeniDersView.etYeniDersAd.setText(dersAdi)
                yeniDersView.spnYeniDersKredi.setSelection(
                    spinnerDegerininIndeksiniBul(
                        spnDersKredi,
                        dersKredi
                    )
                )
                yeniDersView.spnYeniDersNot.setSelection(
                    spinnerDegerininIndeksiniBul(
                        spnDersNot,
                        dersHarf
                    )
                )

                yeniDersView.btnDersSil.setOnClickListener {
                    root_layout.removeView(yeniDersView)
                    if (root_layout.childCount == 0) {
                        btnOrtalamaHesapla.visibility = View.INVISIBLE

                    } else {
                        btnOrtalamaHesapla.visibility = View.VISIBLE
                    }
                }
                root_layout.addView(yeniDersView)
                btnOrtalamaHesapla.visibility = View.VISIBLE
                sifirla()
            } else {
                Toast.makeText(this, "Ders adı boş olamaz!", Toast.LENGTH_LONG).show()
            }


        }
    }

    private fun sifirla() {
        etDersAd.setText("")
        spnDersKredi.setSelection(0)
        spnDersNot.setSelection(0)
    }

    fun ortalamaHesapla(view: View) {
        var toplamNot =0.0
        var toplamKredi = 0.0
        for (i in 0 until root_layout.childCount) {
            var tekSatir = root_layout.getChildAt(i)
            var geciciDers = Dersler(
                tekSatir.etYeniDersAd.text.toString(),
                ((tekSatir.spnYeniDersKredi.selectedItemPosition) + 1).toString(),
                tekSatir.spnYeniDersNot.selectedItem.toString()
            )
            tumDerslerinBilgileri.add(geciciDers)
        }
        for (ders in tumDerslerinBilgileri){
            toplamNot +=harfiNotaCevir(ders.dersHarfNot) * (ders.dersKredi.toDouble())
            toplamKredi += ders.dersKredi.toDouble()
        }

        Toast.makeText(this, "Ortalama: " + (toplamNot / toplamKredi), Toast.LENGTH_LONG).show()
        tumDerslerinBilgileri.clear()
    }
    fun harfiNotaCevir(gelenNotHarfDegeri:String) : Double{
        var deger = 0.0
        deger = when(gelenNotHarfDegeri){
            "A+" -> 4.0
            "A"  -> 4.0
            "B1" -> 3.5
            "B2" -> 3.25
            "B3" -> 3.0
            "C1" -> 2.75
            "C2" -> 2.5
            "C3" -> 2.0
            "F1" -> 1.5
            "F2" -> 0.0
            else -> 0.0
        }
        return deger
    }
    fun spinnerDegerininIndeksiniBul(spinner: Spinner, aranacakDeger: String): Int {
        for (i in 0..spinner.count) {
            if (spinner.getItemAtPosition(i).toString().equals(aranacakDeger))
                return i
        }
        return 0
    }

}