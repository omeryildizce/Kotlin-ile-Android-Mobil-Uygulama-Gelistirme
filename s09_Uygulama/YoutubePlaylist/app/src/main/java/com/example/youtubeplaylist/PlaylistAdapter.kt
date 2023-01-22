package com.example.youtubeplaylist


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.tek_satir_playlist.view.*

class PlaylistAdapter(tumOynatmaListeleri: List<PlaylistData.Items>?) :
    RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder>() {
    var oynatmaListeleri = tumOynatmaListeleri

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val tekSatirPlaylist = inflater.inflate(R.layout.tek_satir_playlist, parent, false)

        return PlaylistViewHolder(tekSatirPlaylist)
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        val oanOlusturulanSatir = oynatmaListeleri?.get(position)
        holder.setData(oanOlusturulanSatir, position)
    }

    override fun getItemCount(): Int {

        return oynatmaListeleri?.size ?: 0

    }

    inner class PlaylistViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        var tekSatirPlaylist = itemView as CardView

        var playListTitle = tekSatirPlaylist.tvListeBaslik
        var playListResim = tekSatirPlaylist.imgListeResim

        fun setData(oanOlusturulanSatir: PlaylistData.Items?, pos: Int) {
            playListTitle.text = oanOlusturulanSatir?.snippet?.title
            Picasso.get().load(oanOlusturulanSatir?.snippet?.thumbnails?.high?.url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground).into(playListResim)
        }

    }
}