package com.example.candostlar

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.tek_uye.view.*

class DostlarRecyclerViewAdapter(tumDostlar: ArrayList<Dost>) :
    RecyclerView.Adapter<DostlarRecyclerViewAdapter.DostViewHolder>(), Filterable {
    var dostlar = tumDostlar
    var myFilter: FilterHelper = FilterHelper(tumDostlar, this)
    override fun getItemCount(): Int {
        return this.dostlar.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DostViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var tek_uye = inflater.inflate(R.layout.tek_uye, parent, false)
        return DostViewHolder(tek_uye)
    }

    override fun onBindViewHolder(holder: DostViewHolder, position: Int) {
        var olusturulanDost = dostlar.get(position)
        holder.setData(olusturulanDost, position)
    }

    fun setFilter(dosts: ArrayList<Dost>) {
        dostlar = dosts
    }


    class DostViewHolder(itemView: View) : ViewHolder(itemView) {
        fun setData(olusturulanDost: Dost, position: Int) {
            this.dostAd.text = olusturulanDost.isim
            this.dostResim.setImageResource(olusturulanDost.resim)

            tekDostBilgisi.setOnClickListener {v ->
                var intent = Intent(v.context, DetayActivity::class.java)
                intent.putExtra("ad", olusturulanDost.isim)
                intent.putExtra("resim", olusturulanDost.resim)
                v.context.startActivity(intent)



            }

        }

        var tekDostBilgisi = itemView
        var dostAd = tekDostBilgisi.tvDostAdi
        var dostResim = tekDostBilgisi.imgDost


    }

    override fun getFilter(): Filter {
        return myFilter
    }
    /*fun setFilter(aranilanlar:ArrayList<Dost>){
        dostlar = ArrayList<Dost>()
        dostlar.addAll(aranilanlar)
        notifyDataSetChanged()
    }*/

}