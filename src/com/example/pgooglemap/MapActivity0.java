package com.example.pgooglemap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MapActivity0 extends Activity {
     ImageButton places,tourism;
     
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_activity0);
		places=(ImageButton)findViewById(R.id.places);
		tourism=(ImageButton)findViewById(R.id.tourism);
		
		places.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			Intent placeIntent=new Intent(MapActivity0.this,MapActivity1.class);
			startActivity(placeIntent);
			}
		});
        tourism.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			Intent placeIntent=new Intent(MapActivity0.this,TourismActivity.class);
			startActivity(placeIntent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map_activity0, menu);
		return true;
	}

}
