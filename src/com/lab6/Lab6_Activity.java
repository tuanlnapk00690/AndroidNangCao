package com.lab6;

import com.bai01.R;
import com.bai01.R.id;
import com.bai01.R.layout;
import com.bai01.R.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Lab6_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6);
		
		final EditText tenGoi = (EditText)findViewById(R.id.editText);
		final EditText diaChi = (EditText)findViewById(R.id.editTextDiaChi);
		final EditText trongLuong = (EditText)findViewById(R.id.editTextTrongluong);
		
		Button btnSend = (Button)findViewById(R.id.btnSend);
		
		btnSend.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Trang_nhan_thong_tin.class);
				intent.putExtra("hoTen", tenGoi.getText().toString());
				intent.putExtra("diaChi", diaChi.getText().toString());
				intent.putExtra("trongLuong", trongLuong.getText().toString());
				startActivity(intent);
				
			}
		});
		
	}
	
	
}
