package com.example.manzararecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var tumManzaralar = ArrayList<Manzara>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veriKaynaginiDoldur()
        var myAdapter = ManzaraAdapter(tumManzaralar)
        recyclerViewManzara.adapter = myAdapter
        var linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewManzara.layoutManager = linearLayoutManager

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.anamenu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        when(id){
            R.id.menulinearViewHorizontal -> {
                var layoutManagerH = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
                recyclerViewManzara.layoutManager = layoutManagerH
            }
            R.id.menulinearViewVertical -> {
                var layoutManagerV = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                recyclerViewManzara.layoutManager = layoutManagerV

            }
            R.id.menuGrid -> {
                var LayoutManagerG = GridLayoutManager(this, 2)
                recyclerViewManzara.layoutManager = LayoutManagerG
            }
            R.id.menuStaggredHorizontal -> {
                var layoutManagerSH = StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.HORIZONTAL)
                recyclerViewManzara.layoutManager = layoutManagerSH
            }
            R.id.menuStaggredVertical -> {
                var layoutManagerSV = StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.VERTICAL)
                recyclerViewManzara.layoutManager = layoutManagerSV
            }
        }

        return super.onOptionsItemSelected(item)
    }

    fun veriKaynaginiDoldur() : ArrayList<Manzara> {
        var tumResimler = arrayOf(
            R.drawable.manzara01,
            R.drawable.manzara02,
            R.drawable.manzara03,
            R.drawable.manzara04,
            R.drawable.manzara05,
            R.drawable.manzara06,
            R.drawable.manzara07,
            R.drawable.manzara08,
            R.drawable.manzara09,
            R.drawable.manzara10,
            R.drawable.manzara11,
            R.drawable.manzara12,
            R.drawable.manzara13,
            R.drawable.manzara14,
            R.drawable.manzara15,
            R.drawable.manzara16,
        )
        for(i in tumResimler.indices){
            var eklenecekManzara = Manzara("Manzara $i", "Açıklama $i", tumResimler[i])
            tumManzaralar.add(eklenecekManzara)
        }
        return tumManzaralar
    }

}