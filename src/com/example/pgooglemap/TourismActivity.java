package com.example.pgooglemap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class TourismActivity extends Activity {
    ImageButton coxsbazar,kagrachori,kaptai,nilgiri,sundarban,sylhet;

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tourism);
		coxsbazar=(ImageButton)findViewById(R.id.coxsbazarimageButton);
		kagrachori=(ImageButton)findViewById(R.id.kagrachoriimageButton);
		kaptai=(ImageButton)findViewById(R.id.kaptaiimageButton);
		nilgiri=(ImageButton)findViewById(R.id.nilgiriimageButton);
	    sundarban=(ImageButton)findViewById(R.id.sundarbanimageButton);
		sylhet=(ImageButton)findViewById(R.id.sylhetimageButton);

		coxsbazar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			Intent mapIntent=new Intent(TourismActivity.this,Map_Activity.class);
			mapIntent.putExtra("HI", 101);
			startActivity(mapIntent);
			}
		});
        kagrachori.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			Intent mapIntent=new Intent(TourismActivity.this,Map_Activity.class);
			mapIntent.putExtra("HI", 102);
			startActivity(mapIntent);
			}
		});
        kaptai.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
	Intent mapIntent=new Intent(TourismActivity.this,Map_Activity.class);
	mapIntent.putExtra("HI", 103);
	startActivity(mapIntent);
	}
        });
       
       nilgiri.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
	Intent mapIntent=new Intent(TourismActivity.this,Map_Activity.class);
	mapIntent.putExtra("HI", 104);
	startActivity(mapIntent);
	}
});

       sundarban.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
	Intent mapIntent=new Intent(TourismActivity.this,Map_Activity.class);
	mapIntent.putExtra("HI", 105);
	startActivity(mapIntent);
	}
}); 
       
       sylhet.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			Intent mapIntent=new Intent(TourismActivity.this,Map_Activity.class);
			mapIntent.putExtra("HI", 106);
			startActivity(mapIntent);
			}
		});

   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tourism, menu);
		return true;
	}

}
