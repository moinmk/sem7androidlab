package com.asymtask.student.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    RadioButton r1,r2,r3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.java);
        r2=findViewById(R.id.python);
        r3=findViewById(R.id.javascript);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(r1.isChecked()){
            Toast.makeText(this, "java", Toast.LENGTH_SHORT).show();
        }
        else if(r2.isChecked()){
            Toast.makeText(this, "python", Toast.LENGTH_SHORT).show();
        }
        else if(r3.isChecked()){
            Toast.makeText(this, "javascript", Toast.LENGTH_SHORT).show();
        }

    }
}
