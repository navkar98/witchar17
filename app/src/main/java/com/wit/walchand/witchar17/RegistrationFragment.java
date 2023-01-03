package com.wit.walchand.witchar17;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegistrationFragment extends android.support.v4.app.Fragment  {

    View v;
    WebView webView;
    public RegistrationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_registration, container, false);
        webView = (WebView)v.findViewById(R.id.ourBrowser);
        webView.loadUrl("https://script.google.com/macros/s/AKfycbyyO1n9eEXAs8ZtCS6R21uoPwsr5C9Y3SHBLogzRb3BxKTZ1qsY/exec");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        return v;
    }

}