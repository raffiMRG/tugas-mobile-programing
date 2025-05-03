package com.example.projectawal_mraffigumilang;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class WebViewLayout extends AppCompatActivity {
private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.statusBarColor));
        }

        webView = findViewById(R.id.webView);


        // mengatur webview
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://github.com/raffiMRG");
    }

    @Override
    public void onBackPressed() {
        if (webView != null && webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}