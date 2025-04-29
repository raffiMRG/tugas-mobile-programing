package com.example.projectawal_mraffigumilang;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewLayout extends AppCompatActivity {
private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_web_view);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        webView = findViewById(R.id.webView);


        // mengatur webview
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://lld.unpam.ac.id/?d=1");
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