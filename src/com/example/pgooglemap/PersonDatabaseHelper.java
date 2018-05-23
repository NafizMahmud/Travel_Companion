package com.example.pgooglemap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class PersonDatabaseHelper {

   private static final String TAG = PersonDatabaseHelper.class.getSimpleName();

   // database configuration
  
   private static final int DATABASE_VERSION = 1;
   private static final String DATABASE_NAME = "mydatabase.db";

   // table configuration
   private static final String TABLE_NAME = "person_table";         
   private static final String PERSON_TABLE_COLUMN_ID = "_id";    
   private static final String PERSON_TABLE_COLUMN_NAME = "person_name";
   private static final String PERSON_TABLE_COLUMN_PIN = "person_pin";

   private DatabaseOpenHelper openHelper;
   private SQLiteDatabase database;

  
   public PersonDatabaseHelper(Context aContext) {
        
       openHelper = new DatabaseOpenHelper(aContext);
       database = openHelper.getWritableDatabase();
   }

   public void insertData (String aPersonName, String aPersonPin) {

    

       ContentValues contentValues = new ContentValues();

       contentValues.put(PERSON_TABLE_COLUMN_NAME, aPersonName);
       contentValues.put(PERSON_TABLE_COLUMN_PIN, aPersonPin);

       database.insert(TABLE_NAME, null, contentValues);
   }

   public Cursor getAllData () {

       String buildSQL = "SELECT * FROM " + TABLE_NAME;

       Log.d(TAG, "getAllData SQL: " + buildSQL);

       return database.rawQuery(buildSQL, null);
   }

   // this DatabaseOpenHelper class will actually be used to perform database related operation 
    
   private class DatabaseOpenHelper extends SQLiteOpenHelper {

       public DatabaseOpenHelper(Context aContext) {
           super(aContext, DATABASE_NAME, null, DATABASE_VERSION);
       }

       @Override
       public void onCreate(SQLiteDatabase sqLiteDatabase) {
           // Create your tables here

           String buildSQL = "CREATE TABLE " + TABLE_NAME + "( " + PERSON_TABLE_COLUMN_ID + " INTEGER PRIMARY KEY, " +
                   PERSON_TABLE_COLUMN_NAME + " TEXT, " + PERSON_TABLE_COLUMN_PIN + " TEXT )";

           Log.d(TAG, "onCreate SQL: " + buildSQL);

           sqLiteDatabase.execSQL(buildSQL);
       }

       @Override
       public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
          
       }
   }




}
    
    

