package com.application.vietlotterytwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.application.vietlotterytwo.Navigator.Companion.replaceFragment

class GuidePage : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_page)
        replaceFragment(GuideFragment(), supportFragmentManager)

        }
    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}
