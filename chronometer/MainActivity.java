package com.asymtask.student.chronometer;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Chronometer cm;
    Button start,stop,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cm=findViewById(R.id.cmeter);
        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);
        reset=findViewById(R.id.reset);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        reset.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.start:
                cm.start();
                break;
            case R.id.stop:
                cm.stop();
                break;
            case R.id.reset:
                cm.setBase(SystemClock.elapsedRealtime());
                break;
        }
    }
}
