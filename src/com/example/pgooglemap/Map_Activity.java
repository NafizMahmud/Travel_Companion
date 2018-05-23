package com.example.pgooglemap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;

import android.app.Dialog;
import android.graphics.Color;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.example.pgooglemap.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.v;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
    

public class Map_Activity extends FragmentActivity implements GooglePlayServicesClient.ConnectionCallbacks,GooglePlayServicesClient.OnConnectionFailedListener,com.google.android.gms.location.LocationListener {
   GoogleMap map;
   Button Driving_Route,Distance;
   LatLng loc,myloc;
   Marker marker,mymarker;
   double lat,mylat,lng,mylng;
   double lat1,lng1;
   LocationClient locationclient;
   boolean draw=false; 	
   String placeString;
   
@Override
protected void onCreate(Bundle arg0) 
    {
	super.onCreate(arg0);
	setContentView(R.layout.map_layout);
	Driving_Route=(Button)findViewById(R.id.Driving_Route);
	Distance=(Button)findViewById(R.id.distance);
	int a = getIntent().getIntExtra("HI", 0);
    
	
	//CTG
	if(a == 0)
	{
		lat=22.366585;
		lng=91.823199;
		loc=new LatLng(lat, lng);	
		placeString="২ নং গেইট";
	}
	
	
	else if(a == 1)
	{
		lat=22.342354;
		lng=91.836691;
		loc=new LatLng(lat, lng);
		placeString="আন্দরকিল্লা";
		
	}
	else if(a == 2)
	{
		lat=22.368604;
        lng=91.844023;
		loc=new LatLng(lat, lng);
		placeString="বহদ্দারহাট";
		
	}
	else if(a == 3)
	{
		lat=22.374498;
        lng=91.850515;
		loc=new LatLng(lat, lng);
		placeString="বহদ্দারহাট বাস টার্মিনাল";
		
	}

	else if(a == 4)
	{
		lat=22.357536;
        lng= 91.837463;
		loc=new LatLng(lat, lng);
		placeString="চকবাজার";
		
	}

	else if(a == 5)
	{
		lat=22.354718;
        lng=91.838257;
		loc=new LatLng(lat, lng);
		placeString="চট্টগ্রাম কলেজ";
		
	}

	else if(a == 6)
	{
		lat=22.387491;
        lng=91.860889;
		loc=new LatLng(lat, lng);
		placeString="সি এন্ড বি ";
		
	}

	else if(a == 7)
	{
		lat=22.460197;
        lng=91.971543;
		loc=new LatLng(lat, lng);
		placeString="চুয়েট";
		
	}

	else if(a == 8)
	{
		lat=22.451401;
        lng=91.943816;
		loc=new LatLng(lat, lng);
		placeString="গশ্চিনয়াহাট";
		
	}

	else if(a == 9)
	{
		lat=22.359045;
        lng=91.821386;
		loc=new LatLng(lat, lng);
		placeString="জিইসি সার্কেল";
		
	}

	else if(a == 10)
	{
		lat=22.509759;
        lng=91.8140103;
		loc=new LatLng(lat, lng);
		placeString="হাটহাজারী";
		
	}

	else if(a == 11)
	{
		lat=22.397495 ;
        lng=91.886000;
		loc=new LatLng(lat, lng);
		placeString="কালুরঘাট";
		
	}

	else if(a == 12)
	{
		lat=22.500878;
        lng=92.225997;
		loc=new LatLng(lat, lng);
		placeString="কাপ্তাই  লেক";
		
	}

	else if(a == 13)
	{
		lat=22.339178;
        lng=91.837785;
		loc=new LatLng(lat, lng);
		placeString="লালদিঘীর  পাঁড়";
		
	}

	else if(a == 14)
	{
		lat=22.432704;
        lng=91.871350;
		loc=new LatLng(lat, lng);
		placeString="মদুনাঘাট";
		
	}

	else if(a == 15)
	{
		lat=22.400867;
        lng=91.868517;
		loc=new LatLng(lat, lng);
		placeString="মোহরা";
		
	}
	
	else if(a == 16)
	{
		lat=22.369026;
        lng=91.833327;
		loc=new LatLng(lat, lng);
		placeString="মুরাদপুর";
		
	}
	
	else if(a == 17)
	{
		lat=22.419296;
        lng=91.866436;
		loc=new LatLng(lat, lng);
		placeString="নজুমিয়াহাট";
		
	}
	
	else if(a == 18)
	{
		lat=22.334335;
        lng=91.832571;
		loc=new LatLng(lat, lng);
		placeString="নিউ মার্কেট";
		
	}
	
	else if(a == 19)
	{
		lat=22.368604;
        lng=91.844023;
		loc=new LatLng(lat, lng);
		placeString="নোয়াপাড়া";
		
	}
	
	else if(a == 20)
	{
		lat=22.459313;
        lng=91.966143;
		loc=new LatLng(lat, lng);
		placeString="পাহাড়তলী,রাউজান";
		
	}
	
	else if(a == 21)
	{
		lat=22.338801;
        lng=91.835339;
		loc=new LatLng(lat, lng);
		placeString="প্রিমিয়ার ভার্সিটি";
		
	}
	
	else if(a == 22)
	{
		lat=22.408292;
        lng=91.862118;
		loc=new LatLng(lat, lng);
		placeString="কুয়াইশ";
		
	}
	
	else if(a == 23)
	{
		lat=22.467054;
        lng=92.064750;
		loc=new LatLng(lat, lng);
		placeString="রাঙ্গুনিয়া";
		
	}
	
	else if(a == 24)
	{
		lat=22.534495;
        lng=91.936919;
		loc=new LatLng(lat, lng);
		placeString="রাউজান";
		
	}
	
	else if(a == 25)
	{
		lat=22.457925;
        lng=91.977065;
		loc=new LatLng(lat, lng);
		placeString="রাউজান পাওয়ার প্লান্ট";
		
	}
	
	else if(a == 26)
	{
		lat=22.361999;
        lng=91.822765;
		loc=new LatLng(lat, lng);
		placeString="সানমার সিটি";
		
	}
	
	else if(a == 27)
	{
		lat=22.342274;
        lng=91.8160163;
		loc=new LatLng(lat, lng);
		placeString="টাইগারপাস";
		
	}
	
	else if(a == 28)
	{
		lat=22.467252;
        lng=91.959922;
		loc=new LatLng(lat, lng);
		placeString="ঊনসত্তর পাড়া";
		
	}
	
	else if(a == 29)
	{
		lat=22.351533;
        lng=91.822067;
		loc=new LatLng(lat, lng);
		placeString="ওয়াসা";
		
	}
	
	else if(a == 30)
	{
		lat=22.441234;
        lng=91.7381363;
		loc=new LatLng(lat, lng);
		placeString="ভাটিয়ারি";
		
	}
	

	
	//Tourism
	else if(a==101)
	{
		lat=21.429487;
		lng=92.031226;
		loc=new LatLng(lat, lng);
		placeString="কক্সবাজার ";
		
	}
	else if(a==102)
	{
		lat=23.113897;
		lng=91.978773;
		loc=new LatLng(lat, lng);
		placeString="খাগড়াছড়ি";
		
	}
	else if(a==103)
	{
		lat=22.492931;
		lng=92.227650;
		loc=new LatLng(lat, lng);
		placeString="কাপ্তাই";
		
	}
	else if(a==104)
	{
		lat=21.912314;
		lng= 92.324464;
		loc=new LatLng(lat, lng);
		placeString="নীলগিরি";
		
	}
	else if(a==105)
	{
		lat=22.301435;
		lng=89.561635;
		loc=new LatLng(lat, lng);
		placeString="সুন্দরবন";
		
	}
	else if(a==106)
	{
		lat=24.894781;
		lng=91.876667;
		loc=new LatLng(lat, lng);
		placeString="সিলেট চা বাগান";
		
	}
	
	
	//Dhaka
	else if(a == 200)
	{
		lat=23.825241;
		lng= 90.455375;
		loc=new LatLng(lat, lng);
		placeString="বসুন্ধরা আবাসিক";
		
	}
	else if(a == 201)
	{
		lat=23.751651;
		lng=90.392375;
		loc=new LatLng(lat, lng);
		placeString="বসুন্ধরা সিটি";
		
	}
	else if(a == 202)
	{
		lat=23.731469;
		lng=90.396967;
		loc=new LatLng(lat, lng);
		placeString="বুয়েট";
		
	}
	
	else if(a == 203)
	{
		lat=23.748396;
		lng=90.375563;
		loc=new LatLng(lat, lng);
		placeString="ধানমন্ডি";
		
	}
	
	else if(a == 204)
	{
		lat=23.733195;
		lng=90.3934863;
		loc=new LatLng(lat, lng);
		placeString="ঢাকা বিশ্ববিদ্যালয়";
		
	}
	
	else if(a == 205)
	{
		lat=23.856958;
		lng=90.400443;
		loc=new LatLng(lat, lng);
		placeString="হযরত শাহজালাল আন্তজাতিক বিমানবন্দর";
		
	}
	
	else if(a == 206)
	{
		lat=23.813572;
		lng=90.423843;
		loc=new LatLng(lat, lng);
		placeString="যমুনা ফিউচার পার্ক";
		
	}
	
	else if(a == 207)
	{
		lat=23.733041;
		lng=90.425549;
		loc=new LatLng(lat, lng);
		placeString="কমলাপুর রেলস্টেশন";
		
	}
	
	else if(a == 208)
	{
		lat=23.822852;
		lng=90.363203;
		loc=new LatLng(lat, lng);
		placeString="মিরপুর";
		
	}
	
	else if(a == 209)
	{
		lat=23.766974;
		lng=90.358568;
		loc=new LatLng(lat, lng);
		placeString="মোহাম্মদপুর";
		
	}
	
	else if(a == 210)
	{
		lat=23.732996;
		lng=90.416762;
		loc=new LatLng(lat, lng);
		placeString="মতিঝিল";
		
	}
	
	else if(a == 211)
	{
		lat=23.853818;
		lng=90.258651;
		loc=new LatLng(lat, lng);
		placeString="সাভার";
		
	}
	
	else if(a == 212)
	{
		lat=23.865269;
		lng=90.397759;
		loc=new LatLng(lat, lng);
		placeString="উত্তরা";
		
	}
	Distance.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			float[] results = new float[1]; 
			Location currentlocation=locationclient.getLastLocation();
			lat1=currentlocation.getLatitude();
		    lng1=currentlocation.getLongitude();
	    Location.distanceBetween(mylat, mylng, lat, lng, results);
        float a=results[0]/1000;
        Toast.makeText(getApplicationContext(),"The Distance Between Your Current Location and "+placeString+" is "+a+ " KM ", Toast.LENGTH_LONG).show();
		}});
	
	
	
	
	if(!A())
	{Toast.makeText(getApplicationContext(), "Sorry", Toast.LENGTH_SHORT).show();}
	
	else
	{map=((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();}
	if(map==null) Toast.makeText(getApplicationContext(), "Map Cant Be Created", Toast.LENGTH_SHORT).show();
	
	else
	{
	map.setMyLocationEnabled(true);
	marker=map.addMarker(new MarkerOptions().position(loc).title(placeString));
	marker.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
    marker.showInfoWindow();
   
	locationclient=new LocationClient(this, this,this);
	
	}

	
	Driving_Route.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
   
			if(draw==false)
			{
				try
				{
					draw=true;
					Toast.makeText(getApplicationContext(), "Wait to get the direction", Toast.LENGTH_LONG).show();
					try{
						 final LatLngBounds bounds = new LatLngBounds.Builder().include(myloc).include(loc).build();
					         map.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, 65));
					}
					catch(Exception e)
					{
						Toast.makeText(getApplicationContext(), "Direction can not be shown, please try again.", Toast.LENGTH_LONG).show();
					}
				    String str_origin = "origin="+lat+","+lng;
			        // Destination of route
			        String str_dest = "destination="+mylat+","+mylng; 
			        // Sensor enabled
			        String sensor = "sensor=false"; 
			        // Building the parameters to the web service
			        String parameters = str_origin+"&"+str_dest+"&"+sensor;	 
			        // Output format
			        String output = "json";	 
			        // Building the url to the web service
			        String url = "https://maps.googleapis.com/maps/api/directions/"+output+"?"+parameters;
			        DownloadTask downloadTask = new DownloadTask();	        
		         // Start downloading json data from Google Directions API
		            downloadTask.execute(url); 		            
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Toast.makeText(getApplicationContext(), "Direction can not be shown, please try again.", Toast.LENGTH_LONG).show();
				}
			}
			else Toast.makeText(getApplicationContext(), "Wait to get the direction", Toast.LENGTH_LONG).show();


		
		
		}});	
		
	
	   map.setOnMarkerClickListener(new OnMarkerClickListener() {
		
		public boolean onMarkerClick(Marker marker1) {
		String a= marker1.getTitle();
		Toast.makeText(getApplicationContext(), a, Toast.LENGTH_SHORT).show();
		marker1.showInfoWindow();
        return true;
		}});
	
	
	map.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
		
		@Override
		public void onInfoWindowClick(Marker marker1) {
		   	String b=marker1.getTitle();
		   	Toast.makeText(getApplicationContext(), b+ "Info is clicked", Toast.LENGTH_SHORT).show();
		}
	});
	
    	}
    @Override
    		protected void onPause() {
    			// TODO Auto-generated method stub
    			super.onPause();
    			locationclient.disconnect();
    		}
    @Override
    		protected void onResume() {
    			// TODO Auto-generated method stub
    			super.onResume();
    			locationclient.connect();
    			
    		}
   
   public boolean A() 
   {  int result=GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
       if(result==ConnectionResult.SUCCESS)
       {return true;}
       else if(GooglePlayServicesUtil.isUserRecoverableError(result))
       {Dialog d=GooglePlayServicesUtil.getErrorDialog(result, this, 1);
       d.show();}
       else
       {Toast.makeText(getApplicationContext(), "Google Play Not Available", Toast.LENGTH_LONG).show();
       finish();}
       return false;}
