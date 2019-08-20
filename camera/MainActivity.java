package com.asymtask.student.camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    Intent i;
    static final int IMAGE_CAPTURER=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.img);

    }

    public void caputre(View view) {
        i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,IMAGE_CAPTURER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==IMAGE_CAPTURER){
            if(resultCode==RESULT_OK){
                Bitmap bm=data.getExtras();

            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
