package com.example.ashley.participation10sql2018;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {

    //Constant variables are created for table columns
    public static final String TABLE_COMMENTS = "comments"; //The name of the table
    public static final String COLUMN_ID = "_id";               //The column heading name of the id field
    public static final String COLUMN_COMMENT = "comment";          //The column heading name fo the comment field

    private static final String DATABASE_NAME = "commments.db"; //This is the name of the database
    private static final int DATABASE_VERSION = 1;  //This is the database version

    // Database creation sql statement
    /* SQL table create.....
        CREATE TABLE comments(
        COMMENT_ID string;
        COMMENT string;
        );
     */
    private static final String DATABASE_CREATE = "create table "
            + TABLE_COMMENTS + "( " + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_COMMENT
            + " text not null);";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    //Database SQL is executed
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    //Upgrades the database
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COMMENTS);
        onCreate(db);
    }

}
