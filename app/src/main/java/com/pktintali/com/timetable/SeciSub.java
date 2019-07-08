package com.pktintali.com.timetable;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class SeciSub extends AppCompatActivity {
    TextView pholder,pholder1,pholder2,pholder3,pholder4,pholder5,pholder6,pholder7,pholder8,btnlunch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seci_sub);



        btnlunch = findViewById(R.id.button29);
        pholder = findViewById(R.id.textView3);
        pholder.setText(getIntent().getStringExtra("message"));

        pholder1 = findViewById(R.id.button25);
        pholder1.setText(getIntent().getStringExtra("message1"));

        pholder2 = findViewById(R.id.button26);
        pholder2.setText(getIntent().getStringExtra("message2"));

        pholder3 = findViewById(R.id.button27);
        pholder3.setText(getIntent().getStringExtra("message3"));

        pholder4 = findViewById(R.id.button28);
        pholder4.setText(getIntent().getStringExtra("message4"));

        pholder5 = findViewById(R.id.button30);
        pholder5.setText(getIntent().getStringExtra("message5"));

        pholder6 = findViewById(R.id.button31);
        pholder6.setText(getIntent().getStringExtra("message6"));

        pholder7 = findViewById(R.id.button32);
        pholder7.setText(getIntent().getStringExtra("message7"));

        pholder7 = findViewById(R.id.button33);
        pholder7.setText(getIntent().getStringExtra("message8"));


        Calendar c = Calendar.getInstance();
        int minuteOfDay = c.get(Calendar.MINUTE);
        final int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay > 11 && timeOfDay < 13) {
            if (minuteOfDay > 30) {
                pholder1.setBackgroundResource(R.drawable.timeauto);
            }
        }
        else if (timeOfDay > 12 && timeOfDay < 14)
        {
            if (minuteOfDay < 20) {
                pholder1.setBackgroundResource(R.drawable.timeauto);
            } else {
                pholder2.setBackgroundResource(R.drawable.timeauto);
            }
        }
        else if (timeOfDay > 13 && timeOfDay < 15)
        {
            if (minuteOfDay < 10) {
                pholder2.setBackgroundResource(R.drawable.timeauto);
            } else {
                pholder3.setBackgroundResource(R.drawable.timeauto);
            }
        } else if (timeOfDay > 14 && timeOfDay < 16)
        {
            if (minuteOfDay<50)
            {
                pholder4.setBackgroundResource(R.drawable.timeauto);
            }
            else
            {
                btnlunch.setBackgroundResource(R.drawable.timeauto);
            }
        }

        else if (timeOfDay>15&&timeOfDay<17)
        {
            if (minuteOfDay<20)
            {
                btnlunch.setBackgroundResource(R.drawable.timeauto);
            }
            else
            {
                pholder5.setBackgroundResource(R.drawable.timeauto);
            }
        }

        else if (timeOfDay>16&&timeOfDay<18)
        {
            if (minuteOfDay<10)
            {
                pholder5.setBackgroundResource(R.drawable.timeauto);
            }
            else
            {
                pholder6.setBackgroundResource(R.drawable.timeauto);
            }
        }
        else if (timeOfDay>17&&timeOfDay<19)
        {
            if (minuteOfDay<50)
            {
                pholder6.setBackgroundResource(R.drawable.timeauto);
            }
            else
            {
                pholder7.setBackgroundResource(R.drawable.timeauto);
            }
        }

        else if (timeOfDay>18&&timeOfDay<20)
        {
            if (minuteOfDay<30)
            {
                pholder7.setBackgroundResource(R.drawable.timeauto);
            }
            else
            {
                pholder1.setBackgroundResource(R.drawable.autotime);
            }
        }
        else
        {
            pholder1.setBackgroundResource(R.drawable.autotime);
        }


        pholder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

    public void goBack(View view) {
        finish();
    }


    public void doShare(View view) {
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "https://drive.google.com/file/d/1pOhKU_axc5xwU8H4icw7HQpjRphfTrSY/view?usp=drivesdk";
        String shareSub = "Your Subject";
        myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
        startActivity(Intent.createChooser(myIntent,"Share Using"));
    }

}