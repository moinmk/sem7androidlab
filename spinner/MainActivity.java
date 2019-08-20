package com.asymtask.student.spinner;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner s;
    ImageView i;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = findViewById(R.id.spin);
        i = findViewById(R.id.img);
        s.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String str = (String)s.getItemAtPosition(position);

        if (str.equals("nusrat fateh ali khan")) {
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
            i.setImageResource(R.drawable.nfak);
        }
        else if (str.equals("shah rukh khan")) {
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
            i.setImageResource(R.drawable.srk);
        }
        else if (str.equals("keanu reeves")) {
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
            i.setImageResource(R.drawable.keanu);
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