@Override
public void onLocationChanged(Location arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void onConnectionFailed(ConnectionResult arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void onConnected(Bundle arg0) {
	// TODO Auto-generated method stub
	Location currentlocation=locationclient.getLastLocation();
	try{
	       mylat=currentlocation.getLatitude();
	       mylng=currentlocation.getLongitude();
	       myloc=new LatLng(mylat,mylng);
		   mymarker=map.addMarker(new MarkerOptions().position(myloc).title("Current Location"));                                 
	       mymarker.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
	       //mymarker.showInfoWindow();
	       map.moveCamera(CameraUpdateFactory.newLatLngZoom(myloc,12.0f)); 
	 }
	catch(Exception e)
	{
	Toast.makeText(getApplicationContext(), "Your present location not found, Turn On GPS & try again.",Toast.LENGTH_LONG).show();
	finish();
	}     

}
@Override
public void onDisconnected() {
	
}

private String downloadUrl(String strUrl) throws IOException{
    String data = "";
    InputStream iStream = null;
    HttpURLConnection urlConnection = null;
    try{
        URL url = new URL(strUrl);
        // Creating an http connection to communicate with url
        urlConnection = (HttpURLConnection) url.openConnection();
        // Connecting to url
        urlConnection.connect();
        // Reading data from url
        iStream = urlConnection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(iStream));
        StringBuffer sb = new StringBuffer();
        String line = "";
        while( ( line = br.readLine()) != null){
            sb.append(line);
        }
        data = sb.toString();
        br.close();

    }catch(Exception e){
        Log.d("Exception while downloading url", e.toString());
    }finally{
        iStream.close();
        urlConnection.disconnect();
    }
    return data;
}

private class DownloadTask extends AsyncTask<String, Void, String>{

    // Downloading data in non-ui thread
    @Override
    protected String doInBackground(String... url) {

        // For storing data from web service
        String data = "";

        try{
            // Fetching the data from web service
            data = downloadUrl(url[0]);
        }catch(Exception e){
            Log.d("Background Task",e.toString());
        }
        return data;
    }

    // Executes in UI thread, after the execution of
    // doInBackground()
    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

        ParserTask parserTask = new ParserTask();

        // Invokes the thread for parsing the JSON data
        parserTask.execute(result);
    }
}
private class ParserTask extends AsyncTask<String, Integer, List<List<HashMap<String,String>>> >{

