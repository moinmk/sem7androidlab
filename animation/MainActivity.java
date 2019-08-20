package com.asymtask.student.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button translate,scale,rotate,alpha;
    ImageView chanoey;
    Animation r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        translate=findViewById(R.id.translate);
        scale=findViewById(R.id.scale);
        rotate=findViewById(R.id.rotate);
        alpha=findViewById(R.id.alpha);
        chanoey=findViewById(R.id.chanoey);
        translate.setOnClickListener(this);
        scale.setOnClickListener(this);
        rotate.setOnClickListener(this);
        alpha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.translate:
                r=AnimationUtils.loadAnimation(this,R.anim.translate);
                chanoey.startAnimation(r);
                break;
            case R.id.scale:
                r=AnimationUtils.loadAnimation(this,R.anim.scale);
                chanoey.startAnimation(r);
                break;
            case R.id.rotate:
                r=AnimationUtils.loadAnimation(this,R.anim.rotate);
                chanoey.startAnimation(r);
                break;
          case R.id.alpha:
              r=AnimationUtils.loadAnimation(this,R.anim.alpha);
              chanoey.startAnimation(r);
                break;

        }
    }
}
