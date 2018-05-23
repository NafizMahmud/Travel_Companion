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

public class DhakaActivity extends Activity {
	ListView list;
    ArrayList<String> data;
    ArrayAdapter<String>adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dhaka);
		list=(ListView)findViewById(R.id.dhakaplaceslistview);
	    data=new ArrayList<String>();
	    data.add("বসুন্ধরা আবাসিক");
	    data.add("বসুন্ধরা সিটি");
	    data.add("বুয়েট");
	    data.add("ধানমন্ডি");
	    data.add("ঢাকা বিশ্ববিদ্যালয়");
	    data.add("হযরত শাহজালাল আন্তজাতিক বিমানবন্দর");
	    data.add("যমুনা ফিউচার পার্ক");
	    data.add("কমলাপুর রেলস্টেশন");
	    data.add("মিরপুর");
	    data.add("মোহাম্মদপুর");
	    data.add("মতিঝিল");
	    data.add("সাভার");
	    data.add("উত্তরা");
	    
	    
	    adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1 , data);	
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				int z=arg2+200;
				Intent mintIntent=new Intent(DhakaActivity.this,Map_Activity.class);
				mintIntent.putExtra("HI", z);
				startActivity(mintIntent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dhaka, menu);
		return true;
	}

}
