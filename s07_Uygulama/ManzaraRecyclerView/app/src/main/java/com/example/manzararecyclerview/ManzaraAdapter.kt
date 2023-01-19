package com.example.manzararecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.tek_satir_manzara.view.*

class ManzaraAdapter(tumManzaralar: ArrayList<Manzara>) :
    RecyclerView.Adapter<ManzaraAdapter.ManzaraViewHolder>() {
    var manzaralar = tumManzaralar

    inner class ManzaraViewHolder(itemView: View) : ViewHolder(itemView) {

        var tekSatirManzara = itemView as CardView
        var manzaraBaslik = tekSatirManzara.tvManzaraBaslik
        var manzaraAciklma = tekSatirManzara.tvManzaraAciklama
        var manzaraResim = tekSatirManzara.imgManzara
        var btnKopyala = tekSatirManzara.imgManzaraKopyala
        var btnSil = tekSatirManzara.imgManzaraSil



        fun setData(olusturulanManzara: Manzara, position: Int) {
            this.manzaraBaslik.text = olusturulanManzara.baslik
            manzaraAciklma.text = olusturulanManzara.aciklama
            manzaraResim.setImageResource(olusturulanManzara.resim)
            btnKopyala.setOnClickListener {
                manzaralar.add(position, olusturulanManzara)
                notifyItemInserted(position)
                notifyItemRangeChanged(position, manzaralar.size)
            }
            btnSil.setOnClickListener {
                manzaralar.removeAt(position)
                notifyItemRemoved(position)
                notifyItemRangeChanged(position, manzaralar.size)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManzaraViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var tekSatirManzara = inflater.inflate(R.layout.tek_satir_manzara, parent, false)



        return ManzaraViewHolder(tekSatirManzara)
    }

    override fun getItemCount(): Int {
        return this.manzaralar.size
    }

    override fun onBindViewHolder(holder: ManzaraViewHolder, position: Int) {
        var olusturulanManzara = manzaralar.get(position)
        holder.setData(olusturulanManzara, position)
//        holder.manzaraBaslik.text = manzaralar.get(position).baslik
//        holder.manzaraAciklma.text = manzaralar.get(position).aciklama
//        holder.manzaraResim.setImageResource(manzaralar.get(position).resim)

    }
}