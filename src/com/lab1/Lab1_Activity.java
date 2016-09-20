package com.lab1;

import com.bai01.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Lab1_Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab1);
		
		String doc = "https://drive.google.com/file/d/0B5T9OA3s5A52ZGE2NFgzYnpkNlk/view?usp=sharing";
		
		WebView wv = (WebView) findViewById(R.id.webView);
		
		wv.getSettings().setJavaScriptEnabled(true); 
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
		wv.loadUrl(doc);
	}
}
