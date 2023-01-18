package com.example.layoutinflationkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var inflater = layoutInflater
        // var inflater2 = LayoutInflater.from(this)
        // var inflater3 = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
       /* var view = inflater.inflate(R.layout.layout_text_view, null)
        rootLayout.addView(view)
        Log.e("INFLATION", ""+ view.parent) // rootLayout
        Log.e("INFLATION", ""+ view.layoutParams) // FrameLayout*/
/*

        var view = inflater.inflate(R.layout.layout_text_view, rootLayout)
        Log.e("INFLATION", ""+ view.parent) //content
        Log.e("INFLATION", ""+ view.layoutParams) // FrameLayout
*/
/*

        var view = inflater.inflate(R.layout.layout_text_view, icerdekiLayout, true)
        Log.e("INFLATION", ""+ view.parent) //rootLayout
        Log.e("INFLATION", ""+ view.layoutParams) // FrameLayout
*/

        var view = inflater.inflate(R.layout.layout_text_view, icerdekiLayout, false)
        Log.e("INFLATION", ""+ view.parent) //null
        Log.e("INFLATION", ""+ view.layoutParams) // linearLayout
        icerdekiLayout.addView(view)
    }
}