package com.example.timernative

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val handler = Handler()
    val delay = 1L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler.postDelayed(object : Runnable {
            override fun run() {
                val calendar = Calendar.getInstance()
                timer.text =
                    calendar[Calendar.YEAR].toString() + "-" + calendar[Calendar.MONTH] + "-" + calendar[Calendar.DAY_OF_MONTH] + " " + calendar[Calendar.HOUR_OF_DAY] + ":" + calendar[Calendar.MINUTE] + ":" + calendar[Calendar.SECOND] + " " + calendar[Calendar.MILLISECOND]
                handler.postDelayed(this, delay)
            }
        }, delay)
    }
}
