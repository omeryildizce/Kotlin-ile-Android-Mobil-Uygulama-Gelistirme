package com.example.youtubeplaylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.*

class MainActivity : AppCompatActivity() {
    val API_KEY = "AIzaSyBn1k9Trkjfkykgt54SAwpRfFGNw"
    val CHANNEL_ID = "UC_x5XG1OV2P6uZZ5FSM9Ttw"
    var gelenVeri: PlaylistData? = null
    var oynatmaListeleri: List<PlaylistData.Items>? = null
    var myAdapter: PlaylistAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiInterface = ApiClient.client?.create(ApiInterface::class.java)
        val apiCall = apiInterface?.tumListeleriGetir(CHANNEL_ID, API_KEY, 25)
        apiCall?.enqueue(object : Callback<PlaylistData> {
            override fun onResponse(call: Call<PlaylistData>, response: Response<PlaylistData>) {
                Log.e("BASARILI", "" + call.request().url().toString())
                gelenVeri = response.body()
                oynatmaListeleri = gelenVeri?.items
                myAdapter = PlaylistAdapter(oynatmaListeleri)
                recyclerviewPlaylist.adapter = myAdapter
                val myLayoutManager =
                    LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
                recyclerviewPlaylist.layoutManager = myLayoutManager
                supportActionBar?.setSubtitle("Toplam Liste :" + oynatmaListeleri?.size)
                Log.e("BASARILI", "TOPLAM LİSTE SAYISI" + gelenVeri?.pageInfo?.totalResults)
            }

            override fun onFailure(call: Call<PlaylistData>, t: Throwable) {
                Log.e("HATA", "" + t.printStackTrace())
            }
        })
    }
}