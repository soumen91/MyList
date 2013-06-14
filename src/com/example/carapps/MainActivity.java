package com.example.carapps;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ArrayList<UserBean> arr = new ArrayList<UserBean>();
	private MyAdapter myadp;
	private ListView list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		list=(ListView)findViewById(R.id.listView1);
		
		UserBean b1 = new UserBean("A", "a1");
		UserBean c1 = new UserBean("B", "b1");
		UserBean d1 = new UserBean("c", "C1");
		UserBean e1 = new UserBean("D", "d1");
		UserBean f1 = new UserBean("E", "e1");
		arr.add(b1);
		arr.add(c1);
		arr.add(d1);
		arr.add(e1);
		arr.add(f1);
		myadp=new MyAdapter(getApplicationContext(), R.layout.row, arr);
		list.setAdapter(myadp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