    // Parsing the data in non-ui thread
    @Override
    protected List<List<HashMap<String, String>>> doInBackground(String... jsonData) {

        JSONObject jObject;
        List<List<HashMap<String, String>>> routes = null;

        try{
            jObject = new JSONObject(jsonData[0]);
            DirectionsJSONParser parser = new DirectionsJSONParser();

            // Starts parsing data
            routes = parser.parse(jObject);
        }catch(Exception e){
            e.printStackTrace();
        }
        return routes;
    }

    // Executes in UI thread, after the parsing process
    @Override
    protected void onPostExecute(List<List<HashMap<String, String>>> result) {
        ArrayList<LatLng> points = null;
        PolylineOptions lineOptions = null;
        MarkerOptions markerOptions = new MarkerOptions();

        // Traversing through all the routes
        for(int i=0;i<result.size();i++){
            points = new ArrayList<LatLng>();
            lineOptions = new PolylineOptions();

            // Fetching i-th route
            List<HashMap<String, String>> path = result.get(i);

            // Fetching all the points in i-th route
            for(int j=0;j<path.size();j++){
                HashMap<String,String> point = path.get(j);

                double lat = Double.parseDouble(point.get("lat"));
                double lng = Double.parseDouble(point.get("lng"));
                LatLng position = new LatLng(lat, lng);

                points.add(position);
            }

            // Adding all the points in the route to LineOptions
            lineOptions.addAll(points);
            lineOptions.width(8);
            lineOptions.color(Color.RED);
        }

        // Drawing polyline in the Google Map for the i-th route
        map.addPolyline(lineOptions);
    }

}













}
