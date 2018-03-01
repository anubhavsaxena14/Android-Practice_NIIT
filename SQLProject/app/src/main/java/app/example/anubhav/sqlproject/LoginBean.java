package app.example.anubhav.sqlproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by anubhav on 20/10/16.
 */
public class LoginBean extends SQLiteOpenHelper {

    public static final String DATABASE ="ab.db";
    public static final int DATABASE_VERSION =2;
    public static final String TABLE ="abc";
    public static final String COL_ID ="id";
    public static final String COL_NAME="name";
    public static final String COL_PASS="pass";

    public LoginBean(Context context) {
        super(context, DATABASE, null, DATABASE_VERSION);

    }
   // String m =//"create table login(id integer primary key autoincrement,name text not null,pass  text not null)";
     //       "CREATE TABLE  " + TABLE + " ( " + COL_ID + "  INTEGER PRIMARY KEY AUTOINCREMENT , " + COL_NAME + " TEXT NOT NULL ,"
                  //  + COL_PASS + " TEXT NOT NULL ) ";
    String m = " CREATE TABLE " + TABLE + " ( " + COL_ID + "INTEGER PRIMARY KEY AUTOINCREMENT , " + COL_NAME + " TEXT NOT NULL , " + COL_PASS +
          " TEXT NOT NULL ) " ;
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(m);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
