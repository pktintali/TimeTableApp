package com.pktintali.com.timetable;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class SecH extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    Calendar c= Calendar.getInstance();
    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_h);




        b1 = findViewById(R.id.button18);
        b2 = findViewById(R.id.button9);
        b3 = findViewById(R.id.button23);
        b4 = findViewById(R.id.button22);
        b5 = findViewById(R.id.button21);
        b6 = findViewById(R.id.button);
        b7 = findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                


            }

        });
    }


    public void goBack(View view) {
        finish();
    }

    public void doInfo(View view) {
        Intent i19 = new Intent(this,info.class);
        startActivity(i19);
    }
}
