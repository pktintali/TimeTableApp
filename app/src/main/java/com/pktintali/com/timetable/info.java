package com.pktintali.com.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class info extends AppCompatActivity {
    TextView bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        bt = findViewById(R.id.bshare);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "https://drive.google.com/file/d/1pOhKU_axc5xwU8H4icw7HQpjRphfTrSY/view?usp=drivesdk";
                String shareSub = "Your Subject";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent,"Share Using"));
            }
        });
    }

    public void goAbout(View view) {
        Intent i1 = new Intent(this,about.class);
        startActivity(i1);
    }

    public void doTutorial(View view) {
        Intent i2 = new Intent(this,howtouse.class);
        startActivity(i2);
    }


    public void doHelp(View view) {
        Intent i4 = new Intent(this,help.class);
        startActivity(i4);

    }

    public void doOther(View view) {
        Intent i6 = new Intent(this,otherapps.class);
        startActivity(i6);

    }
    public void doPrivacy(View view) {
        Intent i5 = new Intent(this,Privacy.class);
        startActivity(i5);

    }

    public void doBack(View view) {
        finish();
    }

    public void doContact(View view) {
        Intent i3 = new Intent(this,contact.class);
        startActivity(i3);
    }

    public void doannounce(View view) {
        Intent i3 = new Intent(this,announcements.class);
        startActivity(i3);

    }
}
