package com.example.pgooglemap;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MapActivity1 extends Activity {
	ListView list;
    ArrayList<String> data;
    ArrayAdapter<String>adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_activity1);
		list=(ListView)findViewById(R.id.districtlistView);
	    data=new ArrayList<String>();
	    data.add("ঢাকা");
	    data.add("চট্টগ্রাম");
	    data.add("খুলনা");
	    data.add("রাজশাহী");
	    data.add("বরিশাল");
	    data.add("সিলেট");
	    data.add("রংপুর");
	    adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1 , data);	
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
			int a=arg2;
			Intent pointerIntent=new Intent(MapActivity1.this,PointerActivity.class);
			pointerIntent.putExtra("HI", a);
			startActivity(pointerIntent);
				
				
			
		    }});

		
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map_activity1, menu);
		return true;
	}
    }


