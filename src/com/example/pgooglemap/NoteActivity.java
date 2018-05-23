package com.example.pgooglemap;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NoteActivity extends Activity {

	
	Button bn,bl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_note);

	Intent in = getIntent();
	bn = (Button) findViewById(R.id.bn);
	bl = (Button) findViewById(R.id.bl);
	bl.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent in = new Intent(NoteActivity.this,MyActivity.class);
			startActivity(in);
			
		}
	});
	
	
	}


}
