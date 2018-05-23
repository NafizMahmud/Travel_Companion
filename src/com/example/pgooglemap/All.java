package com.example.pgooglemap;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class All extends Activity {
	
	ImageButton locationimageButton,paperimageButton,gmapimageButton,mediaimageButton,settingsimageButton,todoimageButton; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_activity);
		locationimageButton=(ImageButton)findViewById(R.id.locationimageButton);
		paperimageButton=(ImageButton)findViewById(R.id.paperimageButton);
		gmapimageButton=(ImageButton)findViewById(R.id.gmapimageButton);
		mediaimageButton=(ImageButton)findViewById(R.id.mediaimageButton);
		settingsimageButton=(ImageButton)findViewById(R.id.settingsimageButton);
	    todoimageButton=(ImageButton)findViewById(R.id.todoimageButton);
		
		locationimageButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
		/*		boolean status=isConnectingToInternet();
				
			    if(status)
				{
			    Intent mapintent=new Intent(All.this,MapActivity0.class);
			    startActivity(mapintent);
			    }	
				else
				{ Intent netintent=new Intent(android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS);
				startActivity(netintent);}
				
			*/
				Intent mapintent=new Intent(All.this,MapActivity0.class);
			    startActivity(mapintent);		
				
			}
		});
        
		
		paperimageButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent paperintent = new Intent(All.this,LogooActivity.class);
				startActivity(paperintent);	
			}
		});
        
		
		gmapimageButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent mapintent=new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_APP_BROWSER);
			    startActivity(mapintent);
			}
		});
        
		
		mediaimageButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent mediaintent = new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_APP_MUSIC);
				startActivity(mediaintent);	
			}
		});
        
		
		settingsimageButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent settingsIntent=new Intent(android.provider.Settings.ACTION_SETTINGS);
				startActivity(settingsIntent);
				
                
			}
		});
        
        
		todoimageButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent todointent=new Intent(All.this,MyActivity.class);
				startActivity(todointent);
			}
		}); }
		public boolean isConnectingToInternet(){
	        ConnectivityManager connectivity = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
	          if (connectivity != null)
	          {
	              NetworkInfo[] info = connectivity.getAllNetworkInfo();
	              if (info != null)
	                  for (int i = 0; i < info.length; i++)
	                      if (info[i].getState() == NetworkInfo.State.CONNECTED)
	                      {
	                          return true;
	                      }
	          }
	          return false;

	}
}