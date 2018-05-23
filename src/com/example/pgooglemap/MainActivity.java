package com.example.pgooglemap;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.view.PagerAdapter;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	 ImageView image;
	    AnimationDrawable anime;
	    TextView textView1,textView2;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
		     textView1=(TextView)findViewById(R.id.textView1);
		     textView2=(TextView)findViewById(R.id.textView2);
			 image=(ImageView) findViewById(R.id.imageView1);
			 image.setImageResource(R.drawable.frameanimation);
			 anime=(AnimationDrawable)image.getDrawable();
			 anime.start();
		    Thread logoTimer = new Thread() {
	            public void run(){
	                try
	                {sleep(5000);
	                 Intent intent = new Intent(MainActivity.this, All.class);
	                 startActivity(intent);} 
	                catch (InterruptedException e) 
	                { e.printStackTrace();}
	                finally
	                {finish();}}};
	       logoTimer.start();
		   
		
		
		}
  
 
    
}
