package com.asymtask.student.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class  MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lv;
    Intent i;
    String name[]={"sem5","sem6","sem7"};
    String[] semFiveSubjects={"php","fon","python"};
    String[] semSixSubjects={"se","es","mis"};
    String[] semSevenSubjects={"mp","ml","is"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.list);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,name);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        int p=position;
        String value=(String)lv.getItemAtPosition(p);
        i=new Intent(this,sublist.class);
        switch (p){
            case 0:
                i.putExtra("names",semFiveSubjects);
                startActivity(i);
                break;
            case 1:
                i.putExtra("names",semSixSubjects);
                startActivity(i);
                break;
            case 2:
                i.putExtra("names",semSevenSubjects);
                startActivity(i);
                break;

        }

       Toast.makeText(getApplicationContext(),"index"+p +"value"+value,Toast.LENGTH_LONG).show();
    }

}
