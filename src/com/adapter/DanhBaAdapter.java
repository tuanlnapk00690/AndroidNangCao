package com.adapter;

import java.util.List;

import com.AndroidNangCao.*;
import com.bai01.R;
import com.model.DanhBa;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DanhBaAdapter extends ArrayAdapter<DanhBa>{

	Activity context;
	int resource;
	List<DanhBa> objects;
	
	public DanhBaAdapter(Activity context, int resource, List<DanhBa> objects) {
		super(context, resource, objects);
		this.context=context;
		this.resource=resource;
		this.objects=objects;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater intflater = this.context.getLayoutInflater();
		View row = intflater.inflate(this.resource, null);

		TextView txtName = (TextView)row.findViewById(R.id.txtName);
		TextView txtPhone = (TextView)row.findViewById(R.id.txtPhone);
		ImageButton btnCall = (ImageButton)row.findViewById(R.id.btnCall);
		ImageButton btnSMS = (ImageButton)row.findViewById(R.id.btnSms);
		ImageButton btnDel = (ImageButton)row.findViewById(R.id.btnDel);
		ImageButton btnAddFav = (ImageButton)row.findViewById(R.id.btnAddFav);
		
		final DanhBa danhba = this.objects.get(position);
		
		txtName.setText(danhba.getName());
		txtPhone.setText(danhba.getPhone());
		
		btnAddFav.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getContext(), "Đã thêm "+danhba.getName()+" vào danh sách yêu thích", Toast.LENGTH_LONG).show();
			}
		});
		
		
		
		return row;
	}

}