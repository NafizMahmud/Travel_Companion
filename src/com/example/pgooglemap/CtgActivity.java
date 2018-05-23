package com.example.pgooglemap;

import java.util.ArrayList;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CtgActivity extends Activity {
	ListView list;
    ArrayList<String> data;
    ArrayAdapter<String>adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ctg);
		list=(ListView)findViewById(R.id.ctgplaceslistview);
	    data=new ArrayList<String>();
	    data.add("২ নং গেইট");
	    data.add("আন্দরকিল্লা");
	    data.add("বহদ্দারহাট");
	    data.add("বহদ্দারহাট বাস টার্মিনাল");
	    data.add("চকবাজার");
	    data.add("চট্টগ্রাম কলেজ");
	    data.add("সি এন্ড বি ");
	    data.add("চুয়েট");
	    data.add("গশ্চিনয়াহাট");
	    data.add("জিইসি সার্কেল");
	    data.add("হাটহাজারী");
	    data.add("কালুরঘাট");
	    data.add("কাপ্তাই  লেক");
	    data.add("লালদিঘীর  পাঁড়");
	    data.add("মদুনাঘাট");
	    data.add("মোহরা");
	    data.add("মুরাদপুর");
	    data.add("নজুমিয়াহাট");
	    data.add("নিউ মার্কেট");
	    data.add("নোয়াপাড়া");
	    data.add("পাহাড়তলী,রাউজান");
	    data.add("প্রিমিয়ার ভার্সিটি");
	    data.add("কুয়াইশ");
	    data.add("রাঙ্গুনিয়া");
	    data.add("রাউজান");
	    data.add("রাউজান পাওয়ার প্লান্ট");
	    data.add("সানমার সিটি");
	    data.add("টাইগারপাস");
	    data.add("ঊনসত্তর পাড়া");
	    data.add("ওয়াসা");
	    data.add("ভাটিয়ারি");
	    
	  
	    adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1 , data);	
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				int z=arg2;
				Intent mintIntent=new Intent(CtgActivity.this,Map_Activity.class);
				mintIntent.putExtra("HI", z);
				startActivity(mintIntent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ctg, menu);
		return true;
	}

}
