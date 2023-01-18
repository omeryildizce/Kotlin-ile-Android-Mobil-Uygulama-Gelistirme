package com.example.burcrehberi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.tek_satir.view.*

class BurclarArrayAdapter(
    context: Context,
    resource: Int,
    textViewResourceId: Int,
    var burcAdlari: Array<String>,
    var burcTarihleri: Array<String>,
    var burcResimleri: Array<Int>
) : ArrayAdapter<String>(context, resource, textViewResourceId, burcAdlari) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tekSatirView = convertView
        var viewHolder: ViewHolder? = null
        if (tekSatirView == null) {
            var inflater = LayoutInflater.from(context)
            tekSatirView = inflater.inflate(R.layout.tek_satir, parent, false)
            viewHolder = ViewHolder(tekSatirView)
            tekSatirView.tag = viewHolder
        } else
            viewHolder = tekSatirView.getTag() as ViewHolder
            //viewHolder = ViewHolder(tekSatirView)
        viewHolder.burcResim.setImageResource(burcResimleri[position])
        viewHolder.burcAdi.setText(burcAdlari[position])
        viewHolder.burcTarih.setText(burcTarihleri[position])

        return tekSatirView!!
    }

    class ViewHolder(tekSatirView: View) {
        var burcResim: ImageView
        var burcAdi: TextView
        var burcTarih: TextView

        init {
            this.burcResim = tekSatirView.imgBurcSembol
            this.burcAdi = tekSatirView.tvBurcAdi
            this.burcTarih = tekSatirView.tvBurcTarihi
        }
    }
}