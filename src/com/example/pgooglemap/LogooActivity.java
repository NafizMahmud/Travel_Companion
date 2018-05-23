package com.example.pgooglemap;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;


public class LogooActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logoo);
	
	setListAdapter(new MyArrayAdapter(this,android.R.layout.simple_list_item_1,R.id.textView1, getResources().getStringArray(R.array.BdNews)));
	
	 ListView i = getListView();
     i.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			int Anik = arg2;
			Intent in = new Intent(LogooActivity.this,WebbActivity.class);
			in.putExtra("ANIK", Anik);
			startActivity(in);
		}
	});
   
	
	
	
	}

	
	private class MyArrayAdapter extends ArrayAdapter<String> 
	{

		

		public MyArrayAdapter(Context context, int resource,
				int textViewResourceId, String[] objects) {
			super(context, resource, textViewResourceId, objects);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public View getView(int po, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View row = inflater.inflate(R.layout.image, parent,false);
			String[] items = getResources().getStringArray(R.array.BdNews);
			
			ImageView im = (ImageView) row.findViewById(R.id.imageView1);
			TextView tv = (TextView) row.findViewById(R.id.textView1);
			
		
			if(items[po].equals("Prothom alo"))
			{
				
				im.setImageResource(R.drawable.x);
			}
			
			
			
			if(items[po].equals("Kaler Konto"))
			{
				
				im.setImageResource(R.drawable.as);
			}
			
			
			
			if(items[po].equals("C"))
			{
				
				im.setImageResource(R.drawable.bn);
			}
			
			
			
			if(items[po].equals("E"))
			{
				
				im.setImageResource(R.drawable.d);
			}
			
			
			
			if(items[po].equals("N"))
			{
				
				im.setImageResource(R.drawable.dsa);
			}
			
			
			
			if(items[po].equals("B"))
			{
				
				im.setImageResource(R.drawable.a);
			}
			
			
			
			if(items[po].equals("P"))
			{
				
				im.setImageResource(R.drawable.fd);
			}
			
			
			
			if(items[po].equals("A"))
			{
				
				im.setImageResource(R.drawable.index);
			}
			
			
			
			if(items[po].equals("Ba"))
			{
				
				im.setImageResource(R.drawable.q);
			}
			
			
			
			if(items[po].equals("AS"))
			{
				
				im.setImageResource(R.drawable.r);
			}
			
			
			
			if(items[po].equals("DS"))
			{
				
				im.setImageResource(R.drawable.sd);
			}
			
			
			
			if(items[po].equals("J"))
			{
				
				im.setImageResource(R.drawable.da);
			}
			
			
			
			if(items[po].equals("I"))
			{
				
				im.setImageResource(R.drawable.ds);
			}
			
			
			
			if(items[po].equals("S"))
			{
				
				im.setImageResource(R.drawable.hj);
			}
			
			
			
			if(items[po].equals("Purb"))
			{
				
				im.setImageResource(R.drawable.g);
			}
			
			
			
			if(items[po].equals("Jo"))
			{
				
				im.setImageResource(R.drawable.xz);
			}
			
			
			
			if(items[po].equals("M"))
			{
				
				im.setImageResource(R.drawable.ass);
			}
			
			
			
			if(items[po].equals("BN"))
			{
				
				im.setImageResource(R.drawable.s);
			}
			
			
			
			if(items[po].equals("UNB"))
			{
				
				im.setImageResource(R.drawable.asss);
			}
			
			
			
			if(items[po].equals("V"))
			{
				
				im.setImageResource(R.drawable.hg);
			}
			
			
			
			if(items[po].equals("L"))
			{
				
				im.setImageResource(R.drawable.sda);
			}
			
			
			
			if(items[po].equals("So"))
			{
				
				im.setImageResource(R.drawable.uj);
			}
			
			
			
			if(items[po].equals("Sokal"))
			{
				
				im.setImageResource(R.drawable.rt);
			}
			
			
			
			if(items[po].equals("CO"))
			{
				
				im.setImageResource(R.drawable.j);
			}
			
			
	
			
			return row;
		}//getview()......................

	
	}//Inner class.................



}
