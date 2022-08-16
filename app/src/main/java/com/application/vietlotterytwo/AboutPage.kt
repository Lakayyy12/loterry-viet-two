package com.application.vietlotterytwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_guide.*

class AboutPage : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Details>

    private lateinit var imageId: Array<Int>
    private lateinit var heading: Array<String>
    private lateinit var briefNews: Array<String>


    private var btnBb: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        imageId = arrayOf(R.drawable.logo2, R.drawable.logo2, R.drawable.logo2)
        heading = arrayOf(getString(R.string.abtt1),
            getString(R.string.abtt2),
            getString(R.string.abtt3))
        briefNews = arrayOf(
            getString(R.string.abt1),
            getString(R.string.abt2),
            getString(R.string.abt3))
        newRecyclerView = findViewById(R.id.recyclerItems)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Details>()
        getUserdata()

        btnBb = findViewById(R.id.btnBb)
        btnBb?.setOnClickListener {
            onBackPressed()
        }
    }
        private fun getUserdata() {

            for (i in imageId.indices) {

                val news = Details(imageId[i], heading[i], briefNews[i])
                newArrayList.add(news)
            }
            val adapter = MyAdapter2(newArrayList)
            newRecyclerView.adapter = adapter
        }
    }
