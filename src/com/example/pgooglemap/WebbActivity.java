package com.example.pgooglemap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;


public class WebbActivity extends Activity {

	   WebView web;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webb);
		
		web = (WebView) findViewById(R.id.webView1);
		web.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
		web.getSettings().setBuiltInZoomControls(true);

		   int  i = getIntent().getIntExtra("ANIK",0);
		   
		   if(i ==0)
			{
				
				web.loadUrl("http://www.prothom-alo.com");
			}
		
		   
		   else if(i ==1)
			{
				
				web.loadUrl("http://www.kalerkantho.com");
			}
		
		   
		   else if(i ==2)
					{
						
						web.loadUrl("http://www.ctgmancha.com ");
					}
				
		   else if(i ==3)
					{
						
						web.loadUrl("http://www.ittefaq.com.bd");
					}
				
		   else if(i ==4)
					{
						
						web.loadUrl("http://www.dailynayadiganta.com");
					}
				
		   else if(i ==5)
					{
						
						web.loadUrl("http://www.24livenewspaper.com");
					}
				
		   else if(i ==6)
					{
						
						web.loadUrl("http://www.dainikpurbokone.net");
					}
				
		   else if(i ==7)
					{
						
						web.loadUrl("http://www.dainikazadi.org");
					}
				
		   else if(i ==8)
					{
						
						web.loadUrl("http://http://www.now-bd.com/bdpratidin");
					}
				
		   else if(i ==9)
					{
						
	
			   web.loadUrl("http://www.amadershomoys.com");
					}
				
		   else if(i ==10)
					{
						
						web.loadUrl("http://www.daily-sun.com");
					}
				
		   else if(i ==11)
					{
						
						web.loadUrl("http://http://www.jjdin.com/");
					}
				
	
		   
		   
		   
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.webb, menu);
		return true;
	}

}
