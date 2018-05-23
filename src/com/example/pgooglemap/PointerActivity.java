package com.example.pgooglemap;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class PointerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pointer);
		int z=getIntent().getIntExtra("HI", 0);
		if(z==0)
		{Intent pIntentintent=new Intent(PointerActivity.this,DhakaActivity.class);
		 startActivity(pIntentintent);}
		else if(z==1) {
			Intent pIntentintent=new Intent(PointerActivity.this,CtgActivity.class);
			 startActivity(pIntentintent);	
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pointer, menu);
		return true;
	}

}
