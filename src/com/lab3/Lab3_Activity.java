package com.lab3;

import com.bai01.R;
import com.bai01.R.id;
import com.bai01.R.layout;
import com.bai01.R.menu;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Lab3_Activity extends Activity {

	//tạo broadcast receiver 
	BroadcastReceiver receiver = new BroadcastReceiver(){

		@Override
		public void onReceive(Context context, Intent intent) {
			ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
			if(connectivityManager.getActiveNetworkInfo()!=null){
				btnLogin.setEnabled(true);
				Toast.makeText(getBaseContext(),"wifi True", Toast.LENGTH_LONG).show();
			}
			else{
				btnLogin.setEnabled(false);
				Toast.makeText(getBaseContext(),"wifi False", Toast.LENGTH_LONG).show();
			}
		}
		
	};
	
	Button btnLogin;
	TextView textViewDK;  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab3);
		btnLogin=(Button) findViewById(R.id.btnLogin);
		textViewDK= (TextView) findViewById(R.id.textViewDK);
		
		textViewDK.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		IntentFilter filterWifi = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
		registerReceiver(receiver, filterWifi);
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		if(receiver!=null)
			unregisterReceiver(receiver);
	}
}
