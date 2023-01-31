package com.ashu.wolt_pt;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class InviteFriendsActivity extends AppCompatActivity {
    WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friends);



        webView = findViewById(R.id.my_webView5);

        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new Callback());
        webView.loadUrl("https://atifsoftwares.blogspot.com");
    }

    public class Callback extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view , String url)
        {
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        if(webView!=null && webView.canGoBack())
        {
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}