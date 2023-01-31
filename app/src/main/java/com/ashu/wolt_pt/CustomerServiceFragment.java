package com.ashu.wolt_pt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;


public class CustomerServiceFragment extends Fragment {



    public CustomerServiceFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_customer_service, container, false);

        WebView webView = (WebView)v.findViewById(R.id.my_webViewRecharge);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://atifsoftwares.blogspot.com");

        return v;
    }





}
