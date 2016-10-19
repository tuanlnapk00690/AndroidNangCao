package com.lab8;


import com.bai01.R;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.TextView;

public class Notifi extends Activity {

	TextView textViewNotifi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notifi);
		
		textViewNotifi = (TextView) findViewById(R.id.textViewNotifi);
		
		int requestCode = getIntent().getExtras().getInt("requestCode");
		
		DongNotification(requestCode);
		
		textViewNotifi.setText("Đã đóng thông báo số: "+requestCode+"\n có thể dùng id này để hiển thị chi tiết");
	}
	
	protected void DongNotification(int notiID) {
		NotificationManager notiMa = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notiMa.cancel(notiID);
	}
}
