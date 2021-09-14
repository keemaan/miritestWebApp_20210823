package com.miritest.miritestwebapp_20210823

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()
        handler.postDelayed(
                {
                    val myIntent = Intent( this, WebViewActivity::class.java)
                    startActivity(myIntent)
                }, 1200)

    }
    override fun onPause() {
        super.onPause()
        finish()
    }

}