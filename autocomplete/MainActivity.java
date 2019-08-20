package com.asymtask.student.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] arr={"aa","aaa","bb","dd","mm"};
    AutoCompleteTextView atv;
    MultiAutoCompleteTextView matv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atv=findViewById(R.id.text);
        matv=findViewById(R.id.multitext);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,arr);
        atv.setAdapter(aa);
        matv.setAdapter(aa);
        matv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
