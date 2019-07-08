package com.pktintali.com.timetable;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Launcheractivity extends AppCompatActivity {

    TextView t1;
    ImageView e1;
    Animation fromtop,frombotton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcheractivity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i1 = new Intent(Launcheractivity.this,MainActivity.class);
                startActivity(i1);
                finish();
            }
        }, 1800);

   t1 = findViewById(R.id.textView6);
   e1 = findViewById(R.id.imageView);
   fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
   frombotton = AnimationUtils.loadAnimation(this,R.anim.frombottom);
   t1.setAnimation(frombotton);
   e1.setAnimation(fromtop);




    }
}
