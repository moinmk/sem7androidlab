package com.asymtask.student.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static  final String dbName="info.db";
    public static  final String tableName="user_data";


    public DatabaseHelper(Context context) {
        super(context,dbName,null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "+tableName+"(id text,name text,qualification text,location text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insertData(String uid, String uname, String uquaification, String ulocation) {
        SQLiteDatabase d=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("id",uid);
        cv.put("name",uname);
        cv.put("qualification",uquaification);
        cv.put("location",ulocation);
        long isAdded=d.insert(tableName,null,cv);
        if(isAdded==-1){
            return false;
        }
        else{
            return true;
        }

    }

    public Cursor viewData() {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("select * from "+tableName,null);
        return res;
    }

    public boolean updateData(String uid, String uname, String uqualification, String ulocation){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("id",uid);
        cv.put("name",uname);
        cv.put("qualification",uqualification);
        cv.put("location",ulocation);

        long isUpdates= db.update(tableName,cv,"id=?",new String[]{uid});

        if(isUpdates==-1){
            return false;
        }
        else{
            return true;
        }
    }

        public boolean deleteData(String uid){
            SQLiteDatabase db=this.getWritableDatabase();
            db.delete(tableName,"id=?",new String[]{uid});
            return true;
        }
}
