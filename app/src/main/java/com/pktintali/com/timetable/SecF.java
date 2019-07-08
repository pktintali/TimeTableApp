package com.pktintali.com.timetable;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class SecF extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;

    Calendar c= Calendar.getInstance();
    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_f);



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
                Intent i1 = new Intent(SecF.this,LMonday.class);
                i1.putExtra("message","MONDAY");
                i1.putExtra("message1","PPS");
                i1.putExtra("message2","MATHS");
                i1.putExtra("message3","CHEM.T1/PPS T2");
                i1.putExtra("message4","WORKSHOP");
                i1.putExtra("message5","MATHS");
                i1.putExtra("message6","CHEMISTRY");
                i1.putExtra("message7","LIB.");
                i1.putExtra("message8","");
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(SecF.this,LMonday.class);
                i1.putExtra("message","TUESDAY");
                i1.putExtra("message1","PE");
                i1.putExtra("message2","CHEMISTRY");
                i1.putExtra("message3","PPS");
                i1.putExtra("message4","MATHS");
                i1.putExtra("message5","PPS");
                i1.putExtra("message6","SPORTS");
                i1.putExtra("message7","SPORTS");
                i1.putExtra("message8","");
                startActivity(i1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(SecF.this,LMonday.class);

                i1.putExtra("message","WEDNESDAY");
                i1.putExtra("message1","MATHS");
                i1.putExtra("message2","CHEMISTRY");
                i1.putExtra("message3","PPS");
                i1.putExtra("message4","MATHS");
                i1.putExtra("message5","CHEMISTRY");
                i1.putExtra("message6","PPS LAB");
                i1.putExtra("message8","");
                i1.putExtra("message7","PPS LAB");
                startActivity(i1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(SecF.this,LMonday.class);
                i1.putExtra("message","THURSDAY");
                i1.putExtra("message1","PPS");
                i1.putExtra("message2","MATHS");
                i1.putExtra("message3","MATHS");
                i1.putExtra("message4","CHEMISTRY");
                i1.putExtra("message5","WORKSHOP");
                i1.putExtra("message6","WORKSHOP");
                i1.putExtra("message8","WORKSHOP");
                i1.putExtra("message7","WORKSHOP");
                startActivity(i1);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(SecF.this,LMonday.class);


                i1.putExtra("message","FRIDAY");
                i1.putExtra("message1","PPS");
                i1.putExtra("message2","CHEM. LAB");
                i1.putExtra("message3","CHEM. LAB");
                i1.putExtra("message4","CHEM. LAB");
                i1.putExtra("message5","MATHS T1/CHEM. T2");
                i1.putExtra("message6","PE");
                i1.putExtra("message8","");
                i1.putExtra("message7","PPS.");
                startActivity(i1);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(SecF.this,LMonday.class);
                i1.putExtra("message","SATURDAY");
                i1.putExtra("message1","CHEMISTRY");
                i1.putExtra("message2","MATHS");
                i1.putExtra("message3","PE LAB");
                i1.putExtra("message4","PE LAB");
                i1.putExtra("message5","PPS");
                i1.putExtra("message6","PPS T1/MATHS T2");
                i1.putExtra("message7","WORKSHOP");
                i1.putExtra("message8","");
                startActivity(i1);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Calendar.MONDAY== dayOfWeek)
                {
                    Intent i1 = new Intent(SecF.this,LMonday.class);
                    i1.putExtra("message","MONDAY");
                    i1.putExtra("message1","PPS");
                    i1.putExtra("message2","MATHS");
                    i1.putExtra("message3","CHEM.T1/PPS T2");
                    i1.putExtra("message4","WORKSHOP");
                    i1.putExtra("message5","MATHS");
                    i1.putExtra("message6","CHEMISTRY");
                    i1.putExtra("message7","LIB.");
                    i1.putExtra("message8","");
                    startActivity(i1);
                }

                else if(Calendar.TUESDAY == dayOfWeek)
                {
                    Intent i1 = new Intent(SecF.this,LMonday.class);

                    i1.putExtra("message","TUESDAY");
                    i1.putExtra("message1","PE");
                    i1.putExtra("message2","CHEMISTRY");
                    i1.putExtra("message3","PPS");
                    i1.putExtra("message4","MATHS");
                    i1.putExtra("message5","PPS");
                    i1.putExtra("message6","SPORTS");
                    i1.putExtra("message7","SPORTS");
                    i1.putExtra("message8","");
                    startActivity(i1);
                }

                else if(Calendar.WEDNESDAY == dayOfWeek)
                {
                    Intent i1 = new Intent(SecF.this,LMonday.class);
                    i1.putExtra("message","WEDNESDAY");
                    i1.putExtra("message1","MATHS");
                    i1.putExtra("message2","CHEMISTRY");
                    i1.putExtra("message3","PPS");
                    i1.putExtra("message4","MATHS");
                    i1.putExtra("message5","CHEMISTRY");
                    i1.putExtra("message6","PPS LAB");
                    i1.putExtra("message7","PPS LAB");
                    i1.putExtra("message8","");
                    startActivity(i1);
                }

                else if(Calendar.THURSDAY == dayOfWeek)
                {
                    Intent i1 = new Intent(SecF.this,LMonday.class);

                    i1.putExtra("message","THURSDAY");
                    i1.putExtra("message1","PPS");
                    i1.putExtra("message2","MATHS");
                    i1.putExtra("message3","MATHS");
                    i1.putExtra("message4","CHEMISTRY");
                    i1.putExtra("message5","WORKSHOP");
                    i1.putExtra("message6","WORKSHOP");
                    i1.putExtra("message7","WORKSHOP");
                    i1.putExtra("message8","WORKSHOP");
                    startActivity(i1);
                }

                else if(Calendar.FRIDAY == dayOfWeek)
                {
                    Intent i1 = new Intent(SecF.this,LMonday.class);
                    i1.putExtra("message","FRIDAY");
                    i1.putExtra("message1","PPS");
                    i1.putExtra("message2","CHEM. LAB");
                    i1.putExtra("message3","CHEM. LAB");
                    i1.putExtra("message4","CHEM. LAB");
                    i1.putExtra("message5","MATHS T1/CHEM. T2");
                    i1.putExtra("message6","PE");
                    i1.putExtra("message7","PPS.");
                    i1.putExtra("message8","");
                    startActivity(i1);
                }

                else if(Calendar.SATURDAY == dayOfWeek)
                {
                    Intent i1 = new Intent(SecF.this,LMonday.class);
                    i1.putExtra("message","SATURDAY");
                    i1.putExtra("message1","CHEMISTRY");
                    i1.putExtra("message2","MATHS");
                    i1.putExtra("message3","PE LAB");
                    i1.putExtra("message4","PE LAB");
                    i1.putExtra("message5","PPS");
                    i1.putExtra("message6","PPS T1/MATHS T2");
                    i1.putExtra("message7","WORKSHOP");
                    i1.putExtra("message8","");
                }
                else if (Calendar.SUNDAY== dayOfWeek)
                {
                    
                }

            }

        });
    }


    public void goBack(View view) {
        finish();
    }

    public void doInfo(View view) {
        Intent i1 = new Intent(this,info.class);
        startActivity(i1);
    }
}
