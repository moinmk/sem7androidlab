package com.asymtask.student.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CheckBox c1,c2,c3,c4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn);
        c1=findViewById(R.id.check1);
        c2=findViewById(R.id.check2);
        c3=findViewById(R.id.check3);
        c4=findViewById(R.id.check4);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        int total=0;
        String orders="";
        if(c1.isChecked()==true){
            total=total+100;
            orders=orders+"pizza:"+" "+"100";
        }
        if(c2.isChecked()==true){
            total=total+50;
            orders=orders+"burger:"+" "+"50";
        }
        if(c3.isChecked()==true){
            total=total+30;
            orders=orders+"coffee:"+" "+"30";
        }
        if(c4.isChecked()==true){
            total=total+30;
            orders=orders+"cold drinks:"+" "+"30";
        }
        Toast.makeText(this,orders+"\n"+"total"+total,Toast.LENGTH_LONG).show();
    }
}
