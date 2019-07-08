package com.pktintali.com.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class about extends AppCompatActivity {
    ImageView e1;
    TextView t1;
    Animation fromtop,frombotton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        t1 = findViewById(R.id.textView6);
        e1 = findViewById(R.id.imageView);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        frombotton = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        t1.setAnimation(frombotton);
        e1.setAnimation(fromtop);
    }

    public void goBackg(View view) {
        finish();
    }
}
