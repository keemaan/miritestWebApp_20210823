package com.example.miritestwebapp_20210823

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val mWebView : WebView = findViewById(R.id.webView)
        val mWebSettings = mWebView.getSettings()

        mWebView.setWebViewClient(WebViewClient())
        mWebView.settings.textZoom = 100
        mWebSettings.setJavaScriptEnabled(true)
        mWebSettings.setLoadWithOverviewMode(true)
        mWebSettings.setUseWideViewPort(true)
        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN)
        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE)
        mWebSettings.setDomStorageEnabled(true)
        mWebView.loadUrl("http://miritest.net")
    }
    override fun onBackPressed() {
//        super.onBackPressed()
    }
}