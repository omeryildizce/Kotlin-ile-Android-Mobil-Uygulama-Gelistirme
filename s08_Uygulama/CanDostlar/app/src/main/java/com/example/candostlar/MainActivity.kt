package com.example.candostlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import android.widget.SearchView.OnQueryTextListener
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.time.Duration.Companion.milliseconds

class MainActivity : AppCompatActivity()//, OnQueryTextListener
{
    var tumDostlar: ArrayList<Dost> = ArrayList<Dost>()
    lateinit var myAdapter: DostlarRecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veriKaynaginiDoldur()
        myAdapter = DostlarRecyclerViewAdapter(tumDostlar)
        recyclerViewDostlar.adapter = myAdapter

        var myLayoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerViewDostlar.layoutManager = myLayoutManager

        searchViewDost.setOnQueryTextListener(object : OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                myAdapter.filter.filter(newText)
                return false
            }
        })
    }

    private fun veriKaynaginiDoldur() {
        var resimler =
            arrayOf(
                R.drawable.dog01,
                R.drawable.dog02,
                R.drawable.dog03,
                R.drawable.dog04,
                R.drawable.dog05,
                R.drawable.dog06,
                R.drawable.dog07,
                R.drawable.cat01,
                R.drawable.cat02,
                R.drawable.cat03,
                R.drawable.cat04,
                R.drawable.cat05,
                R.drawable.cat06,
                R.drawable.cat07,
                R.drawable.deer01,
                R.drawable.deer02,
                R.drawable.deer03,
                R.drawable.deer04,
                R.drawable.deer05,
                R.drawable.deer06,
                R.drawable.deer07,
                R.drawable.bird01,
                R.drawable.bird02,
                R.drawable.bird03,
                R.drawable.bird04,
                R.drawable.bird05,
                R.drawable.bird06,
                R.drawable.bird07
            )
        var isimler = arrayOf(
            "K??pek 1",
            "K??pek 2",
            "K??pek 3",
            "K??pek 4",
            "K??pek 5",
            "K??pek 6",
            "K??pek 7",
            "Kedi 1",
            "Kedi 2",
            "Kedi 3",
            "Kedi 4",
            "Kedi 5",
            "Kedi 6",
            "Kedi 7",
            "Geyik 1",
            "Geyik 2",
            "Geyik 3",
            "Geyik 4",
            "Geyik 5",
            "Geyik 6",
            "Geyik 7",
            "Ku?? 1",
            "Ku?? 2",
            "Ku?? 3",
            "Ku?? 4",
            "Ku?? 5",
            "Ku?? 6",
            "Ku?? 7",
        )
        for (i in resimler.indices) {
            var eklenecekDost = Dost(isimler[i], resimler[i])
            tumDostlar.add(eklenecekDost)
        }
    }
/*    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.filtre_menu, menu)
        var aramaItem = menu?.findItem(R.id.app_bar_search)
        var searchView = aramaItem?.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return super.onCreateOptionsMenu(menu)
    }*/


    /*
    override fun onQueryTextSubmit(query: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        var girilenVeri = newText?.lowercase()
        var arananlar = ArrayList<Dost>()
        for(dost in tumDostlar){
            var adi = dost.isim.lowercase()
            if(adi.contains(girilenVeri.toString()))
            {
                arananlar.add(dost)
            }
        }
        myAdapter.setFilter(arananlar   )
        return true
    }*/
}