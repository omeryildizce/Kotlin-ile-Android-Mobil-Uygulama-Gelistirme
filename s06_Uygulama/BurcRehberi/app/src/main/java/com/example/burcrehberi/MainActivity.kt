package com.example.burcrehberi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var tumBurcBilgileri: ArrayList<Burc>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        veriKaynagiHazirla()

        //var myAdapter = ArrayAdapter<String>(this, R.layout.tek_satir, R.id.tvBurcAdi, burclar)
        //var myAdapter = BurclarArrayAdapter(this, R.layout.tek_satir,  R.id.tvBurcAdi, burclar, burcTarihleri, burcSembolleri)
        //listBurclar.adapter = myAdapter

        var myBaseAdapter = BurclarBaseAdapter(this, tumBurcBilgileri)
        listBurclar.adapter = myBaseAdapter
        listBurclar.setOnItemClickListener { parent, view, position, id ->
            var intent = Intent(this@MainActivity, DetayActivity::class.java)
            intent.putExtra("tiklanilanOgePosition", position)
            intent.putExtra("tumBurcBilgileri", tumBurcBilgileri)
            startActivity(intent)
        }
    }

    private fun veriKaynagiHazirla() {
        tumBurcBilgileri = ArrayList<Burc>(12)
        var burclar = resources.getStringArray(R.array.burclar)
        var burcTarihleri = resources.getStringArray(R.array.burcTarih)
        var burcSembolleri = arrayOf(
            R.drawable.aries,
            R.drawable.taurus,
            R.drawable.gemini,
            R.drawable.cancer,
            R.drawable.leo,
            R.drawable.virgo,
            R.drawable.libra,
            R.drawable.scorpio,
            R.drawable.sagittarius,
            R.drawable.capricorn,
            R.drawable.aquarius,
            R.drawable.pisces
        )
        var burcBuyukResimler = arrayOf(
            R.drawable.burc01,
            R.drawable.burc02,
            R.drawable.burc03,
            R.drawable.burc04,
            R.drawable.burc05,
            R.drawable.burc06,
            R.drawable.burc07,
            R.drawable.burc08,
            R.drawable.burc09,
            R.drawable.burc10,
            R.drawable.burc11,
            R.drawable.burc12
        )
        var burcGenelOzellikleri =resources.getStringArray(R.array.burcGenelOzellikler)
        for (i in 0..11) {
            var arrayListeAtanacakBurclar: Burc =
                Burc(burclar[i], burcTarihleri[i], burcSembolleri[i], burcBuyukResimler[i],burcGenelOzellikleri[i])
            tumBurcBilgileri.add(arrayListeAtanacakBurclar)
        }
    }
}