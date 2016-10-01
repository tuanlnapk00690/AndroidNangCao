package com.lab4;

import com.bai01.R;
import com.bai01.R.id;
import com.bai01.R.layout;
import com.bai01.R.menu;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lab4_Activity extends Activity {

	Button btnLoginDialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab4);
		
		btnLoginDialog = (Button) findViewById(R.id.btnLoginDialog);
		
		btnLoginDialog.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialogLoginForm();
			}
		});
	}
	
	Dialog dialogLogin;
	public void dialogLoginForm(){
		dialogLogin = new Dialog(Lab4_Activity.this);
		dialogLogin.setContentView(R.layout.activity_login);
		dialogLogin.setTitle("Đăng nhập");
		
		EditText txtUserLogin = (EditText)dialogLogin.findViewById(R.id.txtUserlogin);
		EditText txtPassLogin = (EditText)dialogLogin.findViewById(R.id.txtPassLogin);
		Button btnLoginDialog = (Button)dialogLogin.findViewById(R.id.btnLoginDialog);
		Button btnThoatLogin = (Button)dialogLogin.findViewById(R.id.btnThoatLogin);
		
		btnLoginDialog.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialogLogin.dismiss();
			}
		});
		
		btnThoatLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialogLogin.dismiss();
			}
		});
		
		dialogLogin.show();
		
	}
}
