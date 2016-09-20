package com.AndroidNangCao;

import com.bai01.R;
import com.lab1.Lab1_Activity;
import com.lab2.Lab2_Activity;
import com.lab3.Lab3_Activity;
import com.lab4.Lab4_Activity;
import com.lab5.Lab5_Activity;
import com.lab6.Lab6_Activity;
import com.lab7.Lab7_Activity;
import com.lab8.Lab8_Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btnLab1, btnLab2, btnLab3, btnLab4, btnLab5, btnLab6, btnLab7, btnLab8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button lab1 = (Button) findViewById(R.id.btnLab1);
		Button lab2 = (Button) findViewById(R.id.btnLab2);
		Button lab3 = (Button) findViewById(R.id.btnLab3);
		Button lab4 = (Button) findViewById(R.id.btnLab4);
		Button lab5 = (Button) findViewById(R.id.btnLab5);
		Button lab6 = (Button) findViewById(R.id.btnLab6);
		Button lab7 = (Button) findViewById(R.id.btnLab7);
		Button lab8 = (Button) findViewById(R.id.btnLab8);
		
		lab1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab1_Activity.class);
				startActivity(intent);
			}
		});
		
		lab2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab2_Activity.class);
				startActivity(intent);
			}
		});
		
		lab3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab3_Activity.class);
				startActivity(intent);
			}
		});
		
		lab4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab4_Activity.class);
				startActivity(intent);
			}
		});
		
		lab5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab5_Activity.class);
				startActivity(intent);
			}
		});
		
		lab6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab6_Activity.class);
				startActivity(intent);
			}
		});
		
		lab7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab7_Activity.class);
				startActivity(intent);
			}
		});
		
		lab8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab8_Activity.class);
				startActivity(intent);
			}
		});
		
	}

	
}
