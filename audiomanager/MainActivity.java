package com.asymtask.student.audiomanager;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    AudioManager am;
    int gm;
    Button normal,vibrate,silent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        am= (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        normal=findViewById(R.id.normal);
        silent=findViewById(R.id.silent);
        vibrate=findViewById(R.id.vibrate);

        gm=am.getRingerMode();
        if(gm==AudioManager.RINGER_MODE_NORMAL){
            normal.setBackgroundResource(R.color.colorRed);
        }
        if(gm==AudioManager.RINGER_MODE_SILENT){
            silent.setBackgroundResource(R.color.colorRed);
        }
        if(gm==AudioManager.RINGER_MODE_VIBRATE){
            vibrate.setBackgroundResource(R.color.colorRed);
        }


        normal.setOnClickListener(this);
        silent.setOnClickListener(this);
        vibrate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.normal:
                am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                normal.setBackgroundResource(R.color.colorRed);
                silent.setBackgroundResource(R.color.colorPrimary);
                vibrate.setBackgroundResource(R.color.colorPrimary);
                Toast.makeText(this,"normal",Toast.LENGTH_LONG).show();
                break;
            case R.id.vibrate:
                am.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                vibrate.setBackgroundResource(R.color.colorRed);
                silent.setBackgroundResource(R.color.colorPrimary);
                normal.setBackgroundResource(R.color.colorPrimary);
                break;
            case R.id.silent:
                am.setRingerMode(AudioManager.RINGER_MODE_SILENT);

                silent.setBackgroundResource(R.color.colorRed);
                vibrate.setBackgroundResource(R.color.colorPrimary);
                normal.setBackgroundResource(R.color.colorPrimary);
                break;
        }
    }
}
