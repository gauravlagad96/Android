package com.example.curd_sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

   private static String DATABASE_NAME = "sqlite_demo";
   private static int database_version = 1;
    public DbHelper(@Nullable Context context){
        super(context,DATABASE_NAME,null,database_version); //it calls constructor of SQLiteOpenHelper for create automatic database.
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String create_table_query = "create table student_registration(id integer primary key autoincrement,name text,email text,password text,gender text)";
    db.execSQL(create_table_query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("drop table if exists student_registration"); //create new table.
        onCreate(db);
    }

    public void registerUserHelper(String name,String email, String password,String gender){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        contentValues.put("email",email);
        contentValues.put("password",password);
        contentValues.put("gender",gender);

        sqLiteDatabase.insert("student_registration ", null,contentValues);
        sqLiteDatabase.close();
    }
}
