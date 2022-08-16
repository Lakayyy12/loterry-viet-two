package com.application.vietlotterytwo

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GuideCon : AppCompatActivity() {

    private var title: TextView? = null
    private var content: TextView? = null
    private var cl1: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_con)

        content?.visibility = View.VISIBLE
        title = findViewById(R.id.title)
        content = findViewById(R.id.content)

        title?.text = intent.getStringExtra("title")
        content?.text = intent.getStringExtra("content")

        cl1 = findViewById(R.id.cl1)
        cl1?.setOnClickListener{
            onBackPressed()
        }
    }
}