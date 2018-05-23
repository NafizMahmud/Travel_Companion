package com.example.pgooglemap;

 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
 
public class EnterDataActivity extends Activity {
 
    EditText editTextPersonName;
    EditText editTextPersionPIN;
 
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_data);
 
        editTextPersonName = (EditText) findViewById(R.id.et_person_name);
        editTextPersionPIN = (EditText) findViewById(R.id.et_person_pin);
    }
 
    public void onClickAdd (View btnAdd) {
 
        String personName = editTextPersonName.getText().toString();
        String personPIN = editTextPersionPIN.getText().toString();
 
        if ( personName.length() != 0 || personPIN.length() != 0 ) {
 
            Intent newIntent = getIntent();
            newIntent.putExtra("tag_person_name", personName);
            newIntent.putExtra("tag_person_pin", personPIN);
 
            this.setResult(RESULT_OK, newIntent);
 
            finish();
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	


