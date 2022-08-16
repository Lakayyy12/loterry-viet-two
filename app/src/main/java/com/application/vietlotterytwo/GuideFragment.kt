package com.application.vietlotterytwo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.application.vietlotterytwo.Navigator.Companion.openPage

class GuideFragment : Fragment(), View.OnClickListener {

    private var g1: TextView? = null
    private var g2: TextView? = null
    private var g3: TextView? = null
    private var g4: TextView? = null
    private var g5: TextView? = null
    private var g6: TextView? = null
    private var g7: TextView? = null
    private var g8: TextView? = null
    private var g9: TextView? = null
    private var g10: TextView? = null

    private var getView: View? = null

    private var btnB : Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
       getView = inflater.inflate(R.layout.fragment_guide, container, false)
        initComponents()
        initListener()
        return getView
    }

    private fun initComponents() {
        g1 = getView?.findViewById(R.id.gd1)
        g2 = getView?.findViewById(R.id.gd2)
        g3 = getView?.findViewById(R.id.gd3)
        g4 = getView?.findViewById(R.id.gd4)
        g5 = getView?.findViewById(R.id.gd5)
        g6 = getView?.findViewById(R.id.gd6)
        g7 = getView?.findViewById(R.id.gd7)
        g8 = getView?.findViewById(R.id.gd8)
        g9 = getView?.findViewById(R.id.gd9)
        g10 = getView?.findViewById(R.id.gd10)
        btnB = getView?.findViewById(R.id.btnB)
    }

    private fun initListener() {
        g1?.setOnClickListener(this)
        g2?.setOnClickListener(this)
        g3?.setOnClickListener(this)
        g4?.setOnClickListener(this)
        g5?.setOnClickListener(this)
        g6?.setOnClickListener(this)
        g7?.setOnClickListener(this)
        g8?.setOnClickListener(this)
        g9?.setOnClickListener(this)
        g10?.setOnClickListener(this)
        btnB?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.gd1 -> {
                openPage(context,
                    GuideCon::class.java,
                    g1?.text.toString(),
                    "${getString(R.string.bgt1)} ${getString(R.string.bg1)}")
            }
            R.id.gd2 -> {
                openPage(context,
                    GuideCon::class.java,
                    g2?.text.toString(),
                    "${getString(R.string.bgt2)} ${getString(R.string.bg2)}")
            }
            R.id.gd3 -> {
                openPage(context,
                    GuideCon::class.java,
                    g3?.text.toString(),
                    "${getString(R.string.bgt3)} ${getString(R.string.bg3)}")
            }
            R.id.gd4 -> {
                openPage(context,
                    GuideCon::class.java,
                    g4?.text.toString(),
                    "${getString(R.string.bgt4)} ${getString(R.string.bg4)}")
            }
            R.id.gd5 -> {
                openPage(context,
                    GuideCon::class.java,
                    g5?.text.toString(),
                    "${getString(R.string.bgt5)} ${getString(R.string.bg5)}")
            }
            R.id.gd6 -> {
                openPage(context,
                    GuideCon::class.java,
                    g6?.text.toString(),
                    "${getString(R.string.bgt6)} ${getString(R.string.bg6)}")
            }
            R.id.gd7 -> {
                openPage(context,
                    GuideCon::class.java,
                    g7?.text.toString(),
                    "${getString(R.string.bgt7)} ${getString(R.string.bg7)}")
            }
            R.id.gd8 -> {
                openPage(context,
                    GuideCon::class.java,
                    g8?.text.toString(),
                    "${getString(R.string.bgt8)} ${getString(R.string.bg8)}")
            }
            R.id.gd9 -> {
                openPage(context,
                    GuideCon::class.java,
                    g9?.text.toString(),
                    "${getString(R.string.bgt9)} ${getString(R.string.bg9)}")
            }
            R.id.gd10 -> {
                openPage(context,
                    GuideCon::class.java,
                    g10?.text.toString(),
                    "${getString(R.string.bgt10)} ${getString(R.string.bg10)}")
            }
            R.id.btnB -> activity?.onBackPressed()
        }
    }
}


