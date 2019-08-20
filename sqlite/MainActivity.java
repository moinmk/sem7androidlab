package com.asymtask.student.sqlite;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText uid,uname,qualification,location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new DatabaseHelper(this);
        uid=findViewById(R.id.uid);
        uname=findViewById(R.id.uname);
        qualification=findViewById(R.id.uqua);
        location=findViewById(R.id.ulocation);

    }

    //======================inserting in database===========================

    public void insertData(View view) {

        boolean isAdded=db.insertData(uid.getText().toString(),uname.getText().toString(),qualification.getText().toString(),location.getText().toString());
        if(isAdded){
            Toast.makeText(this,"added in database",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"error while adding in database",Toast.LENGTH_LONG).show();
        }

    }

    //=======================displaying from database===========================
    public void viewData(View view) {
        Cursor c=db.viewData();
        StringBuffer data=new StringBuffer();
        while(c.moveToNext()){
            data.append("id"+c.getString(0)+"\n");
            data.append("name "+c.getString(1)+"\n");
            data.append("qualification "+c.getString(2)+"\n");
            data.append("location "+c.getString(3)+"\n");

        }
        showAlert("all data",data.toString());
        if(c.getCount()==0){
            showAlert("alert","no data found");
        }
    }
    private void showAlert(String title, String msg) {
        AlertDialog.Builder ab=new AlertDialog.Builder(this);
        //ab.setCancelable(false);
        ab.setTitle(title);
        ab.setMessage(msg);
       /* ab.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });*/
        ab.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog ad=ab.create();
        ad.show();

    }


    //=====================updating in database===========================
    public void updateData(View view) {
        Boolean isUpdated=db.updateData(uid.getText().toString(),uname.getText().toString(),qualification.getText().toString(),location.getText().toString());

        if(isUpdated){
            Toast.makeText(this,"data updated in database",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"error while updating in database",Toast.LENGTH_LONG).show();
        }
    }


    //=====================deleting from database===========================
    public void deleteData(View view) {
        Boolean isDeleted=db.deleteData(uid.getText().toString());


        if(isDeleted){
            Toast.makeText(this,"data deleted from database",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"error while deleting from database",Toast.LENGTH_LONG).show();
        }
    }
}
