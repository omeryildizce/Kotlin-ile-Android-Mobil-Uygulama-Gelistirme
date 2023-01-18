package com.example.burcrehberi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.tek_satir.view.*

class BurclarBaseAdapter(context: Context, tumBurcBilgileri:ArrayList<Burc>) : BaseAdapter() {
    var tumBurclar: ArrayList<Burc>
    var context: Context

    init {
        this.tumBurclar = tumBurcBilgileri
        this.context = context

    }

    override fun getCount(): Int {
        return tumBurclar.size
    }

    override fun getItem(position: Int): Any {
        return tumBurclar.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var viewHolder: ViewHolderBurc
        var tekSatirView = convertView
        if (tekSatirView == null) {
            var inflater = LayoutInflater.from(context)
            tekSatirView = inflater.inflate(R.layout.tek_satir, parent, false)
            viewHolder = ViewHolderBurc(tekSatirView)
            tekSatirView.tag = viewHolder

        } else {
            viewHolder = tekSatirView.getTag() as ViewHolderBurc
        }

        viewHolder.burcResim.imgBurcSembol.setImageResource(tumBurclar.get(position).burcSembol)
        viewHolder.burcAdi.setText(tumBurclar.get(position).burcAdi)
        viewHolder.burcTarih.setText(tumBurclar.get(position).burcTarih)

        return tekSatirView
    }
}


class ViewHolderBurc(tekSatirView: View) {
    var burcResim: ImageView
    var burcAdi: TextView
    var burcTarih: TextView

    init {
        this.burcResim = tekSatirView.imgBurcSembol
        this.burcAdi = tekSatirView.tvBurcAdi
        this.burcTarih = tekSatirView.tvBurcTarihi
    }
}