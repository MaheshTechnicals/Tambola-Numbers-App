package com.havjibymt;

import android.app.*;
import android.os.*;
import android.webkit.*;

public class MainActivity extends Activity 
{
	private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript if needed
        webView.setWebViewClient(new WebViewClient());

		webView.loadUrl("https://tmbola.netlify.app/");
    }
}
