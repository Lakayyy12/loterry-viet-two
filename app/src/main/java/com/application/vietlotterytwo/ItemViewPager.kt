package com.application.vietlotterytwo

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ItemViewPager : AppCompatActivity() {

    private var back : ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_view_pager)

        back = findViewById(R.id.back)

        back?.setOnClickListener {
            onBackPressed()
        }
    }
}
