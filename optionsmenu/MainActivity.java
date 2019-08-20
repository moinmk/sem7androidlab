package com.asymtask.student.optionsmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.linear);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("blue");
        menu.add("red");
        menu.add("black");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getTitle()=="blue") {
            l.setBackgroundColor(Color.BLUE);
        }
        if(item.getTitle()=="red"){
            l.setBackgroundColor(Color.RED);
        }
        if(item.getTitle()=="black"){
            l.setBackgroundColor(Color.BLACK);
        }

        return true;
    }
}
