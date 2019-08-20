package com.asymtask.student.listview;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class sublist extends AppCompatActivity {
    ListView l;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sublist);
        l=findViewById(R.id.sublist);
        i=getIntent();

        String[] subjects=i.getStringArrayExtra("names");

        ArrayAdapter<String> a=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,subjects);
        l.setAdapter(a);
    }
}
