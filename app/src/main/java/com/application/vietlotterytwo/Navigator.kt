package com.application.vietlotterytwo

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_guide_page.*

class Navigator {

    companion object {
        fun replaceFragment(fragment: Fragment, fragmentManager: FragmentManager) {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment)
            fragmentTransaction.commit()
        }


    fun openPage(
        context: Context?,
        className: Class<*>) {

        val intent = Intent(context, className)
        context?.startActivity(intent)
    }
    fun openPage(
        context: Context?,
        className: Class<*>,
        title: String,
        content: String) {

        val intent = Intent(context, className)
        intent.putExtra("title", title)
        intent.putExtra("content", content)
        context?.startActivity(intent)
        }
    }
}
