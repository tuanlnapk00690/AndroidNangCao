package com.lab6;


import com.bai01.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Trang_nhan_thong_tin extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hienthi_thongbao);
		TextView ten = (TextView)findViewById(R.id.txtBundle);
		TextView DC = (TextView)findViewById(R.id.txtDiachi);
		TextView TL = (TextView)findViewById(R.id.txtTrongluong);
		Button btnBack = (Button)findViewById(R.id.btnBackLab06);
		try {
			
			
			String hoTen = getIntent().getExtras().getString("hoTen");
			String diaChi = getIntent().getExtras().getString("diaChi");
			String trongLuong = getIntent().getExtras().getString("trongLuong");
			
			ten.setText(hoTen);
			DC.setText(diaChi);
			TL.setText(trongLuong);
			
			btnBack.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(getApplicationContext(),Lab6_Activity.class);
					startActivity(intent);
				}
			});
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(), e.getMessage().toString(), Toast.LENGTH_LONG).show();
			TL.setText(e.getMessage());
		}
		
		
		
		
	}
}
