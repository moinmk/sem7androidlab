package com.asymtask.student.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    WebView wv;
    Button b;
    EditText url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url=findViewById(R.id.url);
        b=findViewById(R.id.browse);
        wv=findViewById(R.id.wv);
        b.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url.getText().toString());

    }
}
