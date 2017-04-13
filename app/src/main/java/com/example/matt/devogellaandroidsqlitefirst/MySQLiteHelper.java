package com.example.matt.devogellaandroidsqlitefirst;

/**
 * Created by Matt on 4/13/17.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {

    public static final String TABLE_COMMENTS = "comments"; //shows comments on table
    public static final String COLUMN_ID = "_id"; //shows the ID of the column
    public static final String COLUMN_COMMENT = "comment"; //shows comments on column

    private static final String DATABASE_NAME = "commments.db"; //shows database name
    private static final int DATABASE_VERSION = 1; //shows database version
    public static final String COLUMN_RATING = "rating"; //shows the custom rating

    // Database creation sql statement
    private static final String DATABASE_CREATE = "create table "
            + TABLE_COMMENTS + "( " + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_COMMENT
            + " text not null) ;" + COLUMN_RATING;
    //grabs information on the database
    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //creates database
    @Override
    public void onCreate(SQLiteDatabase database) {

        database.execSQL(DATABASE_CREATE);
    }

    //upgrades database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COMMENTS);
        onCreate(db);
    }


}
