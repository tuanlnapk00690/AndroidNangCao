package com.lab8;

import java.util.HashMap;
import java.util.Random;

import com.bai01.R;
import com.bai01.R.id;
import com.bai01.R.layout;
import com.bai01.R.menu;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Lab8_Activity extends Activity {

	Button btnTao,btnDong;
	int notiID;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab8);
		
		Button btnTao = (Button)findViewById(R.id.btnTao);
		Button btnDong = (Button) findViewById(R.id.btnDong);
		
		btnTao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TaoNotification();
			}
		});
		btnDong.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DongNotification();
			}
		});
		
	}
	
	

	protected void DongNotification() {
		NotificationManager notifi = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notifi.cancelAll();
	}
	protected void TaoNotification() {
		
		notiID = HamTaoMa();
		Notification.Builder notifi = new Notification.Builder(this);
		notifi.setSmallIcon(R.drawable.favourite);
		notifi.setContentTitle("Thông báo số "+notiID);
		notifi.setContentText("Nhấn để thêm vào mục yêu thích");
		
		Intent intent = new Intent(this,Notifi.class);
		intent.putExtra("requestCode", notiID);
		PendingIntent pendingintent = PendingIntent.getActivity(this, notiID, intent, PendingIntent.FLAG_UPDATE_CURRENT);
		
		notifi.setContentIntent(pendingintent);
		Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		notifi.setSound(uri);
		
		NotificationManager notiMa = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notiMa.notify(notiID,notifi.build());
	}

	private int HamTaoMa() {
		Random random = new Random();
		int ma = random.nextInt();
		return ma;
	}
	

}
