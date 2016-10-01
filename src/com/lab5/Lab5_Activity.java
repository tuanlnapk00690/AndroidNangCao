package com.lab5;

import java.util.ArrayList;

import com.adapter.DanhBaAdapter;
import com.bai01.R;
import com.bai01.R.id;
import com.bai01.R.layout;
import com.bai01.R.menu;
import com.model.DanhBa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Spinner;

public class Lab5_Activity extends Activity {

	Spinner spinnerDS;
	ListView listViewDanhba;
	ArrayList<DanhBa> danhsachdanhba;
	DanhBaAdapter danhbaadapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab5);
		
		listViewDanhba = (ListView) findViewById(R.id.listViewDanhba);
		danhsachdanhba = new ArrayList<DanhBa>();
		danhsachdanhba.add(new DanhBa (1,"An","01234567890"));
		danhsachdanhba.add(new DanhBa (2,"Bình","0969789789"));
		danhsachdanhba.add(new DanhBa (3,"Chi","0987654321"));
		danhsachdanhba.add(new DanhBa (4,"Dũng","01676554556"));
		danhsachdanhba.add(new DanhBa (5,"Giang","01645115045"));
		danhsachdanhba.add(new DanhBa (6,"Hùng","0916022001"));
		danhsachdanhba.add(new DanhBa (7,"Hưng","01645115045"));
		danhsachdanhba.add(new DanhBa (8,"Hà","01645115045"));
		danhsachdanhba.add(new DanhBa (9,"Kiên","01645115045"));
		danhsachdanhba.add(new DanhBa (10,"Linh","0918531983"));
		danhsachdanhba.add(new DanhBa (11,"Mỹ","01645115045"));
		danhsachdanhba.add(new DanhBa (12,"Nhân","0918601991"));
		danhsachdanhba.add(new DanhBa (13,"Phương","01645115045"));
		danhsachdanhba.add(new DanhBa (14,"Quỳnh","0918601991"));
		danhsachdanhba.add(new DanhBa (15,"Sa","01645115045"));
		danhsachdanhba.add(new DanhBa (16,"Tuấn","01645115045"));
		danhsachdanhba.add(new DanhBa (17,"Tú","0916022001"));
		danhsachdanhba.add(new DanhBa (18,"Tâm","0918531983	"));
		danhsachdanhba.add(new DanhBa (19,"Vy","01645115045"));
		danhsachdanhba.add(new DanhBa (20,"Yến","0918601991"));
		
		danhbaadapter = new DanhBaAdapter(Lab5_Activity.this,R.layout.item,danhsachdanhba);
		listViewDanhba.setAdapter(danhbaadapter);
	}

}
