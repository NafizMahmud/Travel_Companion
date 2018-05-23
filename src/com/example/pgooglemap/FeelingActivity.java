package com.example.pgooglemap;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FeelingActivity extends Activity {
	
	Button w,t,h,l;
	TextView mw,mt,mh,ml;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feeling);
	
	 Intent in = getIntent();
	
	
	w =  (Button) findViewById(R.id.Buttonfeewell);
	t =  (Button) findViewById(R.id.Buttonfeetired);
	h =  (Button) findViewById(R.id.ButtonfeeHonest);
	l =  (Button) findViewById(R.id.buttonfeeLove);
	mw = (TextView) findViewById(R.id.Textfeemediwell);
	mt = (TextView) findViewById(R.id.TextViewfeemeditired);
	mh = (TextView) findViewById(R.id.TextViewfeemedihonest);
	ml = (TextView) findViewById(R.id.textViewmediLove);
	
	w.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Random r = new Random();
			int an = r.nextInt(100);
			
			if(an<50&&an>0)
			{
				mw.setText(an+"% , Oh,you are feeling not well");	
			}
			else if(an<80 && an>=50)
			{
				mw.setText(an+"% , You are feeling better");	
			}
			else if(an<100 && an>=80)
			{
				mw.setText(an+"% , You are feeling awesome");	
			}
			else if(an==100)
			{
				mw.setText(an+"% , Woh..Woh..You are Happiest person ever");	
			}
			else if(an==0)
			{
				mw.setText(an+"% , Opps..You are Going to Die");	
			}
		}
	});
	
	t.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Random r1 = new Random();
			int an1 = r1.nextInt(100);
			
			if(an1<50&&an1>0)
			{
				mt.setText(an1+"% , Oh,you are feeling fresh");	
			}
			else if(an1<80 && an1>=50)
			{
				mt.setText(an1+"% , You are feeling much tired");	
			}
			else if(an1<100 && an1>=80)
			{
				mt.setText(an1+"% , You are feeling Tired!!!");	
			}
			else if(an1==100)
			{
				mt.setText(an1+"% , Woh..Woh..You are Gone");	
			}
			else if(an1==0)
			{
				mt.setText(an1+"% , Opps..You are ever Fresh Men");	
			}
			
		}
	});
	
	h.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Random r2 = new Random();
			int an2 = r2.nextInt(100);
			
			if(an2<50&&an2>0)
			{
				mh.setText(an2+"% , Oh,you are little bit honest");	
			}
			else if(an2<80 && an2>=50)
			{
				mh.setText(an2+"% , You are better honest");	
			}
			else if(an2<100 && an2>=80)
			{
				mh.setText(an2+"% , You are a Honest person ever");	
			}
			else if(an2==100)
			{
				mh.setText(an2+"% , Woh..Woh..Honesty makes you great");	
			}
			else if(an2==0)
			{
				mh.setText(an2+"% , Opps..You are  a dishonest person");	
			}
			
		}
	});
	
	l.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Random r3 = new Random();
			int an3 = r3.nextInt(100);
			
			if(an3<50&&an3>0)
			{
				ml.setText(an3+"% , Oh,you are feeling little bit love");	
			}
			else if(an3<80 && an3>=50)
			{
				ml.setText(an3+"% , You are feeling Love");	
			}
			else if(an3<100 && an3>=80)
			{
				ml.setText(an3+"% , Really!! are you in Love??");	
			}
			else if(an3==100)
			{
				ml.setText(an3+"% , Woh..Woh..What a lucky man you are..");	
			}
			else if(an3==0)
			{
				ml.setText(an3+"% , Opps....Break up??");	
			}
			
		}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.feeling, menu);
		return true;
	}

}
