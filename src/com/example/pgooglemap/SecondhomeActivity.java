package com.example.pgooglemap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class SecondhomeActivity extends Activity {
	ImageButton notesimageButton,cameraimageButton,converterimageButton,calculatorimageButton,backupimageButton,moreimageButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secondhome);
        notesimageButton=(ImageButton)findViewById(R.id.notesimageButton);
        cameraimageButton=(ImageButton)findViewById(R.id.cameraimageButton);
        converterimageButton=(ImageButton)findViewById(R.id.locationimageButton);
        calculatorimageButton=(ImageButton)findViewById(R.id.calculatorimageButton);
        backupimageButton=(ImageButton)findViewById(R.id.backupimageButton);
        moreimageButton=(ImageButton)findViewById(R.id.fmradioimageButton);
	   
        notesimageButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent noteintent = new Intent(SecondhomeActivity.this,MyActivity.class);
				startActivity(noteintent);	
			}
		});
	
	
	
	}

	
}
